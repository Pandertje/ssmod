package com.svdoetelaar.ssmod.util;

import com.svdoetelaar.ssmod.SandersMod;
import com.svdoetelaar.ssmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SandersMod.MOD_ID);

    public static void init(){
        ITEMS.register((IEventBus) FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items

    public static final RegistryObject<Item> WITHER_INGOT = ITEMS.register("wither_ingot", ItemBase::new);


}
