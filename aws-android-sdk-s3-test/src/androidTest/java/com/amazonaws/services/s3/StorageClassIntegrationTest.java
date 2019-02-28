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
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.After;
import org.junit.Test;

/**
 * Integration test for S3 storage class related operations.
 */
public class StorageClassIntegrationTest extends S3IntegrationTestBase {

    private String bucketName = "java-storage-class-integ-test-" + System.currentTimeMillis();

    /**
     * Releases all resources allocated by this test.
     */
    @After
    public void tearDown() throws Exception {
        deleteBucketAndAllVersionedContents(bucketName);
    }

    /**
     * Tests that we can change an object's storage class, upload objects in a
     * specific storage class, and retrive an object's storage class, both for
     * versioned and unversioned objects.
     */
    @Test
    public void testStorageClasses() throws Exception {
        s3.createBucket(bucketName);

        // Upload an object with standard storage
        putObject(bucketName, "key", StorageClass.Standard.toString());
        assertStorageClass(bucketName, "key", StorageClass.Standard);

        // Upload an object with reduced redundancy storage
        putObject(bucketName, "key", StorageClass.ReducedRedundancy.toString());
        assertStorageClass(bucketName, "key", StorageClass.ReducedRedundancy);

        // Move to regular storage
        s3.changeObjectStorageClass(bucketName, "key", StorageClass.Standard);
        assertStorageClass(bucketName, "key", StorageClass.Standard);

        // Move back to reduced redundancy storage
        s3.changeObjectStorageClass(bucketName, "key", StorageClass.ReducedRedundancy);
        assertStorageClass(bucketName, "key", StorageClass.ReducedRedundancy);

        // Turn on versioning
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                bucketName,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));

        // Upload a new version with standard storage
        putObject(bucketName, "key", StorageClass.Standard.toString());
        assertStorageClass(bucketName, "key", StorageClass.Standard);

        // Move to reduced redundancy storage
        s3.changeObjectStorageClass(bucketName, "key", StorageClass.ReducedRedundancy);
        assertStorageClass(bucketName, "key", StorageClass.ReducedRedundancy);

        // And move back to standard storage
        s3.changeObjectStorageClass(bucketName, "key", StorageClass.Standard);
        assertStorageClass(bucketName, "key", StorageClass.Standard);
    }

    /*
     * Private Interface
     */

    /**
     * Uploads some random test data to the object stored in the specified
     * bucket and key, and uses the specified storage class.
     */
    private void putObject(String bucketName, String key, String storageClass) {
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
    private void assertStorageClass(String bucketName, String key, StorageClass expectedStorageClass)
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
