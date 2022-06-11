package com.mzoj.mzojPaint.common.blocks;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class wallpapertrapdoors extends TrapDoorBlock {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);
	
	public wallpapertrapdoors(Properties p_52737_) {
		super(p_52737_);
		// TODO Auto-generated constructor stub
	}
	
	static void PaintDoor(BlockState blockRightClicked, Level Level, BlockPos BlockPos, BlockState blockReplacing, Player player) {
		Direction direction = blockRightClicked.getValue(TrapDoorBlock.FACING);
		boolean open = blockRightClicked.getValue(TrapDoorBlock.OPEN);
		VoxelShape top = blockRightClicked.getCollisionShape(Level, BlockPos);
		
		BlockState one = blockReplacing.setValue(TrapDoorBlock.OPEN, open);
		BlockState two = one.setValue(TrapDoorBlock.FACING, direction);
		BlockState newTrapdoor = two.setValue(TrapDoorBlock.HALF, blockRightClicked.getValue(TrapDoorBlock.HALF));

		
		Level.setBlockAndUpdate(BlockPos, Blocks.AIR.defaultBlockState());
		Level.setBlockAndUpdate(BlockPos, newTrapdoor);
		wallpaper.damageItem(player.getOffhandItem(), player, false);
	}
	
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		Player plr = player;
        ItemStack mainHandItem = plr.getMainHandItem();
        
        if(mainHandItem.getItem().getDefaultInstance().is(paintbrushtag)) {    			
            if (!mainHandItem.is(ItemInit.PAINTBRUSH.get())) {
                plr.playSound(SoundEvents.SLIME_SQUISH, 0.5F, 1F); 
            }
            if (mainHandItem.is(ItemInit.RED_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.RED_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.PURPLE_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.BLACK_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.BLACK_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.BLUE_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.BLUE_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.BROWN_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.BROWN_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.CYAN_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.CYAN_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.GRAY_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.GRAY_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.GREEN_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.GREEN_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.LIGHT_BLUE_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.LIGHT_GRAY_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.LIME_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.LIME_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.MAGENTA_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.ORANGE_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.PINK_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.PINK_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.YELLOW_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            if (mainHandItem.is(ItemInit.WHITE_PAINTBRUSH.get())) {
                plr.swing(hand);
                BlockState blockstate = BlockInit.WHITE_TRAPDOOR.get().defaultBlockState();
                PaintDoor(state, level, pos, blockstate, player);
            }
            return InteractionResult.SUCCESS;
        }
        return super.use(state, level, pos, player, hand, hit);
	}	
}