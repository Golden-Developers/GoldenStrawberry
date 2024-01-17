
package net.mcreator.goldenstrawberry.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.goldenstrawberry.procedures.SpaceSwordRightclickedProcedure;
import net.mcreator.goldenstrawberry.procedures.OuterSpaceSwordRightclickedOnBlockProcedure;

import java.util.List;

public class OuterSpaceSwordItem extends SwordItem {
	public OuterSpaceSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 115000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 298f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 96;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 26f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SpaceSwordRightclickedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("I DON'T HAVE ANY WORDS AGAIN!"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		OuterSpaceSwordRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
