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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingRequest;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.SetObjectTaggingRequest;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.util.IOUtils;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Integration tests for AmazonS3Client -> ObjectMetadata.
 */
public class AmazonS3ClientIntegrationTest extends S3IntegrationTestBase {

    /** The bucket created and used by these tests */
    private static final String BUCKET_NAME = "android-sdk-s3-client-integ-test-" + System.currentTimeMillis();

    /** The key used in these tests */
    private static final String KEY = "key";

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    /** The input stream of data */
    private ByteArrayInputStream bais;

    /** The metadata for the object. */
    private ObjectMetadata metadata;

    /** KMS KeyId. */
    private static String kmsKeyId;

    /** Bucket with SSE - KMS enabled. */
    private static String bucketWithSSEKMSEnabled;

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        S3IntegrationTestBase.setUp();
        tempData = tempDataBuffer(1000);
        bucketWithSSEKMSEnabled = getPackageConfigure("s3")
                .getString("bucket_with_sse_kms_enabled");
        kmsKeyId = getPackageConfigure("s3")
                .getString("sse_kms_key_id");
        s3.createBucket(BUCKET_NAME);
        waitForBucketCreation(BUCKET_NAME);
    }

    /**
     * Tear down resources created for these tests.
     */
    @AfterClass
    public static void tearDown() {
        deleteBucketAndAllContents(BUCKET_NAME);

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

        PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKET_NAME, KEY, bais, metadata);
        putObjectRequest.setRequesterPays(true);

        s3.putObject(putObjectRequest);
        bais.close();
    }

    @Test
    public void testObjectTagging() throws Exception {
        try {
            // Create an object, add two new tags, and upload the object to Amazon S3.
            PutObjectRequest putRequest = new PutObjectRequest(BUCKET_NAME, KEY, bais, metadata);
            List<Tag> tags = new ArrayList<Tag>();
            tags.add(new Tag("Tag 1", "This is tag 1"));
            tags.add(new Tag("Tag 2", "This is tag 2"));
            putRequest.setTagging(new ObjectTagging(tags));
            PutObjectResult putResult = s3.putObject(putRequest);

            // Retrieve the object's tags.
            GetObjectTaggingRequest getTaggingRequest = new GetObjectTaggingRequest(BUCKET_NAME, KEY);
            GetObjectTaggingResult getTagsResult = s3.getObjectTagging(getTaggingRequest);
            List<Tag> resultTags = getTagsResult.getTagSet();
            assertEquals(tags.size(), resultTags.size());

            // Replace the object's tags with two new tags.
            List<Tag> newTags = new ArrayList<Tag>();
            newTags.add(new Tag("Tag 3", "This is tag 3"));
            newTags.add(new Tag("Tag 4", "This is tag 4"));
            s3.setObjectTagging(new SetObjectTaggingRequest(BUCKET_NAME, KEY, new ObjectTagging(newTags)));
            
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
        s3.putObject(BUCKET_NAME, key, "helloworld->key:colon😀happy]squarebracket.txt");

        ListObjectsV2Result objectListing = s3.listObjectsV2(BUCKET_NAME);
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
                new ListObjectsRequest(BUCKET_NAME,
                        null, null, null, null)
                        .withEncodingType(Constants.URL_ENCODING));
        for (S3ObjectSummary object : objectListing.getObjectSummaries()) {
            System.out.println("Found key: " + object.getKey());
            // Check if the object exists
            assertTrue(s3.doesObjectExist(BUCKET_NAME, object.getKey()));
            // Check downloading the object
            GetObjectRequest getObjectRequest = new GetObjectRequest(BUCKET_NAME, object.getKey());
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
                        .withBucketName(BUCKET_NAME)
                        .withEncodingType(Constants.URL_ENCODING));
        for (S3ObjectSummary object : listObjectsV2Result.getObjectSummaries()) {
            System.out.println("Found key: " + object.getKey());
            // Check if the object exists
            assertTrue(s3.doesObjectExist(BUCKET_NAME, object.getKey()));
            // Check downloading the object
            GetObjectRequest getObjectRequest = new GetObjectRequest(BUCKET_NAME, object.getKey());
            S3Object s3Object = s3.getObject(getObjectRequest);
            assert s3Object != null;
            assertEquals(object.getKey(), s3Object.getKey());
            assertNotNull(s3Object.getObjectContent());
        }
    }

    @Test
    public void testUploadWithSSEKMSEnabled() throws Exception {
        String dataString = "test";
        byte[] dataBytes = dataString.getBytes(StandardCharsets.UTF_8);

        ObjectMetadata metaData = new ObjectMetadata();
        metaData.setContentType("text/plain");
        metaData.setContentEncoding(StandardCharsets.UTF_8.name());
        metaData.setContentLength(dataBytes.length);

        AmazonS3Client amazonS3Client = new AmazonS3Client(credentials,
                Region.getRegion(Regions.US_EAST_1));
        PutObjectRequest putObjectRequest = new PutObjectRequest(
                bucketWithSSEKMSEnabled,
                "test",
                new ByteArrayInputStream(dataBytes),
                metaData)
                .withSSEAwsKeyManagementParams(
                        new SSEAwsKeyManagementParams(kmsKeyId));
        PutObjectResult putObjectResult = amazonS3Client.putObject(putObjectRequest);
        assertNotNull(putObjectResult);
        assertNull(putObjectResult.getContentMd5());

        S3Object object = amazonS3Client.getObject(bucketWithSSEKMSEnabled, "test");
        String returnedContent = IOUtils.toString(object.getObjectContent());
        assertEquals(returnedContent, dataString);

        amazonS3Client.deleteObject(bucketWithSSEKMSEnabled, "test");
    }
}
