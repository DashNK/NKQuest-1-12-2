
package net.mcreator.nkquest.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityMagmaCube;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BiomeBlazingCaves extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:blazingcaves")
	public static final BiomeGenCustom biome = null;
	public BiomeBlazingCaves(ElementsNkquest instance) {
		super(instance, 221);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.NETHER, BiomeDictionary.Type.RARE, BiomeDictionary.Type.MESA, BiomeDictionary.Type.HOT,
				BiomeDictionary.Type.DRY);
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Blazing Caves").setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.5F));
			setRegistryName("blazingcaves");
			topBlock = Blocks.NETHERRACK.getDefaultState();
			fillerBlock = Blocks.NETHERRACK.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 32;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 16;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMob.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityPigZombie.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 40, 1, 5));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
