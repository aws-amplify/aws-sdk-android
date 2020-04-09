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
package com.amazonaws.services.s3.model;

import com.amazonaws.HttpMethod;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.testutils.AWSTestBase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Integration test for testing the GeneratePreSignedURLRequest class
 *
 */
public class GeneratePresignedUrlRequestIntegrationTest extends AWSTestBase {

	private static AmazonS3 s3Client;
	
	private static final String BUCKET_NAME = "android-sdk-s3-low-level-presigned-url-" + System.currentTimeMillis();
	
	private static final long MILLISECONDS_IN_SECONDS = 1000;
	
	private static final long FAILED_RESPONSE = -1;
	
	private String key;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    setUpCredentials();			
	    s3Client = new AmazonS3Client(credentials, Region.getRegion(Regions.US_WEST_2));
	    s3Client.createBucket(BUCKET_NAME);
		
	    int poll = 0;
            while (!s3Client.doesBucketExist(BUCKET_NAME) && poll++ < 60) {
                Thread.sleep(1000);
            }
            if (poll >= 60 * 5) {
        	throw new RuntimeException("Max poll time exceeded");
            }
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() {
	    CryptoTestUtils.deleteBucketAndAllContents(s3Client, BUCKET_NAME);
	    s3Client = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	    this.key = "presigned-url-key-" + + System.currentTimeMillis();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link com.amazonaws.services.s3.model.GeneratePresignedUrlRequest#GeneratePresignedUrlRequest(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testGeneratePresignedUrlRequest_String_String() {
		final GeneratePresignedUrlRequest generatePresignedUrlRequest
		    = new GeneratePresignedUrlRequest(BUCKET_NAME, this.key);
		assertNotNull("GeneratePresignedUrlRequest creation failed", generatePresignedUrlRequest);
		assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.GET);
	}

	/**
	 * Test method for {@link com.amazonaws.services.s3.model.GeneratePresignedUrlRequest#GeneratePresignedUrlRequest(java.lang.String, java.lang.String, com.amazonaws.HttpMethod)}.
	 */
	@Test
	public final void testGeneratePresignedUrlRequest_String_String_HttpMethod() {
	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
	        = new GeneratePresignedUrlRequest(BUCKET_NAME, this.key, HttpMethod.PUT);
	    assertNotNull("GeneratePresignedUrlRequest creation failed", generatePresignedUrlRequest);
	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.PUT);
	}
	
	@Test
	public final void testGeneratePresignedUrl_uploadObject() {
	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
	      = new GeneratePresignedUrlRequest(BUCKET_NAME, this.key);
	    assertNotNull("GeneratePresignedUrlRequest creation failed", generatePresignedUrlRequest);
	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.GET);
	
	    final URL url = s3Client.generatePresignedUrl(generatePresignedUrlRequest);
	    assertNotNull("generatePresignedUrl returned a null url", url);
	}
	
	@Test
	public final void testGeneratePresignedUrlRequest_Put_Expiration_5() {
	    System.out.println("HttpMethod.PUT with 5 seconds expiration");
	    generateAndOperateWithPresignedUrl(HttpMethod.PUT, 5);
	}
	
	@Test
	public final void testGeneratePresignedUrlRequest_Get_Expiration_5() {
	    System.out.println("HttpMethod.GET with 5 seconds expiration");
	    generateAndOperateWithPresignedUrl(HttpMethod.GET, 5);
	}
	
	@Test
	public final void testGeneratePresignedUrlRequest_Put_Expiration_10() {
	    System.out.println("HttpMethod.PUT with 5 seconds expiration");
	    generateAndOperateWithPresignedUrl(HttpMethod.PUT, 10);
	}
	
	@Test
	public final void testGeneratePresignedUrlRequest_Get_Expiration_10() {
	    System.out.println("HttpMethod.PUT with 5 seconds expiration");
	    generateAndOperateWithPresignedUrl(HttpMethod.GET, 10);
	}
	
	@Test
	public final void testGeneratePresignedUrlRequest_QueryParameters() {
	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
	      = new GeneratePresignedUrlRequest(BUCKET_NAME, this.key);
	    assertNotNull("GeneratePresignedUrlRequest creation failed", generatePresignedUrlRequest);
	    assertEquals(generatePresignedUrlRequest.getMethod(), HttpMethod.GET);
	    
	    generatePresignedUrlRequest.addCustomQueryParameter(Headers.STORAGE_CLASS, StorageClass.StandardInfrequentAccess.toString());
	    generatePresignedUrlRequest.addCustomQueryParameter(Headers.S3_VERSION_ID, "versionid");
	    generatePresignedUrlRequest.addCustomQueryParameter("k1", "v1");
	    assert(generatePresignedUrlRequest.getCustomQueryParameters().size() == 3);
	    
	    final URL url = s3Client.generatePresignedUrl(generatePresignedUrlRequest);
	    System.out.println(url.toString());
		assertNotNull("generatePresignedUrl retruned a null url", url);
	}
	
	// Test Helper methods go here.
	/**
	 * Get Date object representing the expiration time
	 * in milliseconds. 
	 */
	private Date getExpiration(final long timeInSeconds) {
		Date expiration = new Date();
	    long msec = expiration.getTime();
	    msec += MILLISECONDS_IN_SECONDS * timeInSeconds;
	    expiration.setTime(msec);
	    return expiration;
	}
	
	private void generateAndOperateWithPresignedUrl(final HttpMethod method,
			                                        final long expirationInSeconds) {
	    final GeneratePresignedUrlRequest generatePresignedUrlRequest
	      = new GeneratePresignedUrlRequest(BUCKET_NAME, this.key)
	          .withMethod(method)
	          .withExpiration(getExpiration(expirationInSeconds));
		
	    assertNotNull("GeneratePresignedUrlRequest creation failed", generatePresignedUrlRequest);
	    assertEquals(generatePresignedUrlRequest.getMethod(), method);
	    assertEquals(generatePresignedUrlRequest.getBucketName(), BUCKET_NAME);
	    assertEquals(generatePresignedUrlRequest.getKey(), this.key);
	    
	    final URL url = s3Client.generatePresignedUrl(generatePresignedUrlRequest);	    
		assertNotNull("generatePresignedUrl retruned a null url", url);
		
	    if (method == HttpMethod.PUT) {
		uploadObjectUsingPresignedUrl(url, expirationInSeconds);
	    } else if (method == HttpMethod.GET) {
		downloadObjectUsingPresignedUrl(url, expirationInSeconds);
	    }
	}
	
	private void uploadObjectUsingPresignedUrl(final URL url,
			                                   final long expirationInSeconds) {
		System.out.println("PreSigned URL is: " + url.toString());
		assert(putObjectUsingUrl(url) == 200);
		
		try {
			Thread.sleep(MILLISECONDS_IN_SECONDS * expirationInSeconds);
		} catch (final Exception exception) {
			System.out.println("Sleep is interrupted. " + exception.getMessage());
		}
		
		assert(putObjectUsingUrl(url) == 403);
	}
	
	private long putObjectUsingUrl(final URL url) {
		try {
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.setDoOutput(true);
		    connection.setRequestMethod("PUT");
		
		    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
		    out.write("This text is uploaded to an object in Amazon S3.");
		    out.close();
		
		    final int responseCode = connection.getResponseCode();
		    System.out.println("Service returned response code " + responseCode);
		    return responseCode;
		} catch (final Exception exception) {
			return FAILED_RESPONSE;
		}
	}
	
	private void downloadObjectUsingPresignedUrl(final URL url,
			                                     final long expirationInSeconds) {
		System.out.println("PreSigned URL is: " + url.toString());
		assert(getObjectUsingUrl(url) == 200);
		
		try {
			Thread.sleep(MILLISECONDS_IN_SECONDS * expirationInSeconds);
		} catch (final Exception exception) {
			System.out.println("Sleep is interrupted. " + exception.getMessage());
		}
		
		assert(getObjectUsingUrl(url) == 403);
	}
	
	private long getObjectUsingUrl(final URL url) {
		StringBuffer objectContent = new StringBuffer();
	    	String input;
	    	final BufferedReader br;
	    	
		try {
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		    connection.setDoOutput(true);
		    connection.setRequestMethod("GET");
		
		    br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		    	while ((input = br.readLine()) != null){
		    	   objectContent.append(input);
		    	}
		    	br.close();
		    
		    	final int responseCode = connection.getResponseCode();
		    System.out.println("Service returned response code " + responseCode);
		    return responseCode;
		} catch (final Exception exception) {
			return FAILED_RESPONSE;
		}
	}
}
