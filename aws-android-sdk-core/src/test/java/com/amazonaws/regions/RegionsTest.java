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

package com.amazonaws.regions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class RegionsTest {

    @Test
    public void testDefaultDomain() {
        final Region region = new Region("region", null);
        Assert.assertEquals("amazonaws.com", region.getDomain());
    }

    @Test
    public void testFromName() {
        final Regions usEast1 = Regions.fromName("us-east-1");
        assertEquals(usEast1, Regions.US_EAST_1);
        final Regions cn1 = Regions.fromName("cn-north-1");
        assertEquals(cn1, Regions.CN_NORTH_1);
        final Regions govCloud = Regions.fromName("us-gov-west-1");
        assertEquals(govCloud, Regions.GovCloud);
        assertEquals(usEast1.getName(), "us-east-1");
    }
}
