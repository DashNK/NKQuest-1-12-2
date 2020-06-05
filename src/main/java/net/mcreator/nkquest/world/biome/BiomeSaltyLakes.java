
package net.mcreator.nkquest.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BiomeSaltyLakes extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:saltylakes")
	public static final BiomeGenCustom biome = null;
	public BiomeSaltyLakes(ElementsNkquest instance) {
		super(instance, 651);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.SANDY,
				BiomeDictionary.Type.WATER);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 2));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Salty Lakes").setRainfall(0.5F).setBaseHeight(-0.25F).setHeightVariation(0.25F).setTemperature(0.5F));
			setRegistryName("saltylakes");
			topBlock = Blocks.SAND.getStateFromMeta(0);
			fillerBlock = Blocks.SAND.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 2;
			decorator.grassPerChunk = 12;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 5;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 32;
			decorator.gravelPatchesPerChunk = 16;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
