package org.ecturing;

import java.util.concurrent.Callable;

public interface Plugins extends Callable {
    @Override
    Object call() throws Exception;
}
