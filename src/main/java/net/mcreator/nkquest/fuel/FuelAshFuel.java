
package net.mcreator.nkquest.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemAsh;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class FuelAshFuel extends ElementsNkquest.ModElement {
	public FuelAshFuel(ElementsNkquest instance) {
		super(instance, 546);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemAsh.block, (int) (1)).getItem())
			return 400;
		return 0;
	}
}
