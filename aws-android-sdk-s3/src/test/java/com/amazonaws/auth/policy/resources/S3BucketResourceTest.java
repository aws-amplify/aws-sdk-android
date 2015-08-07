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

package com.amazonaws.auth.policy.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class S3BucketResourceTest {

    @Test
    public void testS3BucketResource() {
        S3BucketResource resource = new S3BucketResource("MyBucket");
        assertEquals(resource.getId(), "arn:aws:s3:::MyBucket");
    }

}
