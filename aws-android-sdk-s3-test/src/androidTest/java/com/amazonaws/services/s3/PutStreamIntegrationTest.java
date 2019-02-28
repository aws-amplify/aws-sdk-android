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

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.testutils.util.RandomInputStream;
import com.amazonaws.testutils.util.UnreliableRandomInputStream;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

/**
 * Integration tests for uploading objects to Amazon S3 through caller provided
 * InputStreams.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class PutStreamIntegrationTest extends S3IntegrationTestBase {

    private final String bucketName = "put-stream-object-integ-test-" + new Date().getTime();
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
     * Tests uploading an object from a stream, without a pre-computed MD5
     * digest for its content and without a content type set. The client will
     * calculate the MD5 digest on the fly, verify it with the ETag header in
     * the response from Amazon S3, and set the content type to the default,
     * application/octet-stream.
     */
    @Test
    public void testNoContentMd5Specified() {
        s3.createBucket(bucketName);

        final long contentLength = 10L * 1024L * 1024L;
        final InputStream input = new RandomInputStream(contentLength);
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(contentLength);
        s3.putObject(bucketName, key, input, metadata);

        metadata = s3.getObjectMetadata(bucketName, key);
        assertEquals(contentLength, metadata.getContentLength());
        assertEquals(Mimetypes.MIMETYPE_OCTET_STREAM, metadata.getContentType());
    }

    /**
     * Tests that when an InputStream uploading data to S3 encounters an
     * IOException, the client can correctly retry the request without the
     * caller's intervention, providing the error was encountered before the
     * client's retryable stream buffer was completely filled.
     */
    @Test
    @Ignore("RandomInputStream is not setup as per AmazonHttpClient")
    public void testRequestRetry() {
        s3.createBucket(bucketName);

        final long contentLength = Constants.DEFAULT_STREAM_BUFFER_SIZE;
        final UnreliableRandomInputStream unreliableInputStream =
                new UnreliableRandomInputStream(contentLength);

        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(contentLength);
        s3.putObject(bucketName, key, unreliableInputStream, metadata);

        final ObjectMetadata returnedMetadata = s3.getObjectMetadata(bucketName, key);
        assertEquals(contentLength, returnedMetadata.getContentLength());
    }

}
