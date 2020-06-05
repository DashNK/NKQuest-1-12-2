package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.entity.EntityPuni;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSpringUP extends ElementsNkquest.ModElement {
	public ProcedureSpringUP(ElementsNkquest instance) {
		super(instance, 15);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpringUP!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpringUP!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		boolean triggered = false;
		double YSpeed = 0;
		triggered = (boolean) (true);
		YSpeed = (double) 2;
		for (int index0 = 0; index0 < (int) (20); index0++) {
			if ((((triggered) == (true)) && (entity instanceof EntityPuni.EntityCustom))) {
				if (((triggered) == (true))) {
					YSpeed = (double) ((YSpeed) - 0.1);
				} else if ((((triggered) == (true)) && ((YSpeed) < 0))) {
					YSpeed = (double) 0;
					triggered = (boolean) (false);
				}
			}
			if ((((YSpeed) > 1.5) && ((YSpeed) < 2))) {
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
					}, "/tp @p ~ ~1 ~");
				}
			}
			if ((((YSpeed) > 1) && ((YSpeed) < 1.5))) {
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
					}, "/tp @p ~ ~0.75 ~");
				}
			}
			if ((((YSpeed) > 0.5) && ((YSpeed) < 1))) {
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
					}, "/tp @p ~ ~0.5 ~");
				}
			}
			if ((((YSpeed) > 0) && ((YSpeed) < 0.5))) {
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
					}, "/tp @p ~ ~0.25 ~");
				}
			}
		}
	}
}
