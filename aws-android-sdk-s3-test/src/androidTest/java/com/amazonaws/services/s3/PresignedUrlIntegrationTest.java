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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.HttpMethod;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.STSSessionCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.internal.MD5DigestCalculatingInputStream;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.util.SpecialObjectKeyNameGenerator;
import com.amazonaws.util.BinaryUtils;

import org.apache.commons.io.IOUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * Integration tests for pre-signing S3 URLs.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
@Ignore("TODO: fix this test")
public class PresignedUrlIntegrationTest extends S3IntegrationTestBase {

    /** The buckets created and used by this test */
    private static String virtHostBucketName = null;
    private static String pathStyleBucketName = null;

    /** The file of random data uploaded to S3 by this test */
    private static File file;
    private static String contentMd5;

    private static final String S3_REGIONAL_ENDPOINT = "s3-us-west-2.amazonaws.com";

    @AfterClass
    public static void tearDown() throws Exception {
        deleteBucketAndAllContents(virtHostBucketName);
        deleteBucketAndAllContents(pathStyleBucketName);
        file.delete();
    }

    @BeforeClass
    public static void setUp() throws Exception {
        S3IntegrationTestBase.setUp();

        s3.setEndpoint(S3_REGIONAL_ENDPOINT);

        virtHostBucketName = "java-presigned-url-virt-host-integ-test-" + new Date().getTime();
        pathStyleBucketName = "java-presigned-url-path-style-integ-test-" + new Date().getTime();

        s3.createBucket(virtHostBucketName);
        s3.createBucket(pathStyleBucketName);

        file = getRandomTempFile("presigned-url-integ-test", 1234L);
        MD5DigestCalculatingInputStream md5Stream = new MD5DigestCalculatingInputStream(
                new FileInputStream(file));
        while (md5Stream.read() != -1) {
        }
        contentMd5 = BinaryUtils.toBase64(md5Stream.getMd5Digest());
    }

    /**
     * Runs all the tests on special key names.
     */
    @Test
    public void testSpecialKeys() throws Exception {
        List<String> keys = SpecialObjectKeyNameGenerator.initAllSpecialKeyNames();

        s3.setS3ClientOptions(new S3ClientOptions().withPathStyleAccess(false));
        for (String key : keys) {
            s3.putObject(virtHostBucketName, key, file);
            testGetUrl(s3, virtHostBucketName, key);
            testGetUrlWithContentType(virtHostBucketName, key);
            testGetUrlWithContentMd5(virtHostBucketName, key);
            testGetUrlWithExtraParameters(virtHostBucketName, key);
            testGetUrlWithResponseHeaders(virtHostBucketName, key);
            testHeadUrl(virtHostBucketName, key);
            testPutUrl(virtHostBucketName, key);
            testPutUrlWithContentType(virtHostBucketName, key);
            testPutUrlWithContentMd5(virtHostBucketName, key);
        }

        s3.setS3ClientOptions(new S3ClientOptions().withPathStyleAccess(true));
        for (String key : keys) {
            s3.putObject(pathStyleBucketName, key, file);
            testGetUrl(s3, pathStyleBucketName, key);
            testGetUrlWithContentType(pathStyleBucketName, key);
            testGetUrlWithContentMd5(pathStyleBucketName, key);
            testGetUrlWithExtraParameters(pathStyleBucketName, key);
            testGetUrlWithResponseHeaders(pathStyleBucketName, key);
            testHeadUrl(pathStyleBucketName, key);
            testPutUrl(pathStyleBucketName, key);
            testPutUrlWithContentType(pathStyleBucketName, key);
            testPutUrlWithContentMd5(pathStyleBucketName, key);
        }
    }

    @Test
    public void testSigV4ExpirationLimit() {
        final Date sevenDaysAndOneMinLater = new Date(new Date().getTime() + 1000 * 60
                * (60 * 24 * 7 + 1));
        final GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(
                virtHostBucketName, "key");
        request.setExpiration(sevenDaysAndOneMinLater);

        // SigV4
        try {
            cnS3.generatePresignedUrl(request);
            fail("AmazonClientException is expected since the expiration exceeds the 7 day limit.");
        } catch (AmazonClientException expected) {
        } catch (Exception e) {
            fail("AmazonClientException is expected since the expiration exceeds the 7 day limit.");
        }

        // SigV2 should still work fine
        s3.generatePresignedUrl(request);
    }

    /**
     * Tests a simple pre-signed GET URL, using the specified s3 client.
     */
    private void testGetUrl(AmazonS3Client s3, String bucketName, String key) throws Exception {
        // Test the older (more streamlined) method for creating a pre-signed
        // GET URL
        URL presignedUrl = s3.generatePresignedUrl(
                bucketName, key, new Date(new Date().getTime() + 1000 * 60 * 60));
        System.out.println(presignedUrl.toExternalForm());
        assertFileEqualsStream(file, presignedUrl.openStream());

        // And also test the new request oriented method
        HttpURLConnection connection = connectToPresignedUrl(
                s3, new GeneratePresignedUrlRequest(bucketName, key));
        assertEquals(200, connection.getResponseCode());
        assertFileEqualsStream(file, connection.getInputStream());
    }

    /**
     * Tests a simple pre-signed GET URL with content type header.
     */
    private void testGetUrlWithContentType(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key);
        request.setContentType("model/vrm");

        HttpURLConnection connection = connectToPresignedUrlWithHeaders(request);
        assertEquals(200, connection.getResponseCode());
        assertFileEqualsStream(file, connection.getInputStream());
    }

    /**
     * Tests a simple pre-signed GET URL with content MD5 header.
     */
    private void testGetUrlWithContentMd5(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key);
        request.setContentMd5(contentMd5);

        HttpURLConnection connection = connectToPresignedUrlWithHeaders(request);
        assertEquals(200, connection.getResponseCode());
        assertFileEqualsStream(file, connection.getInputStream());
    }

    /**
     * Tests a simple pre-signed HEAD URL.
     */
    private void testHeadUrl(String bucketName, String key) throws Exception {
        HttpURLConnection connection = connectToPresignedUrl(
                s3, new GeneratePresignedUrlRequest(bucketName, key, HttpMethod.HEAD));

        assertNotNull(connection.getHeaderField(Headers.REQUEST_ID));
        assertNotNull(connection.getHeaderField(Headers.ETAG));
        byte[] content = IOUtils.toByteArray(connection.getInputStream());
        assertEquals(0, content.length);
        assertEquals(200, connection.getResponseCode());
    }

    /**
     * Tests a simple pre-signed PUT URL.
     */
    private void testPutUrl(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                HttpMethod.PUT);
        HttpURLConnection connection = connectToPresignedUrl(s3, request);

        IOUtils.copy(new FileInputStream(file), connection.getOutputStream());

        if (androidRootDir == null) {
            assertEquals(200, connection.getResponseCode());
            byte[] content = IOUtils.toByteArray(connection.getInputStream());
            assertEquals(0, content.length);
        }

        assertEquals(IOUtils.toString(new FileInputStream(file)),
                IOUtils.toString(s3.getObject(bucketName, key).getObjectContent()));
    }

    /**
     * Tests a simple pre-signed PUT URL with content type header.
     */
    private void testPutUrlWithContentType(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                HttpMethod.PUT);
        request.setContentType("model/vrm");
        HttpURLConnection connection = connectToPresignedUrlWithHeaders(request);

        IOUtils.copy(new FileInputStream(file), connection.getOutputStream());

        if (androidRootDir == null) {
            assertEquals(200, connection.getResponseCode());
            byte[] content = IOUtils.toByteArray(connection.getInputStream());
            assertEquals(0, content.length);
        }

        assertEquals(IOUtils.toString(new FileInputStream(file)),
                IOUtils.toString(s3.getObject(bucketName, key).getObjectContent()));
    }

    /**
     * Tests a simple pre-signed PUT URL with content MD5 header.
     */
    private void testPutUrlWithContentMd5(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                HttpMethod.PUT);
        request.setContentMd5(contentMd5);
        HttpURLConnection connection = connectToPresignedUrlWithHeaders(request);

        IOUtils.copy(new FileInputStream(file), connection.getOutputStream());

        if (androidRootDir == null) {
            System.out.println(connection.getResponseMessage());
            assertEquals(200, connection.getResponseCode());
            byte[] content = IOUtils.toByteArray(connection.getInputStream());
            assertEquals(0, content.length);
        }

        assertEquals(IOUtils.toString(new FileInputStream(file)),
                IOUtils.toString(s3.getObject(bucketName, key).getObjectContent()));
    }

    /**
     * Tests a pre-signed GET URL which includes additional request parameters.
     */
    private void testGetUrlWithExtraParameters(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                HttpMethod.GET);
        request.addRequestParameter("torrent", null);

        HttpURLConnection connection = connectToPresignedUrl(s3, request);
        assertEquals(200, connection.getResponseCode());
        assertEquals("application/x-bittorrent", connection.getHeaderField("Content-Type"));
    }

    /**
     * Tests a pre-signed GET URL which includes response headers
     */
    private void testGetUrlWithResponseHeaders(String bucketName, String key) throws Exception {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, key,
                HttpMethod.GET)
                .withResponseHeaders(new ResponseHeaderOverrides().withContentType("OVERRIDE"));

        HttpURLConnection connection = connectToPresignedUrl(s3, request);
        assertEquals(200, connection.getResponseCode());
        assertEquals("OVERRIDE", connection.getHeaderField("Content-Type"));

        request = new GeneratePresignedUrlRequest(bucketName, key, HttpMethod.GET)
                .withResponseHeaders(new ResponseHeaderOverrides().withContentType("OVERRIDE")
                        .withContentDisposition("OVERRIDE"));

        connection = connectToPresignedUrl(s3, request);
        assertEquals(200, connection.getResponseCode());
        assertEquals("OVERRIDE", connection.getHeaderField("Content-Type"));
        assertEquals("OVERRIDE", connection.getHeaderField("Content-Disposition"));
    }

    /**
     * Tests a simple pre-signed DELETE URL.
     */
    @Test
    public void testDeleteUrl() throws Exception {

        File file = getRandomTempFile("presigned-url-delete-test", 1234L);
        s3.putObject(virtHostBucketName, "key-delete-test", file);

        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(virtHostBucketName,
                "key-delete-test", HttpMethod.DELETE);
        HttpURLConnection connection = connectToPresignedUrl(s3, request);

        assertEquals(204, connection.getResponseCode());
        byte[] content = IOUtils.toByteArray(connection.getInputStream());
        assertEquals(0, content.length);
        file.delete();
    }

    /**
     * Tests that it generates the correct presigned URL using session token
     * credentials.
     */
    @Test
    public void testPresignUrlWithSessionTokenCredential() throws Exception {
        final String key = "presign-url-sts-test";

        STSSessionCredentialsProvider provider = new STSSessionCredentialsProvider(credentials);
        AmazonS3Client s3WithSts = new AmazonS3Client(provider,
                Region.getRegion(Regions.US_WEST_2));
        s3WithSts.setEndpoint(S3_REGIONAL_ENDPOINT);
        s3WithSts.putObject(virtHostBucketName, key, file);

        testGetUrl(s3WithSts, virtHostBucketName, key);
    }

    /*
     * Helper Methods
     */

    private HttpURLConnection connectToPresignedUrl(AmazonS3Client s3,
            GeneratePresignedUrlRequest request) throws Exception {
        URL url = s3.generatePresignedUrl(request);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(request.getMethod().toString());
        connection.setDoOutput(true);
        connection.connect();

        return connection;
    }

    private HttpURLConnection connectToPresignedUrlWithHeaders(GeneratePresignedUrlRequest request)
            throws Exception {
        URL url = s3.generatePresignedUrl(request);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        if (request.getContentType() != null) {
            connection.setRequestProperty(Headers.CONTENT_TYPE, request.getContentType());
        }
        if (request.getContentMd5() != null) {
            connection.setRequestProperty(Headers.CONTENT_MD5, request.getContentMd5());
        }
        connection.setRequestMethod(request.getMethod().toString());
        connection.setDoOutput(true);
        connection.connect();

        return connection;
    }

}
