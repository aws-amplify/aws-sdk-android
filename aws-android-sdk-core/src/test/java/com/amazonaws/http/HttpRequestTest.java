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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestTest {

    private String method;
    private URI uri;
    private Map<String, String> headers;
    private InputStream content;
    private HttpRequest request;

    @Before
    public void setup() {
        method = "GET";
        uri = URI.create("http://amazon.com");
        headers = new HashMap<String, String>();
        content = new ByteArrayInputStream("content".getBytes(StringUtils.UTF8));
    }

    @Test
    public void testSimpleConstructor() {
        request = new HttpRequest(method, uri);
        assertEquals("method", method, request.getMethod());
        assertEquals("url", uri, request.getUri());
        assertNull("no content", request.getContent());
        assertTrue("empty header", request.getHeaders().isEmpty());
    }

    @Test
    public void testGetters() {
        for (int i = 0; i < 10; i++) {
            headers.put("key" + i, "value" + i);
        }
        request = new HttpRequest(method, uri, headers, content);
        assertEquals("method", method, request.getMethod());
        assertEquals("url", uri, request.getUri());
        assertEquals("content", content, request.getContent());
        assertTrue("has headers", request.getHeaders().size() == 10);
    }

    @Test
    public void testContentLength() {
        long contentLength = 100;
        headers.put(HttpHeader.CONTENT_LENGTH, String.valueOf(contentLength));
        HttpRequest request = new HttpRequest(method, uri, headers, null);
        assertTrue("content length", request.getContentLength() == contentLength);
    }

    @Test
    public void testNoContentLength() {
        // content length isn't set in the header
        request = new HttpRequest(method, uri, headers, content);
        assertTrue("content length", request.getContentLength() == 0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifierableHeaders() {
        request = new HttpRequest(method, uri);
        request.getHeaders().put("key", "value");
    }
}
