package net.supersand24.firstmod.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.supersand24.firstmod.FirstMod;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> ENDER_SHARD = ITEMS.register("ender_shard",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 1), 1f)
                            .alwaysEat()
                            .build()
                    )
            )
    );

}
