
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldenstrawberry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.goldenstrawberry.GoldenstrawberryMod;

public class GoldenstrawberryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoldenstrawberryMod.MODID);
	public static final RegistryObject<CreativeModeTab> GOLDEN_STRAWBERRY_MODS = REGISTRY.register("golden_strawberry_mods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.goldenstrawberry.golden_strawberry_mods")).icon(() -> new ItemStack(GoldenstrawberryModItems.STRAWBERRY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GoldenstrawberryModItems.STRAWBERRY.get());
				tabData.accept(GoldenstrawberryModItems.GOLDEN_STRAWBERRY.get());
			}).withSearchBar().build());
}
