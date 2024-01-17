package net.mcreator.goldenstrawberry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class SpaceSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double speed = 0;
		double yaw = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 25);
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		speed = 0.1;
		yaw = entity.getYRot();
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.FIREBALL.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((speed * Math.cos((yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y() + 0.2), (speed * Math.sin((yaw + 90) * (Math.PI / 180))));
			}
		}
	}
}
