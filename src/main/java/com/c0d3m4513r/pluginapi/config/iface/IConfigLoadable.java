package com.c0d3m4513r.pluginapi.config.iface;

import com.c0d3m4513r.pluginapi.API;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Objects;

public interface IConfigLoadable {
    /***
     * Loads all necessary Config values, from a IConfigLoader
     */
    default void loadValue() {
        API.getLogger().info("LoadConfig was called!");
        ConfigLoadableSavableExecuter.executeLoadOrSave(Loadable.class, "loadValue", this);
    }
}
