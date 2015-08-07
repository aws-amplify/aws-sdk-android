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

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;

import org.junit.Assert;
import org.junit.Test;

public class RegionsTest {

    @Test
    public void testDefaultDomain() {
        Region region = new Region("region", null);
        Assert.assertEquals("amazonaws.com", region.getDomain());
    }

    @Test
    public void testSetEndpointByRegion() {

        Region region = new Region("region", "example.com");
        region.getServiceEndpoints().put("service",
                "service-region.example.com");

        // This should use the configured region.
        AmazonServiceClient service = new AmazonServiceClient();
        service.setRegion(region);
        Assert.assertEquals("https://service-region.example.com",
                service.getEndpoint());

        // This should guess at an endpoint based on the region's domain.
        AmazonUnknownServiceClient unknown = new AmazonUnknownServiceClient();
        unknown.setRegion(region);
        Assert.assertEquals("https://unknownservice.region.example.com",
                unknown.getEndpoint());
    }

    @Test
    public void testFromName() {
        Regions usEast1 = Regions.fromName("us-east-1");
        assertEquals(usEast1, Regions.US_EAST_1);
        Regions cn1 = Regions.fromName("cn-north-1");
        assertEquals(cn1, Regions.CN_NORTH_1);
        Regions govCloud = Regions.fromName("us-gov-west-1");
        assertEquals(govCloud, Regions.GovCloud);
        assertEquals(usEast1.getName(), "us-east-1");
    }

    private static class AmazonServiceClient extends AmazonWebServiceClient {

        public AmazonServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }

    private static class AmazonUnknownServiceClient
            extends AmazonWebServiceClient {

        public AmazonUnknownServiceClient() {
            super(new ClientConfiguration());
        }

        public String getEndpoint() {
            return endpoint.toString();
        }
    }
}
