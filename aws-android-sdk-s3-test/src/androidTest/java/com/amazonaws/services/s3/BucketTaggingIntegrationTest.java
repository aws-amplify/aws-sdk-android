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
import static org.junit.Assert.assertNull;

import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.TagSet;

import org.junit.After;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Integration tests for S3 bucket tagging configuration.
 */
public class BucketTaggingIntegrationTest extends S3IntegrationTestBase {

    private static final String bucketName = "java-sdk-tagging-test-" + System.currentTimeMillis();

    /** Releases all resources created by this test. */
    @After
    public void tearDown() throws Exception {
        super.deleteBucketAndAllContents(bucketName);
    }

    /** Tests that we can get, set, and delete a bucket's website configuration. */
    @Test
    public void testBucketWebsites() throws Exception {

        // create a test bucket
        s3.createBucket(bucketName);

        // get tagging config for new bucket
        BucketTaggingConfiguration bucketTaggingConfiguration = s3
                .getBucketTaggingConfiguration(bucketName);
        System.out.println("config: " + bucketTaggingConfiguration);

        Map<String, String> tags = new HashMap<String, String>(1);
        tags.put("User", "Foo");
        tags.put("Group", "Bar");
        TagSet tagSet = new TagSet(tags);

        // set tagging configuration
        s3.setBucketTaggingConfiguration(bucketName,
                new BucketTaggingConfiguration().withTagSets(tagSet));

        // get again
        bucketTaggingConfiguration = s3.getBucketTaggingConfiguration(bucketName);
        TagSet remoteTagSet = bucketTaggingConfiguration.getTagSet();
        assertEquals(remoteTagSet.getAllTags().size(), tags.size());
        assertEquals(remoteTagSet.getTag("User"), tags.get("User"));
        assertEquals(remoteTagSet.getTag("Group"), tags.get("Group"));

        // delete
        s3.deleteBucketTaggingConfiguration(bucketName);
        Thread.sleep(1000 * 15 * 1);

        // get again
        bucketTaggingConfiguration = s3.getBucketTaggingConfiguration(bucketName);
        assertNull(bucketTaggingConfiguration);
    }
}
