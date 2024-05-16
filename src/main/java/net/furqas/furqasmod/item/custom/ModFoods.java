package net.furqas.furqasmod.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MANGANESE = new
            FoodProperties.Builder().saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION,300),100f).build();
}
