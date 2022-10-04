package com.c0d3m4513r.pluginapi.registry;

import com.c0d3m4513r.pluginapi.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public abstract class Type {
    public abstract @Nullable Type getTypeInt(String key);
}
