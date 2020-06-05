package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.HashMap;

@ElementsNkquest.ModElement.Tag
public class ProcedureInfoCommandResults extends ElementsNkquest.ModElement {
	public ProcedureInfoCommandResults(ElementsNkquest instance) {
		super(instance, 558);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure InfoCommandResults!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InfoCommandResults!");
			return;
		}
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		World world = (World) dependencies.get("world");
		String time = "";
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("info"))) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("1");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("time"))) {
				System.out.println((("Current world time: ") + "" + ((world.getWorldTime()))));
			}
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("1");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("weather"))) {
				if ((((world.isRaining()) == (false)) && ((world.isThundering()) == (false)))) {
					System.out.println((("Current weather state:") + "" + ("Clear")));
				}
				if ((((world.isRaining()) == (true)) && ((world.isThundering()) == (false)))) {
					System.out.println((("Current weather state:") + "" + ("Rainy")));
				}
				if (((world.isThundering()) == (true))) {
					System.out.println((("Current weather state:") + "" + ("Stormy")));
				}
			}
		}
	}
}
