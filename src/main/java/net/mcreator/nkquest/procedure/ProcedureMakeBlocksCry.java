package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockTearStone;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureMakeBlocksCry extends ElementsNkquest.ModElement {
	public ProcedureMakeBlocksCry(ElementsNkquest instance) {
		super(instance, 678);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MakeBlocksCry!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MakeBlocksCry!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MakeBlocksCry!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MakeBlocksCry!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double chancetocry = 0;
		if (((world.canSeeSky(new BlockPos((int) (x + 1), (int) y, (int) z))) == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WATER.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTearStone.block.getDefaultState(), 3);
		}
		if (((world.canSeeSky(new BlockPos((int) (x - 1), (int) y, (int) z))) == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WATER.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTearStone.block.getDefaultState(), 3);
		}
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) (z + 1)))) == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WATER.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTearStone.block.getDefaultState(), 3);
		}
		if (((world.canSeeSky(new BlockPos((int) x, (int) y, (int) (z - 1)))) == (true))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WATER.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockTearStone.block.getDefaultState(), 3);
		}
	}
}
