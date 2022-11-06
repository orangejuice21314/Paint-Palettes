package com.mzoj.mzojPaint.data.client;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.BlockInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, Main.MOD_ID, exFileHelper);
	}
	
	@Override	
	protected void registerStatesAndModels() {	

		//SIGNS
		signBlock(BlockInit.WALLPAPER_SIGN.get(), 
				BlockInit.WALLPAPER_WALLSIGN.get(), 
				modLoc("blocks/wallpaper_block"));
		
		signBlock(BlockInit.RED_SIGN.get(), 
				BlockInit.RED_WALLSIGN.get(), 
				modLoc("blocks/red_plank"));
		
		signBlock(BlockInit.WHITE_SIGN.get(), 
				BlockInit.WHITE_WALLSIGN.get(), 
				modLoc("blocks/white_plank"));
		
		signBlock(BlockInit.BLACK_SIGN.get(), 
				BlockInit.BLACK_WALLSIGN.get(), 
				modLoc("blocks/black_plank"));
		
		signBlock(BlockInit.BLUE_SIGN.get(), 
				BlockInit.BLUE_WALLSIGN.get(), 
				modLoc("blocks/blue_plank"));
		
		signBlock(BlockInit.LIGHT_BLUE_SIGN.get(), 
				BlockInit.LIGHT_BLUE_WALLSIGN.get(), 
				modLoc("blocks/light_blue_plank"));
		
		signBlock(BlockInit.GRAY_SIGN.get(), 
				BlockInit.GRAY_WALLSIGN.get(), 
				modLoc("blocks/gray_plank"));
		
		signBlock(BlockInit.LIGHT_GRAY_SIGN.get(), 
				BlockInit.LIGHT_GRAY_WALLSIGN.get(), 
				modLoc("blocks/light_gray_plank"));
		
		signBlock(BlockInit.GREEN_SIGN.get(), 
				BlockInit.GREEN_WALLSIGN.get(), 
				modLoc("blocks/green_plank"));
		
		signBlock(BlockInit.LIME_SIGN.get(), 
				BlockInit.LIME_WALLSIGN.get(), 
				modLoc("blocks/lime_plank"));
		
		signBlock(BlockInit.PINK_SIGN.get(), 
				BlockInit.PINK_WALLSIGN.get(), 
				modLoc("blocks/pink_plank"));
		
		signBlock(BlockInit.MAGENTA_SIGN.get(), 
				BlockInit.MAGENTA_WALLSIGN.get(), 
				modLoc("blocks/magenta_plank"));
		
		signBlock(BlockInit.PURPLE_SIGN.get(), 
				BlockInit.PURPLE_WALLSIGN.get(), 
				modLoc("blocks/purple_plank"));
		
		signBlock(BlockInit.ORANGE_SIGN.get(), 
				BlockInit.ORANGE_WALLSIGN.get(), 
				modLoc("blocks/orange_plank"));
		
		signBlock(BlockInit.YELLOW_SIGN.get(), 
				BlockInit.YELLOW_WALLSIGN.get(), 
				modLoc("blocks/yellow_plank"));
		
		signBlock(BlockInit.BROWN_SIGN.get(), 
				BlockInit.BROWN_WALLSIGN.get(), 
				modLoc("blocks/brown_plank"));
		
		signBlock(BlockInit.CYAN_SIGN.get(), 
				BlockInit.CYAN_WALLSIGN.get(), 
				modLoc("blocks/cyan_plank"));
		
		/*
		doorBlock(
		BlockInit.BLACK_DOOR.get(),		
		models().doorBottomLeft(getName(), 
			modLoc("blocks/black_door_bottom"), modLoc("blocks/black_door_top")), 
		models().doorBottomRight(getName(), 
				modLoc("blocks/black_door_bottom"), modLoc("blocks/black_door_top")), 
		models().doorTopRight(getName(), 
				modLoc("blocks/black_door_bottom"), modLoc("blocks/black_door_top")), 
		models().doorTopLeft(getName(), 
				modLoc("blocks/black_door_bottom"), modLoc("blocks/black_door_top")));
		*/
		
	}
}
