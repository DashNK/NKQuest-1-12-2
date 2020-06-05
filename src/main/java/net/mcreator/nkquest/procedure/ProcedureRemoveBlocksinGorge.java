package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockYellowstone;
import net.mcreator.nkquest.block.BlockLushYellowstone;
import net.mcreator.nkquest.block.BlockGorgeWallGen;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureRemoveBlocksinGorge extends ElementsNkquest.ModElement {
	public ProcedureRemoveBlocksinGorge(ElementsNkquest instance) {
		super(instance, 121);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RemoveBlocksinGorge!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RemoveBlocksinGorge!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RemoveBlocksinGorge!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RemoveBlocksinGorge!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		double yval = 0;
		double height = 0;
		double wallsize = 0;
		double wallplusx = 0;
		double wallminusx = 0;
		double wallplusz = 0;
		double wallminusz = 0;
		yval = (double) 11;
		if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:gorge"))) == (true))
				&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 24), (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:gorge"))) == (true)))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + (height)), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - (yval)), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			if (((((world.getBlockState(new BlockPos((int) x, (int) (y - (yval)), (int) z))).getBlock() == BlockLushYellowstone.block
					.getDefaultState().getBlock()) == (false))
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - (yval)), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock()) == (false)))) {
				world.setBlockToAir(new BlockPos((int) x, (int) (y - (yval)), (int) z));
				world.setBlockState(new BlockPos((int) x, (int) (y - (yval)), (int) z), BlockLushYellowstone.block.getDefaultState(), 3);
				world.setBlockToAir(new BlockPos((int) x, (int) ((y - (yval)) - 1), (int) z));
				world.setBlockState(new BlockPos((int) x, (int) ((y - (yval)) - 1), (int) z), BlockLushYellowstone.block.getDefaultState(), 3);
				world.setBlockToAir(new BlockPos((int) x, (int) ((y - (yval)) - 2), (int) z));
				world.setBlockState(new BlockPos((int) x, (int) ((y - (yval)) - 2), (int) z), BlockYellowstone.block.getDefaultState(), 3);
				world.setBlockToAir(new BlockPos((int) x, (int) ((y - (yval)) - 3), (int) z));
				world.setBlockState(new BlockPos((int) x, (int) ((y - (yval)) - 3), (int) z), BlockYellowstone.block.getDefaultState(), 3);
				world.setBlockToAir(new BlockPos((int) x, (int) ((y - (yval)) - 4), (int) z));
				world.setBlockState(new BlockPos((int) x, (int) ((y - (yval)) - 4), (int) z), BlockYellowstone.block.getDefaultState(), 3);
			}
			if (((timer) == 0)) {
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - (yval)), (int) z))).getBlock() == BlockLushYellowstone.block
						.getDefaultState().getBlock())) {
					for (int index0 = 0; index0 < (int) (1); index0++) {
						timer = (double) 1;
					}
					if (((timer) == 1)) {
						for (int index1 = 0; index1 < (int) ((yval)); index1++) {
							height = (double) ((height) + 1);
							world.setBlockToAir(new BlockPos((int) x, (int) (y - (height)), (int) z));
							world.setBlockState(new BlockPos((int) x, (int) (y - (height)), (int) z), Blocks.AIR.getDefaultState(), 3);
						}
					}
				}
			}
		}
		if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:gorge"))) == (false))
				|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:gorge"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 24), (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:gorge"))) == (false))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockYellowstone.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), BlockGorgeWallGen.block.getDefaultState(), 3);
		}
		if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 24), (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
			wallminusx = (double) 24;
			for (int index2 = 0; index2 < (int) (24); index2++) {
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (wallminusx)), (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:gorge"))) == (true))) {
					world.setBlockState(new BlockPos((int) (x - (wallminusx)), (int) 33, (int) z), BlockGorgeWallGen.block.getDefaultState(), 3);
				}
				wallminusx = (double) ((wallminusx) - 1);
			}
		}
	}
}
