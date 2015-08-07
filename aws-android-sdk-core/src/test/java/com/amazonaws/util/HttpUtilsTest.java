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

package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;

import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class HttpUtilsTest {
    @Test
    public void testEncodeNull() {
        Assert.assertEquals("urlEncode(null) returned something unexpected",
                "",
                HttpUtils.urlEncode(null, false));
    }

    @Test
    public void testEncodeEmptyString() {
        Assert.assertEquals("urlEncode(\"\") returned something unexpected",
                "",
                HttpUtils.urlEncode("", false));
    }

    @Test
    public void testNoEncoding() {
        // The un-reserved characters according to RFC 3986
        String test =
                "abcdefghijklmnopqrstuvwxyz"
                        + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789"
                        + "-_.~";

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                + "unexpected",
                test,
                HttpUtils.urlEncode(test, false));
    }

    @Test
    public void testNoEncodingPath() {
        // The un-reserved characters according to RFC 3986, with the addition
        // of '/' - in path mode, we allow this through unencoded.

        String test =
                "abcdefghijklmnopqrstuvwxyz"
                        + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789"
                        + "-_.~/";

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                + "unexpected",
                test,
                HttpUtils.urlEncode(test, true));
    }

    @Test
    public void testEncoding() {
        // The other ASCII printable characters, which should be encoded.
        String test =
                "\t\n\r "
                        + "!\"#$"
                        + "%&'("
                        + ")*+,"
                        + "/:;<"
                        + "=>?@"
                        + "[\\]^"
                        + "`{|}";

        String expected =
                "%09%0A%0D%20" // \t \n \r <space>
                        + "%21%22%23%24" // ! " # $
                        + "%25%26%27%28" // % & ' (
                        + "%29%2A%2B%2C" // ) * + ,
                        + "%2F%3A%3B%3C" // / : ; <
                        + "%3D%3E%3F%40" // = > ? @
                        + "%5B%5C%5D%5E" // [ \ ] ^
                        + "%60%7B%7C%7D"; // ` { | }

        Assert.assertEquals("urlEncode(\"" + test + "\") returned something "
                + "unexpected",
                expected,
                HttpUtils.urlEncode(test, false));
    }

    @Test
    public void testEncodeParameters() {

        Request<?> request = new DefaultRequest<String>("TestRequest");
        request.addParameter("FirstKey", "FirstValue");
        request.addParameter("LastKey", "LastValue");
        String encoded = HttpUtils.encodeParameters(request);
        assertEquals(encoded, "FirstKey=FirstValue&LastKey=LastValue");

    }

    @Test
    public void testEncodeParametersReturnsNullOnEmptyParameters() {

        Request<?> request = new DefaultRequest<String>("TestRequest");
        String encoded = HttpUtils.encodeParameters(request);
        assertNull(encoded);

    }

    @Test
    public void testGetUserAgent() {
        assertEquals(HttpUtils.getUserAgent(null), ClientConfiguration.DEFAULT_USER_AGENT);
        ClientConfiguration conf = new ClientConfiguration();
        assertEquals(HttpUtils.getUserAgent(conf), ClientConfiguration.DEFAULT_USER_AGENT);
        conf.setUserAgent("New");
        assertEquals(HttpUtils.getUserAgent(conf), "New, " + ClientConfiguration.DEFAULT_USER_AGENT);
    }

    @Test
    public void testAppendUriHandlesMergingSlashes() {
        String baseURI = "/my/uri/";
        String path = "/path/to/add/";
        String appended = HttpUtils.appendUri(baseURI, path);
        assertEquals(appended, "/my/uri/path/to/add/");
    }

    @Test
    public void testAppendUriHandlesMergingWithoutSlashes() {
        String baseURI = "/my/uri";
        String path = "path/to/add/";
        String appended = HttpUtils.appendUri(baseURI, path);
        assertEquals(appended, "/my/uri/path/to/add/");
    }

    @Test
    public void testIsUsingNonDefaultPort() throws URISyntaxException {
        URI http = new URI("http://www.http.com:80");
        assertFalse(HttpUtils.isUsingNonDefaultPort(http));
        URI https = new URI("https://www.https.com:443");
        assertFalse(HttpUtils.isUsingNonDefaultPort(https));
    }

    @Test
    public void testGetConnectionTimeout() {
        assertEquals(HttpUtils.getConnectionTimeout(null),
                ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT);
        ClientConfiguration conf = new ClientConfiguration();
        conf.setConnectionTimeout(10);
        assertEquals(HttpUtils.getConnectionTimeout(conf), 10);
    }

    @Test
    public void testGetSocketTimeout() {
        assertEquals(HttpUtils.getSocketTimeout(null), ClientConfiguration.DEFAULT_SOCKET_TIMEOUT);
        ClientConfiguration conf = new ClientConfiguration();
        conf.setSocketTimeout(10);
        assertEquals(HttpUtils.getSocketTimeout(conf), 10);
    }
}
