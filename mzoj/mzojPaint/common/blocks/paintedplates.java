package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.core.init.BlockInit;

import com.mzoj.mzojPaint.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class paintedplates extends PressurePlateBlock {


	public paintedplates(Sensitivity p_55253_, Properties p_55254_) {
		super(p_55253_, p_55254_);
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
			BlockState blockstate = BlockInit.WALLPAPER_PLATE.get().defaultBlockState();		 
			p_60504_.setBlockAndUpdate(p_60505_, blockstate); 	
		}

		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
	
		
}
