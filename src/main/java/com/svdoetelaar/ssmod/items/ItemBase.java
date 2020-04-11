package com.svdoetelaar.ssmod.items;

import com.svdoetelaar.ssmod.SandersMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(SandersMod.TAB));
    }
}
