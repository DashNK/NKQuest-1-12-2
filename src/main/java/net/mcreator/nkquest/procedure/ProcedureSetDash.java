package net.mcreator.nkquest.procedure;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetDash extends ElementsNkquest.ModElement {
	public ProcedureSetDash(ElementsNkquest instance) {
		super(instance, 178);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		NkquestVariables.CharacterID = (double) 1;
	}
}
