package net.furqas.furqasmod.item;

import net.furqas.furqasmod.FurqasMod;
import net.furqas.furqasmod.item.custom.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FurqasMod.MOD_ID);


    public static final RegistryObject<Item> MANGANESE = ITEMS.register("manganese",
            () -> new Item(new Item.Properties().food(ModFoods.MANGANESE)));

    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register
            ("raw_manganese", () -> new Item(new Item.Properties()));

    public static void register(IEventBus iEventBus){
        ITEMS.register(iEventBus);
    }

}




