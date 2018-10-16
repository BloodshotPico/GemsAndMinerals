package com.bloodshotpico.gemsandminerals.blocks;

import com.bloodshotpico.gemsandminerals.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AbernathyiteBlock extends BlockBase
{

	public AbernathyiteBlock(String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 5);
		setCreativeTab(Main.BlocksTab);
		
		//Sets the Light Level (Makes the block emit light)
		//setLightLevel(1.0F);
				
		//Sets the Opacity Level (Makes the block like glass)
		//setLightOpacity(1);
				
		//Makes the block unbreakable
		//setBlockUnbreakable();
	}
	
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	{
		if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase)
		{
			entityIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);
		}
		
		super.onEntityWalk(worldIn, pos, entityIn);
	}
	
}
