package me.xkyrell.kstnt.dynamite;

import lombok.NonNull;
import me.xkyrell.kstnt.dynamite.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nullable;
import java.util.List;

public interface Dynamite {

    @NonNull
    String getName();

    @NonNull
    DynamiteIcon getIcon();

    @NonNull
    ItemStack getRenderedIcon();

    @Nullable
    List<Attribute<?>> getAttributes();

}
