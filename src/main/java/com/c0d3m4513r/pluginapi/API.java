package com.c0d3m4513r.pluginapi;

import com.c0d3m4513r.pluginapi.command.CommandRegistrar;
import com.c0d3m4513r.pluginapi.command.CommandResult;
import com.c0d3m4513r.pluginapi.config.MainConfig;
import com.c0d3m4513r.pluginapi.config.iface.IConfigLoaderSaver;
import com.c0d3m4513r.plugindef.Plugin;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.SneakyThrows;
import org.slf4j.Logger;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLClassLoader;

public abstract class API {
    @Getter
    protected static Server server;
    @Getter(AccessLevel.PUBLIC)
    protected static Logger logger;
    @Getter
    protected static IConfigLoaderSaver configLoader;
    @Getter
    protected static MainConfig config;
    @Getter
    protected static CommandRegistrar commandRegistrar;
    @Getter
    protected static CommandResult commandResult;

    protected static void loadMain(){
        try(URLClassLoader loader = URLClassLoader.newInstance(
                new java.net.URL[]{API.class.getProtectionDomain().getCodeSource().getLocation()},
                API.class.getClassLoader())) {
                config = (MainConfig) loader
                .loadClass(com.c0d3m4513r.plugindef.Plugin.configClass)
                .getConstructor()
                .newInstance();
        } catch (IOException | ClassNotFoundException | InvocationTargetException | InstantiationException |
                 IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Could not create Main Plugin Instance, for plugin '"+ Plugin.name+"' and it's supposed main at:"+Plugin.configClass,e);
        }
    }
    public static void runOnMain(Runnable run){
        if(server.isMainThread()){
            run.run();
        }else{
            TaskBuilder.builder().executer(run).build();
        }
    }
}
