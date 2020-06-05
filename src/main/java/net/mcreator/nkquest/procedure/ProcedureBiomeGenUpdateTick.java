package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureBiomeGenUpdateTick extends ElementsNkquest.ModElement {
	public ProcedureBiomeGenUpdateTick(ElementsNkquest instance) {
		super(instance, 640);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BiomeGenUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BiomeGenUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BiomeGenUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) 1, (int) z),
				world.getBlockState(new BlockPos((int) x, (int) 1, (int) z)).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) 1, (int) z),
				world.getBlockState(new BlockPos((int) (x + 1), (int) 1, (int) z)).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) (x - 1), (int) 1, (int) z),
				world.getBlockState(new BlockPos((int) (x - 1), (int) 1, (int) z)).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) 1, (int) (z + 1)),
				world.getBlockState(new BlockPos((int) x, (int) 1, (int) (z + 1))).getBlock(), true);
		world.notifyNeighborsOfStateChange(new BlockPos((int) x, (int) 1, (int) (z - 1)),
				world.getBlockState(new BlockPos((int) x, (int) 1, (int) (z - 1))).getBlock(), true);
	}
}
