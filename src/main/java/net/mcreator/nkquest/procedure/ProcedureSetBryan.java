package net.mcreator.nkquest.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetBryan extends ElementsNkquest.ModElement {
	public ProcedureSetBryan(ElementsNkquest instance) {
		super(instance, 183);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SetBryan!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setBoolean("isBryan", (true));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}
