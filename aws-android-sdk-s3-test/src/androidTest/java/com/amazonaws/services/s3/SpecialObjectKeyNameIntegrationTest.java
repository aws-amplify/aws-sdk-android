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

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CreateBucketRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.util.SpecialObjectKeyNameGenerator;
import com.amazonaws.util.StringUtils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.List;

/** Tests that S3 could handle special key names. **/
public class SpecialObjectKeyNameIntegrationTest extends S3IntegrationTestBase {

    private static final String BUCKET_NAME = "android-sdk-special-key-test-bucket-"
            + System.currentTimeMillis();
    private static final String OBJECT_CONTENTS = "Special key name test";

    @BeforeClass
    public static void createBucket() {
        CreateBucketRequest request = new CreateBucketRequest(BUCKET_NAME);
        Bucket bucket = s3.createBucket(request);
        assertNotNull(bucket);
        assertEquals(BUCKET_NAME, bucket.getName());
    }

    /**
     * Put objects with all the special keys, and also check that the key names
     * are not mistakenly tampered.
     */
    @Test
    public void testPutAllSpecialKeys() {
        List<String> allSpecialKeyNames = SpecialObjectKeyNameGenerator.initAllSpecialKeyNames();
        for (String specialKey : allSpecialKeyNames) {
            testPutObject(specialKey);
        }
    }

    @AfterClass
    public static void tearDown() {
        if (BUCKET_NAME != null)
            deleteBucketAndAllContents(BUCKET_NAME);
    }

    private void testPutObject(String specialKeyName) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(OBJECT_CONTENTS.getBytes(StringUtils.UTF8).length);
        s3.putObject(BUCKET_NAME, specialKeyName,
                new ByteArrayInputStream(OBJECT_CONTENTS.getBytes(StringUtils.UTF8)), metadata);

        List<S3ObjectSummary> objects = s3.listObjects(BUCKET_NAME).getObjectSummaries();
        for (S3ObjectSummary object : objects) {
            if (object.getKey().equals(specialKeyName)) {
                return;
            }
        }
        fail("Cannot find " + specialKeyName + " in the bucket.");
    }
}
