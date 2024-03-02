package eat.tujang.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class OldPictureJangBlock extends Block {
    public OldPictureJangBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        this.spawnBreakParticles(world, player, pos, state);
        world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 7.5f, true, World.ExplosionSourceType.BLOCK);
        player.sendMessage(Text.translatable("text.eatujang.on_old_picture_jang_block_break"), true);
        world.emitGameEvent(GameEvent.BLOCK_DESTROY, pos, GameEvent.Emitter.of(player, state));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, java.util.List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.eatujang.old_picture_jang.introduction.1").formatted(Formatting.RED));
        } else {
            tooltip.add(Text.translatable("tooltip.eatujang.old_picture_jang.introduction"));
        }
    }
}
