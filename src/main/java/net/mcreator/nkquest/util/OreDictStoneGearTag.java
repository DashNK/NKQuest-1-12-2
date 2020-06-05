
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemStoneGear;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictStoneGearTag extends ElementsNkquest.ModElement {
	public OreDictStoneGearTag(ElementsNkquest instance) {
		super(instance, 515);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gearStone", new ItemStack(ItemStoneGear.block, (int) (1)));
	}
}
