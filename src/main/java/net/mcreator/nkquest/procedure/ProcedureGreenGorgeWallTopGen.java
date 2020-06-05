package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockGrassyDriedDirt;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGreenGorgeWallTopGen extends ElementsNkquest.ModElement {
	public ProcedureGreenGorgeWallTopGen(ElementsNkquest instance) {
		super(instance, 667);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GreenGorgeWallTopGen!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GreenGorgeWallTopGen!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GreenGorgeWallTopGen!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GreenGorgeWallTopGen!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double width = 0;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			width = (double) ((width) + 1);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + (width)), (int) y, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + (width)), (int) y, (int) (z + (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - (width)), (int) y, (int) (z + (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - (width)), (int) y, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - (width)), (int) y, (int) (z - (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + (width)), (int) y, (int) (z - (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
		}
	}
}
