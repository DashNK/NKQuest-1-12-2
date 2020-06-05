package net.mcreator.nkquest.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetPetch extends ElementsNkquest.ModElement {
	public ProcedureSetPetch(ElementsNkquest instance) {
		super(instance, 179);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetPetch!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setBoolean("isPetch", (true));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
