package me.xkyrell.kstnt.dynamite.attribute.resolver;

import com.google.common.base.Preconditions;
import lombok.NonNull;
import me.xkyrell.kstnt.dynamite.attribute.Attribute;

public interface AttributeCreator {

    <V, A extends Attribute<V>> A getOrCreate(@NonNull A attribute);

    default void create(@NonNull Attribute<?> attribute) {
        getOrCreate(attribute);
    }

    default void createAttributes(Attribute<?>... attributes) {
        for (Attribute<?> attribute : attributes) {
            Preconditions.checkNotNull(attribute, "Attribute cannot be null");
            getOrCreate(attribute);
        }
    }
}
