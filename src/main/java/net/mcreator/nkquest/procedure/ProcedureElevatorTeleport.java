package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.block.BlockElevatorBottom;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureElevatorTeleport extends ElementsNkquest.ModElement {
	public ProcedureElevatorTeleport(ElementsNkquest instance) {
		super(instance, 279);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ElevatorTeleport!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ElevatorTeleport!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer) && ((world.provider.getDimension()) == 0))
				&& (((world.getBlockState(new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) - 0.5), (int) (entity.posZ))))
						.getBlock() == BlockElevatorBottom.block.getDefaultState().getBlock()) && (entity.isSneaking())))) {
		}
		if ((((entity instanceof EntityPlayer) && ((world.provider.getDimension()) == -8000))
				&& (((world.getBlockState(new BlockPos((int) ((entity.posX) - 1), (int) ((entity.posY) - 0.5), (int) (entity.posZ))))
						.getBlock() == BlockElevatorBottom.block.getDefaultState().getBlock()) && (entity.isSneaking())))) {
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
