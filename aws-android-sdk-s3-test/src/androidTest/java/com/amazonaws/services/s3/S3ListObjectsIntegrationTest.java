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

import com.amazonaws.services.s3.internal.*;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Integration tests for the listObjects operations in the Amazon S3 Java
 * client.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class S3ListObjectsIntegrationTest extends S3IntegrationTestBase {

    /**
     * One hour in milliseconds for verifying that a last modified date is
     * recent
     */
    private static final long ONE_HOUR_IN_MILLISECONDS = 1000 * 60 * 60;

    /** Content length for sample keys created by these tests */
    private final long CONTENT_LENGTH = 123;

    private static final String KEY_NAME_WITH_SPECIAL_CHARS = "special-chars-@$%";

    /** The name of the bucket created, used, and deleted by these tests */
    private static final String BUCKET_NAME = "android-sdk-list-objects-integ-test-"
            + System.currentTimeMillis();

    /** List of all keys created by these tests */
    private final List<String> keys = new ArrayList<String>();

    @Before
    public void createBucketAndKeys() throws Exception {
        s3.createBucket(BUCKET_NAME);
        final NumberFormat numberFormatter = new DecimalFormat("##00");
        for (int i = 1; i <= 15; i++) {
            createKey("key-" + numberFormatter.format(i));
        }
        createKey("aaaaa");
        createKey("aaaaa/aaaaa");
        createKey("aaaaa/aaaaa/aaaaa");
        createKey(KEY_NAME_WITH_SPECIAL_CHARS);
    }

    /** Releases all resources created in this test */
    @After
    public void tearDown() {
        for (final java.util.Iterator iterator = keys.iterator(); iterator.hasNext();) {
            final String key = (String) iterator.next();
            try {
                s3.deleteObject(BUCKET_NAME, key);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s3.deleteBucket(BUCKET_NAME);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testListObjects_SimpleMethodForm() {
        gotestSimpleMethodForm();
    }

    @Test
    public void testListObjects_ComplexMethodWithPrefixAndMarker() {
        gotestComplexMethodWithPrefixAndMarker();
    }

    @Test
    public void testListObjects_ComplexMethodWithDelimiter() {
        gotestComplexMethodWithDelimiter();
    }

    @Test
    public void testListObjects_ComplexMethodWithMaxKeys() {
        gotestComplexMethodWithMaxKeys();
    }

    @Test
    public void testListObjects_ComplexMethodWithEncodingType() {
        gotestComplexMethodWithEncodingType();
    }

    @Test
    public void testListObjects_PaginationMethodForm() {
        gotestPaginationMethodForm();
    }

    /*
     * Individual Tests
     */

    /**
     * Tests a simple invocation of listObjects with no additional parameters
     * and verifies that the response contains the expected keys, no common
     * prefixes, isn't truncated, doesn't have any additional request
     * parameters, set, etc.
     */
    private void gotestSimpleMethodForm() {
        final ObjectListing objectListing = s3.listObjects(BUCKET_NAME);
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        assertEquals(keys.size(), objects.size());
        assertEquals(BUCKET_NAME, objectListing.getBucketName());
        assertS3ObjectSummariesAreValid(objects);

        // We didn't use a delimiter, so we expect these to be empty/null
        assertNotNull(objectListing.getCommonPrefixes());
        assertTrue(objectListing.getCommonPrefixes().isEmpty());
        assertNull(objectListing.getDelimiter());

        // We don't expect any truncated results
        assertFalse(objectListing.isTruncated());
        assertNull(objectListing.getNextMarker());

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(objectListing.getMarker());
        assertNull(objectListing.getPrefix());
        assertTrue(objectListing.getMaxKeys() >= 1000);
        assertNull(objectListing.getEncodingType());
    }

    /**
     * Tests that invoking listObjects with a prefix are marker correctly
     * returns a response that excludes the keys before the marker (as well as
     * keys not matching the prefix), isn't truncated, has no additional request
     * parameters set, etc.
     */
    private void gotestComplexMethodWithPrefixAndMarker() {
        final String prefix = "key";
        final String marker = "key-01";
        final ObjectListing objectListing = s3.listObjects(
                new ListObjectsRequest(BUCKET_NAME, prefix, marker, null, null));
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        assertEquals(15 - 1, objects.size());
        assertEquals(BUCKET_NAME, objectListing.getBucketName());
        assertS3ObjectSummariesAreValid(objects);
        assertEquals(marker, objectListing.getMarker());
        assertEquals(prefix, objectListing.getPrefix());

        // We didn't use a delimiter, so we expect these to be empty/null
        assertNull(objectListing.getDelimiter());
        assertNotNull(objectListing.getCommonPrefixes());
        assertTrue(objectListing.getCommonPrefixes().isEmpty());

        // We don't expect any truncated results
        assertFalse(objectListing.isTruncated());
        assertNull(objectListing.getNextMarker());

        // We didn't set any other request parameters, so we expect them to be
        // set to the defaults.
        assertTrue(objectListing.getMaxKeys() >= 1000);
        assertNull(objectListing.getEncodingType());
    }

    /**
     * Tests that invoking listObjects with a prefix and delimiter correctly
     * returns a response that delimits keys by '/', isn't truncated, contains a
     * common prefix, no additional request parameters set, etc.
     */
    private void gotestComplexMethodWithDelimiter() {
        final String prefix = "a";
        final String delimiter = "/";
        final ObjectListing objectListing = s3.listObjects(
                new ListObjectsRequest(BUCKET_NAME, prefix, null, delimiter, null));
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        assertEquals(1, objects.size());
        assertEquals(BUCKET_NAME, objectListing.getBucketName());
        assertS3ObjectSummariesAreValid(objects);
        assertEquals(prefix, objectListing.getPrefix());
        assertEquals(delimiter, objectListing.getDelimiter());
        assertNotNull(objectListing.getCommonPrefixes());
        assertEquals(1, objectListing.getCommonPrefixes().size());
        assertEquals("aaaaa/", objectListing.getCommonPrefixes().get(0));

        // We don't expect any truncated results
        assertFalse(objectListing.isTruncated());
        assertNull(objectListing.getNextMarker());

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(objectListing.getMarker());
        assertTrue(objectListing.getMaxKeys() >= 1000);
        assertNull(objectListing.getEncodingType());
    }

    /**
     * Tests that invoking listObjects with the maxKeys parameter correctly
     * returns a response that is truncated, with nextMarker set to the last
     * element in the list, has no common prefixes, no additional request
     * parameters set, etc.
     */
    private void gotestComplexMethodWithMaxKeys() {
        final int maxKeys = 4;
        final ObjectListing objectListing = s3.listObjects(
                new ListObjectsRequest(BUCKET_NAME, null, null, null, new Integer(maxKeys)));
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        assertEquals(maxKeys, objects.size());
        assertEquals(BUCKET_NAME, objectListing.getBucketName());
        assertEquals(maxKeys, objectListing.getMaxKeys());
        assertS3ObjectSummariesAreValid(objects);

        // We didn't use a delimiter, so we expect these to be empty/null
        assertNotNull(objectListing.getCommonPrefixes());
        assertTrue(objectListing.getCommonPrefixes().isEmpty());
        assertNull(objectListing.getDelimiter());

        // We expect truncated results since we set maxKeys
        assertTrue(objectListing.isTruncated());
        assertNotNull(objectListing.getNextMarker());
        assertTrue(objectListing.getNextMarker().length() > 1);

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(objectListing.getMarker());
        assertNull(objectListing.getPrefix());
        assertNull(objectListing.getEncodingType());
    }

    /**
     * Tests that invoking listObjects with the encodingType parameter correctly
     * returns a response with url-encoded key names.
     */
    private void gotestComplexMethodWithEncodingType() {
        final ObjectListing objectListing = s3.listObjects(
                new ListObjectsRequest(BUCKET_NAME,
                        KEY_NAME_WITH_SPECIAL_CHARS, null, null, null)
                        .withEncodingType(Constants.URL_ENCODING));
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        // EncodingType should be returned in the response.
        System.out.println("List Objects Response: " + objectListing);
        assertEquals(Constants.URL_ENCODING, objectListing.getEncodingType());
        System.out.println("List Objects Response: " + objectListing.getEncodingType());

        assertEquals(KEY_NAME_WITH_SPECIAL_CHARS, objects.get(0).getKey());
    }

    /**
     * Tests that users can call listObjects once to get a paginated list, then
     * use listNextBatchOfObjects to get the next set of results, with the
     * correct second page of results, correctly populated nextToken, etc.
     */
    private void gotestPaginationMethodForm() {
        final int maxKeys = 4;
        final String prefix = "key";
        final ObjectListing previousObjectListing = s3.listObjects(
                new ListObjectsRequest(BUCKET_NAME, prefix, null, null, new Integer(maxKeys)));
        final ObjectListing objectListing = s3.listNextBatchOfObjects(previousObjectListing);
        final List<S3ObjectSummary> objects = objectListing.getObjectSummaries();

        assertEquals(maxKeys, objects.size());
        assertEquals(BUCKET_NAME, objectListing.getBucketName());
        assertEquals(maxKeys, objectListing.getMaxKeys());
        assertEquals(prefix, objectListing.getPrefix());
        assertNotNull(objectListing.getMarker());
        assertS3ObjectSummariesAreValid(objects);

        for (int i = 0; i < maxKeys; i++) {
            assertEquals(keys.get(maxKeys + i), objects.get(i).getKey());
        }

        // We didn't use a delimiter, so we expect these to be empty/null
        assertNotNull(objectListing.getCommonPrefixes());
        assertTrue(objectListing.getCommonPrefixes().isEmpty());
        assertNull(objectListing.getDelimiter());

        // We expect truncated results since we set maxKeys
        assertTrue(objectListing.isTruncated());
        assertNotNull(objectListing.getNextMarker());
        assertTrue(objectListing.getNextMarker().length() > 1);

        assertNull(objectListing.getEncodingType());
    }

    /*
     * Private Test Utilities
     */

    /**
     * Creates a test object in S3 with the specified name, using random ASCII
     * data of the default content length as defined in this test class.
     *
     * @param key The key under which to create the object in this test class'
     *            test bucket.
     */
    private void createKey(String key) {
        final ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(CONTENT_LENGTH);
        final InputStream input = new RandomInputStream(CONTENT_LENGTH);

        s3.putObject(BUCKET_NAME, key, input, metadata);
        keys.add(key);
    }

    /**
     * Asserts that a list of S3ObjectSummary objects are valid, by checking
     * that expected fields are not null or empty, that ETag values don't
     * contain leading or trailing quotes, that the last modified date is
     * recent, etc.
     *
     * @param objectSummaries The list of objects to validate.
     */
    private void assertS3ObjectSummariesAreValid(List<S3ObjectSummary> objectSummaries) {

        for (final java.util.Iterator iterator = objectSummaries.iterator(); iterator.hasNext();) {
            final S3ObjectSummary obj = (S3ObjectSummary) iterator.next();
            assertEquals(BUCKET_NAME, obj.getBucketName());
            assertTrue(obj.getETag().length() > 1);
            assertFalse(obj.getETag().startsWith("\""));
            assertFalse(obj.getETag().endsWith("\""));
            assertTrue(obj.getKey().length() > 1);

            // Verify that the last modified date is within an hour
            assertNotNull(obj.getLastModified());
            final long offset = obj.getLastModified().getTime() - new Date().getTime();
            assertTrue(offset < ONE_HOUR_IN_MILLISECONDS);

            assertNotNull(obj.getOwner());
            assertTrue(obj.getOwner().getDisplayName().length() > 1);
            assertTrue(obj.getOwner().getId().length() > 1);
            assertEquals(CONTENT_LENGTH, obj.getSize());
            assertTrue(obj.getStorageClass().length() > 1);
        }
    }

}
