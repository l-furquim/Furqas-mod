package net.furqas.furqasmod.block;

import net.furqas.furqasmod.FurqasMod;
import net.furqas.furqasmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FurqasMod.MOD_ID);

    public static final RegistryObject<Block> MANGANESE_BLOCK =
            registerBlock("manganese_block", () -> new Block
                    (BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> MANGANESE_ORE =
            registerBlock("manganese_ore",()-> new Block(
                    BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(2f).requiresCorrectToolForDrops().sound(SoundType.POLISHED_DEEPSLATE)
                            ));
    public static final RegistryObject<Block> RAW_MANGANESE_BLOCK =
            registerBlock("raw_manganese_ore", ()-> new Block(
                    BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).sound(SoundType.NETHER_GOLD_ORE)
            ));


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
