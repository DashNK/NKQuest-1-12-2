
package net.mcreator.nkquest.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ItemStarArmor extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:stararmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nkquest:stararmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nkquest:stararmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nkquest:stararmorboots")
	public static final Item boots = null;
	public ItemStarArmor(ElementsNkquest instance) {
		super(instance, 198);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STARARMOR", "nkquest:starboots_", 0, new int[]{2, 5, 6, 2}, 9, null, 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("stararmorboots")
				.setRegistryName("stararmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nkquest:stararmorboots", "inventory"));
	}
}
