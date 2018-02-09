package com.amazonaws.mobileconnectors.cognitoidentityprovider.extra.execution;

public class CallbackExectorProvider {

    private static CallbackExecutor callbackExecutor = new CallbackExecutorSimple();

    /**
     * Specify the instance to execute AWS callbacks.
     * 
     * @param callbackExecutor the instance to executes AWS SDK callbacks
     */
    public static void setCallbackExecutor(CallbackExecutor callbackExecutor) {
        CallbackExectorProvider.callbackExecutor = callbackExecutor;
    }

    public static CallbackExecutor getExecutor() {
        return callbackExecutor;
    }
}
