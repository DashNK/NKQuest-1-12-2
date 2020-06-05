package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenRiverInQuarriedPit extends ElementsNkquest.ModElement {
	public ProcedureGenRiverInQuarriedPit(ElementsNkquest instance) {
		super(instance, 646);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenRiverInQuarriedPit!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenRiverInQuarriedPit!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenRiverInQuarriedPit!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenRiverInQuarriedPit!");
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
				.equals(new ResourceLocation("nkquest:quarriedpit"))) == (true))
				|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (pitradius)), (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:quarriedpit"))) == (true)))
				|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + (pitradius)))))
						.equals(new ResourceLocation("nkquest:quarriedpit"))) == (true))
						|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - (pitradius)))))
								.equals(new ResourceLocation("nkquest:quarriedpit"))) == (true))))) {
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
				Height = (double) 8;
				for (int index2 = 0; index2 < (int) (86); index2++) {
					if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("nkquest:quarriedpit"))) == (false))) {
						world.setBlockState(new BlockPos((int) x, (int) 8, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 10, (int) z), Blocks.WATER.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 11, (int) z), Blocks.WATER.getDefaultState(), 3);
					}
					Height = (double) ((Height) + 1);
					if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
							.equals(new ResourceLocation("river"))) == (false))
							&& (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
									.equals(new ResourceLocation("nkquest:quarriedpit"))) == (false))
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
					if (((Height) == 63)) {
						world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockCrustrock.block.getDefaultState(), 3);
						break;
					}
				}
			}
		}
	}
}
