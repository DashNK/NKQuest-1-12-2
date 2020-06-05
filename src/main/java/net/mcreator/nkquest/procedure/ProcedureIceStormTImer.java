package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureIceStormTImer extends ElementsNkquest.ModElement {
	public ProcedureIceStormTImer(ElementsNkquest instance) {
		super(instance, 496);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IceStormTImer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double timer = 0;
		if (((entity.getEntityData().getDouble("iceStormTimer")) > 0)) {
			entity.getEntityData().setBoolean("iceStorm", (true));
			for (int index0 = 0; index0 < (int) ((250 * (entity.getEntityData().getDouble("iceStormPower")))); index0++) {
				entity.getEntityData().setDouble("iceStormTimer", ((entity.getEntityData().getDouble("iceStormTimer")) - 1));
				if (((((((entity.getEntityData().getDouble("iceStormTimer")) == 0) || ((entity.getEntityData().getDouble("iceStormTimer")) == 100))
						|| ((entity.getEntityData().getDouble("iceStormTimer")) == 200))
						|| (((entity.getEntityData().getDouble("iceStormTimer")) == 300)
								|| ((entity.getEntityData().getDouble("iceStormTimer")) == 400)))
						|| ((((entity.getEntityData().getDouble("iceStormTimer")) == 500)
								|| ((entity.getEntityData().getDouble("iceStormTimer")) == 600))
								|| (((entity.getEntityData().getDouble("iceStormTimer")) == 700)
										|| (((entity.getEntityData().getDouble("iceStormTimer")) == 800)
												|| ((entity.getEntityData().getDouble("iceStormTimer")) == 900)))))) {
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
						}, "effect @e[distance=..15] minecraft:slowness 4 100");
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
						}, "effect @p[distance=..1] minecraft:slowness 0 0");
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
						}, "effect @e[r=30] minecraft:slowness 4 100");
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
						}, "effect @p[r=1] minecraft:slowness 0 0");
					}
				}
			}
		}
	}
}
