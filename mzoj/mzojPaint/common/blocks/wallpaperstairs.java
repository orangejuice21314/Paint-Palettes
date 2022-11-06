package com.mzoj.mzojPaint.common.blocks;

import java.util.function.Supplier;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.data.BlockFamily.Variant;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

public class wallpaperstairs extends StairBlock {
	public wallpaperstairs(BlockState p_56862_, Properties p_56863_) {
		super(p_56862_, p_56863_);
		// TODO Auto-generated constructor stub
	}

	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);


	static void PaintStair (BlockState blockRightClicked, Level Level, BlockPos BlockPos, BlockState blockReplacing, Player player) {
		//Level.setBlock(BlockPos, blockReplacing, blockReplacing.getHarvestLevel()); 
			
		StairsShape Shape = blockRightClicked.getValue(StairBlock.SHAPE);
		Direction Facing = blockRightClicked.getValue(StairBlock.FACING);
		
		//blockReplacing.setValue(StairBlock.SHAPE, Shape);
		BlockState one = blockReplacing.setValue(StairBlock.FACING, Facing);
		BlockState two = one.setValue(StairBlock.FACING, Facing);
		BlockState three = two.setValue(StairBlock.HALF, blockRightClicked.getValue(StairBlock.HALF));
		BlockState four = three.setValue(StairBlock.WATERLOGGED, blockRightClicked.getValue(StairBlock.WATERLOGGED));
		BlockState five = four.setValue(StairBlock.SHAPE, Shape);

		Level.setBlockAndUpdate(BlockPos, five); 
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
				BlockState blockstate = BlockInit.BLUE_STAIR.get().defaultBlockState();
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BLACK_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.BROWN_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.CYAN_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GREEN_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.GRAY_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_BLUE_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIGHT_GRAY_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.MAGENTA_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.LIME_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.ORANGE_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PINK_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.PURPLE_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.RED_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.WHITE_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			//blue
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				player.swing(Interactionhand);
				BlockState blockstate = BlockInit.YELLOW_STAIR.get().defaultBlockState();	
				PaintStair(blockRightClicked, Level, BlockPos, blockstate, player);
			}
			
		}	
		
		return super.use(blockRightClicked, Level, BlockPos, player, Interactionhand, BlockHitResult);
	}
	
}