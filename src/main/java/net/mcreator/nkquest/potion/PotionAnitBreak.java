
package net.mcreator.nkquest.potion;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.procedure.ProcedureAnitBreakPotionStartedapplied;
import net.mcreator.nkquest.procedure.ProcedureAnitBreakPotionExpires;
import net.mcreator.nkquest.procedure.ProcedureAnitBreakOnPotionActiveTick;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.List;
import java.util.ArrayList;

@ElementsNkquest.ModElement.Tag
public class PotionAnitBreak extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:anitbreak")
	public static final Potion potion = null;
	public PotionAnitBreak(ElementsNkquest instance) {
		super(instance, 709);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(false, -10066330);
			setRegistryName("anitbreak");
			setPotionName("effect.anitbreak");
			potionIcon = new ResourceLocation("nkquest:textures/mob_effect/anitbreak.png");
		}

		@Override
		public boolean isInstant() {
			return true;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			return ret;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return false;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return false;
		}

		@Override
		public void affectEntity(Entity source, Entity indirectSource, EntityLivingBase entity, int amplifier, double health) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureAnitBreakPotionStartedapplied.executeProcedure($_dependencies);
			}
		}

		@Override
		public void performEffect(EntityLivingBase entity, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureAnitBreakOnPotionActiveTick.executeProcedure($_dependencies);
			}
		}

		@Override
		public void removeAttributesModifiersFromEntity(EntityLivingBase entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureAnitBreakPotionExpires.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
