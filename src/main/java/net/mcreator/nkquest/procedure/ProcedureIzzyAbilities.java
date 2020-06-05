package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemIzzyToken;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureIzzyAbilities extends ElementsNkquest.ModElement {
	public ProcedureIzzyAbilities(ElementsNkquest instance) {
		super(instance, 195);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IzzyAbilities!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IzzyAbilities!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IzzyAbilities!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IzzyAbilities!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IzzyAbilities!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		double cooldown = 0;
		double gamemode = 0;
		double realgamemode = 0;
		double GhostMode = 0;
		boolean active = false;
		boolean cooldownon = false;
		active = (boolean) (true);
		if (((entity instanceof EntityPlayer) && ((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemIzzyToken.block, (int) (1)))
				: false))) {
			if (((!(new Object() {
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
			}.check())) && (entity.isSneaking()))) {
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("nkquest:nkquest.entity.invisible")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 1, (int) 1, (false), (false)));
			}
			if (((new Object() {
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
			}.check()) && (entity.isSneaking()))) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, (int) 1, (int) 1, (false), (false)));
				active = (boolean) (true);
			}
			if (((new Object() {
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
			}.check()) && (!(entity.isSneaking())))) {
				world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(new ResourceLocation("nkquest:nkquest.entity.visible")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).addExperienceLevel(-((int) 0.01));
				active = (boolean) (false);
			}
		}
	}
}
