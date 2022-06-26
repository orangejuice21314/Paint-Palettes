package com.mzoj.mzojPaint.data;

import com.mzoj.mzojPaint.data.client.ModItemModelProvider;
import com.mzoj.mzojPaint.data.client.ModBlockStateProvider;
import com.mzoj.mzojPaint.Main;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	private DataGenerators() {} 
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
				
		gen.addProvider(event.includeClient(), new ModItemModelProvider(gen, Main.MOD_ID, existingFileHelper));
		gen.addProvider(event.includeClient(), new ModBlockStateProvider(gen, existingFileHelper));
	}
}