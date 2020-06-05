package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.entity.EntityShaftGenerator;
import net.mcreator.nkquest.block.BlockOverworldShaft;
import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSpawnShaft extends ElementsNkquest.ModElement {
	public ProcedureSpawnShaft(ElementsNkquest instance) {
		super(instance, 574);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SpawnShaft!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SpawnShaft!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpawnShaft!");
			return;
		}
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double chance = 0;
		if ((Math.random() <= 0.05)) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityShaftGenerator.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, 1, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
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
						return new BlockPos((int) x, (int) 0, (int) z);
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(x, 0, z);
					}
				}, "setblock dimstack:portal");
			}
			world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockOverworldShaft.block.getDefaultState(), 3);
		}
		if ((Math.random() > 0.05)) {
			world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockCrustrock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) 2, (int) z), BlockCrustrock.block.getDefaultState(), 3);
		}
	}
}
