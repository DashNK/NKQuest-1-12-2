package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePitGenBlockAdded extends ElementsNkquest.ModElement {
	public ProcedurePitGenBlockAdded(ElementsNkquest instance) {
		super(instance, 616);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PitGenBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PitGenBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PitGenBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PitGenBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double height = 0;
		double currentheight = 0;
		double spawnheight = 0;
		double width = 0;
		double wallheight = 0;
		currentheight = (double) y;
		if ((y > 63)) {
			currentheight = (double) y;
			for (int index0 = 0; index0 < (int) (64); index0++) {
				currentheight = (double) ((currentheight) - 1);
				if (((currentheight) > 35)) {
					world.setBlockToAir(new BlockPos((int) x, (int) (currentheight), (int) z));
				}
				if (((currentheight) == 35)) {
					break;
				}
			}
		}
		for (int index1 = 0; index1 < (int) (16); index1++) {
			width = (double) ((width) + 1);
			if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + (width)), (int) (currentheight), (int) z)))
					.equals(new ResourceLocation("nkquest:pit"))) == (true))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + (width)), (int) (currentheight), (int) z)))
							.equals(new ResourceLocation("river"))) == (true)))) {
				world.setBlockToAir(new BlockPos((int) (x + (width)), (int) (currentheight), (int) z));
			}
			if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (width)), (int) (currentheight), (int) z)))
					.equals(new ResourceLocation("nkquest:pit"))) == (true))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (width)), (int) (currentheight), (int) z)))
							.equals(new ResourceLocation("river"))) == (true)))) {
				world.setBlockToAir(new BlockPos((int) (x - (width)), (int) (currentheight), (int) z));
			}
			if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) (currentheight), (int) (z + (width)))))
					.equals(new ResourceLocation("nkquest:pit"))) == (true))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) (currentheight), (int) (z + (width)))))
							.equals(new ResourceLocation("river"))) == (true)))) {
				world.setBlockToAir(new BlockPos((int) x, (int) (currentheight), (int) (z + (width))));
			}
			if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) (currentheight), (int) (z - (width)))))
					.equals(new ResourceLocation("nkquest:pit"))) == (true))
					|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) (currentheight), (int) (z - (width)))))
							.equals(new ResourceLocation("river"))) == (true)))) {
				world.setBlockToAir(new BlockPos((int) x, (int) (currentheight), (int) (z - (width))));
			}
		}
		if (((y < 64) && (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:abyssalocean"))) == (true))
				|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("ocean"))) == (true))
						|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("deep_ocean"))) == (true)))))) {
			for (int index2 = 0; index2 < (int) (64); index2++) {
				currentheight = (double) ((currentheight) - 1);
				world.setBlockState(new BlockPos((int) x, (int) (currentheight), (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				if (((currentheight) == 47)) {
					break;
				}
			}
		}
	}
}
