package com.mzoj.mzojPaint.core.init;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.common.tileentity.BlackSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.BlueSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.BrownSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.CyanSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.GraySignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.GreenSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.LightBlueSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.LightGraySignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.LimeSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.MagentaSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.OrangeSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.PinkSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.PurpleSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.RedSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.WallpaperSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.WhiteSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.YellowSignBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
	public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Main.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<WallpaperSignBlockEntity>> WALLPAPER_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("wallpaper_sign",
					() -> BlockEntityType.Builder.of(WallpaperSignBlockEntity::new,
					BlockInit.WALLPAPER_SIGN.get(),
					BlockInit.WALLPAPER_WALLSIGN.get()).build(null));
	
	
	public static final RegistryObject<BlockEntityType<RedSignBlockEntity>> RED_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("red_sign",
					() -> BlockEntityType.Builder.of(RedSignBlockEntity::new,
					BlockInit.RED_SIGN.get(),
					BlockInit.RED_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<WhiteSignBlockEntity>> WHITE_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("white_sign",
					() -> BlockEntityType.Builder.of(WhiteSignBlockEntity::new,
					BlockInit.WHITE_SIGN.get(),
					BlockInit.WHITE_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<BlackSignBlockEntity>> BLACK_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("black_sign",
					() -> BlockEntityType.Builder.of(BlackSignBlockEntity::new,
					BlockInit.BLACK_SIGN.get(),
					BlockInit.BLACK_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<BlueSignBlockEntity>> BLUE_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("blue_sign",
					() -> BlockEntityType.Builder.of(BlueSignBlockEntity::new,
					BlockInit.BLUE_SIGN.get(),
					BlockInit.BLUE_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<PurpleSignBlockEntity>> PURPLE_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("purple_sign",
					() -> BlockEntityType.Builder.of(PurpleSignBlockEntity::new,
					BlockInit.PURPLE_SIGN.get(),
					BlockInit.PURPLE_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<YellowSignBlockEntity>> YELLOW_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("yellow_sign",
					() -> BlockEntityType.Builder.of(YellowSignBlockEntity::new,
					BlockInit.YELLOW_SIGN.get(),
					BlockInit.YELLOW_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<GraySignBlockEntity>> GRAY_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("gray_sign",
					() -> BlockEntityType.Builder.of(GraySignBlockEntity::new,
					BlockInit.GRAY_SIGN.get(),
					BlockInit.GRAY_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<OrangeSignBlockEntity>> ORANGE_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("orange_sign",
					() -> BlockEntityType.Builder.of(OrangeSignBlockEntity::new,
					BlockInit.ORANGE_SIGN.get(),
					BlockInit.ORANGE_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<LightBlueSignBlockEntity>> LIGHT_BLUE_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("light_blue_sign",
					() -> BlockEntityType.Builder.of(LightBlueSignBlockEntity::new,
					BlockInit.LIGHT_BLUE_SIGN.get(),
					BlockInit.LIGHT_BLUE_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<LightGraySignBlockEntity>> LIGHT_GRAY_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("light_gray_sign",
					() -> BlockEntityType.Builder.of(LightGraySignBlockEntity::new,
					BlockInit.LIGHT_GRAY_SIGN.get(),
					BlockInit.LIGHT_GRAY_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<PinkSignBlockEntity>> PINK_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("pink_sign",
					() -> BlockEntityType.Builder.of(PinkSignBlockEntity::new,
					BlockInit.PINK_SIGN.get(),
					BlockInit.PINK_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<CyanSignBlockEntity>> CYAN_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("cyan_sign",
					() -> BlockEntityType.Builder.of(CyanSignBlockEntity::new,
					BlockInit.CYAN_SIGN.get(),
					BlockInit.CYAN_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<BrownSignBlockEntity>> BROWN_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("brown_sign",
					() -> BlockEntityType.Builder.of(BrownSignBlockEntity::new,
					BlockInit.BROWN_SIGN.get(),
					BlockInit.BROWN_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<GreenSignBlockEntity>> GREEN_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("green_sign",
					() -> BlockEntityType.Builder.of(GreenSignBlockEntity::new,
					BlockInit.GREEN_SIGN.get(),
					BlockInit.GREEN_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<LimeSignBlockEntity>> LIME_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("lime_sign",
					() -> BlockEntityType.Builder.of(LimeSignBlockEntity::new,
					BlockInit.LIME_SIGN.get(),
					BlockInit.LIME_WALLSIGN.get()).build(null));
	
	public static final RegistryObject<BlockEntityType<MagentaSignBlockEntity>> MAGENTA_SIGN_ENTITY = 
			BLOCK_ENTITIES.register("magenta_sign",
					() -> BlockEntityType.Builder.of(MagentaSignBlockEntity::new,
					BlockInit.MAGENTA_SIGN.get(),
					BlockInit.MAGENTA_WALLSIGN.get()).build(null));
		
	public static void register(IEventBus eventBus) {
		BLOCK_ENTITIES.register(eventBus);
	}
	
}
