package org.ecturing;

import java.util.concurrent.Callable;

public interface Plugins<T> extends Callable<T> {
    @Override
    T call() throws Exception;
}
