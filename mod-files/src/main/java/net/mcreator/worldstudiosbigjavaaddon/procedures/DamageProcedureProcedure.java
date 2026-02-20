package net.mcreator.worldstudiosbigjavaaddon.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class DamageProcedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (BoolArgumentType.getBool(arguments, "Damage") == false) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = true;
				_player.onUpdateAbilities();
			}
		}
	}
}