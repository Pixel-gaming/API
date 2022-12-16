package com.c0d3m4513r.pluginapi.Scoreboard;

import com.c0d3m4513r.pluginapi.Nullable;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.function.Supplier;

@NoArgsConstructor
public abstract class Scoreboard {
    protected static Supplier<Scoreboard> constructor;
    public static Scoreboard getNew(){
        return constructor.get();
    }

    public abstract void addObjective(Objective objective) throws IllegalArgumentException;
    public void clearSlot(@NonNull DisplaySlot slot) {
        this.updateDisplaySlot(null, slot);
    }
    public abstract void updateDisplaySlot(@Nullable Objective objective, @NonNull DisplaySlot displaySlot) throws IllegalStateException;
    public abstract void removeObjective(Objective objective);

}
