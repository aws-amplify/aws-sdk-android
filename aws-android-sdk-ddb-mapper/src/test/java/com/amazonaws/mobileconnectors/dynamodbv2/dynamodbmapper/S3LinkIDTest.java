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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import static org.junit.Assert.assertEquals;

import com.amazonaws.services.s3.model.Region;

import org.junit.Test;

import java.io.IOException;

public class S3LinkIDTest {

    @Test
    public void testToFromJson() throws IOException {
        S3Link.ID id = new S3Link.ID(Region.AP_Tokyo, "bucket", "key");
        String json = id.toJson();
        S3Link.ID twin = S3Link.ID.fromJson(json);
        assertEquals("bucket", twin.getBucket());
        assertEquals("key", twin.getKey());
        assertEquals(Region.AP_Tokyo.getFirstRegionId(), twin.getRegionId());
    }

    @Test
    public void testDefaultRegion() throws IOException {
        S3Link.ID id = new S3Link.ID("bucketname", "keyname");
        assertEquals(Region.US_Standard.getFirstRegionId(), id.getRegionId());
        String json = id.toJson();
        S3Link.ID twin = S3Link.ID.fromJson(json);
        assertEquals("bucketname", twin.getBucket());
        assertEquals("keyname", twin.getKey());
        assertEquals(Region.US_Standard.getFirstRegionId(), twin.getRegionId());
    }
}
