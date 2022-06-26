package com.mzoj.mzojPaint.common.events;

import javax.swing.text.html.parser.Entity;

import com.mzoj.mzojPaint.Main;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerEvent.ItemPickupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@EventBusSubscriber(modid = Main.MOD_ID, bus = Bus.FORGE)
public class paintbucket {
	static ResourceLocation paintbrushTag = new ResourceLocation(Main.MOD_ID, "paintbrushes");
	static ResourceLocation paintbucketTag = new ResourceLocation(Main.MOD_ID, "paintbuckets");
	
	private static final TagKey<Item> paintbuckettag = TagKey.create(Registry.ITEM_REGISTRY, paintbucketTag);
	private static final TagKey<Item> paintbrushtag = TagKey.create(Registry.ITEM_REGISTRY, paintbrushTag);

	static void Check(ItemStack offhandItem, Player plr, int i) {
		if (offhandItem.is(ItemInit.WHITE_PAINT.get())) {
				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.WHITE_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.BLACK_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.BLACK_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.BROWN_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.BROWN_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
			
		}
		
		if (offhandItem.is(ItemInit.CYAN_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.CYAN_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.GRAY_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.GRAY_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.GREEN_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.GREEN_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.LIGHT_BLUE_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.LIGHT_BLUE_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.LIGHT_GRAY_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.LIGHT_GRAY_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.LIME_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.LIME_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.MAGENTA_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.MAGENTA_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.ORANGE_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.ORANGE_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.PINK_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.PINK_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.PURPLE_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.PURPLE_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.RED_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.RED_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
			
		}
		
		if (offhandItem.is(ItemInit.YELLOW_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.YELLOW_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
				
		}
		
		if (offhandItem.is(ItemInit.BLUE_PAINT.get())) {

				plr.getInventory().getItem(i).shrink(1);
				ItemStack paintbrush = new ItemStack(ItemInit.BLUE_PAINTBRUSH.get());
				plr.getInventory().add(i, paintbrush);
			
		}
	}
	
	@SubscribeEvent
	public static void PaintbucketPicked(final LivingEquipmentChangeEvent event) {
		LivingEntity ent = event.getEntityLiving();
		
		if (event.getEntityLiving() instanceof Player) {
			Player plr = (Player) ent;			
			ItemStack offhandItem = plr.getOffhandItem();
			if (offhandItem.getItem().getDefaultInstance().is(paintbuckettag)) {
				for (int i = 36; --i >= 0;) {
					if (plr.getInventory().getItem(i).getItem().getDefaultInstance().is(paintbrushtag)) { 
						Check(offhandItem, plr, i);
					}
				}
			}  else {
				Player plr2 = (Player) ent;
				ItemStack offhandItem2 = plr2.getOffhandItem();
				if (!offhandItem2.getItem().getDefaultInstance().is(paintbrushtag)) {
					for (int i = 36; --i >= 0;) {
						if (plr2.getInventory().getItem(i).getItem().getDefaultInstance().is(paintbrushtag)) {
							plr2.getInventory().getItem(i).shrink(1);
							ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH.get());
							plr2.getInventory().add(i, paintbrush);
						}		
					}
				}
				
				if (offhandItem2.getItem().getDefaultInstance().is(paintbrushtag)) {
					if (plr2.getOffhandItem() != ItemInit.PAINTBRUSH.get().getDefaultInstance()) {
						plr2.getInventory();
						int offhandslot = Inventory.SLOT_OFFHAND;
						
						offhandItem2.shrink(1);
						plr2.getInventory().add(offhandslot, ItemInit.PAINTBRUSH.get().getDefaultInstance());
					}
				}
			}			
		}
		
	}
	
	@SubscribeEvent
	public static void PaintbrushPickedUpWhileOffhand(final ItemPickupEvent event) {
		Player plr = event.getPlayer();
		ItemStack offhandItem = plr.getOffhandItem();
		ItemStack pickedUp = event.getStack();
		if (offhandItem.getItem().getDefaultInstance().is(paintbuckettag)) {
			for (int i = 36; --i >= 0;) {
				if (plr.getInventory().getItem(i).getItem().getDefaultInstance().is(paintbrushtag)) {
					Check(offhandItem, plr, i);
				}
			}	
		} else {
			if (pickedUp.getItem().getDefaultInstance().is(paintbrushtag)) {
				if (!pickedUp.is(ItemInit.PAINTBRUSH.get())) {
					for (int i = 36; --i >= 0;) {
						if (plr.getInventory().getItem(i).getItem().getDefaultInstance().is(paintbrushtag)) {
							plr.getInventory().getItem(i).shrink(1);
							ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH.get());
							plr.getInventory().add(i, paintbrush);
						}
					}	
				}
			}	
		}
	}
	
	@SubscribeEvent
	public static void PaintbrushInventoryAdded(final PlayerContainerEvent.Close event) {
		Player plr = event.getPlayer();
		ItemStack offhandItem = plr.getOffhandItem();
		if (offhandItem.getItem().getDefaultInstance().is(paintbuckettag)) {
			for (int i = 36; --i >= 0;) {
				if (plr.getInventory().getItem(i).getItem().getDefaultInstance().is(paintbrushtag)) {
					Check(offhandItem, plr, i);
				}	
			}	
		}
	}
	
	//@SubscribeEvent
	//public static void PaintbrushThrown(final ItemTossEvent event) {
	//	ItemEntity thrownItem = event.getEntityItem();
	//	Player plr = event.getPlayer();
	//	if (ItemTags.getAllTags().getTag(paintbrushTag).contains(thrownItem.getItem().getItem())) {
	//		
	//	}
	//}
} 