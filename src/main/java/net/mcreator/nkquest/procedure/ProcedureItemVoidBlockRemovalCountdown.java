package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureItemVoidBlockRemovalCountdown extends ElementsNkquest.ModElement {
	public ProcedureItemVoidBlockRemovalCountdown(ElementsNkquest instance) {
		super(instance, 703);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemVoidBlockRemovalCountdown!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemVoidBlockRemovalCountdown!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemVoidBlockRemovalCountdown!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemVoidBlockRemovalCountdown!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			timer = (double) ((timer) + 1);
			if (((timer) > 4)) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			}
		}
	}
}
