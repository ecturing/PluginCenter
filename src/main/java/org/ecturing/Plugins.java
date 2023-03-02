package org.ecturing;

import java.util.concurrent.Callable;

public interface Plugins<String> extends Callable<String> {
    @Override
    String call() throws Exception;
}
