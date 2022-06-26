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
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

public class paintedtrapdoors extends TrapDoorBlock {
	
	public paintedtrapdoors(Properties p_57526_) {
		super(p_57526_);
		// TODO Auto-generated constructor stub
	}

	public InteractionResult use(BlockState blockRightClicked, Level level, BlockPos blockpos, Player p_60506_,
			InteractionHand p_60507_, BlockHitResult p_60508_) {
		
		ItemStack item = p_60506_.getItemInHand(p_60507_);
		String itemID = item.getDescriptionId();
		
		if (item.is(ItemInit.PAINT_SCRAPER.get())) {
			Direction direction = blockRightClicked.getValue(TrapDoorBlock.FACING);
			boolean open = blockRightClicked.getValue(TrapDoorBlock.OPEN);
			VoxelShape top = blockRightClicked.getCollisionShape(level, blockpos);
			
			
			p_60506_.playSound(SoundEvents.AXE_STRIP, 0.75F, 1F); 
			p_60506_.swing(p_60507_);
			
			level.setBlockAndUpdate(blockpos, Blocks.AIR.defaultBlockState());
			
			BlockState blockstate = BlockInit.PAPER_TRAPDOOR.get().defaultBlockState();		 
			BlockState one = blockstate.setValue(TrapDoorBlock.OPEN, open);
			BlockState two = one.setValue(TrapDoorBlock.FACING, direction);
			BlockState newTrapdoor = two.setValue(TrapDoorBlock.HALF, blockRightClicked.getValue(TrapDoorBlock.HALF));;
			
			level.setBlockAndUpdate(blockpos, newTrapdoor);			
		
            return InteractionResult.SUCCESS;
		}

		return super.use(blockRightClicked, level, blockpos, p_60506_, p_60507_, p_60508_);
	}
	
}
