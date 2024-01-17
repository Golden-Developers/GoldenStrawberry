
package net.mcreator.goldenstrawberry.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import net.mcreator.goldenstrawberry.procedures.SpaceNuggetItemIsDroppedByPlayerProcedure;

import java.util.List;

public class SpaceNuggetItem extends Item {
	public SpaceNuggetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(4).saturationMod(20f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 100;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("I guess it's just a nugget..."));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		SpaceNuggetItemIsDroppedByPlayerProcedure.execute(entity.level(), entity);
		return true;
	}
}
