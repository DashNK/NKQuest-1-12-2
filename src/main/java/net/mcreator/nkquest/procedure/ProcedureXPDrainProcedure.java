package net.mcreator.nkquest.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureXPDrainProcedure extends ElementsNkquest.ModElement {
	public ProcedureXPDrainProcedure(ElementsNkquest instance) {
		super(instance, 398);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XPDrainProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("dashBoosting")) == (true))) {
		}
	}
}
