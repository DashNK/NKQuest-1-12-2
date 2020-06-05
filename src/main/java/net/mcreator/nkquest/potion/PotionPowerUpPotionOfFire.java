
package net.mcreator.nkquest.potion;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.List;
import java.util.ArrayList;

@ElementsNkquest.ModElement.Tag
public class PotionPowerUpPotionOfFire extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:poweruppotionoffire")
	public static final Potion potion = null;
	@GameRegistry.ObjectHolder("nkquest:poweruppotionoffire")
	public static final PotionType potionType = null;
	public PotionPowerUpPotionOfFire(ElementsNkquest instance) {
		super(instance, 483);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		ForgeRegistries.POTION_TYPES.register(new PotionTypeCustom());
	}
	public static class PotionTypeCustom extends PotionType {
		public PotionTypeCustom() {
			super(new PotionEffect[]{new PotionEffect(potion, 3600)});
			setRegistryName("poweruppotionoffire");
		}
	}

	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(false, -1012440);
			setBeneficial();
			setRegistryName("poweruppotionoffire");
			setPotionName("effect.poweruppotionoffire");
			potionIcon = new ResourceLocation("nkquest:textures/mob_effect/poweruppotionoffire.png");
		}

		@Override
		public boolean isInstant() {
			return true;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			ret.add(new ItemStack(Items.MILK_BUCKET, (int) (1)));
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
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
