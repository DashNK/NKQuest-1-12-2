
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemIronGear;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictIronGearTag extends ElementsNkquest.ModElement {
	public OreDictIronGearTag(ElementsNkquest instance) {
		super(instance, 514);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gearIron", new ItemStack(ItemIronGear.block, (int) (1)));
	}
}
