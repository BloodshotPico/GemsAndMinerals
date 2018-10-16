package com.bloodshotpico.gemsandminerals.world;

import java.util.Random;

import com.bloodshotpico.gemsandminerals.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if(world.provider.getDimension() == 0) 
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	//                                                                                   min Y = 1  13 = max Y        ((4=max)2=min 12=rarity) 
	//generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 13, random.nextInt(4) + 2, 12);
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		//Tier 1 Ores
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 3, 12, random.nextInt(3) + 1, 10);
		generateOre(ModBlocks.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 13, random.nextInt(4) + 2, 12);
		generateOre(ModBlocks.AMETHYST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 21, random.nextInt(3) + 1, 11);
		generateOre(ModBlocks.TOPAZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 14, 32, random.nextInt(8) + 2, 4);
		
		//Tier 2 Ores
		generateOre(ModBlocks.PHOSPHOPHYLLITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 2, 11, random.nextInt(4) + 2, 10);
		
		//Tier 3 Ores
		generateOre(ModBlocks.ROSE_QUARTZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 9, random.nextInt(3) + 1, 9);
		generateOre(ModBlocks.SMOKEY_QUARTZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 9, random.nextInt(3) + 1, 9);
		
		//Tier 4 Ores
		generateOre(ModBlocks.ABERNATHYITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 34, random.nextInt(3) + 2, 5);
		generateOre(ModBlocks.ABHURITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 24, 28, random.nextInt(3) + 1, 7);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) 
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
