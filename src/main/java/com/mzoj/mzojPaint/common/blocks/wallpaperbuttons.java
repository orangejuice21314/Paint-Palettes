package com.mzoj.mzojPaint.common.blocks;

import java.awt.TextComponent;

import com.mzoj.mzojPaint.Main;
//import com.mzoj.mzojPaint.common.util.mzojPaintTags;
import com.mzoj.mzojPaint.core.init.BlockInit;

import com.mzoj.mzojPaint.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class wallpaperbuttons extends ButtonBlock {
	

	public wallpaperbuttons(boolean p_51065_, Properties p_51066_) {
		super(p_51065_, p_51066_);
		// TODO Auto-generated constructor stub
	}

	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	
	static void PaintStair (BlockState blockRightClicked, Level Level, BlockPos BlockPos, BlockState blockReplacing, Player player) {		
		Direction direction = blockRightClicked.getValue(ButtonBlock.FACING);
		AttachFace wallAttach = blockRightClicked.getValue(ButtonBlock.FACE);

		BlockState one = blockReplacing.setValue(ButtonBlock.FACING, direction);
		BlockState two = one.setValue(ButtonBlock.FACE, wallAttach);
		
		Level.setBlockAndUpdate(BlockPos, two); 
		wallpaper.damageItem(player.getOffhandItem(), player, false);
	}

	
	public InteractionResult use(BlockState blockRightClicked, Level Level, BlockPos BlockPos, Player player,
			InteractionHand Interactionhand, BlockHitResult BlockHitResult) {
		Player plr = player;
		
		ItemStack item = player.getItemInHand(Interactionhand);
		if(item.getItem().getDefaultInstance().is(paintbrushtag)) {
			if (!item.is(ItemInit.PAINTBRUSH.get())) {
				player.playSound(SoundEvents.SLIME_SQUISH, 0.5F, 1F); 
			}
			
			//blue
			if (item.is(ItemInit.BLUE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BLUE_BUTTON.get().defaultBlockState();
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BLACK_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BROWN_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.CYAN_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GREEN_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GRAY_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_BLUE_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_GRAY_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.MAGENTA_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIME_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.ORANGE_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PINK_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PURPLE_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.RED_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.WHITE_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.YELLOW_BUTTON.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
            return InteractionResult.SUCCESS;		
		}
		return super.use(blockRightClicked, Level, BlockPos, plr, Interactionhand, BlockHitResult);
	}


	@Override
	protected SoundEvent getSound(boolean p_51102_) {
		// TODO Auto-generated method stub
		return SoundEvents.WOODEN_BUTTON_CLICK_ON;
	}
	
		
}
