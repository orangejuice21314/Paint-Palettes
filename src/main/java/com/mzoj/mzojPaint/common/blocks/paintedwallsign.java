package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.common.tileentity.RedSignBlockEntity;
import com.mzoj.mzojPaint.common.tileentity.WallpaperSignBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class paintedwallsign extends WallSignBlock {

	public paintedwallsign(Properties p_58068_, WoodType p_58069_) {
		super(p_58068_, p_58069_);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public BlockEntity newBlockEntity(BlockPos p_154556_, BlockState p_154557_) {
		// TODO Auto-generated method stub
		return new WallpaperSignBlockEntity(p_154556_, p_154557_);
	}
}
