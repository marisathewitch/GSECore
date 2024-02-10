package com.irgendwer01.gsecore.mixins;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import nl.requios.effortlessbuilding.helper.InventoryHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InventoryHelper.class)
public class InventoryHelperMixin {

    @Inject(method = "findItemStackInInventory", at = @At("HEAD"), cancellable = true)
    private static void findItemStackInInventory(EntityPlayer player, Block block, CallbackInfoReturnable<ItemStack> cir) {
        cir.setReturnValue(ItemStack.EMPTY);
    }
}
