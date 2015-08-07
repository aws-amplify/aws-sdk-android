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

import org.junit.Assert;
import org.junit.Test;

public class AmazonS3URITest {
    @Test
    public void testRoot() {
        AmazonS3URI uri = new AmazonS3URI("https://s3.amazonaws.com/");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertNull(uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testRegionRoot() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.us-west-1.amazonaws.com/");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertNull(uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testRegionRoot2() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3-us-west-1.amazonaws.com/");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertNull(uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testRegionRoot3() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.foobar.baz.qux/");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertNull(uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertEquals("foobar", uri.getRegion());
    }

    @Test
    public void testPathStyleBucket() {
        AmazonS3URI uri = new AmazonS3URI("https://s3.amazonaws.com/bucket");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testPathStyleBucket2() {
        AmazonS3URI uri = new AmazonS3URI("https://s3.amazonaws.com/bucket/");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testHostStyleBucket() {
        AmazonS3URI uri = new AmazonS3URI("https://bucket.s3.amazonaws.com/");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testHostStyleBucket2() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bucket.s3.us-west-1.amazonaws.com/");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertNull(uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testPathStyle() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.amazonaws.com/bucket/key");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testEncodedKey() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.amazonaws.com/bucket/k%20e%20y");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("k e y", uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testEncodedBucket() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.amazonaws.com/bu%2fck%2Fet/key");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bu/ck/et", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testHostStyle() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bucket.s3.amazonaws.com/k/e/y");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("k/e/y", uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testHostStyle2() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bu.ck.et.s3.amazonaws.com///k/e/y");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bu.ck.et", uri.getBucket());
        Assert.assertEquals("//k/e/y", uri.getKey());
        Assert.assertNull(uri.getRegion());
    }

    @Test
    public void testPathStyleRegion() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3.us-west-1.amazonaws.com/bucket/key");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testPathStyleRegion2() {
        AmazonS3URI uri =
                new AmazonS3URI("https://s3-us-west-1.amazonaws.com/bucket/key");

        Assert.assertTrue(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testHostStyleRegion() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bucket.s3.us-west-1.amazonaws.com/key");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testHostStyleRegion2() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bucket.s3-us-west-1.amazonaws.com/key");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bucket", uri.getBucket());
        Assert.assertEquals("key", uri.getKey());
        Assert.assertEquals("us-west-1", uri.getRegion());
    }

    @Test
    public void testHostStyleRegion3() {
        AmazonS3URI uri =
                new AmazonS3URI("https://bu.ck.et.s3.foo.bar.baz///k/e/y");

        Assert.assertFalse(uri.isPathStyle());
        Assert.assertEquals("bu.ck.et", uri.getBucket());
        Assert.assertEquals("//k/e/y", uri.getKey());
        Assert.assertEquals("foo", uri.getRegion());
    }
}
