package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockYellowstone;
import net.mcreator.nkquest.block.BlockRemoveWater;
import net.mcreator.nkquest.block.BlockLushYellowstone;
import net.mcreator.nkquest.block.BlockGorgeWallGen;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureRemovewaterfromgorge extends ElementsNkquest.ModElement {
	public ProcedureRemovewaterfromgorge(ElementsNkquest instance) {
		super(instance, 109);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Removewaterfromgorge!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Removewaterfromgorge!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Removewaterfromgorge!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Removewaterfromgorge!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		double toplayer = 0;
		double wallsize = 0;
		double walllimit = 0;
		double walltimer = 0;
		double xminuswall = 0;
		double xpluswall = 0;
		double zminuswall = 0;
		double zpluswall = 0;
		boolean gorgeatxplus = false;
		boolean gorgeatxminus = false;
		boolean gorgeatzplus = false;
		boolean gorgeatzminus = false;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("nkquest:gorge"))) == (true))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			}
			if (((timer) == 1)) {
				if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockYellowstone.block.getDefaultState(), 3);
				}
				if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FLOWING_WATER.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.WATER.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock()))) {
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockRemoveWater.block.getDefaultState(), 3);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRAVEL.getDefaultState().getBlock())) {
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockLushYellowstone.block.getDefaultState(), 3);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 2), (int) z));
					world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), BlockYellowstone.block.getDefaultState(), 3);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 3), (int) z));
					world.setBlockState(new BlockPos((int) x, (int) (y - 3), (int) z), BlockYellowstone.block.getDefaultState(), 3);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 4), (int) z));
					world.setBlockState(new BlockPos((int) x, (int) (y - 4), (int) z), BlockYellowstone.block.getDefaultState(), 3);
				}
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockGorgeWallGen.block.getDefaultState(), 3);
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + 3), (int) y, (int) z)))
					.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
				world.setBlockToAir(new BlockPos((int) (x + 7), (int) y, (int) z));
				world.setBlockState(new BlockPos((int) (x + 7), (int) y, (int) z), BlockGorgeWallGen.block.getDefaultState(), 3);
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 3), (int) y, (int) z)))
					.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
				world.setBlockToAir(new BlockPos((int) (x - 7), (int) y, (int) z));
				world.setBlockState(new BlockPos((int) (x - 7), (int) y, (int) z), BlockGorgeWallGen.block.getDefaultState(), 3);
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + 3))))
					.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 7)));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 7)), BlockGorgeWallGen.block.getDefaultState(), 3);
			}
			if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - 3))))
					.equals(new ResourceLocation("nkquest:gorge"))) == (false))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 7)));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 7)), BlockGorgeWallGen.block.getDefaultState(), 3);
			}
		}
	}
}
