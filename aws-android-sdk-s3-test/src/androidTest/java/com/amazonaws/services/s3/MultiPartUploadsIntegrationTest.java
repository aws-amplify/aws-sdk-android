/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListMultipartUploadsRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.StorageClass;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.testutils.util.RandomInputStream;
import com.amazonaws.util.StringInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** Integration tests for the low level Multipart operations. */
public class MultiPartUploadsIntegrationTest extends S3IntegrationTestBase {

    private static final long CONTENT_LENGTH = 10 * Constants.MB;
    private static final String BUCKET_NAME = "android-sdk-mp-upload-" + System.currentTimeMillis();
    private static final String REDIRECT_LOCATION = "/redirecting...";
    private static final String KEY = "key";
    private String uploadId;

    @BeforeClass
    public static void setUpBucket() throws Exception {
        s3.createBucket(BUCKET_NAME);
        waitForBucketCreation(BUCKET_NAME);
        enableVersioning(BUCKET_NAME);
    }

    /** Releases all resources created in these tests */
    @AfterClass
    public static void tearDown() {
        disableVersioning(BUCKET_NAME);
        try {
            deleteBucketAndAllVersionedContents(BUCKET_NAME);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /** Tests that a multipart upload can be created, listed and aborted. */
    @Test
    public void testAborted() throws Exception {
        uploadId = initiateMultipartRequest(BUCKET_NAME, KEY);
        uploadParts(BUCKET_NAME, uploadId);

        listMultipartUploads(BUCKET_NAME);
        listMultipartUploads(BUCKET_NAME, uploadId);
        listParts(BUCKET_NAME, uploadId);

        abortMultipartUpload(BUCKET_NAME, uploadId);
    }

    /** Tests that a multipart upload can be created, listed and completed. */
    @Test
    public void testCompleted() throws Exception {
        final AccessControlList acl = new AccessControlList();
        for (final Permission permission : Permission.values()) {
            acl.grantPermission(new CanonicalGrantee(AWS_DR_ECLIPSE_ACCT_ID), permission);
            acl.grantPermission(GroupGrantee.AuthenticatedUsers, permission);
            acl.grantPermission(new EmailAddressGrantee(AWS_DR_TOOLS_EMAIL_ADDRESS), permission);
        }

        final InitiateMultipartUploadResult initiateResult = s3
                .initiateMultipartUpload(new InitiateMultipartUploadRequest(
                        BUCKET_NAME, KEY).withAccessControlList(acl)
                        .withStorageClass(StorageClass.ReducedRedundancy)
                        .withRedirectLocation(REDIRECT_LOCATION));

        assertEquals(BUCKET_NAME, initiateResult.getBucketName());
        assertEquals(KEY, initiateResult.getKey());
        assertNotEmpty(initiateResult.getUploadId());

        uploadId = initiateResult.getUploadId();

        final List<PartETag> partETags = uploadParts(BUCKET_NAME, uploadId);

        // Initiate two more uploads so we can test prefix/delimiter
        initiateMultipartRequest(BUCKET_NAME, "key/foo/bar");
        initiateMultipartRequest(BUCKET_NAME, "key/bar/baz");

        listMultipartUploads(BUCKET_NAME);
        listMultipartUploads(BUCKET_NAME, uploadId);
        listMultipartUploads(BUCKET_NAME, "key/", "/");
        listParts(BUCKET_NAME, uploadId);

        final CompleteMultipartUploadResult completeMultipartUploadResult = s3.completeMultipartUpload(
                new CompleteMultipartUploadRequest(BUCKET_NAME, KEY, uploadId, partETags));
        assertNotEmpty(completeMultipartUploadResult.getBucketName());
        assertNotEmpty(completeMultipartUploadResult.getKey());
        assertNotEmpty(completeMultipartUploadResult.getETag());
        assertNotEmpty(completeMultipartUploadResult.getLocation());
        assertNotEmpty(completeMultipartUploadResult.getVersionId());

        final AccessControlList aclRead = s3.getObjectAcl(BUCKET_NAME, KEY);
        assertEquals(15, aclRead.getGrants().size());

        final Set<Grant> expectedGrants = translateEmailAclsIntoCanonical(acl);

        for (final Grant expected : expectedGrants) {
            assertTrue("Didn't find expectd grant " + expected,
                    aclRead.getGrants().contains(expected));
        }

        // Check we can get the redirect location back.
        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertEquals(REDIRECT_LOCATION, object.getRedirectLocation());
        assertEquals(BUCKET_NAME, object.getBucketName());
        assertEquals(KEY, object.getKey());
    }

    /** Tests server-side encryption */
    @Test
    public void testServerSideEncryption() throws Exception {
        final InitiateMultipartUploadRequest initiateRequest = new InitiateMultipartUploadRequest(
                BUCKET_NAME, KEY)
                .withCannedACL(CannedAccessControlList.PublicRead)
                .withStorageClass(
                        StorageClass.ReducedRedundancy);
        initiateRequest.setObjectMetadata(new ObjectMetadata());
        initiateRequest.getObjectMetadata().setSSEAlgorithm(
                ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION);
        final InitiateMultipartUploadResult initiateResult = s3.initiateMultipartUpload(initiateRequest);

        assertEquals(BUCKET_NAME, initiateResult.getBucketName());
        assertEquals(KEY, initiateResult.getKey());
        assertNotEmpty(initiateResult.getUploadId());

        uploadId = initiateResult.getUploadId();
        assertEquals("AES256", initiateResult.getSSEAlgorithm());
        final List<PartETag> partETags1 = new ArrayList<PartETag>();

        UploadPartResult uploadPartResult = s3.uploadPart(new UploadPartRequest()
                .withBucketName(BUCKET_NAME)
                .withInputStream(new RandomInputStream(CONTENT_LENGTH))
                .withKey(KEY)
                .withPartNumber(1)
                .withPartSize(CONTENT_LENGTH)
                .withUploadId(uploadId));
        assertEquals(1, uploadPartResult.getPartNumber());
        assertNotEmpty(uploadPartResult.getETag());
        assertEquals("AES256", uploadPartResult.getSSEAlgorithm());
        partETags1.add(new PartETag(uploadPartResult.getPartNumber(), uploadPartResult.getETag()));

        uploadPartResult = s3.uploadPart(new UploadPartRequest()
                .withBucketName(BUCKET_NAME)
                .withInputStream(new RandomInputStream(CONTENT_LENGTH))
                .withKey(KEY)
                .withPartNumber(2)
                .withPartSize(CONTENT_LENGTH)
                .withUploadId(uploadId));
        assertEquals(2, uploadPartResult.getPartNumber());
        assertNotEmpty(uploadPartResult.getETag());
        assertEquals("AES256", uploadPartResult.getSSEAlgorithm());
        partETags1.add(new PartETag(uploadPartResult.getPartNumber(), uploadPartResult.getETag()));

        final List<PartETag> partETags = partETags1;

        listMultipartUploads(BUCKET_NAME, uploadId);

        final CompleteMultipartUploadResult completeMultipartUploadResult = s3.completeMultipartUpload(
                new CompleteMultipartUploadRequest(BUCKET_NAME, KEY, uploadId, partETags));

        assertNotEmpty(completeMultipartUploadResult.getBucketName());
        assertNotEmpty(completeMultipartUploadResult.getKey());
        assertNotEmpty(completeMultipartUploadResult.getETag());
        assertNotEmpty(completeMultipartUploadResult.getLocation());
        assertNotEmpty(completeMultipartUploadResult.getVersionId());
        assertEquals("AES256", completeMultipartUploadResult.getSSEAlgorithm());
    }

    /** Test error handling during CompleteMultipartUpload. */
    @Test
    public void testCompletionFailed() throws Exception {
        uploadId = initiateMultipartRequest(BUCKET_NAME, KEY);
        final List<PartETag> partETags = uploadParts(BUCKET_NAME, uploadId);

        listMultipartUploads(BUCKET_NAME);
        listMultipartUploads(BUCKET_NAME, uploadId);
        listParts(BUCKET_NAME, uploadId);

        try {
            // fudge up an ETag to trigger an error response
            (partETags.get(1)).setETag((partETags.get(0)).getETag());
            s3.completeMultipartUpload(new CompleteMultipartUploadRequest(
                    BUCKET_NAME, KEY, uploadId, partETags));
            fail("Expected an AmazonS3Exception");
        } catch (final AmazonS3Exception ase) {
            assertNotEmpty(ase.getErrorCode());
            assertNotEmpty(ase.getRequestId());
            assertNotEmpty(ase.getExtendedRequestId());
            assertNotEmpty(ase.getMessage());
        }
    }

    /** Tests error handling during UploadPart. */
    @Test
    public void testUploadError() throws Exception {
        uploadId = initiateMultipartRequest(BUCKET_NAME, KEY);
        uploadParts(BUCKET_NAME, uploadId);

        final String testBody = "testBody";

        try {
            s3.uploadPart(new UploadPartRequest()
                    .withBucketName(BUCKET_NAME)
                    .withInputStream(new StringInputStream(testBody))
                    .withKey(KEY)
                    .withPartNumber(1)
                    .withPartSize(testBody.getBytes().length)
                    .withMD5Digest("thisisn'tarealmd5")
                    .withUploadId(uploadId));
            fail("Expected an AmazonServiceException");
        } catch (final AmazonS3Exception ase) {
            assertNotEmpty(ase.getErrorCode());
            assertNotEmpty(ase.getRequestId());
            assertNotEmpty(ase.getExtendedRequestId());
            assertNotEmpty(ase.getMessage());
        }
    }

    /*
     * Private Helper Methods
     */

    private static void enableVersioning(String bucketName) {
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                bucketName,
                new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
    }

    private static void disableVersioning(String bucketName) {
        s3.setBucketVersioningConfiguration(new SetBucketVersioningConfigurationRequest(
                bucketName, new BucketVersioningConfiguration(
                        BucketVersioningConfiguration.SUSPENDED)));
    }

    private void listParts(String bucketName, String uploadId) {
        final PartListing listPartsResult = s3
                .listParts(new ListPartsRequest(bucketName, KEY, uploadId)
                        .withMaxParts(100)
                        .withPartNumberMarker(new Integer(0))
                        .withEncodingType("url"));
        assertEquals(bucketName, listPartsResult.getBucketName());
        assertEquals(KEY, listPartsResult.getKey());
        assertEquals(100, listPartsResult.getMaxParts().intValue());
        assertEquals(0, listPartsResult.getPartNumberMarker().intValue());
        assertNotNull(listPartsResult.getNextPartNumberMarker());
        assertEquals(0, listPartsResult.getPartNumberMarker().intValue());
        assertEquals(StorageClass.ReducedRedundancy.toString(), listPartsResult.getStorageClass());
        assertEquals(uploadId, listPartsResult.getUploadId());
        assertTrue(listPartsResult.getParts().size() > 0);
        final PartSummary part = listPartsResult.getParts().get(0);
        assertNotEmpty(part.getETag());
        assertNotNull(part.getLastModified());
        assertTrue(part.getPartNumber() > 0);
        assertEquals(CONTENT_LENGTH, part.getSize());

        assertNotNull(listPartsResult.getOwner());
        assertNotEmpty(listPartsResult.getOwner().getDisplayName());
        assertNotEmpty(listPartsResult.getOwner().getId());

        assertNotNull(listPartsResult.getInitiator());
        assertNotEmpty(listPartsResult.getInitiator().getDisplayName());
        assertNotEmpty(listPartsResult.getInitiator().getId());
        assertEquals("url", listPartsResult.getEncodingType());
    }

    private void listMultipartUploads(String bucketName, String prefix, String delimiter) {
        final MultipartUploadListing listMultipartUploadsResult = s3.listMultipartUploads(
                new ListMultipartUploadsRequest(bucketName)
                        .withPrefix(prefix)
                        .withDelimiter(delimiter)
                        .withMaxUploads(100));
        assertEquals(bucketName, listMultipartUploadsResult.getBucketName());
        assertEquals(null, listMultipartUploadsResult.getKeyMarker());
        assertEquals(100, listMultipartUploadsResult.getMaxUploads());
        assertEquals(prefix, listMultipartUploadsResult.getPrefix());
        assertEquals(delimiter, listMultipartUploadsResult.getDelimiter());
        assertNull(listMultipartUploadsResult.getEncodingType());

        // assert that we have the two common prefixes we expect
        final List<String> commonPrefixes = listMultipartUploadsResult.getCommonPrefixes();
        assertEquals(2, commonPrefixes.size());
        for (final String commonPrefix : commonPrefixes) {
            assertNotEmpty(commonPrefix);
        }
    }

    private void listMultipartUploads(String bucketName, String uploadId) {
        // Test all the request parameters for ListMultipartUploads
        final MultipartUploadListing listMultipartUploadsResult = s3.listMultipartUploads(
                new ListMultipartUploadsRequest(bucketName)
                        .withKeyMarker(KEY)
                        .withMaxUploads(100)
                        .withUploadIdMarker(uploadId));
        assertEquals(bucketName, listMultipartUploadsResult.getBucketName());
        assertEquals(KEY, listMultipartUploadsResult.getKeyMarker());
        assertEquals(100, listMultipartUploadsResult.getMaxUploads());
        assertEquals(uploadId, listMultipartUploadsResult.getUploadIdMarker());
        assertNull(listMultipartUploadsResult.getEncodingType());
    }

    private void listMultipartUploads(String bucketName) {
        // Now test some multipart upload data
        final MultipartUploadListing listMultipartUploadsResult = s3.listMultipartUploads(
                new ListMultipartUploadsRequest(bucketName)
                        .withEncodingType("url"));
        assertEquals(bucketName, listMultipartUploadsResult.getBucketName());
        assertNotNull(listMultipartUploadsResult.getNextKeyMarker());
        assertNotNull(listMultipartUploadsResult.getNextUploadIdMarker());
        assertTrue(listMultipartUploadsResult.getMultipartUploads().size() > 0);
        final MultipartUpload multiPartUpload = listMultipartUploadsResult.getMultipartUploads().get(0);
        assertNotNull(multiPartUpload.getInitiated());
        assertNotEmpty(multiPartUpload.getKey());
        assertNotEmpty(multiPartUpload.getStorageClass());
        assertNotEmpty(multiPartUpload.getUploadId());

        assertNotNull(multiPartUpload.getOwner());
        assertNotEmpty(multiPartUpload.getOwner().getDisplayName());
        assertNotEmpty(multiPartUpload.getOwner().getId());

        assertNotNull(multiPartUpload.getInitiator());
        assertNotEmpty(multiPartUpload.getInitiator().getDisplayName());
        assertNotEmpty(multiPartUpload.getInitiator().getId());

        // EncodingType parameter should be returned in the response
        assertEquals("url", listMultipartUploadsResult.getEncodingType());
    }

    private String initiateMultipartRequest(String bucketName, String key) {
        final InitiateMultipartUploadResult initiateResult = s3.initiateMultipartUpload(
                new InitiateMultipartUploadRequest(bucketName, key)
                        .withCannedACL(CannedAccessControlList.PublicRead)
                        .withStorageClass(StorageClass.ReducedRedundancy));

        assertEquals(bucketName, initiateResult.getBucketName());
        assertEquals(key, initiateResult.getKey());
        assertNotEmpty(initiateResult.getUploadId());

        return initiateResult.getUploadId();
    }

    private List<PartETag> uploadParts(String bucketName, String uploadId)
            throws AmazonServiceException, AmazonClientException, InterruptedException {
        final List<PartETag> partETags = new ArrayList<PartETag>();

        UploadPartResult uploadPartResult = s3.uploadPart(new UploadPartRequest()
                .withBucketName(bucketName)
                .withInputStream(new RandomInputStream(CONTENT_LENGTH))
                .withKey(KEY)
                .withPartNumber(1)
                .withPartSize(CONTENT_LENGTH)
                .withUploadId(uploadId));
        assertEquals(1, uploadPartResult.getPartNumber());
        assertNotEmpty(uploadPartResult.getETag());
        partETags.add(new PartETag(uploadPartResult.getPartNumber(), uploadPartResult.getETag()));

        uploadPartResult = s3.uploadPart(new UploadPartRequest()
                .withBucketName(bucketName)
                .withInputStream(new RandomInputStream(CONTENT_LENGTH))
                .withKey(KEY)
                .withPartNumber(2)
                .withPartSize(CONTENT_LENGTH)
                .withUploadId(uploadId));
        assertEquals(2, uploadPartResult.getPartNumber());
        assertNotEmpty(uploadPartResult.getETag());
        partETags.add(new PartETag(uploadPartResult.getPartNumber(), uploadPartResult.getETag()));

        return partETags;
    }

    private void abortMultipartUpload(String bucketName, String uploadId) {
        s3.abortMultipartUpload(new AbortMultipartUploadRequest(bucketName, KEY, uploadId));
    }

}
