/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.Map;
import java.util.Set;

/**
 * Integration tests for uploading files to Amazon S3.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class PutFileIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_NAME = "android-sdk-put-object-integ-test-" + System.currentTimeMillis();
    private static final String KEY = "key";
    private static final long CONTENT_LENGTH = 443L;
    private static ObjectMetadata expectedMetadata;
    private static File file;

    /**
     * Initializes test resources.
     */
    @BeforeClass
    public static void initializeTestData() throws Exception {
        s3.createBucket(BUCKET_NAME);
        S3IntegrationTestBase.waitForBucketCreation(BUCKET_NAME);

        expectedMetadata = new ObjectMetadata();
        expectedMetadata.setCacheControl("custom-cache-control");
        expectedMetadata.setContentDisposition("custom-disposition");
        expectedMetadata.setContentEncoding("custom-encoding");
        expectedMetadata.setContentType("custom-content-type");
        expectedMetadata.addUserMetadata("foo", "bar");
        expectedMetadata.addUserMetadata("baz", "bash");

        file = S3IntegrationTestBase.getRandomTempFile("foo.txt", CONTENT_LENGTH);
    }

    /** Releases all resources created by tests */
    @AfterClass
    public static void tearDown() {
        s3.deleteObject(BUCKET_NAME, KEY);
        s3.deleteBucket(BUCKET_NAME);
        file.delete();
    }

    /**
     * Tests that uploading a file with a known file extension will correctly
     * upload the object, set it's content type and content disposition.
     */
    @Test
    public void testPutFileWithRecognizedMimeType() throws Exception {
        final PutObjectResult result = s3.putObject(BUCKET_NAME, KEY, file);
        assertNotEmpty(result.getETag());
        assertNotEmpty(result.getContentMd5());
        assertNull(result.getVersionId());

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata s3Metadata = object.getObjectMetadata();
        // assertNull(s3Metadata.getCacheControl());
        assertTrue(CONTENT_LENGTH == s3Metadata.getContentLength());
        assertNull(s3Metadata.getContentEncoding());
        assertEquals("text/plain", s3Metadata.getContentType());
        assertNotNull(s3Metadata.getETag());
        assertNotNull(s3Metadata.getLastModified());
        assertTrue(s3Metadata.getUserMetadata().isEmpty());
    }

    /**
     * Tests that uploading a file with an unknown file extension will correctly
     * upload the data, set content disposition, and a default content type.
     */
    @Test
    public void testPutFileWithUnrecognizedMimeType() throws Exception {
        final File file = super.getRandomTempFile("foo", CONTENT_LENGTH);
        s3.putObject(BUCKET_NAME, KEY, file);

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata s3Metadata = object.getObjectMetadata();
        // assertNull(s3Metadata.getCacheControl());
        assertTrue(CONTENT_LENGTH == s3Metadata.getContentLength());
        assertNull(s3Metadata.getContentEncoding());
        assertEquals("application/octet-stream", s3Metadata.getContentType());
        assertNotNull(s3Metadata.getETag());
        assertNotNull(s3Metadata.getLastModified());
        assertTrue(s3Metadata.getUserMetadata().isEmpty());

        file.delete();
    }

    /**
     * Tests that uploading a file with metadata will correctly upload the
     * object and honor the specified metadata.
     */
    @Test
    public void testPutFileWithMetadata() throws Exception {
        s3.putObject(new PutObjectRequest(BUCKET_NAME, KEY, file)
                .withMetadata(expectedMetadata));

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata metadata = object.getObjectMetadata();
        assertMetadataEqual(expectedMetadata, metadata);
        assertTrue(CONTENT_LENGTH == metadata.getContentLength());
    }

    /**
     * Tests that uploading a file and specifying a canned ACL will correctly
     * upload the object and set the correct canned ACL.
     */
    @Test
    public void testPutFileWithCannedAcl() throws Exception {
        s3.putObject(new PutObjectRequest(BUCKET_NAME, KEY, file)
                .withCannedAcl(CannedAccessControlList.PublicRead));

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata metadata = object.getObjectMetadata();
        assertTrue(CONTENT_LENGTH == metadata.getContentLength());
        assertNotNull(metadata.getETag());
        assertNotNull(metadata.getLastModified());
        assertTrue(metadata.getUserMetadata().isEmpty());

        final AccessControlList acl = s3.getObjectAcl(BUCKET_NAME, KEY);
        assertTrue(2 == acl.getGrants().size());
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));
    }

    /**
     * Tests that uploading a file and specifying an ACL will correctly upload
     * the object and set the correct ACL.
     */
    @Test
    public void testPutFileWithAcl() throws Exception {
        java.util.logging.Logger.getLogger("com.amazonaws")
                .setLevel(java.util.logging.Level.FINEST);

        final AccessControlList acl = new AccessControlList();

        for (final Permission permission : Permission.values()) {
            acl.grantPermission(new CanonicalGrantee(AWS_DR_ECLIPSE_ACCT_ID), permission);
            acl.grantPermission(GroupGrantee.AuthenticatedUsers, permission);
            acl.grantPermission(new EmailAddressGrantee(AWS_DR_TOOLS_EMAIL_ADDRESS), permission);
        }

        s3.putObject(new PutObjectRequest(BUCKET_NAME, KEY, file).withAccessControlList(acl));

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata metadata = object.getObjectMetadata();
        assertTrue(CONTENT_LENGTH == metadata.getContentLength());
        assertNotNull(metadata.getETag());
        assertNotNull(metadata.getLastModified());
        assertTrue(metadata.getUserMetadata().isEmpty());

        final AccessControlList aclRead = s3.getObjectAcl(BUCKET_NAME, KEY);
        assertTrue(15 == aclRead.getGrants().size());

        final Set<Grant> expectedGrants = translateEmailAclsIntoCanonical(acl);

        for (final Grant expected : expectedGrants) {
            assertTrue("Didn't find expectd grant " + expected,
                    aclRead.getGrants().contains(expected));
        }
    }

    /**
     * Tests that uploading a file with explicit metadata and specifying a
     * canned ACL will correctly upload the object, honor the specified
     * metadata, set the correct canned ACL, and upload the correct data.
     */
    @Test
    public void testPutFileWithMetadataAndCannedAcl() throws Exception {
        final PutObjectResult result = s3.putObject(new PutObjectRequest(BUCKET_NAME, KEY, file)
                .withMetadata(expectedMetadata)
                .withCannedAcl(CannedAccessControlList.AuthenticatedRead));
        assertNotEmpty(result.getContentMd5());

        final S3Object object = s3.getObject(BUCKET_NAME, KEY);
        assertFileEqualsStream(file, object.getObjectContent());

        final ObjectMetadata metadata = object.getObjectMetadata();
        assertMetadataEqual(expectedMetadata, metadata);
        assertTrue(CONTENT_LENGTH == metadata.getContentLength());

        final AccessControlList acl = s3.getObjectAcl(BUCKET_NAME, KEY);
        assertTrue(2 == acl.getGrants().size());
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AuthenticatedUsers, Permission.Read));
    }

    /*
     * Private Test Helper Functions
     */

    /**
     * Asserts that the two specified S3ObjectMetadata objects are equivalent.
     *
     * @param expectedMetadata The metadata object containing the expected
     *            values.
     * @param metadata The metadata object being tested.
     */
    private void assertMetadataEqual(ObjectMetadata expectedMetadata, ObjectMetadata metadata) {
        assertEquals(expectedMetadata.getCacheControl(), metadata.getCacheControl());
        assertEquals(expectedMetadata.getContentDisposition(), metadata.getContentDisposition());
        assertEquals(expectedMetadata.getContentEncoding(), metadata.getContentEncoding());
        assertEquals(expectedMetadata.getContentType(), metadata.getContentType());

        final Map<String, String> expectedUserMetadata = expectedMetadata.getUserMetadata();
        final Map<String, String> userMetadata = metadata.getUserMetadata();
        assertTrue(expectedUserMetadata.size() == userMetadata.size());

        for (final java.util.Iterator iterator = expectedUserMetadata.keySet().iterator(); iterator
                .hasNext();) {
            final String key = (String) iterator.next();
            assertTrue(userMetadata.containsKey(key));
            assertEquals(expectedUserMetadata.get(key), userMetadata.get(key));
        }
    }

}
