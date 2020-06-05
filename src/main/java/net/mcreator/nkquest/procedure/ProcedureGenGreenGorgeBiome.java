package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.nkquest.block.BlockGrassyDriedDirt;
import net.mcreator.nkquest.block.BlockDriedDirt;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Map;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenGreenGorgeBiome extends ElementsNkquest.ModElement {
	public ProcedureGenGreenGorgeBiome(ElementsNkquest instance) {
		super(instance, 664);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenGreenGorgeBiome!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenGreenGorgeBiome!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenGreenGorgeBiome!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenGreenGorgeBiome!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double Height = 0;
		double width = 0;
		double count = 0;
		double wait = 0;
		double wallheight = 0;
		boolean GenComplete = false;
		boolean PosChsoen = false;
		if (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("nkquest:greengorge"))) == (true))) {
			Height = (double) 36;
			for (int index0 = 0; index0 < (int) (4); index0++) {
				width = (double) ((width) + 1);
			}
			for (int index1 = 0; index1 < (int) (128); index1++) {
				world.setBlockState(new BlockPos((int) x, (int) 36, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
				Height = (double) ((Height) + 1);
				if ((((Height) < 127) && ((Height) > 35))) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (false))) {
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (true))) {
						world.setBlockState(new BlockPos((int) x, (int) 48, (int) z),
								(world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))), 3);
						{
							BlockPos _bp = new BlockPos((int) x, (int) (Height), (int) z);
							IBlockState _bs = Blocks.AIR.getDefaultState();
							IBlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
								IProperty _property = entry.getKey();
								if (_bs.getPropertyKeys().contains(_property))
									_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
							}
							TileEntity _te = world.getTileEntity(_bp);
							NBTTagCompound _bnbt = null;
							if (_te != null) {
								_bnbt = _te.writeToNBT(new NBTTagCompound());
								_te.invalidate();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.readFromNBT(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
				if ((((Height) < 48) && ((Height) > 35))) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (false))) {
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (true))) {
						world.setBlockState(new BlockPos((int) x, (int) 36, (int) z),
								(world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))), 3);
						{
							BlockPos _bp = new BlockPos((int) x, (int) (Height), (int) z);
							IBlockState _bs = Blocks.AIR.getDefaultState();
							IBlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
								IProperty _property = entry.getKey();
								if (_bs.getPropertyKeys().contains(_property))
									_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
							}
							TileEntity _te = world.getTileEntity(_bp);
							NBTTagCompound _bnbt = null;
							if (_te != null) {
								_bnbt = _te.writeToNBT(new NBTTagCompound());
								_te.invalidate();
							}
							world.setBlockState(_bp, _bs, 3);
							if (_bnbt != null) {
								_te = world.getTileEntity(_bp);
								if (_te != null) {
									try {
										_te.readFromNBT(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
					}
				}
				if (((((Height) > 34) && ((Height) < 76))
						&& ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + (width)), (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:greengorge"))) == (false))
								|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + (width)))))
										.equals(new ResourceLocation("nkquest:greengorge"))) == (false)))
								|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - (width)), (int) y, (int) z)))
										.equals(new ResourceLocation("nkquest:greengorge"))) == (false))
										|| ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - (width)))))
												.equals(new ResourceLocation("nkquest:greengorge"))) == (false)))))) {
					if (((Height) < 63)) {
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) ((x + (width))));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) ((x - (width))));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) ((z + (width))));
							ProcedureGreenGorgeWallGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) ((z - (width))));
							ProcedureGreenGorgeWallGen.executeProcedure($_dependencies);
						}
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) z), BlockDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x + (width)), (int) (Height), (int) z), BlockDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x - (width)), (int) (Height), (int) z), BlockDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) (z + (width))), BlockDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) (z - (width))), BlockDriedDirt.block.getDefaultState(), 3);
					}
					if ((((Height) > 62) && ((Height) < 64))) {
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallTopGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) ((x + (width))));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallTopGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) ((x - (width))));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) (z));
							ProcedureGreenGorgeWallTopGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) ((z + (width))));
							ProcedureGreenGorgeWallTopGen.executeProcedure($_dependencies);
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) ((Height)));
							$_dependencies.put("z", (int) ((z - (width))));
							ProcedureGreenGorgeWallTopGen.executeProcedure($_dependencies);
						}
						world.setBlockState(new BlockPos((int) x, (int) 63, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x + (width)), (int) 63, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x - (width)), (int) 63, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 63, (int) (z + (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) 63, (int) (z - (width))), BlockGrassyDriedDirt.block.getDefaultState(), 3);
					}
				}
				if (((Height) > 127)) {
					world.setBlockToAir(new BlockPos((int) x, (int) 128, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) 36, (int) z), BlockGrassyDriedDirt.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), BlockDriedDirt.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 30, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 29, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 28, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 27, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					break;
				}
			}
		}
	}
}
