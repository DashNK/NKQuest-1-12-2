package net.mcreator.nkquest.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.potion.PotionShockResistance;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureShockResistanceEffect extends ElementsNkquest.ModElement {
	public ProcedureShockResistanceEffect(ElementsNkquest instance) {
		super(instance, 139);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ShockResistanceEffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double lightningboltx = 0;
		double lightningbolty = 0;
		double lightningboltz = 0;
		double entityhealth = 0;
		if ((((entity instanceof EntityPlayer) || (entity instanceof EntityLiving)) && (new Object() {
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
		}.check()))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionShockResistance.potion, (int) 2, (int) 1));
			entityhealth = (double) ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1);
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).setHealth((float) (entityhealth));
		}
	}
}
