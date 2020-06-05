package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockTectonicCrust;
import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.block.BlockBiomeGen;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenBiomeFeatures extends ElementsNkquest.ModElement {
	public ProcedureGenBiomeFeatures(ElementsNkquest instance) {
		super(instance, 636);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenBiomeFeatures!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenBiomeFeatures!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenBiomeFeatures!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenBiomeFeatures!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double xpos = 0;
		double ypos = 0;
		double zpos = 0;
		double pausetimer = 0;
		double height = 0;
		double width = 0;
		boolean blocksbelow0Y = false;
		if (((world.provider.getDimension()) == (0))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockBiomeGen.block.getDefaultState()
					.getBlock()) == (true))) {
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:pit"))) == (true))) {
					if ((y == 1)) {
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) (30));
							$_dependencies.put("z", (int) (z));
							ProcedureGenPitBiome.executeProcedure($_dependencies);
						}
						if (((blocksbelow0Y) == (false))) {
							world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), BlockCrustrock.block.getDefaultState(), 3);
						}
					}
				}
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:greengorge"))) == (true))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (x));
						$_dependencies.put("y", (int) (47));
						$_dependencies.put("z", (int) (z));
						ProcedureGenGreenGorgeBiome.executeProcedure($_dependencies);
					}
				}
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("river"))) == (true))) {
					if ((y == 1)) {
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) (1));
							$_dependencies.put("z", (int) (z));
							ProcedureGenRiverInPit.executeProcedure($_dependencies);
						}
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) 1, (int) z))).getBlock() == Blocks.STONE.getStateFromMeta(0)
							.getBlock()) == (true))) {
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) (1));
							$_dependencies.put("z", (int) (z));
							ProcedureGenRiverInPit.executeProcedure($_dependencies);
						}
					}
				}
				if ((y > 1)) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) 6, (int) z))).getBlock() == Blocks.STONE.getStateFromMeta(0)
							.getBlock()) == (false))) {
						world.setBlockState(new BlockPos((int) x, (int) 6, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) 7, (int) z))).getBlock() == Blocks.STONE.getStateFromMeta(0)
							.getBlock()) == (false))) {
						world.setBlockState(new BlockPos((int) x, (int) 7, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) 8, (int) z))).getBlock() == Blocks.STONE.getStateFromMeta(0)
							.getBlock()) == (false))) {
						world.setBlockState(new BlockPos((int) x, (int) 8, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					}
					world.setBlockState(new BlockPos((int) x, (int) 2, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 3, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 4, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 5, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
				world.setBlockState(new BlockPos((int) x, (int) -1, (int) z), Blocks.BEDROCK.getDefaultState(), 3);
				if ((((world.getBlockState(new BlockPos((int) x, (int) -1, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
						.getBlock()) == (true))) {
					blocksbelow0Y = (boolean) (true);
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) -1, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState()
						.getBlock()) == (false))) {
					blocksbelow0Y = (boolean) (false);
					world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 0, (int) z), Blocks.BEDROCK.getDefaultState(), 3);
				}
				if (((blocksbelow0Y) == (true))) {
					for (int index0 = 0; index0 < (int) (128); index0++) {
						height = (double) ((height) - 1);
						if (((((world.getBlockState(new BlockPos((int) x, (int) (height), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()) == (false)) && ((height) > -96))) {
							world.setBlockState(new BlockPos((int) x, (int) (height), (int) z), BlockCrustrock.block.getDefaultState(), 3);
						}
						if (((((world.getBlockState(new BlockPos((int) x, (int) (height), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()) == (false)) && ((height) < -95))) {
							world.setBlockState(new BlockPos((int) x, (int) (height), (int) z), BlockTectonicCrust.block.getDefaultState(), 3);
						}
					}
				}
			}
		}
	}
}
