
package net.mcreator.nkquest.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.item.ItemRuneCompound;
import net.mcreator.nkquest.item.ItemRune;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class RecipeRuneRecipe extends ElementsNkquest.ModElement {
	public RecipeRuneRecipe(ElementsNkquest instance) {
		super(instance, 17);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRuneCompound.block, (int) (1)), new ItemStack(ItemRune.block, (int) (0)), 0F);
	}
}
