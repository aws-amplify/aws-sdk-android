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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.util.StringUtils;

import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Integration tests for bucket versioning features in Amazon S3. Implemented as
 * one JUnit test to avoid having to repeat expensive data setup (S3 bucket
 * creation, versioning configuration, etc).
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class VersioningIntegrationTest extends S3IntegrationTestBase {

    private final String bucketName = "java-versioning-integ-test-" + new Date().getTime();
    private final String unversionedKey = "unversionedKey";
    private final String versionedKey = "key";
    private final String deletedKey = "deletedKey";

    public int POLL_TIMEOUT = 5 * 60 * 1000;

    private Map<String, String> fileContentsByVersionId;
    private static final String[] SAMPLE_DATA = new String[] {
            "foobarbazbarbashbarbaz",
            "binbarbashbazfoobarbash",
            "bashbashbinbarbazfoobashbar",
    };

    /** Releases all resources created by these tests */
    @After
    public void tearDown() throws Exception {
        try {
            deleteBucketAndAllVersionedContents(bucketName);
        } catch (Exception e) {
        }
    }

    /**
     * Runs through each of the Amazon S3 versioning operations to test their
     * inputs and responses.
     */
    @Test
    public void testS3VersioningOperations() throws Exception {
        createTestData();
        gotestConfigurationOperations();
        gotestPutObject();
        gotestGetObject();
        gotestCopyObject();
        gotestHeadObject();
        gotestPutAcl();
        gotestGetAcl();
        gotestListVersions();
        gotestDeleteObject();
    }

    /*
     * Private Interface - Individual Tests
     */

    /**
     * Creates test data for the versioning tests.
     */
    private void createTestData() throws Exception {
        createBucket(bucketName);
        S3IntegrationTestBase.waitForBucketCreation(bucketName);

        // Create an object before versioning is enabled for this bucket
        PutObjectResult result = createObject(bucketName, unversionedKey, POLL_TIMEOUT);
        assertNull(result.getVersionId());
        assertNotEmpty(result.getETag());
        assertNull(result.getVersionId());

        // Create an initial version of the object we'll create multiple
        // versions
        // of so that we have a NULL version to test with
        result = createObject(bucketName, versionedKey, POLL_TIMEOUT);
        assertNull(result.getVersionId());
        assertNotEmpty(result.getETag());
        assertNull(result.getVersionId());

        // Create a few objects so we can test prefixes and delimiters in
        // listVersions
        createObject(bucketName, "aaaa", POLL_TIMEOUT);
        createObject(bucketName, "aaaa/aaaa", POLL_TIMEOUT);
        createObject(bucketName, "aaaa/aaaa/aaaa", POLL_TIMEOUT);

        // And another to demonstrate a delete marker
        createObject(bucketName, deletedKey, POLL_TIMEOUT);
    }

    /**
     * Tests that we can successfully query and modify a bucket's versioning
     * configuration.
     */
    private void gotestConfigurationOperations() throws Exception {
        // Versioning should always be OFF to start with
        assertEquals(BucketVersioningConfiguration.OFF,
                getBucketVersioningStatus());

        // Enable versioning and query the configuration to check it
        s3.setBucketVersioningConfiguration(
                new SetBucketVersioningConfigurationRequest(
                        bucketName,
                        new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
        assertEquals(BucketVersioningConfiguration.ENABLED,
                waitForBucketVersioningStatus(BucketVersioningConfiguration.ENABLED).getStatus());

        // Suspend versioning and query the configuration to check it
        s3.setBucketVersioningConfiguration(
                new SetBucketVersioningConfigurationRequest(
                        bucketName,
                        new BucketVersioningConfiguration(BucketVersioningConfiguration.SUSPENDED)));
        assertEquals(BucketVersioningConfiguration.SUSPENDED,
                waitForBucketVersioningStatus(BucketVersioningConfiguration.SUSPENDED).getStatus());

        // Enable versioning again so the remaining tests can use versioning
        // features
        s3.setBucketVersioningConfiguration(
                new SetBucketVersioningConfigurationRequest(
                        bucketName,
                        new BucketVersioningConfiguration(BucketVersioningConfiguration.ENABLED)));
        assertEquals(BucketVersioningConfiguration.ENABLED,
                waitForBucketVersioningStatus(BucketVersioningConfiguration.ENABLED).getStatus());
    }

    protected String getBucketVersioningStatus() {
        String status = s3.getBucketVersioningConfiguration(bucketName)
                .getStatus();
        System.err.println("Status is: " + status);
        return status;
    }

    protected BucketVersioningConfiguration waitForBucketVersioningStatus(String status)
            throws InterruptedException {
        // Annoyingly, consecutive calls to getBucketVersioningConfiguration can
        // return different results. To be sure the status has propagated, we'll
        // wait for 10 correct answers in a row before we trust it. This can
        // take a while.
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        int hits = 0;
        BucketVersioningConfiguration versioningConfiguration = s3
                .getBucketVersioningConfiguration(bucketName);
        while (System.currentTimeMillis() < endTime) {
            versioningConfiguration = s3.getBucketVersioningConfiguration(bucketName);
            if (!versioningConfiguration.getStatus().equals(status)) {
                hits = 0;
                Thread.sleep(1000);
            }
            if (hits++ == 10)
                return versioningConfiguration;
        }

        maxPollTimeExceeded();
        return null;

    }

    /**
     * Tests that we can upload objects to S3 when versioning is enabled and get
     * back the new version IDs in the response.
     */
    private void gotestPutObject() throws Exception {
        // Upload the sample data and return the created version IDs
        fileContentsByVersionId = new HashMap<String, String>();

        for (int index = 0; index < SAMPLE_DATA.length; index++) {
            String s = SAMPLE_DATA[index];

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(s.getBytes(StringUtils.UTF8).length);
            PutObjectResult putObjectResult = s3.putObject(bucketName, versionedKey,
                    new ByteArrayInputStream(s.getBytes(StringUtils.UTF8)), metadata);
            assertNotEmpty(putObjectResult.getVersionId());
            assertNotEmpty(putObjectResult.getETag());
            int poll = 0;
            int hits = 0;
            while (poll++ < 60 * 10 && hits <= 10) {
                if (!doesObjectExist(bucketName, versionedKey, putObjectResult.getVersionId())) {
                    Thread.sleep(1000);
                }
                hits++;
            }
            if (poll >= 60 * 10)
                maxPollTimeExceeded();
            fileContentsByVersionId.put(putObjectResult.getVersionId(), s);
        }
    }

    /**
     * Tests that version aware and version unaware forms of GetObject return
     * correct responses for versioned and unversioned objects.
     */
    private void gotestGetObject() throws Exception {
        // Version unaware GET for an object written after versioning was
        // enabled should return a valid version ID
        S3Object s3Object = s3.getObject(bucketName, versionedKey);
        assertNotEmpty(s3Object.getObjectMetadata().getVersionId());

        // Version unaware GET for an object written before versioning was
        // enabled should return the null version ID ("null").
        S3Object object = s3.getObject(bucketName, unversionedKey);
        assertEquals(Constants.NULL_VERSION_ID, object.getObjectMetadata().getVersionId());

        // Version aware GET should be able to access all versions of an object
        for (java.util.Iterator iterator = fileContentsByVersionId.keySet().iterator(); iterator
                .hasNext();) {
            String versionId = (String) iterator.next();
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, versionedKey,
                    versionId);
            s3Object = s3.getObject(getObjectRequest);
            assertEquals(versionId, s3Object.getObjectMetadata().getVersionId());
            assertStringEqualsStream(fileContentsByVersionId.get(versionId),
                    s3Object.getObjectContent());
        }
    }

    /**
     * Tests that CopyObject can correctly copy versioned and unversioned
     * objects.
     */
    private void gotestCopyObject() throws Exception {
        // version unaware
        CopyObjectRequest request = new CopyObjectRequest(bucketName, unversionedKey, bucketName,
                "copiedKey");
        CopyObjectResult result = s3.copyObject(request);
        assertNotEmpty(result.getETag());
        assertNotNull(result.getLastModifiedDate());
        assertNotEmpty(result.getVersionId());

        String versionId = (String) fileContentsByVersionId.keySet().toArray()[0];

        // version aware copy to a different object
        request = new CopyObjectRequest(bucketName, versionedKey, versionId, bucketName,
                "newVersionedKey");
        result = s3.copyObject(request);
        assertNotEmpty(result.getETag());
        assertNotNull(result.getLastModifiedDate());
        assertNotEmpty(result.getVersionId());

        // version aware copy to the same object
        request = new CopyObjectRequest(bucketName, versionedKey, versionId, bucketName,
                versionedKey);
        result = s3.copyObject(request);
        assertNotEmpty(result.getETag());
        assertNotNull(result.getLastModifiedDate());
        assertNotEmpty(result.getVersionId());
    }

    /**
     * Tests that the version aware and version unaware forms of HeadObject
     * correctly handle version IDs.
     */
    private void gotestHeadObject() throws Exception {
        ObjectMetadata metadata = s3.getObjectMetadata(bucketName, versionedKey);
        assertNotEmpty(metadata.getVersionId());

        for (java.util.Iterator iterator = fileContentsByVersionId.keySet().iterator(); iterator
                .hasNext();) {
            String versionId = (String) iterator.next();
            metadata = s3.getObjectMetadata(new GetObjectMetadataRequest(bucketName, versionedKey,
                    versionId));
            assertNotEmpty(metadata.getVersionId());
        }

        // For objects uploaded before versioning was enabled, we expect
        // to see the null version ID
        metadata = s3.getObjectMetadata(bucketName, unversionedKey);
        assertEquals(Constants.NULL_VERSION_ID, metadata.getVersionId());
    }

    /**
     * Tests that we can PUT ACLs for specific versions of objects.
     */
    private void gotestPutAcl() throws Exception {
        String versionId = (String) fileContentsByVersionId.keySet().toArray()[1];

        // version aware on a specific version
        s3.setObjectAcl(bucketName, versionedKey, versionId, CannedAccessControlList.PublicRead);

        // version aware on the NULL version
        s3.setObjectAcl(bucketName, versionedKey, Constants.NULL_VERSION_ID,
                CannedAccessControlList.PublicReadWrite);

        // version unaware on the head version
        s3.setObjectAcl(bucketName, versionedKey, CannedAccessControlList.Private);

        // version unaware (with the null version ID?)
        s3.setObjectAcl(bucketName, unversionedKey, CannedAccessControlList.LogDeliveryWrite);
        Thread.sleep(1000 * 60);
    }

    /**
     * Tests that we can get ACLs for the specific versions of objects that we
     * set ACLs for earlier.
     */
    private void gotestGetAcl() throws Exception {
        String versionId = (String) fileContentsByVersionId.keySet().toArray()[1];

        // version aware on a specific version
        AccessControlList acl = s3.getObjectAcl(bucketName, versionedKey, versionId);
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));

        // version aware on the NULL version
        acl = s3.getObjectAcl(bucketName, versionedKey, Constants.NULL_VERSION_ID);
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Write));

        // version unaware on the head version
        acl = s3.getObjectAcl(bucketName, versionedKey);
        assertFalse(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));

        // version unaware
        acl = s3.getObjectAcl(bucketName, unversionedKey);
        assertFalse(doesAclContainGroupGrant(acl, GroupGrantee.AllUsers, Permission.Read));
        assertTrue(doesAclContainGroupGrant(acl, GroupGrantee.LogDelivery, Permission.Write));
    }

    /**
     * Tests that we can list the versions in a bucket and correctly handle all
     * the request parameters and parse all the response data.
     */
    private void gotestListVersions() throws Exception {
        // Create a delete marker for us to test later
        s3.deleteObject(bucketName, deletedKey);

        // Test with only bucketName and prefix
        VersionListing versionListing = s3.listVersions(bucketName, versionedKey);
        assertEquals(bucketName, versionListing.getBucketName());
        assertEquals(versionedKey, versionListing.getPrefix());
        assertEquals(0, versionListing.getCommonPrefixes().size());
        assertTrue(versionListing.getMaxKeys() > 0);
        assertNull(versionListing.getDelimiter());
        assertNull(versionListing.getKeyMarker());
        assertNull(versionListing.getVersionIdMarker());
        assertNull(versionListing.getNextKeyMarker());
        assertNull(versionListing.getNextVersionIdMarker());
        assertNull(versionListing.getEncodingType());
        assertFalse(versionListing.isTruncated());

        for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                .hasNext();) {
            Object summaryObject = iterator.next();
            S3VersionSummary summary = (S3VersionSummary) summaryObject;
            assertValidVersionSummary(summary);
        }

        // Test with the delimiter parameter a prefix and returned common
        // prefixes
        versionListing = s3.listVersions(new ListVersionsRequest(bucketName, "aa", null, null, "/",
                null));
        assertEquals(bucketName, versionListing.getBucketName());
        assertEquals(1, versionListing.getCommonPrefixes().size());
        assertEquals("aaaa/", versionListing.getCommonPrefixes().get(0));
        assertEquals("/", versionListing.getDelimiter());
        assertNull(versionListing.getKeyMarker());
        assertNull(versionListing.getVersionIdMarker());
        assertTrue(versionListing.getMaxKeys() > 0);
        assertNull(versionListing.getNextKeyMarker());
        assertNull(versionListing.getNextVersionIdMarker());
        assertNull(versionListing.getEncodingType());
        assertEquals("aa", versionListing.getPrefix());
        assertTrue(versionListing.getVersionSummaries().size() > 0);
        assertFalse(versionListing.isTruncated());
        for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                .hasNext();) {
            Object summaryObject = iterator.next();
            S3VersionSummary summary = (S3VersionSummary) summaryObject;
            assertValidVersionSummary(summary);
        }

        // Test with a very low maxKeys to get a truncated result...
        versionListing = s3.listVersions(new ListVersionsRequest(bucketName, null, null, null,
                null, new Integer(2)));
        assertEquals(bucketName, versionListing.getBucketName());
        assertEquals(0, versionListing.getCommonPrefixes().size());
        assertNull(versionListing.getDelimiter());
        assertNull(versionListing.getKeyMarker());
        assertNull(versionListing.getVersionIdMarker());
        assertNull(versionListing.getEncodingType());
        assertEquals(2, versionListing.getMaxKeys());
        assertNotEmpty(versionListing.getNextKeyMarker());
        assertNotEmpty(versionListing.getNextVersionIdMarker());
        assertNull(versionListing.getPrefix());
        assertEquals(2, versionListing.getVersionSummaries().size());
        assertTrue(versionListing.isTruncated());
        for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                .hasNext();) {
            Object summaryObject = iterator.next();
            S3VersionSummary summary = (S3VersionSummary) summaryObject;
            assertValidVersionSummary(summary);
        }

        // Now test again with the markers from the last call...
        String nextVersionIdMarker = versionListing.getNextVersionIdMarker();
        String nextKeyMarker = versionListing.getNextKeyMarker();
        versionListing = s3.listNextBatchOfVersions(versionListing);
        assertEquals(bucketName, versionListing.getBucketName());
        assertEquals(0, versionListing.getCommonPrefixes().size());
        assertNull(versionListing.getDelimiter());
        assertNull(versionListing.getEncodingType());
        assertEquals(nextKeyMarker, versionListing.getKeyMarker());
        assertEquals(nextVersionIdMarker, versionListing.getVersionIdMarker());
        assertEquals(2, versionListing.getMaxKeys());
        assertNotEmpty(versionListing.getNextKeyMarker());
        assertNotEmpty(versionListing.getNextVersionIdMarker());
        assertNull(versionListing.getPrefix());
        assertEquals(2, versionListing.getVersionSummaries().size());
        assertTrue(versionListing.isTruncated());

        for (java.util.Iterator iterator = versionListing.getVersionSummaries().iterator(); iterator
                .hasNext();) {
            Object summaryObject = iterator.next();
            S3VersionSummary summary = (S3VersionSummary) summaryObject;
            assertValidVersionSummary(summary);
        }

        // Test out a delete marker
        versionListing = s3.listVersions(new ListVersionsRequest(bucketName, deletedKey, null,
                null, null, null));
        assertEquals(bucketName, versionListing.getBucketName());
        assertEquals(0, versionListing.getCommonPrefixes().size());
        assertNull(versionListing.getDelimiter());
        assertNull(versionListing.getKeyMarker());
        assertNull(versionListing.getVersionIdMarker());
        assertNull(versionListing.getNextKeyMarker());
        assertNull(versionListing.getNextVersionIdMarker());
        assertNull(versionListing.getEncodingType());
        assertEquals(deletedKey, versionListing.getPrefix());
        assertFalse(versionListing.isTruncated());

        S3VersionSummary deleteMarker = versionListing.getVersionSummaries().get(0);
        assertTrue(deleteMarker.isDeleteMarker());
        assertTrue(deleteMarker.isLatest());
        assertValidVersionSummary(deleteMarker);

        S3VersionSummary versionSummary = versionListing.getVersionSummaries().get(1);
        assertFalse(versionSummary.isDeleteMarker());
        assertFalse(versionSummary.isLatest());
        assertValidVersionSummary(versionSummary);

        // Test list versions with encoding-type parameter
        String encodingType = "url";
        versionListing = s3.listVersions(new ListVersionsRequest(bucketName, null, null, null,
                null, null)
                .withEncodingType(encodingType));
        assertEquals(encodingType, versionListing.getEncodingType());

    }

    /**
     * Tests that the DeleteObject operation can correctly delete specific
     * versions of versioned objects, as well as mark the head version of an
     * object with a delete marker when no version is specified.
     */
    private void gotestDeleteObject() throws Exception {
        String versionId = (String) fileContentsByVersionId.keySet().toArray()[1];

        // version unaware on the head version of a versioned file
        s3.deleteObject(bucketName, versionedKey);
        assertObjectDoesntExist(bucketName, versionedKey);
        assertObjectIsDeleted(bucketName, versionedKey);

        // version unaware on a file created before versioning was turned on
        s3.deleteObject(bucketName, unversionedKey);
        assertObjectDoesntExist(bucketName, unversionedKey);
        assertObjectIsDeleted(bucketName, unversionedKey);

        // version aware on a specific version
        s3.deleteVersion(bucketName, versionedKey, versionId);
        assertObjectDoesntExist(bucketName, versionedKey, versionId);

        // version aware on the NULL version
        s3.deleteVersion(bucketName, versionedKey, Constants.NULL_VERSION_ID);
        assertObjectDoesntExist(bucketName, versionedKey, Constants.NULL_VERSION_ID);
    }

    /*
     * Test Utilities
     */

    /**
     * Asserts that a version summary object has the basic required fields
     * populated, taking into account the delete marker.
     *
     * @param summary The version summary object to test.
     */
    private void assertValidVersionSummary(S3VersionSummary summary) {
        assertNotEmpty(summary.getKey());
        assertNotNull(summary.getLastModified());
        assertNotNull(summary.getOwner());
        assertNotEmpty(summary.getVersionId());
        assertNotEmpty(summary.getBucketName());

        if (summary.isDeleteMarker()) {
            assertNull(summary.getETag());
            assertTrue(summary.getSize() == 0);
            assertNull(summary.getStorageClass());
        } else {
            assertNotEmpty(summary.getETag());
            assertTrue(summary.getSize() > 0);
            assertNotEmpty(summary.getStorageClass());
        }
    }

    /**
     * Asserts that the latest version of the specified object is the delete
     * marker.
     *
     * @param bucketName The name of the bucket containing the object to test.
     * @param key The key under which the object is stored in the specified
     *            bucket.
     */
    private void assertObjectIsDeleted(String bucketName, String key) throws Exception {
        VersionListing versionListing = s3.listVersions(bucketName, key);
        S3VersionSummary latestVersion = versionListing.getVersionSummaries().get(0);
        if (latestVersion.isDeleteMarker() == false) {
            fail("The latest version of the specified object is not a delete marker");
        }
    }

}
