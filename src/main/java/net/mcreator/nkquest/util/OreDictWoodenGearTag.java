
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemWoodenGear;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictWoodenGearTag extends ElementsNkquest.ModElement {
	public OreDictWoodenGearTag(ElementsNkquest instance) {
		super(instance, 516);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gearWood", new ItemStack(ItemWoodenGear.block, (int) (1)));
	}
}
