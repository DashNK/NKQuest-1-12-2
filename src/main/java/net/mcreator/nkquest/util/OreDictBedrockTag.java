
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictBedrockTag extends ElementsNkquest.ModElement {
	public OreDictBedrockTag(ElementsNkquest instance) {
		super(instance, 534);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("bedrock", new ItemStack(BlockCrustrock.block, (int) (1)));
	}
}
