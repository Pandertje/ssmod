package com.svdoetelaar.ssmod.init;

import com.svdoetelaar.ssmod.SandersMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = SandersMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(SandersMod.MOD_ID)
public class ItemInit {

    public static final Item WITHER_INGOT =
            new Item(new Item.Properties()
                    .group(SandersMod.TAB)
                    .maxStackSize(12))
                    .setRegistryName("wither_ingot");


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> ITEMS) {
        ITEMS.getRegistry().register(WITHER_INGOT);
    }
}

