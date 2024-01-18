
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldenstrawberry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.goldenstrawberry.item.StrawberryItem;
import net.mcreator.goldenstrawberry.item.StrawberriesWithoutStalkItem;
import net.mcreator.goldenstrawberry.item.SpaceSwordItem;
import net.mcreator.goldenstrawberry.item.SpaceProtectorItem;
import net.mcreator.goldenstrawberry.item.SpacePickaxeItem;
import net.mcreator.goldenstrawberry.item.SpaceNuggetItem;
import net.mcreator.goldenstrawberry.item.SpaceItem;
import net.mcreator.goldenstrawberry.item.SpaceIngotItem;
import net.mcreator.goldenstrawberry.item.SpaceFluidItem;
import net.mcreator.goldenstrawberry.item.SpaceArmorItem;
import net.mcreator.goldenstrawberry.item.OuterSpaceSwordItem;
import net.mcreator.goldenstrawberry.item.OuterSpaceIngotItem;
import net.mcreator.goldenstrawberry.item.OuterSpaceFluidItem;
import net.mcreator.goldenstrawberry.item.LightningBoltItem;
import net.mcreator.goldenstrawberry.item.KnifeItem;
import net.mcreator.goldenstrawberry.item.GoldenStrawberryWithoutStalkItem;
import net.mcreator.goldenstrawberry.item.GoldenStrawberryItem;
import net.mcreator.goldenstrawberry.GoldenstrawberryMod;

public class GoldenstrawberryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GoldenstrawberryMod.MODID);
	public static final RegistryObject<Item> SPACE_NUGGET = REGISTRY.register("space_nugget", () -> new SpaceNuggetItem());
	public static final RegistryObject<Item> SPACE_ROSE = block(GoldenstrawberryModBlocks.SPACE_ROSE);
	public static final RegistryObject<Item> SPACE_INGOT = REGISTRY.register("space_ingot", () -> new SpaceIngotItem());
	public static final RegistryObject<Item> SPACE_PROTECTOR = REGISTRY.register("space_protector", () -> new SpaceProtectorItem());
	public static final RegistryObject<Item> SPACE_FLUID_BUCKET = REGISTRY.register("space_fluid_bucket", () -> new SpaceFluidItem());
	public static final RegistryObject<Item> SPACE_PICKAXE = REGISTRY.register("space_pickaxe", () -> new SpacePickaxeItem());
	public static final RegistryObject<Item> SPACE_SWORD = REGISTRY.register("space_sword", () -> new SpaceSwordItem());
	public static final RegistryObject<Item> LIGHTNING_BOLT = REGISTRY.register("lightning_bolt", () -> new LightningBoltItem());
	public static final RegistryObject<Item> STRAWBERRY = REGISTRY.register("strawberry", () -> new StrawberryItem());
	public static final RegistryObject<Item> GOLDEN_STRAWBERRY = REGISTRY.register("golden_strawberry", () -> new GoldenStrawberryItem());
	public static final RegistryObject<Item> SPACE_BLOCK = block(GoldenstrawberryModBlocks.SPACE_BLOCK);
	public static final RegistryObject<Item> SPACE_ARMOR_HELMET = REGISTRY.register("space_armor_helmet", () -> new SpaceArmorItem.Helmet());
	public static final RegistryObject<Item> SPACE_ARMOR_CHESTPLATE = REGISTRY.register("space_armor_chestplate", () -> new SpaceArmorItem.Chestplate());
	public static final RegistryObject<Item> SPACE_ARMOR_LEGGINGS = REGISTRY.register("space_armor_leggings", () -> new SpaceArmorItem.Leggings());
	public static final RegistryObject<Item> SPACE_ARMOR_BOOTS = REGISTRY.register("space_armor_boots", () -> new SpaceArmorItem.Boots());
	public static final RegistryObject<Item> SPACE = REGISTRY.register("space", () -> new SpaceItem());
	public static final RegistryObject<Item> OUTER_SPACE_FLUID_BUCKET = REGISTRY.register("outer_space_fluid_bucket", () -> new OuterSpaceFluidItem());
	public static final RegistryObject<Item> OUTER_SPACE_INGOT = REGISTRY.register("outer_space_ingot", () -> new OuterSpaceIngotItem());
	public static final RegistryObject<Item> OUTER_SPACE_SWORD = REGISTRY.register("outer_space_sword", () -> new OuterSpaceSwordItem());
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> STRAWBERRIES_WITHOUT_STALK = REGISTRY.register("strawberries_without_stalk", () -> new StrawberriesWithoutStalkItem());
	public static final RegistryObject<Item> GOLDEN_STRAWBERRY_WITHOUT_STALK = REGISTRY.register("golden_strawberry_without_stalk", () -> new GoldenStrawberryWithoutStalkItem());
	public static final RegistryObject<Item> SPACE_ZOMBIE_SPAWN_EGG = REGISTRY.register("space_zombie_spawn_egg", () -> new ForgeSpawnEggItem(GoldenstrawberryModEntities.SPACE_ZOMBIE, -1, -16777216, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
