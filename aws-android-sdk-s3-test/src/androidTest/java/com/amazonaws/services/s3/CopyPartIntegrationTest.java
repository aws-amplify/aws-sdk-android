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

import androidx.test.core.app.ApplicationProvider;

import static com.amazonaws.services.s3.internal.Constants.GB;
import static com.amazonaws.services.s3.internal.Constants.MB;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.testutils.util.RandomTempFile;

import org.junit.After;
import org.junit.Test;

import java.io.File;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

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

    /** Milliseconds to wait before timing out on large file upload */
    private static final long UPLOAD_TIMEOUT_MS = 200L;

    /** The file of random data uploaded to S3 */
    private File file;

    /** The ETag of the source object created by these tests */
    private String sourceEtag;

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

    /** Releases resources used by tests */
    @After
    public void tearDown() {
        try {
            s3.deleteObject(BUCKET_NAME, SOURCE_KEY);
        } catch (Exception e) {
        }
        try {
            s3.deleteObject(BUCKET_NAME, DESTINATION_KEY);
        } catch (Exception e) {
        }
        try {
            s3.deleteBucket(BUCKET_NAME);
        } catch (Exception e) {
        }
        try {
            file.delete();
        } catch (Exception e) {
        }
        if (multipartUploadId != null) {
            try {
                s3.abortMultipartUpload(new AbortMultipartUploadRequest(BUCKET_NAME, DESTINATION_KEY,
                        multipartUploadId));
            } catch (Exception e) {
            }
        }
    }

    /**
     * Test that the copyPart operation correctly copies an object and honors
     * all specified options. Runs as a single JUnit test case to avoid having
     * to create/delete buckets and objects for every individual test. Might be
     * nice one day to use a more advanced test framework like TestNG.
     */
    @Test
    public void testcopyPart() throws Exception {
        if (!CryptoTestUtils.runTimeConsumingTests()) {
            System.out
                    .println("Please set the environment variable, export RUN_TIME_CONSUMING_TESTS=true, to run the testcopyPart test");
            return;
        }
        initializeTestData();

        gotestSuccessfulSimpleCopy();
        gottestRangedCopy();
        gotestMatchingEtagConstraint();
        gotestNonmatchingEtagConstraint();

        gotestModifiedSinceConstraint();
        gotestUnmodifiedSinceConstraint();

        /*
         * TODO: It'd be nice to test the case where the returned HTTP status
         * code is 200, but the response content is an XML error response.
         * Unfortunately it's difficult to trigger that case, since it only
         * happens when S3 has an error copying the object.
         */
        gotestNoSuchKeyException();
    }


    /**
     * Tests copying a range of data. The minimum size is 5GB, which is too big
     */
    private void gottestRangedCopy() throws Exception {
        if (!s3.doesBucketExist(LARGE_BUCKET_NAME)) {
            s3.createBucket(LARGE_BUCKET_NAME);
            waitForBucketCreation(LARGE_BUCKET_NAME);
        }

        if (!doesObjectExist(LARGE_BUCKET_NAME, LARGE_FILE_KEY)) {
            File largeFile = new RandomTempFile("file1", 6 * GB);
            assertTrue(uploadAndWait(LARGE_BUCKET_NAME, LARGE_FILE_KEY, largeFile));
        }

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
    private void gotestSuccessfulSimpleCopy() throws Exception {
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
    private void gotestMatchingEtagConstraint() throws Exception {
        s3.copyPart(newCopyPartRequest()
                .withMatchingETagConstraint(sourceEtag));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withMatchingETagConstraint("nonmatching-etag")));
    }

    /**
     * Tests that the non-matching ETag constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    private void gotestNonmatchingEtagConstraint() throws Exception {
        s3.copyPart(newCopyPartRequest()
                .withNonmatchingETagConstraint("nonmatching-etag"));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withNonmatchingETagConstraint(sourceEtag)));
    }

    /**
     * Tests that the modified since constraint parameter is correctly included
     * in requests when the user specifies it.
     */
    private void gotestModifiedSinceConstraint() throws Exception {
        s3.copyPart(newCopyPartRequest()
                .withModifiedSinceConstraint(earlierDate));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withModifiedSinceConstraint(laterDate)));
    }

    /**
     * Tests that the unmodified since constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    private void gotestUnmodifiedSinceConstraint() throws Exception {
        s3.copyPart(newCopyPartRequest()
                .withUnmodifiedSinceConstraint(laterDate));

        assertNull(s3.copyPart(newCopyPartRequest()
                .withUnmodifiedSinceConstraint(earlierDate)));
    }

    /**
     * Tests that error response are properly handled and unmarshalled as
     * AmazonS3Exception objects.
     */
    private void gotestNoSuchKeyException() {
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

    /*
     * Private Test Helper Methods
     */

    /**
     * Creates/populates all the test data needed for these tests (bucket,
     * source object, file, source object ETag, etc).
     */
    private void initializeTestData() throws Exception {
        s3.createBucket(BUCKET_NAME);
        waitForBucketCreation(BUCKET_NAME);
        file = super.getRandomTempFile("copy-part-integ-test-" + new Date().getTime(),
                CONTENT_LENGTH);
        s3.putObject(BUCKET_NAME, SOURCE_KEY, file);

        ObjectMetadata sourceObjectMetadata = s3.getObjectMetadata(BUCKET_NAME, SOURCE_KEY);
        sourceEtag = sourceObjectMetadata.getETag();
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

    private boolean uploadAndWait(String bucket, String key, File file) {
        TransferUtility tu = TransferUtility.builder()
                .context(ApplicationProvider.getApplicationContext())
                .s3Client(s3)
                .build();
        final CountDownLatch uploaded = new CountDownLatch(1);
        final AtomicBoolean success = new AtomicBoolean(true);
        tu.upload(bucket, key, file, new TransferListener() {
            @Override
            public void onStateChanged(int id, TransferState state) {
                if (TransferState.COMPLETED.equals(state)) {
                    uploaded.countDown();
                }
            }

            @Override
            public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {}

            @Override
            public void onError(int id, Exception ex) {
                success.set(false);
                uploaded.countDown();
            }
        });
        try {
            return uploaded.await(UPLOAD_TIMEOUT_MS, TimeUnit.MILLISECONDS)
                    && success.get();
        } catch (InterruptedException interrupted) {
            return false;
        }
    }
}
