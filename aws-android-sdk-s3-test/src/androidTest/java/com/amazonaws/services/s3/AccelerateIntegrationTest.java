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

import com.amazonaws.AmazonClientException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketAccelerateStatus;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class AccelerateIntegrationTest extends S3IntegrationTestBase {
    private static final String BUCKET = "android-sdk-acceleration-integration-test-" + System.currentTimeMillis();
    private static final int CONFIGURATION_PROPAGATION_WAIT_ATTEMPTS = 10;
    private static final int CONFIGURATION_PROPAGATION_WAIT_TIME = 50;
    private static final String KEY = "key";

    private static AmazonS3Client accelerateS3;

    @Before
    public void setupBucket() throws Exception {
        s3.createBucket(BUCKET);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET);

        accelerateS3 = new AmazonS3Client(credentials, Region.getRegion(Regions.US_WEST_1));
        accelerateS3.setS3ClientOptions(
                S3ClientOptions.builder().setAccelerateModeEnabled(true).build());
    }

    @After
    public void teardown() throws Exception {
        try {
            if (s3.doesObjectExist(BUCKET, KEY)) {
                s3.deleteObject(BUCKET, KEY);
            }
        } catch (AmazonClientException ace) {
            ace.printStackTrace();
        }

        try {
            s3.deleteBucket(BUCKET);
        } catch (AmazonClientException ace) {
            ace.printStackTrace();
        }
    }

    @Test
    public void testGetAndSetAcceleration() throws Exception {
        setBucketAccelerationAndWait(BUCKET, BucketAccelerateStatus.Enabled);
        assertEquals(BucketAccelerateStatus.Enabled.toString(),
                s3.getBucketAccelerateConfiguration(BUCKET).getStatus());

        setBucketAccelerationAndWait(BUCKET, BucketAccelerateStatus.Suspended);
        assertEquals(BucketAccelerateStatus.Suspended.toString(),
                s3.getBucketAccelerateConfiguration(BUCKET).getStatus());
    }

    @Test(expected = AmazonS3Exception.class)
    public void testAccessWithAccelerateClient() throws Exception {
        setBucketAccelerationAndWait(BUCKET, BucketAccelerateStatus.Suspended);

        try {
            accelerateS3.getBucketAccelerateConfiguration(BUCKET);
        } catch (AmazonS3Exception ase) {
            System.out.println(ase.toString());
            ase.printStackTrace();
            assertEquals("InvalidRequest", ase.getErrorCode());
            throw ase;
        }
    }

    @Test
    public void testPutAndGetObjectWithAccelerateClient() throws Exception {
        setBucketAccelerationAndWait(BUCKET, BucketAccelerateStatus.Enabled);

        long contentLength = 128 * 1024;
        File file = getRandomTempFile(KEY, contentLength);
        accelerateS3.putObject(BUCKET, KEY, file);
        GetObjectRequest req = new GetObjectRequest(BUCKET, KEY);
        File output = new File("output");
        output.deleteOnExit();
        S3Object obj = accelerateS3.getObject(req);
        assertNotNull(obj);
        assertFileEqualsStream(file, obj.getObjectContent());
        obj.getObjectContent().close();
    }

    void setBucketAccelerationAndWait(String bucket, BucketAccelerateStatus status)
            throws InterruptedException {
        accelerateS3.setBucketAccelerateConfiguration(bucket,
                new BucketAccelerateConfiguration(status));

        for (int i = 0; i < CONFIGURATION_PROPAGATION_WAIT_ATTEMPTS; i++) {
            if (getBucketAccelerationStatus(bucket) == status) {
                return;
            }

            Thread.sleep(CONFIGURATION_PROPAGATION_WAIT_TIME);
        }

        throw new IllegalStateException(
                "Could not configure acceleration to " + status + " on " + bucket);
    }

    BucketAccelerateStatus getBucketAccelerationStatus(String bucket) {
        try {
            BucketAccelerateConfiguration config =
                    accelerateS3.getBucketAccelerateConfiguration(bucket);

            return BucketAccelerateStatus.fromValue(config.getStatus());
        } catch (AmazonS3Exception e) {
            // Apparently if acceleration is disabled, the service returns an error for a
            // configuration query. If we receive any exception return Suspended.
            return BucketAccelerateStatus.Suspended;
        }
    }
}
