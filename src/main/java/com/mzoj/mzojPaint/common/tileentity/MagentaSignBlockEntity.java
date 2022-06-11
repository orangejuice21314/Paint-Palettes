package com.mzoj.mzojPaint.common.tileentity;

import com.mzoj.mzojPaint.core.init.BlockEntityInit;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MagentaSignBlockEntity extends SignBlockEntity {

	public MagentaSignBlockEntity(BlockPos p_155700_, BlockState p_155701_) {
		super(p_155700_, p_155701_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BlockEntityType<?> getType() {
		// TODO Auto-generated method stub
		return BlockEntityInit.MAGENTA_SIGN_ENTITY.get();
	}
	
}
