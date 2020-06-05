package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureStrikeLightningInThunderPeaks extends ElementsNkquest.ModElement {
	public ProcedureStrikeLightningInThunderPeaks(ElementsNkquest instance) {
		super(instance, 325);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure StrikeLightningInThunderPeaks!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure StrikeLightningInThunderPeaks!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure StrikeLightningInThunderPeaks!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure StrikeLightningInThunderPeaks!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		double timeron = 0;
		double height = 0;
		boolean active = false;
		if ((Math.random() < 0.02)) {
			active = (boolean) (true);
			if ((Math.random() < 0.02)) {
				if (((active) == (true))) {
					if ((((world.isRaining()) == (true)) && ((world.isThundering()) == (false)))) {
						if ((Math.random() < 0.05)) {
							world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) (y - 63), (int) z, false));
						}
					}
					if (((world.isThundering()) == (true))) {
						if ((Math.random() < 0.1)) {
							world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) (y - 63), (int) z, false));
						}
					}
				}
			}
		}
	}
}
