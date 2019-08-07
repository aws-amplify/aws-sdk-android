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

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.testutils.util.ConstantInputStream;

import org.apache.commons.io.IOUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@Ignore("aws test credentials is not setup for Android")
public class S3SkipByteDigestIntegrationTest {
    private static final boolean DEBUG = false;
    private static final Random rand = new Random();
    private static final int DATA_SIZE = 1 * 1024 * 1024 + rand.nextInt(16);
    private static boolean cleanup = true;
    private static final String TEST_BUCKET = tempBucketName(S3SkipByteDigestIntegrationTest.class);
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

    // https://github.com/aws/aws-sdk-java/issues/232
    @Test
    public void testDigestWithSkippedBytes() throws IOException {
        if (DEBUG) {
            debug("DATA_SIZE=" + DATA_SIZE);
        }
        final InputStream is = new ConstantInputStream(DATA_SIZE, (byte) 'Z');
        final ObjectMetadata meta = new ObjectMetadata();
        meta.setContentLength(DATA_SIZE);
        s3.putObject(TEST_BUCKET, "key", is, meta);
        { // skip some random number of bytes
            final S3Object object = s3.getObject(TEST_BUCKET, "key");
            final InputStream content = object.getObjectContent();
            final int n = rand.nextInt(DATA_SIZE);
            if (DEBUG) {
                debug("n=" + n);
            }
            content.skip(n);
            IOUtils.toByteArray(content);
            content.close();
        }
        { // skip 0 bytes;
            final S3Object object = s3.getObject(TEST_BUCKET, "key");
            final InputStream content = object.getObjectContent();
            final int n = 0;
            if (DEBUG) {
                debug("n=" + n);
            }
            content.skip(n);
            IOUtils.toByteArray(content);
            content.close();
        }
        { // skip -1 bytes;
            final S3Object object = s3.getObject(TEST_BUCKET, "key");
            final InputStream content = object.getObjectContent();
            final int n = -1;
            if (DEBUG) {
                debug("n=" + n);
            }
            content.skip(n);
            IOUtils.toByteArray(content);
            content.close();
        }
        { // skip all bytes
            final S3Object object = s3.getObject(TEST_BUCKET, "key");
            final InputStream content = object.getObjectContent();
            final int n = DATA_SIZE;
            if (DEBUG) {
                debug("n=" + n);
            }
            content.skip(n);
            IOUtils.toByteArray(content);
            content.close();
        }
        { // skip more than all bytes
            final S3Object object = s3.getObject(TEST_BUCKET, "key");
            final InputStream content = object.getObjectContent();
            final int n = DATA_SIZE + 100;
            if (DEBUG) {
                debug("n=" + n);
            }
            content.skip(n);
            IOUtils.toByteArray(content);
            content.close();
        }
    }

    private void debug(Object o) {
        if (DEBUG) {
            System.err.println(String.valueOf(o));
        }
    }
}
