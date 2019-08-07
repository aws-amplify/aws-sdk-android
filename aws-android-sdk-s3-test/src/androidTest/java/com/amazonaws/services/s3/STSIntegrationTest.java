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

import com.amazonaws.HttpMethod;
import com.amazonaws.auth.STSSessionCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.testutils.util.RandomTempFile;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URL;
import java.util.Date;

/**
 * Tests integraton with STS tokens.
 */
public class STSIntegrationTest extends S3IntegrationTestBase {

    private static final boolean ANDROID_TESTING = false;

    // Override parent s3 to not impact other tests
    private static AmazonS3Client s3;

    /** The bucket created and used by these tests */
    private static final String bucketName = "java-sts-integ-test-" + new Date().getTime();

    /** The key used in these tests */
    private static final String key = "key";

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    @AfterClass
    public static void tearDown() throws Exception {
        try {
            deleteBucketAndAllContents(bucketName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (file != null) {
            file.delete();
        }
    }

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        S3IntegrationTestBase.setUp();

        if (!ANDROID_TESTING) {
            setUpCredentials();
        }

        tempData = tempDataBuffer(1000);

        STSSessionCredentialsProvider provider = new STSSessionCredentialsProvider(credentials);
        s3 = new AmazonS3Client(provider, Region.getRegion(Regions.US_WEST_2));
        s3.createBucket(bucketName);

        ObjectMetadata metadata = null;
        if (!ANDROID_TESTING) {
            file = new RandomTempFile("get-object-integ-test", 1000L);
            s3.putObject(bucketName, key, file);
        } else {
            file = getRandomTempFile("foo", 1000L);
            ByteArrayInputStream bais = new ByteArrayInputStream(tempData);

            metadata = new ObjectMetadata();
            metadata.setContentLength(1000);

            s3.putObject(new PutObjectRequest(bucketName, key, bais, metadata));
            bais.close();
        }

        metadata = s3.getObjectMetadata(bucketName, key);
    }

    /**
     * Tests getting an object from s3 with a session token.
     */
    @Test
    public void testGetObject() {
        S3Object object = s3.getObject(bucketName, key);
        assertFileEqualsStream(file, object.getObjectContent());
    }

    /**
     * Tests generating a presigned URL with a session token.
     */
    @Test
    public void testPresignedUrl() throws Exception {
        URL generatePresignedUrl = s3.generatePresignedUrl(new GeneratePresignedUrlRequest(
                bucketName, key).withMethod(HttpMethod.GET));

        HttpClient client = new DefaultHttpClient();
        HttpUriRequest rq = new HttpGet(generatePresignedUrl.toURI());
        HttpResponse response = client.execute(rq);
        assertFileEqualsStream(file, response.getEntity().getContent());
    }

    /**
     * Tests generating a presigned PUT URL with a session token.
     */
    @Test
    @Ignore("TODO: fix 403 exception")
    public void testPresignedUrlPut() throws Exception {
        String newKey = key + 2;
        URL presignedUrl = s3.generatePresignedUrl(new GeneratePresignedUrlRequest(bucketName,
                newKey)
                .withMethod(HttpMethod.PUT));

        HttpClient client = new DefaultHttpClient();
        HttpPut rq = new HttpPut(presignedUrl.toURI());
        HttpEntity payload = new FileEntity(file, "application/octet-stream");
        rq.setEntity(payload);
        HttpResponse response = client.execute(rq);
        assertEquals(200, response.getStatusLine().getStatusCode());

        assertFileEqualsStream(file, s3.getObject(bucketName, newKey).getObjectContent());
    }
}
