package net.mzoj.mzojpaint.init;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mzoj.mzojpaint.Common.Items.Paintbrushes;
import net.mzoj.mzojpaint.Main;

public class BlockItemInit {
    public static final BlockItem WALLPAPER_BLOCK =
            new BlockItem(BlockInit.WALLPAPER_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_BLOCK =
            new BlockItem(BlockInit.RED_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_BLOCK =
            new BlockItem(BlockInit.WHITE_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_BLOCK =
            new BlockItem(BlockInit.BLACK_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_BLOCK =
            new BlockItem(BlockInit.PINK_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_BLOCK =
            new BlockItem(BlockInit.MAGENTA_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_BLOCK =
            new BlockItem(BlockInit.LIME_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_BLOCK =
            new BlockItem(BlockInit.GREEN_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_BLOCK =
            new BlockItem(BlockInit.CYAN_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_BLOCK =
            new BlockItem(BlockInit.BLUE_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_BLOCK =
            new BlockItem(BlockInit.LIGHT_BLUE_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_BLOCK =
            new BlockItem(BlockInit.LIGHT_GRAY_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_BLOCK =
            new BlockItem(BlockInit.GRAY_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_BLOCK =
            new BlockItem(BlockInit.BROWN_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_BLOCK =
            new BlockItem(BlockInit.YELLOW_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_BLOCK =
            new BlockItem(BlockInit.ORANGE_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_BLOCK =
            new BlockItem(BlockInit.PURPLE_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP));

    ///

    public static final BlockItem WALLPAPER_SLAB =
            new BlockItem(BlockInit.WALLPAPER_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_SLAB =
            new BlockItem(BlockInit.RED_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_SLAB =
            new BlockItem(BlockInit.WHITE_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_SLAB =
            new BlockItem(BlockInit.BLACK_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_SLAB =
            new BlockItem(BlockInit.PINK_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_SLAB =
            new BlockItem(BlockInit.MAGENTA_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_SLAB =
            new BlockItem(BlockInit.LIME_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_SLAB =
            new BlockItem(BlockInit.GREEN_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_SLAB =
            new BlockItem(BlockInit.CYAN_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_SLAB =
            new BlockItem(BlockInit.BLUE_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_SLAB =
            new BlockItem(BlockInit.LIGHT_BLUE_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_SLAB =
            new BlockItem(BlockInit.LIGHT_GRAY_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_SLAB =
            new BlockItem(BlockInit.GRAY_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_SLAB =
            new BlockItem(BlockInit.BROWN_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_SLAB =
            new BlockItem(BlockInit.YELLOW_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_SLAB =
            new BlockItem(BlockInit.ORANGE_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_SLAB =
            new BlockItem(BlockInit.PURPLE_SLAB, new FabricItemSettings().group(Main.ITEM_GROUP));

    ////

    public static final BlockItem WALLPAPER_DOOR =
            new BlockItem(BlockInit.WALLPAPER_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_DOOR =
            new BlockItem(BlockInit.RED_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_DOOR =
            new BlockItem(BlockInit.WHITE_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_DOOR =
            new BlockItem(BlockInit.BLACK_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_DOOR =
            new BlockItem(BlockInit.PINK_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_DOOR =
            new BlockItem(BlockInit.MAGENTA_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_DOOR =
            new BlockItem(BlockInit.LIME_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_DOOR =
            new BlockItem(BlockInit.GREEN_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_DOOR =
            new BlockItem(BlockInit.CYAN_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_DOOR =
            new BlockItem(BlockInit.BLUE_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_DOOR =
            new BlockItem(BlockInit.LIGHT_BLUE_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_DOOR =
            new BlockItem(BlockInit.LIGHT_GRAY_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_DOOR =
            new BlockItem(BlockInit.GRAY_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_DOOR =
            new BlockItem(BlockInit.BROWN_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_DOOR =
            new BlockItem(BlockInit.YELLOW_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_DOOR =
            new BlockItem(BlockInit.ORANGE_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_DOOR =
            new BlockItem(BlockInit.PURPLE_DOOR, new FabricItemSettings().group(Main.ITEM_GROUP));

    ///

    public static final BlockItem WALLPAPER_STAIR =
            new BlockItem(BlockInit.WALLPAPER_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_STAIR =
            new BlockItem(BlockInit.RED_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_STAIR =
            new BlockItem(BlockInit.WHITE_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_STAIR =
            new BlockItem(BlockInit.BLACK_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_STAIR =
            new BlockItem(BlockInit.PINK_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_STAIR =
            new BlockItem(BlockInit.MAGENTA_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_STAIR =
            new BlockItem(BlockInit.LIME_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_STAIR =
            new BlockItem(BlockInit.GREEN_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_STAIR =
            new BlockItem(BlockInit.CYAN_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_STAIR =
            new BlockItem(BlockInit.BLUE_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_STAIR =
            new BlockItem(BlockInit.LIGHT_BLUE_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_STAIR =
            new BlockItem(BlockInit.LIGHT_GRAY_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_STAIR =
            new BlockItem(BlockInit.GRAY_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_STAIR =
            new BlockItem(BlockInit.BROWN_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_STAIR =
            new BlockItem(BlockInit.YELLOW_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_STAIR =
            new BlockItem(BlockInit.ORANGE_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_STAIR =
            new BlockItem(BlockInit.PURPLE_STAIR, new FabricItemSettings().group(Main.ITEM_GROUP));

    ///

    public static final BlockItem WALLPAPER_TRAPDOOR =
            new BlockItem(BlockInit.WALLPAPER_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_TRAPDOOR =
            new BlockItem(BlockInit.RED_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_TRAPDOOR =
            new BlockItem(BlockInit.WHITE_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_TRAPDOOR =
            new BlockItem(BlockInit.BLACK_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_TRAPDOOR =
            new BlockItem(BlockInit.PINK_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_TRAPDOOR =
            new BlockItem(BlockInit.MAGENTA_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_TRAPDOOR =
            new BlockItem(BlockInit.LIME_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_TRAPDOOR =
            new BlockItem(BlockInit.GREEN_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_TRAPDOOR =
            new BlockItem(BlockInit.CYAN_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_TRAPDOOR =
            new BlockItem(BlockInit.BLUE_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_TRAPDOOR =
            new BlockItem(BlockInit.LIGHT_BLUE_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_TRAPDOOR =
            new BlockItem(BlockInit.LIGHT_GRAY_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_TRAPDOOR =
            new BlockItem(BlockInit.GRAY_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_TRAPDOOR =
            new BlockItem(BlockInit.BROWN_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_TRAPDOOR =
            new BlockItem(BlockInit.YELLOW_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_TRAPDOOR =
            new BlockItem(BlockInit.ORANGE_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_TRAPDOOR =
            new BlockItem(BlockInit.PURPLE_TRAPDOOR, new FabricItemSettings().group(Main.ITEM_GROUP));


    public static final BlockItem WALLPAPER_FENCE =
            new BlockItem(BlockInit.WALLPAPER_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_FENCE =
            new BlockItem(BlockInit.RED_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_FENCE =
            new BlockItem(BlockInit.WHITE_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_FENCE =
            new BlockItem(BlockInit.BLACK_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_FENCE =
            new BlockItem(BlockInit.PINK_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_FENCE =
            new BlockItem(BlockInit.MAGENTA_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_FENCE =
            new BlockItem(BlockInit.LIME_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_FENCE =
            new BlockItem(BlockInit.GREEN_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_FENCE =
            new BlockItem(BlockInit.CYAN_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_FENCE =
            new BlockItem(BlockInit.BLUE_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_FENCE =
            new BlockItem(BlockInit.LIGHT_BLUE_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_FENCE =
            new BlockItem(BlockInit.LIGHT_GRAY_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_FENCE =
            new BlockItem(BlockInit.GRAY_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_FENCE =
            new BlockItem(BlockInit.BROWN_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_FENCE =
            new BlockItem(BlockInit.YELLOW_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_FENCE =
            new BlockItem(BlockInit.ORANGE_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_FENCE =
            new BlockItem(BlockInit.PURPLE_FENCE, new FabricItemSettings().group(Main.ITEM_GROUP));


    public static final BlockItem WALLPAPER_GATE =
            new BlockItem(BlockInit.WALLPAPER_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_GATE =
            new BlockItem(BlockInit.RED_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_GATE =
            new BlockItem(BlockInit.WHITE_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_GATE =
            new BlockItem(BlockInit.BLACK_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_GATE =
            new BlockItem(BlockInit.PINK_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_GATE =
            new BlockItem(BlockInit.MAGENTA_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_GATE =
            new BlockItem(BlockInit.LIME_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_GATE =
            new BlockItem(BlockInit.GREEN_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_GATE =
            new BlockItem(BlockInit.CYAN_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_GATE =
            new BlockItem(BlockInit.BLUE_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_GATE =
            new BlockItem(BlockInit.LIGHT_BLUE_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_GATE =
            new BlockItem(BlockInit.LIGHT_GRAY_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_GATE =
            new BlockItem(BlockInit.GRAY_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_GATE =
            new BlockItem(BlockInit.BROWN_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_GATE =
            new BlockItem(BlockInit.YELLOW_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_GATE =
            new BlockItem(BlockInit.ORANGE_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_GATE =
            new BlockItem(BlockInit.PURPLE_GATE, new FabricItemSettings().group(Main.ITEM_GROUP));



    public static final BlockItem WALLPAPER_BUTTON =
            new BlockItem(BlockInit.WALLPAPER_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_BUTTON =
            new BlockItem(BlockInit.RED_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_BUTTON =
            new BlockItem(BlockInit.WHITE_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_BUTTON =
            new BlockItem(BlockInit.BLACK_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_BUTTON =
            new BlockItem(BlockInit.PINK_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_BUTTON =
            new BlockItem(BlockInit.MAGENTA_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_BUTTON =
            new BlockItem(BlockInit.LIME_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_BUTTON =
            new BlockItem(BlockInit.GREEN_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_BUTTON =
            new BlockItem(BlockInit.CYAN_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_BUTTON =
            new BlockItem(BlockInit.BLUE_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_BUTTON =
            new BlockItem(BlockInit.LIGHT_BLUE_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_BUTTON =
            new BlockItem(BlockInit.LIGHT_GRAY_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_BUTTON =
            new BlockItem(BlockInit.GRAY_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_BUTTON =
            new BlockItem(BlockInit.BROWN_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_BUTTON =
            new BlockItem(BlockInit.YELLOW_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_BUTTON =
            new BlockItem(BlockInit.ORANGE_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_BUTTON =
            new BlockItem(BlockInit.PURPLE_BUTTON, new FabricItemSettings().group(Main.ITEM_GROUP));


    public static final BlockItem WALLPAPER_PLATE =
            new BlockItem(BlockInit.WALLPAPER_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem RED_PLATE =
            new BlockItem(BlockInit.RED_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem WHITE_PLATE =
            new BlockItem(BlockInit.WHITE_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLACK_PLATE =
            new BlockItem(BlockInit.BLACK_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PINK_PLATE =
            new BlockItem(BlockInit.PINK_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem MAGENTA_PLATE =
            new BlockItem(BlockInit.MAGENTA_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIME_PLATE =
            new BlockItem(BlockInit.LIME_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GREEN_PLATE =
            new BlockItem(BlockInit.GREEN_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem CYAN_PLATE =
            new BlockItem(BlockInit.CYAN_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BLUE_PLATE =
            new BlockItem(BlockInit.BLUE_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_BLUE_PLATE =
            new BlockItem(BlockInit.LIGHT_BLUE_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem LIGHT_GRAY_PLATE =
            new BlockItem(BlockInit.LIGHT_GRAY_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem GRAY_PLATE =
            new BlockItem(BlockInit.GRAY_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem BROWN_PLATE =
            new BlockItem(BlockInit.BROWN_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem YELLOW_PLATE =
            new BlockItem(BlockInit.YELLOW_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem ORANGE_PLATE =
            new BlockItem(BlockInit.ORANGE_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final BlockItem PURPLE_PLATE =
            new BlockItem(BlockInit.PURPLE_PLATE, new FabricItemSettings().group(Main.ITEM_GROUP));


    public static void registerBlocks() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_block"), WALLPAPER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_plank"), RED_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_plank"), BLACK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_plank"), WHITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_plank"), YELLOW_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_plank"), CYAN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_plank"), BLUE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_plank"), LIGHT_BLUE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_plank"), LIGHT_GRAY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_plank"), GRAY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_plank"), GREEN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_plank"), LIME_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_plank"), BROWN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_plank"), MAGENTA_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_plank"), PINK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_plank"), PURPLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_plank"), ORANGE_BLOCK);

        ///

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "paper_slab"), WALLPAPER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_slab"), RED_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_slab"), BLACK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_slab"), WHITE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_slab"), YELLOW_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_slab"), CYAN_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_slab"), BLUE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_slab"), LIGHT_BLUE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_slab"), LIGHT_GRAY_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_slab"), GRAY_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_slab"), GREEN_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_slab"), LIME_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_slab"), BROWN_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_slab"), MAGENTA_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_slab"), PINK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_slab"), PURPLE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_slab"), ORANGE_SLAB);

        ///

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "paper_door"), WALLPAPER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_door"), RED_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_door"), BLACK_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_door"), WHITE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_door"), YELLOW_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_door"), CYAN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_door"), BLUE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_door"), LIGHT_BLUE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_door"), LIGHT_GRAY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_door"), GRAY_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_door"), GREEN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_door"), LIME_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_door"), BROWN_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_door"), MAGENTA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_door"), PINK_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_door"), PURPLE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_door"), ORANGE_DOOR);

        ///

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_stair"), WALLPAPER_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_stair"), RED_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_stair"), BLACK_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_stair"), WHITE_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_stair"), YELLOW_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_stair"), CYAN_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_stair"), BLUE_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_stair"), LIGHT_BLUE_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_stair"), LIGHT_GRAY_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_stair"), GRAY_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_stair"), GREEN_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_stair"), LIME_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_stair"), BROWN_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_stair"), MAGENTA_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_stair"), PINK_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_stair"), PURPLE_STAIR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_stair"), ORANGE_STAIR);

        ///

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "paper_trapdoor"), WALLPAPER_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_trapdoor"), RED_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_trapdoor"), BLACK_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_trapdoor"), WHITE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_trapdoor"), YELLOW_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_trapdoor"), CYAN_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_trapdoor"), BLUE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_trapdoor"), LIGHT_BLUE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_trapdoor"), LIGHT_GRAY_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_trapdoor"), GRAY_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_trapdoor"), GREEN_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_trapdoor"), LIME_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_trapdoor"), BROWN_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_trapdoor"), MAGENTA_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_trapdoor"), PINK_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_trapdoor"), PURPLE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_trapdoor"), ORANGE_TRAPDOOR);


        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_fence"), WALLPAPER_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_fence"), RED_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_fence"), BLACK_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_fence"), WHITE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_fence"), YELLOW_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_fence"), CYAN_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_fence"), BLUE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_fence"), LIGHT_BLUE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_fence"), LIGHT_GRAY_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_fence"), GRAY_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_fence"), GREEN_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_fence"), LIME_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_fence"), BROWN_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_fence"), MAGENTA_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_fence"), PINK_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_fence"), PURPLE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_fence"), ORANGE_FENCE);


        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_gate"), WALLPAPER_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_gate"), RED_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_gate"), BLACK_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_gate"), WHITE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_gate"), YELLOW_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_gate"), CYAN_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_gate"), BLUE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_gate"), LIGHT_BLUE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_gate"), LIGHT_GRAY_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_gate"), GRAY_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_gate"), GREEN_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_gate"), LIME_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_gate"), BROWN_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_gate"), MAGENTA_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_gate"), PINK_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_gate"), PURPLE_GATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_gate"), ORANGE_GATE);


        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_button"), WALLPAPER_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_button"), RED_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_button"), BLACK_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_button"), WHITE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_button"), YELLOW_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_button"), CYAN_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_button"), BLUE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_button"), LIGHT_BLUE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_button"), LIGHT_GRAY_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_button"), GRAY_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_button"), GREEN_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_button"), LIME_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_button"), BROWN_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_button"), MAGENTA_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_button"), PINK_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_button"), PURPLE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_button"), ORANGE_BUTTON);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wallpaper_plate"), WALLPAPER_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_plate"), RED_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "black_plate"), BLACK_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "white_plate"), WHITE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "yellow_plate"), YELLOW_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cyan_plate"), CYAN_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blue_plate"), BLUE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_blue_plate"), LIGHT_BLUE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_gray_plate"), LIGHT_GRAY_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gray_plate"), GRAY_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "green_plate"), GREEN_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lime_plate"), LIME_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "brown_plate"), BROWN_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magenta_plate"), MAGENTA_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "pink_plate"), PINK_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "purple_plate"), PURPLE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "orange_plate"), ORANGE_PLATE);

    }
}
