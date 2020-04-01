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

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.NoncurrentVersionTransition;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration.Rule;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LifecycleVersioningIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_NAME =
            "android-sdk-lifecycle-versioning-integration-test-"
                    + System.currentTimeMillis();

    private static final String TAG = LifecycleVersioningIntegrationTest.class.getSimpleName();

    @BeforeClass
    public static void setUp() throws Exception {
        setUpCredentials();
        s3 = new AmazonS3Client(credentials, Region.getRegion(Regions.US_WEST_2));

        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);
        assertTrue(BUCKET_NAME + " should exist.", s3.doesBucketExist(BUCKET_NAME));

        s3.setBucketVersioningConfiguration(
                new SetBucketVersioningConfigurationRequest(
                        BUCKET_NAME,
                        new BucketVersioningConfiguration("Enabled")));
    }

    @AfterClass
    public static void cleanUp() {
        deleteBucketAndAllContents(BUCKET_NAME);
    }

    @Test
    public void testRoundTrip() throws Exception {
        s3.setBucketLifecycleConfiguration(
                BUCKET_NAME,
                new BucketLifecycleConfiguration().withRules(
                        new Rule()
                                .withPrefix("/quick")
                                .withId("Quick")
                                .withStatus("Enabled")
                                .withNoncurrentVersionTransition(
                                        new NoncurrentVersionTransition()
                                                .withDays(0)
                                                .withStorageClass(StorageClass.Glacier))
                                .withNoncurrentVersionExpirationInDays(7),

                        new Rule()
                                .withPrefix("/slow")
                                .withId("Slow")
                                .withStatus("Enabled")
                                .withNoncurrentVersionTransition(
                                        new NoncurrentVersionTransition()
                                                .withDays(7)
                                                .withStorageClass(StorageClass.Glacier))
                                .withNoncurrentVersionExpirationInDays(60)
                        ));

        BucketLifecycleConfiguration result = waitForBucketLifecycleConfigurationCreated(BUCKET_NAME);

        Assert.assertEquals(2, result.getRules().size());

        Assert.assertEquals(0, result.getRules().get(0).getNoncurrentVersionTransition().getDays());
        Assert.assertEquals(StorageClass.Glacier, result.getRules().get(0)
                .getNoncurrentVersionTransition().getStorageClass());
        Assert.assertEquals(7, result.getRules().get(0).getNoncurrentVersionExpirationInDays());

        Assert.assertEquals(7, result.getRules().get(1).getNoncurrentVersionTransition().getDays());
        Assert.assertEquals(StorageClass.Glacier, result.getRules().get(1)
                .getNoncurrentVersionTransition().getStorageClass());
        Assert.assertEquals(60, result.getRules().get(1).getNoncurrentVersionExpirationInDays());
    }

    /**
     * waiting a lifecycle configuration become deleted When exceed the poll
     * time, will throw Max poll time exceeded exception
     */
    private static BucketLifecycleConfiguration waitForBucketLifecycleConfigurationCreated(String bucketName)
            throws Exception {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        while (System.currentTimeMillis() < endTime) {
            BucketLifecycleConfiguration bucketLifecycleConfiguration = null;

            if ((bucketLifecycleConfiguration = s3.getBucketLifecycleConfiguration(bucketName)) == null) {
                Log.d(TAG, "Waiting for BucketLifecycleConfiguration for bucket: " + bucketName + " to be created.");
                Thread.sleep(1000);
                hits = 0;
            }
            if (hits++ == 10)
                return bucketLifecycleConfiguration;
        }
        maxPollTimeExceeded();
        return null;
    }
}
