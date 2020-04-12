package com.aether.tileentity;

import com.aether.Aether;
import com.aether.api.AetherAPI;
import com.aether.inventory.container.EnchanterContainer;
import com.aether.item.crafting.AetherRecipeTypes;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class EnchanterTileEntity extends AbstractFurnaceTileEntity {

	public EnchanterTileEntity() {
		super(AetherTileEntityTypes.ENCHANTER, AetherRecipeTypes.ENCHANTING);
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container." + Aether.MODID + ".enchanter");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return new EnchanterContainer(id, player, this, this.furnaceData);
	}
	
	@Override
	protected int getBurnTime(ItemStack stack) {
		return !stack.isEmpty()? AetherAPI.getEnchantmentFuelTime(stack.getItem()) : 0;
	}

}
