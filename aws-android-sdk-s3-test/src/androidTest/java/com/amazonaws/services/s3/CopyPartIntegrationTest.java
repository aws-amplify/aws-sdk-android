/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.internal.Constants.MB;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * Integration tests for the copyPart operation.
 */
public class CopyPartIntegrationTest extends S3IntegrationTestBase {

    /** The S3 bucket created and used by these tests */
    private static final String BUCKET_NAME = "copy-part-integ-test-" + new Date().getTime();

    /** The key of the object being copied */
    private static final String SOURCE_KEY = "source-key";

    /** The key of the copied object */
    private static final String DESTINATION_KEY = "destination-key";

    /** Length of the data uploaded to S3 */
    private static final long CONTENT_LENGTH = 345L;

    /** The file of random data uploaded to S3 */
    private File file;

    /** The ETag of the source object created by these tests */
    private String sourceETag;

    /**
     * A date before the last modified time of the source object used by these
     * tests
     */
    private Date earlierDate;

    /**
     * A date after the last modified time of the source object used by these
     * tests
     */
    private Date laterDate;

    /**
     * The id of our multipart upload
     */
    private String multipartUploadId;

    /**
     * The key to our very large (>5GB) object
     */
    private static final String LARGE_FILE_KEY = CopyPartIntegrationTest.class.getName()
            + ".largeFile";

    private static final String LARGE_BUCKET_NAME = "copy-part-integ-test-large-"
            + new Date().getTime();

    /**
     * Creates/populates all the test data needed for these tests (bucket,
     * source object, file, source object ETag, etc).
     */
    @Before
    public void initializeTestData() throws Exception {
        s3.createBucket(BUCKET_NAME);
        waitForBucketCreation(BUCKET_NAME);
        file = getRandomSparseFile("copy-part-integ-test-" + new Date().getTime(), CONTENT_LENGTH);
        s3.putObject(BUCKET_NAME, SOURCE_KEY, file);

        ObjectMetadata sourceObjectMetadata = s3.getObjectMetadata(BUCKET_NAME, SOURCE_KEY);
        sourceETag = sourceObjectMetadata.getETag();
        Date sourceLastModifiedDate = sourceObjectMetadata.getLastModified();

        /*
         * TODO: This was causing problems when the date was in the future... It
         * was essentially being ignored by S3. We should include a note about
         * that in the docs
         */
        Thread.sleep(2000);
        earlierDate = new Date(sourceLastModifiedDate.getTime() - 1000);
        laterDate = new Date(sourceLastModifiedDate.getTime() + 1000);

        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(
                BUCKET_NAME,
                DESTINATION_KEY);
        initiateMultipartUploadRequest.setObjectMetadata(new ObjectMetadata());
        initiateMultipartUploadRequest.getObjectMetadata().setSSEAlgorithm(
                ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION);
        multipartUploadId = s3.initiateMultipartUpload(
                initiateMultipartUploadRequest)
                .getUploadId();
    }

    /** Releases resources used by tests */
    @After
    public void tearDown() {
        if (multipartUploadId != null) {
            s3.abortMultipartUpload(new AbortMultipartUploadRequest(
                BUCKET_NAME,
                DESTINATION_KEY,
                multipartUploadId
            ));
        }
        try {
            s3.deleteObject(BUCKET_NAME, SOURCE_KEY);
            s3.deleteObject(BUCKET_NAME, DESTINATION_KEY);
            s3.deleteBucket(BUCKET_NAME);
        } catch (AmazonS3Exception exception) {
            if (!"NoSuchBucket".equals(exception.getErrorCode())) {
                throw exception;
            }
        }
        file.delete();
    }

    /**
     * Tests copying a range of data. The minimum size is 5GB, which is too big
     */
    @Test
    @Ignore("Current test architecture doesn't allow large file upload.")
    public void testRangedCopy() throws Exception {
        if (!s3.doesBucketExist(LARGE_BUCKET_NAME)) {
            s3.createBucket(LARGE_BUCKET_NAME);
            waitForBucketCreation(LARGE_BUCKET_NAME);
        }

        //TODO: Upload large file (at least 5 GB) to LARGE_BUCKET_NAME as LARGE_FILE_KEY

        long firstByte = 0L;
        long lastByte = firstByte + (5 * MB);
        CopyPartRequest rq = newCopyPartRequest().withSourceKey(LARGE_FILE_KEY)
                .withSourceBucketName(LARGE_BUCKET_NAME)
                .withFirstByte(firstByte).withLastByte(lastByte);
        CopyPartResult copyPart = s3.copyPart(rq);
        assertCopyPartResultIsValid(copyPart);

        PartListing listParts = s3.listParts(new ListPartsRequest(BUCKET_NAME, DESTINATION_KEY,
                multipartUploadId));
        assertEquals(1, listParts.getParts().size());
        PartSummary partSummary = listParts.getParts().get(0);
        assertEquals(copyPart.getETag(), partSummary.getETag());
        assertEquals(lastByte - firstByte + 1, partSummary.getSize());
    }

    /**
     * Tests that the simple form of the copy object operation correctly copies
     * an object.
     */
    @Test
    public void testSuccessfulSimpleCopy() throws Exception {
        waitForBucketCreation(BUCKET_NAME);
        CopyPartRequest rq = newCopyPartRequest();
        CopyPartResult copyPart = s3.copyPart(rq);
        assertCopyPartResultIsValid(copyPart);

        PartListing listParts = s3.listParts(new ListPartsRequest(BUCKET_NAME, DESTINATION_KEY,
                multipartUploadId));
        assertEquals(1, listParts.getParts().size());
        PartSummary partSummary = listParts.getParts().get(0);
        assertEquals(copyPart.getETag(), partSummary.getETag());
        assertEquals(CONTENT_LENGTH, partSummary.getSize());
    }

    /**
     * Tests that the matching ETag constraint parameter is correctly included
     * in requests when the user specifies it.
     */
    @Test
    public void testMatchingETagConstraint() throws Exception {
        s3.copyPart(newCopyPartRequest()
                .withMatchingETagConstraint(sourceETag));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withMatchingETagConstraint("nonmatching-etag")));
    }

    /**
     * Tests that the non-matching ETag constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    @Test
    public void testNonMatchingETagConstraint() {
        s3.copyPart(newCopyPartRequest()
                .withNonmatchingETagConstraint("nonmatching-etag"));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withNonmatchingETagConstraint(sourceETag)));
    }

    /**
     * Tests that the modified since constraint parameter is correctly included
     * in requests when the user specifies it.
     */
    @Test
    public void testModifiedSinceConstraint() {
        s3.copyPart(newCopyPartRequest()
                .withModifiedSinceConstraint(earlierDate));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withModifiedSinceConstraint(laterDate)));
    }

    /**
     * Tests that the unmodified since constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    @Test
    public void testUnmodifiedSinceConstraint() {
        s3.copyPart(newCopyPartRequest()
                .withUnmodifiedSinceConstraint(laterDate));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withUnmodifiedSinceConstraint(earlierDate)));
    }

    /**
     * Tests that error response are properly handled and unmarshalled as
     * AmazonS3Exception objects.
     */
    @Test
    public void testNoSuchKeyException() {
        try {
            s3.copyPart(newCopyPartRequest().withSourceKey("key"));
            fail("Expected an AmazonS3Exception, but wasn't thrown");
        } catch (AmazonS3Exception ase) {
            assertEquals("NoSuchKey", ase.getErrorCode());
            assertEquals(ErrorType.Client, ase.getErrorType());
            assertTrue(ase.getExtendedRequestId().length() > 5);
            assertTrue(ase.getMessage().length() > 5);
            assertTrue(ase.getRequestId().length() > 5);
            assertEquals("Amazon S3", ase.getServiceName());
            assertEquals(404, ase.getStatusCode());
        }
    }

    /**
     * Returns a new copyPartRequest, initialized for these test cases.
     *
     * @return A new copyPartRequest, initialized for these test cases.
     */
    private CopyPartRequest newCopyPartRequest() {
        return new CopyPartRequest().withDestinationBucketName(BUCKET_NAME).withSourceKey(SOURCE_KEY)
                .withSourceBucketName(BUCKET_NAME).withDestinationKey(DESTINATION_KEY)
                .withUploadId(multipartUploadId)
                .withPartNumber(1);
    }

    /**
     * Asserts that the specified copyPartResult is valid by checking that the
     * ETag value is present (wihtout the surrounding quotes) and that the last
     * modified date is reasonably recent.
     *
     * @param result The copyPartResult object to check.
     */
    private void assertCopyPartResultIsValid(CopyPartResult result) {
        assertTrue(result.getETag().length() > 5);
        assertFalse(result.getETag().startsWith("\""));
        assertFalse(result.getETag().endsWith("\""));
        assertNotNull(result.getLastModifiedDate());
        assertEquals(ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION, result.getSSEAlgorithm());
        assertNull(result.getVersionId());

        long timeDifference = new Date().getTime() -
                result.getLastModifiedDate().getTime();
        assertTrue(timeDifference < 1000 * 60 * 60 * 24);
    }
}
