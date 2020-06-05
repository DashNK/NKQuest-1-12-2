package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePlayerDeathEvents extends ElementsNkquest.ModElement {
	public ProcedurePlayerDeathEvents(ElementsNkquest instance) {
		super(instance, 493);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerDeathEvents!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlayerDeathEvents!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (((entity instanceof EntityPlayer) == (true))) {
			NkquestVariables.CharacterID = (double) (entity.getEntityData().getDouble("characterID"));
			NkquestVariables.MapVariables.get(world).IceStormActive = (double) (entity.getEntityData().getDouble("iceStorm"));
			NkquestVariables.MapVariables.get(world).syncData(world);
			NkquestVariables.DashHasStarBoots = (boolean) (entity.getEntityData().getBoolean("hasStarBoots"));
			NkquestVariables.MapVariables.get(world).FirstPlay = (boolean) (entity.getEntityData().getBoolean("firstPlay"));
			NkquestVariables.MapVariables.get(world).syncData(world);
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			World world = entity.world;
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
