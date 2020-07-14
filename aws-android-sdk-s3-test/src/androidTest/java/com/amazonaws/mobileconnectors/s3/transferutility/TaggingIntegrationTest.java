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

import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.GetObjectTaggingRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Tag;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class TaggingIntegrationTest extends S3IntegrationTestBase {

    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-transfer-util-integ-test-" + System.currentTimeMillis();

    /** Instrumentation test context */
    private static Context context = ApplicationProvider.getApplicationContext();

    /** Countdown latch for testing */
    private static CountDownLatch latch;

    /** The transfer utility used to upload to S3 */
    private static TransferUtility util;

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The metadata for the object. */
    private ObjectMetadata metadata;

    /** Simple transfer listener to confirm upload completion before bucket deletion */
    private static final TransferListener listener = new TransferListener() {

        public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
        }

        public void onStateChanged(int id, TransferState state) {
            if (state.equals(TransferState.COMPLETED)) { latch.countDown(); }
        }

        public void onError(int id, Exception ex) {
            fail(ex.getMessage());
        }
    };

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        setUp();
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

        if (file != null) {
            file.delete();
        }
    }

    @Test
    public void testSinglePartUploadTagging() throws Exception {
        // Object metadata to add
        metadata = new ObjectMetadata();
        metadata.addUserMetadata("x-amz-tagging", "key1=value1&key2=value2");
        metadata.addUserMetadata("key3", "value3"); // Should not get added to tags

        latch = new CountDownLatch(1);
        // Small (1KB) file upload
        file = getRandomTempFile("small", 1000L);
        util.upload(BUCKET_NAME, file.getName(), file, metadata)
                .setTransferListener(listener);
        latch.await(300, TimeUnit.SECONDS);

        List<Tag> tags = s3.getObjectTagging(new GetObjectTaggingRequest(
                BUCKET_NAME,
                file.getName()
        )).getTagSet();
        assertThat(tags.size(), is(2));
        assertThat(tags, hasItems(
                new Tag("key1", "value1"),
                new Tag("key2", "value2")
        ));
    }

    @Test
    public void testMultiPartUploadTagging() throws Exception {
        // Object metadata to add
        metadata = new ObjectMetadata();
        metadata.addUserMetadata("x-amz-tagging", "key1=value1&key2=value2");
        metadata.addUserMetadata("key3", "value3"); // Should not get added to tags

        latch = new CountDownLatch(1);
        // Large (5MB) file upload
        long size = 5 * 1024 * 1024 + 1;
        file = getRandomSparseFile("large", size);
        util.upload(BUCKET_NAME, file.getName(), file, metadata)
                .setTransferListener(listener);
        latch.await(300, TimeUnit.SECONDS);

        List<Tag> tags = s3.getObjectTagging(new GetObjectTaggingRequest(
                BUCKET_NAME,
                file.getName()
        )).getTagSet();
        assertThat(tags.size(), is(2));
        assertThat(tags, hasItems(
                new Tag("key1", "value1"),
                new Tag("key2", "value2")
        ));
    }
}
