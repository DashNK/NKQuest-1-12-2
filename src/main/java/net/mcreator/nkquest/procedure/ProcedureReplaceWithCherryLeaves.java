package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockCherrybloomLeaves;
import net.mcreator.nkquest.block.BlockCherryLeavesPicked;
import net.mcreator.nkquest.block.BlockCherryLeaves;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureReplaceWithCherryLeaves extends ElementsNkquest.ModElement {
	public ProcedureReplaceWithCherryLeaves(ElementsNkquest instance) {
		super(instance, 98);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ReplaceWithCherryLeaves!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ReplaceWithCherryLeaves!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ReplaceWithCherryLeaves!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ReplaceWithCherryLeaves!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCherrybloomLeaves.block.getDefaultState(), 3);
		if ((Math.random() < 0.25)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCherryLeavesPicked.block.getDefaultState(), 3);
		}
		if ((Math.random() < 0.1)) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCherryLeaves.block.getDefaultState(), 3);
		}
	}
}
