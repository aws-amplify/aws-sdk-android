/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonClientException;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.services.s3.internal.*;
import com.amazonaws.testutils.util.RandomTempFile;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Integration tests for AmazonS3Client -> ObjectMetadata.
 */
public class AmazonS3ClientIntegrationTest extends S3IntegrationTestBase {

    /** The bucket created and used by these tests */
    private static final String bucketName = "amazon-s3-client-integ-test-" + new Date().getTime();

    /** Bucket that has objects with key names containing special characters */
    private static final String BUCKET_WITH_SPECIAL_CHARACTERS = "key-name-special-characters";

    /** The key used in these tests */
    private static final String key = "key";

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    /** The input stream of data */
    private ByteArrayInputStream bais;

    /** The metadata for the object. */
    private ObjectMetadata metadata;

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        S3IntegrationTestBase.setUp();
        tempData = tempDataBuffer(1000);

        try {
            s3.createBucket(bucketName);
            waitForBucketCreation(bucketName);
        } catch (final Exception e) {
            System.out.println("Error in creating the bucket. "
                    + "Please manually create the bucket " + bucketName);
        }
    }

    @AfterClass
    public static void tearDown() throws Exception {
        try {
            deleteBucketAndAllContents(bucketName);
        } catch (final Exception e) {
            System.out.println("Error in deleting the bucket. "
                + "Please manually delete the bucket " + bucketName);
            e.printStackTrace();
        }

        if (file != null) {
            file.delete();
        }
    }

    @Before
    public void setUpBeforeTest() throws Exception {
        bais = new ByteArrayInputStream(tempData);
        metadata = new ObjectMetadata();
        metadata.setContentLength(1000);
        metadata.setRequesterCharged(true);
    }

    @Test
    public void testIsRequesterPays() throws Exception {
        file = S3IntegrationTestBase.getRandomTempFile("foo", 1000L);

        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, bais, metadata);
        putObjectRequest.setRequesterPays(true);

        s3.putObject(putObjectRequest);
        bais.close();
    }

    @Test
    public void testObjectTagging() throws Exception {
        try {
            // Create an object, add two new tags, and upload the object to Amazon S3.
            PutObjectRequest putRequest = new PutObjectRequest(bucketName, key, bais, metadata);
            List<Tag> tags = new ArrayList<Tag>();
            tags.add(new Tag("Tag 1", "This is tag 1"));
            tags.add(new Tag("Tag 2", "This is tag 2"));
            putRequest.setTagging(new ObjectTagging(tags));
            PutObjectResult putResult = s3.putObject(putRequest);

            // Retrieve the object's tags.
            GetObjectTaggingRequest getTaggingRequest = new GetObjectTaggingRequest(bucketName, key);
            GetObjectTaggingResult getTagsResult = s3.getObjectTagging(getTaggingRequest);
            List<Tag> resultTags = getTagsResult.getTagSet();
            assertEquals(tags.size(), resultTags.size());

            // Replace the object's tags with two new tags.
            List<Tag> newTags = new ArrayList<Tag>();
            newTags.add(new Tag("Tag 3", "This is tag 3"));
            newTags.add(new Tag("Tag 4", "This is tag 4"));
            s3.setObjectTagging(new SetObjectTaggingRequest(bucketName, key, new ObjectTagging(newTags)));
            
            // Retrieve the object's tags.
            getTagsResult = s3.getObjectTagging(getTaggingRequest);
            resultTags = getTagsResult.getTagSet();
            assertEquals(newTags.size(), resultTags.size());
        } catch (AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process
            // it, so it returned an error response.
            e.printStackTrace();
            assertTrue("Service exception: " + e.getMessage(), false);
        } catch (AmazonClientException e) {
            // Amazon S3 couldn't be contacted for a response, or the client
            // couldn't parse the response from Amazon S3.
            e.printStackTrace();
            assertTrue("Client exception: " + e.getMessage(), false);
        }
    }

    @Test
    public void testPutObjectWithSpecialCharactersKey() throws Exception {
        String key = "specialkeys *~/:'()![].txt";
        //String expectedKey = "specialkeys %2A~/:'()![].txt";
        // This is not what should be uploaded.
        // String failKey = "specialkeys%20%2A~/%3A%27%28%29%21%5B%5D.txt";
        s3.putObject(bucketName, key, "helloworld->key:colon😀happy]squarebracket.txt");

        ListObjectsV2Result objectListing = s3.listObjectsV2(bucketName);
        assert objectListing.getKeyCount() > 0;
        for (S3ObjectSummary object : objectListing.getObjectSummaries()) {
            System.out.println("Found key: " + object.getKey());
            if (object.getKey().equals(key)) {
                return;
            }
        }
        fail("Should have found key.");
    }

    @Test
    public void testListAndGetObjectWithSpecialCharactersKey() throws Exception {
        final ObjectListing objectListing = s3.listObjects(
                new ListObjectsRequest(bucketName,
                        null, null, null, null)
                        .withEncodingType(Constants.URL_ENCODING));
        for (S3ObjectSummary object : objectListing.getObjectSummaries()) {
            System.out.println("Found key: " + object.getKey());
            // Check if the object exists
            assertTrue(s3.doesObjectExist(bucketName, object.getKey()));
            // Check downloading the object
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, object.getKey());
            S3Object s3Object = s3.getObject(getObjectRequest);
            assert s3Object != null;
            assertEquals(object.getKey(), s3Object.getKey());
            assertNotNull(s3Object.getObjectContent());
        }
    }

    @Test
    public void testListV2AndGetObjectWithSpecialCharactersKey() throws Exception {
        final ListObjectsV2Result listObjectsV2Result = s3.listObjectsV2(
                new ListObjectsV2Request()
                        .withBucketName(bucketName)
                        .withEncodingType(Constants.URL_ENCODING));
        for (S3ObjectSummary object : listObjectsV2Result.getObjectSummaries()) {
            System.out.println("Found key: " + object.getKey());
            // Check if the object exists
            assertTrue(s3.doesObjectExist(bucketName, object.getKey()));
            // Check downloading the object
            GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, object.getKey());
            S3Object s3Object = s3.getObject(getObjectRequest);
            assert s3Object != null;
            assertEquals(object.getKey(), s3Object.getKey());
            assertNotNull(s3Object.getObjectContent());
        }
    }
}
