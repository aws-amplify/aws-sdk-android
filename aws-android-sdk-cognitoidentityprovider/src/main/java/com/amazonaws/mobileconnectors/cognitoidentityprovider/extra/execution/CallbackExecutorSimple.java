package com.amazonaws.mobileconnectors.cognitoidentityprovider.extra.execution;

public class CallbackExecutorSimple implements CallbackExecutor {

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
