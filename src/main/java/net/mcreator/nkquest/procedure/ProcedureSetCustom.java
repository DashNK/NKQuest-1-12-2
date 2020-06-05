package net.mcreator.nkquest.procedure;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSetCustom extends ElementsNkquest.ModElement {
	public ProcedureSetCustom(ElementsNkquest instance) {
		super(instance, 188);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		NkquestVariables.Player = (String) "Custom";
	}
}
