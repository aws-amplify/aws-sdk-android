/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.ClientConfiguration;
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
        final String region = "us-west-2";
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
        final Regions region = Regions.US_WEST_2;
        s3.setRegion(Region.getRegion(region));
        assertEquals(region.getName(), s3.clientRegion);
    }

    @Test
    public void testCreateRequest() {
        final String bucketName = "bucket";
        final String key = "key";
        final File file = new File(key);
        final HttpMethodName method = HttpMethodName.PUT;
        final PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestNonDNS() {
        final String bucketName = "bucket.with.dot";
        final String key = "key";
        final File file = new File(key);
        final HttpMethodName method = HttpMethodName.PUT;
        final PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals("s3.amazonaws.com", request.getEndpoint().getHost());
        assertEquals(String.format("%s/%s", bucketName, key), request.getResourcePath());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestAccelerate() {
        s3.setS3ClientOptions(accelerateOption);
        final String bucketName = "bucket";
        final String key = "key";
        final File file = new File(key);
        final HttpMethodName method = HttpMethodName.PUT;
        final PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3-accelerate.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreateRequestAccelerateUnsupportedMethod() {
        s3.setS3ClientOptions(accelerateOption);
        final String bucketName = "bucket";
        final HttpMethodName method = HttpMethodName.DELETE;
        final DeleteBucketRequest originalRequest = new DeleteBucketRequest(bucketName);
        final Request<?> request = s3.createRequest(bucketName, null, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
    }

    @Test
    public void testCreatePutObjectRequestWithSpecialCharacterKeys() {
        final String bucketName = "bucket";
        final String key = "key%^!@#*()";
        final File file = new File(key);
        final HttpMethodName method = HttpMethodName.PUT;
        final PutObjectRequest originalRequest = new PutObjectRequest(bucketName, key, file);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
        assertTrue(request.getResourcePath().contains(key));
    }

    @Test
    public void testCreateGetObjectRequestWithSpecialCharacterKeys() {
        final String bucketName = "bucket";
        final String key = "key%^!@#*()";
        final HttpMethodName method = HttpMethodName.GET;
        final GetObjectRequest originalRequest = new GetObjectRequest(bucketName, key);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        assertEquals(String.format("%s.s3.amazonaws.com", bucketName),
                request.getEndpoint().getHost());
        assertEquals(method, request.getHttpMethod());
        assertTrue(request.getResourcePath().contains(key));
    }

    @Test
    public void testCreateSigner() {
        s3.setS3ClientOptions(accelerateOption);
        final Regions region = Regions.US_WEST_2;
        s3.setRegion(Region.getRegion(region));
        final String bucketName = "bucket";
        final String key = "key";
        final HttpMethodName method = HttpMethodName.GET;
        final GetObjectRequest originalRequest = new GetObjectRequest(bucketName, key);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        final Signer signer = s3.createSigner(request, bucketName, key);
        assertTrue(signer instanceof AWSS3V4Signer);
        signer.sign(request, creds);
        final String authorization = request.getHeaders().get("Authorization");
        assertNotNull(authorization);
        final String regionName = authorization.split("/")[2];
        assertEquals(region.getName(), regionName);
    }

    @Test
    public void testCreateSignerWithSpecialCharacterKeys() {
        s3.setS3ClientOptions(accelerateOption);
        final Regions region = Regions.US_WEST_2;
        s3.setRegion(Region.getRegion(region));
        final String bucketName = "bucket";
        final String key = "key%^!@#*()";
        final HttpMethodName method = HttpMethodName.GET;
        final GetObjectRequest originalRequest = new GetObjectRequest(bucketName, key);
        final Request<?> request = s3.createRequest(bucketName, key, originalRequest, method);
        final Signer signer = s3.createSigner(request, bucketName, key);
        assertTrue(signer instanceof AWSS3V4Signer);
        signer.sign(request, creds);
        final String authorization = request.getHeaders().get("Authorization");
        assertNotNull(authorization);
        final String regionName = authorization.split("/")[2];
        assertEquals(region.getName(), regionName);
        assertTrue(request.getResourcePath().contains(key));
    }

    @Test
    public void testConstructorWithBasicAwsCredentials() {
        creds = new BasicAWSCredentials("accessKey", "secretKey");
        s3 = new AmazonS3Client(creds);
        assertNotNull(s3);
    }

    @Test
    public void testDefaultConstructor() {
        s3 = new AmazonS3Client();
        assertNotNull(s3);
    }

    @Test
    public void testConstructorWithBasicAwsCredentialsAndClientConfiguration() {
        creds = new BasicAWSCredentials("accessKey", "secretKey");
        s3 = new AmazonS3Client(creds, new ClientConfiguration());
        assertNotNull(s3);
    }

    @Test
    public void testConstructorWithClientConfiguration() {
        s3 = new AmazonS3Client(new ClientConfiguration());
        assertNotNull(s3);
    }

    @Test
    public void testSetNotificationThreshold() {
        s3.setNotificationThreshold(8 * 1024);
    }
}

