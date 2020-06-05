
package net.mcreator.nkquest.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityCreeper;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BiomeLushCavern extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:lushcavern")
	public static final BiomeGenCustom biome = null;
	public BiomeLushCavern(ElementsNkquest instance) {
		super(instance, 208);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.LUSH,
				BiomeDictionary.Type.DENSE, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS);
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Lush Cavern").setRainfall(0F).setBaseHeight(0F).setHeightVariation(0F).setTemperature(0.65F));
			setRegistryName("lushcavern");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 64;
			decorator.flowersPerChunk = 32;
			decorator.grassPerChunk = 48;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 32;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 16;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 16;
			decorator.gravelPatchesPerChunk = 32;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
