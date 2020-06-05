package net.mcreator.nkquest.procedure;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import net.mcreator.nkquest.entity.EntityShaftGenerator;
import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureShaftGenDetectSurface extends ElementsNkquest.ModElement {
	public ProcedureShaftGenDetectSurface(ElementsNkquest instance) {
		super(instance, 568);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ShaftGenDetectSurface!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ShaftGenDetectSurface!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ShaftGenDetectSurface!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ShaftGenDetectSurface!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double curHeight = 0;
		double timer = 0;
		double framecount = 0;
		boolean foundSurface = false;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (256); index0++) {
				if (((foundSurface) == (false))) {
					curHeight = (double) ((curHeight) + 1);
					framecount = (double) ((framecount) + 1);
					if (((framecount) > 3)) {
						framecount = (double) 0;
					}
				}
				if ((((world.isAirBlock(new BlockPos((int) x, (int) (y + (curHeight)), (int) z))) == (true))
						&& ((world.canSeeSky(new BlockPos((int) x, (int) (y + (curHeight)), (int) z))) == (foundSurface)))) {
					if (((foundSurface) == (false))) {
						if (!world.isRemote) {
							Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
									new ResourceLocation("nkquest", "shaft_top"));
							if (template != null) {
								BlockPos spawnTo = new BlockPos((int) (x - 5), (int) ((y + (curHeight)) - 1), (int) (z - 4));
								IBlockState iblockstate = world.getBlockState(spawnTo);
								world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
								template.addBlocksToWorldChunk(world, spawnTo,
										new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
												.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
							}
						}
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCrustrock.block.getDefaultState(), 3);
						foundSurface = (boolean) (true);
						break;
					}
					timer = (double) 0;
				}
				if (((framecount) == 0)) {
					if (!world.isRemote) {
						Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
								new ResourceLocation("nkquest", "shaft_frame_solid"));
						if (template != null) {
							BlockPos spawnTo = new BlockPos((int) (x - 3), (int) ((y + (curHeight)) - 1), (int) (z - 3));
							IBlockState iblockstate = world.getBlockState(spawnTo);
							world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
							template.addBlocksToWorldChunk(world, spawnTo,
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
											.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
						}
					}
				}
				if ((((framecount) > 0) && ((framecount) < 4))) {
					if (!world.isRemote) {
						Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
								new ResourceLocation("nkquest", "shaft_frame_fence"));
						if (template != null) {
							BlockPos spawnTo = new BlockPos((int) (x - 3), (int) ((y + (curHeight)) - 1), (int) (z - 3));
							IBlockState iblockstate = world.getBlockState(spawnTo);
							world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
							template.addBlocksToWorldChunk(world, spawnTo,
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null)
											.setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
						}
					}
				}
				if (((framecount) == 4)) {
					framecount = (double) 0;
				}
				timer = (double) 0;
			}
			if (!world.isRemote) {
				Entity entityToSpawn = new EntityShaftGenerator.EntityCustom(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, 0.05, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
