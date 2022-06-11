package com.mzoj.mzojPaint.core.init;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.common.blocks.wallpaper;
import com.mzoj.mzojPaint.common.blocks.wallpaperbuttons;
import com.mzoj.mzojPaint.common.blocks.wallpaperdoors;
import com.mzoj.mzojPaint.common.blocks.wallpaperfences;
import com.mzoj.mzojPaint.common.blocks.wallpapergates;
import com.mzoj.mzojPaint.common.blocks.wallpaperplates;
import com.mzoj.mzojPaint.common.blocks.wallpapersign;
import com.mzoj.mzojPaint.common.blocks.paintedbuttons;
import com.mzoj.mzojPaint.common.blocks.painteddoors;
import com.mzoj.mzojPaint.common.blocks.paintedfences;
import com.mzoj.mzojPaint.common.blocks.paintedgates;
import com.mzoj.mzojPaint.common.blocks.paintedplanks;
import com.mzoj.mzojPaint.common.blocks.paintedplates;
import com.mzoj.mzojPaint.common.blocks.paintedsign;
import com.mzoj.mzojPaint.common.blocks.paintedsign;
import com.mzoj.mzojPaint.common.blocks.paintedslabs;
import com.mzoj.mzojPaint.common.blocks.paintedstairs;
import com.mzoj.mzojPaint.common.blocks.paintedtrapdoors;
import com.mzoj.mzojPaint.common.blocks.paintedwallsign;
import com.mzoj.mzojPaint.common.blocks.wallpaperslabs;
import com.mzoj.mzojPaint.common.blocks.wallpaperstairs;
import com.mzoj.mzojPaint.common.blocks.wallpapertrapdoors;
import com.mzoj.mzojPaint.common.blocks.wallpaperwallsign;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
	
	//make the blocks
	//poop block
	//public static final RegistryObject<Block> WALLPAPER = BLOCKS.register("wallpaper", () -> 
	//new Block(AbstractBlock.Properties.of(Material.SPONGE, MaterialColor.COLOR_BROWN)
	//		
	//		.sound(SoundType.CROP)
	//		.strength(1, 1)
	//		));
	
	//wallpaper
	public static final RegistryObject<wallpaper> WALLPAPER_BLOCK = BLOCKS.register("wallpaper_block", () -> 
	new wallpaper(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			
			));
	
	//wallpaper slab
	//public static final RegistryObject<wallpaper_slab> WALLPAPER_SLAB = BLOCKS.register("wallpaper_slab", () -> 
	//new wallpaper_slab(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
	//		 //it does not drop when it breaks with fist plz help
	//		.sound(SoundType.WOOD)
	//		.strength(2,2)
	//		));

	
	//blue plank
	public static final RegistryObject<paintedplanks> BLUE_PLANK = BLOCKS.register("blue_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//white plank
	public static final RegistryObject<paintedplanks> WHITE_PLANK = BLOCKS.register("white_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//red plank
	public static final RegistryObject<paintedplanks> RED_PLANK = BLOCKS.register("red_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//yellow plank
	public static final RegistryObject<paintedplanks> YELLOW_PLANK = BLOCKS.register("yellow_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//purple plank
	public static final RegistryObject<paintedplanks> PURPLE_PLANK = BLOCKS.register("purple_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//pink plank
	public static final RegistryObject<paintedplanks> PINK_PLANK = BLOCKS.register("pink_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//orange plank
	public static final RegistryObject<paintedplanks> ORANGE_PLANK = BLOCKS.register("orange_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//magenta plank
	public static final RegistryObject<paintedplanks> MAGENTA_PLANK = BLOCKS.register("magenta_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//lime plank
	public static final RegistryObject<paintedplanks> LIME_PLANK = BLOCKS.register("lime_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//light gray plank
	public static final RegistryObject<paintedplanks> LIGHT_GRAY_PLANK = BLOCKS.register("light_gray_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//light blue plank
	public static final RegistryObject<paintedplanks> LIGHT_BLUE_PLANK = BLOCKS.register("light_blue_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//green plank
	public static final RegistryObject<paintedplanks> GREEN_PLANK = BLOCKS.register("green_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//gray plank
	public static final RegistryObject<paintedplanks> GRAY_PLANK = BLOCKS.register("gray_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//cyan plank
	public static final RegistryObject<paintedplanks> CYAN_PLANK = BLOCKS.register("cyan_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//brown plank
	public static final RegistryObject<paintedplanks> BROWN_PLANK = BLOCKS.register("brown_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//black plank
	public static final RegistryObject<paintedplanks> BLACK_PLANK = BLOCKS.register("black_plank", () -> 
	new paintedplanks(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	/////////////////////////////////////////////////////////////////////////////////
	//////SLABS
	// plank paper
	public static final RegistryObject<wallpaperslabs> PAPER_SLAB = BLOCKS.register("paper_slab", () -> 
	new wallpaperslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//blue plank
	public static final RegistryObject<paintedslabs> BLUE_SLAB = BLOCKS.register("blue_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//black plank
	public static final RegistryObject<paintedslabs> BLACK_SLAB = BLOCKS.register("black_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//brown plank
	public static final RegistryObject<paintedslabs> BROWN_SLAB = BLOCKS.register("brown_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//cyan plank
	public static final RegistryObject<paintedslabs> CYAN_SLAB = BLOCKS.register("cyan_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//blue plank
	public static final RegistryObject<paintedslabs> GRAY_SLAB = BLOCKS.register("gray_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//black plank
	public static final RegistryObject<paintedslabs> GREEN_SLAB = BLOCKS.register("green_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//brown plank
	public static final RegistryObject<paintedslabs> LIGHT_BLUE_SLAB = BLOCKS.register("light_blue_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//cyan plank
	public static final RegistryObject<paintedslabs> LIGHT_GRAY_SLAB = BLOCKS.register("light_gray_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//blue plank
	public static final RegistryObject<paintedslabs> LIME_SLAB = BLOCKS.register("lime_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//black plank
	public static final RegistryObject<paintedslabs> MAGENTA_SLAB = BLOCKS.register("magenta_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//brown plank
	public static final RegistryObject<paintedslabs> ORANGE_SLAB = BLOCKS.register("orange_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//cyan plank
	public static final RegistryObject<paintedslabs> PINK_SLAB = BLOCKS.register("pink_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//blue plank
	public static final RegistryObject<paintedslabs> PURPLE_SLAB = BLOCKS.register("purple_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//black plank
	public static final RegistryObject<paintedslabs> WHITE_SLAB = BLOCKS.register("white_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//brown plank
	public static final RegistryObject<paintedslabs> RED_SLAB = BLOCKS.register("red_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	//cyan plank
	public static final RegistryObject<paintedslabs> YELLOW_SLAB = BLOCKS.register("yellow_slab", () -> 
	new paintedslabs(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	 /////////////////////////////////////////////////////////////////////////////////
	//////STAIRS
	// plank paper	
	
	public static final RegistryObject<Block> PROPERTY_BLOCK = BLOCKS.register("property_block", () -> 
	new Block(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	/////////////////////////////////////////////////////////////////////////////////////
	///////SIGNS
	
	//////////////////////////////////////////////////////////////////////////////////
	/////DOORS

	
	public static final RegistryObject<wallpaperdoors> PAPER_DOOR = BLOCKS.register("paper_door", () -> 
	new wallpaperdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> RED_DOOR = BLOCKS.register("red_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> BLACK_DOOR = BLOCKS.register("black_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> BROWN_DOOR = BLOCKS.register("brown_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> CYAN_DOOR = BLOCKS.register("cyan_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> GRAY_DOOR = BLOCKS.register("gray_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> GREEN_DOOR = BLOCKS.register("green_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> LIGHT_BLUE_DOOR = BLOCKS.register("light_blue_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> LIGHT_GRAY_DOOR = BLOCKS.register("light_gray_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> LIME_DOOR = BLOCKS.register("lime_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> MAGENTA_DOOR = BLOCKS.register("magenta_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> ORANGE_DOOR = BLOCKS.register("orange_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> PINK_DOOR = BLOCKS.register("pink_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> WHITE_DOOR = BLOCKS.register("white_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> BLUE_DOOR = BLOCKS.register("blue_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> YELLOW_DOOR = BLOCKS.register("yellow_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<painteddoors> PURPLE_DOOR = BLOCKS.register("purple_door", () -> 
	new painteddoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////
	///TRAPDOORS
	public static final RegistryObject<wallpapertrapdoors> PAPER_TRAPDOOR = BLOCKS.register("paper_trapdoor", () -> 
	new wallpapertrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> RED_TRAPDOOR = BLOCKS.register("red_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> BLACK_TRAPDOOR = BLOCKS.register("black_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> BROWN_TRAPDOOR = BLOCKS.register("brown_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> CYAN_TRAPDOOR = BLOCKS.register("cyan_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> GRAY_TRAPDOOR = BLOCKS.register("gray_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> GREEN_TRAPDOOR = BLOCKS.register("green_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> LIGHT_BLUE_TRAPDOOR = BLOCKS.register("light_blue_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> LIGHT_GRAY_TRAPDOOR = BLOCKS.register("light_gray_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> LIME_TRAPDOOR = BLOCKS.register("lime_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> MAGENTA_TRAPDOOR = BLOCKS.register("magenta_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> ORANGE_TRAPDOOR = BLOCKS.register("orange_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> PINK_TRAPDOOR = BLOCKS.register("pink_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> WHITE_TRAPDOOR = BLOCKS.register("white_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> BLUE_TRAPDOOR = BLOCKS.register("blue_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> YELLOW_TRAPDOOR = BLOCKS.register("yellow_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	public static final RegistryObject<paintedtrapdoors> PURPLE_TRAPDOOR = BLOCKS.register("purple_trapdoor", () -> 
	new paintedtrapdoors(Block.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE)
			 //it does not drop when it breaks with fist plz help
			.sound(SoundType.WOOD)
			.strength(2,2)
			));
	
	///////////////////////////////////////////////////////////////////////
	//SIGNS
	
	//WALL SIGNS
	

	
	public static final RegistryObject<wallpaperwallsign> WALLPAPER_WALLSIGN = BLOCKS.register("wallpaper_wallsign", () -> 
	new wallpaperwallsign(Block.Properties.copy(BlockInit.WALLPAPER_BLOCK.get()), WoodTypeInit.WALLPAPER_WOOD));

	// blue paper	
	public static final RegistryObject<paintedwallsign> BLUE_WALLSIGN = BLOCKS.register("blue_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BLUE_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedwallsign> BROWN_WALLSIGN = BLOCKS.register("brown_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BROWN_WOOD));

	// blue paper	
	public static final RegistryObject<paintedwallsign> CYAN_WALLSIGN = BLOCKS.register("cyan_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.CYAN_WOOD));

	// plank paper	
	public static final RegistryObject<paintedwallsign> GRAY_WALLSIGN = BLOCKS.register("gray_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.GRAY_WOOD));

	// blue paper	
	public static final RegistryObject<paintedwallsign> GREEN_WALLSIGN = BLOCKS.register("green_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.GREEN_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedwallsign> LIGHT_BLUE_WALLSIGN = BLOCKS.register("light_blue_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIGHT_BLUE_WOOD));

	// plank paper	
	public static final RegistryObject<paintedwallsign> LIGHT_GRAY_WALLSIGN = BLOCKS.register("light_gray_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIGHT_GRAY_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedwallsign> LIME_WALLSIGN = BLOCKS.register("lime_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIME_WOOD));

	// plank paper	
	public static final RegistryObject<paintedwallsign> MAGENTA_WALLSIGN = BLOCKS.register("magenta_wallsign", () -> 
	new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.MAGENTA_WOOD));
	
	// plank paper	
		public static final RegistryObject<paintedwallsign> BLACK_WALLSIGN = BLOCKS.register("black_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BLACK_WOOD));
	
	// plank paper	
		public static final RegistryObject<paintedwallsign> ORANGE_WALLSIGN = BLOCKS.register("orange_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.ORANGE_WOOD));

		// blue paper	
		public static final RegistryObject<paintedwallsign> PINK_WALLSIGN = BLOCKS.register("pink_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.PINK_WOOD));
		
		// plank paper	
		public static final RegistryObject<paintedwallsign> PURPLE_WALLSIGN = BLOCKS.register("purple_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.PURPLE_WOOD));

		// plank paper	
		public static final RegistryObject<paintedwallsign> RED_WALLSIGN = BLOCKS.register("red_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.RED_WOOD));
		
		// plank paper	
		public static final RegistryObject<paintedwallsign> WHITE_WALLSIGN = BLOCKS.register("white_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.WHITE_WOOD));

		// plank paper	
		public static final RegistryObject<paintedwallsign> YELLOW_WALLSIGN = BLOCKS.register("yellow_wallsign", () -> 
		new paintedwallsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.YELLOW_WOOD));
		
	
	
	//STANDING SIGNS
	
	public static final RegistryObject<wallpapersign> WALLPAPER_SIGN = BLOCKS.register("wallpaper_sign", () -> 
	new wallpapersign(Block.Properties.copy(BlockInit.WALLPAPER_BLOCK.get()), WoodTypeInit.WALLPAPER_WOOD));

	// blue paper	
	public static final RegistryObject<paintedsign> BLUE_SIGN = BLOCKS.register("blue_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BLUE_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedsign> BROWN_SIGN = BLOCKS.register("brown_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BROWN_WOOD));

	// blue paper	
	public static final RegistryObject<paintedsign> CYAN_SIGN = BLOCKS.register("cyan_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.CYAN_WOOD));

	// plank paper	
	public static final RegistryObject<paintedsign> GRAY_SIGN = BLOCKS.register("gray_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.GRAY_WOOD));

	// blue paper	
	public static final RegistryObject<paintedsign> GREEN_SIGN = BLOCKS.register("green_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.GREEN_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedsign> LIGHT_BLUE_SIGN = BLOCKS.register("light_blue_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIGHT_BLUE_WOOD));

	// plank paper	
	public static final RegistryObject<paintedsign> LIGHT_GRAY_SIGN = BLOCKS.register("light_gray_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIGHT_GRAY_WOOD));
	
	// plank paper	
	public static final RegistryObject<paintedsign> LIME_SIGN = BLOCKS.register("lime_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.LIME_WOOD));

	// plank paper	
	public static final RegistryObject<paintedsign> MAGENTA_SIGN = BLOCKS.register("magenta_sign", () -> 
	new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.MAGENTA_WOOD));
	
	// plank paper	
		public static final RegistryObject<paintedsign> BLACK_SIGN = BLOCKS.register("black_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.BLACK_WOOD));
	
	// plank paper	
		public static final RegistryObject<paintedsign> ORANGE_SIGN = BLOCKS.register("orange_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.ORANGE_WOOD));

		// blue paper	
		public static final RegistryObject<paintedsign> PINK_SIGN = BLOCKS.register("pink_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.PINK_WOOD));
		
		// plank paper	
		public static final RegistryObject<paintedsign> PURPLE_SIGN = BLOCKS.register("purple_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.PURPLE_WOOD));

		// plank paper	
		public static final RegistryObject<paintedsign> RED_SIGN = BLOCKS.register("red_sign", () -> 
		new paintedsign(Block.Properties.copy(BlockInit.RED_PLANK.get()), WoodTypeInit.RED_WOOD));
		
		// plank paper	
		public static final RegistryObject<paintedsign> WHITE_SIGN = BLOCKS.register("white_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.WHITE_WOOD));

		// plank paper	
		public static final RegistryObject<paintedsign> YELLOW_SIGN = BLOCKS.register("yellow_sign", () -> 
		new paintedsign(Block.Properties.copy(Blocks.OAK_SIGN), WoodTypeInit.YELLOW_WOOD));
	
	
	///////////////////////////////////////////////////////////////////////
	//STAIRS
	
	
	public static final RegistryObject<wallpaperstairs> WALLPAPER_STAIR = BLOCKS.register("wallpaper_stair", () -> 
	new wallpaperstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// blue paper	
	public static final RegistryObject<paintedstairs> BLUE_STAIR = BLOCKS.register("blue_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
	
	// plank paper	
	public static final RegistryObject<paintedstairs> BROWN_STAIR = BLOCKS.register("brown_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// blue paper	
	public static final RegistryObject<paintedstairs> CYAN_STAIR = BLOCKS.register("cyan_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// plank paper	
	public static final RegistryObject<paintedstairs> GRAY_STAIR = BLOCKS.register("gray_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// blue paper	
	public static final RegistryObject<paintedstairs> GREEN_STAIR = BLOCKS.register("green_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
	
	// plank paper	
	public static final RegistryObject<paintedstairs> LIGHT_BLUE_STAIR = BLOCKS.register("light_blue_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// plank paper	
	public static final RegistryObject<paintedstairs> LIGHT_GRAY_STAIR = BLOCKS.register("light_gray_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
	
	// plank paper	
	public static final RegistryObject<paintedstairs> LIME_STAIR = BLOCKS.register("lime_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

	// plank paper	
	public static final RegistryObject<paintedstairs> MAGENTA_STAIR = BLOCKS.register("magenta_stair", () -> 
	new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
	
	// plank paper	
		public static final RegistryObject<paintedstairs> BLACK_STAIR = BLOCKS.register("black_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
	
	// plank paper	
		public static final RegistryObject<paintedstairs> ORANGE_STAIR = BLOCKS.register("orange_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

		// blue paper	
		public static final RegistryObject<paintedstairs> PINK_STAIR = BLOCKS.register("pink_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
		
		// plank paper	
		public static final RegistryObject<paintedstairs> PURPLE_STAIR = BLOCKS.register("purple_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

		// plank paper	
		public static final RegistryObject<paintedstairs> RED_STAIR = BLOCKS.register("red_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
		
		// plank paper	
		public static final RegistryObject<paintedstairs> WHITE_STAIR = BLOCKS.register("white_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));

		// plank paper	
		public static final RegistryObject<paintedstairs> YELLOW_STAIR = BLOCKS.register("yellow_stair", () -> 
		new paintedstairs(BlockInit.PROPERTY_BLOCK.get().defaultBlockState(), Block.Properties.copy(BlockInit.PROPERTY_BLOCK.get())));
		
	///////////////////////////////////////////////////////////////////////
	//PLATES
		
		public static final RegistryObject<wallpaperplates> WALLPAPER_PLATE = BLOCKS.register("wallpaper_plate", () -> 
		new wallpaperplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// blue paper	
		public static final RegistryObject<paintedplates> BLUE_PLATE = BLOCKS.register("blue_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		// plank paper	
		public static final RegistryObject<paintedplates> BROWN_PLATE = BLOCKS.register("brown_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// blue paper	
		public static final RegistryObject<paintedplates> CYAN_PLATE = BLOCKS.register("cyan_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// plank paper	
		public static final RegistryObject<paintedplates> GRAY_PLATE = BLOCKS.register("gray_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// blue paper	
		public static final RegistryObject<paintedplates> GREEN_PLATE = BLOCKS.register("green_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		// plank paper	
		public static final RegistryObject<paintedplates> LIGHT_BLUE_PLATE = BLOCKS.register("light_blue_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// plank paper	
		public static final RegistryObject<paintedplates> LIGHT_GRAY_PLATE = BLOCKS.register("light_gray_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		// plank paper	
		public static final RegistryObject<paintedplates> LIME_PLATE = BLOCKS.register("lime_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

		// plank paper	
		public static final RegistryObject<paintedplates> MAGENTA_PLATE = BLOCKS.register("magenta_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		// plank paper	
		public static final RegistryObject<paintedplates> BLACK_PLATE = BLOCKS.register("black_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		// plank paper	
		public static final RegistryObject<paintedplates> ORANGE_PLATE = BLOCKS.register("orange_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

			// blue paper	
		public static final RegistryObject<paintedplates> PINK_PLATE = BLOCKS.register("pink_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
			
			// plank paper	
		public static final RegistryObject<paintedplates> PURPLE_PLATE = BLOCKS.register("purple_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

			// plank paper	
		public static final RegistryObject<paintedplates> RED_PLATE = BLOCKS.register("red_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
			
			// plank paper	
		public static final RegistryObject<paintedplates> WHITE_PLATE = BLOCKS.register("white_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));

			// plank paper	
		public static final RegistryObject<paintedplates> YELLOW_PLATE = BLOCKS.register("yellow_plate", () -> 
		new paintedplates(Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));
		
		//////////////////////////////////////////////////////////////////////////////////////////
		//fences
		public static final RegistryObject<wallpaperfences> WALLPAPER_FENCE = BLOCKS.register("wallpaper_fence", () -> 
		new wallpaperfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// blue paper	
		public static final RegistryObject<paintedfences> BLUE_FENCE = BLOCKS.register("blue_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		// plank paper	
		public static final RegistryObject<paintedfences> BROWN_FENCE = BLOCKS.register("brown_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// blue paper	
		public static final RegistryObject<paintedfences> CYAN_FENCE = BLOCKS.register("cyan_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// plank paper	
		public static final RegistryObject<paintedfences> GRAY_FENCE = BLOCKS.register("gray_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// blue paper	
		public static final RegistryObject<paintedfences> GREEN_FENCE = BLOCKS.register("green_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		// plank paper	
		public static final RegistryObject<paintedfences> LIGHT_BLUE_FENCE = BLOCKS.register("light_blue_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// plank paper	
		public static final RegistryObject<paintedfences> LIGHT_GRAY_FENCE = BLOCKS.register("light_gray_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		// plank paper	
		public static final RegistryObject<paintedfences> LIME_FENCE = BLOCKS.register("lime_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

		// plank paper	
		public static final RegistryObject<paintedfences> MAGENTA_FENCE = BLOCKS.register("magenta_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		// plank paper	
		public static final RegistryObject<paintedfences> BLACK_FENCE = BLOCKS.register("black_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		// plank paper	
		public static final RegistryObject<paintedfences> ORANGE_FENCE = BLOCKS.register("orange_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

			// blue paper	
		public static final RegistryObject<paintedfences> PINK_FENCE = BLOCKS.register("pink_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
			
			// plank paper	
		public static final RegistryObject<paintedfences> PURPLE_FENCE = BLOCKS.register("purple_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

			// plank paper	
		public static final RegistryObject<paintedfences> RED_FENCE = BLOCKS.register("red_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
			
			// plank paper	
		public static final RegistryObject<paintedfences> WHITE_FENCE = BLOCKS.register("white_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));

			// plank paper	
		public static final RegistryObject<paintedfences> YELLOW_FENCE = BLOCKS.register("yellow_fence", () -> 
		new paintedfences(Block.Properties.copy(Blocks.OAK_FENCE)));
		
		//buttons
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public static final RegistryObject<wallpaperbuttons> WALLPAPER_BUTTON = BLOCKS.register("wallpaper_button", () -> 
		new wallpaperbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// blue paper	
		public static final RegistryObject<paintedbuttons> BLUE_BUTTON = BLOCKS.register("blue_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		// plank paper	
		public static final RegistryObject<paintedbuttons> BROWN_BUTTON = BLOCKS.register("brown_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// blue paper	
		public static final RegistryObject<paintedbuttons> CYAN_BUTTON = BLOCKS.register("cyan_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// plank paper	
		public static final RegistryObject<paintedbuttons> GRAY_BUTTON = BLOCKS.register("gray_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// blue paper	
		public static final RegistryObject<paintedbuttons> GREEN_BUTTON = BLOCKS.register("green_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		// plank paper	
		public static final RegistryObject<paintedbuttons> LIGHT_BLUE_BUTTON = BLOCKS.register("light_blue_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// plank paper	
		public static final RegistryObject<paintedbuttons> LIGHT_GRAY_BUTTON = BLOCKS.register("light_gray_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		// plank paper	
		public static final RegistryObject<paintedbuttons> LIME_BUTTON = BLOCKS.register("lime_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

		// plank paper	
		public static final RegistryObject<paintedbuttons> MAGENTA_BUTTON = BLOCKS.register("magenta_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		// plank paper	
		public static final RegistryObject<paintedbuttons> BLACK_BUTTON = BLOCKS.register("black_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		// plank paper	
		public static final RegistryObject<paintedbuttons> ORANGE_BUTTON = BLOCKS.register("orange_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

			// blue paper	
		public static final RegistryObject<paintedbuttons> PINK_BUTTON = BLOCKS.register("pink_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
			
			// plank paper	
		public static final RegistryObject<paintedbuttons> PURPLE_BUTTON = BLOCKS.register("purple_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

			// plank paper	
		public static final RegistryObject<paintedbuttons> RED_BUTTON = BLOCKS.register("red_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
			
			// plank paper	
		public static final RegistryObject<paintedbuttons> WHITE_BUTTON = BLOCKS.register("white_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));

			// plank paper	
		public static final RegistryObject<paintedbuttons> YELLOW_BUTTON = BLOCKS.register("yellow_button", () -> 
		new paintedbuttons(true, Block.Properties.copy(Blocks.OAK_BUTTON)));
		
		//gates
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public static final RegistryObject<wallpapergates> WALLPAPER_GATE = BLOCKS.register("wallpaper_gate", () -> 
		new wallpapergates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// blue paper	
		public static final RegistryObject<paintedgates> BLUE_GATE = BLOCKS.register("blue_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
		
		// plank paper	
		public static final RegistryObject<paintedgates> BROWN_GATE = BLOCKS.register("brown_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// blue paper	
		public static final RegistryObject<paintedgates> CYAN_GATE = BLOCKS.register("cyan_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// plank paper	
		public static final RegistryObject<paintedgates> GRAY_GATE = BLOCKS.register("gray_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// blue paper	
		public static final RegistryObject<paintedgates> GREEN_GATE = BLOCKS.register("green_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
		
		// plank paper	
		public static final RegistryObject<paintedgates> LIGHT_BLUE_GATE = BLOCKS.register("light_blue_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// plank paper	
		public static final RegistryObject<paintedgates> LIGHT_GRAY_GATE = BLOCKS.register("light_gray_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
		
		// plank paper	
		public static final RegistryObject<paintedgates> LIME_GATE = BLOCKS.register("lime_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

		// plank paper	
		public static final RegistryObject<paintedgates> MAGENTA_GATE = BLOCKS.register("magenta_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
		
		// plank paper	
		public static final RegistryObject<paintedgates> BLACK_GATE = BLOCKS.register("black_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
		
		// plank paper	
		public static final RegistryObject<paintedgates> ORANGE_GATE = BLOCKS.register("orange_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

			// blue paper	
		public static final RegistryObject<paintedgates> PINK_GATE = BLOCKS.register("pink_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
			
			// plank paper	
		public static final RegistryObject<paintedgates> PURPLE_GATE = BLOCKS.register("purple_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

			// plank paper	
		public static final RegistryObject<paintedgates> RED_GATE = BLOCKS.register("red_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
			
			// plank paper	
		public static final RegistryObject<paintedgates> WHITE_GATE = BLOCKS.register("white_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));

			// plank paper	
		public static final RegistryObject<paintedgates> YELLOW_GATE = BLOCKS.register("yellow_gate", () -> 
		new paintedgates(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
}