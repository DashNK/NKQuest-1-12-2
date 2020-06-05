
package net.mcreator.nkquest.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityHusk;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BiomeSandyCaves extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:sandycaves")
	public static final BiomeGenCustom biome = null;
	public BiomeSandyCaves(ElementsNkquest instance) {
		super(instance, 218);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WASTELAND,
				BiomeDictionary.Type.DRY, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.MESA);
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Sandy Caves").setRainfall(0F).setBaseHeight(0F).setHeightVariation(0F).setTemperature(1.5F));
			setRegistryName("sandycaves");
			topBlock = Blocks.SAND.getStateFromMeta(0);
			fillerBlock = Blocks.SANDSTONE.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 8;
			decorator.grassPerChunk = 8;
			decorator.deadBushPerChunk = 32;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 48;
			decorator.sandPatchesPerChunk = 32;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
