
package net.mcreator.nkquest.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class LootTableMusicLootBags extends ElementsNkquest.ModElement {
	public LootTableMusicLootBags(ElementsNkquest instance) {
		super(instance, 425);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("nkquest", "musiclootbags"));
	}
}
