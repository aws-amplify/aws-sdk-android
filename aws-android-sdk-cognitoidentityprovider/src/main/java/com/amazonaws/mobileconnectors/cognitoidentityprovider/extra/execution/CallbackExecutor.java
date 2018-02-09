package com.amazonaws.mobileconnectors.cognitoidentityprovider.extra.execution;

public interface CallbackExecutor {

    void execute(Runnable runnable);
}
