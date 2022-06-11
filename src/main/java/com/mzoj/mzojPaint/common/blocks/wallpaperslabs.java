package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
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
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.BlockHitResult;

public class wallpaperslabs extends SlabBlock {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	
	private static void PaintSlab (BlockState p_60503_, Level p_60504_, BlockPos p_60505_, BlockState blockstate, Player p_60506_) {
		
		p_60504_.setBlockAndUpdate(p_60505_, Blocks.AIR.defaultBlockState());
		p_60504_.setBlockAndUpdate(p_60505_, blockstate.setValue(SlabBlock.TYPE, SlabType.TOP)); 
		if (p_60503_.getValue(SlabBlock.TYPE) == SlabType.TOP) {
			p_60504_.setBlockAndUpdate(p_60505_, blockstate.setValue(SlabBlock.TYPE, SlabType.TOP)); 
		}
		if (p_60503_.getValue(SlabBlock.TYPE) == SlabType.BOTTOM) {
			p_60504_.setBlockAndUpdate(p_60505_, blockstate.setValue(SlabBlock.TYPE, SlabType.BOTTOM)); 
		}
		if (p_60503_.getValue(SlabBlock.TYPE) == SlabType.DOUBLE) {
			p_60504_.setBlockAndUpdate(p_60505_, blockstate.setValue(SlabBlock.TYPE, SlabType.DOUBLE)); 
			wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, true);
			wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, true);
			return;
		}
		//damageItem(p_60506_.getOffhandItem(), p_60506_);
		wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
	}
	
	public wallpaperslabs(Properties p_56359_) {
		super(p_56359_);
		// TODO Auto-generated constructor stub
	}
	
	public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player p_60506_,
			InteractionHand p_60507_, BlockHitResult p_60508_) {
		Player plr = p_60506_;
		
		ItemStack item = p_60506_.getItemInHand(p_60507_);
		String itemID = item.getDescriptionId();
		if(item.getItem().getDefaultInstance().is(paintbrushtag)) {
			if (!item.is(ItemInit.PAINTBRUSH.get())) {
				p_60506_.playSound(SoundEvents.SLIME_SQUISH, 0.5F, 1F); 
			}
			
			//blue
			if (item.is(ItemInit.BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLUE_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLACK_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BROWN_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.CYAN_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GREEN_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GRAY_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_BLUE_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_GRAY_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.MAGENTA_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIME_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.ORANGE_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PINK_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PURPLE_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.RED_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.WHITE_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			//blue
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.YELLOW_SLAB.get().defaultBlockState();	
				PaintSlab(p_60503_, p_60504_, p_60505_, blockstate, p_60506_);
			}
			
		}	
		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
}