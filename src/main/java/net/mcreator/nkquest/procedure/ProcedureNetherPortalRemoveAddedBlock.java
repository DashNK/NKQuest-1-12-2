package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureNetherPortalRemoveAddedBlock extends ElementsNkquest.ModElement {
	public ProcedureNetherPortalRemoveAddedBlock(ElementsNkquest instance) {
		super(instance, 55);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure NetherPortalRemoveAddedBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure NetherPortalRemoveAddedBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure NetherPortalRemoveAddedBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure NetherPortalRemoveAddedBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (10); index0++) {
				timer = (double) ((timer) + 1);
			}
		}
		if (((timer) == 10)) {
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			timer = (double) 0;
		}
	}
}
