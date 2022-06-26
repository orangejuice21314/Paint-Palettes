package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.core.init.BlockInit;

import com.mzoj.mzojPaint.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class paintedstairs extends StairBlock {

	

	public paintedstairs(BlockState p_56862_, Properties p_56863_) {
		super(p_56862_, p_56863_);
		// TODO Auto-generated constructor stub
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
			BlockState blockstate = BlockInit.WALLPAPER_STAIR.get().defaultBlockState();	
			
			StairsShape Shape = p_60503_.getValue(StairBlock.SHAPE);
			Direction Facing = p_60503_.getValue(StairBlock.FACING);
			
			//blockReplacing.setValue(StairBlock.SHAPE, Shape);
			BlockState one = blockstate.setValue(StairBlock.FACING, Facing);
			BlockState two = one.setValue(StairBlock.FACING, Facing);
			BlockState three = two.setValue(StairBlock.HALF, p_60503_.getValue(StairBlock.HALF));
			BlockState four = three.setValue(StairBlock.WATERLOGGED, p_60503_.getValue(StairBlock.WATERLOGGED));
			BlockState five = four.setValue(StairBlock.SHAPE, Shape);

			p_60504_.setBlockAndUpdate(p_60505_, five); 			 
		}

		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
	
		
}
