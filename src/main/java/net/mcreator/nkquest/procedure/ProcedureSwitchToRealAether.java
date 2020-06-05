package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSwitchToRealAether extends ElementsNkquest.ModElement {
	public ProcedureSwitchToRealAether(ElementsNkquest instance) {
		super(instance, 201);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SwitchToRealAether!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SwitchToRealAether!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SwitchToRealAether!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SwitchToRealAether!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.setPositionAndUpdate(x, 100, z);
		if (((entity.posY) > 96)) {
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), (entity.posY), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) (entity.posY), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), (entity.posY), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) (entity.posY), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), (entity.posY), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), (entity.posY), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), (entity.posY), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) (entity.posY), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), (entity.posY), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) (entity.posY), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), (entity.posY), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) (entity.posY), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), (entity.posY), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) (entity.posY), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), (entity.posY), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) + 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) + 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) + 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) + 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) + 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) + 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) + 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) + 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) + 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) + 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) + 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) + 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) + 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) + 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) + 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) + 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) + 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) + 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) - 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) - 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) - 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) - 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) - 1), (int) (entity.posZ));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) - 1), (entity.posZ));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) - 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) - 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) (entity.posX), (int) ((entity.posY) - 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d((entity.posX), ((entity.posY) - 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) - 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) - 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) + 1), (int) ((entity.posY) - 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) + 1), ((entity.posY) - 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) - 1), (int) ((entity.posZ) + 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) - 1), ((entity.posZ) + 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
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
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) - 1), (int) ((entity.posZ) - 1));
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(((entity.posX) - 1), ((entity.posY) - 1), ((entity.posZ) - 1));
					}
				}, "/setblock ~ ~ ~ aether_legacy:aether_portal");
			}
		}
	}
}
