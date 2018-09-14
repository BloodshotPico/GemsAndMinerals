package com.bloodshotpico.gemsandminerals.blocks;

import com.bloodshotpico.gemsandminerals.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SapphireBlock extends BlockBase
{

	public SapphireBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.BlocksTab);
		
		//Sets the Light Level (Makes the block emit light)
		//setLightLevel(1.0F);
		
		//Sets the Opacity Level (Makes the block like glass)
		//setLightOpacity(1);
		
		//Makes the block unbreakable
		//setBlockUnbreakable();
	}

}
