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

import static junit.framework.Assert.assertTrue;

import com.amazonaws.SDKGlobalConfiguration;

import org.junit.Test;

/**
 * Clock skew test
 */
public class ClockSkewIntegrationTest extends S3IntegrationTestBase {

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkewS3() {
        SDKGlobalConfiguration.setGlobalTimeOffset(3600L);
        s3.listBuckets();
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() < 60);
    }
}
