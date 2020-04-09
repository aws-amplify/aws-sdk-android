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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.After;
import org.junit.Test;

import java.util.Date;

/**
 * Integration tests to validate that anonymous clients can send unsigned
 * requests using the Java client library.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class UnauthenticatedIntegrationTest extends S3IntegrationTestBase {

    /** The name of the bucket created and used in these tests */
    private final String bucketName = "unauth-integ-test-" + new Date().getTime();

    /** Releases all resources used in this tests */
    @After
    public void tearDown() {
        try {
            deleteBucketAndAllContents(bucketName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Tests that an anonymous client can make certain calls to Amazon S3 that
     * don't require signed requests.
     *
     * With SigV4, a valid signature is required for the operations tested here.
     */
    @Test
    public void testUnauthenticatedOperations() {
        s3.createBucket(bucketName);

        s3.putObject(new PutObjectRequest(
                bucketName, "key-1", new RandomInputStream(123L), new ObjectMetadata())
                .withCannedAcl(CannedAccessControlList.PublicRead));
        s3.putObject(new PutObjectRequest(
                bucketName, "key-2", new RandomInputStream(321L), new ObjectMetadata())
                .withCannedAcl(CannedAccessControlList.PublicRead));

        AmazonS3 anonymousS3 = new AmazonS3Client(new AnonymousAWSCredentials(), Region.getRegion(Regions.US_WEST_2));

        try {
            // listObjects
            ObjectListing objectListing = anonymousS3.listObjects(bucketName);
            assertEquals(2, objectListing.getObjectSummaries().size());

            // getObjectMetadata
            ObjectMetadata objectMetadata = anonymousS3.getObjectMetadata(bucketName, "key-1");
            assertEquals(123L, objectMetadata.getContentLength());

            // getObject
            S3Object object = anonymousS3.getObject(bucketName, "key-1");
            assertEquals(123L, object.getObjectMetadata().getContentLength());

            /*
             * As a sanity check (just to make sure we aren't somehow using real
             * credentials) try an operation that should fail.
             */
            anonymousS3.getObjectAcl(bucketName, "key-1");
            fail("Expected an AmazonS3Exception, but didn't catch one");
        } catch (AmazonS3Exception ase) {
            assertEquals(301, ase.getStatusCode());
            assertTrue(ase.getRequestId().length() > 5);
        }
    }

}
