package net.mcreator.nkquest.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSuperstarFormOnPotionActiveTick extends ElementsNkquest.ModElement {
	public ProcedureSuperstarFormOnPotionActiveTick(ElementsNkquest instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SuperstarFormOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof EntityPlayer)) {
			entity.getEntityData().setDouble("walkSpeed", 0.4);
			entity.getEntityData().setDouble("flySpeed", 0.6);
			entity.getEntityData().setDouble("canfly", 3);
			entity.getEntityData().setDouble("invulnerable", 1);
			entity.fallDistance = (float) (0);
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.GLOWING, (int) 60, (int) 1, (false), (false)));
		}
	}
}
