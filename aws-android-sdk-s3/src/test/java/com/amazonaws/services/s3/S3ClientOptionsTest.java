/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class S3ClientOptionsTest {
    @Test
    public void testBuilder() {
        S3ClientOptions options = S3ClientOptions.builder().setAccelerateModeEnabled(true)
                .setPathStyleAccess(true).build();
        assertTrue(options.isAccelerateModeEnabled());
        assertTrue(options.isPathStyleAccess());
    }
}

