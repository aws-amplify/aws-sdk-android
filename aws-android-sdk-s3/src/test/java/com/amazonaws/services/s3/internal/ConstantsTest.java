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

import static org.junit.Assert.assertEquals;

import com.amazonaws.SDKGlobalConfiguration;

import org.junit.Test;

public class ConstantsTest {

    @Test
    public void testGetBufferSize() {
        assertEquals(Constants.getStreamBufferSize(), Constants.DEFAULT_STREAM_BUFFER_SIZE);
        System.setProperty(SDKGlobalConfiguration
                .DEFAULT_S3_STREAM_BUFFER_SIZE, "1");
        assertEquals(Constants.getStreamBufferSize(), 1);
        assertEquals(Constants.getS3StreamBufferSize(), new Integer(1));
        System.clearProperty(SDKGlobalConfiguration
                .DEFAULT_S3_STREAM_BUFFER_SIZE);

        assertEquals(Constants.getS3StreamBufferSize(), null);
    }
}
