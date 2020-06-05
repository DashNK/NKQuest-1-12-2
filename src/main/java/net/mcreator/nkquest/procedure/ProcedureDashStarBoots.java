package net.mcreator.nkquest.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.HashMap;

@ElementsNkquest.ModElement.Tag
public class ProcedureDashStarBoots extends ElementsNkquest.ModElement {
	public ProcedureDashStarBoots(ElementsNkquest instance) {
		super(instance, 504);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DashStarBoots!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure DashStarBoots!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("dash"))) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("1");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("starboots"))) {
				entity.getEntityData().setBoolean("hasStarBoots", (true));
			}
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("1");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("oldboots"))) {
				entity.getEntityData().setBoolean("hasStarBoots", (true));
			}
		}
	}
}
