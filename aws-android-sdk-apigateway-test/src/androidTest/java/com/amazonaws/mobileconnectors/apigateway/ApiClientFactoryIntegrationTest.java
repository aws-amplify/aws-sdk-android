/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.apigateway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.echo.EchoClient;
import com.amazonaws.echo.model.Data;
import com.amazonaws.echo.model.EchoResponse;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;
import com.google.gson.Gson;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiClientFactoryIntegrationTest extends ApiGatewayIntegrationTestBase {

    private EchoClient client;
    private Data data;

    @Before
    public void setup() throws JSONException {
        client = new ApiClientFactory()
                // override the fake endpoint in the generated client
                .endpoint(getPackageConfigure().getString("endpoint"))
                .build(EchoClient.class);
        data = getData();
    }

    @Test
    public void testGet() throws Exception {
        final EchoResponse response = client.echoGet("hello");
        assertEquals("query", "hello", response.getArgs().get("q"));
    }

    @Test
    public void testDelete() throws Exception {
        final EchoResponse response = client.echoDelete();
        assertTrue("http proxy url is /delete", response.getUrl().endsWith("/delete"));
    }

    @Test
    public void testPatch() throws Exception {
        final EchoResponse response = client.echoPatch(data);
        assertSameData(data, response.getJson());
        assertTrue("http proxy url is /patch", response.getUrl().endsWith("/patch"));
    }

    @Test
    public void testHead() throws Exception {
        client.echoHead();
    }

    @Test
    public void testOptions() throws Exception {
        client.echoOptions();
    }

    @Test
    public void testPut() throws Exception {
        final EchoResponse response = client.echoPut(data);
        assertSameData(data, response.getJson());
        assertTrue("http proxy url is /put", response.getUrl().endsWith("/put"));
    }

    @Test
    public void testPost() throws Exception {
        final EchoResponse response = client.echoPost(data);
        assertSameData(data, response.getJson());
        assertTrue("http proxy url is /post", response.getUrl().endsWith("/post"));
    }

    @Test
    public void testComplex() throws Exception {
        final EchoResponse response = client.echoPathPost("foo", "bar", "post", data);
        assertEquals("query", "foo", response.getArgs().get("query"));
        assertEquals("header", "bar", response.getHeaders().get("Header"));
        final URL url = new URL(response.getUrl());
        assertEquals("path", "/post", url.getPath());
        assertSameData(data, response.getJson());
    }

    @Test
    public void testAuth() throws JSONException {
        // This test can be written in a better way if we use real credentials.
        // However we can still tell whether the request is signed properly
        // with fake credentials via error message.
        final AWSCredentialsProvider provider = new StaticCredentialsProvider(
                new BasicAWSCredentials("access_key", "secret_key"));
        final EchoClient client = new ApiClientFactory()
                .endpoint(getPackageConfigure().getString("endpoint"))
                .credentialsProvider(provider)
                .build(EchoClient.class);
        // with credentials provider set, request will be signed
        try {
            client.authGet();
            fail("should throw 403 ApiClientException");
        } catch (final ApiClientException ace) {
            assertTrue("status code 403", ace.getStatusCode() == 403);
            // request is signed correctly, but with invalid token due to fake
            // credentials
            assertTrue(ace.getErrorMessage().contains(
                    "The security token included in the request is invalid."));
        }
    }

    @Test
    public void testNoAuth() {
        try {
            client.authGet();
            fail("should throw 403 ApiClientException");
        } catch (final ApiClientException ace) {
            assertTrue("status code 403", ace.getStatusCode() == 403);
            assertTrue(ace.getErrorMessage().contains("Missing Authentication Token"));
        }
    }

    @Test
    public void testApiKey() throws JSONException {
        final String apiKey = getPackageConfigure().getString("api_key");
        final EchoClient client = new ApiClientFactory()
                .endpoint(getPackageConfigure().getString("endpoint"))
                .apiKey(apiKey)
                .build(EchoClient.class);
        client.apikeyGet();
    }

    @Test
    public void testNoApiKey() {
        try {
            client.apikeyGet();
            fail("should throw 403 ApiClientException");
        } catch (final ApiClientException ace) {
            assertTrue("status code 403", ace.getStatusCode() == 403);
        }
    }

    @Test
    public void testImplicitRegion() throws JSONException {
        final AWSCredentialsProvider provider = new StaticCredentialsProvider(
                new BasicAWSCredentials("access_key", "secret_key"));
        final EchoClient client = new ApiClientFactory()
                .endpoint(getPackageConfigure().getString("endpoint"))
                .credentialsProvider(provider)
                .build(EchoClient.class);
        // with credentials provider set, request will be signed
        try {
            client.authGet();
            fail("should throw 403 ApiClientException");
        } catch (final ApiClientException ace) {
            assertTrue("status code 403", ace.getStatusCode() == 403);
            // request is signed correctly, but with invalid token due to fake
            // credentials
            assertTrue(ace.getErrorMessage().contains(
                    "The security token included in the request is invalid."));
        }
    }

    @Test
    public void testRegionOverride() throws JSONException {
        final AWSCredentialsProvider provider = new StaticCredentialsProvider(
                new BasicAWSCredentials("access_key", "secret_key"));
        final String pretendRegion = "antarctica-central-1";
        final String endpoint = getPackageConfigure().getString("endpoint");
        final EchoClient client = new ApiClientFactory()
                .credentialsProvider(provider)
                .endpoint(endpoint)
                .region(pretendRegion)
                .build(EchoClient.class);
        // Manually overriding the region causes a mismatch between the endpoint
        // and the region. Signing will fail as a result.
        try {
            client.authGet();
            fail("should throw 403 ApiClientException");
        } catch (final ApiClientException ace) {
            assertTrue("status code 403", ace.getStatusCode() == 403);
            assertTrue(ace.getErrorMessage().contains(
                    "Credential should be scoped to a valid region, not '" + pretendRegion + "'."));
        }
    }

    @Test
    public void testExecuteApi() throws IOException {


        final String requestData = new Gson().toJson(data);
        final byte[] content = requestData.getBytes(StringUtils.UTF8);

        final ApiRequest request = new ApiRequest(EchoClient.class.getSimpleName())
                .withPath("echo/post")
                .withHttpMethod(HttpMethodName.POST)
                .addHeader("header", "bar")
                .addHeader("Content-Type", "application/json")
                .addHeader("Content-Length", String.valueOf(content.length))
                .withParameter("query", "string")
                .withBody(content);

        final ApiResponse apiResponse = client.execute(request);
        final String responseData = IOUtils.toString(apiResponse.getContent());
        final EchoResponse response = new Gson().fromJson(responseData, EchoResponse.class);
        assertSameData(data, response.getJson());

        assertEquals("query", "string", response.getArgs().get("query"));
        assertEquals("header", "bar", response.getHeaders().get("Header"));
        assertEquals("header", "application/json", response.getHeaders().get("Content-Type"));
    }

    private Data getData() {
        final Data data = new Data();
        data.setBoolean(true);
        data.setDate(new Date());
        data.setInteger(123);
        data.setNumber(new BigDecimal("12345678901234567890"));
        data.setString("string" + "\u00ea");
        final List<String> array = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            array.add(String.valueOf('a' + i));
        }
        data.setArray(array);
        final Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("key_" + i, "value_" + i);
        }
        data.setMap(map);
        return data;
    }

    private void assertSameData(Data data1, Data data2) {
        assertEquals(data1.getBoolean(), data2.getBoolean());
        assertEquals(data1.getInteger(), data2.getInteger());
        assertEquals(data1.getNumber(), data2.getNumber());
        assertEquals(data1.getString(), data2.getString());
        // TODO: JSON conversion between date object to string loses precision.
        // Thus two date objects aren't the same.
        // assertEquals(data1.getDate(), data2.getDate());
        for (int i = 0; i < 10; i++) {
            assertEquals(data1.getArray().get(i), data2.getArray().get(i));
        }
        for (int i = 0; i < 10; i++) {
            final String key = "key_" + i;
            assertEquals(data1.getMap().get(key), data2.getMap().get(key));
        }
    }
}
