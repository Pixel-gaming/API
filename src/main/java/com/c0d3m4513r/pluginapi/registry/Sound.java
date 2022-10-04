package com.c0d3m4513r.pluginapi.registry;

import com.c0d3m4513r.pluginapi.Data.Point3D;
import com.c0d3m4513r.pluginapi.Nullable;
import com.c0d3m4513r.pluginapi.World;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Sound extends Type{
    public static Sound sound = null;
    public abstract void playSound(World world, Point3D point, int volume);
    protected abstract @Nullable Sound getSoundInt(String key);

    public @Nullable Sound getTypeInt(String key){
        return getSoundInt(key);
    }

    public static @Nullable Sound getType(String key){
        Sound getSound = sound.getSoundInt(key);
        return getSound!=null?getSound:sound;
    }
}
