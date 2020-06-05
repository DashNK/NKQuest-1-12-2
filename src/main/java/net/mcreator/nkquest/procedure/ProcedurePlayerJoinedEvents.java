package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePlayerJoinedEvents extends ElementsNkquest.ModElement {
	public ProcedurePlayerJoinedEvents(ElementsNkquest instance) {
		super(instance, 489);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerJoinedEvents!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlayerJoinedEvents!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		NkquestVariables.CharacterID = (double) (entity.getEntityData().getDouble("characterID"));
		NkquestVariables.MapVariables.get(world).IceStormActive = (double) (entity.getEntityData().getDouble("iceStorm"));
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.DashHasStarBoots = (boolean) (entity.getEntityData().getBoolean("hasStarBoots"));
		NkquestVariables.MapVariables.get(world).FirstPlay = (boolean) (entity.getEntityData().getBoolean("firstPlay"));
		NkquestVariables.MapVariables.get(world).syncData(world);
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			ProcedureSkinUpdates.executeProcedure($_dependencies);
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
