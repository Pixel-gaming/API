package com.c0d3m4513r.pluginapi.config.ConfigEntry;

import com.c0d3m4513r.pluginapi.API;
import com.c0d3m4513r.pluginapi.config.ClassValue;
import com.c0d3m4513r.pluginapi.config.iface.IConfigLoadableSaveable;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
/**
 * @type v This is the regular type, e.g. List with String type Parameter
 * @type t This is the due to type erasure
 */
public class ConfigEntry<T> extends SuperConfigEntry<T,T>{
    public ConfigEntry(ClassValue<T, T> value, String configPath){
        super(value,configPath);
    }
    @Override
    protected T getValueFromLoader() {
        return API.getConfigLoader().loadConfigKey(configPath,value.getClazz());
    }

    @Override
    public void saveValue(){
        API.getConfigLoader().saveConfigKey(value.getValue(),value.getClazz(), configPath);
    }
}