
package com.amazonaws.mobileconnectors.lambdainvoker;

import android.util.Log;

import com.amazonaws.mobileconnectors.util.ClientContext;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.model.InvocationType;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.LogType;
import com.amazonaws.util.Base64;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;

/**
 * Invocation handler for Lambda.
 */
class LambdaInvocationHandler implements InvocationHandler {

    private static final String TAG = "LambdaInvocationHandler";

    // -------------------------------------------------------------
    // Variables - Private
    // -------------------------------------------------------------
    private final AWSLambda lambda;
    private final LambdaDataBinder binder;
    private final ClientContext clientContext;

    // -------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------
    /**
     * @param lambda lambda client
     * @param binder data binder
     * @param clientContext client context, null if unavailable
     */
    public LambdaInvocationHandler(AWSLambda lambda, LambdaDataBinder binder,
            ClientContext clientContext) {
        this.lambda = lambda;
        this.binder = binder;
        this.clientContext = clientContext;
    }

    // -------------------------------------------------------------
    // Implementation - InvocationHandler
    // -------------------------------------------------------------
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        validateInterfaceMethod(method, args);

        InvokeRequest invokeRequest = buildInvokeRequest(method, args == null ? null : args[0]);
        InvokeResult invokeResult = lambda.invoke(invokeRequest);

        return processInvokeResult(method, invokeResult);
    }

    // -------------------------------------------------------------
    // Methods - Private
    // -------------------------------------------------------------
    void validateInterfaceMethod(Method method, Object[] args) {
        if (method.getAnnotation(LambdaFunction.class) == null) {
            throw new UnsupportedOperationException("No LambdaFunction annotation for method "
                    + method.getName());
        }

        if (args != null && args.length > 1) {
            throw new UnsupportedOperationException(
                    "LambdaFunctions take either 0 or 1 arguments.");
        }
    }

    InvokeRequest buildInvokeRequest(Method method, Object object) throws IOException {
        LambdaFunction lambdaFunction = method.getAnnotation(LambdaFunction.class);

        InvokeRequest invokeRequest = new InvokeRequest();

        if (lambdaFunction.functionName().isEmpty()) {
            invokeRequest.setFunctionName(method.getName());
        } else {
            invokeRequest.setFunctionName(lambdaFunction.functionName());
        }

        invokeRequest.setLogType(lambdaFunction.logType());

        // If the log type is other than 'None', force to be RequestResponse.
        if (!LogType.None.equals(lambdaFunction.logType())) {
            invokeRequest.setInvocationType(InvocationType.RequestResponse);
        } else {
            invokeRequest.setInvocationType(lambdaFunction.invocationType());
        }

        if (!lambdaFunction.qualifier().isEmpty()) {
            invokeRequest.setQualifier(lambdaFunction.qualifier());
        }

        // set base64 encoded client context string
        if (clientContext != null) {
            invokeRequest.setClientContext(clientContext.toBase64String());
        }

        invokeRequest.setPayload(ByteBuffer.wrap(binder.serialize(object)));

        return invokeRequest;
    }

    Object processInvokeResult(Method method, InvokeResult invokeResult)
            throws IOException {
        if (invokeResult.getLogResult() != null) {
            Log.d(TAG, method.getName() + " log: "
                    + new String(Base64.decode(invokeResult.getLogResult())));
        }

        if (invokeResult.getFunctionError() != null) {
            throw new LambdaFunctionException(invokeResult.getFunctionError(),
                    new String(invokeResult.getPayload().array()));
        }

        // deserialize payload
        if (invokeResult.getStatusCode() == HttpURLConnection.HTTP_NO_CONTENT
                || method.getReturnType().equals(void.class)) {
            return null;
        }

        return binder.deserialize(invokeResult.getPayload().array(),
                method.getReturnType());
    }
}
