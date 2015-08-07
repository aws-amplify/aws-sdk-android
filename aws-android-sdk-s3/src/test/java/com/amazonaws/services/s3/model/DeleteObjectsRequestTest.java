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

package com.amazonaws.services.s3.model;

import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.DeleteObjectsRequest.KeyVersion;

import org.junit.Test;

import java.util.List;

public class DeleteObjectsRequestTest {

    @Test
    public void test() {
        DeleteObjectsRequest req = new DeleteObjectsRequest("bucketName");
        List<KeyVersion> keys = req.getKeys();
        assertTrue(keys.size() == 0);
        keys.add(new KeyVersion("1"));
        assertTrue(req.getKeys().size() == 1);
    }
}
