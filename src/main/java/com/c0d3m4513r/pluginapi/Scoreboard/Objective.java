package com.c0d3m4513r.pluginapi.Scoreboard;

import com.c0d3m4513r.pluginapi.QuadFunction;
import lombok.NonNull;

public abstract class Objective{
    protected static QuadFunction<Scoreboard,String,String,Criteria, Objective> construct;
    public abstract void setDisplayName(@NonNull String name);
    public abstract String getName();

    public abstract Score getOrCreateScore(String name);

    /**
     * Creates a new objective registered to the scoreboard. Unregisters existing objectives with equal name.
     * @param scoreboard to register to
     * @param name of the Objective
     * @param displayName of the objective
     * @param criteria of the objective
     * @return the objective
     */
    public static Objective createNew(Scoreboard scoreboard,String name, String displayName,Criteria criteria){
        return construct.apply(scoreboard,name,displayName,criteria);
    }
    /**
     * Creates a new objective registered to the scoreboard. Unregisters existing objectives with equal name.
     * @param scoreboard to register to
     * @param name of the Objective
     * @param displayName of the objective
     * @param criteria of the objective
     * @return the objective
     */
    public abstract Objective createNewInstance(Scoreboard scoreboard,String name, String displayName, Criteria criteria);
    /**
     * Creates a new objective registered to the scoreboard. Unregisters existing objectives with equal name.
     * @param scoreboard to register to
     * @param name of the Objective
     * @param criteria of the objective
     * @return the objective
     */
    public Objective createNewInstance(Scoreboard scoreboard,String name,Criteria criteria){return createNewInstance(scoreboard,name,name,criteria);}
}
