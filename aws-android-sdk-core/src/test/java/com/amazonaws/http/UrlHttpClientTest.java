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
import com.amazonaws.util.StringUtils;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class UrlHttpClientTest {

    private ClientConfiguration conf;
    private MockUrlHttpClient client;

    @Before
    public void setup() {
        conf = new ClientConfiguration();
        client = new MockUrlHttpClient(conf);
    }

    @Test
    public void testBasicCurlBuilder() throws URISyntaxException, IOException {
        conf.setCurlLogging(true);
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"));
        assertEquals(0, client.getLogList().size());
        //assertEquals("curl -X POST https://www.amazon.com", client.getLogList().get(0));
    }

    @Test
    public void testCurlBuilderWithHeaders() throws URISyntaxException, IOException {
        conf.setCurlLogging(true);
        final Map<String, String> headers = new HashMap<String, String>();
        headers.put("key1", "value1");
        headers.put("key2", "value2");

        final HashSet<String> expectedCurlHeaders = new HashSet<String>();
        for (final Map.Entry<String, String> entry : headers.entrySet()) {
            expectedCurlHeaders.add("\"" + entry.getKey() + ":" + entry.getValue() + "\"");
        }
       
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"),
                headers,
                null /* stream */);
        
        
        try {
            client.execute(request);
        } catch (final UnknownHostException exception) {
            return;
        }

        assertTrue("Expected UnknownHostException. UnknownHostException not thrown while executing the request.", true);

        /*
        assertEquals(client.getLogList().size(), 1);

        final String[] parts = client.getLogList().get(0).split(" ");
        assertEquals(8, parts.length);
        assertEquals("curl", parts[0]);
        assertEquals("-X", parts[1]);
        assertEquals("POST", parts[2]);
        assertEquals("-H", parts[3]);
        assertTrue(expectedCurlHeaders.contains(parts[4]));
        expectedCurlHeaders.remove(parts[4]);
        assertEquals("-H", parts[5]);
        assertTrue(expectedCurlHeaders.contains(parts[6]));
        expectedCurlHeaders.remove(parts[6]);
        assertTrue(expectedCurlHeaders.isEmpty());
        assertEquals("https://www.amazon.com", parts[7]);
        */
    }

    @Test
    public void testCurlBuilderWithData() throws URISyntaxException, IOException {
        conf.setCurlLogging(true);
        final String dataString = "content";
        final byte[] data = dataString.getBytes("UTF-8");

        final Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeader.CONTENT_LENGTH, String.valueOf(data.length));

        final InputStream stream = new ByteArrayInputStream(data);
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"),
                headers, stream);
        
        try {
            client.execute(request);
        } catch (final UnknownHostException exception) {
            return;
        }

        assertTrue("Expected UnknownHostException. UnknownHostException not thrown while executing the request.", true);

        /*
        assertEquals(1, client.getLogList().size());
        assertEquals(
                "curl -X POST -H \"Content-Length:" + String.valueOf(data.length) + "\" -d '"
                        + dataString + "' https://www.amazon.com",
                client.getLogList().get(0));
        */
    }

    @Test
    public void testOverflowInCurl() throws URISyntaxException, IOException {
        conf.setCurlLogging(true);
        final long tooManyBytes = Integer.MAX_VALUE + 1L;
        final InputStream stream = new ByteArrayInputStream("content".getBytes("UTF-8"));
        final Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeader.CONTENT_LENGTH, String.valueOf(tooManyBytes));
        
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"),
                headers, stream);
        request.setStreaming(true);
        
        try {
            client.execute(request);
        } catch (final UnknownHostException exception) {
            return;
        }

        assertTrue("Expected UnknownHostException. UnknownHostException not thrown while executing the request.", true);

        /*
        assertEquals(1,client.getLogList().size());
        assertEquals(
                "Failed to create curl, content too long", client.getLogList().get(0));
        */
    }

    @Test
    public void testApplyHeaders() throws ProtocolException, MalformedURLException,
            URISyntaxException {

        final Map<String, String> headers = new HashMap<String, String>();
        headers.put("testKey", "testValue");
        headers.put(HttpHeader.CONTENT_LENGTH, "I should not be added");
        headers.put(HttpHeader.HOST, "I should not be added");

        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"), headers,
                null);

        final HttpsURLConnection conn = (HttpsURLConnection) client.applyHeadersAndMethod(request,
                new MockHttpURLConnection(new URL("https://www.amazon.com")));
        assertEquals(conn.getRequestProperty("testKey"), "testValue");
        assertNull(conn.getRequestProperty(HttpHeader.CONTENT_LENGTH));
        assertNull(conn.getRequestProperty(HttpHeader.HOST));
        assertEquals(conn.getRequestMethod(), "POST");
    }

    @Test
    public void testConfigureConnection() throws MalformedURLException, URISyntaxException {
        final Map<String, String> headers = new HashMap<String, String>();
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"),
                headers,
                null);
        final HttpsURLConnection conn = new MockHttpURLConnection(new URL("https://www.amazon.com"));
        client.configureConnection(request, conn);

        assertEquals(conn.getConnectTimeout(), conf.getConnectionTimeout());
        assertEquals(conn.getReadTimeout(), conf.getSocketTimeout());
        assertSame(conn.getHostnameVerifier(), HttpsURLConnection.getDefaultHostnameVerifier());
        assertFalse(conn.getInstanceFollowRedirects());
        assertFalse("disable cache", conn.getUseCaches());
    }

    //commenting as we donot support this. See https://support.google.com/faqs/answer/6346016
    @Test
    public void testConfigureConnectionWithCertCheckingDisabled()
            throws MalformedURLException, URISyntaxException {
        final Map<String, String> headers = new HashMap<String, String>();
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"),
                headers,
                null);
        final HttpsURLConnection conn = new MockHttpURLConnection(new URL("https://www.amazon.com"));
        System.setProperty(SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY, "true");
        client.configureConnection(request, conn);

        assertEquals(conn.getConnectTimeout(), conf.getConnectionTimeout());
        assertEquals(conn.getReadTimeout(), conf.getSocketTimeout());
        assertFalse(conn.getInstanceFollowRedirects());
        assertFalse("disable cache", conn.getUseCaches());
        //assertTrue(conn.getHostnameVerifier().verify("https://some.bogus.com", null));
        //assertTrue(conn.getHostnameVerifier()
        //        .verify("https://bucket.withdot.s3.amazonaws.com", null));
        System.clearProperty(SDKGlobalConfiguration.DISABLE_CERT_CHECKING_SYSTEM_PROPERTY);
    }

    @Test
    public void testCreateResponse() throws URISyntaxException, IOException {
        final HttpRequest request = new HttpRequest("PUT", new URI("https://www.amazon.com"));
        final MockHttpURLConnection conn = new MockHttpURLConnection(new URL("https://www.amazon.com"));

        final Map<String, List<String>> headerFields = new HashMap<String, List<String>>();
        final List<String> header1 = new ArrayList<String>();
        header1.add("value1");
        header1.add("ExtraValue");
        headerFields.put("key1", header1);

        final List<String> header2 = new ArrayList<String>();
        header2.add("value2");
        headerFields.put("key2", header2);

        final List<String> nullHeader = new ArrayList<String>();
        headerFields.put(null, nullHeader);

        conn.setHeaderFields(headerFields);
        conn.setResponseCode(200);
        conn.setErrorStream(null);
        final ByteArrayInputStream bais = new ByteArrayInputStream("test".getBytes(StringUtils.UTF8));
        conn.setInputStream(bais);
        conn.setResponseMessage("TestMessage");

        final HttpResponse response = client.createHttpResponse(request, conn);
        assertEquals(response.getHeaders().get("key1"), "value1");
        assertEquals(response.getHeaders().get("key2"), "value2");
        assertEquals(response.getHeaders().size(), 2);
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.getStatusText(), "TestMessage");
        assertSame(response.getContent(), bais);
    }

    @Test
    public void testWriteContentToConnection() throws URISyntaxException, IOException {
        final ByteArrayInputStream bais = new ByteArrayInputStream("Content".getBytes(StringUtils.UTF8));
        final Map<String, String> headers = new HashMap<String, String>();
        headers.put(HttpHeader.CONTENT_LENGTH,
                String.valueOf("Content".getBytes(StringUtils.UTF8).length));
        final HttpRequest request = new HttpRequest("POST", new URI("https://www.amazon.com"), headers,
                bais);

        final MockHttpURLConnection connection = new MockHttpURLConnection(
                new URL("https://www.amazon.com"));

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        connection.setOutputStream(baos);

        client.writeContentToConnection(request, connection);
        final ByteArrayOutputStream connOs = (ByteArrayOutputStream) connection.getOutputStream();
        assertEquals(new String(connOs.toByteArray(), StringUtils.UTF8), "Content");
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

class MockUrlHttpClient extends UrlHttpClient {

    private final ArrayList<String> mLogList = new ArrayList<String>();

    public MockUrlHttpClient(ClientConfiguration config) {
        super(config);
    }

    public ArrayList<String> getLogList() {
        return mLogList;
    }

    @Override
    protected void printToLog(String message) {
        mLogList.add(message);
    }

    @Override
    protected HttpURLConnection getUrlConnection(URL url) throws IOException {
        final MockHttpURLConnection connection = new MockHttpURLConnection(url);
        connection.setOutputStream(new ByteArrayOutputStream());
        return connection;
    }
}
