package com.mzoj.mzojPaint.common.blocks;

import java.awt.TextComponent;

import com.mzoj.mzojPaint.Main;
//import com.mzoj.mzojPaint.common.util.mzojPaintTags;
import com.mzoj.mzojPaint.core.init.BlockInit;

import com.mzoj.mzojPaint.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class wallpaper extends Block {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);

	//make a table of all the item
	
	static void damageItem(ItemStack item, Player plr, Boolean take2Damage) {
		Boolean doDamage = take2Damage;
		if (doDamage == true) {
			//plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
		}
		if (!plr.isCreative()) {
			if (item.getItem().getDefaultInstance().is(paintbuckettag)) {
				item.setDamageValue(item.getDamageValue()+1);
				if (item.getMaxDamage() == item.getDamageValue()) {
					item.shrink(1);
					
					//ItemStack newBucket = new ItemStack(Items.BUCKET);
					//plr.addItem(newBucket);
					
					
				//	ResourceLocation paintbrushTag = new ResourceLocation()
				//	boolean isInTag = ItemTags.getAllTags().getTag(null)
					for (int i = 36; --i >= 0;) {
						//ItemStack slotItem = plr.getInventory().getItem(i);
						if (item.getItem().getDefaultInstance().is(paintbrushtag)) {
							if (doDamage == true) {
								//plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
								//plr.getInventory().getItem(i).shrink(1);
							}
							plr.getInventory().getItem(i).shrink(1);
							ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH.get());
							plr.getInventory().add(i, paintbrush);
						}		
					}
				}
			} else {
				for (int i = 36; --i >= 0;) {
					//ItemStack slotItem = plr.getInventory().getItem(i);
					if (item.getItem().getDefaultInstance().is(paintbrushtag)) {
						if (doDamage == true) {
							//plr.sendMessage(new net.minecraft.network.chat.TextComponent("This is sendmessage example string."), null);
							//plr.getInventory().getItem(i).shrink(1);
						}
						plr.getInventory().getItem(i).shrink(1);
						ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH.get());
						plr.getInventory().add(i, paintbrush);
					}		
				}
			}
		}
	}
	
	public wallpaper(Properties p_49795_) {
		super(p_49795_);
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
				BlockState blockstate = BlockInit.RED_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 	
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//white
			if (item.is(ItemInit.WHITE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.WHITE_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 	
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//black
			if (item.is(ItemInit.BLACK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLACK_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//brown
			if (item.is(ItemInit.BROWN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BROWN_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//cyan
			if (item.is(ItemInit.CYAN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.CYAN_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//gray
			if (item.is(ItemInit.GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GRAY_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//green
			if (item.is(ItemInit.GREEN_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.GREEN_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//light blue
			if (item.is(ItemInit.LIGHT_BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_BLUE_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//light gray
			if (item.is(ItemInit.LIGHT_GRAY_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIGHT_GRAY_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//lime
			if (item.is(ItemInit.LIME_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.LIME_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//magenta
			if (item.is(ItemInit.MAGENTA_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.MAGENTA_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//orange
			if (item.is(ItemInit.ORANGE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.ORANGE_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//pink
			if (item.is(ItemInit.PINK_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PINK_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//purple
			if (item.is(ItemInit.PURPLE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.PURPLE_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
			//yellow
			if (item.is(ItemInit.YELLOW_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.YELLOW_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}

			//blue
			if (item.is(ItemInit.BLUE_PAINTBRUSH.get())) {
				p_60506_.swing(p_60507_);
				BlockState blockstate = BlockInit.BLUE_PLANK.get().defaultBlockState();		 
				p_60504_.setBlock(p_60505_, blockstate, 3); 				
				damageItem(p_60506_.getOffhandItem(), p_60506_, false);
			}
			
		}	
		return super.use(p_60503_, p_60504_, p_60505_, p_60506_, p_60507_, p_60508_);
	}
	
		
}
