package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockFlashblockOn;
import net.mcreator.nkquest.block.BlockFlashBlock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFlashlightTimer extends ElementsNkquest.ModElement {
	public ProcedureFlashlightTimer(ElementsNkquest instance) {
		super(instance, 328);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FlashlightTimer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FlashlightTimer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FlashlightTimer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FlashlightTimer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockFlashBlock.block.getDefaultState().getBlock())) {
			for (int index0 = 0; index0 < (int) (100); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 100)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockFlashblockOn.block.getDefaultState(), 3);
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockFlashblockOn.block.getDefaultState().getBlock())) {
			for (int index1 = 0; index1 < (int) (100); index1++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 100)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockFlashBlock.block.getDefaultState(), 3);
			}
		}
	}
}
