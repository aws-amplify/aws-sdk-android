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

public class S3ObjectResourceTest {

    @Test
    public void testS3ObjectResource() {
        S3ObjectResource resource = new S3ObjectResource("MyBucket", "MyKey");
        assertEquals(resource.getId(), "arn:aws:s3:::MyBucket/MyKey");
    }
}
