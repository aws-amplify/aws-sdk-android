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

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * Unit tests for the
 */
public class AWS4SignerTest {
    private final AWS4Signer signer = new AWS4Signer();

    @Test
    public void testDoubleURLEncode() {
        // Sanity-check that doubleUrlEncode is true by default.
        Assert.assertTrue(signer.doubleUrlEncode);
    }

    @Test
    public void testSigning() throws Exception {

        final String EXPECTED_AUTHORIZATION_HEADER_WITHOUT_SHA256_HEADER =
                "AWS4-HMAC-SHA256 Credential=access/19810216/us-east-1/demo/aws4_request, SignedHeaders=host;x-amz-archive-description;x-amz-date, Signature=77fe7c02927966018667f21d1dc3dfad9057e58401cbb9ed64f1b7868288e35a";

        final String EXPECTED_AUTHORIZATION_HEADER_WITH_SHA256_HEADER =
                "AWS4-HMAC-SHA256 Credential=access/19810216/us-east-1/demo/aws4_request, SignedHeaders=host;x-amz-archive-description;x-amz-date;x-amz-sha256, Signature=e73e20539446307a5dc71252dbd5b97e861f1d1267456abda3ebd8d57e519951";

        final AWSCredentials credentials = new BasicAWSCredentials("access", "secret");
        // Test request without 'x-amz-sha256' header
        Request<?> request = generateBasicRequest();

        final Calendar c = new GregorianCalendar();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));

        signer.overrideDate(c.getTime());

        signer.sign(request, credentials);
        assertEquals(EXPECTED_AUTHORIZATION_HEADER_WITHOUT_SHA256_HEADER,
                request.getHeaders().get("Authorization"));

        // Test request with 'x-amz-sha256' header
        request = generateBasicRequest();
        request.addHeader("x-amz-sha256", "required");

        signer.sign(request, credentials);
        assertEquals(EXPECTED_AUTHORIZATION_HEADER_WITH_SHA256_HEADER,
                request.getHeaders().get("Authorization"));
    }

    @Test
    public void testPresigning() throws Exception {
        final String EXPECTED_AMZ_SIGNATURE = "909d8bc528fec51c0cc6daaa6c29291c519de10f77490d8af57872c29203ebdb";
        final String EXPECTED_AMZ_CREDENTIALS = "access/19810216/us-east-1/demo/aws4_request";
        final String EXPECTED_AMZ_HEADER = "19810216T063000Z";
        final String EXPECTED_AMZ_EXPIRES = "604800";
        final AWSCredentials credentials = new AWSSessionCredentials() {

            @Override
            public String getAWSSecretKey() {
                // TODO Auto-generated method stub
                return "secret";
            }

            @Override
            public String getAWSAccessKeyId() {
                // TODO Auto-generated method stub
                return "access";
            }

            @Override
            public String getSessionToken() {
                // TODO Auto-generated method stub
                return "token";
            }
        };
        // final AWSCredentials credentials = new BasicAWSCredentials("access",
        // "secret");
        // Test request without 'x-amz-sha256' header

        final Request<?> request = generateBasicRequest();

        final Calendar c = new GregorianCalendar();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));

        signer.overrideDate(c.getTime());
        signer.setServiceName("demo");

        signer.presignRequest(request, credentials, null);
        assertEquals(EXPECTED_AMZ_SIGNATURE,
                request.getParameters().get("X-Amz-Signature"));
        assertEquals(EXPECTED_AMZ_CREDENTIALS,
                request.getParameters().get("X-Amz-Credential"));
        assertEquals(EXPECTED_AMZ_HEADER, request.getParameters().get("X-Amz-Date"));
        assertEquals(EXPECTED_AMZ_EXPIRES, request.getParameters().get("X-Amz-Expires"));
        assertEquals("token", request.getParameters().get("X-Amz-Security-Token"));

    }

    @Test
    public void testPresigners2() throws Exception {
        final AWSCredentials credentials = new AnonymousAWSCredentials();
        final Request<?> request = generateBasicRequest();
        final Calendar c = new GregorianCalendar();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));

        signer.overrideDate(c.getTime());
        signer.setServiceName("demo");

        signer.presignRequest(request, credentials, null);
        assertNull(request.getParameters().get("X-Amz-Credential"));
        assertNull(request.getParameters().get("X-Amz-Date"));
        assertNull(request.getParameters().get("X-Amz-Expires"));
        assertNull(request.getParameters().get("X-Amz-Security-Token"));

    }

    @Test
    public void testCorrectHeadersAreSigned() {
        // Make sure neccesary headers are signed
        assertTrue(signer.needsSign("date"));
        assertTrue(signer.needsSign("Content-MD5"));
        assertTrue(signer.needsSign("x-amz"));
        assertTrue(signer.needsSign("X-Amz"));
        assertTrue(signer.needsSign("host"));

        // Make sure other eachers are not signed

        assertFalse(signer.needsSign(""));
        assertFalse(signer.needsSign("Content-Type"));
        assertFalse(signer.needsSign("Content-Length"));
        assertFalse(signer.needsSign("Signature"));
        assertFalse(signer.needsSign("Accept-Encoding"));
        assertFalse(signer.needsSign("Accept"));
        assertFalse(signer.needsSign("User-Agent"));
    }

    /**
     * Tests that if passed anonymous credentials, signer will not generate a
     * signature
     */
    @Test
    public void testAnonymous() throws Exception {
        final AWSCredentials credentials = new AnonymousAWSCredentials();
        final Request<?> request = generateBasicRequest();

        final Calendar c = new GregorianCalendar();
        c.set(1981, 1, 16, 6, 30, 0);
        c.setTimeZone(TimeZone.getTimeZone("UTC"));

        signer.overrideDate(c.getTime());

        signer.sign(request, credentials);

        assertNull(request.getHeaders().get("Authorization"));
    }

    private Request<?> generateBasicRequest() {
        final Request<?> request = new DefaultRequest<Void>("Foo");
        request.setContent(new ByteArrayInputStream("{\"TableName\": \"foo\"}"
                .getBytes(StringUtils.UTF8)));
        request.addHeader("Host", "demo.us-east-1.amazonaws.com");
        // HTTP header containing multiple spaces in a row.
        request.addHeader("x-amz-archive-description", "test  test");
        request.setResourcePath("/");
        request.setEndpoint(URI.create("http://demo.us-east-1.amazonaws.com"));
        return request;
    }

    private String getOldTimeStamp(Date date) {
        final SimpleDateFormat dateTimeFormat = new SimpleDateFormat(
                "yyyyMMdd'T'HHmmss'Z'");
        dateTimeFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
        return dateTimeFormat.format(date);
    }

    @Test
    public void getTimeStamp() {
        final Date now = new Date();
        final String timeStamp = new AWS4Signer().getTimeStamp(now.getTime());
        final String old = getOldTimeStamp(now);
        assertEquals(old, timeStamp);
    }

    private String getOldDateStamp(Date date) {
        final SimpleDateFormat dateStampFormat = new SimpleDateFormat("yyyyMMdd");
        dateStampFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
        return dateStampFormat.format(date);
    }

    @Test
    public void getDateStamp() {
        final Date now = new Date();
        final String dateStamp = new AWS4Signer().getDateStamp(now.getTime());
        final String old = getOldDateStamp(now);
        assertEquals(old, dateStamp);
    }
}
