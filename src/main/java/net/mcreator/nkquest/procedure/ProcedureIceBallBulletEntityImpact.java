package net.mcreator.nkquest.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureIceBallBulletEntityImpact extends ElementsNkquest.ModElement {
	public ProcedureIceBallBulletEntityImpact(ElementsNkquest instance) {
		super(instance, 480);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IceBallBulletEntityImpact!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setInWeb();
	}
}
