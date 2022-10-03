package com.c0d3m4513r.pluginapi.config.ConfigEntry;

import com.c0d3m4513r.pluginapi.API;
import com.c0d3m4513r.pluginapi.config.ClassValue;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
/**
 * @type v This is the regular type, e.g. List with String type Parameter
 * @type t This is the due to type erasure
 */
public class ListConfigEntry<T> extends SuperConfigEntry<List<T>,T>{
    public ListConfigEntry(ClassValue<List<T>, T> value, String configPath){
        super(value,configPath);
    }
    @Override
    protected List<T> getValueFromLoader() {
        return API.getConfigLoader().loadConfigKeyList(configPath,value.getClazz());
    }

    @Override
    public void saveValue(){
        API.getConfigLoader().saveConfigKeyList(value.getValue(),value.getClazz(), configPath);
    }
}