package org.ecturing;

import org.springframework.core.task.TaskDecorator;

public class ContextTaskDecorator implements TaskDecorator {
    @Override
    public Runnable decorate(Runnable runnable) {
        String pluginData=PluginData.getData();
        return ()->{
            PluginData.setData(pluginData);
            runnable.run();
        };
    }
}
