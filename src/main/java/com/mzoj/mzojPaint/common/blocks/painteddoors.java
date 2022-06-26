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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.BlockHitResult;

public class painteddoors extends DoorBlock {
	
	public painteddoors(Properties p_52737_) {
		super(p_52737_);
		// TODO Auto-generated constructor stub
	}

	public InteractionResult use(BlockState blockRightClicked, Level p_60504_, BlockPos p_60505_, Player p_60506_,
			InteractionHand p_60507_, BlockHitResult p_60508_) {
		
		ItemStack item = p_60506_.getItemInHand(p_60507_);
		String itemID = item.getDescriptionId();
		
		//unpaint
		if (item.is(ItemInit.PAINT_SCRAPER.get())) {
			Direction direction = blockRightClicked.getValue(DoorBlock.FACING);
			DoorHingeSide hinge = blockRightClicked.getValue(DoorBlock.HINGE);
			boolean open = blockRightClicked.getValue(DoorBlock.OPEN);
			
			p_60506_.playSound(SoundEvents.AXE_STRIP, 0.75F, 1F); 
			p_60506_.swing(p_60507_);
			
			if (blockRightClicked.getValue(DoorBlock.HALF) == DoubleBlockHalf.UPPER) {
				p_60505_ = p_60505_.below();
			}
			
			p_60504_ .setBlockAndUpdate(p_60505_, Blocks.AIR.defaultBlockState());
			
			BlockState blockstate = BlockInit.PAPER_DOOR.get().defaultBlockState();		 
			BlockState one = blockstate.setValue(DoorBlock.OPEN, open);
			BlockState two = one.setValue(DoorBlock.FACING, direction);
			BlockState newDoor = two.setValue(DoorBlock.HINGE, hinge);
			
			p_60504_.setBlockAndUpdate(p_60505_.above(), newDoor.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER));
			p_60504_.setBlockAndUpdate(p_60505_, newDoor.setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER)); 				
			
            return InteractionResult.SUCCESS;
		}

		return super.use(blockRightClicked, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
}
