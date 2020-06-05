package net.mcreator.nkquest.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSOSCharmActivate extends ElementsNkquest.ModElement {
	public ProcedureSOSCharmActivate(ElementsNkquest instance) {
		super(instance, 698);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SOSCharmActivate!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SOSCharmActivate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SOSCharmActivate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		double currentxp = 0;
		if ((((entity.getEntityData().getBoolean("sosactive")) == (true)) && ((entity instanceof EntityPlayer) == (true)))) {
			entity.setPositionAndUpdate(x, (entity.getEntityData().getDouble("sosheight")), z);
			entity.getEntityData().setDouble("sosheight", 0);
			entity.getEntityData().setBoolean("sosactive", (false));
		}
	}
}
