package com.svdoetelaar.ssmod.init;

import com.svdoetelaar.ssmod.SandersMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SandersMod.MOD_ID)
@Mod.EventBusSubscriber(modid = SandersMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {

    public static final Block WITHER_ESSENCE_ORE_BLOCK = new Block(Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(0.3f, 10f)
            .sound(SoundType.STONE))
            .setRegistryName("wither_essence_ore");

    public static final Item WITHER_ESSENCE_ORE_ITEM = new BlockItem(WITHER_ESSENCE_ORE_BLOCK,
            new Item.Properties()
                    .group(SandersMod.TAB)
                    .maxStackSize(64))
            .setRegistryName("wither_essence_ore");

    @SubscribeEvent
    public static void registerBocks(final RegistryEvent.Register<net.minecraft.block.Block> BLOCKS) {
        BLOCKS.getRegistry().register(WITHER_ESSENCE_ORE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> ITEMS) {
        ITEMS.getRegistry().register(WITHER_ESSENCE_ORE_ITEM);
    }
}
