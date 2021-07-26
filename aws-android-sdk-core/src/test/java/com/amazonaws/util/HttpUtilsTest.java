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
        final String test =
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

        final String test =
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
        final String test =
                "\t\n\r "
                        + "!\"#$"
                        + "%&'("
                        + ")*+,"
                        + "/:;<"
                        + "=>?@"
                        + "[\\]^"
                        + "`{|}";

        final String expected =
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

        Assert.assertEquals("urlDecode(\"" + expected + "\") returned something "
                + "unexpected",
                test,
                HttpUtils.urlDecode(expected));
    }

    @Test
    public void testEncodeParameters() {

        final Request<?> request = new DefaultRequest<String>("TestRequest");
        request.addParameter("FirstKey", "FirstValue");
        request.addParameter("LastKey", "LastValue");
        final String encoded = HttpUtils.encodeParameters(request);
        assertEquals(encoded, "FirstKey=FirstValue&LastKey=LastValue");

    }

    @Test
    public void testEncodeParametersReturnsNullOnEmptyParameters() {

        final Request<?> request = new DefaultRequest<String>("TestRequest");
        final String encoded = HttpUtils.encodeParameters(request);
        assertNull(encoded);

    }

    @Test
    public void testGetUserAgent() {
        assertEquals(HttpUtils.getUserAgent(null), ClientConfiguration.DEFAULT_USER_AGENT);
        final ClientConfiguration conf = new ClientConfiguration();
        assertEquals(HttpUtils.getUserAgent(conf), ClientConfiguration.DEFAULT_USER_AGENT);
        conf.setUserAgent("New");
        assertEquals(HttpUtils.getUserAgent(conf),
                "New, " + ClientConfiguration.DEFAULT_USER_AGENT);
    }

    @Test
    public void testAppendUriHandlesMergingSlashes() {
        final String baseURI = "/my/uri/";
        final String path = "/path/to/add/";
        final String appended = HttpUtils.appendUri(baseURI, path);
        assertEquals(appended, "/my/uri/path/to/add/");
    }

    @Test
    public void testAppendUriHandlesMergingWithoutSlashes() {
        final String baseURI = "/my/uri";
        final String path = "path/to/add/";
        final String appended = HttpUtils.appendUri(baseURI, path);
        assertEquals(appended, "/my/uri/path/to/add/");
    }

    @Test
    public void testIsUsingNonDefaultPort() throws URISyntaxException {
        final URI http = new URI("http://www.http.com:80");
        assertFalse(HttpUtils.isUsingNonDefaultPort(http));
        final URI https = new URI("https://www.https.com:443");
        assertFalse(HttpUtils.isUsingNonDefaultPort(https));
    }

    @Test
    public void testGetConnectionTimeout() {
        assertEquals(HttpUtils.getConnectionTimeout(null),
                ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT);
        final ClientConfiguration conf = new ClientConfiguration();
        conf.setConnectionTimeout(10);
        assertEquals(HttpUtils.getConnectionTimeout(conf), 10);
    }

    @Test
    public void testGetSocketTimeout() {
        assertEquals(HttpUtils.getSocketTimeout(null), ClientConfiguration.DEFAULT_SOCKET_TIMEOUT);
        final ClientConfiguration conf = new ClientConfiguration();
        conf.setSocketTimeout(10);
        assertEquals(HttpUtils.getSocketTimeout(conf), 10);
    }

    @Test
    public void testAppendUriNoPath() {
        final String host = "foo.com/";
        final String resourcePath = "";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, true), "foo.com/");
    }

    @Test
    public void testAppendUriNoPathTrailingSlashAdded() {
        final String host = "foo.com";
        final String resourcePath = "";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, true), "foo.com/");
    }

    @Test
    public void testAppendUriTrimExtraHostTrailingSlash() {
        final String host = "foo.com/";
        final String resourcePath = "bar";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, true), "foo.com/bar");
    }

    @Test
    public void testAppendUriEscapeDoubleSlash() {
        final String host = "foo.com";
        final String resourcePath = "aws//android/sdk";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, true),
                "foo.com/aws/%2Fandroid/sdk");
    }

    public void testEncodeDecode() {
        final String host = "foo.com";
        final String resourcePath = "aws//android/sdk";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, true),
                "foo.com/aws/%2Fandroid/sdk");
    }

    @Test
    public void testAppendUriNoEscapeDoubleSlash() {
        final String host = "foo.com";
        final String resourcePath = "aws//android/sdk";
        Assert.assertEquals(HttpUtils.appendUri(host, resourcePath, false),
                "foo.com/aws//android/sdk");
    }

    @Test
    public void testAppendEncodedUri() {
        final String host = "foo.com";
        final String resourcePath = "/android%2F/sdk";
        Assert.assertEquals(HttpUtils.appendUriEncoded(host, resourcePath),
                "foo.com/android%2F/sdk");
    }

}
