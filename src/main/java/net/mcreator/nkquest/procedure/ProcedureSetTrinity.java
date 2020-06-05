package net.mcreator.nkquest.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetTrinity extends ElementsNkquest.ModElement {
	public ProcedureSetTrinity(ElementsNkquest instance) {
		super(instance, 182);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetTrinity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setBoolean("isTrinity", (true));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
