package com.bloodshotpico.gemsandminerals.blocks;

import java.util.Random;

import com.bloodshotpico.gemsandminerals.Main;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase
{
	public RubyOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(Main.MainTab);
		
		//Sets the Light Level (Makes the block emit light)
		//setLightLevel(1.0F);
		
		//Sets the Opacity Level (Makes the block like glass)
		//setLightOpacity(1);
		
		//Makes the block unbreakable
		//setBlockUnbreakable();
	}
	
	//Item Drop
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.RUBY;
	}
	
	@Override
	public int quantityDropped(Random rand) 
	{
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}

