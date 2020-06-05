
package net.mcreator.nkquest.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ItemGreenShellwalkerArmor extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:greenshellwalkerarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nkquest:greenshellwalkerarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nkquest:greenshellwalkerarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nkquest:greenshellwalkerarmorboots")
	public static final Item boots = null;
	public ItemGreenShellwalkerArmor(ElementsNkquest instance) {
		super(instance, 395);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GREENSHELLWALKERARMOR", "nkquest:shellwalker_green", 0, new int[]{0, 0, 3, 2}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("greenshellwalkerarmorhelmet")
				.setRegistryName("greenshellwalkerarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("greenshellwalkerarmorbody")
				.setRegistryName("greenshellwalkerarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("greenshellwalkerarmorboots")
				.setRegistryName("greenshellwalkerarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nkquest:greenshellwalkerarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nkquest:greenshellwalkerarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nkquest:greenshellwalkerarmorboots", "inventory"));
	}
}
