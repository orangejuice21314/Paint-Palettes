package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.common.tileentity.*;
import com.mzoj.mzojPaint.common.tileentity.WallpaperSignBlockEntity;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;

public class paintedsign extends StandingSignBlock {

	
	public paintedsign(Properties p_56273_, WoodType p_56274_) {
		super(p_56273_, p_56274_);
		// TODO Auto-generated constructor stub
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
	public BlockEntity newBlockEntity(BlockPos p_154556_, BlockState p_154557_) {
		// TODO Auto-generated method stub
		if (this.asBlock().defaultBlockState().is(BlockInit.RED_SIGN.get())) {
			return new RedSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.BLUE_SIGN.get())) {
			return new BlueSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.WHITE_SIGN.get())) {
			return new WhiteSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.BLACK_SIGN.get())) {
			return new BlackSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.BROWN_SIGN.get())) {
			return new BrownSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.GREEN_SIGN.get())) {
			return new GreenSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.ORANGE_SIGN.get())) {
			return new OrangeSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.YELLOW_SIGN.get())) {
			return new YellowSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.LIME_SIGN.get())) {
			return new LimeSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.CYAN_SIGN.get())) {
			return new CyanSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.LIGHT_BLUE_SIGN.get())) {
			return new LightBlueSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.BLUE_SIGN.get())) {
			return new BlueSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.GRAY_SIGN.get())) {
			return new GraySignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.LIGHT_GRAY_SIGN.get())) {
			return new LightGraySignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.MAGENTA_SIGN.get())) {
			return new MagentaSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.PINK_SIGN.get())) {
			return new PinkSignBlockEntity(p_154556_, p_154557_);
		}
		if (this.asBlock().defaultBlockState().is(BlockInit.PURPLE_SIGN.get())) {
			return new PurpleSignBlockEntity(p_154556_, p_154557_);
		}
		return new WallpaperSignBlockEntity(p_154556_, p_154557_);
	}
	
	@Override
	public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player p_60506_,
			InteractionHand p_60507_, BlockHitResult p_60508_) {
		
		ItemStack item = p_60506_.getItemInHand(p_60507_);
		String itemID = item.getDescriptionId();
		
		//unpaint
		if (item.is(ItemInit.PAINT_SCRAPER.get())) {
			p_60506_.playSound(SoundEvents.AXE_STRIP, 0.75F, 1F); 
			p_60506_.swing(p_60507_);
			BlockState blockstate = BlockInit.WALLPAPER_SIGN.get().defaultBlockState();		 
			setSign(p_60503_, blockstate, p_60505_, p_60504_);				
			
		}

		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
	
	
}
