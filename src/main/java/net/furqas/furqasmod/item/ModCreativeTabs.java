package net.furqas.furqasmod.item;

import net.furqas.furqasmod.FurqasMod;
import net.furqas.furqasmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FurqasMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FURQAS_TAB = MOD_CREATIVE_TAB.register("furqas_tab",
            () -> CreativeModeTab.builder().icon(() ->
                    new ItemStack(ModItems.MANGANESE.get())).title(Component.translatable("creativetab.furqasmod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MANGANESE.get());
                        pOutput.accept(ModItems.RAW_MANGANESE.get());
                        pOutput.accept(ModBlocks.MANGANESE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_MANGANESE_BLOCK.get());
                        pOutput.accept(ModBlocks.MANGANESE_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        MOD_CREATIVE_TAB.register(eventBus);
    }
}
