package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureIzzyInvisibility extends ElementsNkquest.ModElement {
	public ProcedureIzzyInvisibility(ElementsNkquest instance) {
		super(instance, 196);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IzzyInvisibility!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IzzyInvisibility!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IzzyInvisibility!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IzzyInvisibility!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IzzyInvisibility!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean active = false;
		double timer = 0;
		if (((entity instanceof EntityPlayer) && (((NkquestVariables.Player)).equals("Izzy")))) {
			active = (boolean) (true);
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nkquest:nkquest.entity.invisible")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if (((entity instanceof EntityPlayer) && ((((NkquestVariables.Player)).equals("Izzy")) && (((active) == (true)) && (!(new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == MobEffects.INVISIBILITY)
								return true;
						}
					}
					return false;
				}
			}.check())))))) {
				active = (boolean) (false);
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("nkquest:nkquest.entity.visible")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
			}
		}
	}
}
