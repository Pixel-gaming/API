package com.c0d3m4513r.pluginapi.config;

import lombok.*;

@Value
public class ClassValue<V,T> {
    V value;
    Class<T> clazz;
}
