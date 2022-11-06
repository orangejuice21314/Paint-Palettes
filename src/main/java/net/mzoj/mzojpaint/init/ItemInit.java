package net.mzoj.mzojpaint.init;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mzoj.mzojpaint.Common.Items.Paintbuckets;
import net.mzoj.mzojpaint.Common.Items.Paintbrushes;
import net.mzoj.mzojpaint.Main;

public class ItemInit {

    public static final Item PAINTBRUSH = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item RED_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item BLACK_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item BROWN_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item CYAN_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item GRAY_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item GREEN_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item LIGHT_BLUE_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item LIGHT_GRAY_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item LIME_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item MAGENTA_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item ORANGE_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item PINK_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item PURPLE_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item WHITE_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item YELLOW_PAINTBRUSH = new Item(new FabricItemSettings());
    public static final Item BLUE_PAINTBRUSH = new Item(new FabricItemSettings());

    public static final Item RED_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item BLACK_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item BROWN_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item CYAN_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item GRAY_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item GREEN_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item LIGHT_BLUE_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item LIGHT_GRAY_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item LIME_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item MAGENTA_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item ORANGE_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item PINK_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item PURPLE_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item WHITE_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item YELLOW_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));
    public static final Item BLUE_PAINT = new Item(new FabricItemSettings().group(Main.ITEM_GROUP).maxDamage(64));


    public static final Item WALLPAPER_SIGN  = new SignItem( new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.WALLPAPER_SIGN, BlockInit.WALLPAPER_WALL_SIGN);
    public static final Item BLACK_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.BLACK_SIGN, BlockInit.BLACK_WALL_SIGN);
    public static final Item BROWN_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.BROWN_SIGN, BlockInit.BROWN_WALL_SIGN);
    public static final Item CYAN_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.CYAN_SIGN, BlockInit.CYAN_WALL_SIGN);
    public static final Item GRAY_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.GRAY_SIGN, BlockInit.GRAY_WALL_SIGN);
    public static final Item GREEN_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.GREEN_SIGN, BlockInit.GREEN_WALL_SIGN);
    public static final Item LIGHT_BLUE_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.LIGHT_BLUE_SIGN, BlockInit.LIGHT_BLUE_WALL_SIGN);
    public static final Item LIGHT_GRAY_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.LIGHT_GRAY_SIGN, BlockInit.LIGHT_GRAY_WALL_SIGN);
    public static final Item LIME_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.LIME_SIGN, BlockInit.LIME_WALL_SIGN);
    public static final Item MAGENTA_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.MAGENTA_SIGN, BlockInit.MAGENTA_WALL_SIGN);
    public static final Item ORANGE_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.ORANGE_SIGN, BlockInit.ORANGE_WALL_SIGN);
    public static final Item PINK_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.PINK_SIGN, BlockInit.PINK_WALL_SIGN);
    public static final Item PURPLE_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.PURPLE_SIGN, BlockInit.PURPLE_WALL_SIGN);
    public static final Item WHITE_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.WHITE_SIGN, BlockInit.WHITE_WALL_SIGN);
    public static final Item YELLOW_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.YELLOW_SIGN, BlockInit.YELLOW_WALL_SIGN);
    public static final Item BLUE_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.BLUE_SIGN, BlockInit.BLUE_WALL_SIGN);
    public static final Item RED_SIGN = new SignItem(new FabricItemSettings().group(Main.ITEM_GROUP), BlockInit.RED_SIGN, BlockInit.RED_WALL_SIGN);

    public static final Item PAINT_SCRAPER = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static void registerBlocks() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "paint_scraper"), PAINT_SCRAPER);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "paintbrush"), PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_paintbrush"), RED_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_paintbrush"), BLACK_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_paintbrush"), BROWN_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_paintbrush"), CYAN_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_paintbrush"), GRAY_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_paintbrush"), GREEN_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_paintbrush"), LIGHT_BLUE_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_paintbrush"), LIGHT_GRAY_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_paintbrush"), LIME_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_paintbrush"), MAGENTA_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_paintbrush"), ORANGE_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_paintbrush"), PINK_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_paintbrush"), PURPLE_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_paintbrush"), WHITE_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_paintbrush"), YELLOW_PAINTBRUSH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_paintbrush"), BLUE_PAINTBRUSH);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_paint"), RED_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_paint"), BLACK_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_paint"), BROWN_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_paint"), CYAN_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_paint"), GRAY_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_paint"), GREEN_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_paint"), LIGHT_BLUE_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_paint"), LIGHT_GRAY_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_paint"), LIME_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_paint"), MAGENTA_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_paint"), ORANGE_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_paint"), PINK_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_paint"), PURPLE_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_paint"), WHITE_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_paint"), YELLOW_PAINT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_paint"), BLUE_PAINT);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_sign"), WALLPAPER_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_sign"), RED_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_sign"), BLACK_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_sign"), BROWN_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_sign"), CYAN_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_sign"), GRAY_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_sign"), GREEN_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_sign"), LIGHT_BLUE_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_sign"), LIGHT_GRAY_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_sign"), LIME_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_sign"), MAGENTA_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_sign"), ORANGE_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_sign"), PINK_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_sign"), PURPLE_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_sign"), WHITE_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_sign"), YELLOW_SIGN);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_sign"), BLUE_SIGN);

    }
}
