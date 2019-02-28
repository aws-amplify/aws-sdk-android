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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

/**
 * Integration tests for object too large which utilizes the "expect continue"
 * header.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
@Ignore("Expect continue is unreliable while running on the desktop")
public class ExpectContinueIntegrationTest extends S3IntegrationTestBase {

    private final String bucketName = "expect-continue-integ-test-" + new Date().getTime();
    private final String key = "key";

    /** Releases all resources created by this test */
    @After
    public void tearDown() {
        try {
            s3.deleteObject(bucketName, key);
        } catch (final Exception e) {
        }
        try {
            s3.deleteBucket(bucketName);
        } catch (final Exception e) {
        }
    }

    /**
     * Tests that users are prevented from uploading
     */
    @Test
    public void testObjectTooLarge() {
        s3.createBucket(bucketName);

        // Current S3 object limit is 5GB
        final long contentLength = 6 * 1024L * 1024L * 1024L;
        final InputStream input = new RandomInputStream(10);
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(contentLength);

        try {
            s3.putObject(bucketName, key, input, metadata);
            fail("Expected a service exception, but wasn't thrown");
        } catch (final AmazonServiceException ase) {
            assertEquals("EntityTooLarge", ase.getErrorCode());
        }
    }
}
