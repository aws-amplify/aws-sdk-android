/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpledb;

import static org.junit.Assert.assertTrue;

import com.amazonaws.SDKGlobalConfiguration;

import org.junit.Test;

public class ClockSkewIntegrationTest extends SimpleDBIntegrationTestBase {

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkewSDB() {
        SDKGlobalConfiguration.setGlobalTimeOffset(7200);
        sdb.listDomains();
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() < 60);
    }

    /**
     * In the following test, we purposely setting the time offset to trigger a
     * clock skew error. The time offset must be fixed and then we validate the
     * global value for time offset has been update.
     */
    @Test
    public void testClockSkewAsync() {
        SDKGlobalConfiguration.setGlobalTimeOffset(3600);
        sdbAsync.listDomains();
        assertTrue(SDKGlobalConfiguration.getGlobalTimeOffset() < 60);
    }
}
