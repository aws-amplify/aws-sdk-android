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
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;

public class RegionUtilsTest {

    @Test
    public void testGetRegionByEndpoint() {

        Region usWest2 = RegionUtils.getRegionByEndpoint("s3.us-west-2.amazonaws.com");
        Region standard = RegionUtils.getRegionByEndpoint("s3.amazonaws.com");

        assertEquals(usWest2.getName(), "us-west-2");
        assertEquals(usWest2.getServiceEndpoint(ServiceAbbreviations.S3),
                "s3.us-west-2.amazonaws.com");
        assertEquals(standard.getName(), "us-east-1");
        assertEquals(standard.getServiceEndpoint(ServiceAbbreviations.S3), "s3.amazonaws.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRegionByEndpointWithBogusEndpoint() {

        Region standard = RegionUtils.getRegionByEndpoint("bogus.amazonaws.com");
    }

    @Test
    public void testGetRegionsForService() {
        List<Region> regions = RegionUtils.getRegionsForService(ServiceAbbreviations.SimpleDB);
        assertEquals(regions.size(), 10);
        boolean usEast1 = false;
        boolean usWest1 = false;
        for (Region curr : regions) {
            if (curr.getName().equalsIgnoreCase("us-east-1")) {
                usEast1 = true;
                assertEquals(curr.getServiceEndpoint(ServiceAbbreviations.SimpleDB),
                        "sdb.amazonaws.com");

            }
            if (curr.getName().equalsIgnoreCase("us-west-1"))
                usWest1 = true;

        }

        assertTrue(usEast1);
        assertTrue(usWest1);

    }

}
