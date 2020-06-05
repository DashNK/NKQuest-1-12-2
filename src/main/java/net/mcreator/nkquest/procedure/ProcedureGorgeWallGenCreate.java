package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockDriedDirt;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGorgeWallGenCreate extends ElementsNkquest.ModElement {
	public ProcedureGorgeWallGenCreate(ElementsNkquest instance) {
		super(instance, 118);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GorgeWallGenCreate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GorgeWallGenCreate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GorgeWallGenCreate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GorgeWallGenCreate!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean wallfinished = false;
		boolean xpluswallfinished = false;
		boolean xminuswallfinished = false;
		boolean zpluswallfinished = false;
		boolean zminuswallfinished = false;
		double wallcount = 0;
		double timer = 0;
		double walltimer = 0;
		double walllsize = 0;
		double toplayer = 0;
		double groundtopiscovered = 0;
		double xpluswall = 0;
		double xminuswall = 0;
		double zpluswall = 0;
		double zminuswall = 0;
		double aircount = 0;
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockDriedDirt.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), BlockDriedDirt.block.getDefaultState(), 3);
	}
}
