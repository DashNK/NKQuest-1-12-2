package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockTectonicCrust;
import net.mcreator.nkquest.block.BlockQuartzOre;
import net.mcreator.nkquest.block.BlockGlowstoneOre;
import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureOreSpawnerProcedure extends ElementsNkquest.ModElement {
	public ProcedureOreSpawnerProcedure(ElementsNkquest instance) {
		super(instance, 674);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OreSpawnerProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OreSpawnerProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OreSpawnerProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OreSpawnerProcedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double stonetype = 0;
		double ore = 0;
		if ((y > 0)) {
			stonetype = (double) 0;
		}
		if (((y < 0) && (y > -96))) {
			stonetype = (double) 1;
		}
		if (((y < -95) && (y > -128))) {
			stonetype = (double) 2;
		}
		ore = (double) (Math.random() * 30);
		if (((stonetype) == 0)) {
			if (((ore) == 0)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
			}
			if (((ore) == 1)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockGlowstoneOre.block.getDefaultState(), 3);
			}
			if (((ore) == 2)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockQuartzOre.block.getDefaultState(), 3);
			}
			if (((ore) == 3)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.IRON_ORE.getDefaultState(), 3);
			}
		}
		if (((stonetype) == 1)) {
			if (((ore) == 0)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCrustrock.block.getDefaultState(), 3);
			}
		}
		if (((stonetype) == 2)) {
			if (((ore) == 0)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTectonicCrust.block.getDefaultState(), 3);
			}
		}
	}
}
