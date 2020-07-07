/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.SocketTimeoutException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Mock S3 client that throws SocketTimeoutException
 * to trigger an upload failure
 */
class SocketTimeoutMockS3Client extends AmazonS3Client {
    private boolean transferEnabled;

    public SocketTimeoutMockS3Client(AWSCredentials credentials, Region region) {
        super(credentials, region);
        transferEnabled = false;
    }

    public void setTransferEnabled(boolean enable) {
        transferEnabled = enable;
    }

    @Override
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        if (transferEnabled) {
            return super.putObject(putObjectRequest);
        } else {
            throw new AmazonClientException(new SocketTimeoutException());
        }
    }

    @Override
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
            throws AmazonClientException, AmazonServiceException {
        if (transferEnabled) {
            return super.uploadPart(uploadPartRequest);
        } else {
            throw new AmazonClientException(new SocketTimeoutException());
        }
    }
}

public class SocketTimeoutIntegrationTest extends S3IntegrationTestBase {
    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-transfer-util-integ-test-" + System.currentTimeMillis();

    /** Instrumentation test context */
    private static Context context = ApplicationProvider.getApplicationContext();

    /** Mock S3 client to artificially throw socket timeout exception */
    private static SocketTimeoutMockS3Client mockS3;

    /** The transfer utility used to upload to S3 */
    private static TransferUtility util;

    /** Countdown latch for testing */
    private static CountDownLatch latch;

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        setUp();

        try {
            s3.createBucket(BUCKET_NAME);
            waitForBucketCreation(BUCKET_NAME);
        } catch (final Exception e) {
            System.out.println("Error in creating the bucket. "
                    + "Please manually create the bucket " + BUCKET_NAME);
        }
    }

    @Before
    public void setUpBeforeTest() {
        mockS3 = new SocketTimeoutMockS3Client(credentials,
                Region.getRegion(Regions.US_WEST_1));

        util = TransferUtility.builder()
                .context(context)
                .s3Client(mockS3)
                .build();
    }

    @AfterClass
    public static void tearDown() {
        try {
            deleteBucketAndAllContents(BUCKET_NAME);
        } catch (final Exception e) {
            System.out.println("Error in deleting the bucket. "
                    + "Please manually delete the bucket " + BUCKET_NAME);
            e.printStackTrace();
        }

        if (file != null) {
            file.delete();
        }
    }

    @Test
    public void testSinglePartUploadTimeout() throws Exception {
        TransferObserver observer;

        // Small (1KB) file upload
        file = getRandomTempFile("small", 1000L);

        // First attempt at uploading should throw socket timeout exception error
        latch = new CountDownLatch(1);
        mockS3.setTransferEnabled(false);
        observer = util.upload(BUCKET_NAME, file.getName(), file);
        observer.setTransferListener(new TransferListener() {
            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            }

            @Override
            public void onStateChanged(int id, TransferState state) {
                if (state.equals(TransferState.FAILED)) { latch.countDown(); }
            }

            @Override
            public void onError(int id, Exception ex) {
            }
        });
        latch.await(300, TimeUnit.SECONDS);
        assertEquals(TransferState.FAILED, observer.getState());

        // Attempt to resume should complete upload as intended
        latch = new CountDownLatch(1);
        mockS3.setTransferEnabled(true);
        observer = util.resume(observer.getId());
        observer.setTransferListener(new TransferListener() {
            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            }

            @Override
            public void onStateChanged(int id, TransferState state) {
                if (state.equals(TransferState.COMPLETED)) { latch.countDown(); }
            }

            @Override
            public void onError(int id, Exception ex) {
                fail(ex.getMessage());
            }
        });
        latch.await(300, TimeUnit.SECONDS);
        assertEquals(TransferState.COMPLETED, observer.getState());
    }

    @Test
    public void testMultiPartUploadTimeout() throws Exception {
        TransferObserver observer;

        // Large (5MB) file upload
        long size = 20 * 1024 * 1024 + 1;
        file = getRandomSparseFile("large", size);

        // First attempt at uploading should throw socket timeout exception error
        latch = new CountDownLatch(1);
        mockS3.setTransferEnabled(false);
        observer = util.upload(BUCKET_NAME, file.getName(), file);
        observer.setTransferListener(new TransferListener() {
            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            }

            @Override
            public void onStateChanged(int id, TransferState state) {
                if (state.equals(TransferState.FAILED)) { latch.countDown(); }
            }

            @Override
            public void onError(int id, Exception ex) {
            }
        });
        latch.await(300, TimeUnit.SECONDS);
        assertEquals(TransferState.FAILED, observer.getState());

        // Attempt to resume should complete upload as intended
        latch = new CountDownLatch(1);
        mockS3.setTransferEnabled(true);
        observer = util.resume(observer.getId());
        observer.setTransferListener(new TransferListener() {
            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            }

            @Override
            public void onStateChanged(int id, TransferState state) {
                if (state.equals(TransferState.COMPLETED)) { latch.countDown(); }
            }

            @Override
            public void onError(int id, Exception ex) {
                fail(ex.getMessage());
            }
        });
        latch.await(300, TimeUnit.SECONDS);
        assertEquals(TransferState.COMPLETED, observer.getState());
    }
}

