
package com.amazonaws.mobileconnectors.lambdainvoker;

import com.amazonaws.mobileconnectors.util.ClientContext;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.model.InvocationType;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.LogType;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;

/**
 * Invocation handler for Lambda.
 */
class LambdaInvocationHandler implements InvocationHandler {

    private static final Log LOGGER = LogFactory.getLog(LambdaInvocationHandler.class);

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

        // With Android version before Lollipop (API level 22), args can be an
        // empty array when the method takes no arguments.
        final Object buildArg = (args == null || args.length == 0) ? null : args[0];
        final InvokeRequest invokeRequest = buildInvokeRequest(method, buildArg);
        final InvokeResult invokeResult = lambda.invoke(invokeRequest);

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
        final LambdaFunction lambdaFunction = method.getAnnotation(LambdaFunction.class);

        final InvokeRequest invokeRequest = new InvokeRequest();

        if (lambdaFunction.functionName().isEmpty()) {
            invokeRequest.setFunctionName(method.getName());
        } else {
            invokeRequest.setFunctionName(lambdaFunction.functionName());
        }

        invokeRequest.setLogType(lambdaFunction.logType());

        // If the log type is other than 'None', force to be RequestResponse.
        if (!LogType.None.toString().equals(lambdaFunction.logType())) {
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
            LOGGER.debug(method.getName() + " log: "
                    + new String(Base64.decode(invokeResult.getLogResult()), StringUtils.UTF8));
        }

        if (invokeResult.getFunctionError() != null) {
            throw new LambdaFunctionException(invokeResult.getFunctionError(),
                    new String(invokeResult.getPayload().array(), StringUtils.UTF8));
        }

        // deserialize payload
        if (invokeResult.getStatusCode() == HttpURLConnection.HTTP_NO_CONTENT
                || void.class.equals(method.getReturnType())) {
            return null;
        }

        return binder.deserialize(invokeResult.getPayload().array(),
                method.getReturnType());
    }
}
