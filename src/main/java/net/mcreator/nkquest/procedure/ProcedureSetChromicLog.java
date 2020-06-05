package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetChromicLog extends ElementsNkquest.ModElement {
	public ProcedureSetChromicLog(ElementsNkquest instance) {
		super(instance, 571);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SetChromicLog!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SetChromicLog!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SetChromicLog!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SetChromicLog!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double Height = 0;
		double timer = 0;
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LOG.getDefaultState(), 3);
		for (int index0 = 0; index0 < (int) (12); index0++) {
			world.setBlockState(new BlockPos((int) x, (int) (y + (Height)), (int) z), (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))),
					3);
			Height = (double) ((Height) + 1);
		}
	}
}
