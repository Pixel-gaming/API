package com.c0d3m4513r.pluginapi.config.iface;

import com.c0d3m4513r.pluginapi.API;

import java.util.Arrays;


public interface IConfigSavable {
    /***
     * Saves all necessary Config values, to a IConfigSaver
     */
    default void saveValue(){
        ConfigLoadableSavableExecuter.executeLoadOrSave(Savable.class, "saveValue", this);
    }
}
