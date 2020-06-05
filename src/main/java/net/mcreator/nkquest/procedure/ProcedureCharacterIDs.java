package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureCharacterIDs extends ElementsNkquest.ModElement {
	public ProcedureCharacterIDs(ElementsNkquest instance) {
		super(instance, 492);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CharacterIDs!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double timer = 0;
		if (((entity.getEntityData().getDouble("characterID")) == 0)) {
			entity.getEntityData().setBoolean("isDash", (false));
			entity.getEntityData().setBoolean("isPetch", (false));
			entity.getEntityData().setBoolean("isShade", (false));
			entity.getEntityData().setBoolean("isCnder", (false));
			entity.getEntityData().setBoolean("isTrinity", (false));
			entity.getEntityData().setBoolean("isBryan", (false));
			entity.getEntityData().setBoolean("isLuke", (false));
			entity.getEntityData().setBoolean("isLuigiFan456", (false));
			entity.getEntityData().setBoolean("isChaosAngel", (false));
			entity.getEntityData().setBoolean("isIzzy", (false));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 1)) {
			entity.getEntityData().setBoolean("isDash", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 2)) {
			entity.getEntityData().setBoolean("isPetch", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 3)) {
			entity.getEntityData().setBoolean("isShade", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 4)) {
			entity.getEntityData().setBoolean("isCnder", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 5)) {
			entity.getEntityData().setBoolean("isTrinity", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 6)) {
			entity.getEntityData().setBoolean("isBryan", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 7)) {
			entity.getEntityData().setBoolean("isLuke", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 8)) {
			entity.getEntityData().setBoolean("isLuigiFan456", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 9)) {
			entity.getEntityData().setBoolean("isChaosAngel", (true));
		}
		if (((entity.getEntityData().getDouble("characterID")) == 10)) {
			entity.getEntityData().setBoolean("isIzzy", (true));
		}
		timer = (double) 0;
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
