package org.ecturing;


public class PluginData {
    private static final ThreadLocal<String> pluginData=new ThreadLocal<>();

    public static String getData() {
        return pluginData.get();
    }

    public static void setData(String data){
        pluginData.set(data);
    }
}
