package me.xkyrell.kstnt.dynamite.service;

import lombok.NonNull;
import me.xkyrell.kstnt.dynamite.Dynamite;
import java.util.Collection;
import java.util.Optional;

public interface DynamiteService {

    void register(@NonNull String name, @NonNull Dynamite dynamite);

    void unregister(@NonNull String name);

    Resolver getResolver();

    interface Resolver {

        Optional<Dynamite> resolve(@NonNull String name);

        Collection<? extends Dynamite> getDynamites();

    }
}
