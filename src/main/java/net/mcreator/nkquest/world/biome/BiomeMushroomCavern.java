
package net.mcreator.nkquest.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.monster.EntityMob;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BiomeMushroomCavern extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:mushroomcavern")
	public static final BiomeGenCustom biome = null;
	public BiomeMushroomCavern(ElementsNkquest instance) {
		super(instance, 207);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.MUSHROOM, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE);
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Mushroom Cavern").setRainfall(0F).setBaseHeight(0F).setHeightVariation(0F).setTemperature(0.5F));
			setRegistryName("mushroomcavern");
			topBlock = Blocks.MYCELIUM.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 32;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 64;
			decorator.bigMushroomsPerChunk = 48;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 16;
			decorator.gravelPatchesPerChunk = 32;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
