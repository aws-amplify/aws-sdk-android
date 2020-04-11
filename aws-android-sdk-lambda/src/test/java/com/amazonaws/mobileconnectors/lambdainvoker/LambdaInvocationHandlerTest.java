/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.lambdainvoker;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.util.StringUtils;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.mobile.config.AWSConfiguration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;

@RunWith(RobolectricTestRunner.class)
public class LambdaInvocationHandlerTest {
    private LambdaInvocationHandler handler;
    private AWSLambda lambda;
    private LambdaInvokerFactory factory;
    private MockInterface invoker;

    @Before
    public void setup() {
        lambda = Mockito.mock(AWSLambda.class);
        factory = new LambdaInvokerFactory(lambda, null);
        invoker = factory.build(MockInterface.class);
        handler = (LambdaInvocationHandler) Proxy.getInvocationHandler(invoker);
    }

    static interface MockInterface {
        void noAnnotation();

        @LambdaFunction
        void oneArgument(String a);

        @LambdaFunction
        void twoArguments(String a, String b);

        @LambdaFunction
        void variableArguments(String... a);

        @LambdaFunction
        String echo(String a);

        @LambdaFunction(functionName = "echo", invocationType = "Event")
        String echoAlias(String a);

        @LambdaFunction(functionName = "echo", invocationType = "Event", logType = "Tail")
        String echoAliasLogTail(String a);

        @LambdaFunction(qualifier = "version")
        String echoVersion(String a);

        @LambdaFunction
        String echoNoArgument();
    }
    
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void testConstructors() {
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder().build();
    }
    
    @Test
    public void testConstructors2() {
    	ClientConfiguration c = new ClientConfiguration();
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder()
    			.clientConfiguration(c)
    			.lambdaClient(lambda).build();
    }
    
    @Test
    public void testConstructors3() {
    	ClientConfiguration c = new ClientConfiguration();
    	c.setUserAgent("test");
    	c.setMaxConnections(2);
    	c.getMaxConnections();
    	c.getUserAgent();
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder()
    			.clientConfiguration(c)
    			.lambdaClient(lambda).build();
    }
    
    @Test(expected=java.lang.IllegalArgumentException.class)
    public void testConstructors4() {
    	ClientConfiguration c = new ClientConfiguration();
    	c.setUserAgent("test");
    	c.setMaxConnections(2);
    	c.getMaxConnections();
    	c.getUserAgent();
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder()
    			.clientConfiguration(c)
    			.build();
    			
    }
    
    @Test
    public void testConstructors5() {
    	ClientConfiguration c = new ClientConfiguration();
    	c.setUserAgent("test");
    	c.setMaxConnections(2);
    	c.getMaxConnections();
    	c.getUserAgent();
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder()
    			.clientConfiguration(c)
    			.lambdaClient(lambda)
    			.region(Regions.US_WEST_2)
    			.build();
    			
    }
    
    @Test
    public void testConstructors6() {
    	ClientConfiguration c = new ClientConfiguration();
    	c.setUserAgent("test");
    	c.setMaxConnections(2);
    	c.getMaxConnections();
    	c.getUserAgent();
    	AWSCredentials creds =  new BasicAWSCredentials("random", "test");
    	StaticCredentialsProvider credProvider = new StaticCredentialsProvider(creds);
    	LambdaInvokerFactory f = new LambdaInvokerFactory.Builder()
    			.clientConfiguration(c)
    			.credentialsProvider(credProvider)
    			.region(Regions.US_WEST_2)
    			.build();
    			
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNoAnnotation() throws Exception {
        Method noAnnotation = getMethod("noAnnotation");
        handler.validateInterfaceMethod(noAnnotation, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testTwoArguments() throws Exception {
        Method twoArguments = getMethod("twoArguments", String.class, String.class);
        handler.validateInterfaceMethod(twoArguments, new Object[] {
                "a", "b"
        });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testVariableArguments() throws Exception {
        Method variableArguments = getMethod("variableArguments", String[].class);
        handler.validateInterfaceMethod(variableArguments, new Object[] {
                "a", "b"
        });
    }

    @Test
    public void testOneArgument() throws Exception {
        Method oneArgument = getMethod("oneArgument", String.class);
        handler.validateInterfaceMethod(oneArgument, new Object[] {
                "a"
        });
    }

    @Test
    public void testBuildInvokeRequest() throws Exception {
        Method echo = getMethod("echo", String.class);
        String input = "hello world";
        InvokeRequest request = handler.buildInvokeRequest(echo, input);
        assertEquals("function name", "echo", request.getFunctionName());
        assertEquals("invocation type", "RequestResponse", request.getInvocationType());
        assertNull("default qualifier", request.getQualifier());
        // Json encoding puts double quotes around a string
        String json = "\"" + input + "\"";
        ByteBuffer payload = stringToByteBuffer(json);
        assertArrayEquals("payload", payload.array(), request.getPayload().array());
    }

    @Test
    public void testBuildInvokeRequestOverride() throws Exception {
        Method echoAlias = getMethod("echoAlias", String.class);
        String input = "hello world";
        InvokeRequest request = handler.buildInvokeRequest(echoAlias, input);
        assertEquals("function name", "echo", request.getFunctionName());
        // invocation type is set to Event because LogType is None.
        assertEquals("invocation type", "Event", request.getInvocationType());
    }

    @Test
    public void testBuildInvokeLogAndRequestOverride() throws Exception {
        Method echoAlias = getMethod("echoAliasLogTail", String.class);
        String input = "hello world";
        InvokeRequest request = handler.buildInvokeRequest(echoAlias, input);
        assertEquals("function name", "echo", request.getFunctionName());
        // invocation type is set to RequestResponse because LogType is Not None.
        assertEquals("invocation type", "RequestResponse", request.getInvocationType());
    }

    @Test
    public void testBuildInvokeRequestVersion() throws Exception {
        Method echoVersion = getMethod("echoVersion", String.class);
        String input = "hello world";
        InvokeRequest request = handler.buildInvokeRequest(echoVersion, input);
        assertEquals("function name", "echoVersion", request.getFunctionName());
        assertEquals("qualifier", "version", request.getQualifier());
    }

    @Test
    public void testProcessInvokeResult() throws Exception {
        Method echo = getMethod("echo", String.class);
        InvokeResult invokeResult = createInvokeResult(200, null, "\"hello world\"");
        String result = (String) handler.processInvokeResult(echo, invokeResult);
        assertEquals("same result", "hello world", result);
    }

    @Test
    public void testProcessInvokeResult204() throws Exception {
        Method echo = getMethod("echo", String.class);
        InvokeResult invokeResult = createInvokeResult(204, null, null);
        invokeResult.setStatusCode(204);
        invokeResult.setFunctionError(null);
        invokeResult.setPayload(null);
        String result = (String) handler.processInvokeResult(echo, invokeResult);
        assertNull("no content", result);
    }

    @Test(expected = LambdaFunctionException.class)
    public void testException() throws Exception {
        Method echo = getMethod("echo", String.class);
        String error = "Panic!";
        String payload = "Bulls eye";
        InvokeResult invokeResult = createInvokeResult(200, error, payload);
        try {
            handler.processInvokeResult(echo, invokeResult);
        } catch (LambdaFunctionException lfe) {
            assertEquals("error message", error, lfe.getMessage());
            assertEquals("payload", payload, lfe.getDetails());
            throw lfe;
        }
    }

    @Test
    public void testInvoke() {
        String input = "Hello world!";
        InvokeResult invokeResult = createInvokeResult(200, null, "\"" + input + "\"");
        Mockito.when(lambda.invoke(Matchers.any(InvokeRequest.class))).thenReturn(invokeResult);
        String result = invoker.echo(input);
        assertEquals("echo", input, result);
    }

    @Test
    public void testInvokeNoArgument() throws Exception {
        String echoResult = "No argument";
        InvokeResult invokeResult = createInvokeResult(200, null, "\"" + echoResult + "\"");
        Mockito.when(lambda.invoke(Matchers.any(InvokeRequest.class))).thenReturn(invokeResult);
        String result = invoker.echoNoArgument();
        assertEquals("echoNoArgument", echoResult, result);
    }

    @Test(expected = LambdaFunctionException.class)
    public void testInvokeException() {
        String input = "Hello world!";
        String error = "Panic!";
        String payload = "Bulls eye";
        InvokeResult invokeResult = createInvokeResult(200, error, payload);
        Mockito.when(lambda.invoke(Matchers.any(InvokeRequest.class))).thenReturn(invokeResult);
        try {
            invoker.echo(input);
        } catch (LambdaFunctionException lfe) {
            assertEquals("error message", error, lfe.getMessage());
            assertEquals("payload", payload, lfe.getDetails());
            throw lfe;
        }
    }

    private Method getMethod(String name, Class<?>... classes)
            throws NoSuchMethodException, SecurityException {
        return MockInterface.class.getMethod(name, classes);
    }

    private ByteBuffer stringToByteBuffer(String s) {
        if (s == null) {
            return null;
        }
        return ByteBuffer.wrap(s.getBytes(StringUtils.UTF8));
    }

    private InvokeResult createInvokeResult(int statusCode, String error, String payload) {
        InvokeResult invokeResult = new InvokeResult();
        invokeResult.setStatusCode(statusCode);
        invokeResult.setFunctionError(error);
        invokeResult.setPayload(stringToByteBuffer(payload));
        return invokeResult;
    }
}
