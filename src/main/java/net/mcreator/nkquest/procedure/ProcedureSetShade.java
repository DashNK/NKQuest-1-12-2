package net.mcreator.nkquest.procedure;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetShade extends ElementsNkquest.ModElement {
	public ProcedureSetShade(ElementsNkquest instance) {
		super(instance, 180);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		NkquestVariables.CharacterID = (double) 3;
	}
}
