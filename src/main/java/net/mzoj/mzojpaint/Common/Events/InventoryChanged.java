package net.mzoj.mzojpaint.Common.Events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.client.player.ClientPickBlockApplyCallback;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mzoj.mzojpaint.init.ItemInit;

public interface InventoryChanged {
    final TagKey<Item> paintbrushtag =
            TagKey.of(Registry.ITEM_KEY, new Identifier("mzojpaint", "paintbrushes"));
    final TagKey<Item> paintbuckettag  =
            TagKey.of(Registry.ITEM_KEY, new Identifier("mzojpaint", "paintbuckets"));

    static void Check(ItemStack offhandItem, PlayerEntity plr, int i) {
        if (offhandItem.isItemEqual(ItemInit.RED_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.RED_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.BLACK_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.BLACK_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.WHITE_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.WHITE_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.GRAY_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.GRAY_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.GREEN_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.GREEN_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.LIGHT_GRAY_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.LIGHT_GRAY_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.LIGHT_BLUE_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.LIGHT_BLUE_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.BLUE_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.BLUE_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.CYAN_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.CYAN_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.BROWN_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.BROWN_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.ORANGE_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.ORANGE_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.PINK_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.PINK_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.LIME_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.LIME_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.PURPLE_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.PURPLE_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.YELLOW_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.YELLOW_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
        if (offhandItem.isItemEqual(ItemInit.MAGENTA_PAINT.getDefaultStack())) {
            plr.getInventory().getStack(i).setCount(0);
            ItemStack paintbrush = new ItemStack(ItemInit.MAGENTA_PAINTBRUSH);
            plr.getInventory().setStack(i, paintbrush);
        }
    }

    Event<InventoryChanged> EVENT = EventFactory.createArrayBacked(InventoryChanged.class,
            (listeners) -> (Player) -> {
                BrushWithBucket(Player);
                updateInventoryBucketThing(Player);
                return ActionResult.PASS;
            });
    ActionResult updateinventory(PlayerEntity player);

    public static void updateInventoryBucketThing(PlayerEntity Player) {
        PlayerEntity plr = Player;
        ItemStack offhandItem = plr.getOffHandStack();
        if (offhandItem.getItem().getDefaultStack().isIn(paintbuckettag)) {
            for (int i = 36; --i >= 0;) {
                if (plr.getInventory().getStack(i).getItem().getDefaultStack().isIn(paintbrushtag)) {
                    InventoryChanged.Check(offhandItem, plr, i);
                }
            }
        }  else {
            PlayerEntity plr2 = Player;
            ItemStack offhandItem2 = plr2.getOffHandStack();
            if (!offhandItem2.getItem().getDefaultStack().isIn(paintbuckettag)) {
                for (int i = 36; --i >= 0;) {
                    if (plr2.getInventory().getStack(i).getItem().getDefaultStack().isIn(paintbrushtag)) {
                        plr2.getInventory().getStack(i).setCount(0);
                        ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH);
                        plr2.getInventory().setStack(i,paintbrush);
                    }
                }
            }

            if (offhandItem2.getItem().getDefaultStack().isIn(paintbrushtag)) {
                if (!plr2.getOffHandStack().isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                    plr.getOffHandStack().setCount(0);
                    plr2.getInventory().setStack(PlayerInventory.OFF_HAND_SLOT, ItemInit.PAINTBRUSH.getDefaultStack());
                }
            }
        }
    }

    public static void BrushWithBucket(PlayerEntity plr) {
        ItemStack offhandItem = plr.getOffHandStack();
        if (offhandItem.getItem().getDefaultStack().isIn(paintbuckettag)) {
            for (int i = 36; --i >= 0;) {
                if (plr.getInventory().getStack(i).getItem().getDefaultStack().isIn(paintbrushtag)) {
                    Check(offhandItem, plr, i);
                }
            }
        } else {
            for (int i = 36; --i >= 0;) {
                ItemStack pickedUp = plr.getInventory().getStack(i);
                if (pickedUp.getItem().getDefaultStack().isIn(paintbrushtag)) {
                    if (!pickedUp.isItemEqual(ItemInit.PAINTBRUSH.getDefaultStack())) {
                        plr.getInventory().getStack(i).setCount(0);
                        ItemStack paintbrush = new ItemStack(ItemInit.PAINTBRUSH);
                        plr.getInventory().setStack(i, paintbrush);
                    }
                }
            }
        }
    }
}


