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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.PropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.testutils.util.RandomTempFile;
import com.amazonaws.util.StringUtils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Integration tests for the advanced options to the getObject operations (i.e.
 * ranges and constraints).
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 */
public class GetObjectIntegrationTest extends S3IntegrationTestBase {

    // private static final Random RANDOM = new Random();
    private static final boolean ANDROID_TESTING = false;

    /** The bucket created and used by these tests */
    private static final String bucketName = "java-get-object-integ-test-" + new Date().getTime();

    /** The key used in these tests */
    private static final String key = "key";

    /** A date earlier than the uploaded object's last modified date */
    private static Date earlierDate;

    /** A date after the uploaded object's last modified date */
    private static Date laterDate;

    /** The ETag of the uploaded object being retrieved */
    private static String etag;

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    private static final long sleepTimeInMillis = 3000;

    /**
     * The name of the Amazon S3 bucket used for testing requester pays options.
     */
    private static final String requesterPaysBucketName = "java-requester-pays-test-"
            + System.currentTimeMillis();

    /** Additional Credentials file path used for Requester Pays testing */
    private static final String requesterPaysCredentialsFilePath = System.getProperty("user.home")
            + "/.aws/requsterPaysTestAccount.properties";

    @AfterClass
    public static void tearDown() throws Exception {
        try {
            deleteBucketAndAllContents(bucketName);
        } catch (Exception ex) {
            ex.printStackTrace();
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

        final long fileSize = 100000L;
        tempData = tempDataBuffer((int) fileSize);
        s3.createBucket(bucketName);
        s3.createBucket(requesterPaysBucketName);

        ObjectMetadata metadata = null;
        if (!ANDROID_TESTING) {
            file = new RandomTempFile("get-object-integ-test", fileSize);
            s3.putObject(bucketName, key, file);
            s3.putObject(requesterPaysBucketName, key, file);
        } else {
            file = getRandomTempFile("foo", fileSize);
            final ByteArrayInputStream bais = new ByteArrayInputStream(tempData);

            metadata = new ObjectMetadata();
            metadata.setContentLength(fileSize);

            s3.putObject(new PutObjectRequest(bucketName, key, bais, metadata));
            bais.close();
        }

        metadata = s3.getObjectMetadata(bucketName, key);
        etag = metadata.getETag();

        final Date lastModified = metadata.getLastModified();
        earlierDate = new Date(lastModified.getTime() - 1000);
        laterDate = new Date(lastModified.getTime() + 1000);

        // Sleep for a few seconds to make sure the test doesn't run before
        // the future date
        Thread.sleep(1000 * 2);
    }

    /**
     * This test creates an S3 Object, reads the object's content and then calls
     * the close method multiple times.
     */
    @Test
    public void testCloseS3Object() {

        final S3Object object = s3.getObject(bucketName, key);

        try {
            drainStream(object.getObjectContent());
            object.close();
            object.close();
        } catch (final IOException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Tests that the range argument to getObject is correctly sent in the
     * request when present and correctly returns a range of data.
     */
    @Test
    public void testRange() throws Exception {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withRange(50, 100));

        assertEquals(51L, drainStream(object.getObjectContent()));
    }

    /**
     * Tests that the non-matching ETag constraint is correctly sent when it is
     * specified in a request.
     */
    @Test
    public void testNonMatchingETagConstraint() {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withNonmatchingETagConstraint("non-matching-etag")
                .withNonmatchingETagConstraint("another-non-matching-etag"));

        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }

        assertNull(s3.getObject(new GetObjectRequest(bucketName, key)
                .withNonmatchingETagConstraint(etag)));
    }

    /**
     * Tests setting response headers.
     */
    @Test
    public void testResponseHeaders() {
        final String override = "OVERRIDE";

        S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withCacheControl(override)));

        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override, object.getObjectMetadata().getCacheControl());

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withContentDisposition(override)));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override, object.getObjectMetadata().getContentDisposition());

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withContentEncoding(override)));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override, object.getObjectMetadata().getContentEncoding());

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withContentLanguage(override)));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override,
                object.getObjectMetadata().getRawMetadata().get("Content-Language"));

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withContentType(override)));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override, object.getObjectMetadata().getContentType());

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withExpires("Sat, 01 Jan 2000 00:00:00 GMT")));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(new Date(946684800000L), object.getObjectMetadata().getHttpExpiresDate());

        object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withResponseHeaders(new ResponseHeaderOverrides()
                        .withCacheControl(override).withContentDisposition(override)
                        .withContentEncoding(override)
                        .withContentLanguage(override).withContentType(override)
                        .withExpires("Sat, 01 Jan 2000 00:00:00 GMT")));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertEquals(override, object.getObjectMetadata().getCacheControl());
        assertEquals(override, object.getObjectMetadata().getContentDisposition());
        assertEquals(override, object.getObjectMetadata().getContentEncoding());
        assertEquals(override, object.getObjectMetadata().getRawMetadata().get("Content-Language"));
        assertEquals(override, object.getObjectMetadata().getContentType());
        assertEquals(new Date(946684800000L), object.getObjectMetadata().getHttpExpiresDate());
    }

    /**
     * Tests that the matching ETag constraint is correctly sent when it is
     * specified in a request.
     */
    @Test
    public void testMatchingETagConstraint() {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withMatchingETagConstraint(etag)
                .withMatchingETagConstraint("one-that-doesn't-match"));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertNull(object.getObjectMetadata().getVersionId());

        assertNull(s3.getObject(new GetObjectRequest(bucketName, key)
                .withMatchingETagConstraint("another-non-matching-etag")));
    }

    /**
     * Tests that the modified since constraint is correctly sent when it is
     * specified in a request.
     */
    @Test
    public void testModifiedSinceConstraint() {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withModifiedSinceConstraint(earlierDate));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertNull(object.getObjectMetadata().getVersionId());

        assertNull(s3.getObject(new GetObjectRequest(bucketName, key)
                .withModifiedSinceConstraint(laterDate)));
    }

    /**
     * Tests that the unmodified since constraint is correctly sent when it is
     * specified in a request.
     */
    @Test
    public void testUnmodifiedSinceConstraint() {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key)
                .withUnmodifiedSinceConstraint(laterDate));
        if (androidRootDir == null) {
            assertFileEqualsStream(file, object.getObjectContent());
        }
        else {
            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    object.getObjectContent());
        }
        assertNull(object.getObjectMetadata().getVersionId());

        assertNull(s3.getObject(new GetObjectRequest(bucketName, key)
                .withUnmodifiedSinceConstraint(earlierDate)));
    }

    /**
     * Tests that we can download an Amazon S3 object directly to a file.
     */
    @Test
    public void testGetObjectAsFile() throws Exception {
        if (androidRootDir == null) {
            final File tempFile = File.createTempFile("aws-java-sdk-integ-test", ".dat");
            final ObjectMetadata objectMetadata = s3.getObject(new GetObjectRequest(bucketName, key),
                    tempFile);
            assertNotNull(objectMetadata.getLastModified());
            assertNotNull(objectMetadata.getContentType());

            assertTrue(tempFile.exists());
            assertFileEqualsStream(tempFile, new FileInputStream(file));
        } else {
            final S3Object objectData = s3.getObject(new GetObjectRequest(bucketName, key));
            final ObjectMetadata objectMetadata = objectData.getObjectMetadata();
            assertNotNull(objectMetadata.getLastModified());

            assertStringEqualsStream(new String(tempData, StringUtils.UTF8),
                    objectData.getObjectContent());
        }
    }

    /**
     * Tests that we can download a directory-keyed object to a file.
     */
    @Test
    public void testGetDirectoryObjectAsFile() throws Exception {
        final File data = new RandomTempFile("get-object-integ-test-directory", 1000L);

        final String directoryKey = "a/b/c/d.dat";
        s3.putObject(bucketName, directoryKey, data);

        final File tempFile = File.createTempFile("aws-java-sdk-integ-test", ".dat");
        final ObjectMetadata objectMetadata = s3.getObject(
                new GetObjectRequest(bucketName, directoryKey), tempFile);
        assertNull(objectMetadata.getSSEAlgorithm());
        assertNotNull(objectMetadata.getLastModified());
        assertNotNull(objectMetadata.getContentType());

        assertTrue(tempFile.exists());
        assertFileEqualsStream(tempFile, new FileInputStream(data));
    }

    @Test
    public void testServerSideEncryption() {
        final String sseKey = "sseKey";
        final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, sseKey, file)
                .withMetadata(new ObjectMetadata());
        putObjectRequest.getMetadata().setSSEAlgorithm(
                ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION);
        final PutObjectResult putObject = s3.putObject(putObjectRequest);
        assertEquals(ObjectMetadata.AES_256_SERVER_SIDE_ENCRYPTION, putObject.getSSEAlgorithm());
    }

    @Test
    public void testServerSideEncryptionBadAlgorithm() {
        final String sseKey = "sseKey";
        try {
            final PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, sseKey, file)
                    .withMetadata(new ObjectMetadata());
            putObjectRequest.getMetadata().setSSEAlgorithm("BAD");
            s3.putObject(putObjectRequest);
            fail("Expected exception");
        } catch (final AmazonServiceException expected) {
        }
    }

    /**
     * Tests getting an object with a bucket name containing periods in a non-us
     * endpoint.
     */
    @Ignore("causes a dns exception in some cases")
    @Test
    public void testNonUsRegionBucketNamesWithPeriods() {
        final AmazonS3 regionalClient = new AmazonS3Client(credentials);
        regionalClient.setEndpoint("s3-sa-east-1.amazonaws.com");
        final String regionalBucketName = bucketName + ".with.periods.regional";
        try {
            regionalClient.createBucket(regionalBucketName);
            regionalClient.putObject(regionalBucketName, key, file);

            final S3Object objectData = regionalClient.getObject(new GetObjectRequest(regionalBucketName,
                    key));
            final ObjectMetadata objectMetadata = objectData.getObjectMetadata();
            assertNotNull(objectMetadata.getLastModified());

            assertFileEqualsStream(file, objectData.getObjectContent());
        } finally {
            try {
                regionalClient.deleteBucket(regionalBucketName);
            } catch (final Exception ignored) {

            }
        }
    }

    /**
     * Smoke test of aborting a getObject request.
     */
    @Test
    public void testAbortConnection() throws Exception {
        final S3Object object = s3.getObject(new GetObjectRequest(bucketName, key));
        final byte[] content = new byte[1024];
        final S3ObjectInputStream objectContent = object.getObjectContent();
        objectContent.read(content);
        objectContent.abort();

        objectContent.close();
    }

    /**
     * Drains the specified stream, closes it and returns the number of bytes in
     * the stream.
     *
     * @param inputStream The stream to drain.
     * @return The number of bytes of data contained in the stream.
     * @throws IOException If any problems were encountered reading from the
     *             stream.
     */
    private long drainStream(InputStream inputStream) throws IOException {
        long count = 0;
        for (; inputStream.read() != -1; count++) {
            ;
        }
        inputStream.close();

        return count;
    }

    /**
     * This test case checks if the read from input stream given by S3 doesn't
     * throw an Socket Exception after garbage collection is called. The read
     * operation is done after calling gc explicitly. This test case is written
     * as part of the forum issue
     * https://forums.aws.amazon.com/thread.jspa?messageID=438171#
     *
     * @throws Exception
     */
    @Test
    public void testGetObjectWithClientSetToNullBeforeReadingFromInputStream()
            throws Exception {

        AmazonS3 s3Local = new AmazonS3Client(credentials);

        final S3Object obj = s3Local.getObject(bucketName, key);

        s3Local = null;

        doGarbageCollection();

        drainStream(obj.getObjectContent());
        assertNotNull(obj.getObjectContent());
    }

    /**
     * This method calls the garbage collector explicitly to perform garbage
     * collection.
     */
    private void doGarbageCollection() {

        try {
            System.gc();
            Thread.sleep(sleepTimeInMillis);
            System.gc();
        } catch (final InterruptedException e) {
            Thread.currentThread().interrupt();
            fail("Test case failed . Exception received is : " + e.getMessage());
        }

    }

    /**
     * Tests the requester pays functionality. 1. Initially the bucket created
     * for testing this functionality is not enabled for Requester Pays. This is
     * checked. 2. Enabling the Requester Pays for the bucket name and checking
     * if its enabled. 3. Reading an object from the Requester Pays bucket and
     * making sure the requester is charged. 4. Disabling the Requester Pays for
     * the bucket. The credentials for the requester must be mentioned in
     * ${user.home}/.aws/requsterPaysTestAccount.properties.
     */
    @Ignore("Don't have requester pay testing account")
    @Test
    public void testRequesterPays() throws InterruptedException {

        final AmazonS3Client requester = new AmazonS3Client(
                new PropertiesFileCredentialsProvider(
                        requesterPaysCredentialsFilePath));

        final Owner owner = requester.getS3AccountOwner();
        final String id = owner.getId();

        // Setting the Acl for the requester for the newly created bucket.
        final AccessControlList bucketAcl = s3.getBucketAcl(requesterPaysBucketName);
        bucketAcl.grantPermission(new CanonicalGrantee(id), Permission.Read);
        s3.setBucketAcl(requesterPaysBucketName, bucketAcl);

        // Setting the Acl for the requester for the newly created object.
        final AccessControlList objectAcl = s3.getObjectAcl(requesterPaysBucketName, key);
        objectAcl.grantPermission(new CanonicalGrantee(id), Permission.Read);
        s3.setObjectAcl(requesterPaysBucketName, key, objectAcl);

        // Checking if requester pays is disabled for the bucket.
        assertFalse(s3.isRequesterPaysEnabled(requesterPaysBucketName));
        // enabling requester pays for the bucket.
        s3.enableRequesterPays(requesterPaysBucketName);
        // Checking if requester pays is enabled for the bucket.
        assertTrue(s3.isRequesterPaysEnabled(requesterPaysBucketName));

        Thread.sleep(sleepTimeInMillis);

        // Reading the object with requester pays enabled in getObject request.
        final GetObjectRequest getObjectRequest = new GetObjectRequest(
                requesterPaysBucketName, key, true);
        final S3Object s3Object = requester.getObject(getObjectRequest);

        // Checking if requester is charged.
        assertTrue(s3Object.isRequesterCharged());
        // Disabling the requester pays for the bucket.
        s3.disableRequesterPays(requesterPaysBucketName);
        // asserting that Requester Pays is disabled for the bucket.
        assertFalse(s3.isRequesterPaysEnabled(requesterPaysBucketName));
    }
}
