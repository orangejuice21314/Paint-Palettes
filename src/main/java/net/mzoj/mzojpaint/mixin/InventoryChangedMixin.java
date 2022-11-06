package net.mzoj.mzojpaint.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.util.ActionResult;
import net.mzoj.mzojpaint.Common.Events.InventoryChanged;
import net.mzoj.mzojpaint.Main;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInventory.class)
public abstract class InventoryChangedMixin {

	@Shadow @Final public PlayerEntity player;

	@Inject(method = "updateItems", at = @At("TAIL"))
	private void itemadded(CallbackInfo info) {
		InventoryChanged.EVENT.invoker().updateinventory(this.player);
	}
}
