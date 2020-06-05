package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenRiverInPit extends ElementsNkquest.ModElement {
	public ProcedureGenRiverInPit(ElementsNkquest instance) {
		super(instance, 647);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenRiverInPit!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenRiverInPit!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenRiverInPit!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenRiverInPit!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean GenComplete = false;
		double Height = 0;
		double width = 0;
		double widthoffset = 0;
		double OFFSET = 0;
		double riverbarrierheight = 0;
		double pitradius = 0;
		double riverradius = 0;
		for (int index0 = 0; index0 < (int) (24); index0++) {
			pitradius = (double) ((pitradius) + 1);
		}
		for (int index1 = 0; index1 < (int) (8); index1++) {
			riverradius = (double) ((riverradius) + 1);
		}
		if (((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + (pitradius)), (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:pit"))) == (true))
				|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (pitradius)), (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:pit"))) == (true)))
				|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + (pitradius)))))
						.equals(new ResourceLocation("nkquest:pit"))) == (true))
						|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - (pitradius)))))
								.equals(new ResourceLocation("nkquest:pit"))) == (true))))) {
			if (((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("river"))) == (true))
					|| ((((world.getBlockState(new BlockPos((int) x, (int) 62, (int) z))).getBlock() == Blocks.FLOWING_WATER.getDefaultState()
							.getBlock()) == (true))
							|| (((world.getBlockState(new BlockPos((int) x, (int) 62, (int) z))).getBlock() == Blocks.WATER.getDefaultState()
									.getBlock()) == (true))))
					|| (((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + (riverradius)), (int) y, (int) z)))
							.equals(new ResourceLocation("river"))) == (true))
							|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + (riverradius)))))
									.equals(new ResourceLocation("river"))) == (true)))
							|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (riverradius)), (int) y, (int) z)))
									.equals(new ResourceLocation("river"))) == (true))
									|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - (riverradius)))))
											.equals(new ResourceLocation("river"))) == (true))))
							|| ((((((world.getBlockState(new BlockPos((int) (x + (riverradius)), (int) 62, (int) z)))
									.getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) == (true))
									|| (((world.getBlockState(new BlockPos((int) (x + (riverradius)), (int) 62, (int) z))).getBlock() == Blocks.WATER
											.getDefaultState().getBlock()) == (true)))
									|| ((((world.getBlockState(new BlockPos((int) (x - (riverradius)), (int) 62, (int) z)))
											.getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) == (true))
											|| (((world.getBlockState(new BlockPos((int) (x - (riverradius)), (int) 62, (int) z)))
													.getBlock() == Blocks.WATER.getDefaultState().getBlock()) == (true))))
									|| (((((world.getBlockState(new BlockPos((int) x, (int) 62, (int) (z + (riverradius)))))
											.getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) == (true))
											|| (((world.getBlockState(new BlockPos((int) x, (int) 62, (int) (z + (riverradius)))))
													.getBlock() == Blocks.WATER.getDefaultState().getBlock()) == (true)))
											|| ((((world.getBlockState(new BlockPos((int) x, (int) 62, (int) (z - (riverradius)))))
													.getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) == (true))
													|| (((world.getBlockState(new BlockPos((int) x, (int) 62, (int) (z - (riverradius)))))
															.getBlock() == Blocks.WATER.getDefaultState().getBlock()) == (true)))))))) {
				Height = (double) 30;
				for (int index2 = 0; index2 < (int) (86); index2++) {
					if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("nkquest:pit"))) == (false))
							&& ((world.isAirBlock(new BlockPos((int) x, (int) 30, (int) z))) == (false)))) {
						world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockToAir(new BlockPos((int) x, (int) 36, (int) z));
					}
					if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("nkquest:pit"))) == (false))
							&& ((world.isAirBlock(new BlockPos((int) x, (int) 30, (int) z))) == (true)))) {
						world.setBlockState(new BlockPos((int) x, (int) 30, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.FLOWING_WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockToAir(new BlockPos((int) x, (int) 36, (int) z));
						riverbarrierheight = (double) 30;
						for (int index3 = 0; index3 < (int) (5); index3++) {
							riverbarrierheight = (double) ((riverbarrierheight) + 1);
						}
					}
					Height = (double) ((Height) + 1);
					if ((((Height) > 35) && ((Height) < 86))) {
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
					if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("river"))) == (false))
							&& (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("nkquest:pit"))) == (false))
									&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
											.equals(new ResourceLocation("nkquest:climatecove"))) == (false))))) {
						if (((Height) < 63)) {
							{
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", (int) (x));
								$_dependencies.put("y", (int) ((Height)));
								$_dependencies.put("z", (int) (z));
								ProcedurePitWallGen.executeProcedure($_dependencies);
							}
							{
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", (int) ((x + 1)));
								$_dependencies.put("y", (int) ((Height)));
								$_dependencies.put("z", (int) (z));
								ProcedurePitWallGen.executeProcedure($_dependencies);
							}
							{
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", (int) ((x - 1)));
								$_dependencies.put("y", (int) ((Height)));
								$_dependencies.put("z", (int) (z));
								ProcedurePitWallGen.executeProcedure($_dependencies);
							}
							{
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", (int) (x));
								$_dependencies.put("y", (int) ((Height)));
								$_dependencies.put("z", (int) ((z + 1)));
								ProcedurePitWallGen.executeProcedure($_dependencies);
							}
							{
								java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
								$_dependencies.put("world", world);
								$_dependencies.put("x", (int) (x));
								$_dependencies.put("y", (int) ((Height)));
								$_dependencies.put("z", (int) ((z - 1)));
								ProcedurePitWallGen.executeProcedure($_dependencies);
							}
						}
					}
					if (((Height) > 80)) {
						world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockCrustrock.block.getDefaultState(), 3);
						break;
					}
				}
			}
		}
	}
}
