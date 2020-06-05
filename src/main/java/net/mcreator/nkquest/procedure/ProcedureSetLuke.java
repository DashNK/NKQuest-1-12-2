package net.mcreator.nkquest.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetLuke extends ElementsNkquest.ModElement {
	public ProcedureSetLuke(ElementsNkquest instance) {
		super(instance, 184);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetLuke!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setBoolean("isLuke", (true));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
