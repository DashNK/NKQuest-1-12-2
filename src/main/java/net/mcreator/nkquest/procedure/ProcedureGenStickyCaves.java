package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockOoze;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenStickyCaves extends ElementsNkquest.ModElement {
	public ProcedureGenStickyCaves(ElementsNkquest instance) {
		super(instance, 245);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenStickyCaves!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenStickyCaves!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenStickyCaves!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenStickyCaves!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 1)) {
				if ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:stickycaves")))) {
					if ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockOoze.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockOoze.block.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockOoze.block.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					}
				}
				if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()))
						|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
										.getBlock())))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.SLIME_BLOCK.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.SLIME_BLOCK.getDefaultState(), 3);
				}
				timer = (double) 0;
			}
		}
	}
}
