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

import static com.amazonaws.services.s3.internal.crypto.CryptoTestUtils.awsTestCredentials;
import static com.amazonaws.services.s3.internal.crypto.CryptoTestUtils.deleteBucketAndAllContents;
import static com.amazonaws.services.s3.internal.crypto.CryptoTestUtils.tempBucketName;
import static com.amazonaws.services.s3.internal.crypto.CryptoTestUtils.tryCreateBucket;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AbortedException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.testutils.util.ConstantInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Ignore("aws test credentials is not setup for Android")
public class S3InterruptIntegrationTest {
    private static final boolean DEBUG = false;
    private static final int DATA_SIZE = 30 * 1024 * 1024;
    private static boolean cleanup = true;
    private static final String TEST_BUCKET = tempBucketName(S3InterruptIntegrationTest.class);
    private static AmazonS3Client s3;

    @BeforeClass
    public static void setup() throws Exception {
        s3 = new AmazonS3Client(awsTestCredentials(), Region.getRegion(Regions.DEFAULT_REGION));
        tryCreateBucket(s3, TEST_BUCKET);
    }

    @AfterClass
    public static void cleanup() throws Exception {
        if (cleanup) {
            final AmazonS3Client s3 = new AmazonS3Client(awsTestCredentials(),
                    Region.getRegion(Regions.DEFAULT_REGION));
            deleteBucketAndAllContents(s3, TEST_BUCKET);
        }
        s3.shutdown();
    }

    // Interrupting thread doesn't really abort the upload early UNLESS
    // the content length is set
    @Test
    public void testUploadInterrupts() throws InterruptedException {
        final InputStream is = new ConstantInputStream(DATA_SIZE, (byte) 'Z');
        final ObjectMetadata omd = new ObjectMetadata();
        omd.setContentLength(DATA_SIZE);
        final PutObjectRequest req = new PutObjectRequest(TEST_BUCKET, "test",
                is, omd);
        final Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s3.putObject(req);
                    fail("PUT should have been aborted");
                } catch (final AbortedException expected) {
                    // expected
                }
            }
        });
        t.start();
        do {
            t.join(2000);
            if (t.isAlive()) {
                t.interrupt();
                debug("Upload thread interrupted");
            } else {
                debug("Upload thread joined");
            }
        } while (t.isAlive());
        debug("Upload done");
    }

    @Test
    public void testUploadInterruptsViaFuture() throws InterruptedException {
        final InputStream is = new ConstantInputStream(DATA_SIZE, (byte) 'Z');
        final ObjectMetadata omd = new ObjectMetadata();
        omd.setContentLength(DATA_SIZE);
        final PutObjectRequest req = new PutObjectRequest(TEST_BUCKET, "test",
                is, omd);
        final ExecutorService es = Executors.newSingleThreadExecutor();
        final Boolean[] success = {
            null
        };
        final Future<?> f = es.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    s3.putObject(req);
                    synchronized (success) {
                        success[0] = Boolean.FALSE;
                    }
                    return;
                } catch (final AbortedException expected) {
                    // expected
                }
                synchronized (success) {
                    success[0] = Boolean.TRUE;
                }
            }
        });
        Thread.sleep(2000);
        f.cancel(true);
        while (success[0] == null) {
            Thread.sleep(2000);
        }
        es.shutdownNow();
        assertTrue("PUT via future should have been aborted", success[0].booleanValue());
        debug("Upload via future done");
    }

    @Test
    public void testDownloadInterrupts() throws InterruptedException,
            IOException {
        // Put an object to S3
        final InputStream is = new ConstantInputStream(DATA_SIZE, (byte) 'Z');
        final ObjectMetadata omd = new ObjectMetadata();
        omd.setContentLength(DATA_SIZE);
        final PutObjectRequest req = new PutObjectRequest(TEST_BUCKET, "test",
                is, omd);
        s3.putObject(req);

        final File destfile = CryptoTestUtils.generateRandomAsciiFile(0);
        final Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final GetObjectRequest req = new GetObjectRequest(TEST_BUCKET,
                            "test");
                    s3.getObject(req, destfile);
                    fail("GET should have been aborted");
                } catch (final AbortedException expected) {
                }
            }
        });
        t.start();
        do {
            t.join(2000);
            if (t.isAlive()) {
                t.interrupt();
                debug("download thread interrupted");
            } else {
                debug("download thread joined");
            }
        } while (t.isAlive());
        debug("Download done");
    }

    @Test
    public void testDownloadInterruptsViaFuture() throws InterruptedException,
            IOException {
        // Put an object to S3
        final InputStream is = new ConstantInputStream(DATA_SIZE, (byte) 'Z');
        final ObjectMetadata omd = new ObjectMetadata();
        omd.setContentLength(DATA_SIZE);
        final PutObjectRequest req = new PutObjectRequest(TEST_BUCKET, "test",
                is, omd);
        s3.putObject(req);
        final File destfile = CryptoTestUtils.generateRandomAsciiFile(0);
        final ExecutorService es = Executors.newSingleThreadExecutor();
        final Boolean[] success = {
            null
        };
        final Future<?> f = es.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    final GetObjectRequest req = new GetObjectRequest(TEST_BUCKET,
                            "test");
                    s3.getObject(req, destfile);
                    synchronized (success) {
                        success[0] = Boolean.FALSE;
                    }
                    return;
                } catch (final AbortedException expected) {
                }
                synchronized (success) {
                    success[0] = Boolean.TRUE;
                }
            }
        });
        Thread.sleep(2000);
        f.cancel(true);
        while (success[0] == null) {
            Thread.sleep(2000);
        }
        es.shutdownNow();
        assertTrue("GET should have been aborted", success[0].booleanValue());
        debug("Download via future done");
    }

    private void debug(Object o) {
        if (DEBUG) {
            System.err.println(String.valueOf(o));
        }
    }
}
