package com.bloodshotpico.gemsandminerals.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.gemsandminerals.blocks.AmethystBlock;
import com.bloodshotpico.gemsandminerals.blocks.AmethystOre;
import com.bloodshotpico.gemsandminerals.blocks.BlockBase;
import com.bloodshotpico.gemsandminerals.blocks.PhosphophylliteBlock;
import com.bloodshotpico.gemsandminerals.blocks.PhosphophylliteOre;
import com.bloodshotpico.gemsandminerals.blocks.RoseQuartzBlock;
import com.bloodshotpico.gemsandminerals.blocks.RoseQuartzOre;
import com.bloodshotpico.gemsandminerals.blocks.RubyBlock;
import com.bloodshotpico.gemsandminerals.blocks.RubyOre;
import com.bloodshotpico.gemsandminerals.blocks.SapphireBlock;
import com.bloodshotpico.gemsandminerals.blocks.SapphireOre;
import com.bloodshotpico.gemsandminerals.blocks.SmokeyQuartzBlock;
import com.bloodshotpico.gemsandminerals.blocks.SmokeyQuartzOre;
import com.bloodshotpico.gemsandminerals.blocks.TopazBlock;
import com.bloodshotpico.gemsandminerals.blocks.TopazOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	public static final Block TOPAZ_ORE = new TopazOre("topaz_ore", Material.ROCK);
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block PHOSPHOPHYLLITE_ORE = new PhosphophylliteOre("phosphophyllite_ore", Material.ROCK);
	public static final Block ROSE_QUARTZ_ORE = new RoseQuartzOre("rose_quartz_ore", Material.ROCK);
	public static final Block SMOKEY_QUARTZ_ORE = new SmokeyQuartzOre("smokey_quartz_ore", Material.IRON);
	
	//Gem Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON);
	public static final Block TOPAZ_BLOCK = new TopazBlock("topaz_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new AmethystBlock("amethyst_block", Material.IRON);
	public static final Block PHOSPHOPHYLLITE_BLOCK = new PhosphophylliteBlock("phosphophyllite_block", Material.IRON);
	public static final Block ROSE_QUARTZ_BLOCK = new RoseQuartzBlock("rose_quartz_block", Material.IRON);
	public static final Block SMOKEY_QUARTZ_BLOCK = new SmokeyQuartzBlock("smokey_quartz_block", Material.IRON);
}
