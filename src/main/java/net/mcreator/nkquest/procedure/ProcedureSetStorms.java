package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetStorms extends ElementsNkquest.ModElement {
	public ProcedureSetStorms(ElementsNkquest instance) {
		super(instance, 522);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetStorms!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SetStorms!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((NkquestVariables.WorldVariables.get(world).globalWeatherTrigger) == (true))) {
			if (((entity.dimension) == 0)) {
				if (((NkquestVariables.MapVariables.get(world).isRaining) == (true))) {
					if (((NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention) == (false))) {
						for (int index0 = 0; index0 < (int) (4); index0++) {
							if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
								entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
									@Override
									public String getName() {
										return "";
									}

									@Override
									public boolean canUseCommand(int permission, String command) {
										return true;
									}

									@Override
									public World getEntityWorld() {
										return entity.world;
									}

									@Override
									public MinecraftServer getServer() {
										return entity.world.getMinecraftServer();
									}

									@Override
									public boolean sendCommandFeedback() {
										return false;
									}

									@Override
									public BlockPos getPosition() {
										return entity.getPosition();
									}

									@Override
									public Vec3d getPositionVector() {
										return new Vec3d(entity.posX, entity.posY, entity.posZ);
									}

									@Override
									public Entity getCommandSenderEntity() {
										return entity;
									}
								}, "weather2 storm create rain");
							}
						}
						NkquestVariables.WorldVariables.get(world).globalWeatherTrigger = (boolean) (false);
						NkquestVariables.WorldVariables.get(world).syncData(world);
						NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention = (boolean) (true);
						NkquestVariables.WorldVariables.get(world).syncData(world);
					}
				}
				if (((NkquestVariables.MapVariables.get(world).isStorming) == (true))) {
					if (((NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention) == (false))) {
						for (int index1 = 0; index1 < (int) (2); index1++) {
							if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
								entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
									@Override
									public String getName() {
										return "";
									}

									@Override
									public boolean canUseCommand(int permission, String command) {
										return true;
									}

									@Override
									public World getEntityWorld() {
										return entity.world;
									}

									@Override
									public MinecraftServer getServer() {
										return entity.world.getMinecraftServer();
									}

									@Override
									public boolean sendCommandFeedback() {
										return false;
									}

									@Override
									public BlockPos getPosition() {
										return entity.getPosition();
									}

									@Override
									public Vec3d getPositionVector() {
										return new Vec3d(entity.posX, entity.posY, entity.posZ);
									}

									@Override
									public Entity getCommandSenderEntity() {
										return entity;
									}
								}, "weather2 storm create rain");
							}
							if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
								entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
									@Override
									public String getName() {
										return "";
									}

									@Override
									public boolean canUseCommand(int permission, String command) {
										return true;
									}

									@Override
									public World getEntityWorld() {
										return entity.world;
									}

									@Override
									public MinecraftServer getServer() {
										return entity.world.getMinecraftServer();
									}

									@Override
									public boolean sendCommandFeedback() {
										return false;
									}

									@Override
									public BlockPos getPosition() {
										return entity.getPosition();
									}

									@Override
									public Vec3d getPositionVector() {
										return new Vec3d(entity.posX, entity.posY, entity.posZ);
									}

									@Override
									public Entity getCommandSenderEntity() {
										return entity;
									}
								}, "weather2 storm create rain");
							}
							if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
								entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
									@Override
									public String getName() {
										return "";
									}

									@Override
									public boolean canUseCommand(int permission, String command) {
										return true;
									}

									@Override
									public World getEntityWorld() {
										return entity.world;
									}

									@Override
									public MinecraftServer getServer() {
										return entity.world.getMinecraftServer();
									}

									@Override
									public boolean sendCommandFeedback() {
										return false;
									}

									@Override
									public BlockPos getPosition() {
										return entity.getPosition();
									}

									@Override
									public Vec3d getPositionVector() {
										return new Vec3d(entity.posX, entity.posY, entity.posZ);
									}

									@Override
									public Entity getCommandSenderEntity() {
										return entity;
									}
								}, "weather2 storm create lightning");
							}
						}
						NkquestVariables.WorldVariables.get(world).globalWeatherTrigger = (boolean) (false);
						NkquestVariables.WorldVariables.get(world).syncData(world);
						NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention = (boolean) (true);
						NkquestVariables.WorldVariables.get(world).syncData(world);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
