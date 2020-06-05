
package net.mcreator.nkquest.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemResin;
import net.mcreator.nkquest.item.ItemPlastic;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class RecipeSmeltResin extends ElementsNkquest.ModElement {
	public RecipeSmeltResin(ElementsNkquest instance) {
		super(instance, 464);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemResin.block, (int) (1)), new ItemStack(ItemPlastic.block, (int) (0)), 0F);
	}
}
