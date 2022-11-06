package com.mzoj.mzojPaint;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.texture.AtlasSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import com.mzoj.mzojPaint.core.init.BlockEntityInit;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;
import com.mzoj.mzojPaint.core.init.WoodTypeInit;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mzojpaint")
public class Main
{
	public static final String MOD_ID = "mzojpaint";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    //item group
    public static final CreativeModeTab PAINTABLE_PLANKS = new CreativeTab();
    
    public Main() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
		com.mzoj.mzojPaint.core.init.BlockEntityInit.BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
		com.mzoj.mzojPaint.core.init.ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		com.mzoj.mzojPaint.core.init.BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    
    private void setup(final FMLCommonSetupEvent event)
    {
    	BlockEntityRenderers.register(BlockEntityInit.WALLPAPER_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.RED_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.WHITE_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.BLACK_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.BLUE_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.PURPLE_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.YELLOW_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.BROWN_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.CYAN_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.GREEN_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.LIME_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.PINK_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.MAGENTA_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.LIGHT_GRAY_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.LIGHT_BLUE_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.ORANGE_SIGN_ENTITY.get(), SignRenderer::new);
    	BlockEntityRenderers.register(BlockEntityInit.GRAY_SIGN_ENTITY.get(), SignRenderer::new);
    	
    	WoodType.register(WoodTypeInit.WALLPAPER_WOOD);
    	Sheets.addWoodType(WoodTypeInit.WALLPAPER_WOOD);

    	WoodType.register(WoodTypeInit.RED_WOOD);
    	Sheets.addWoodType(WoodTypeInit.RED_WOOD);
    	
    	WoodType.register(WoodTypeInit.WHITE_WOOD);
    	Sheets.addWoodType(WoodTypeInit.WHITE_WOOD);

    	WoodType.register(WoodTypeInit.BLACK_WOOD);
    	Sheets.addWoodType(WoodTypeInit.BLACK_WOOD);
    	
    	WoodType.register(WoodTypeInit.BLUE_WOOD);
    	Sheets.addWoodType(WoodTypeInit.BLUE_WOOD);

    	WoodType.register(WoodTypeInit.PURPLE_WOOD);
    	Sheets.addWoodType(WoodTypeInit.PURPLE_WOOD);
    	
    	WoodType.register(WoodTypeInit.YELLOW_WOOD);
    	Sheets.addWoodType(WoodTypeInit.YELLOW_WOOD);

    	WoodType.register(WoodTypeInit.PINK_WOOD);
    	Sheets.addWoodType(WoodTypeInit.PINK_WOOD);
    	
    	WoodType.register(WoodTypeInit.ORANGE_WOOD);
    	Sheets.addWoodType(WoodTypeInit.ORANGE_WOOD);

    	WoodType.register(WoodTypeInit.MAGENTA_WOOD);
    	Sheets.addWoodType(WoodTypeInit.MAGENTA_WOOD);
    	
    	WoodType.register(WoodTypeInit.LIME_WOOD);
    	Sheets.addWoodType(WoodTypeInit.LIME_WOOD);

    	WoodType.register(WoodTypeInit.LIGHT_GRAY_WOOD);
    	Sheets.addWoodType(WoodTypeInit.LIGHT_GRAY_WOOD);
    	
    	WoodType.register(WoodTypeInit.LIGHT_BLUE_WOOD);
    	Sheets.addWoodType(WoodTypeInit.LIGHT_BLUE_WOOD);

    	WoodType.register(WoodTypeInit.GREEN_WOOD);
    	Sheets.addWoodType(WoodTypeInit.GREEN_WOOD);

    	WoodType.register(WoodTypeInit.CYAN_WOOD);
    	Sheets.addWoodType(WoodTypeInit.CYAN_WOOD);

    	WoodType.register(WoodTypeInit.GRAY_WOOD);
    	Sheets.addWoodType(WoodTypeInit.GRAY_WOOD);
    	
    	WoodType.register(WoodTypeInit.BROWN_WOOD);
    	Sheets.addWoodType(WoodTypeInit.BROWN_WOOD);
    }

    
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        //i think this is useless now, just causes a crash
    }
    
    public static class CreativeTab extends CreativeModeTab {
		public CreativeTab() {
			super("mzojpainttab");
		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.RED_PAINTBRUSH.get().getDefaultInstance();
		}
    }
}
