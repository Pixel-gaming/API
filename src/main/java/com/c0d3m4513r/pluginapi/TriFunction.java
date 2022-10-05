package com.c0d3m4513r.pluginapi;

@FunctionalInterface
public interface TriFunction<A,B,C,R> {
    R apply(A a, B b,C c);
}
