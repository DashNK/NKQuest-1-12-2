
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemDiamondGear;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictDiamondGearTag extends ElementsNkquest.ModElement {
	public OreDictDiamondGearTag(ElementsNkquest instance) {
		super(instance, 512);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gearDiamond", new ItemStack(ItemDiamondGear.block, (int) (1)));
	}
}
