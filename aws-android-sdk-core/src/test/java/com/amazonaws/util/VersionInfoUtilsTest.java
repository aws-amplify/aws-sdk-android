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

package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VersionInfoUtilsTest {

    @Test
    public void getVersion() {
        assertEquals("2.12.3", VersionInfoUtils.getVersion());
    }

    @Test
    public void userAgent() {
        String userAgent = VersionInfoUtils.userAgent();
        System.out.println(userAgent);
        System.out.println(userAgent.length());
        assertNotNull(userAgent);
    }
}
