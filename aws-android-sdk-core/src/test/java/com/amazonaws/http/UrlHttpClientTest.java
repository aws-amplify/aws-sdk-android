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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalConfiguration;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class UrlHttpClientTest {

    private ClientConfiguration conf;
    private UrlHttpClient client;

    @Before
    public void setup() {
        conf = new ClientConfiguration();
        client = new UrlHttpClient(conf);

    }

    @Test
    public void testApplyHeaders() throws ProtocolException, MalformedURLException,
            URISyntaxException {

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("testKey", "testValue");
        headers.put(HttpHeader.CONTENT_LENGTH, "I should not be added");
        headers.put(HttpHeader.HOST, "I should not be added");

        HttpRequest request = new HttpRequest("POST", new URI("https://www.test.com"), headers,
                null);

        HttpsURLConnection conn = (HttpsURLConnection) client.applyHeadersAndMethod(request,
                new MockHttpURLConnection(new URL("https://www.test.com")));
        assertEquals(conn.getRequestProperty("testKey"), "testValue");
        assertNull(conn.getRequestProperty(HttpHeader.CONTENT_LENGTH));
        assertNull(conn.getRequestProperty(HttpHeader.HOST));
        assertEquals(conn.getRequestMethod(), "POST");
    }

    @Test
    public void testConfigureConnection() throws MalformedURLException {
        HttpsURLConnection conn = new MockHttpURLConnection(new URL("https://www.test.com"));
        client.configureConnection(conn);

        assertEquals(conn.getConnectTimeout(), conf.getConnectionTimeout());
        assertEquals(conn.getReadTimeout(), conf.getSocketTimeout());
        assertSame(conn.getHostnameVerifier(), HttpsURLConnection.getDefaultHostnameVerifier());
        assertFalse(conn.getInstanceFollowRedirects());
        assertFalse("disable cache", conn.getUseCaches());
    }

    @Test
    public void testConfigureConnectionWithCertCheckingDisabled() throws MalformedURLException {
        HttpsURLConnection conn = new MockHttpURLConnection(new URL("https://www.test.com"));
        System.setProperty(SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "true");
        client.configureConnection(conn);

        assertEquals(conn.getConnectTimeout(), conf.getConnectionTimeout());
        assertEquals(conn.getReadTimeout(), conf.getSocketTimeout());
        assertFalse(conn.getInstanceFollowRedirects());
        assertFalse("disable cache", conn.getUseCaches());
        assertTrue(conn.getHostnameVerifier().verify("https://some.bogus.com", null));
        assertTrue(conn.getHostnameVerifier()
                .verify("https://bucket.withdot.s3.amazonaws.com", null));
        System.clearProperty(SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY);
    }

    @Test
    public void testCreateResponse() throws URISyntaxException, IOException {
        HttpRequest request = new HttpRequest("PUT", new URI("https://www.test.com"));
        MockHttpURLConnection conn = new MockHttpURLConnection(new URL("https://www.test.com"));

        Map<String, List<String>> headerFields = new HashMap<String, List<String>>();
        List<String> header1 = new ArrayList<String>();
        header1.add("value1");
        header1.add("ExtraValue");
        headerFields.put("key1", header1);

        List<String> header2 = new ArrayList<String>();
        header2.add("value2");
        headerFields.put("key2", header2);

        List<String> nullHeader = new ArrayList<String>();
        headerFields.put(null, nullHeader);

        conn.setHeaderFields(headerFields);
        conn.setResponseCode(200);
        conn.setErrorStream(null);
        ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes());
        conn.setInputStream(bais);
        conn.setResponseMessage("TestMessage");

        HttpResponse response = client.createHttpResponse(request, conn);
        assertEquals(response.getHeaders().get("key1"), "value1");
        assertEquals(response.getHeaders().get("key2"), "value2");
        assertEquals(response.getHeaders().size(), 2);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.getStatusText(), "TestMessage");
        assertSame(response.getContent(), bais);
    }

    @Test
    public void testWriteContentToConnection() throws URISyntaxException, IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Content".getBytes());
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeader.CONTENT_LENGTH, String.valueOf("Content".getBytes().length));
        HttpRequest request = new HttpRequest("POST", new URI("https://www.test.com"), headers,
                bais);

        MockHttpURLConnection connection = new MockHttpURLConnection(
                new URL("https://www.test.com"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        connection.setOutputStream(baos);

        client.writeContentToConnection(request, connection);
        ByteArrayOutputStream connOs = (ByteArrayOutputStream) connection.getOutputStream();
        assertEquals(new String(connOs.toByteArray()), "Content");
    }
}

class MockHttpURLConnection extends HttpsURLConnection {

    String responseMessage;
    int responseCode;
    InputStream errorStream;
    InputStream inputStream;
    OutputStream outputStream;

    Map<String, List<String>> headerFields;

    protected MockHttpURLConnection(URL u) {
        super(u);
    }

    public void setOutputStream(OutputStream os) {
        outputStream = os;
    }

    @Override
    public OutputStream getOutputStream() {
        return outputStream;
    }

    @Override
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public InputStream getErrorStream() {
        return errorStream;
    }

    public void setErrorStream(InputStream errorStream) {
        this.errorStream = errorStream;
    }

    @Override
    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public Map<String, List<String>> getHeaderFields() {
        return headerFields;
    }

    public void setHeaderFields(Map<String, List<String>> headerFields) {
        this.headerFields = headerFields;
    }

    @Override
    public void disconnect() {
    }

    @Override
    public boolean usingProxy() {
        return false;
    }

    @Override
    public void connect() throws IOException {
    }

    @Override
    public String getCipherSuite() {
        return null;
    }

    @Override
    public Certificate[] getLocalCertificates() {
        return null;
    }

    @Override
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return null;
    }

}
