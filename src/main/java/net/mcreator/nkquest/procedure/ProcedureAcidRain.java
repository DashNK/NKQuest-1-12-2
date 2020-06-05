package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureAcidRain extends ElementsNkquest.ModElement {
	public ProcedureAcidRain(ElementsNkquest instance) {
		super(instance, 125);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidRain!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AcidRain!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AcidRain!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AcidRain!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AcidRain!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if ((((world.isRaining()) || (world.isThundering())) && (Biome.REGISTRY
				.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z))).equals(new ResourceLocation("nkquest:@registryname"))))) {
			for (int index0 = 0; index0 < (int) (20); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 20)) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.5);
				timer = (double) 1;
			}
		}
	}
}
