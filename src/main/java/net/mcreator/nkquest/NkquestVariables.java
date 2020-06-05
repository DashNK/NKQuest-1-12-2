package net.mcreator.nkquest;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.Minecraft;

import ibxm.Player;

public class NkquestVariables {
	public static String Player = "";
	public static double CoinsCount = 0;
	public static double CharacterID = 0;
	public static boolean DashHasStarBoots = false;
	public static boolean triggerRemoveSafetyBarrier = false;
	public static double DestDimensionID = 0;
	public static double CurrentDim = 0;
	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "nkquest_mapvars";
		public boolean FirstPlay = false;
		public double MindsetX = 0;
		public double MindsetY = 0;
		public double MinddsetZ = 0;
		public double MindbendX = 0;
		public double MindbendY = 0;
		public double MindbendZ = 0;
		public String PlayerName = "";
		public double WeatherMode = 0;
		public double TimeMode = 0;
		public double RaceInProgress = 0;
		public double IceStormActive = 0;
		public boolean isStorming = false;
		public boolean isRaining = false;
		public boolean SwitchingDimensions = false;
		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void readFromNBT(NBTTagCompound nbt) {
			FirstPlay = nbt.getBoolean("FirstPlay");
			MindsetX = nbt.getDouble("MindsetX");
			MindsetY = nbt.getDouble("MindsetY");
			MinddsetZ = nbt.getDouble("MinddsetZ");
			MindbendX = nbt.getDouble("MindbendX");
			MindbendY = nbt.getDouble("MindbendY");
			MindbendZ = nbt.getDouble("MindbendZ");
			PlayerName = nbt.getString("PlayerName");
			WeatherMode = nbt.getDouble("WeatherMode");
			TimeMode = nbt.getDouble("TimeMode");
			RaceInProgress = nbt.getDouble("RaceInProgress");
			IceStormActive = nbt.getDouble("IceStormActive");
			isStorming = nbt.getBoolean("isStorming");
			isRaining = nbt.getBoolean("isRaining");
			SwitchingDimensions = nbt.getBoolean("SwitchingDimensions");
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
			nbt.setBoolean("FirstPlay", FirstPlay);
			nbt.setDouble("MindsetX", MindsetX);
			nbt.setDouble("MindsetY", MindsetY);
			nbt.setDouble("MinddsetZ", MinddsetZ);
			nbt.setDouble("MindbendX", MindbendX);
			nbt.setDouble("MindbendY", MindbendY);
			nbt.setDouble("MindbendZ", MindbendZ);
			nbt.setString("PlayerName", PlayerName);
			nbt.setDouble("WeatherMode", WeatherMode);
			nbt.setDouble("TimeMode", TimeMode);
			nbt.setDouble("RaceInProgress", RaceInProgress);
			nbt.setDouble("IceStormActive", IceStormActive);
			nbt.setBoolean("isStorming", isStorming);
			nbt.setBoolean("isRaining", isRaining);
			nbt.setBoolean("SwitchingDimensions", SwitchingDimensions);
			return nbt;
		}

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				Nkquest.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(0, this));
			} else {
				Nkquest.PACKET_HANDLER.sendToAll(new WorldSavedDataSyncMessage(0, this));
			}
		}

		public static MapVariables get(World world) {
			MapVariables instance = (MapVariables) world.getMapStorage().getOrLoadData(MapVariables.class, DATA_NAME);
			if (instance == null) {
				instance = new MapVariables();
				world.getMapStorage().setData(DATA_NAME, instance);
			}
			return instance;
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "nkquest_worldvars";
		public double DashShellContainerX = 0;
		public double DashShellContainerY = 0;
		public double DashShellContainerZ = 0;
		public boolean KeepInventory = false;
		public boolean SetupComplete = false;
		public boolean MobGriefing = true;
		public boolean FireSpreading = true;
		public boolean Weather = false;
		public boolean OwnerSet = false;
		public boolean SetupSkipped = false;
		public String WeatherType = "Default";
		public String TimeModes = "Default";
		public boolean StarterItems = false;
		public boolean StarterGuides = true;
		public boolean CheatsOn = false;
		public boolean GuidesAtStart = false;
		public double globalWeatherMode = 0;
		public boolean globalWeatherTrigger = false;
		public boolean globalWeatherTriggerPrevention = false;
		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void readFromNBT(NBTTagCompound nbt) {
			DashShellContainerX = nbt.getDouble("DashShellContainerX");
			DashShellContainerY = nbt.getDouble("DashShellContainerY");
			DashShellContainerZ = nbt.getDouble("DashShellContainerZ");
			KeepInventory = nbt.getBoolean("KeepInventory");
			SetupComplete = nbt.getBoolean("SetupComplete");
			MobGriefing = nbt.getBoolean("MobGriefing");
			FireSpreading = nbt.getBoolean("FireSpreading");
			Weather = nbt.getBoolean("Weather");
			OwnerSet = nbt.getBoolean("OwnerSet");
			SetupSkipped = nbt.getBoolean("SetupSkipped");
			WeatherType = nbt.getString("WeatherType");
			TimeModes = nbt.getString("TimeModes");
			StarterItems = nbt.getBoolean("StarterItems");
			StarterGuides = nbt.getBoolean("StarterGuides");
			CheatsOn = nbt.getBoolean("CheatsOn");
			GuidesAtStart = nbt.getBoolean("GuidesAtStart");
			globalWeatherMode = nbt.getDouble("globalWeatherMode");
			globalWeatherTrigger = nbt.getBoolean("globalWeatherTrigger");
			globalWeatherTriggerPrevention = nbt.getBoolean("globalWeatherTriggerPrevention");
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
			nbt.setDouble("DashShellContainerX", DashShellContainerX);
			nbt.setDouble("DashShellContainerY", DashShellContainerY);
			nbt.setDouble("DashShellContainerZ", DashShellContainerZ);
			nbt.setBoolean("KeepInventory", KeepInventory);
			nbt.setBoolean("SetupComplete", SetupComplete);
			nbt.setBoolean("MobGriefing", MobGriefing);
			nbt.setBoolean("FireSpreading", FireSpreading);
			nbt.setBoolean("Weather", Weather);
			nbt.setBoolean("OwnerSet", OwnerSet);
			nbt.setBoolean("SetupSkipped", SetupSkipped);
			nbt.setString("WeatherType", WeatherType);
			nbt.setString("TimeModes", TimeModes);
			nbt.setBoolean("StarterItems", StarterItems);
			nbt.setBoolean("StarterGuides", StarterGuides);
			nbt.setBoolean("CheatsOn", CheatsOn);
			nbt.setBoolean("GuidesAtStart", GuidesAtStart);
			nbt.setDouble("globalWeatherMode", globalWeatherMode);
			nbt.setBoolean("globalWeatherTrigger", globalWeatherTrigger);
			nbt.setBoolean("globalWeatherTriggerPrevention", globalWeatherTriggerPrevention);
			return nbt;
		}

		public void syncData(World world) {
			this.markDirty();
			if (world.isRemote) {
				Nkquest.PACKET_HANDLER.sendToServer(new WorldSavedDataSyncMessage(1, this));
			} else {
				Nkquest.PACKET_HANDLER.sendToDimension(new WorldSavedDataSyncMessage(1, this), world.provider.getDimension());
			}
		}

		public static WorldVariables get(World world) {
			WorldVariables instance = (WorldVariables) world.getPerWorldStorage().getOrLoadData(WorldVariables.class, DATA_NAME);
			if (instance == null) {
				instance = new WorldVariables();
				world.getPerWorldStorage().setData(DATA_NAME, instance);
			}
			return instance;
		}
	}

	public static class WorldSavedDataSyncMessageHandler implements IMessageHandler<WorldSavedDataSyncMessage, IMessage> {
		@Override
		public IMessage onMessage(WorldSavedDataSyncMessage message, MessageContext context) {
			if (context.side == Side.SERVER)
				context.getServerHandler().player.getServerWorld()
						.addScheduledTask(() -> syncData(message, context, context.getServerHandler().player.world));
			else
				Minecraft.getMinecraft().addScheduledTask(() -> syncData(message, context, Minecraft.getMinecraft().player.world));
			return null;
		}

		private void syncData(WorldSavedDataSyncMessage message, MessageContext context, World world) {
			if (context.side == Side.SERVER) {
				message.data.markDirty();
				if (message.type == 0)
					Nkquest.PACKET_HANDLER.sendToAll(message);
				else
					Nkquest.PACKET_HANDLER.sendToDimension(message, world.provider.getDimension());
			}
			if (message.type == 0) {
				world.getMapStorage().setData(MapVariables.DATA_NAME, message.data);
			} else {
				world.getPerWorldStorage().setData(WorldVariables.DATA_NAME, message.data);
			}
		}
	}

	public static class WorldSavedDataSyncMessage implements IMessage {
		public int type;
		public WorldSavedData data;
		public WorldSavedDataSyncMessage() {
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(this.type);
			ByteBufUtils.writeTag(buf, this.data.writeToNBT(new NBTTagCompound()));
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			this.type = buf.readInt();
			if (this.type == 0)
				this.data = new MapVariables();
			else
				this.data = new WorldVariables();
			this.data.readFromNBT(ByteBufUtils.readTag(buf));
		}
	}
}
