package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetSpawnPosition extends ElementsNkquest.ModElement {
	public ProcedureSetSpawnPosition(ElementsNkquest instance) {
		super(instance, 576);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetSpawnPosition!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SetSpawnPosition!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double heightCount = 0;
		if ((((NkquestVariables.MapVariables.get(world).FirstPlay) == (false)) && ((entity.getEntityData().getBoolean("firstPlay")) == (false)))) {
			if (((entity.dimension) == 0)) {
				for (int index0 = 0; index0 < (int) (193); index0++) {
					if (((world.isAirBlock(new BlockPos((int) (entity.posX), (int) (63 + (heightCount)), (int) (entity.posZ)))) == (false))) {
						heightCount = (double) ((heightCount) + 1);
						entity.setPositionAndUpdate(0, (63 + (heightCount)), 0);
					}
					if (((world
							.isAirBlock(new BlockPos((int) (entity.posX), (int) ((entity.posY) + (heightCount)), (int) (entity.posZ)))) == (true))) {
						world.setSpawnPoint(new BlockPos((int) 0, (int) (63 + (heightCount)), (int) 0));
						break;
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.player;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", (int) entity.posX);
		dependencies.put("y", (int) entity.posY);
		dependencies.put("z", (int) entity.posZ);
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
