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

import android.util.Log;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Integration test for S3 storage class related operations.
 */
public class StorageClassIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_NAME = "android-sdk-storage-class-integ-test-" + System.currentTimeMillis();

    private static final String TAG = StorageClassIntegrationTest.class.getSimpleName();

    @BeforeClass
    public static void setUp() {
        try {
            S3IntegrationTestBase.setUp();
            s3.createBucket(BUCKET_NAME);
            waitForBucketCreation(BUCKET_NAME);
        } catch (Exception ex) {
            Log.e(TAG, "Error in creating the bucket: " + BUCKET_NAME);
            assertTrue("Error in creating the bucket: " + BUCKET_NAME, false);
        }
    }

    /**
     * Releases all resources allocated by this test.
     */
    @AfterClass
    public static void tearDown() {
        try {
            deleteBucketAndAllVersionedContents(BUCKET_NAME);
        } catch (Exception ex) {
            Log.e(TAG, "Error in deleting the bucket: " + BUCKET_NAME);
        }
    }

    /**
     * Tests that we can change an object's storage class, upload objects in a
     * specific storage class, and retrieve an object's storage class, both for
     * versioned and non-versioned objects.
     */
    @Test
    public void testStorageClasses() throws Exception {
        // Upload an object with standard storage
        putObject(BUCKET_NAME, "key", StorageClass.Standard.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.Standard);

        // Upload an object with reduced redundancy storage
        putObject(BUCKET_NAME, "key", StorageClass.ReducedRedundancy.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);

        // Move to Standard storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.Standard);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.Standard);

        // Move back to reduced redundancy storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);

        // Turn on versioning
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                BUCKET_NAME,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));

        // Upload a new version with standard storage
        putObject(BUCKET_NAME, "key", StorageClass.Standard.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.Standard);

        // Move to reduced redundancy storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);

        // And move back to standard storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.Standard);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.Standard);
    }

    /**
     * Tests that we can change an object's storage class, upload objects in a
     * specific storage class, and retrive an object's storage class.
     */
    @Test
    public void testStorageClasseIntelligentTiering() throws Exception {
        // Upload an object with IntelligentTiering storage
        putObject(BUCKET_NAME, "key", StorageClass.IntelligentTiering.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);

        // Upload an object with reduced redundancy storage
        putObject(BUCKET_NAME, "key", StorageClass.ReducedRedundancy.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);

        // Move to Standard storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.Standard);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.Standard);

        // Move back to IntelligentTiering storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);

        // Turn on versioning
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                BUCKET_NAME,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));

        // Upload a new version with IntelligentTiering storage
        putObject(BUCKET_NAME, "key", StorageClass.IntelligentTiering.toString());
        assertStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);

        // Move to reduced redundancy storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.ReducedRedundancy);

        // And move back to IntelligentTiering storage
        s3.changeObjectStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);
        assertStorageClass(BUCKET_NAME, "key", StorageClass.IntelligentTiering);
    }

    /*
     * Private Interface
     */

    /**
     * Uploads some random test data to the object stored in the specified
     * bucket and key, and uses the specified storage class.
     */
    private void putObject(String bucketName,
                           String key,
                           String storageClass) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(1230);
        PutObjectRequest request = new PutObjectRequest(bucketName, key,
                new RandomInputStream(metadata.getContentLength()), metadata);
        request.setStorageClass(storageClass);
        s3.putObject(request);
    }

    /**
     * Asserts that the latest version for the specified object is stored in the
     * expected storage class, otherwise this method fails the current test.
     */
    private void assertStorageClass(String bucketName,
                                    String key,
                                    StorageClass expectedStorageClass)
            throws Exception {
        // Short pause for eventual consistency
        Thread.sleep(1000 * 3);

        VersionListing versionListing = s3.listVersions(bucketName, key);
        for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                .hasNext();) {
            S3VersionSummary versionSummary = (S3VersionSummary) iterator.next();

            if (versionSummary.isLatest() && versionSummary.getKey().equals(key)) {
                assertEquals(expectedStorageClass.toString(), versionSummary.getStorageClass());
                return;
            }
        }

        fail("Expected an object stored under key '" + key + "', but didn't find one");
    }

}
