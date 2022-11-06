package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.common.tileentity.WallpaperSignBlockEntity;
import com.mzoj.mzojPaint.core.init.BlockEntityInit;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;

public class wallpapersign extends StandingSignBlock {

	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	
	public wallpapersign(Properties p_56273_, WoodType p_56274_) {
		super(p_56273_, p_56274_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BlockEntity newBlockEntity(BlockPos p_154556_, BlockState p_154557_) {
		// TODO Auto-generated method stub
		return new WallpaperSignBlockEntity(p_154556_, p_154557_);
	}
	
	public static void setSign(BlockState blockToReplace, BlockState blockReplacing, BlockPos pos, Level level){
		int rotation = blockToReplace.getValue(StandingSignBlock.ROTATION);
		BlockState blockReplacing_rotation = blockReplacing.setValue(StandingSignBlock.ROTATION, rotation);
		
		//BLOCK ENTITY STUFF YAY!!!!
		SignBlockEntity toReplaceSignBlockEntity = (SignBlockEntity) level.getBlockEntity(pos);
		Component toReplaceText0 = toReplaceSignBlockEntity.getMessage(0, true);
		Component toReplaceText1 = toReplaceSignBlockEntity.getMessage(1, true);
		Component toReplaceText2 = toReplaceSignBlockEntity.getMessage(2, true);
		Component toReplaceText3 = toReplaceSignBlockEntity.getMessage(3, true);
		
		level.setBlock(pos, blockReplacing_rotation, 3);
		
		SignBlockEntity toPlaceSignBlockEntity = (SignBlockEntity) level.getBlockEntity(pos);
		toPlaceSignBlockEntity.setMessage(0, toReplaceText0);
		toPlaceSignBlockEntity.setMessage(1, toReplaceText1);
		toPlaceSignBlockEntity.setMessage(2, toReplaceText2);
		toPlaceSignBlockEntity.setMessage(3, toReplaceText3);
	}
	
	@Override
	public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player p_60506_,
			InteractionHand p_60507_, BlockHitResult p_60508_) {
		
		ItemStack item = p_60506_.getItemInHand(p_60507_);
		String itemID = item.getDescriptionId();
		if(item.getItem().getDefaultInstance().is(paintbrushtag)) {
			if (!item.is(ItemInit.PAINTBRUSH.get())) {
				p_60506_.playSound(SoundEvents.SLIME_SQUISH, 0.5F, 1F); 
			}
						
			//red
			if (item.is(ItemInit.RED_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.RED_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.WHITE_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLACK_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//red
			if (item.is(ItemInit.BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLUE_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BROWN_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.CYAN_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//red
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_BLUE_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_GRAY_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GRAY_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//red
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.ORANGE_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.YELLOW_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PURPLE_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//red
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PINK_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.MAGENTA_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			//red
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GREEN_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//red
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIME_SIGN.get().defaultBlockState();	
				setSign(p_60503_, blockstate, p_60505_, p_60504_);
				wallpaper.damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
		}
		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
} 
