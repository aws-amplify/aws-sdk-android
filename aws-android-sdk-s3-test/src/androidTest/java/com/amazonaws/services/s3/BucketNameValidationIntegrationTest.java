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

import static org.junit.Assert.fail;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import org.junit.Test;

/**
 * Tests to validate that the AWS S3 Java client restricts bucket names to
 * conform with S3 guidelines.
 * <p>
 * For more information on S3 bucket naming guidelines, see <a href=
 * "http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?BucketRestrictions.html"
 * > http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?
 * BucketRestrictions.html</a>
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class BucketNameValidationIntegrationTest {

    private final AWSCredentials fakeCredentials =
            new BasicAWSCredentials("fakeAccessKey", "fakeSecretKey");
    private final AmazonS3 s3 =
            new AmazonS3Client(fakeCredentials, Region.getRegion(Regions.DEFAULT_REGION));

    /**
     * Tests that the bucket names that don't follow S3's recommended
     * guidelines, can't be created by the AWS S3 Java client.
     * <p>
     * The S3 guidelines (and DNS restrictions) specify that:
     * <ul>
     * <li>Bucket names should not contain underscores (_)
     * <li>Bucket names should be between 3 and 63 characters long
     * <li>Bucket names should not end with a dash
     * <li>Bucket names cannot contain two, adjacent periods
     * <li>Bucket names cannot contain dashes next to periods (e.g.,
     * "my-.bucket.com" and "my.-bucket" are invalid)
     * </ul>
     */
    @Test
    public void testIllegalBucketNames() {
        assertIllegalArgumentExceptionForBucketName("buckets_cant_contain_underscores");
        assertIllegalArgumentExceptionForBucketName(
                "bucket-names-cannot-be-longer-than-sixty-three-characters-" +
                        "otherwise-they-dont-conform-with-dns-requirements");
        assertIllegalArgumentExceptionForBucketName("buckets-cant-end-with-a-dash-");
        assertIllegalArgumentExceptionForBucketName("buckets-cant-have-..-adjacent-periods");
        assertIllegalArgumentExceptionForBucketName(
                "buckets-.cant-.have-.dashes-.next-.to-.periods");
        assertIllegalArgumentExceptionForBucketName(
                "buckets.-cant.-have.-dashes.-next.-to.-periods");
        assertIllegalArgumentExceptionForBucketName("Buckets-Cant-Have-Uppercase-Characters");
        assertIllegalArgumentExceptionForBucketName("buckets-cannot-have- -white-space");
        assertIllegalArgumentExceptionForBucketName("buckets-cannot-have-\n-white-space");
        assertIllegalArgumentExceptionForBucketName("buckets-cannot-have-\t-white-space");
        assertIllegalArgumentExceptionForBucketName("buckets-cannot-have-/-slash");
        assertIllegalArgumentExceptionForBucketName("bucket-cannot-have-\\-back-slash");
        assertIllegalArgumentExceptionForBucketName(".bucket.cannot.start.with.period");
        assertIllegalArgumentExceptionForBucketName("bucket.cannot.end.with.period.");
    }

    /**
     * Asserts that calling createBucket with the specified bucket name triggers
     * an InvalidArgumentException.
     *
     * @param bucketName The name of the bucket to try creating.
     */
    private void assertIllegalArgumentExceptionForBucketName(String bucketName) {
        try {
            s3.createBucket(bucketName);
            fail("Expected an IllegalArgumentException, but wasn't thrown");
        } catch (final IllegalArgumentException e) {
            // This is the exception we're expecting
        }
    }
}
