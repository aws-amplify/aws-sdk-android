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

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class BucketNameUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidV2BucketNames() {
        assertFalse(BucketNameUtils.isValidV2BucketName(null));
        assertFalse(BucketNameUtils.isValidV2BucketName("sm"));
        assertFalse(BucketNameUtils.isValidV2BucketName("UPPERCASE"));
        assertFalse(BucketNameUtils.isValidV2BucketName("contains.dot"));
        assertFalse(BucketNameUtils.isValidV2BucketName("white space"));
        assertFalse(BucketNameUtils.isValidV2BucketName("adjacent..periods"));
        assertFalse(BucketNameUtils.isValidV2BucketName("dash.-nexttoperiod"));
        char invalid[] = {
                '9'
        };
        invalid[0]++;
        assertFalse(BucketNameUtils.isValidV2BucketName(
                String.valueOf(invalid)));
        assertFalse(BucketNameUtils.isValidV2BucketName("endingperiod."));
        BucketNameUtils.validateBucketName("endingdash-");
    }
}
