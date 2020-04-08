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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.Date;
import java.util.Set;

/**
 * Integration test for the copyObject operation.
 */
public class CopyObjectIntegrationTest extends S3IntegrationTestBase {

    /** The S3 bucket created and used by these tests */
    private final static String BUCKET_NAME = "android-sdk-copy-object-integ-test-"
            + System.currentTimeMillis();

    /** The key of the object being copied */
    private final static String SOURCE_KEY = "source-key";

    /** The key of the copied object */
    private final static String DESTINATION_KEY = "destination-key";

    /** Length of the data uploaded to S3 */
    private final static long CONTENT_LENGTH = 345L;

    /** The file of random data uploaded to S3 */
    private static File file;

    /** The ETag of the source object created by these tests */
    private static String sourceEtag;

    /**
     * A date before the last modified time of the source object used by these
     * tests
     */
    private static Date earlierDate;

    /**
     * A date after the last modified time of the source object used by these
     * tests
     */
    private static Date laterDate;

    /** The http expiration date used by these tests */
    private static Date expiresDate;

    /** The http expiration time (milliseconds) used by these tests */
    final static long EXPIRES_TIME_IN_MILLIS = 1000 * 60 * 60;

    /** Releases resources used by tests */
    @AfterClass
    public static void tearDown() {
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
    }

    @Test
    public void testApplyAcl() throws Exception {
        AccessControlList acl = new AccessControlList();

        for (Permission permission : Permission.values()) {
            acl.grantPermission(new CanonicalGrantee(AWS_DR_ECLIPSE_ACCT_ID), permission);
            acl.grantPermission(GroupGrantee.AuthenticatedUsers, permission);
            acl.grantPermission(new EmailAddressGrantee(AWS_DR_TOOLS_EMAIL_ADDRESS), permission);
        }

        assertCopyObjectResultIsValid(s3.copyObject(newCopyObjectRequest().withAccessControlList(
                acl)));

        S3Object copiedObject = s3.getObject(BUCKET_NAME, DESTINATION_KEY);
        assertFileEqualsStream(file, copiedObject.getObjectContent());

        AccessControlList aclRead = s3.getObjectAcl(BUCKET_NAME, DESTINATION_KEY);
        assertEquals(15, aclRead.getGrants().size());

        Set<Grant> expectedGrants = translateEmailAclsIntoCanonical(acl);

        for (Grant expected : expectedGrants) {
            assertTrue("Didn't find expectd grant " + expected,
                    aclRead.getGrants().contains(expected));
        }

    }

    /**
     * Tests that the simple form of the copy object operation correctly copies
     * an object.
     */
    @Test
    public void testSuccessfulSimpleCopy() throws Exception {
        s3.copyObject(BUCKET_NAME, SOURCE_KEY, BUCKET_NAME, DESTINATION_KEY);
        S3Object copiedObject = s3.getObject(BUCKET_NAME, DESTINATION_KEY);
        assertFileEqualsStream(file, copiedObject.getObjectContent());
        assertEquals(expiresDate.toString(), copiedObject.getObjectMetadata().getHttpExpiresDate()
                .toString());
    }

    /**
     * Tests setting the server-side encryption header
     */
    @Test
    public void testServerSideEncryption() throws Exception {
        CopyObjectRequest request = newCopyObjectRequest().withNewObjectMetadata(
                new ObjectMetadata());
        request.getNewObjectMetadata().setSSEAlgorithm("AES256");
        CopyObjectResult result = s3.copyObject(request);

        assertTrue(result.getETag().length() > 5);
        assertFalse(result.getETag().startsWith("\""));
        assertFalse(result.getETag().endsWith("\""));
        assertNotNull(result.getLastModifiedDate());
        assertNull(result.getVersionId());
        assertEquals("AES256", result.getSSEAlgorithm());

        long timeDifference = System.currentTimeMillis() -
                result.getLastModifiedDate().getTime();
        assertTrue(timeDifference < 1000 * 60 * 60 * 24);

        S3Object object = s3.getObject(BUCKET_NAME, DESTINATION_KEY);
        assertFileEqualsStream(file, object.getObjectContent());
        assertEquals("AES256", object.getObjectMetadata().getSSEAlgorithm());
    }

    /**
     * Tests that when a user specifies an ACL and new object metadata, that
     * they are correctly sent as part of the request to S3.
     */
    @Test
    public void testCustomMetadataAndACL() throws Exception {
        CopyObjectRequest request = newCopyObjectRequest();

        expiresDate = new Date(System.currentTimeMillis() + EXPIRES_TIME_IN_MILLIS * 2);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.addUserMetadata("foo", "bar");
        // Amazon S3 doesn't treat the Content-Length header as metadata,
        // so it if gets sent on the wire it screws up the request. We
        // include it here to make sure it isn't passed on to the wire.
        objectMetadata.setContentLength(42L);
        objectMetadata.setCacheControl("cache-control");
        objectMetadata.setContentDisposition("content-dispo");
        objectMetadata.setContentEncoding("encoding");
        objectMetadata.setContentType("foo-cont-type");
        objectMetadata.setHttpExpiresDate(expiresDate);
        request.setNewObjectMetadata(objectMetadata);
        request.setCannedAccessControlList(CannedAccessControlList.PublicRead);
        assertCopyObjectResultIsValid(s3.copyObject(request));

        S3Object object = s3.getObject(BUCKET_NAME, DESTINATION_KEY);
        assertFileEqualsStream(file, object.getObjectContent());
        assertEquals("bar", object.getObjectMetadata().getUserMetadata().get("foo"));
        assertEquals(CONTENT_LENGTH, object.getObjectMetadata().getContentLength());
        assertEquals("cache-control", object.getObjectMetadata().getCacheControl());
        assertEquals("content-dispo", object.getObjectMetadata().getContentDisposition());
        assertEquals("encoding", object.getObjectMetadata().getContentEncoding());
        assertEquals("foo-cont-type", object.getObjectMetadata().getContentType());
        Date httpExpiresDate = object.getObjectMetadata().getHttpExpiresDate();
        assertEquals(expiresDate.toString(), httpExpiresDate.toString());

        AccessControlList acl = s3.getObjectAcl(BUCKET_NAME, DESTINATION_KEY);
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));
    }

    /**
     * Tests that the matching ETag constraint parameter is correctly included
     * in requests when the user specifies it.
     */
    @Test
    public void testMatchingEtagConstraint() throws Exception {
        s3.copyObject(newCopyObjectRequest()
                .withMatchingETagConstraint(sourceEtag));

        assertNull(s3.copyObject(newCopyObjectRequest()
                .withMatchingETagConstraint("nonmatching-etag")));
    }

    /**
     * Tests that the non-matching ETag constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    @Test
    public void testNonmatchingEtagConstraint() throws Exception {
        s3.copyObject(newCopyObjectRequest()
                .withNonmatchingETagConstraint("nonmatching-etag"));

        assertNull(s3.copyObject(newCopyObjectRequest()
                .withNonmatchingETagConstraint(sourceEtag)));
    }

    /**
     * Tests that the modified since constraint parameter is correctly included
     * in requests when the user specifies it.
     */
    @Test
    public void testModifiedSinceConstraint() throws Exception {
        s3.copyObject(newCopyObjectRequest()
                .withModifiedSinceConstraint(earlierDate));

        assertNull(s3.copyObject(newCopyObjectRequest()
                .withModifiedSinceConstraint(laterDate)));
    }

    /**
     * Tests that the unmodified since constraint parameter is correctly
     * included in requests when the user specifies it.
     */
    @Test
    public void testUnmodifiedSinceConstraint() throws Exception {
        s3.copyObject(newCopyObjectRequest()
                .withUnmodifiedSinceConstraint(laterDate));

        assertNull(s3.copyObject(newCopyObjectRequest()
                .withUnmodifiedSinceConstraint(earlierDate)));
    }

    /**
     * Tests that error response are properly handled and unmarshalled as
     * AmazonS3Exception objects.
     */
    @Test
    public void testNoSuchKeyException() {
        try {
            s3.copyObject(BUCKET_NAME, "key", BUCKET_NAME, DESTINATION_KEY);
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
    @BeforeClass
    public static void initializeTestData() throws Exception {
        s3.createBucket(BUCKET_NAME);
        expiresDate = new Date(System.currentTimeMillis() + EXPIRES_TIME_IN_MILLIS);
        file = getRandomTempFile("copy-object-integ-test-" + System.currentTimeMillis(), CONTENT_LENGTH);
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setHttpExpiresDate(expiresDate);
        s3.putObject(new PutObjectRequest(BUCKET_NAME, SOURCE_KEY, file).withMetadata(metadata));

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
    }

    /**
     * Returns a new CopyObjectRequest, initialized for these test cases.
     *
     * @return A new COpyObjectRequest, initialized for these test cases.
     */
    private CopyObjectRequest newCopyObjectRequest() {
        return new CopyObjectRequest(BUCKET_NAME, SOURCE_KEY, BUCKET_NAME, DESTINATION_KEY);
    }

    /**
     * Asserts that the specified CopyObjectResult is valid by checking that the
     * ETag value is present (wihtout the surrounding quotes) and that the last
     * modified date is reasonably recent.
     *
     * @param result The CopyObjectResult object to check.
     */
    private void assertCopyObjectResultIsValid(CopyObjectResult result) {
        assertTrue(result.getETag().length() > 5);
        assertFalse(result.getETag().startsWith("\""));
        assertFalse(result.getETag().endsWith("\""));
        assertNotNull(result.getLastModifiedDate());
        assertNull(result.getVersionId());

        long timeDifference = System.currentTimeMillis() -
                result.getLastModifiedDate().getTime();
        assertTrue(timeDifference < 1000 * 60 * 60 * 24);
    }

}
