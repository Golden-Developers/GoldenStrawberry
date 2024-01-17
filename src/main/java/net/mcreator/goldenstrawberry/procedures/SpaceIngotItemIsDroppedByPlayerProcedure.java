package net.mcreator.goldenstrawberry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.goldenstrawberry.init.GoldenstrawberryModItems;

public class SpaceIngotItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GoldenstrawberryModItems.SPACE_PROTECTOR.get())) : false) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("goldenstrawberry:killed_by_power_of_black_hole")))), 0);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Space_Ingot> What... Oh, is it Space Protector? Okay, you're too lucky, I will kill you next time!"), false);
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(GoldenstrawberryModItems.SPACE_INGOT.get())) : false) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("goldenstrawberry:killed_by_power_of_black_hole")))), 100);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("<Space_Ingot> Sorry bro, I just have ultra black hole power..."), false);
		}
	}
}
