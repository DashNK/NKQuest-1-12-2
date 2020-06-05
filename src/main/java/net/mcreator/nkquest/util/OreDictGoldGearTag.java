
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemGoldGear;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictGoldGearTag extends ElementsNkquest.ModElement {
	public OreDictGoldGearTag(ElementsNkquest instance) {
		super(instance, 513);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gearGold", new ItemStack(ItemGoldGear.block, (int) (1)));
	}
}
