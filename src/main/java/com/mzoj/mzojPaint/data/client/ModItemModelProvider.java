package com.mzoj.mzojPaint.data.client;

import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

	public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
		super(generator, modid, existingFileHelper);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void registerModels() {
		// TODO Auto-generated method stub
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		getBuilder("wallpaper_sign").parent(itemGenerated).texture("layer0", "items/wallpaper_sign");
		getBuilder("red_sign").parent(itemGenerated).texture("layer0", "items/red_sign");
		getBuilder("white_sign").parent(itemGenerated).texture("layer0", "items/white_sign");
		getBuilder("black_sign").parent(itemGenerated).texture("layer0", "items/black_sign");
		getBuilder("blue_sign").parent(itemGenerated).texture("layer0", "items/blue_sign_icon");
		getBuilder("light_blue_sign").parent(itemGenerated).texture("layer0", "items/light_blue_sign_icon");
		getBuilder("gray_sign").parent(itemGenerated).texture("layer0", "items/gray_sign_icon");
		getBuilder("light_gray_sign").parent(itemGenerated).texture("layer0", "items/light_gray_sign_icon");
		getBuilder("cyan_sign").parent(itemGenerated).texture("layer0", "items/cyan_sign_icon");
		getBuilder("pink_sign").parent(itemGenerated).texture("layer0", "items/pink_sign_icon");
		getBuilder("magenta_sign").parent(itemGenerated).texture("layer0", "items/magenta_sign_icon");
		getBuilder("purple_sign").parent(itemGenerated).texture("layer0", "items/purple_sign_icon");
		getBuilder("yellow_sign").parent(itemGenerated).texture("layer0", "items/yellow_sign_icon");
		getBuilder("orange_sign").parent(itemGenerated).texture("layer0", "items/orange_sign_icon");
		getBuilder("brown_sign").parent(itemGenerated).texture("layer0", "items/brown_sign_icon");
		getBuilder("green_sign").parent(itemGenerated).texture("layer0", "items/green_sign_icon");
		getBuilder("lime_sign").parent(itemGenerated).texture("layer0", "items/lime_sign_icon");
	}
	
	
}
