package com.c0d3m4513r.pluginapi;

import com.c0d3m4513r.pluginapi.Scoreboard.Objective;
import lombok.NonNull;

import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public abstract class TaskBuilder {
    protected static Supplier<TaskBuilder> construct;

    public static TaskBuilder builder(){
        return construct.get();
    }
    @NonNull
    public abstract TaskBuilder async(boolean async);
    @NonNull
    public abstract TaskBuilder deferred(long timeAmount,@NonNull TimeUnit timeValue);
    @NonNull
    public abstract TaskBuilder timer(long timeAmount, @NonNull TimeUnit timeValue);
    @NonNull
    public abstract TaskBuilder executer(@NonNull Runnable run);
    @NonNull
    public abstract TaskBuilder name(@Nullable String name);
    @NonNull
    public abstract TaskBuilder reset();
    @NonNull
    public abstract Task build() throws IllegalArgumentException;

}
