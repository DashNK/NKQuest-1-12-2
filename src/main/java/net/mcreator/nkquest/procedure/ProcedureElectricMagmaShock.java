package net.mcreator.nkquest.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.potion.PotionShockResistance;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureElectricMagmaShock extends ElementsNkquest.ModElement {
	public ProcedureElectricMagmaShock(ElementsNkquest instance) {
		super(instance, 478);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ElectricMagmaShock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionShockResistance.potion)
							return true;
					}
				}
				return false;
			}
		}.check()) == (false))) {
			entity.setInWeb();
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 8);
		}
	}
}
