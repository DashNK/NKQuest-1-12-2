package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockLightElementiaOre;
import net.mcreator.nkquest.block.BlockDarkElementiaOre;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureRemoveElementiaConditions extends ElementsNkquest.ModElement {
	public ProcedureRemoveElementiaConditions(ElementsNkquest instance) {
		super(instance, 249);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RemoveElementiaConditions!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RemoveElementiaConditions!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RemoveElementiaConditions!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RemoveElementiaConditions!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLightElementiaOre.block.getDefaultState().getBlock())
				&& (!(world.canSeeSky(new BlockPos((int) x, (int) y, (int) z)))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockDarkElementiaOre.block.getDefaultState().getBlock())
				&& (world.canSeeSky(new BlockPos((int) x, (int) y, (int) z))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
		}
	}
}
