package net.mzoj.mzojpaint.Common.Blocks;

import net.minecraft.block.*;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.mzoj.mzojpaint.init.BlockInit;
import net.mzoj.mzojpaint.init.ItemInit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Canvas {
    public static final TagKey<Item> paintbrushtag =
            TagKey.of(Registry.ITEM_KEY, new Identifier("mzojpaint", "paintbrushes"));
    public static final TagKey<Item> paintbuckettag  =
            TagKey.of(Registry.ITEM_KEY, new Identifier("mzojpaint", "paintbuckets"));
    public static final TagKey<Block> slabs  =
            TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "wooden_slabs"));
    public static final TagKey<Block> planks  =
            TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "planks"));

    public static final TagKey<Block> doors  =
            TagKey.of(Registry.BLOCK_KEY, new Identifier("minecraft", "wooden_doors"));


    static void damageItem(ItemStack item, PlayerEntity plr, Boolean take2Damage) {
        Boolean doDamage = take2Damage;
        if (doDamage == true) {
            //plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
        }
        if (!plr.isCreative()) {
            if (item.isIn(paintbuckettag)) {
                item.setDamage(item.getDamage()+1);
                if (take2Damage) {
                    item.setDamage(item.getDamage()+1);
                }
                if (item.getMaxDamage() <= item.getDamage()) {
                    item.setCount(0);

                    ItemStack newBucket = new ItemStack(Items.BUCKET);
                    plr.getInventory().insertStack(newBucket);


                    //	ResourceLocation paintbrushTag = new ResourceLocation()
                    //	boolean isInTag = ItemTags.getAllTags().getTag(null)
                    for (int i = 36; --i >= 0;) {
                        ItemStack slotItem = plr.getInventory().getStack(i);
                        if (item.getItem().getDefaultStack().isIn(paintbrushtag)) {
                            if (doDamage == true) {
                                //plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
                                plr.getInventory().getStack(i).setCount(0);
                            }
                            plr.getInventory().getStack(i).setCount(0);
                            ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH);
                            plr.getInventory().setStack(i, paintbrush);
                        }
                    }
                }
            } else {
                for (int i = 36; --i >= 0;) {
                    ItemStack slotItem = plr.getInventory().getStack(i);
                    if (item.isIn(paintbrushtag)) {
                        if (doDamage == true) {
                            //plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
                            plr.getInventory().getStack(i).setCount(0);
                        }
                        plr.getInventory().getStack(i).setCount(0);
                        ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH);
                        plr.getInventory().setStack(i, paintbrush);
                    }
                }
            }
        }
    }

    static Block findBlockStateToPlace(BlockState blockReplacing, ItemStack paintbrush) {
        if (blockReplacing.isOf(BlockInit.WALLPAPER_BLOCK.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_BLOCK.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_BLOCK.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_SLAB.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_SLAB.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_SLAB.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_DOOR.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_DOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_DOOR.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_STAIR.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_STAIR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_STAIR;
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_STAIR;
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_TRAPDOOR.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_TRAPDOOR.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_TRAPDOOR.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_FENCE.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_FENCE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_FENCE.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_GATE.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_GATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_GATE.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_BUTTON.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_BUTTON.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_BUTTON.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_PLATE.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_PLATE.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_PLATE.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_WALL_SIGN.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_WALL_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_WALL_SIGN.getDefaultState().getBlock();
            }
        }
        if (blockReplacing.isOf(BlockInit.WALLPAPER_SIGN.getDefaultState().getBlock())) {
            if (paintbrush.isItemEqual(ItemInit.RED_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.RED_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.WHITE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.WHITE_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLACK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLACK_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GRAY_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_GRAY_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_GRAY_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIGHT_BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIGHT_BLUE_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BLUE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BLUE_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.CYAN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.CYAN_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PINK_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PINK_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.MAGENTA_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.MAGENTA_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.PURPLE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.PURPLE_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.ORANGE_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.ORANGE_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.YELLOW_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.YELLOW_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.BROWN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.BROWN_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.LIME_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.LIME_SIGN.getDefaultState().getBlock();
            }
            if (paintbrush.isItemEqual(ItemInit.GREEN_PAINTBRUSH.getDefaultStack())) {
                return BlockInit.GREEN_SIGN.getDefaultState().getBlock();
            }
        }
        return null;
    }

    public static void placeBlock(ItemStack item, World world, BlockPos blockPos,
                           BlockState blockReplacing, PlayerEntity player, Hand hand) {

       if (item.isIn(paintbrushtag) && !item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
           Block blockToPlace = findBlockStateToPlace(blockReplacing, item);
           if (blockToPlace != null) {
               world.setBlockState(blockPos, blockToPlace.getDefaultState());
               if (blockReplacing.isIn(slabs)) {
                   if (blockReplacing.get(SlabBlock.TYPE) == SlabType.DOUBLE) {
                       damageItem(player.getOffHandStack(), player, true);
                   }
               } else {
                   damageItem(player.getOffHandStack(), player, false);
               }
           }
       }
    }

    public static class CanvasBlock extends Block {
        public CanvasBlock(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (state.getBlock().equals(BlockInit.WALLPAPER_BLOCK)) {
                    if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                        player.swingHand(hand);
                        placeBlock(item, world, pos, state, player, hand);
                        player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                    }
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasSlab extends SlabBlock {
        public CanvasSlab(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);

                    world.setBlockState(pos,
                            findBlockStateToPlace(state, item).getDefaultState().with(SlabBlock.TYPE,
                                    state.get(SlabBlock.TYPE)));

                    if ((state.get(SlabBlock.TYPE) == SlabType.DOUBLE)) {
                        damageItem(player.getOffHandStack(), player, true);
                    } else{
                        damageItem(player.getOffHandStack(), player, false);
                    }
                    
                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasDoor extends DoorBlock {
        public CanvasDoor(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);

                    if (state.get(DoorBlock.HALF) == DoubleBlockHalf.UPPER) {
                        pos = pos.down();
                    }

                    world.setBlockState(pos, Blocks.AIR.getDefaultState());

                    world.setBlockState(pos,
                            findBlockStateToPlace(state, item).getDefaultState().with(DoorBlock.FACING,
                                    state.get(DoorBlock.FACING))
                                    .with(DoorBlock.OPEN, state.get(DoorBlock.OPEN))
                                    .with(DoorBlock.HALF, DoubleBlockHalf.LOWER)
                                    .with(DoorBlock.HINGE, state.get(DoorBlock.HINGE)));
                    world.setBlockState(pos.up(1),
                            findBlockStateToPlace(state, item).getDefaultState().with(DoorBlock.FACING,
                                            state.get(DoorBlock.FACING))
                                    .with(DoorBlock.OPEN, state.get(DoorBlock.OPEN))
                                    .with(DoorBlock.HALF, DoubleBlockHalf.UPPER)
                                    .with(DoorBlock.HINGE, state.get(DoorBlock.HINGE)));

                    damageItem(player.getOffHandStack(), player, false);


                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);

                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasStair extends StairsBlock {

        /**
         * Access widened by fabric-transitive-access-wideners-v1 to accessible
         *
         * @param baseBlockState
         * @param settings
         */
        public CanvasStair(BlockState baseBlockState, Settings settings) {
            super(baseBlockState, settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);
                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState()
                            .with(StairsBlock.FACING, state.get(StairsBlock.FACING))
                            .with(StairsBlock.HALF, state.get(StairsBlock.HALF))
                            .with(StairsBlock.SHAPE, state.get(StairsBlock.SHAPE)));

                    damageItem(player.getOffHandStack(), player, false);


                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                }
            }
            return ActionResult.PASS;
        }
    };

    public static class CanvasTrapdoor extends TrapdoorBlock {
        public CanvasTrapdoor(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);

                    world.setBlockState(pos,
                            findBlockStateToPlace(state, item).getDefaultState().with(DoorBlock.FACING,
                                            state.get(DoorBlock.FACING))
                                    .with(TrapdoorBlock.HALF, state.get(TrapdoorBlock.HALF))
                                    .with(TrapdoorBlock.FACING, state.get(TrapdoorBlock.FACING))
                                    .with(TrapdoorBlock.OPEN, state.get(TrapdoorBlock.OPEN)));

                    damageItem(player.getOffHandStack(), player, false);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);

                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasFence extends FenceBlock {
        public CanvasFence(Settings settings) {
            super(settings);
        }
        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if (item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);
                    //FenceBlock blockPlacing = (FenceBlock) findBlockStateToPlace(state, item);
                    world.setBlockState(pos,
                            findBlockStateToPlace(state, item).getDefaultState());

                    damageItem(player.getOffHandStack(), player, false);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasGate extends FenceGateBlock {
        public CanvasGate(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isIn(paintbrushtag)) {
                if (!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);

                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState()
                                    .with(FenceGateBlock.FACING, state.get(FenceGateBlock.FACING))
                                    .with(FenceGateBlock.OPEN, state.get(FenceGateBlock.OPEN)));

                    damageItem(player.getOffHandStack(), player, false);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);

                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasButton extends WoodenButtonBlock {
        public CanvasButton(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if (item.isIn(paintbrushtag)) {
                if(!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);
                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState()
                            .with(AbstractButtonBlock.FACING, state.get(AbstractButtonBlock.FACING))
                            .with(AbstractButtonBlock.FACE, state.get(AbstractButtonBlock.FACE)));

                    damageItem(player.getOffHandStack(), player, false);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasPlate extends PressurePlateBlock {

        /**
         * Access widened by fabric-transitive-access-wideners-v1 to accessible
         *
         * @param type
         * @param settings
         */
        public CanvasPlate(ActivationRule type, Settings settings) {
            super(type, settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if (item.isIn(paintbrushtag)) {
                if(!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    player.swingHand(hand);
                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState());
                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);

                    damageItem(player.getOffHandStack(), player, false);

                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasSign extends SignBlock {

        public CanvasSign(Settings settings, SignType signType) {
            super(settings, signType);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if (item.isIn(paintbrushtag)) {
                if(!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    SignBlockEntity statesign = (SignBlockEntity) world.getBlockEntity(pos);
                    Text line0 = statesign.getTextOnRow(0, true);
                    Text line1 = statesign.getTextOnRow(1, true);
                    Text line2 = statesign.getTextOnRow(2, true);
                    Text line3 = statesign.getTextOnRow(3, true);

                    player.swingHand(hand);
                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState()
                            .with(SignBlock.ROTATION, state.get(SignBlock.ROTATION)));

                    damageItem(player.getOffHandStack(), player, false);


                    SignBlockEntity placedsign = (SignBlockEntity) world.getBlockEntity(pos);
                    placedsign.setTextOnRow(0, line0);
                    placedsign.setTextOnRow(1, line1);
                    placedsign.setTextOnRow(2, line2);
                    placedsign.setTextOnRow(3, line3);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class CanvasWallSign extends WallSignBlock {

        public CanvasWallSign(Settings settings, SignType signType) {
            super(settings, signType);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if (item.isIn(paintbrushtag)) {
                if(!item.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    SignBlockEntity statesign = (SignBlockEntity) world.getBlockEntity(pos);
                    Text line0 = statesign.getTextOnRow(0, true);
                    Text line1 = statesign.getTextOnRow(1, true);
                    Text line2 = statesign.getTextOnRow(2, true);
                    Text line3 = statesign.getTextOnRow(3, true);

                    player.swingHand(hand);
                    world.setBlockState(pos, findBlockStateToPlace(state, item).getDefaultState()
                            .with(WallSignBlock.FACING, state.get(WallSignBlock.FACING)));

                    damageItem(player.getOffHandStack(), player, false);


                    SignBlockEntity placedsign = (SignBlockEntity) world.getBlockEntity(pos);
                    placedsign.setTextOnRow(0, line0);
                    placedsign.setTextOnRow(1, line1);
                    placedsign.setTextOnRow(2, line2);
                    placedsign.setTextOnRow(3, line3);

                    player.playSound(SoundEvents.BLOCK_SLIME_BLOCK_PLACE, 0.5F, 1F);
                    return ActionResult.SUCCESS;
                }
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class PaintedBlock extends Block {
        public PaintedBlock(Settings settings) {
            super(settings);
        }
        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                world.setBlockState(pos, BlockInit.WALLPAPER_BLOCK.getDefaultState());
                player.swingHand(hand);
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);

            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedSlab extends SlabBlock {
        public PaintedSlab(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos,
                        BlockInit.WALLPAPER_SLAB.getDefaultState().with(SlabBlock.TYPE, state.get(SlabBlock.TYPE)));

                BlockState slabblock = world.getBlockState(pos);


                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedDoor extends DoorBlock {
        public PaintedDoor(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);

            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                if (state.get(DoorBlock.HALF) == DoubleBlockHalf.UPPER) {
                    pos = pos.down();
                }

                world.setBlockState(pos, Blocks.AIR.getDefaultState());

                world.setBlockState(pos,
                        BlockInit.WALLPAPER_DOOR.getDefaultState().with(DoorBlock.FACING,
                                        state.get(DoorBlock.FACING))
                                .with(DoorBlock.OPEN, state.get(DoorBlock.OPEN))
                                .with(DoorBlock.HALF, DoubleBlockHalf.LOWER)
                                .with(DoorBlock.HINGE, state.get(DoorBlock.HINGE)));
                world.setBlockState(pos.up(1),
                        BlockInit.WALLPAPER_DOOR.getDefaultState().with(DoorBlock.FACING,
                                        state.get(DoorBlock.FACING))
                                .with(DoorBlock.OPEN, state.get(DoorBlock.OPEN))
                                .with(DoorBlock.HALF, DoubleBlockHalf.UPPER)
                                .with(DoorBlock.HINGE, state.get(DoorBlock.HINGE)));
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedStair extends StairsBlock {
        public PaintedStair(BlockState baseBlockState, Settings settings) {
            super(baseBlockState, settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_STAIR.getDefaultState()
                        .with(StairsBlock.SHAPE, state.get(StairsBlock.SHAPE))
                        .with(StairsBlock.FACING, state.get(StairsBlock.FACING))
                        .with(StairsBlock.HALF, state.get(StairsBlock.HALF)));
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
            }
            return ActionResult.PASS;
        }

    };

    public static class PaintedTrapdoor extends TrapdoorBlock {

        public PaintedTrapdoor(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_TRAPDOOR.getDefaultState()
                        .with(TrapdoorBlock.HALF, state.get(TrapdoorBlock.HALF))
                        .with(TrapdoorBlock.FACING, state.get(TrapdoorBlock.FACING))
                        .with(TrapdoorBlock.OPEN, state.get(TrapdoorBlock.OPEN)));
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedFence extends FenceBlock {

        public PaintedFence(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_FENCE.getDefaultState());
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedGate extends FenceGateBlock {

        public PaintedGate(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_GATE.getDefaultState()
                        .with(FenceGateBlock.FACING, state.get(FenceGateBlock.FACING))
                        .with(FenceGateBlock.OPEN, state.get(FenceGateBlock.OPEN)));
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }

    };

    public static class PaintedButton extends WoodenButtonBlock {
        public PaintedButton(Settings settings) {
            super(settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_BUTTON.getDefaultState()
                        .with(AbstractButtonBlock.FACING, state.get(AbstractButtonBlock.FACING))
                        .with(AbstractButtonBlock.FACE, state.get(AbstractButtonBlock.FACE)));
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class PaintedPlate extends PressurePlateBlock {

        /**
         * Access widened by fabric-transitive-access-wideners-v1 to accessible
         *
         * @param type
         * @param settings
         */
        public PaintedPlate(ActivationRule type, Settings settings) {
            super(type, settings);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_PLATE.getDefaultState());
                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

    public static class PaintedSign extends SignBlock {

        public PaintedSign(Settings settings, SignType signType) {
            super(settings, signType);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                SignBlockEntity statesign = (SignBlockEntity) world.getBlockEntity(pos);
                Text line0 = statesign.getTextOnRow(0, true);
                Text line1 = statesign.getTextOnRow(1, true);
                Text line2 = statesign.getTextOnRow(2, true);
                Text line3 = statesign.getTextOnRow(3, true);

                player.swingHand(hand);

                world.setBlockState(pos, BlockInit.WALLPAPER_SIGN.getDefaultState()
                        .with(SignBlock.ROTATION, state.get(SignBlock.ROTATION)));

                SignBlockEntity placedsign = (SignBlockEntity) world.getBlockEntity(pos);
                placedsign.setTextOnRow(0, line0);
                placedsign.setTextOnRow(1, line1);
                placedsign.setTextOnRow(2, line2);
                placedsign.setTextOnRow(3, line3);


                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };
    public static class PaintedWallSign extends WallSignBlock {
        public PaintedWallSign(Settings settings, SignType signType) {
            super(settings, signType);
        }

        @Override
        public ActionResult onUse(BlockState state, World world,
                                  BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            ItemStack item = player.getStackInHand(hand);
            if(item.isItemEqual(ItemInit.PAINT_SCRAPER.getDefaultStack())) {
                SignBlockEntity statesign = (SignBlockEntity) world.getBlockEntity(pos);

                Text line0 = statesign.getTextOnRow(0, true);
                Text line1 = statesign.getTextOnRow(1, true);
                Text line2 = statesign.getTextOnRow(2, true);
                Text line3 = statesign.getTextOnRow(3, true);

                player.swingHand(hand);
                world.setBlockState(pos, BlockInit.WALLPAPER_WALL_SIGN.getDefaultState()
                        .with(WallSignBlock.FACING, state.get(WallSignBlock.FACING)));

                SignBlockEntity placedsign = (SignBlockEntity) world.getBlockEntity(pos);
                placedsign.setTextOnRow(0, line0);
                placedsign.setTextOnRow(1, line1);
                placedsign.setTextOnRow(2, line2);
                placedsign.setTextOnRow(3, line3);

                player.playSound(SoundEvents.ITEM_AXE_STRIP, 0.5F, 1F);
                return ActionResult.SUCCESS;
            }
            return super.onUse(state, world, pos, player, hand, hit);
        }
    };

}
