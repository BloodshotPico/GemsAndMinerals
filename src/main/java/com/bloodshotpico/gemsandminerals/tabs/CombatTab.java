package com.bloodshotpico.gemsandminerals.tabs;

import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CombatTab extends CreativeTabs
{
	public CombatTab() 
	{
		super("gamarmour");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY_SWORD);
	}
}
