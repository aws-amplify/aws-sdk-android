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

package com.amazonaws.services.s3.iterable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.S3IntegrationTestBase;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S3ObjectsIntegrationTest extends S3IntegrationTestBase {

    /** The bucket created and used by these tests */
    private static final String bucketName = "java-s3-object-iteration-test-"
            + new Date().getTime();

    @AfterClass
    public static void tearDown() throws Exception {
        deleteBucketAndAllContents(bucketName);
    }

    /**
     * Creates and initializes all the test resources needed for these tests.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        S3IntegrationTestBase.setUp();
        s3.createBucket(bucketName);
    }

    @Test
    public void testIteratingAFewObjects() throws Exception {
        deleteObjects(bucketName);
        putObject("1-one");
        putObject("2-two");
        putObject("3-three");

        Thread.sleep(200);

        checkIteration(S3Objects.inBucket(s3, bucketName), "1-one", "2-two", "3-three");
    }

    @Test
    public void testIteratingMultiplePages() throws Exception {
        deleteObjects(bucketName);
        putObject("1-one");
        putObject("2-two");
        putObject("3-three");

        Thread.sleep(200);

        checkIteration(S3Objects.inBucket(s3, bucketName).withBatchSize(1), "1-one", "2-two",
                "3-three");
    }

    @Test
    public void testIteratingWithPrefix() throws Exception {
        deleteObjects(bucketName);
        putObject("foobar");
        putObject("foobaz");
        putObject("somethingelse");

        Thread.sleep(200);

        checkIteration(S3Objects.withPrefix(s3, bucketName, "foo"), "foobar", "foobaz");
    }

    @Test
    public void testIteratingWithPrefixAndMultiplePages() throws Exception {
        deleteObjects(bucketName);
        putObject("absolutely");
        putObject("foobar");
        putObject("foobaz");

        Thread.sleep(200);

        checkIteration(S3Objects.withPrefix(s3, bucketName, "foo").withBatchSize(1), "foobar",
                "foobaz");
    }

    private void checkIteration(S3Objects objects, String... expectedKeys) {
        Set<String> setObjects = new HashSet<String>();
        Set<String> setKeys = new HashSet<String>();
        Iterator<String> iter = Arrays.asList(expectedKeys).iterator();
        for (S3ObjectSummary object : objects) {
            assertTrue("too many objects", iter.hasNext());
            setObjects.add(object.getKey());
            setKeys.add(iter.next());
        }
        assertEquals(setObjects, setKeys);
        assertFalse("too few objects", iter.hasNext());
    }

    private void deleteObjects(String bucketName) {
        ObjectListing objectListing = s3.listObjects(bucketName);
        while (true) {
            for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {

                s3.deleteObject(bucketName, objectSummary.getKey());
            }

            if (objectListing.isTruncated()) {
                objectListing = s3.listNextBatchOfObjects(objectListing);
            } else {
                break;
            }
        }
        ;
    }

    private void putObject(String string) {
        createObject(bucketName, string);
    }

}
