/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.DeleteBucketRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class Amazons3ClientTest {
    private AmazonS3Client s3;
    private AWSCredentials creds;
    private S3ClientOptions accelerateOption;

    @Before
    public void setup() {
        creds = new BasicAWSCredentials("accessKey", "secretKey");
        s3 = new AmazonS3Client(creds);
        accelerateOption = S3ClientOptions.builder().setAccelerateModeEnabled(true).build();
    }

    @Test
    public void testSetEndpoint() {
        String region = "us-west-2";
        s3.setEndpoint(String.format("s3-%s.amazonaws.com", region));
        assertEquals(region, s3.clientRegion);
        s3.setEndpoint(String.format("s3.%s.amazonaws.com", region));
        assertEquals(region, s3.clientRegion);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetEndpointAccelerate() {
        s3.setEndpoint(Constants.S3_ACCELERATE_HOSTNAME);
    }

    @Test
    public void testSetRegion() {
        Regions region = Regions.US_WEST_2;
        s3.setRegion(Region.getRegion(region));
        assertEquals(region.getName(), s3.clientRegion);
    }

    @Test
    public void testCreateRequest() {
        String bucketName = "bucket";
        String key = "key";
        File file = new File(key);
        HttpMethodName method = HttpMethodName.PUT;
        PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestNonDNS() {
        String bucketName = "bucket.with.dot";
        String key = "key";
        File file = new File(key);
        HttpMethodName method = HttpMethodName.PUT;
        PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals("s3.amazonaws.com", request.getEndpoint().getHost());
        assertEquals(String.format("%s/%s", bucketName, key), request.getResourcePath());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestAccelerate() {
        s3.setS3ClientOptions(accelerateOption);
        String bucketName = "bucket";
        String key = "key";
        File file = new File(key);
        HttpMethodName method = HttpMethodName.PUT;
        PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3-accelerate.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestAccelerateNonDNS() {
        s3.setS3ClientOptions(accelerateOption);
        String bucketName = "bucket.with.dot";
        String key = "key";
        File file = new File(key);
        HttpMethodName method = HttpMethodName.PUT;
        PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        // Fall back to standard non accelerate endpoint
        assertEquals("s3.amazonaws.com", request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestAccelerateUnsupportedMethod() {
        s3.setS3ClientOptions(accelerateOption);
        String bucketName = "bucket";
        HttpMethodName method = HttpMethodName.DELETE;
        DeleteBucketRequest originalRequest = new DeleteBucketRequest(bucketName);
        Request<?> request = s3.createRequest(bucketName, null, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateSigner() {
        s3.setS3ClientOptions(accelerateOption);
        Regions region = Regions.US_WEST_2;
        s3.setRegion(Region.getRegion(region));
        String bucketName = "bucket";
        String key = "key";
        HttpMethodName method = HttpMethodName.GET;
        GetObjectRequest originalRequest = new GetObjectRequest(bucketName, key);
        Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        Signer signer = s3.createSigner(request, bucketName, key);
        assertTrue(signer instanceof AWSS3V4Signer);
        signer.sign(request, creds);
        String authorization = request.getHeaders().get("Authorization");
        assertNotNull(authorization);
        String regionName = authorization.split("/")[2];
        assertEquals(region.getName(), regionName);
    }
}
