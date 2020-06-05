package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.init.Blocks;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.block.BlockLitFuse;
import net.mcreator.nkquest.block.BlockLitChargedFuse;
import net.mcreator.nkquest.block.BlockFuse;
import net.mcreator.nkquest.block.BlockChargedFuse;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFuseBurn extends ElementsNkquest.ModElement {
	public ProcedureFuseBurn(ElementsNkquest instance) {
		super(instance, 556);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FuseBurn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FuseBurn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FuseBurn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FuseBurn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (256); index0++) {
				timer = (double) ((timer) + 1);
				if (((timer) == 256)) {
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockLitFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~1 ~ ~ {Fuse:64}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~-1 ~ ~ {Fuse:64}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~1 ~ {Fuse:64}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~-1 ~ {Fuse:64}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~ ~1 {Fuse:64}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~ ~-1 {Fuse:64}");
						}
					}
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if (((timer) > 63)) {
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == BlockChargedFuse.block.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockLitChargedFuse.block.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~1 ~ ~ {Fuse:16}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~-1 ~ ~ {Fuse:16}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~1 ~ {Fuse:16}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~-1 ~ {Fuse:16}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~ ~1 {Fuse:16}");
						}
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.TNT.getDefaultState()
							.getBlock())) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
						if (!world.isRemote && world.getMinecraftServer() != null) {
							world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							}, "summon tnt ~ ~ ~-1 {Fuse:16}");
						}
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLitChargedFuse.block.getDefaultState()
							.getBlock()) && ((timer) > 99))) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockFuse.block.getDefaultState().getBlock())
							&& ((timer) == 256))) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					}
					if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLitChargedFuse.block.getDefaultState()
							.getBlock()) && ((timer) > 63))) {
						world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					}
				}
			}
		}
	}
}
