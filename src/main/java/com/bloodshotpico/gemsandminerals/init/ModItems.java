package com.bloodshotpico.gemsandminerals.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.gemsandminerals.items.ItemBase;
import com.bloodshotpico.gemsandminerals.items.armor.ArmorBase;
import com.bloodshotpico.gemsandminerals.items.tools.ToolAxe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolHoe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolPickaxe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolSpade;
import com.bloodshotpico.gemsandminerals.items.tools.ToolSword;
import com.bloodshotpico.gemsandminerals.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tier 1 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 5, 1300, 7.5F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 5, 1000, 7.2F, 4.0F, 22);
	public static final ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 5, 900, 7.1F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 5, 1200, 7.2F, 2.0F, 22);
	
	//Tier 2 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_PHOSPHOPHYLLITE = EnumHelper.addToolMaterial("material_phosphophyllite", 6, 2100, 7.9F, 6.0F, 24);
	
	//Tier 3 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_ROSE_QUARTZ = EnumHelper.addToolMaterial("material_rose_quartz", 7, 3321, 8.0F, 9.0F, 28);
	public static final ToolMaterial MATERIAL_SMOKEY_QUARTZ = EnumHelper.addToolMaterial("material_smokey_quartz", 7, 3259, 8.4F, 8.0F, 28);
	
	//TIER 4 = ALL DUSTS GO IN HERE
	//Tier 4 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_ABERNATHYITE =  EnumHelper.addToolMaterial("material_abernathyite", 8, 4235, 8.8F, 11.0F, 30);
	public static final ToolMaterial MATERIAL_ABHURITE = EnumHelper.addToolMaterial("material_abhurite", 8, 4673, 8.5F, 9.2F, 30);
	
	//Tier 5 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	
	//Tier 6 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	
	//Tier 7 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	
	//Tier 8 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Tier 1 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 16,
			new int[] {4, 8, 10, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MOD_ID + ":amethyst", 14,
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TOPAZ = EnumHelper.addArmorMaterial("armor_material_topaz", Reference.MOD_ID + ":topaz", 14,
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Tier 2 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_PHOSPHOPHYLLITE = EnumHelper.addArmorMaterial("armor_material_phosphophyllite", Reference.MOD_ID + ":phosphophyllite", 18,
			new int[] {6, 10, 12, 6}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	
	//Tier 3 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_ROSE_QUARTZ = EnumHelper.addArmorMaterial("armor_material_rose_quartz", Reference.MOD_ID + ":rose_quartz", 14,
			new int[] {6, 9, 11, 5}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 9.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SMOKEY_QUARTZ = EnumHelper.addArmorMaterial("armor_material_smokey_quartz", Reference.MOD_ID + ":smokey_quartz", 15,
			new int[] {8, 11, 13, 8}, 17, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	//DUST ARMOURS
	//Tier 4 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_ABERNATHYITE = EnumHelper.addArmorMaterial("armor_material_abernathyite", Reference.MOD_ID + ":abernathyite", 18,
			new int[] {10, 12, 14, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 12.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ABHURITE = EnumHelper.addArmorMaterial("armor_material_abhurite", Reference.MOD_ID + ":abhurite", 19,
			new int[] {12, 13, 15, 12}, 21, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 13.0F);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Dusts
	public static final Item ABERNATHYITE_DUST = new ItemBase("abernathyite_dust");
	public static final Item ABHURITE_DUST =  new ItemBase("abhurite_dust");
	
	//Gems
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item PHOSPHOPHYLLITE = new ItemBase("phosphophyllite");
	public static final Item ROSE_QUARTZ = new ItemBase("rose_quartz");
	public static final Item SMOKEY_QUARTZ = new ItemBase("smokey_quartz");
	public static final Item ABHURITE = new ItemBase("abhurite");
	public static final Item ABERNATHYITE = new ItemBase("abernathyite");
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Armour
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////TIER 1 ARMOUR!!!!/////////////
	//Ruby Armour
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE =new  ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	//Sapphire Armour
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
	
	//Amethyst Armour
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);
	
	//Topaz Armour
	public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item TOPAZ_CHESTPLATE = new ArmorBase("topaz_chestplate", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item TOPAZ_LEGGINGS = new ArmorBase("topaz_leggings", ARMOR_MATERIAL_TOPAZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.FEET);
	//////////////////////////////////////
	
	///////TIER 2 ARMOUR!!!!/////////////
	//Phosphophyllite Armour
	public static final Item PHOSPHOPHYLLITE_HELMET = new ArmorBase("phosphophyllite_helmet", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item PHOSPHOPHYLLITE_CHESTPLATE = new ArmorBase("phosphophyllite_chestplate", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item PHOSPHOPHYLLITE_LEGGINGS = new ArmorBase("phosphophyllite_leggings", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item PHOSPHOPHYLLITE_BOOTS = new ArmorBase("phosphophyllite_boots", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.FEET);
	//////////////////////////////////////
	
	///////TIER 3 ARMOUR!!!!/////////////
	//Rose Quartz Armour
	public static final Item ROSE_QUARTZ_HELMET = new ArmorBase("rose_quartz_helmet", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROSE_QUARTZ_CHESTPLATE = new ArmorBase("rose_quartz_chestplate", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROSE_QUARTZ_LEGGINGS = new ArmorBase("rose_quartz_leggings", ARMOR_MATERIAL_ROSE_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item ROSE_QUARTZ_BOOTS = new ArmorBase("rose_quartz_boots", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.FEET);
	
	//Rose Quartz Armour
	public static final Item SMOKEY_QUARTZ_HELMET = new ArmorBase("smokey_quartz_helmet", ARMOR_MATERIAL_SMOKEY_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item SMOKEY_QUARTZ_CHESTPLATE = new ArmorBase("smokey_quartz_chestplate", ARMOR_MATERIAL_SMOKEY_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item SMOKEY_QUARTZ_LEGGINGS = new ArmorBase("smokey_quartz_leggings", ARMOR_MATERIAL_SMOKEY_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item SMOKEY_QUARTZ_BOOTS = new ArmorBase("smokey_quartz_boots", ARMOR_MATERIAL_SMOKEY_QUARTZ, 1, EntityEquipmentSlot.FEET);
	//////////////////////////////////////
	
	///////TIER 4 ARMOUR!!!!/////////////
	//Abernathyite Armour
	public static final Item ABERNATHYITE_HELMET = new ArmorBase("abernathyite_helmet", ARMOR_MATERIAL_ABERNATHYITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ABERNATHYITE_CHESTPLATE = new ArmorBase("abernathyite_chestplate", ARMOR_MATERIAL_ABERNATHYITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ABERNATHYITE_LEGGINGS = new ArmorBase("abernathyite_leggings", ARMOR_MATERIAL_ABERNATHYITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ABERNATHYITE_BOOTS = new ArmorBase("abernathyite_boots", ARMOR_MATERIAL_ABERNATHYITE, 1, EntityEquipmentSlot.FEET);
	
	//Abhurite Armour
	public static final Item ABHURITE_HELMET = new ArmorBase("abhurite_helmet", ARMOR_MATERIAL_ABHURITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item ABHURITE_CHESTPLATE = new ArmorBase("abhurite_chestplate", ARMOR_MATERIAL_ABHURITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item ABHURITE_LEGGINGS = new ArmorBase("abhurite_leggings", ARMOR_MATERIAL_ABHURITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item ABHURITE_BOOTS = new ArmorBase("abhurite_boots", ARMOR_MATERIAL_ABHURITE, 1, EntityEquipmentSlot.FEET);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//TOOLS
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////TIER 1 TOOLS!!!!/////////////
	//RubyTools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	//Sapphire Tools
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
	
	//Topaz Tools
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SHOVEL = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	
	//Amethyst Tools
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	//////////////////////////////////////
	
	///////TIER 2 TOOLS!!!!/////////////
	//Phosphophyllite Tools
	public static final ItemSword PHOSPHOPHYLLITE_SWORD = new ToolSword("phosphophyllite_sword", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemSpade PHOSPHOPHYLLITE_SHOVEL = new ToolSpade("phosphophyllite_shovel", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemPickaxe PHOSPHOPHYLLITE_PICKAXE = new ToolPickaxe("phosphophyllite_pickaxe", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemAxe PHOSPHOPHYLLITE_AXE = new ToolAxe("phosphophyllite_axe", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemHoe PHOSPHOPHYLLITE_HOE = new ToolHoe("phosphophyllite_hoe", MATERIAL_PHOSPHOPHYLLITE);
	//////////////////////////////////////
	
	///////TIER 3 TOOLS!!!!/////////////
	//Rose Quartz Tools
	public static final ItemSword ROSE_QUARTZ_SWORD = new ToolSword("rose_quartz_sword", MATERIAL_ROSE_QUARTZ);
	public static final ItemSpade ROSE_QUARTZ_SHOVEL = new ToolSpade("rose_quartz_shovel", MATERIAL_ROSE_QUARTZ);
	public static final ItemPickaxe ROSE_QUARTZ_PICKAXE = new ToolPickaxe("rose_quartz_pickaxe", MATERIAL_ROSE_QUARTZ);
	public static final ItemAxe ROSE_QUARTZ_AXE = new ToolAxe("rose_quartz_axe", MATERIAL_ROSE_QUARTZ);
	public static final ItemHoe ROSE_QUARTZ_HOE = new ToolHoe("rose_quartz_hoe", MATERIAL_ROSE_QUARTZ);
	
	//Smokey Quartz Tools
	public static final ItemSword SMOKEY_QUARTZ_SWORD = new ToolSword("smokey_quartz_sword", MATERIAL_SMOKEY_QUARTZ);
	public static final ItemSpade SMOKEY_QUARTZ_SHOVEL = new ToolSpade("smokey_quartz_shovel", MATERIAL_SMOKEY_QUARTZ);
	public static final ItemPickaxe SMOKEY_QUARTZ_PICKAXE = new ToolPickaxe("smokey_quartz_pickaxe", MATERIAL_SMOKEY_QUARTZ);
	public static final ItemAxe SMOKEY_QUARTZ_AXE = new ToolAxe("smokey_quartz_axe", MATERIAL_SMOKEY_QUARTZ);
	public static final ItemHoe SMOKEY_QUARTZ_HOW = new ToolHoe("smokey_quartz_hoe", MATERIAL_SMOKEY_QUARTZ);
	//////////////////////////////////////
	
	///////TIER 4 TOOLS!!!!/////////////
	//Abernathyite Tools
	public static final ItemSword ABERNATHYITE_SWORD = new ToolSword("abernathyite_sword", MATERIAL_ABERNATHYITE);
	public static final ItemSpade ABERNATHYITE_SHOVEL = new ToolSpade("abernathyite_shovel", MATERIAL_ABERNATHYITE);
	public static final ItemPickaxe ABERNATHYITE_PICKAXE = new ToolPickaxe("abernathyite_pickaxe", MATERIAL_ABERNATHYITE);
	public static final ItemAxe ABERNATHYITE_AXE = new ToolAxe("abernathyite_axe", MATERIAL_ABERNATHYITE);
	public static final ItemHoe ABERNATHYITE_HOE = new ToolHoe("abernathyite_hoe", MATERIAL_ABERNATHYITE);
	
	//Abhurite Tools
	public static final ItemSword ABHURITE_SWORD = new ToolSword("abhurite_sword", MATERIAL_ABHURITE);
	public static final ItemSpade ABHURITE_SHOVEL = new ToolSpade("abhurite_shovel", MATERIAL_ABHURITE);
	public static final ItemPickaxe ABHURITE_PICKAXE = new ToolPickaxe("abhurite_pickaxe", MATERIAL_ABHURITE);
	public static final ItemAxe ABHURITE_AXE = new ToolAxe("abhurite_axe", MATERIAL_ABHURITE);
	public static final ItemHoe ABHURITE_HOE = new ToolHoe("abhurite_hoe", MATERIAL_ABHURITE);
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
