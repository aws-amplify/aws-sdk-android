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

package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Tests for the AWS3 signer implementation.
 */
public class AWS3SignerTest {

    /**
     * A previously computed AWS3 HTTP authorization header
     */
    private static final String EXPECTED_AUTHORIZATION_HEADER =
            "AWS3 AWSAccessKeyId=access,Algorithm=HmacSHA256," +
                    "SignedHeaders=Host;X-Amz-Date;X-Amz-Target," +
                    "Signature=ceuBBi+ulAGez7YKUWkrZRLga+L8hE1vi4M95aZVwCw=";

    /** Shared signer for tests to use. */
    private final AWS3Signer signer = new AWS3Signer();

    /**
     * Tests that we can calculate an AWS3 HTTP signature and compares it to a
     * previously computed signature.
     */
    @Test
    public void testHttpSigning() throws Exception {
        AWSCredentials credentials = new BasicAWSCredentials("access", "secret");
        Request<?> request = new DefaultRequest<Void>("Foo");
        request.setContent(new ByteArrayInputStream("{\"TableName\": \"foo\"}"
                .getBytes(StringUtils.UTF8)));
        request.setResourcePath("/");
        request.addHeader("X-Amz-Target",
                "com.amazon.bigbird.sharedtypes.BigBirdRequestRouterService.DescribeTable");
        request.setEndpoint(URI.create("http://sdb-func7-3001.sea3:8080"));

        // Override the date, so that we use the same date as
        // the previously
        signer.overrideDate("Tue, 15 Mar 2011 20:35:24 GMT");
        signer.sign(request, credentials);

        String authorization = request.getHeaders().get("X-Amzn-Authorization");
        assertEquals(EXPECTED_AUTHORIZATION_HEADER, authorization);
    }

    @Test
    public void testShouldUseHttps() throws URISyntaxException {
        Request<?> request = new DefaultRequest("testService");
        request.setEndpoint(new URI("https://mytest.service.com"));
        assertTrue(signer.shouldUseHttpsScheme(request));
    }

    @Test
    public void testShouldNotUseHttps() throws URISyntaxException {
        Request<?> request = new DefaultRequest("testService");
        request.setEndpoint(new URI("http://mytest.service.com"));
        assertFalse(signer.shouldUseHttpsScheme(request));
    }

    /**
     * Tests that if passed anonymous credentials, signer will not generate a
     * signature
     */
    @Test
    public void testAnonymous() throws Exception {
        AWSCredentials credentials = new AnonymousAWSCredentials();
        Request<?> request = new DefaultRequest<Void>("Foo");
        request.setContent(new ByteArrayInputStream("{\"TableName\": \"foo\"}"
                .getBytes(StringUtils.UTF8)));
        request.setResourcePath("/");
        request.addHeader("X-Amz-Target",
                "com.amazon.bigbird.sharedtypes.BigBirdRequestRouterService.DescribeTable");
        request.setEndpoint(URI.create("http://sdb-func7-3001.sea3:8080"));

        // Override the date, so that we use the same date as
        // the previously
        signer.overrideDate("Tue, 15 Mar 2011 20:35:24 GMT");
        signer.sign(request, credentials);

        String authorization = request.getHeaders().get("X-Amzn-Authorization");
        assertNull(authorization);
    }
}
