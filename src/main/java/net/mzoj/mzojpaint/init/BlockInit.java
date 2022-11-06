package net.mzoj.mzojpaint.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mzoj.mzojpaint.Common.Blocks.Canvas.*;
import net.mzoj.mzojpaint.Main;

public class BlockInit {

    public static final CanvasBlock WALLPAPER_BLOCK = new CanvasBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock RED_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock WHITE_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock BLACK_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock GRAY_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock LIGHT_GRAY_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock LIGHT_BLUE_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock MAGENTA_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock PINK_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock PURPLE_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock YELLOW_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock ORANGE_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock LIME_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock GREEN_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock BLUE_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock BROWN_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedBlock CYAN_BLOCK = new PaintedBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    //////////////////////////////////////////////////
    public static final CanvasSlab WALLPAPER_SLAB = new CanvasSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab RED_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab WHITE_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab BLACK_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab GRAY_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab LIGHT_GRAY_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab LIGHT_BLUE_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab MAGENTA_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab PINK_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab PURPLE_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab YELLOW_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab ORANGE_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab LIME_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab GREEN_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab BLUE_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab BROWN_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedSlab CYAN_SLAB = new PaintedSlab(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    //////////////////////////////////////////////////
    public static final CanvasDoor WALLPAPER_DOOR = new CanvasDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor RED_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor WHITE_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor BLACK_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor GRAY_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor LIGHT_GRAY_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor LIGHT_BLUE_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor MAGENTA_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor PINK_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor PURPLE_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor YELLOW_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor ORANGE_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor LIME_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor GREEN_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor BLUE_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor BROWN_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedDoor CYAN_DOOR = new PaintedDoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    ///////////////

    public static final CanvasStair WALLPAPER_STAIR = new CanvasStair(BlockInit.WALLPAPER_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair RED_STAIR = new PaintedStair(BlockInit.RED_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair BLUE_STAIR = new PaintedStair(BlockInit.BLUE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair BROWN_STAIR = new PaintedStair(BlockInit.BROWN_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair BLACK_STAIR = new PaintedStair(BlockInit.BLACK_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair LIGHT_GRAY_STAIR = new PaintedStair(BlockInit.LIGHT_GRAY_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair LIGHT_BLUE_STAIR = new PaintedStair(BlockInit.LIGHT_BLUE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair CYAN_STAIR = new PaintedStair(BlockInit.CYAN_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair GREEN_STAIR = new PaintedStair(BlockInit.GREEN_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair LIME_STAIR = new PaintedStair(BlockInit.LIME_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair YELLOW_STAIR = new PaintedStair(BlockInit.YELLOW_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair ORANGE_STAIR = new PaintedStair(BlockInit.ORANGE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair PINK_STAIR = new PaintedStair(BlockInit.PINK_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair MAGENTA_STAIR = new PaintedStair(BlockInit.MAGENTA_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair PURPLE_STAIR = new PaintedStair(BlockInit.PURPLE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair GRAY_STAIR = new PaintedStair(BlockInit.GRAY_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedStair WHITE_STAIR = new PaintedStair(BlockInit.WHITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    ///////////////

    public static final CanvasTrapdoor WALLPAPER_TRAPDOOR = new CanvasTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor RED_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor WHITE_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor BLACK_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor GRAY_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor LIGHT_GRAY_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor LIGHT_BLUE_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor MAGENTA_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor PINK_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor PURPLE_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor YELLOW_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor ORANGE_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor LIME_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor GREEN_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor BLUE_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor BROWN_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedTrapdoor CYAN_TRAPDOOR = new PaintedTrapdoor(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    public static final CanvasFence WALLPAPER_FENCE = new CanvasFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence RED_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence WHITE_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence BLACK_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence GRAY_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence LIGHT_GRAY_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence LIGHT_BLUE_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence MAGENTA_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence PINK_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence PURPLE_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence YELLOW_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence ORANGE_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence LIME_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence GREEN_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence BLUE_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence BROWN_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedFence CYAN_FENCE = new PaintedFence(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    public static final CanvasGate WALLPAPER_GATE = new CanvasGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate RED_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate WHITE_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate BLACK_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate GRAY_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate LIGHT_GRAY_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate LIGHT_BLUE_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate MAGENTA_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate PINK_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate PURPLE_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate YELLOW_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate ORANGE_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate LIME_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate GREEN_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate BLUE_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate BROWN_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedGate CYAN_GATE = new PaintedGate(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    public static final CanvasButton WALLPAPER_BUTTON = new CanvasButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton RED_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton WHITE_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton BLACK_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton GRAY_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton LIGHT_GRAY_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton LIGHT_BLUE_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton MAGENTA_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton PINK_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton PURPLE_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton YELLOW_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton ORANGE_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton LIME_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton GREEN_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton BLUE_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton BROWN_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedButton CYAN_BUTTON = new PaintedButton(FabricBlockSettings.copy(Blocks.OAK_PLANKS));

    public static final CanvasPlate WALLPAPER_PLATE = new CanvasPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate RED_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate WHITE_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate BLACK_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate GRAY_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate LIGHT_GRAY_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate LIGHT_BLUE_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate MAGENTA_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate PINK_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate PURPLE_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate YELLOW_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate ORANGE_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate LIME_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate GREEN_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate BLUE_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate BROWN_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static final PaintedPlate CYAN_PLATE = new PaintedPlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS));


    public static final CanvasSign WALLPAPER_SIGN = new CanvasSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.WALLPAPER);
    public static final CanvasWallSign WALLPAPER_WALL_SIGN = new CanvasWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.WALLPAPER);
    public static final PaintedSign BLACK_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BLACK);
    public static final PaintedWallSign BLACK_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BLACK);
    public static final PaintedSign BLUE_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BLUE);
    public static final PaintedWallSign BLUE_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BLUE);
    public static final PaintedSign CYAN_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.CYAN);
    public static final PaintedWallSign CYAN_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.CYAN);
    public static final PaintedSign BROWN_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BROWN);
    public static final PaintedWallSign BROWN_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.BROWN);
    public static final PaintedSign GRAY_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.GRAY);
    public static final PaintedWallSign GRAY_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.GRAY);
    public static final PaintedSign GREEN_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.GREEN);
    public static final PaintedWallSign GREEN_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.GREEN);
    public static final PaintedSign LIGHT_BLUE_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIGHT_BLUE);
    public static final PaintedWallSign LIGHT_BLUE_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIGHT_BLUE);
    public static final PaintedSign LIGHT_GRAY_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIGHT_GRAY);
    public static final PaintedWallSign LIGHT_GRAY_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIGHT_GRAY);
    public static final PaintedSign LIME_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIME);
    public static final PaintedWallSign LIME_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.LIME);
    public static final PaintedSign MAGENTA_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.MAGENTA);
    public static final PaintedWallSign MAGENTA_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.MAGENTA);
    public static final PaintedSign ORANGE_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.ORANGE);
    public static final PaintedWallSign ORANGE_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.ORANGE);
    public static final PaintedSign PINK_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.PINK);
    public static final PaintedWallSign PINK_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.PINK);
    public static final PaintedSign PURPLE_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.PURPLE);
    public static final PaintedWallSign PURPLE_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.PURPLE);
    public static final PaintedSign RED_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.RED);
    public static final PaintedWallSign RED_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.RED);
    public static final PaintedSign WHITE_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.WHITE);
    public static final PaintedWallSign WHITE_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.WHITE);
    public static final PaintedSign YELLOW_SIGN = new PaintedSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.YELLOW);
    public static final PaintedWallSign YELLOW_WALL_SIGN = new PaintedWallSign(FabricBlockSettings.copy(Blocks.OAK_SIGN), SignInit.YELLOW);

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_block"), WALLPAPER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_plank"), RED_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_plank"), BLACK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_plank"), WHITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_plank"), YELLOW_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_plank"), CYAN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_plank"), BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_plank"), LIGHT_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_plank"), LIGHT_GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_plank"), GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_plank"), GREEN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_plank"), LIME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_plank"), BROWN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_plank"), MAGENTA_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_plank"), PINK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_plank"), PURPLE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_plank"), ORANGE_BLOCK);
        
        ////

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "paper_slab"), WALLPAPER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_slab"), RED_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_slab"), BLACK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_slab"), WHITE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_slab"), YELLOW_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_slab"), CYAN_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_slab"), BLUE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_slab"), LIGHT_BLUE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_slab"), LIGHT_GRAY_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_slab"), GRAY_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_slab"), GREEN_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_slab"), LIME_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_slab"), BROWN_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_slab"), MAGENTA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_slab"), PINK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_slab"), PURPLE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_slab"), ORANGE_SLAB);

        ////

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "paper_door"), WALLPAPER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_door"), RED_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_door"), BLACK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_door"), WHITE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_door"), YELLOW_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_door"), CYAN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_door"), BLUE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_door"), LIGHT_BLUE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_door"), LIGHT_GRAY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_door"), GRAY_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_door"), GREEN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_door"), LIME_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_door"), BROWN_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_door"), MAGENTA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_door"), PINK_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_door"), PURPLE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_door"), ORANGE_DOOR);

        /// stairs

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_stair"), WALLPAPER_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_stair"), RED_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_stair"), BLACK_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_stair"), WHITE_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_stair"), YELLOW_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_stair"), CYAN_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_stair"), BLUE_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_stair"), LIGHT_BLUE_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_stair"), LIGHT_GRAY_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_stair"), GRAY_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_stair"), GREEN_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_stair"), LIME_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_stair"), BROWN_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_stair"), MAGENTA_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_stair"), PINK_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_stair"), PURPLE_STAIR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_stair"), ORANGE_STAIR);
        
        /// 

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "paper_trapdoor"), WALLPAPER_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_trapdoor"), RED_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_trapdoor"), BLACK_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_trapdoor"), WHITE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_trapdoor"), YELLOW_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_trapdoor"), CYAN_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_trapdoor"), BLUE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_trapdoor"), LIGHT_BLUE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_trapdoor"), LIGHT_GRAY_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_trapdoor"), GRAY_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_trapdoor"), GREEN_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_trapdoor"), LIME_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_trapdoor"), BROWN_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_trapdoor"), MAGENTA_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_trapdoor"), PINK_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_trapdoor"), PURPLE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_trapdoor"), ORANGE_TRAPDOOR);



        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_fence"), WALLPAPER_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_fence"), RED_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_fence"), BLACK_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_fence"), WHITE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_fence"), YELLOW_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_fence"), CYAN_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_fence"), BLUE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_fence"), LIGHT_BLUE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_fence"), LIGHT_GRAY_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_fence"), GRAY_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_fence"), GREEN_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_fence"), LIME_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_fence"), BROWN_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_fence"), MAGENTA_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_fence"), PINK_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_fence"), PURPLE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_fence"), ORANGE_FENCE);


        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_gate"), WALLPAPER_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_gate"), RED_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_gate"), BLACK_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_gate"), WHITE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_gate"), YELLOW_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_gate"), CYAN_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_gate"), BLUE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_gate"), LIGHT_BLUE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_gate"), LIGHT_GRAY_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_gate"), GRAY_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_gate"), GREEN_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_gate"), LIME_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_gate"), BROWN_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_gate"), MAGENTA_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_gate"), PINK_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_gate"), PURPLE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_gate"), ORANGE_GATE);


        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_button"), WALLPAPER_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_button"), RED_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_button"), BLACK_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_button"), WHITE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_button"), YELLOW_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_button"), CYAN_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_button"), BLUE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_button"), LIGHT_BLUE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_button"), LIGHT_GRAY_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_button"), GRAY_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_button"), GREEN_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_button"), LIME_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_button"), BROWN_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_button"), MAGENTA_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_button"), PINK_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_button"), PURPLE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_button"), ORANGE_BUTTON);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_plate"), WALLPAPER_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_plate"), RED_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_plate"), BLACK_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_plate"), WHITE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_plate"), YELLOW_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_plate"), CYAN_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_plate"), BLUE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_plate"), LIGHT_BLUE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_plate"), LIGHT_GRAY_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_plate"), GRAY_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_plate"), GREEN_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_plate"), LIME_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_plate"), BROWN_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_plate"), MAGENTA_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_plate"), PINK_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_plate"), PURPLE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_plate"), ORANGE_PLATE);


        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_sign"), WALLPAPER_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "wallpaper_wall_sign"), WALLPAPER_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_sign"), RED_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_sign"), BLACK_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_sign"), WHITE_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_sign"), YELLOW_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_sign"), CYAN_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_sign"), BLUE_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_sign"), LIGHT_BLUE_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_sign"), LIGHT_GRAY_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_sign"), GRAY_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_sign"), GREEN_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_sign"), LIME_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_sign"), BROWN_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_sign"), MAGENTA_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_sign"), PINK_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_sign"), PURPLE_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_sign"), ORANGE_SIGN);
        ///
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_wall_sign"), RED_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_wall_sign"), BLACK_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_wall_sign"), WHITE_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_wall_sign"), YELLOW_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_wall_sign"), CYAN_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_wall_sign"), BLUE_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_wall_sign"), LIGHT_BLUE_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_wall_sign"), LIGHT_GRAY_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_wall_sign"), GRAY_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_wall_sign"), GREEN_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_wall_sign"), LIME_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_wall_sign"), BROWN_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_wall_sign"), MAGENTA_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_wall_sign"), PINK_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_wall_sign"), PURPLE_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_wall_sign"), ORANGE_WALL_SIGN);

    }
}
