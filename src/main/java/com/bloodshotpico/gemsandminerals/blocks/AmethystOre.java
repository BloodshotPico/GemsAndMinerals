package com.bloodshotpico.gemsandminerals.blocks;

import java.util.Random;

import com.bloodshotpico.gemsandminerals.Main;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AmethystOre extends BlockBase
{
	public AmethystOre(String name, Material material) 
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
	
	//Magma 
	/*public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	    {
	        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase)
	        {
	            entityIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);
	        }

	        super.onEntityWalk(worldIn, pos, entityIn);
	    }*/
	
	//Item Drop
		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) 
		{
			return ModItems.AMETHYST;
		}
		
		@Override
		public int quantityDropped(Random rand) 
		{
			int max = 1;
			int min = 1;
			return rand.nextInt(max) + min;
		}
}
