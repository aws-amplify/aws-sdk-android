/**
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import com.amazonaws.services.s3.S3IntegrationTestBase;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class PauseTransferIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_NAME = "android-sdk-transfer-util-integ-test-" + System.currentTimeMillis();
    private static TransferUtility util;
    private static Context context = ApplicationProvider.getApplicationContext();

    private File file;
    private CountDownLatch started;
    private CountDownLatch paused;
    private CountDownLatch resumed;
    private CountDownLatch completed;

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        setUp();
        TransferNetworkLossHandler.getInstance(context);
        util = TransferUtility.builder()
                .context(context)
                .s3Client(s3)
                .build();

        try {
            s3.createBucket(BUCKET_NAME);
            waitForBucketCreation(BUCKET_NAME);
        } catch (final Exception e) {
            System.out.println("Error in creating the bucket. "
                    + "Please manually create the bucket " + BUCKET_NAME);
        }
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
    }

    @Before
    public void setUpLatches() {
        started = new CountDownLatch(1);
        paused = new CountDownLatch(1);
        resumed = new CountDownLatch(1);
        completed = new CountDownLatch(1);
    }

    @Test
    public void testSinglePartUploadPause() throws Exception {
        // Small (1KB) file upload
        file = getRandomTempFile("small", 1000L);
        testUploadPause();
    }

    @Test
    public void testMultiPartUploadPause() throws Exception {
        // Large (10MB) file upload
        file = getRandomSparseFile("large", 10L * 1024 * 1024);
        testUploadPause();
    }

    private void testUploadPause() throws Exception {
        // start transfer and wait for progress
        TransferObserver observer = util.upload(BUCKET_NAME, file.getName(), file);
        observer.setTransferListener(new TestListener());
        started.await(100, TimeUnit.MILLISECONDS);

        // pause and wait
        util.pause(observer.getId());
        paused.await(100, TimeUnit.MILLISECONDS);
        Thread.sleep(1000); // throws if progress is made

        // resume if pause was properly executed
        util.resume(observer.getId());
        resumed.await(100, TimeUnit.MILLISECONDS);

        // cancel early to avoid having to wait for completion
        util.cancel(observer.getId());
        completed.await(1000, TimeUnit.MILLISECONDS);
    }

    private final class TestListener implements TransferListener {
        @Override
        public void onStateChanged(int id, TransferState state) {
            switch (state) {
                case CANCELED:
                case COMPLETED:
                    completed.countDown();
                    break;
                case PAUSED:
                    paused.countDown();
                    break;
                case IN_PROGRESS:
                    if (paused.getCount() == 0) {
                        // Post-pause
                        resumed.countDown();
                    } else {
                        // Pre-pause
                        started.countDown();
                    }
                    break;
                case FAILED:
                    throw new RuntimeException("Failed transfer.");
            }
        }

        @Override
        public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
            if (paused.getCount() == 0 && resumed.getCount() > 0) {
                throw new RuntimeException("Progress made even while paused.");
            }
        }

        @Override
        public void onError(int id, Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
