/*
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.internal.Constants;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UrlEncodingIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_WITH_NORMAL_KEYS = "android-sdk-normal-key-bucket-" + System.currentTimeMillis();
    private static final String BUCKET_WITH_SPECIAL_KEYS = "android-sdk-special-key-bucket-" + System.currentTimeMillis();

    /*
     * The normal keys. Url-encoding will not change their values.
     */
    private static final String[] NORMAL_KEY_NAMES = {
        "normal-object", "/slash/object", "star*object"
    };

    public static final String COMMON_PREFIX = "foo/bar=baz&";
    /*
     * The keys with special characters. Url-encoding will change their values.
     */
    private static final String[] SPECIAL_KEY_NAMES = {
        "<test>-object", "plus+object", "wave~object", "%20object",
            "%2Aobject", "%7Eobject", "%2Fobject", "\1object",
            COMMON_PREFIX + "foo", COMMON_PREFIX + "bar",
            "File With Spaces.png", "File+With+Spaces.jpg", "File%20With Spaces.png"
    };
    private static final long FILE_LENGTH = 200L;


    @BeforeClass
    public static void setUpBucketAndObjects() throws Exception {
        s3.createBucket(BUCKET_WITH_NORMAL_KEYS);
        s3.createBucket(BUCKET_WITH_SPECIAL_KEYS);
        for (final String name : NORMAL_KEY_NAMES) {
            s3.putObject(BUCKET_WITH_NORMAL_KEYS, name, getRandomTempFile(String.valueOf(System.currentTimeMillis()), FILE_LENGTH));
        }
        for (final String name : SPECIAL_KEY_NAMES) {
            s3.putObject(BUCKET_WITH_SPECIAL_KEYS, name, getRandomTempFile(String.valueOf(System.currentTimeMillis()), FILE_LENGTH));
        }
    }

    @AfterClass
    public static void tearDown() throws Exception {
        for (final String name : NORMAL_KEY_NAMES) {
            s3.deleteObject(BUCKET_WITH_NORMAL_KEYS, name);
        }
        s3.deleteBucket(BUCKET_WITH_NORMAL_KEYS);
        for (final String name : SPECIAL_KEY_NAMES) {
            s3.deleteObject(BUCKET_WITH_SPECIAL_KEYS, name);
        }
        s3.deleteBucket(BUCKET_WITH_SPECIAL_KEYS);
        s3.shutdown();
    }

    @Test
    public void testListObjects_normalKeys() {
        final ObjectListing implicitUrlEncodingListing = s3.listObjects(new ListObjectsRequest()
            .withBucketName(BUCKET_WITH_NORMAL_KEYS));
        testObjectListingKeyNameIdentical(NORMAL_KEY_NAMES, implicitUrlEncodingListing);

        final ObjectListing explicitUrlEncodingListing = s3.listObjects(
                new ListObjectsRequest().withBucketName(BUCKET_WITH_NORMAL_KEYS)
                    .withEncodingType(Constants.URL_ENCODING));
        testObjectListingKeyNameIdentical(NORMAL_KEY_NAMES, explicitUrlEncodingListing);
    }

    @Test
    public void testListObjects_specialKeys() {
        final ObjectListing implicitUrlEncodingListing = s3
                .listObjects(new ListObjectsRequest()
                        .withBucketName(BUCKET_WITH_SPECIAL_KEYS)
                        .withEncodingType(Constants.URL_ENCODING));

        testObjectListingKeyNameIdentical(SPECIAL_KEY_NAMES,
                implicitUrlEncodingListing);
    }

    @Test
    public void testListVersions_normalKeys() {
        final VersionListing implicitUrlEncodingListing = s3
                .listVersions(new ListVersionsRequest()
                        .withBucketName(BUCKET_WITH_NORMAL_KEYS));
        testVersionListingKeyNameIdentical(NORMAL_KEY_NAMES, implicitUrlEncodingListing);

        final VersionListing explicitUrlEncodingListing = s3
                .listVersions(new ListVersionsRequest()
                        .withBucketName(BUCKET_WITH_NORMAL_KEYS)
                        .withEncodingType(Constants.URL_ENCODING));
        testVersionListingKeyNameIdentical(NORMAL_KEY_NAMES, explicitUrlEncodingListing);
    }

    @Test
    public void testListVersions_specialKeys() {
        final VersionListing versionListing = s3
                .listVersions(new ListVersionsRequest()
                        .withBucketName(BUCKET_WITH_SPECIAL_KEYS)
                        .withEncodingType(Constants.URL_ENCODING));

        testVersionListingKeyNameIdentical(SPECIAL_KEY_NAMES,
                versionListing);
    }

    @Test
    public void listObjects_WithSpecialCharsInCommonPrefix_DecodesCommonPrefix() {
        final ObjectListing objectListing = s3.listObjects(new ListObjectsRequest()
                .withBucketName(BUCKET_WITH_SPECIAL_KEYS)
                .withDelimiter("&")
                .withEncodingType(Constants.URL_ENCODING));

        Assert.assertEquals(1, objectListing.getCommonPrefixes().size());
        Assert.assertEquals(COMMON_PREFIX, objectListing.getCommonPrefixes()
                .get(0));
    }

    @Test
    public void listVersions_WithSpecialCharsInCommonPrefix_DecodesCommonPrefix() {
        final VersionListing versionListing = s3.listVersions(
                new ListVersionsRequest()
                        .withBucketName(BUCKET_WITH_SPECIAL_KEYS)
                        .withDelimiter("&")
                        .withEncodingType(Constants.URL_ENCODING));

        Assert.assertEquals(1, versionListing.getCommonPrefixes().size());
        Assert.assertEquals(COMMON_PREFIX, versionListing.getCommonPrefixes()
                .get(0));
    }

    /**
     * Test if each of the key name should be changed from the response.
     * @param keys - The original keys
     * @param listing - The corresponding response
     */
    private void testObjectListingKeyNameIdentical(String[] keys, ObjectListing listing) {
        final boolean[] keyNameIdentical = new boolean[keys.length];
        final StringBuilder stringbuilder = new StringBuilder();
        for (final S3ObjectSummary summary : listing.getObjectSummaries()) {
            boolean flag = false;
            for (int i = 0; i < keys.length; ++i) {
                if (keys[i].equals(summary.getKey())) {
                    keyNameIdentical[i] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                stringbuilder.append(summary.getKey() + ", ");
            }
        }
        if (stringbuilder.length() > 0) {
            System.out.println("following matches were not found " + stringbuilder.toString());
        }
        for (final boolean identical : keyNameIdentical) {
            Assert.assertTrue(identical);
        }
    }

    /**
     * Test if each of the key name should be changed from the response.
     * @param keys - The original keys
     * @param listing - The corresponding response
     */
    private void testVersionListingKeyNameIdentical(String[] keys, VersionListing listing) {
        final boolean[] keyNameIdentical = new boolean[keys.length];
        final StringBuilder stringbuilder = new StringBuilder();
        for (final S3VersionSummary summary : listing.getVersionSummaries()) {
            boolean flag = false;
            for (int i = 0; i < keys.length; ++i) {
                if (keys[i].equals(summary.getKey())) {
                    keyNameIdentical[i] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                stringbuilder.append(summary.getKey() + ", ");
            }
        }

        if (stringbuilder.length() > 0) {
            System.out.println("following matches were not found " + stringbuilder.toString());
        }
        for (final boolean identical : keyNameIdentical) {
            Assert.assertTrue(identical);
        }
    }

}
