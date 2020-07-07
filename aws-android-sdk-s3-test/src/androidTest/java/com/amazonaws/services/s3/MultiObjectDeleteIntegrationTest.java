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

import androidx.test.core.app.ApplicationProvider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest.KeyVersion;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult.DeletedObject;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.transform.Unmarshallers;
import com.amazonaws.services.s3.model.transform.Unmarshallers.DeleteObjectsResultUnmarshaller;
import com.amazonaws.testutils.util.RandomTempFile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Integration tests for multi object delete.
 */
public class MultiObjectDeleteIntegrationTest extends S3IntegrationTestBase {

    // private static final Random RANDOM = new Random();
    private static final boolean ANDROID_TESTING = false;

    /** The bucket created and used by these tests */
    private static final String bucketName = "java-multiget-object-integ-test-"
            + new Date().getTime();

    /** The key used in these tests */
    private static final String key = "key";

    /** The file containing the test data uploaded to S3 */
    private static File file = null;

    /** The inputStream containing the test data uploaded to S3 */
    private static byte[] tempData;

    @AfterClass
    public static void tearDown() throws Exception {
        deleteBucketAndAllContents(bucketName);

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

    }

    @Test
    public void testMultiDelete() throws Exception {
        List<String> keys = new ArrayList<String>();
        String baseKey = "" + System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            String key = baseKey + i;
            s3.putObject(bucketName, key, file);
            keys.add(key);
        }

        // Delete the odd objects
        DeleteObjectsRequest rq = new DeleteObjectsRequest(bucketName);
        Set<String> deletedKeys = new HashSet<String>();
        for (int i = 1; i < keys.size(); i += 2) {
            rq.getKeys().add(new KeyVersion(keys.get(i)));
            deletedKeys.add(keys.get(i));
        }
        DeleteObjectsResult response = s3.deleteObjects(rq);

        assertEquals(5, response.getDeletedObjects().size());
        for (DeletedObject obj : response.getDeletedObjects()) {
            assertTrue(deletedKeys.contains(obj.getKey()));
            deletedKeys.remove(obj.getKey());
            assertNull(obj.getVersionId());
            assertNull(obj.getDeleteMarkerVersionId());
            assertFalse(obj.isDeleteMarker());
        }

        assertTrue(deletedKeys.isEmpty());
    }

    /**
     * It's difficult to trigger an actual error, so we just test the error
     * parsing.
     */
    @Test
    public void testErrorHandling() throws Exception {

        DeleteObjectsResultUnmarshaller unmarshaller = new Unmarshallers.DeleteObjectsResultUnmarshaller();
        DeleteObjectsResponse response = unmarshaller
                .unmarshall(ApplicationProvider.getApplicationContext().getResources().getAssets().open("errorResponse.xml"));

        assertEquals(1, response.getDeletedObjects().size());
        assertEquals(1, response.getErrors().size());

        assertEquals("object1", response.getDeletedObjects().get(0).getKey());
        assertEquals("123", response.getDeletedObjects().get(0).getVersionId());

        assertEquals("object2", response.getErrors().get(0).getKey());
        assertEquals("AccessDenied", response.getErrors().get(0).getCode());
        assertEquals("Access Denied", response.getErrors().get(0).getMessage());
    }

    /**
     * Rather than recreating the conditions where a fully fleshed out response
     * comes back from the service, just make sure we can parse such a response.
     */
    @Test
    public void testFullServiceResponse() throws Exception {
        DeleteObjectsResultUnmarshaller unmarshaller = new Unmarshallers.DeleteObjectsResultUnmarshaller();
        DeleteObjectsResponse response = unmarshaller
                .unmarshall(ApplicationProvider.getApplicationContext().getResources().getAssets().open("fullResponse.xml"));

        assertEquals(2, response.getDeletedObjects().size());
        assertEquals(1, response.getErrors().size());

        boolean seen1 = false;
        boolean seen3 = false;
        for (DeletedObject obj : response.getDeletedObjects()) {
            if (obj.getKey().equals("key1")) {
                seen1 = true;
                assertEquals("Version1", obj.getVersionId());
                assertNull(obj.getDeleteMarkerVersionId());
                assertFalse(obj.isDeleteMarker());
            } else if (obj.getKey().equals("key3")) {
                seen3 = true;
                assertNull(obj.getVersionId());
                assertEquals("Version3", obj.getDeleteMarkerVersionId());
                assertTrue(obj.isDeleteMarker());
            } else {
                fail("Unexpected object found: " + obj.getKey());
            }
        }
        assertTrue("Didn't find key1", seen1);
        assertTrue("Didn't find key3", seen3);

        assertEquals("key2", response.getErrors().get(0).getKey());
        assertEquals("Version2", response.getErrors().get(0).getVersionId());
        assertEquals("Code", response.getErrors().get(0).getCode());
        assertEquals("Message", response.getErrors().get(0).getMessage());
    }

}
