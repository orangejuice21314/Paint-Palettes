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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class wallpapergates extends FenceGateBlock {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	//make a table of all the item
	
	public wallpapergates(Properties p_49795_) {
		super(p_49795_);
	}
	
	static void PaintStair (BlockState blockRightClicked, Level Level, BlockPos BlockPos, BlockState blockReplacing, Player player) {
		//Level.setBlock(BlockPos, blockReplacing, blockReplacing.getHarvestLevel()); 
			
		Direction Facing = blockRightClicked.getValue(FenceGateBlock.FACING);
		Boolean open = blockRightClicked.getValue(FenceGateBlock.OPEN);

		//blockReplacing.setValue(StairBlock.SHAPE, Shape);
		BlockState one = blockReplacing.setValue(FenceGateBlock.FACING, Facing);
		BlockState two = one.setValue(FenceGateBlock.OPEN, open);

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
				BlockState blockstate = BlockInit.BLUE_GATE.get().defaultBlockState();
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BLACK_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BROWN_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.CYAN_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GREEN_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GRAY_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_BLUE_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_GRAY_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.MAGENTA_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIME_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.ORANGE_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PINK_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PURPLE_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.RED_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.WHITE_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.YELLOW_GATE.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			return InteractionResult.SUCCESS;
		}	
		
		return super.use(blockRightClicked, Level, BlockPos, player, Interactionhand, BlockHitResult);
	}
	
		
}
