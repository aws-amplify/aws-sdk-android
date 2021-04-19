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

package com.amazonaws.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.util.AWSRequestMetrics;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class AmazonHttpClientTest {
    private HttpClient httpClient;
    private AmazonHttpClient client;

    @Before
    public void setUp() {
        ClientConfiguration config = new ClientConfiguration();

        httpClient = EasyMock.createMock(HttpClient.class);
        EasyMock.reset(httpClient);

        client = new AmazonHttpClient(config, httpClient);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testHostPrefixPrepend() throws Exception {
        HttpResponse successfulResponse = HttpResponse.builder()
                .statusCode(200)
                .content(null)
                .build();

        HttpResponseHandler<AmazonWebServiceResponse<Object>> handler =
                EasyMock.createMock(HttpResponseHandler.class);
        EasyMock.expect(handler.needsConnectionLeftOpen())
                .andReturn(false);
        EasyMock.expect(handler.handle(EasyMock.anyObject(HttpResponse.class)))
                .andReturn(new AmazonWebServiceResponse<>());
        EasyMock.replay(handler);

        Capture<HttpRequest> httpRequest = new Capture<>();
        EasyMock.expect(httpClient.execute(EasyMock.capture(httpRequest)))
                .andReturn(successfulResponse);
        EasyMock.replay(httpClient);

        Request<?> request = new DefaultRequest<Object>("test");
        request.setContent(new ByteArrayInputStream("test".getBytes()));
        request.setHostPrefix("test.");
        request.setEndpoint(URI.create("http://region.amazonaws.com/"));

        client.execute(request, handler, null, new ExecutionContext());
        assertEquals(request.getContent(), httpRequest.getValue().getContent());
        assertEquals(URI.create("http://test.region.amazonaws.com/"), httpRequest.getValue().getUri());
    }

    @Test
    public void testTemporaryRedirect() throws IOException, URISyntaxException {
        HttpResponse redirectResponse = HttpResponse.builder().statusCode(307)
                .header("Location", "https://www.redirect.com").build();
        HttpResponse successfulResponse = HttpResponse.builder().statusCode(200).content(null)
                .build();
        final Request<?> request = new DefaultRequest<String>(new AmazonWebServiceRequest() {

        }, "TestService");
        request.setHttpMethod(HttpMethodName.GET);
        request.setEndpoint(new URI("https://www.test.com"));
        request.setResourcePath("/test/table");

        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                AmazonWebServiceResponse<String> awsResponse = new AmazonWebServiceResponse<String>();
                awsResponse.setResult("Result");
                return awsResponse;
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }
        };

        ExecutionContext ec = EasyMock.createMock(ExecutionContext.class);

        EasyMock.reset(httpClient, ec);

        final List<Boolean> signerCalled = new ArrayList<Boolean>();

        EasyMock.expect(ec.getAwsRequestMetrics()).andReturn(new AWSRequestMetrics()).anyTimes();
        EasyMock.expect(ec.getContextUserAgent()).andReturn("TestUserAgent").anyTimes();
        EasyMock.expect(ec.getCredentials()).andReturn(new AnonymousAWSCredentials());
        EasyMock.expect(ec.getSignerByURI(EasyMock.anyObject(URI.class))).andReturn(new Signer() {

            @Override
            public void sign(Request<?> requestToSign, AWSCredentials credentials) {
                assertSame(request, requestToSign);
                assertTrue(credentials instanceof AnonymousAWSCredentials);
                signerCalled.add(true);
            }
        });

        EasyMock.expect(httpClient.execute(EasyMock.<HttpRequest> anyObject()))
                .andReturn(redirectResponse);

        Capture<HttpRequest> capture = new Capture<HttpRequest>();

        EasyMock.expect(httpClient.execute(EasyMock.capture(capture)))
                .andReturn(successfulResponse);

        EasyMock.replay(httpClient, ec);

        Response<String> response = client.executeHelper(request, responseHandler, null, ec);

        assertEquals(response.getAwsResponse(), "Result");
        assertEquals(signerCalled.size(), 2);
        assertTrue(signerCalled.get(0));
        assertTrue(signerCalled.get(1));
        assertEquals(capture.getValue().getUri().toString(), "https://www.redirect.com/");

        EasyMock.verify(httpClient, ec);
    }

    @Test
    public void testRetryIOExceptionFromExecute() throws IOException {
        IOException exception = new IOException("BOOM");

        EasyMock.expect(httpClient.execute(EasyMock.<HttpRequest> anyObject()))
                .andThrow(exception)
                .times(4);

        EasyMock.replay(httpClient);

        ExecutionContext context = new ExecutionContext();

        Request<?> request = new DefaultRequest<Object>("testsvc");
        request.setEndpoint(java.net.URI.create(
                "http://testsvc.region.amazonaws.com"));
        request.addHeader(HttpHeader.CONTENT_LENGTH, "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));

        try {

            client.execute(request, null, null, context);
            fail("No exception when request repeatedly fails!");

        } catch (AmazonClientException e) {
            assertSame(exception, e.getCause());
        }

        // Verify that we called execute 4 times.
        EasyMock.verify(httpClient);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testRetryIOExceptionFromHandler() throws Exception {
        final IOException exception = new IOException("BOOM");

        HttpResponseHandler<AmazonWebServiceResponse<Object>> handler =
                EasyMock.createMock(HttpResponseHandler.class);

        EasyMock.expect(handler.needsConnectionLeftOpen())
                .andReturn(false)
                .anyTimes();

        EasyMock.expect(handler.handle(EasyMock.<HttpResponse> anyObject()))
                .andThrow(exception)
                .times(4);

        HttpResponse response = HttpResponse.builder()
                .content(new ByteArrayInputStream(new byte[0]))
                .statusCode(200)
                .statusText("OK")
                .build();

        EasyMock.expect(httpClient.execute(EasyMock.<HttpRequest> anyObject()))
                .andReturn(response)
                .times(4);

        EasyMock.replay(handler, httpClient);

        ExecutionContext context = new ExecutionContext();

        Request<?> request = new DefaultRequest<Object>("testsvc");
        request.setEndpoint(java.net.URI.create(
                "http://testsvc.region.amazonaws.com"));
        request.addHeader(HttpHeader.CONTENT_LENGTH, "0");
        request.setContent(new java.io.ByteArrayInputStream(new byte[0]));

        try {

            client.execute(request, handler, null, context);
            fail("No exception when request repeatedly fails!");

        } catch (AmazonClientException e) {
            assertSame(exception, e.getCause());
        }

        // Verify that we called execute 4 times.
        EasyMock.verify(httpClient);
    }

    @Test
    public void testHandleResponse() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(200).build();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                AmazonWebServiceResponse<String> awsResponse = new AmazonWebServiceResponse<String>();
                awsResponse.setResult("Result");
                return awsResponse;
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };

        assertEquals("Result", client.handleResponse(request, responseHandler, httpResponse,
                new ExecutionContext()));
    }

    @Test(expected = RuntimeException.class)
    public void testHandleResponseWithNullResult() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(200).build();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                return null;
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };

        client.handleResponse(request, responseHandler, httpResponse,
                new ExecutionContext());
    }

    @Test(expected = CRC32MismatchException.class)
    public void testHandleResponseThrowsCRC32MisMatch() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(200).build();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new CRC32MismatchException("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };

        client.handleResponse(request, responseHandler, httpResponse,
                new ExecutionContext());
    }

    @Test(expected = IOException.class)
    public void testHandleResponseThrowsIOException() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(200).build();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new IOException("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };

        client.handleResponse(request, responseHandler, httpResponse,
                new ExecutionContext());
    }

    @Test(expected = Exception.class)
    public void testHandleResponseThrowsGenericException() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(200).build();
        HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = new HttpResponseHandler<AmazonWebServiceResponse<String>>() {

            @Override
            public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new Exception("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };

        client.handleResponse(request, responseHandler, httpResponse,
                new ExecutionContext());
    }

    @Test
    public void testHandleErrorResponse() throws IOException {

        final Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(400).build();
        HttpResponseHandler<AmazonServiceException> errorResponseHandler = new HttpResponseHandler<AmazonServiceException>() {

            @Override
            public AmazonServiceException handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                AmazonServiceException ase = new AmazonServiceException("Test");
                ase.setErrorCode("TestError");
                ase.setErrorType(ErrorType.Service);
                ase.setServiceName(request.getServiceName());
                ase.setStatusCode(response.getStatusCode());
                return ase;
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };
        AmazonServiceException e = client.handleErrorResponse(request, errorResponseHandler,
                httpResponse);
        assertEquals(e.getStatusCode(), 400);
        assertEquals(e.getErrorCode(), "TestError");
        assertEquals(e.getErrorType(), ErrorType.Service);
        assertEquals(e.getServiceName(), "ServiceName");
    }

    @Test
    public void testHandleErrorResponseHandlerFailsWith413() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(413).build();
        HttpResponseHandler<AmazonServiceException> errorResponseHandler = new HttpResponseHandler<AmazonServiceException>() {

            @Override
            public AmazonServiceException handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new Exception("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };
        AmazonServiceException e = client.handleErrorResponse(request, errorResponseHandler,
                httpResponse);
        assertEquals(e.getStatusCode(), 413);
        assertEquals(e.getErrorCode(), "Request entity too large");
        assertEquals(e.getErrorType(), ErrorType.Client);
        assertEquals(e.getServiceName(), "ServiceName");
    }

    @Test
    public void testHandleErrorResponseHandlerFailsWith503() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder()
                .statusText("Service unavailable")
                .statusCode(503).build();
        HttpResponseHandler<AmazonServiceException> errorResponseHandler = new HttpResponseHandler<AmazonServiceException>() {

            @Override
            public AmazonServiceException handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new Exception("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };
        AmazonServiceException e = client.handleErrorResponse(request, errorResponseHandler,
                httpResponse);
        assertEquals(e.getStatusCode(), 503);
        assertEquals(e.getErrorCode(), "Service unavailable");
        assertEquals(e.getErrorType(), ErrorType.Service);
        assertEquals(e.getServiceName(), "ServiceName");
    }

    @Test(expected = AmazonClientException.class)
    public void testHandleErrorResponseHandlerFailsWithUnknownException() throws IOException {

        Request<?> request = new DefaultRequest<String>("ServiceName");
        final HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(400).build();
        HttpResponseHandler<AmazonServiceException> errorResponseHandler = new HttpResponseHandler<AmazonServiceException>() {

            @Override
            public AmazonServiceException handle(HttpResponse response) throws Exception {
                assertSame(response, httpResponse);
                throw new Exception("test");
            }

            @Override
            public boolean needsConnectionLeftOpen() {
                return false;
            }

        };
        AmazonServiceException e = client.handleErrorResponse(request, errorResponseHandler,
                httpResponse);
    }

    @Test
    public void testClockskewOffset() {
        HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .header("Date", "Sat, 06 Nov 2004 08:49:37 GMT")
                .statusCode(400).build();
        AmazonServiceException ase = new AmazonServiceException("ClockSkew");

        // assert date is > 10 years
        long offset = client.parseClockSkewOffset(httpResponse, ase);
        assertTrue(offset > 315400000L);
    }

    @Test
    public void testClockskewOffsetWithDateInBodyOfException() {
        HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .statusCode(400).build();
        AmazonServiceException ase = new AmazonServiceException("(20041106T084937Z - 15)");

        // assert date is > 10 years
        long offset = client.parseClockSkewOffset(httpResponse, ase);
        assertTrue(offset > 315400000L);
    }

    @Test
    public void testClockskewOffsetWithBogusDateAsssumesOffsetIsZero() {
        HttpResponse httpResponse = new HttpResponse.Builder().statusText("TestResponse")
                .header("Date", "Sat, 064 Jann 20044 08:49:37 GMT")
                .statusCode(400).build();

        AmazonServiceException ase = new AmazonServiceException("ClockSkew");
        // assert date is > 10 years
        final long offset = client.parseClockSkewOffset(httpResponse, ase);
        assertEquals(offset, 0L);
    }

    @Test
    public void testRequestHander2s() {
        final Request<?> testRequest = new DefaultRequest<String>("test");
        final List<Object> calls = new ArrayList<Object>();
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();

        RequestHandler2 defaultHandler = new RequestHandler2() {

            @Override
            public void beforeRequest(Request<?> request) {
                assertSame(testRequest, request);
                calls.add(this);
            }

            @Override
            public void afterResponse(Request<?> request, Response<?> response) {
            }

            @Override
            public void afterError(Request<?> request, Response<?> response, Exception e) {
            }

        };
        RequestHandler2 credentialHandler = new CredentialsRequestHandler() {

            @Override
            public void beforeRequest(Request<?> request) {
                assertSame(testRequest, request);
                calls.add(this);
            }

            @Override
            public void afterResponse(Request<?> request, Response<?> response) {
            }

            @Override
            public void afterError(Request<?> request, Response<?> response, Exception e) {
            }

        };

        handlers.add(defaultHandler);
        handlers.add(credentialHandler);
        ExecutionContext ec = new ExecutionContext(handlers, false, null);
        client.requestHandler2s(testRequest, ec);
        assertEquals(calls.size(), 2);
        assertTrue(calls.contains(defaultHandler));
        assertTrue(calls.contains(credentialHandler));
    }

    @Test
    public void testAfterError() {
        final Request<?> testRequest = new DefaultRequest<String>("test");
        final Response<?> testResponse = new Response<String>("test",
                new HttpResponse.Builder().build());
        final List<Object> calls = new ArrayList<Object>();
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();
        final AmazonClientException ace = new AmazonClientException("Test exception");

        RequestHandler2 handler = new RequestHandler2() {

            @Override
            public void beforeRequest(Request<?> request) {
            }

            @Override
            public void afterResponse(Request<?> request, Response<?> response) {
            }

            @Override
            public void afterError(Request<?> request, Response<?> response, Exception e) {
                assertSame(testRequest, request);
                assertSame(testResponse, response);
                assertSame(e, ace);
                calls.add(this);
            }

        };

        handlers.add(handler);
        client.afterError(testRequest, testResponse, handlers, ace);
        assertEquals(calls.size(), 1);
        assertTrue(calls.contains(handler));
    }

    @Test
    public void testAfterResponse() {

        final Request<?> testRequest = new DefaultRequest<String>("test");
        final Response<?> testResponse = new Response<String>("test",
                new HttpResponse.Builder().build());
        final List<Object> calls = new ArrayList<Object>();
        List<RequestHandler2> handlers = new ArrayList<RequestHandler2>();

        RequestHandler2 handler = new RequestHandler2() {

            @Override
            public void beforeRequest(Request<?> request) {
            }

            @Override
            public void afterResponse(Request<?> request, Response<?> response) {
                assertSame(testRequest, request);
                assertSame(testResponse, response);
                calls.add(this);
            }

            @Override
            public void afterError(Request<?> request, Response<?> response, Exception e) {
            }

        };

        handlers.add(handler);
        client.afterResponse(testRequest, handlers, testResponse, null);
        assertEquals(calls.size(), 1);
        assertTrue(calls.contains(handler));
    }

    @Test
    public void testDeprecatedConstructors() {
        ClientConfiguration conf = new ClientConfiguration();
        RequestMetricCollector rmc = RequestMetricCollector.NONE;
        AmazonHttpClient defaultToUrlClient = new AmazonHttpClient(conf, rmc);
        assertTrue(defaultToUrlClient.httpClient instanceof UrlHttpClient);
        assertSame(defaultToUrlClient.config, conf);

        UrlHttpClient urlClient = new UrlHttpClient(conf);
        AmazonHttpClient deprecatedSpecifiedConstrucotr = new AmazonHttpClient(conf, urlClient, rmc);
        assertSame(deprecatedSpecifiedConstrucotr.config, conf);
        assertSame(deprecatedSpecifiedConstrucotr.httpClient, urlClient);
    }

    @Test
    public void testResetRequestAfterErrorWithNullContent() {
        final Request<?> testRequest = new DefaultRequest<String>("test");
        testRequest.setContent(null);
        Exception cause = new Exception();

        // Should be no-op
        client.resetRequestAfterError(testRequest, cause);
    }

    @Test(expected = AmazonClientException.class)
    public void testResetRequestAfterErrorWithNonRepeatableContent() {
        final Request<?> testRequest = new DefaultRequest<String>("test");
        testRequest.setContent(new InputStream() {

            @Override
            public boolean markSupported() {
                return false;
            }

            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        Exception cause = new Exception();

        // Should be no-op
        client.resetRequestAfterError(testRequest, cause);
    }

    @Test(expected = AmazonClientException.class)
    public void testResetRequestAfterErrorWithNonResetableContent() {
        final Request<?> testRequest = new DefaultRequest<String>("test");
        testRequest.setContent(new InputStream() {

            @Override
            public void reset() {
                throw new RuntimeException("CannotReset");
            }

            @Override
            public int read() throws IOException {
                return 0;
            }
        });
        Exception cause = new Exception();

        // Should be no-op
        client.resetRequestAfterError(testRequest, cause);
    }

    @Test
    public void testCreateUserAgent() {
        String existingUA = "Existing";
        String additionalUA = "Additional";
        String ua = AmazonHttpClient.createUserAgentString(existingUA, additionalUA);
        assertEquals(ua, (existingUA + " " + additionalUA));
    }

    @Test
    public void testCreateUserAgentWithDuplicateAddition() {
        String existingUA = "Existing";
        String additionalUA = "Existing";
        String ua = AmazonHttpClient.createUserAgentString(existingUA, additionalUA);
        assertEquals(ua, (existingUA));
    }

    @Test
    public void testSetUserAgentDefault() {
        ClientConfiguration config = new ClientConfiguration();
        client = new AmazonHttpClient(config);

        final Request<?> request = new DefaultRequest<String>("ServiceName");
        client.setUserAgent(request);
        String userAgent = request.getHeaders().get("User-Agent");
        assertEquals("same user agent", ClientConfiguration.DEFAULT_USER_AGENT, userAgent);
    }

    @Test
    public void testSetUserAgentCustom() {
        String versionInfoUserAgent = ClientConfiguration.DEFAULT_USER_AGENT;
        String customUserAgent = "custom_user_agent";
        String requestUserAgent = "request_user_agent";
        String targetUserAgent = versionInfoUserAgent + " " + requestUserAgent + " "
                + customUserAgent;

        AmazonWebServiceRequest originalRequest = new AmazonWebServiceRequest() {
        };
        RequestClientOptions opts = originalRequest.getRequestClientOptions();
        opts.appendUserAgent("request_user_agent");
        ClientConfiguration config = new ClientConfiguration();
        config.setUserAgent("custom_user_agent");
        client = new AmazonHttpClient(config);

        final Request<?> request = new DefaultRequest<String>(originalRequest, "ServiceName");
        client.setUserAgent(request);
        String userAgent = request.getHeaders().get("User-Agent");
        assertEquals("same user agent", targetUserAgent, userAgent);
    }
}
