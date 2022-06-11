package com.mzoj.mzojPaint.core.init;

import com.mzoj.mzojPaint.Main;

import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	
	
	static int paintbucketDurability = 64;
	
	//make the thing that does item.register i think
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Main.MOD_ID);
	
	//create the item and give it its properties

	
	//block items
	
	
	//white painted plank
	public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_PLANK = ITEMS.register("white_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//wallpaper
	public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_BLOCK = ITEMS.register("wallpaper_block", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_BLOCK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//red
	public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_PLANK = ITEMS.register("red_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//black
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_PLANK = ITEMS.register("black_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

	//brown
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_PLANK = ITEMS.register("brown_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//cyan
	public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_PLANK = ITEMS.register("cyan_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//gray
	public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_PLANK = ITEMS.register("gray_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//green
	public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_PLANK = ITEMS.register("green_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//light lbue
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_PLANK = ITEMS.register("light_blue_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//light gray
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_PLANK = ITEMS.register("light_gray_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//lime
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_PLANK = ITEMS.register("lime_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//magenta
	public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_PLANK = ITEMS.register("magenta_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//orange
	public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_PLANK = ITEMS.register("orange_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//pink
	public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_PLANK = ITEMS.register("pink_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	 
	//purple
	public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_PLANK = ITEMS.register("purple_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//yellow
	public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_PLANK = ITEMS.register("yellow_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_PLANK = ITEMS.register("blue_plank", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_PLANK.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_SLAB = ITEMS.register("blue_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_SLAB = ITEMS.register("black_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_SLAB = ITEMS.register("brown_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_SLAB = ITEMS.register("cyan_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//paper slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_SLAB = ITEMS.register("light_gray_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_SLAB = ITEMS.register("gray_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_SLAB = ITEMS.register("green_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_SLAB = ITEMS.register("light_blue_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	//paper slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_SLAB = ITEMS.register("lime_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_SLAB = ITEMS.register("magenta_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_SLAB = ITEMS.register("orange_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_SLAB = ITEMS.register("pink_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//paper slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> PAPER_SLAB = ITEMS.register("paper_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.PAPER_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_SLAB = ITEMS.register("white_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_SLAB = ITEMS.register("yellow_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//blue slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_SLAB = ITEMS.register("red_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	//paper slab
	public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_SLAB = ITEMS.register("purple_slab", 
			() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_SLAB.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//paper stair
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_STAIR = ITEMS.register("wallpaper_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_STAIR = ITEMS.register("blue_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_STAIR = ITEMS.register("brown_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_STAIR = ITEMS.register("cyan_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_STAIR = ITEMS.register("gray_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_STAIR = ITEMS.register("green_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_STAIR = ITEMS.register("light_blue_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_STAIR = ITEMS.register("light_gray_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
			
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_STAIR = ITEMS.register("lime_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_STAIR = ITEMS.register("magenta_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_STAIR = ITEMS.register("orange_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_STAIR = ITEMS.register("pink_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_STAIR = ITEMS.register("purple_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_STAIR = ITEMS.register("red_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_STAIR = ITEMS.register("white_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
			
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_STAIR = ITEMS.register("yellow_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_STAIR = ITEMS.register("black_stair", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_STAIR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
			
	//DOORS
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PAPER_DOOR = ITEMS.register("paper_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PAPER_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_DOOR = ITEMS.register("red_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_DOOR = ITEMS.register("black_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_DOOR = ITEMS.register("brown_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_DOOR = ITEMS.register("cyan_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_DOOR = ITEMS.register("blue_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_DOOR = ITEMS.register("gray_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_DOOR = ITEMS.register("green_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_DOOR = ITEMS.register("light_blue_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_DOOR = ITEMS.register("light_gray_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_DOOR = ITEMS.register("lime_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_DOOR = ITEMS.register("magenta_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_DOOR = ITEMS.register("orange_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_DOOR = ITEMS.register("pink_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_DOOR = ITEMS.register("white_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_DOOR = ITEMS.register("yellow_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_DOOR = ITEMS.register("purple_door", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_DOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//TRAPDOORS
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PAPER_TRAPDOOR = ITEMS.register("paper_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PAPER_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_TRAPDOOR = ITEMS.register("red_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_TRAPDOOR = ITEMS.register("black_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_TRAPDOOR = ITEMS.register("brown_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_TRAPDOOR = ITEMS.register("cyan_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_TRAPDOOR = ITEMS.register("blue_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_TRAPDOOR = ITEMS.register("gray_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_TRAPDOOR = ITEMS.register("green_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_TRAPDOOR = ITEMS.register("light_blue_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_TRAPDOOR = ITEMS.register("light_gray_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_TRAPDOOR = ITEMS.register("lime_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_TRAPDOOR = ITEMS.register("magenta_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_TRAPDOOR = ITEMS.register("orange_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_TRAPDOOR = ITEMS.register("pink_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_TRAPDOOR = ITEMS.register("white_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_TRAPDOOR = ITEMS.register("yellow_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_TRAPDOOR = ITEMS.register("purple_trapdoor", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_TRAPDOOR.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		//pressure plates
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_PLATE = ITEMS.register("wallpaper_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_PLATE = ITEMS.register("red_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_PLATE = ITEMS.register("black_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_PLATE = ITEMS.register("brown_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_PLATE = ITEMS.register("cyan_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_PLATE = ITEMS.register("blue_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_PLATE = ITEMS.register("gray_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_PLATE = ITEMS.register("green_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_PLATE = ITEMS.register("light_blue_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_PLATE = ITEMS.register("light_gray_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_PLATE = ITEMS.register("lime_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_PLATE = ITEMS.register("magenta_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_PLATE = ITEMS.register("orange_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_PLATE = ITEMS.register("pink_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_PLATE = ITEMS.register("white_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_PLATE = ITEMS.register("yellow_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_PLATE = ITEMS.register("purple_plate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_PLATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
	//fences
		//////////////////////////////////////////////////////////////////////////////////////////
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_FENCE = ITEMS.register("wallpaper_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_FENCE = ITEMS.register("red_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_FENCE = ITEMS.register("black_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_FENCE = ITEMS.register("brown_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_FENCE = ITEMS.register("cyan_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_FENCE = ITEMS.register("blue_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_FENCE = ITEMS.register("gray_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_FENCE = ITEMS.register("green_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_FENCE = ITEMS.register("light_blue_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_FENCE = ITEMS.register("light_gray_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_FENCE = ITEMS.register("lime_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_FENCE = ITEMS.register("magenta_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_FENCE = ITEMS.register("orange_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_FENCE = ITEMS.register("pink_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_FENCE = ITEMS.register("white_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_FENCE = ITEMS.register("yellow_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_FENCE = ITEMS.register("purple_fence", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_FENCE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		//buttons///////////////////////////////////
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_BUTTON = ITEMS.register("wallpaper_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_BUTTON = ITEMS.register("red_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_BUTTON = ITEMS.register("black_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_BUTTON = ITEMS.register("brown_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_BUTTON = ITEMS.register("cyan_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_BUTTON = ITEMS.register("blue_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_BUTTON = ITEMS.register("gray_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_BUTTON = ITEMS.register("green_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_BUTTON = ITEMS.register("light_blue_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_BUTTON = ITEMS.register("light_gray_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_BUTTON = ITEMS.register("lime_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_BUTTON = ITEMS.register("magenta_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_BUTTON = ITEMS.register("orange_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_BUTTON = ITEMS.register("pink_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_BUTTON = ITEMS.register("white_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_BUTTON = ITEMS.register("yellow_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_BUTTON = ITEMS.register("purple_button", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_BUTTON.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		
	///////////////////////////////////////////////////////////////////////////////
		//fence gates
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WALLPAPER_GATE = ITEMS.register("wallpaper_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WALLPAPER_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> RED_GATE = ITEMS.register("red_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.RED_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLACK_GATE = ITEMS.register("black_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLACK_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> BROWN_GATE = ITEMS.register("brown_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BROWN_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> CYAN_GATE = ITEMS.register("cyan_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.CYAN_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));

		public static final RegistryObject<net.minecraft.world.item.BlockItem> BLUE_GATE = ITEMS.register("blue_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.BLUE_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GRAY_GATE = ITEMS.register("gray_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GRAY_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> GREEN_GATE = ITEMS.register("green_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.GREEN_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_BLUE_GATE = ITEMS.register("light_blue_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_BLUE_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIGHT_GRAY_GATE = ITEMS.register("light_gray_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIGHT_GRAY_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> LIME_GATE = ITEMS.register("lime_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.LIME_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> MAGENTA_GATE = ITEMS.register("magenta_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.MAGENTA_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> ORANGE_GATE = ITEMS.register("orange_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.ORANGE_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PINK_GATE = ITEMS.register("pink_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PINK_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> WHITE_GATE = ITEMS.register("white_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.WHITE_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> YELLOW_GATE = ITEMS.register("yellow_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.YELLOW_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		public static final RegistryObject<net.minecraft.world.item.BlockItem> PURPLE_GATE = ITEMS.register("purple_gate", 
				() -> new net.minecraft.world.item.BlockItem(BlockInit.PURPLE_GATE.get(), new Item.Properties().tab(Main.PAINTABLE_PLANKS)));
		
		//SIGNSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> WALLPAPER_SIGN = ITEMS.register("wallpaper_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.WALLPAPER_SIGN.get(),
						BlockInit.WALLPAPER_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> RED_SIGN = ITEMS.register("red_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.RED_SIGN.get(),
						BlockInit.RED_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> BLACK_SIGN = ITEMS.register("black_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.BLACK_SIGN.get(),
						BlockInit.BLACK_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> BROWN_SIGN = ITEMS.register("brown_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.BROWN_SIGN.get(),
						BlockInit.BROWN_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> CYAN_SIGN = ITEMS.register("cyan_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.CYAN_SIGN.get(),
						BlockInit.CYAN_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> BLUE_SIGN = ITEMS.register("blue_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.BLUE_SIGN.get(),
						BlockInit.BLUE_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> GRAY_SIGN = ITEMS.register("gray_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.GRAY_SIGN.get(),
						BlockInit.GRAY_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> GREEN_SIGN = ITEMS.register("green_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.GREEN_SIGN.get(),
						BlockInit.GREEN_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> LIGHT_BLUE_SIGN = ITEMS.register("light_blue_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.LIGHT_BLUE_SIGN.get(),
						BlockInit.LIGHT_BLUE_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> LIGHT_GRAY_SIGN = ITEMS.register("light_gray_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.LIGHT_GRAY_SIGN.get(),
						BlockInit.LIGHT_GRAY_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> LIME_SIGN = ITEMS.register("lime_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.LIME_SIGN.get(),
						BlockInit.LIME_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> MAGENTA_SIGN = ITEMS.register("magenta_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.MAGENTA_SIGN.get(),
						BlockInit.MAGENTA_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> ORANGE_SIGN = ITEMS.register("orange_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.ORANGE_SIGN.get(),
						BlockInit.ORANGE_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> PINK_SIGN = ITEMS.register("pink_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.PINK_SIGN.get(),
						BlockInit.PINK_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> WHITE_SIGN = ITEMS.register("white_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.WHITE_SIGN.get(),
						BlockInit.WHITE_WALLSIGN.get()));
				
		public static final RegistryObject<net.minecraft.world.item.SignItem> YELLOW_SIGN = ITEMS.register("yellow_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.YELLOW_SIGN.get(),
						BlockInit.YELLOW_WALLSIGN.get()));
		
		public static final RegistryObject<net.minecraft.world.item.SignItem> PURPLE_SIGN = ITEMS.register("purple_sign", 
				() -> new net.minecraft.world.item.SignItem(new Item.Properties().tab(Main.PAINTABLE_PLANKS), 
						BlockInit.PURPLE_SIGN.get(),
						BlockInit.PURPLE_WALLSIGN.get()));
		
		
		
		//////////////////////////////
		
		
	//empty bucket
	public static final RegistryObject<Item> PAINTBUCKET = ITEMS.register("paintbucket", () -> new Item(new Item.Properties().stacksTo(16)));

	//white paint
	public static final RegistryObject<Item> WHITE_PAINT = ITEMS.register("white_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
		
	//red paint
	public static final RegistryObject<Item> RED_PAINT = ITEMS.register("red_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
	
	//white paint
	public static final RegistryObject<Item> BLACK_PAINT = ITEMS.register("black_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> BROWN_PAINT = ITEMS.register("brown_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
		
	//cyan paint
	public static final RegistryObject<Item> CYAN_PAINT = ITEMS.register("cyan_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> GRAY_PAINT = ITEMS.register("gray_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> GREEN_PAINT = ITEMS.register("green_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> LIGHT_BLUE_PAINT = ITEMS.register("light_blue_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));

	//red paint
	public static final RegistryObject<Item> LIGHT_GRAY_PAINT = ITEMS.register("light_gray_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> LIME_PAINT = ITEMS.register("lime_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> MAGENTA_PAINT = ITEMS.register("magenta_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> ORANGE_PAINT = ITEMS.register("orange_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> PINK_PAINT = ITEMS.register("pink_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> PURPLE_PAINT = ITEMS.register("purple_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
			
	//red paint
	public static final RegistryObject<Item> YELLOW_PAINT = ITEMS.register("yellow_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));
	
	//blue paint
	public static final RegistryObject<Item> BLUE_PAINT = ITEMS.register("blue_paint", () -> new Item(new Item.Properties().stacksTo(1).durability(paintbucketDurability).defaultDurability(paintbucketDurability).setNoRepair().tab(Main.PAINTABLE_PLANKS)));

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//blue
	public static final RegistryObject<Item> BLUE_PAINTBRUSH = ITEMS.register("blue_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));

	//normal paintbrush
	public static final RegistryObject<Item> PAINTBRUSH = ITEMS.register("paintbrush", () -> new Item(new Item.Properties().stacksTo(1).tab(Main.PAINTABLE_PLANKS)));

	//white paintbrush
	public static final RegistryObject<Item> WHITE_PAINTBRUSH = ITEMS.register("white_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));

	//red paintbrush
	public static final RegistryObject<Item> RED_PAINTBRUSH = ITEMS.register("red_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> YELLOW_PAINTBRUSH = ITEMS.register("yellow_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> PURPLE_PAINTBRUSH = ITEMS.register("purple_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> PINK_PAINTBRUSH = ITEMS.register("pink_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));

	//red paintbrush
	public static final RegistryObject<Item> ORANGE_PAINTBRUSH = ITEMS.register("orange_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> MAGENTA_PAINTBRUSH = ITEMS.register("magenta_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> LIME_PAINTBRUSH = ITEMS.register("lime_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> LIGHT_GRAY_PAINTBRUSH = ITEMS.register("light_gray_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> LIGHT_BLUE_PAINTBRUSH = ITEMS.register("light_blue_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> GREEN_PAINTBRUSH = ITEMS.register("green_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrushItem
	public static final RegistryObject<Item> GRAY_PAINTBRUSH = ITEMS.register("gray_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> BLACK_PAINTBRUSH = ITEMS.register("black_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> BROWN_PAINTBRUSH = ITEMS.register("brown_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	
	//red paintbrush
	public static final RegistryObject<Item> CYAN_PAINTBRUSH = ITEMS.register("cyan_paintbrush", () -> new Item(new Item.Properties().stacksTo(1)));
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//paint scraper
	public static final RegistryObject<Item> PAINT_SCRAPER = ITEMS.register("paint_scraper", () -> new Item(new Item.Properties().stacksTo(1).tab(Main.PAINTABLE_PLANKS)));


}