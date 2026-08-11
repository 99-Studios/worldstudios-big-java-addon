package net.mcreator.worldstudiosworld.world.features.treedecorators;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;

import com.mojang.serialization.MapCodec;

@EventBusSubscriber
public class DarkenedSandsFruitDecorator extends CocoaDecorator {
	public static MapCodec<DarkenedSandsFruitDecorator> CODEC = MapCodec.unit(DarkenedSandsFruitDecorator::new);
	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerTreeDecorator(RegisterEvent event) {
		event.register(Registries.TREE_DECORATOR_TYPE, Identifier.parse("worldstudios_world:darkened_sands_tree_fruit_decorator"), () -> DECORATOR_TYPE);
	}

	public DarkenedSandsFruitDecorator() {
		super(0.2f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		RandomSource random = context.random();
		if (!(random.nextFloat() >= 0.2F)) {
			List<BlockPos> logs = context.logs();
			if (!logs.isEmpty()) {
				int treeY = logs.getFirst().getY();
				logs.stream().filter(pos -> pos.getY() - treeY <= 2).forEach(pos -> {
					for (Direction direction : Direction.Plane.HORIZONTAL) {
						if (random.nextFloat() <= 0.25F) {
							Direction opposite = direction.getOpposite();
							BlockPos cocoaPos = pos.offset(opposite.getStepX(), 0, opposite.getStepZ());
							if (context.isAir(cocoaPos)) {
								context.setBlock(cocoaPos, oriented(Blocks.AIR.defaultBlockState(), opposite));
							}
						}
					}
				});
			}
		}
	}

	@SuppressWarnings("deprecation")
	private static BlockState oriented(BlockState blockstate, Direction direction) {
		return switch (direction) {
			case SOUTH -> blockstate.rotate(Rotation.CLOCKWISE_180);
			case EAST -> blockstate.rotate(Rotation.CLOCKWISE_90);
			case WEST -> blockstate.rotate(Rotation.COUNTERCLOCKWISE_90);
			default -> blockstate;
		};
	}
}