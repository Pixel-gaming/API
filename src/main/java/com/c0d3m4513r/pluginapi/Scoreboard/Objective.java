package com.c0d3m4513r.pluginapi.Scoreboard;

import com.c0d3m4513r.pluginapi.TriFunction;
import lombok.NonNull;

import java.util.function.BiFunction;

public abstract class Objective{
    protected static TriFunction<String,String,Criteria, Objective> construct;
    public abstract void addScore(Score score);
    public abstract boolean hasScore(@NonNull String score);
    public abstract void removeScore(Score score);
    public abstract void setDisplayName(@NonNull String name);

    public abstract Score getOrCreateScore(String name);
    public static Objective createNew(String name, String displayName,Criteria criteria){
        return construct.apply(name,displayName,criteria);
    }
    public abstract Objective createNewInstance(String name, String displayName, Criteria criteria);
    public Objective createNewInstance(String name,Criteria criteria){return createNewInstance(name,name,criteria);}
}
