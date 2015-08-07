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

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.model.GetObjectRequest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URI;

/**
 * A unit test for default singing methods in different regions.
 */
public class DefaultSigningMethodTest {

    private static Method CREATE_REQUEST;
    private static Method EXTRACT_REGION_NAME;

    private static final String FAKE_BUCKET = "fake-bucket";
    private static final String FAKE_KEY = "fake-key";

    static {
        setUpInternalMethods();
    }

    private static void setUpInternalMethods() {
        try {
            CREATE_REQUEST = AmazonS3Client.class
                    .getDeclaredMethod("createRequest",
                            String.class, String.class, AmazonWebServiceRequest.class,
                            HttpMethodName.class);
            CREATE_REQUEST.setAccessible(true);

            EXTRACT_REGION_NAME = AWS4Signer.class
                    .getDeclaredMethod("extractRegionName", URI.class);
            EXTRACT_REGION_NAME.setAccessible(true);
        } catch (Exception e) {
            fail("Failed to set up the internal methods of AmazonS3Clinet" + e.getMessage());
        }
    }

    /** Clear system properties */
    @Before
    @After
    public void clearFlags() {
        System.clearProperty("com.amazonaws.services.s3.enforceV4");
        System.clearProperty("com.amazonaws.services.s3.enableV4");
    }

    /**
     * Tests that BJS endpoint always defaults to SigV4.
     */
    @Test
    public void testBJSDefaultSigning() {
        AmazonS3Client s3 = new AmazonS3Client();
        s3.setEndpoint("s3.cn-north-1.amazonaws.com.cn");
        assertSigV4WithRegion(s3, "cn-north-1");

        // Using any of the system props should not affect the default
        System.setProperty("com.amazonaws.services.s3.enforceV4", "true");
        assertSigV4WithRegion(s3, "cn-north-1");
        System.setProperty("com.amazonaws.services.s3.enableV4", "true");
        assertSigV4WithRegion(s3, "cn-north-1");
    }

    /**
     * Tests the behavior when using S3 standard endpoint without providing
     * region override.
     */
    @Test
    public void testStandardEndpointWithoutRegionOverride() {
        AmazonS3Client s3 = new AmazonS3Client();
        s3.setEndpoint("s3.amazonaws.com");
        // SigV2 by default
        assertSigV2(s3);

        // EnforeceV4 is not allowed since no region is specified
        System.setProperty("com.amazonaws.services.s3.enforceV4", "true");
        try {
            invokeCreateSigner(s3);
            fail("AmazonClientException is expected since the region is not specified for the request to 's3.amazonaws.com'");
        } catch (AmazonClientException expected) {
        }

        // EnableV4 should fall back to v2 signing
        clearFlags();
        System.setProperty("com.amazonaws.services.s3.enableV4", "true");
        assertSigV2(s3);
    }

    /**
     * Tests the behavior when using S3 standard endpoint with explicit region.
     */
    @Test
    public void testStandardEndpointWithRegionOverride() {
        AmazonS3Client s3 = new AmazonS3Client();
        // Explicitly setting a regionName, now it defaults to sigv2, but sigv4
        // is allowed to be turned on by enforceV4.
        s3.setEndpoint("s3.amazonaws.com", "s3", "us-west-1");

        // Default to SigV2
        assertSigV2(s3);
        // "Enforce" v4 signing should work.
        System.setProperty("com.amazonaws.services.s3.enforceV4", "true");
        assertSigV4WithRegion(s3, "us-west-1");
        s3.setEndpoint("s3.amazonaws.com", "s3", "eu-west-1");
        assertSigV4WithRegion(s3, "eu-west-1");

        // "enableV4" should fall back to SigV2.
        clearFlags();
        System.setProperty("com.amazonaws.services.s3.enableV4", "true");
        assertSigV2(s3);
    }

    /**
     * Tests that other endpoints always defaults to SigV2, and can be changed
     * by system property.
     */
    @Test
    public void testOtherRegionDefaultSigning() {
        testNonSigV4OnlyRegionDefaultSigning("s3-external-1.amazonaws.com", "us-east-1");
        testNonSigV4OnlyRegionDefaultSigning("s3-us-west-2.amazonaws.com", "us-west-2");
        testNonSigV4OnlyRegionDefaultSigning("s3-us-west-1.amazonaws.com", "us-west-1");
        testNonSigV4OnlyRegionDefaultSigning("s3-eu-west-1.amazonaws.com", "eu-west-1");
        testNonSigV4OnlyRegionDefaultSigning("s3-ap-southeast-1.amazonaws.com", "ap-southeast-1");
        testNonSigV4OnlyRegionDefaultSigning("s3-ap-southeast-2.amazonaws.com", "ap-southeast-2");
        testNonSigV4OnlyRegionDefaultSigning("s3-ap-northeast-1.amazonaws.com", "ap-northeast-1");
        testNonSigV4OnlyRegionDefaultSigning("s3-sa-east-1.amazonaws.com", "sa-east-1");
    }

    private void testNonSigV4OnlyRegionDefaultSigning(String endpoint, String expectedRegionName) {
        clearFlags();
        AmazonS3Client s3 = new AmazonS3Client();
        s3.setEndpoint(endpoint);
        assertSigV2(s3);

        // Enforce SigV4 should change the default
        System.setProperty("com.amazonaws.services.s3.enforceV4", "true");
        assertSigV4WithRegion(s3, expectedRegionName);
        clearFlags();

        // Enable SigV4 should also work
        System.setProperty("com.amazonaws.services.s3.enableV4", "true");
        assertSigV4WithRegion(s3, expectedRegionName);
    }

    /*
     * Test utility functions
     */

    /**
     * Use reflection to call the private method "createSigner" of
     * AmazonS3Client to create the default signer based on a fake request.
     * Returns whether the created signer is in SigV4.
     */
    private static void assertSigV4WithRegion(AmazonS3Client s3, String expectedRegion) {
        Signer signer = invokeCreateSigner(s3);
        assertTrue(signer instanceof AWSS3V4Signer);
        assertEquals(expectedRegion, invokeExtractRegionName(s3, (AWSS3V4Signer) signer));
        testSignAnonymously(s3);
    }

    private static void assertSigV2(AmazonS3Client s3) {
        Signer signer = invokeCreateSigner(s3);
        assertFalse(signer instanceof AWSS3V4Signer);
    }

    private static Request<?> createFakeGetObjectRequest(AmazonS3Client s3) {
        try {
            GetObjectRequest fakeRequest = new GetObjectRequest(FAKE_BUCKET, FAKE_KEY);
            Request<?> fakeGetObjectRequest = (Request<?>) CREATE_REQUEST.invoke(s3, FAKE_BUCKET,
                    FAKE_KEY, fakeRequest, HttpMethodName.GET);

            return fakeGetObjectRequest;
        } catch (Exception e) {
            fail("Exception when calling the private \"createRequest\" method. " + e.getMessage());
            return null;
        }
    }

    private static Signer invokeCreateSigner(AmazonS3Client s3) {
        Request<?> fakeGetObjectRequest = createFakeGetObjectRequest(s3);

        return s3.createSigner(fakeGetObjectRequest, FAKE_BUCKET, FAKE_KEY);
    }

    private static String invokeExtractRegionName(AmazonS3Client s3, AWSS3V4Signer signer) {
        try {
            return (String) EXTRACT_REGION_NAME.invoke(signer, createFakeGetObjectRequest(s3)
                    .getEndpoint());
        } catch (Exception e) {
            fail("Exception when calling the private \"extractRegionName\" method on AWS4Signer. "
                    + e.getMessage());
            return null;
        }
    }

    private static void testSignAnonymously(AmazonS3Client s3) {
        Request<?> fakeGetObjectRequest = createFakeGetObjectRequest(s3);
        Signer signer = s3.createSigner(fakeGetObjectRequest, FAKE_BUCKET, FAKE_KEY);
        signer.sign(fakeGetObjectRequest, new AnonymousAWSCredentials());
    }
}
