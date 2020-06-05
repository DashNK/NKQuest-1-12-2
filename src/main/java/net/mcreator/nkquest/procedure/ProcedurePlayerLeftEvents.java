package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePlayerLeftEvents extends ElementsNkquest.ModElement {
	public ProcedurePlayerLeftEvents(ElementsNkquest instance) {
		super(instance, 490);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerLeftEvents!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlayerLeftEvents!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("characterID", (NkquestVariables.CharacterID));
		entity.getEntityData().setDouble("iceStorm", (NkquestVariables.MapVariables.get(world).IceStormActive));
		entity.getEntityData().setBoolean("hasStarBoots", (NkquestVariables.DashHasStarBoots));
		entity.getEntityData().setBoolean("dashInShell", (false));
		entity.getEntityData().setBoolean("firstPlay", (NkquestVariables.MapVariables.get(world).FirstPlay));
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent event) {
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
