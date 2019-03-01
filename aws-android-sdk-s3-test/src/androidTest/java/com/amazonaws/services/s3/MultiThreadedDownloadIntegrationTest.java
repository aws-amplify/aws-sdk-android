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

import android.util.Log;

import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.testutils.util.RandomTempFile;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Integration test that continually downloads objects from S3 in multiple
 * threads and checks their contents. Intended to help test that HTTP
 * connections are being managed correctly, that the client runtime won't run
 * out of resources and start failing requests, and that the client can safely
 * be used from multiple threads.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class MultiThreadedDownloadIntegrationTest extends S3IntegrationTestBase {

    private static final String TAG = MultiThreadedDownloadIntegrationTest.class.getSimpleName();

    /** The total number of GET object requests made to Amazon S3 */
    private static final int TOTAL_REQUESTS = 1000;

    /** The total number of threads used to send GET object requests */
    private static final int TOTAL_THREADS = 20;

    /** The size of the file uploaded, and retrieved, from S3 */
    private static final long CONTENT_LENGTH = 231L;

    private String bucketName = "download-stress-integ-test-" + new Date().getTime();
    private String key = "key";
    private File file;
    private ExecutorService threadPool = Executors.newFixedThreadPool(TOTAL_THREADS);

    /** Releases all resources created by this test */
    @After
    public void tearDown() {
        try {
            s3.deleteObject(bucketName, key);
        } catch (Exception e) {
            Log.e(TAG, "Error in deleting the object: " + key);
            Assert.assertTrue("Error in deleting the object: " + key, false);
        }
        try {
            s3.deleteBucket(bucketName);
        } catch (Exception e) {
            Log.e(TAG, "Error in deleting the bucket: " + bucketName);
            Assert.assertTrue("Error in deleting the bucket: " + bucketName, false);
        }
    }

    /**
     * Tests that we can successfully download objects from multiple threads
     * using the same Amazon S3 client, and that the objects are downloaded
     * correctly, matching the content that we uploaded, and with the metadata
     * that we expect.
     */
    @Test
    public void testMultipleDownloads() throws Exception {
        file = new RandomTempFile("download-stress-integ-test-file.txt", CONTENT_LENGTH);
        s3.createBucket(bucketName);
        s3.putObject(bucketName, key, file);

        List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
        for (int i = 0; i < TOTAL_REQUESTS; i++) {
            tasks.add(new TimedGetObjectCallable());
        }

        List<Future<Integer>> futures = threadPool.invokeAll(tasks);
        for (java.util.Iterator iterator = futures.iterator(); iterator.hasNext();) {
            Future<Integer> future = (Future<Integer>) iterator.next();
            int executionTime = future.get().intValue();
            assertTrue(executionTime > 0);
            assertTrue(executionTime < 1000 * 10);
        }
    }

    /**
     * Simple Callable implementation that pulls an object from S3 and returns
     * the amount of time it took to make the request and receive the response,
     * since the callable was started.
     * <p>
     * Since we can't use JUnit asserts from threads spawned in tests (they
     * don't stop the test, they're just silently lost), we have to return -1 to
     * indicate that any of our tests failed, and then check that in the main
     * JUnit thread with an assert.
     *
     * @author Jason Fulghum <fulghum@amazon.com>
     */
    private class TimedGetObjectCallable implements Callable<Integer> {
        /** @see java.util.concurrent.Callable#call() */
        @Override
        public Integer call() throws Exception {
            try {
                long startTime = new Date().getTime();
                S3Object object = s3.getObject(bucketName, key);
                long endTime = new Date().getTime();

                // Compare the file with what we uploaded and return an
                // error code if it doesn't match up
                if (!doesFileEqualStream(file, object.getObjectContent())) {
                    System.err
                            .println("Uploaded file content doesn't match what we downloaded from S3");
                    return new Integer(-1);
                }

                // Compare some of the metadata with what we expect it to be
                // and return an error code if it doesn't match up
                if (CONTENT_LENGTH != object.getObjectMetadata().getContentLength()) {
                    System.err.println("Returned Content-Length doesn't match what we expected");
                    return new Integer(-1);
                }

                return new Integer((int) (endTime - startTime));
            } catch (Exception e) {
                e.printStackTrace();
                return new Integer(-1);
            }
        }
    }
}
