package com.aether.inventory.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class EnchanterFuelSlot extends Slot {
	private final AbstractFurnaceContainer container;

	public EnchanterFuelSlot(AbstractFurnaceContainer container, IInventory inventory, int index, int xPosition, int yPosition) {
		super(inventory, index, xPosition, yPosition);
		this.container = container;
	}

	/**
	 * Check if the stack is allowed to be placed in this slot, used for armor
	 * slots as well as furnace fuel.
	 */
	@Override
	public boolean isItemValid(ItemStack stack) {
		 return container.isFuel(stack);
	}
}