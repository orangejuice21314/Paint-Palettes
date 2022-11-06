package com.mzoj.mzojPaint.common.blocks;

import java.util.function.Predicate;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class wallpaperdoors extends DoorBlock {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	
	public wallpaperdoors(Properties p_52737_) {
		super(p_52737_);
		// TODO Auto-generated constructor stub
	}
	
	static void SetDoor(Level Level, BlockPos BlockPos, BlockState newDoor) {
        Level.setBlockAndUpdate(BlockPos.above(), newDoor.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER));
        Level.setBlockAndUpdate(BlockPos, newDoor.setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER));
	}
	
	static void PaintDoor(BlockState blockRightClicked, Level Level, BlockPos BlockPos, BlockState blockReplacing, Player player) {
		Direction direction = blockRightClicked.getValue(DoorBlock.FACING);
		DoorHingeSide hinge = blockRightClicked.getValue(DoorBlock.HINGE);
		boolean open = blockRightClicked.getValue(DoorBlock.OPEN);
	
		if (blockRightClicked.getValue(DoorBlock.HALF) == DoubleBlockHalf.UPPER) {
			BlockPos = BlockPos.below();
		}
		
		BlockState one = blockReplacing.setValue(DoorBlock.OPEN, open);
		BlockState two = one.setValue(DoorBlock.FACING, direction);
		BlockState newDoor = two.setValue(DoorBlock.HINGE, hinge);
		
		Level.setBlockAndUpdate(BlockPos, Blocks.AIR.defaultBlockState());
        SetDoor(Level, BlockPos, newDoor);

		wallpaper.damageItem(player.getOffhandItem(), player, false);
	}
			
	public InteractionResult use(BlockState blockRightClicked, Level Level, BlockPos BlockPos, Player player,
			InteractionHand Interactionhand, BlockHitResult BlockHitResult) {
		ItemStack item = player.getMainHandItem();
		
		if(item.getItem().getDefaultInstance().is(paintbrushtag)) {
			if (!item.is(ItemInit.PAINTBRUSH.get())) {
				player.playSound(SoundEvents.SLIME_SQUISH, 0.5F, 1F); 
			}
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.RED_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.PURPLE_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.BLACK_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.BLUE_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.BLUE_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.BROWN_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.CYAN_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.GRAY_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.GREEN_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.LIGHT_BLUE_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.LIGHT_GRAY_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.LIME_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.MAGENTA_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.ORANGE_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.PINK_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.YELLOW_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
                player.swing(Interactionhand);
                BlockState blockstate = BlockInit.WHITE_DOOR.get().defaultBlockState();
                PaintDoor(blockRightClicked, Level, BlockPos, blockstate, player);
            }
            return InteractionResult.SUCCESS;
		}	
		
		return super.use(blockRightClicked, Level, BlockPos, player, Interactionhand, BlockHitResult);
	}
}