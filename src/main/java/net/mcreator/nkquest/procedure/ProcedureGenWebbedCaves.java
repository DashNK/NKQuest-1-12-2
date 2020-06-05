package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenWebbedCaves extends ElementsNkquest.ModElement {
	public ProcedureGenWebbedCaves(ElementsNkquest instance) {
		super(instance, 247);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenWebbedCaves!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenWebbedCaves!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenWebbedCaves!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenWebbedCaves!");
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
						.equals(new ResourceLocation("nkquest:webbedcaves")))) {
					if ((!((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock()))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WEB.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.WEB.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WEB.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WEB.getDefaultState(), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
							&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
									.getBlock())))) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					}
				}
				if (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()))
						|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
										.getBlock())))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.COBBLESTONE.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.COBBLESTONE.getDefaultState(), 3);
				}
				timer = (double) 0;
			}
		}
	}
}
