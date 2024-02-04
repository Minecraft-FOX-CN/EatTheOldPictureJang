package eat.tujang.block;

import com.mojang.datafixers.types.templates.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class OldPictureJangBlock extends Block {
    public OldPictureJangBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (player != null) {
            player.sendMessage(Text.translatable("text.eatujang.on_old_picture_jang_block_break"));
            player.kill();
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.eatujang.old_picture_jang.introduction.1").formatted(Formatting.GOLD));
        }else {
            tooltip.add(Text.translatable("tooltip.eatujang.old_picture_jang.introduction"));
        }
    }
}
