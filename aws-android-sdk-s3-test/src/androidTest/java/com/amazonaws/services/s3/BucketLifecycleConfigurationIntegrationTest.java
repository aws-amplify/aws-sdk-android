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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Transition;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.testutils.util.RandomTempFile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;

/**
 * Integration tests for multi object delete.
 */
public class BucketLifecycleConfigurationIntegrationTest extends S3IntegrationTestBase {

    private static final boolean ANDROID_TESTING = false;

    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-bucket-lifecycle-integ-test-"
            + System.currentTimeMillis();

    /** The key used in these tests */
    private static final String KEY = "key";

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    /** The expiration date of an object in Java Date format for the tests */
    private static final String EXPIRATION_DATE = "2012-06-01T00:00:00.000Z";

    /**
     * The transition date of an object (change the storage class) in Java Date
     * format for the tests
     */
    private static final String TRANSITION_DATE = "2012-05-31T00:00:00.000Z";

    /**
     * The time in days from object's creation to its expiration used in the
     * tests
     */
    private static final int EXPIRATION_IN_DAYS = 10;

    /**
     * The time in days from an object's creation to the transition time(change
     * the storage class) used in the tests
     */
    private static final int TRANSITION_TIME_IN_DAYS = 5;

    @AfterClass
    public static void tearDown() throws Exception {
        // Delete the config
        s3.deleteBucketLifecycleConfiguration(BUCKET_NAME);
        assertNull(waitForBucketLifecycleConfigurationDeleted(BUCKET_NAME));

        // Delete the bucket
        deleteBucketAndAllContents(BUCKET_NAME);

        // Delete the local file
        if (file != null) {
            file.delete();
        }
    }

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        S3IntegrationTestBase.setUp();

        if (!ANDROID_TESTING) {
            setUpCredentials();
        }

        tempData = tempDataBuffer(1000);

        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);

        ObjectMetadata metadata = null;
        if (!ANDROID_TESTING) {
            file = new RandomTempFile("get-object-integ-test", 1000L);
            s3.putObject(BUCKET_NAME, KEY, file);
        } else {
            file = S3IntegrationTestBase.getRandomTempFile("foo", 1000L);
            ByteArrayInputStream bais = new ByteArrayInputStream(tempData);

            metadata = new ObjectMetadata();
            metadata.setContentLength(1000);

            s3.putObject(new PutObjectRequest(BUCKET_NAME, KEY, bais, metadata));
            bais.close();
        }
    }

    @Test
    public void testBucketLifecycle() throws Exception {
        // Check the bucket for its existing lifecycle config
        BucketLifecycleConfiguration bucketLifecycleConfiguration = s3
                .getBucketLifecycleConfiguration(BUCKET_NAME);
        assertNull(bucketLifecycleConfiguration);

        // Apply a config
        String ruleId = "abc";
        Transition transition = new Transition();
        transition.setDays(TRANSITION_TIME_IN_DAYS);
        transition.setStorageClass(StorageClass.Glacier);
        Rule rule1 = new Rule().withExpirationInDays(EXPIRATION_IN_DAYS).withId(ruleId)
                .withPrefix("prefix").withStatus(BucketLifecycleConfiguration.ENABLED)
                .withTransition(transition);
        transition = new Transition();
        transition.setDate(ServiceUtils.parseIso8601Date(TRANSITION_DATE));
        transition.setStorageClass(StorageClass.Glacier);
        Rule rule2 = new Rule().withExpirationDate(ServiceUtils.parseIso8601Date(EXPIRATION_DATE))
                .withTransition(transition).withPrefix("another")
                .withStatus(BucketLifecycleConfiguration.DISABLED);
        BucketLifecycleConfiguration config = new BucketLifecycleConfiguration().withRules(rule1,
                rule2);
        s3.setBucketLifecycleConfiguration(BUCKET_NAME, config);

        // Check reading it back
        bucketLifecycleConfiguration = waitForBucketLifecycleConfiguration(BUCKET_NAME);
        assertNotNull(bucketLifecycleConfiguration);
        assertEquals(2, bucketLifecycleConfiguration.getRules().size());
        boolean seen1 = false, seen2 = false;
        for (Rule rule : bucketLifecycleConfiguration.getRules()) {
            if (rule.getId().equals(ruleId)) {
                seen1 = true;
                assertEquals(BucketLifecycleConfiguration.ENABLED, rule.getStatus());
                assertEquals("prefix", rule.getPrefix());
                assertEquals(EXPIRATION_IN_DAYS, rule.getExpirationInDays());
                assertEquals(TRANSITION_TIME_IN_DAYS, rule.getTransition().getDays());
                assertEquals(StorageClass.Glacier, rule.getTransition().getStorageClass());
            } else {
                seen2 = true;
                assertNotNull(rule.getId());
                assertEquals(BucketLifecycleConfiguration.DISABLED, rule.getStatus());
                assertEquals(ServiceUtils.formatIso8601Date(rule.getExpirationDate()),
                        EXPIRATION_DATE);
                assertEquals(ServiceUtils.formatIso8601Date(rule.getTransition().getDate()),
                        TRANSITION_DATE);
                assertEquals(StorageClass.Glacier, rule.getTransition().getStorageClass());
                assertEquals("another", rule.getPrefix());
            }
        }
        assertTrue(seen1);
        assertTrue(seen2);

        // Now put some objects and see if they have the right headers returned
        String expiringKey = "prefixKey";
        s3.putObject(BUCKET_NAME, expiringKey, file);
        ObjectMetadata metadataExpriringKey = waitForObjectWithExpirationKeyExisit(BUCKET_NAME,
                expiringKey);

        String nonExpiringKey = "anotherKey";
        s3.putObject(BUCKET_NAME, nonExpiringKey, file);
        ObjectMetadata metadataNonExpriringKey = waitForObjectWithNonExpirationKeyExisit(
                BUCKET_NAME, nonExpiringKey);

        assertNotNull(metadataExpriringKey.getExpirationTime());
        assertEquals(ruleId, metadataExpriringKey.getExpirationTimeRuleId());

        assertNull(metadataNonExpriringKey.getExpirationTime());
        assertNull(metadataNonExpriringKey.getExpirationTimeRuleId());

        // There are several APIs that are affected by this header; test them
        ObjectMetadata copyObjectMetadata = null;
        s3.copyObject(new CopyObjectRequest(BUCKET_NAME, expiringKey, BUCKET_NAME, expiringKey + "2"));
        copyObjectMetadata = waitForObjectWithExpirationKeyExisit(BUCKET_NAME, expiringKey + "2");

        assertNotNull(copyObjectMetadata.getExpirationTime());
        assertEquals(ruleId, copyObjectMetadata.getExpirationTimeRuleId());

        s3.copyObject(new CopyObjectRequest(BUCKET_NAME, nonExpiringKey, BUCKET_NAME, nonExpiringKey
                + "2"));
        copyObjectMetadata = waitForObjectWithNonExpirationKeyExisit(BUCKET_NAME, nonExpiringKey
                + "2");

        assertNull(copyObjectMetadata.getExpirationTime());
        assertNull(copyObjectMetadata.getExpirationTimeRuleId());

        metadataExpriringKey = waitForObjectWithExpirationKeyExisit(BUCKET_NAME, expiringKey);
        assertNotNull(metadataExpriringKey.getExpirationTime());
        assertEquals(ruleId, metadataExpriringKey.getExpirationTimeRuleId());

        metadataNonExpriringKey = waitForObjectWithNonExpirationKeyExisit(BUCKET_NAME,
                nonExpiringKey);
        assertNull(metadataNonExpriringKey.getExpirationTime());
        assertNull(metadataNonExpriringKey.getExpirationTimeRuleId());

        // TODO: test multipart upload
    }

    /**
     * waiting a lifecycle configuration become valid When exceed the poll time,
     * will throw Max poll time exceeded exception
     */
    private BucketLifecycleConfiguration waitForBucketLifecycleConfiguration(
            String bucketName) throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketLifecycleConfiguration bucketLifecycleConfiguration = s3
                    .getBucketLifecycleConfiguration(bucketName);
            if (bucketLifecycleConfiguration == null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return bucketLifecycleConfiguration;
        }
        maxPollTimeExceeded();
        return null;
    }

    /**
     * waiting a lifecycle configuration become deleted When exceed the poll
     * time, will throw Max poll time exceeded exception
     */
    private static BucketLifecycleConfiguration waitForBucketLifecycleConfigurationDeleted(String bucketName)
            throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketLifecycleConfiguration bucketLifecycleConfiguration = null;

            if ((bucketLifecycleConfiguration = s3.getBucketLifecycleConfiguration(bucketName)) != null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return bucketLifecycleConfiguration;
        }
        maxPollTimeExceeded();
        return null;

    }

    /**
     * waiting a object with expiring key exist When exceed the poll time, will
     * throw Max poll time exceeded exception
     */
    private ObjectMetadata waitForObjectWithExpirationKeyExisit(String bucketName, String key)
            throws Exception {
        long startTime = System.currentTimeMillis();
        ObjectMetadata metadata = null;
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            if (!doesObjectExist(bucketName, key)
                    || (metadata = s3.getObjectMetadata(bucketName, key)).getExpirationTime() == null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return metadata;
        }
        maxPollTimeExceeded();
        return null;
    }

    /**
     * waiting a object without expiring key exist When exceed the poll time,
     * will throw Max poll time exceeded exception
     */
    private ObjectMetadata waitForObjectWithNonExpirationKeyExisit(String bucketName, String key)
            throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        ObjectMetadata metadata = null;
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            if (!doesObjectExist(bucketName, key)
                    || (metadata = s3.getObjectMetadata(bucketName, key)).getExpirationTime() != null) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return metadata;
        }
        maxPollTimeExceeded();
        return null;
    }

}
