package net.mcreator.nkquest.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureShellEvents extends ElementsNkquest.ModElement {
	public ProcedureShellEvents(ElementsNkquest instance) {
		super(instance, 62);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ShellEvents!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getEntityData().getBoolean("isDash")) == (true)) && ((entity.getEntityData().getBoolean("dashInShell")) == (false)))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 0, (int) 2, (false), (false)));
		}
	}
}
