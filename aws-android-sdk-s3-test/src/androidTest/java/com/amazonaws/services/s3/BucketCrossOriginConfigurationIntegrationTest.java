/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CORSRule.AllowedMethods;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class BucketCrossOriginConfigurationIntegrationTest extends S3IntegrationTestBase {
    private static final boolean ANDROID_TESTING = false;

    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-bucket-cross-origin-integ-test-"
            + System.currentTimeMillis();

    private static final int MAX_AGE_SECONDS = 3000;
    private static final String EXPOSE_HEADER = "x-amz-server-side-encryption";
    private static final String ALLOWED_ORIGIN = "http://www.foobar.com";
    private static final String ALLOWED_HEADER = "x-amz-meta-tastic";
    final String ID1 = "123";
    final String ID2 = "321";

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUp() throws Exception {

        S3IntegrationTestBase.setUp();

        if (!ANDROID_TESTING) {
            setUpCredentials();
        }

        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        // Delete the config
        s3.deleteBucketCrossOriginConfiguration(BUCKET_NAME);
        assertNull(waitForbucketCrossOriginConfigurationDeleted(BUCKET_NAME));

        // Delete the bucket
        deleteBucketAndAllContents(BUCKET_NAME);
    }

    @Test
    public void testBucketCrossOrigin() throws Exception {
        // Check the bucket for its existing CORS config
        BucketCrossOriginConfiguration bucketCrossOriginConfiguration = s3
                .getBucketCrossOriginConfiguration(BUCKET_NAME);
        assertNull(bucketCrossOriginConfiguration);

        // Apply a config
        CORSRule rule1 = new CORSRule();
        rule1.setId(ID1);
        rule1.setMaxAgeSeconds(MAX_AGE_SECONDS);
        rule1.setExposedHeaders(EXPOSE_HEADER, EXPOSE_HEADER + "1");
        rule1.setAllowedMethods(AllowedMethods.GET, AllowedMethods.POST);
        rule1.setAllowedOrigins(ALLOWED_ORIGIN);
        rule1.setAllowedHeaders(ALLOWED_HEADER, ALLOWED_HEADER + "1");

        CORSRule rule2 = new CORSRule();
        rule2.setId(ID2);
        rule2.setMaxAgeSeconds(MAX_AGE_SECONDS);
        rule2.setExposedHeaders(EXPOSE_HEADER, EXPOSE_HEADER + "1");
        rule2.setAllowedMethods(CORSRule.AllowedMethods.PUT, CORSRule.AllowedMethods.DELETE);
        rule2.setAllowedOrigins(ALLOWED_ORIGIN);
        rule2.setAllowedHeaders(ALLOWED_HEADER, ALLOWED_HEADER + "1");
        BucketCrossOriginConfiguration config = new BucketCrossOriginConfiguration().withRules(
                rule1, rule2);

        s3.setBucketCrossOriginConfiguration(BUCKET_NAME, config);

        // Check reading it back
        bucketCrossOriginConfiguration = waitForbucketCrossOriginConfiguration(BUCKET_NAME);
        assertNotNull(bucketCrossOriginConfiguration);
        assertEquals(2, bucketCrossOriginConfiguration.getRules().size());

        for (CORSRule rule : bucketCrossOriginConfiguration.getRules()) {
            if (rule.getId().equals(ID1)) {
                assertTrue(rule.getAllowedMethods().contains(CORSRule.AllowedMethods.GET));
                assertTrue(rule.getAllowedMethods().contains(CORSRule.AllowedMethods.POST));
                assertEquals(MAX_AGE_SECONDS, rule.getMaxAgeSeconds());
                System.out.println(rule.getAllowedHeaders().size());
                assertTrue(rule.getAllowedHeaders().contains(ALLOWED_HEADER));
                assertTrue(rule.getAllowedHeaders().contains(ALLOWED_HEADER + "1"));
                assertTrue(rule.getExposedHeaders().contains(EXPOSE_HEADER));
                assertTrue(rule.getExposedHeaders().contains(EXPOSE_HEADER + "1"));
                assertEquals(ALLOWED_ORIGIN, rule.getAllowedOrigins().get(0));
            } else if (rule.getId().equals(ID2)) {
                assertTrue(rule.getAllowedMethods().contains(CORSRule.AllowedMethods.PUT));
                assertTrue(rule.getAllowedMethods().contains(CORSRule.AllowedMethods.DELETE));
                assertEquals(MAX_AGE_SECONDS, rule.getMaxAgeSeconds());
                assertTrue(rule.getAllowedHeaders().contains(ALLOWED_HEADER));
                assertTrue(rule.getAllowedHeaders().contains(ALLOWED_HEADER + "1"));
                assertTrue(rule.getExposedHeaders().contains(EXPOSE_HEADER));
                assertTrue(rule.getExposedHeaders().contains(EXPOSE_HEADER + "1"));
                assertEquals(ALLOWED_ORIGIN, rule.getAllowedOrigins().get(0));
            } else {
                fail("no such rule ID");
            }
        }
    }

    /**
     * waiting a CORS configuration become valid When exceed the poll time, will
     * throw Max poll time exceeded exception
     */
    private BucketCrossOriginConfiguration waitForbucketCrossOriginConfiguration(
            String bucketName) throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketCrossOriginConfiguration bucketCrossOriginConfiguration = s3
                    .getBucketCrossOriginConfiguration(bucketName);
            if (bucketCrossOriginConfiguration == null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return bucketCrossOriginConfiguration;
        }
        maxPollTimeExceeded();
        return null;
    }

    /**
     * waiting a CORS configuration become deleted When exceed the poll time,
     * will throw Max poll time exceeded exception
     */
    private static BucketCrossOriginConfiguration waitForbucketCrossOriginConfigurationDeleted(
            String bucketName) throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketCrossOriginConfiguration bucketCrossOriginConfiguration = null;

            if ((bucketCrossOriginConfiguration = s3.getBucketCrossOriginConfiguration(bucketName)) != null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return bucketCrossOriginConfiguration;
        }
        maxPollTimeExceeded();
        return null;

    }

}
