package com.amazonaws.services.s3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.internal.crypto.CryptoTestUtils;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.testutils.util.RandomInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Integration tests for the listObjectsV2 operation in the Amazon S3 Java
 * client.
 */
public class S3ListObjectsV2IntegrationTest extends S3IntegrationTestBase {
    /**
     * One hour in milliseconds for verifying that a last modified date is
     * recent
     */
    private static final long ONE_HOUR_IN_MILLISECONDS = 1000 * 60 * 60;

    /** Content length for sample keys created by these tests */
    private static final long CONTENT_LENGTH = 123;

    private static final String KEY_NAME_WITH_SPECIAL_CHARS = "special-chars-@$%";

    /** The name of the bucket created, used, and deleted by these tests */
    private static final String BUCKET_NAME = "android-sdk-list-objects-integ-test-"
            + System.currentTimeMillis();

    private static final int BUCKET_OBJECTS = 15;

    /** List of all keys created by these tests */
    private static List<String> keys = new ArrayList<String>();

    /** Releases all resources created in this test */
    @AfterClass
    public static void tearDown() {
        CryptoTestUtils.deleteBucketAndAllContents(s3, BUCKET_NAME);
    }

    /**
     * Creates all the test resources for the tests.
     */
    @BeforeClass
    public static void createResources() {
        s3.createBucket(BUCKET_NAME);
        NumberFormat numberFormatter = new DecimalFormat("##00");
        for (int i = 1; i <= BUCKET_OBJECTS; i++) {
            createKey("key-" + numberFormatter.format(i));
        }
        createKey("aaaaa");
        createKey("aaaaa/aaaaa");
        createKey("aaaaa/aaaaa/aaaaa");
        createKey(KEY_NAME_WITH_SPECIAL_CHARS);
    }

    /*
     * Individual Tests
     */
    @Test
    public void testListNoParameters() {
        ListObjectsV2Result result = s3.listObjectsV2(BUCKET_NAME);
        List<S3ObjectSummary> objects = result.getObjectSummaries();

        assertEquals(keys.size(), objects.size());
        assertEquals(keys.size(), result.getKeyCount());
        assertEquals(BUCKET_NAME, result.getBucketName());
        assertS3ObjectSummariesAreValid(objects, false);
        assertNotNull(result.getMaxKeys());

        // We didn't use a delimiter, so we expect these to be empty/null
        assertNull(result.getDelimiter());

        // We don't expect any truncated results
        assertFalse(result.isTruncated());
        assertNull(result.getNextContinuationToken());

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(result.getEncodingType());
        assertNull(result.getPrefix());
        assertNull(result.getContinuationToken());
    }

    @Test
    public void testListWithPrefixAndStartAfter() {
        String prefix = "key";
        String startAfter = "key-01";
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withPrefix(prefix)
                .withStartAfter(startAfter));
        List<S3ObjectSummary> objects = result.getObjectSummaries();

        assertEquals(BUCKET_OBJECTS - 1, objects.size());
        assertEquals(BUCKET_NAME, result.getBucketName());
        assertS3ObjectSummariesAreValid(objects, false);
        assertEquals(startAfter, result.getStartAfter());
        assertEquals(prefix, result.getPrefix());

        // We didn't use a delimiter, so we expect it to be empty/null
        assertNull(result.getDelimiter());

        // We don't expect any truncated results
        assertFalse(result.isTruncated());
        assertNull(result.getNextContinuationToken());

        // We didn't set any other request parameters, so we expect them to be
        // set to the defaults.
        assertTrue(result.getMaxKeys() >= 1000);
        assertNull(result.getEncodingType());
    }

    @Test
    public void testListWithPrefixAndDelimiter() {
        String prefix = "a";
        String delimiter = "/";
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withPrefix(prefix)
                .withDelimiter(delimiter));

        List<S3ObjectSummary> objects = result.getObjectSummaries();

        assertEquals(1, objects.size());
        assertEquals(BUCKET_NAME, result.getBucketName());
        assertS3ObjectSummariesAreValid(objects, false);
        assertEquals(prefix, result.getPrefix());
        assertEquals(delimiter, result.getDelimiter());

        // We don't expect any truncated results
        assertFalse(result.isTruncated());
        assertNull(result.getNextContinuationToken());

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(result.getStartAfter());
        assertNull(result.getEncodingType());
        assertTrue(result.getMaxKeys() >= 1000);
    }

    @Test
    public void testListWithMaxKeys() {
        int maxKeys = 4;
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withMaxKeys(maxKeys));

        List<S3ObjectSummary> objects = result.getObjectSummaries();

        assertEquals(maxKeys, objects.size());
        assertEquals(BUCKET_NAME, result.getBucketName());
        assertEquals(maxKeys, result.getMaxKeys());
        assertS3ObjectSummariesAreValid(objects, false);

        // We didn't use a delimiter, so we expect this to be empty/null
        assertNull(result.getDelimiter());

        // We expect truncated results since we set maxKeys
        assertTrue(result.isTruncated());
        assertNotNull(result.getNextContinuationToken());
        assertTrue(result.getNextContinuationToken().length() > 1);

        // URL encoding is requested by default

        // We didn't set other request parameters, so we expect them to be empty
        assertNull(result.getEncodingType());
        assertNull(result.getPrefix());
        assertNull(result.getStartAfter());
        assertNull(result.getDelimiter());
    }

    @Ignore("need to fix encoding in other methods as well")
    public void testListWithEncodingType() {
        String encodingType = "url";
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withPrefix(KEY_NAME_WITH_SPECIAL_CHARS)
                .withEncodingType(encodingType));
        List<S3ObjectSummary> objects = result.getObjectSummaries();

        // EncodingType should be returned in the response.
        assertEquals(encodingType, result.getEncodingType());

        // The key name returned in the response should have been decoded
        // from the URL encoded form S3 returned us.
        assertEquals(KEY_NAME_WITH_SPECIAL_CHARS,
                objects.get(0).getKey());
    }

    @Test
    public void testListWithFetchOwner() {
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withFetchOwner(true));
        List<S3ObjectSummary> objects = result.getObjectSummaries();
        assertS3ObjectSummariesAreValid(objects, true);
    }

    @Test
    public void testListPagination() {
        int firstRequestMaxKeys = 4;
        String prefix = "key";
        ListObjectsV2Result result = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withPrefix(prefix)
                .withMaxKeys(firstRequestMaxKeys));
        List<S3ObjectSummary> objects = result.getObjectSummaries();

        assertEquals(firstRequestMaxKeys, objects.size());
        assertEquals(BUCKET_NAME, result.getBucketName());
        assertEquals(prefix, result.getPrefix());
        assertNotNull(result.getNextContinuationToken());
        assertTrue(result.isTruncated());
        assertS3ObjectSummariesAreValid(objects, false);

        for (int i = 0; i < firstRequestMaxKeys; i++) {
            assertEquals(keys.get(i), objects.get(i).getKey());
        }

        ListObjectsV2Result nextResults = s3.listObjectsV2(new ListObjectsV2Request()
                .withBucketName(BUCKET_NAME)
                .withPrefix(prefix)
                .withContinuationToken(result.getNextContinuationToken()));
        List<S3ObjectSummary> nextObjects = nextResults.getObjectSummaries();

        assertNull(nextResults.getNextContinuationToken());
        assertEquals(nextResults.getContinuationToken(), result.getNextContinuationToken());
        assertFalse(nextResults.isTruncated());
        assertEquals(prefix, nextResults.getPrefix());
        assertS3ObjectSummariesAreValid(nextObjects, false);
        assertEquals(nextObjects.size(), BUCKET_OBJECTS - firstRequestMaxKeys);
    }

    /*
     * Private Test Utilities
     */

    /**
     * Creates a test object in S3 with the specified name, using random ASCII
     * data of the default content length as defined in this test class.
     *
     * @param key The key under which to create the object in this test class'
     *            test bucket.
     */
    private static void createKey(String key) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(CONTENT_LENGTH);
        InputStream input = new RandomInputStream(CONTENT_LENGTH);

        s3.putObject(BUCKET_NAME, key, input, metadata);
        keys.add(key);
    }

    /**
     * Asserts that a list of S3ObjectSummary objects are valid, by checking
     * that expected fields are not null or empty, that ETag values don't
     * contain leading or trailing quotes, that the last modified date is
     * recent, etc.
     *
     * @param objectSummaries The list of objects to validate.
     * @param shouldIncludeOwner Whether owner information was requested and
     *            should be present in results.
     */

    private void assertS3ObjectSummariesAreValid(List<S3ObjectSummary> objectSummaries,
            boolean shouldIncludeOwner) {

        for (Iterator<S3ObjectSummary> iterator = objectSummaries.iterator(); iterator.hasNext();) {
            S3ObjectSummary obj = iterator.next();
            assertEquals(BUCKET_NAME, obj.getBucketName());
            assertTrue(obj.getETag().length() > 1);
            assertFalse(obj.getETag().startsWith("\""));
            assertFalse(obj.getETag().endsWith("\""));
            assertTrue(obj.getKey().length() > 1);

            // Verify that the last modified date is within an hour
            assertNotNull(obj.getLastModified());
            long offset = obj.getLastModified().getTime() - new Date().getTime();
            assertTrue(offset < ONE_HOUR_IN_MILLISECONDS);

            assertEquals(CONTENT_LENGTH, obj.getSize());
            assertTrue(obj.getStorageClass().length() > 1);

            if (shouldIncludeOwner) {
                assertNotNull(obj.getOwner());
                assertTrue(obj.getOwner().getDisplayName().length() > 1);
                assertTrue(obj.getOwner().getId().length() > 1);
            }
        }
    }
}