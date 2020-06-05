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

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Map;

@ElementsNkquest.ModElement.Tag
public class ProcedureGenPitBiome extends ElementsNkquest.ModElement {
	public ProcedureGenPitBiome(ElementsNkquest instance) {
		super(instance, 643);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GenPitBiome!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GenPitBiome!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GenPitBiome!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GenPitBiome!");
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
				.equals(new ResourceLocation("nkquest:pit"))) == (true))) {
			Height = (double) 35;
			for (int index0 = 0; index0 < (int) (86); index0++) {
				Height = (double) ((Height) + 1);
				if ((((Height) < 86) && ((Height) > 34))) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (false))) {
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (true))) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) 36, (int) z);
							IBlockState _bs = (world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z)));
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
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) z), Blocks.FLOWING_LAVA.getDefaultState(), 3);
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
				}
				if ((((Height) < 86) && ((Height) > 45))) {
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (false))) {
						world.setBlockToAir(new BlockPos((int) x, (int) (Height), (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))).getBlock() == Blocks.CHEST.getDefaultState()
							.getBlock()) == (true))) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) 36, (int) z);
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
						world.setBlockState(new BlockPos((int) x, (int) 36, (int) z),
								(world.getBlockState(new BlockPos((int) x, (int) (Height), (int) z))), 3);
					}
				}
				if (((((Height) > 34) && ((Height) < 63))
						&& (((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + 1), (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:pit"))) == (false))
								&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + 1), (int) y, (int) z)))
										.equals(new ResourceLocation("river"))) == (false)))
								|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + 1))))
										.equals(new ResourceLocation("nkquest:pit"))) == (false))
										&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + 1))))
												.equals(new ResourceLocation("river"))) == (false))))
								|| ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 1), (int) y, (int) z)))
										.equals(new ResourceLocation("nkquest:pit"))) == (false))
										&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 1), (int) y, (int) z)))
												.equals(new ResourceLocation("river"))) == (false)))
										|| (((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - 1))))
												.equals(new ResourceLocation("nkquest:pit"))) == (false))
												&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - 1))))
														.equals(new ResourceLocation("river"))) == (false))))))) {
					if (((Height) < 64)) {
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
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) z), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) (x + 1), (int) (Height), (int) z), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) (x - 1), (int) (Height), (int) z), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) (z + 1)), Blocks.STONE.getStateFromMeta(0), 3);
						world.setBlockState(new BlockPos((int) x, (int) (Height), (int) (z - 1)), Blocks.STONE.getStateFromMeta(0), 3);
					}
				}
				if (((Height) > 85)) {
					world.setBlockToAir(new BlockPos((int) x, (int) 86, (int) z));
					break;
				}
			}
			for (int index1 = 0; index1 < (int) (40); index1++) {
				width = (double) ((width) + 1);
				if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + 5), (int) y, (int) z)))
						.equals(new ResourceLocation("river"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x + 4), (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:pit"))) == (true)))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (((x - 5) + (width))));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (z));
						ProcedureGenRiverInPit.executeProcedure($_dependencies);
					}
					world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
				if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 5), (int) y, (int) z)))
						.equals(new ResourceLocation("river"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) (x - 4), (int) y, (int) z)))
								.equals(new ResourceLocation("nkquest:pit"))) == (true)))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (((x + 5) - (width))));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (z));
						ProcedureGenRiverInPit.executeProcedure($_dependencies);
					}
					world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
				if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + 5))))
						.equals(new ResourceLocation("river"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z + 4))))
								.equals(new ResourceLocation("nkquest:pit"))) == (true)))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (x));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (((z - 5) + (width))));
						ProcedureGenRiverInPit.executeProcedure($_dependencies);
					}
					world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
				if ((((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - 5))))
						.equals(new ResourceLocation("river"))) == (true))
						&& ((Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) (z - 4))))
								.equals(new ResourceLocation("nkquest:pit"))) == (true)))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (x));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (((z + 5) - (width))));
						ProcedureGenRiverInPit.executeProcedure($_dependencies);
					}
					world.setBlockState(new BlockPos((int) x, (int) 31, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 32, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 33, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 34, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
					world.setBlockState(new BlockPos((int) x, (int) 35, (int) z), Blocks.STONE.getStateFromMeta(0), 3);
				}
			}
		}
	}
}
