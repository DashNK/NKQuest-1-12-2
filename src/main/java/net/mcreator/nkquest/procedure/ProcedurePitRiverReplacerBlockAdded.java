package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePitRiverReplacerBlockAdded extends ElementsNkquest.ModElement {
	public ProcedurePitRiverReplacerBlockAdded(ElementsNkquest instance) {
		super(instance, 632);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PitRiverReplacerBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PitRiverReplacerBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PitRiverReplacerBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PitRiverReplacerBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double height = 0;
		if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("river"))) == (true))) {
			height = (double) y;
			for (int index0 = 0; index0 < (int) (64); index0++) {
				height = (double) ((height) - 1);
				if (((height) > 35)) {
					world.setBlockToAir(new BlockPos((int) x, (int) (height), (int) z));
				}
				if ((((height) < 36) && ((height) > 32))) {
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.WATER.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.WATER.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.WATER.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
				if (((height) < 33)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					break;
				}
			}
		}
		if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("river"))) == (false))
				&& (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:pit"))) == (false))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:climatecove"))) == (false))))) {
			world.setBlockState(new BlockPos((int) x, (int) 63, (int) z), Blocks.WATER.getDefaultState(), 3);
		}
	}
}
