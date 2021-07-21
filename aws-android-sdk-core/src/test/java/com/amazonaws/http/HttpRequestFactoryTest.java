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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;

import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class HttpRequestFactoryTest {

    private HttpRequestFactory factory;
    private Request<?> request;
    private ClientConfiguration clientConfiguration;
    private ExecutionContext context;
    private final String endpoint = "https://s3.amazonaws.com";
    @Before
    public void setup() {
        factory = new HttpRequestFactory();
        request = new DefaultRequest<Object>("dummy");
        request.setEndpoint(URI.create(endpoint));
        clientConfiguration = new ClientConfiguration();
        context = new ExecutionContext();
    }

    @Test
    public void testContextUserAgent() {
        final String contextUserAgent = "context_user_agent";
        context.setContextUserAgent(contextUserAgent);
        final HttpRequest httpRequest = factory.createHttpRequest(request, clientConfiguration, context);
        final String userAgent = httpRequest.getHeaders().get(HttpHeader.USER_AGENT);
        assertTrue("context user agent", userAgent.endsWith(contextUserAgent));
    }

    @Test
    public void testHeaders() {
        final HttpRequest httpRequest = factory.createHttpRequest(request, clientConfiguration, context);
        final Map<String, String> headers = httpRequest.getHeaders();
        // assert basic headers
        assertNotNull(headers.get(HttpHeader.HOST));
        assertNotNull(headers.get(HttpHeader.CONTENT_TYPE));
    }

    @Test
    public void testEnableCompression() {
        clientConfiguration.withEnableGzip(true);
        final HttpRequest httpRequest = factory.createHttpRequest(request, clientConfiguration, context);
        final Map<String, String> headers = httpRequest.getHeaders();
        assertEquals("accept encoding is gzip", "gzip", headers.get("Accept-Encoding"));
    }

    @Test
    public void testHttpRequestCreatedWithEncodedResourcePath() {
        String expectedResourcePath = "/android%2F/sdk";
        String expectedUri = endpoint+expectedResourcePath;
        clientConfiguration.withEnableGzip(true);
        request.setEncodedResourcePath(expectedResourcePath);
        final HttpRequest httpRequest = factory.createHttpRequest(request, clientConfiguration, context);
        assertEquals(URI.create(expectedUri), httpRequest.getUri());
    }

}
