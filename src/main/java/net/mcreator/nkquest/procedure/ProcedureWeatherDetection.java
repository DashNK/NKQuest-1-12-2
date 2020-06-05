package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureWeatherDetection extends ElementsNkquest.ModElement {
	public ProcedureWeatherDetection(ElementsNkquest instance) {
		super(instance, 521);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WeatherDetection!");
			return;
		}
		World world = (World) dependencies.get("world");
		if ((((world.isRaining()) == (false)) && ((world.isThundering()) == (false)))) {
			NkquestVariables.MapVariables.get(world).isRaining = (boolean) (false);
			NkquestVariables.MapVariables.get(world).syncData(world);
			NkquestVariables.MapVariables.get(world).isStorming = (boolean) (false);
			NkquestVariables.MapVariables.get(world).syncData(world);
			NkquestVariables.WorldVariables.get(world).globalWeatherTrigger = (boolean) (false);
			NkquestVariables.WorldVariables.get(world).syncData(world);
			NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention = (boolean) (false);
			NkquestVariables.WorldVariables.get(world).syncData(world);
		}
		if (((world.isRaining()) == (true))) {
			NkquestVariables.MapVariables.get(world).isRaining = (boolean) (true);
			NkquestVariables.MapVariables.get(world).syncData(world);
			if (((NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention) == (false))) {
				NkquestVariables.WorldVariables.get(world).globalWeatherTrigger = (boolean) (true);
				NkquestVariables.WorldVariables.get(world).syncData(world);
			}
		}
		if (((world.isThundering()) == (true))) {
			NkquestVariables.MapVariables.get(world).isStorming = (boolean) (true);
			NkquestVariables.MapVariables.get(world).syncData(world);
			if (((NkquestVariables.WorldVariables.get(world).globalWeatherTriggerPrevention) == (false))) {
				NkquestVariables.WorldVariables.get(world).globalWeatherTrigger = (boolean) (true);
				NkquestVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			World world = event.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
