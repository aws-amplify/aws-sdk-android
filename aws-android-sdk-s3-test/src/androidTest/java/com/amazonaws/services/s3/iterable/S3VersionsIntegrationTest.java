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

package com.amazonaws.services.s3.iterable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.DeleteVersionRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class S3VersionsIntegrationTest extends S3IntegrationTestBase {

    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-s3-version-iteration-test-"
            + System.currentTimeMillis();

    @After
    public void deleteBucketContents() throws Exception {
        deleteAllVersionedContents();
        Thread.sleep(1000 * 2);
    }

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void createVersionedBucket() throws Exception {

        s3.createBucket(BUCKET_NAME);
        waitForBucketCreation();

        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(BUCKET_NAME,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
        waitForBucketVersioningToBeEnabled(BUCKET_NAME);

    }

    @AfterClass
    public static void tearDown() throws Exception {
        deleteBucketAndAllVersionedContents(BUCKET_NAME);
    }

    @Test
    public void testIteratingAFewVersions() throws Exception {
        putObject("1-one");
        putObject("2-two");
        putObject("3-three");

        Thread.sleep(200);

        checkIteration(S3Versions.inBucket(s3, BUCKET_NAME), "1-one", "2-two", "3-three");
    }

    protected void putObject(String key) {
        ObjectMetadata meta = new ObjectMetadata();
        meta.setContentLength(5);
        s3.putObject(BUCKET_NAME, key, new ByteArrayInputStream("HELLO".getBytes(StringUtils.UTF8)),
                meta);
    }

    @Test
    public void testIteratingWithMultiplePages() throws Exception {
        putObject("1-one");
        putObject("1-one");
        putObject("2-two");
        putObject("3-three");

        Thread.sleep(200);

        checkIteration(S3Versions.inBucket(s3, BUCKET_NAME).withBatchSize(1), "1-one", "1-one",
                "2-two", "3-three");
    }

    @Test
    public void testIteratingWithPrefix() throws Exception {
        putObject("foobar");
        putObject("foobaz");
        putObject("something");

        Thread.sleep(200);

        checkIteration(S3Versions.withPrefix(s3, BUCKET_NAME, "foo"), "foobar", "foobaz");
    }

    @Test
    public void testIteratingForKey() throws Exception {
        putObject("the-key");
        putObject("the-key");
        putObject("the-other-key");

        Thread.sleep(200);

        checkIteration(S3Versions.forKey(s3, BUCKET_NAME, "the-key"), "the-key", "the-key");
    }

    @Test
    public void testIteratingForKeyWithMultiplePages() throws Exception {
        putObject("the-key");
        putObject("the-key");
        putObject("the-other-key");

        Thread.sleep(200);

        checkIteration(S3Versions.forKey(s3, BUCKET_NAME, "the-key").withBatchSize(1), "the-key",
                "the-key");
    }

    private void checkIteration(S3Versions versions, String... expectedKeys) {
        Iterator<String> iter = Arrays.asList(expectedKeys).iterator();
        for (S3VersionSummary version : versions) {
            assertTrue("too many items", iter.hasNext());
            assertEquals(iter.next(), version.getKey());
        }
        assertFalse("too few items", iter.hasNext());
    }

    /**
     * waiting the bucket versioning configuration to be enabled A runtime
     * exception will be thrown if this method doesn't detect the versioniong is
     * enabled before the ending period.
     *
     * @throws InterruptedException
     */
    private static void waitForBucketVersioningToBeEnabled(String bucketName)
            throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (30 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketVersioningConfiguration config = s3.getBucketVersioningConfiguration(bucketName);
            if (config.getStatus().equals(BucketVersioningConfiguration.ENABLED)) {
                hits++;
            }
            else {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits == 10) {
                return;
            }
        }
        throw new RuntimeException("Max poll time exceeded");
    }

    /**
     * Deletes all object versions in the given bucket
     *
     * @throws InterruptedException
     */
    private void deleteAllVersionedContents() throws InterruptedException {
        // Delete all the versions in the bucket first
        Thread.sleep(1000 * 3);
        VersionListing versionListing = s3.listVersions(BUCKET_NAME, null);
        do {
            for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                    .hasNext();) {
                S3VersionSummary version = (S3VersionSummary) iterator.next();

                try {
                    s3.deleteVersion(new DeleteVersionRequest(
                            BUCKET_NAME, version.getKey(), version.getVersionId()));
                } catch (Exception e) {
                }
            }
            versionListing = s3.listNextBatchOfVersions(versionListing);
        } while (versionListing.isTruncated());

        Thread.sleep(1000 * 3);
    }

    /**
     * Waits for the specified bucket to be created. A runtime exception will be
     * thrown if this method doesn't detect the bucket is created before the
     * ending period.
     *
     * @throws InterruptedException
     */
    private static void waitForBucketCreation() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (30 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            if (!s3.doesBucketExist(BUCKET_NAME)) {
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return;
        }
        throw new RuntimeException("Max poll time exceeded");
    }

}
