package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureCoveGenBlockAdded extends ElementsNkquest.ModElement {
	public ProcedureCoveGenBlockAdded(ElementsNkquest instance) {
		super(instance, 628);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CoveGenBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CoveGenBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CoveGenBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CoveGenBlockAdded!");
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
		if ((y > 63)) {
			currentheight = (double) y;
			for (int index0 = 0; index0 < (int) (64); index0++) {
				if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:climatecove"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
								.equals(new ResourceLocation("river"))) == (false)))) {
					currentheight = (double) ((currentheight) - 1);
					if (((currentheight) > 47)) {
						world.setBlockToAir(new BlockPos((int) x, (int) (currentheight), (int) z));
					}
					if (((currentheight) == 47)) {
						world.setBlockState(new BlockPos((int) x, (int) 47, (int) z), Blocks.GRASS.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 46, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) 45, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) 44, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) 43, (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
						break;
					}
				}
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("river"))) == (true))) {
					currentheight = (double) ((currentheight) - 1);
					if (((currentheight) > 47)) {
						if (((((world.getBlockState(new BlockPos((int) x, (int) (currentheight), (int) z))).getBlock() == Blocks.FLOWING_WATER
								.getDefaultState().getBlock()) == (false))
								&& (((world.getBlockState(new BlockPos((int) x, (int) (currentheight), (int) z))).getBlock() == Blocks.WATER
										.getDefaultState().getBlock()) == (false)))) {
							world.setBlockToAir(new BlockPos((int) x, (int) (currentheight), (int) z));
						}
					}
					if ((((currentheight) < 48) && ((currentheight) > 46))) {
						world.setBlockState(new BlockPos((int) x, (int) (currentheight), (int) z), Blocks.WATER.getDefaultState(), 3);
					}
					if (((currentheight) == 46)) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
						break;
					}
				}
			}
		}
		if (((y < 64) && ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:climatecove"))) == (true)))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 3), (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 4), (int) z), Blocks.DIRT.getStateFromMeta(0), 3);
		}
	}
}
