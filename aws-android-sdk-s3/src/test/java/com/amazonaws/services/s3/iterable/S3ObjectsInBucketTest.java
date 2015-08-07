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
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class S3ObjectsInBucketTest extends S3ObjectsTestCommon {

    @Before
    public void setUp() throws Exception {
        s3Objects = S3Objects.inBucket(s3, "my-bucket");
    }

    @Test
    public void testStoresBucketName() throws Exception {
        assertEquals("my-bucket", s3Objects.getBucketName());
    }

    @Test
    public void testUsesNullPrefix() throws Exception {
        assertNull(s3Objects.getPrefix());
    }

}
