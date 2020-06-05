
package net.mcreator.nkquest.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.block.BlockStarmanTreeLog;
import net.mcreator.nkquest.block.BlockShimmeringLog;
import net.mcreator.nkquest.block.BlockChromaticTreeLog;
import net.mcreator.nkquest.block.BlockCherryBloomLog;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class OreDictLogWoodTag extends ElementsNkquest.ModElement {
	public OreDictLogWoodTag(ElementsNkquest instance) {
		super(instance, 723);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, (int) (1)));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, (int) (1), 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, (int) (1), 2));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, (int) (1), 3));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, (int) (1), 3));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, (int) (1)));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, (int) (1), 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, (int) (1), 1));
		OreDictionary.registerOre("logWood", new ItemStack(BlockShimmeringLog.block, (int) (1)));
		OreDictionary.registerOre("logWood", new ItemStack(BlockCherryBloomLog.block, (int) (1)));
		OreDictionary.registerOre("logWood", new ItemStack(BlockChromaticTreeLog.block, (int) (1)));
		OreDictionary.registerOre("logWood", new ItemStack(BlockStarmanTreeLog.block, (int) (1)));
	}
}
