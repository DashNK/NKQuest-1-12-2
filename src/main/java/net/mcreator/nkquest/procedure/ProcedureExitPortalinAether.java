package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.block.BlockFakeGlowstone;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureExitPortalinAether extends ElementsNkquest.ModElement {
	public ProcedureExitPortalinAether(ElementsNkquest instance) {
		super(instance, 298);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ExitPortalinAether!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ExitPortalinAether!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ExitPortalinAether!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ExitPortalinAether!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ExitPortalinAether!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if (((entity instanceof EntityPlayer) && ((entity.dimension) == 4))) {
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate(((entity.posX) - 1), y, z);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate(((entity.posX) + 1), y, z);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate((entity.posX), y, (z - 1));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate((entity.posX), y, (z + 1));
				}
			}
			if (((entity instanceof EntityPlayer) && ((entity.dimension) == 0))) {
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate(((entity.posX) - 1), y, z);
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate(((entity.posX) + 1), y, z);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate((entity.posX), y, (z - 1));
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == BlockFakeGlowstone.block
						.getDefaultState().getBlock())) {
					entity.setPositionAndUpdate((entity.posX), y, (z + 1));
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		int dimension = event.getDimension();
		Entity entity = event.getEntity();
		World world = entity.world;
		int i = (int) entity.posX;
		int j = (int) entity.posY;
		int k = (int) entity.posZ;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("dimension", dimension);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
