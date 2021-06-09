/*
 * Copyright 2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests that AWS STS client behaves as configured.
 */
public class AWSSecurityTokenServiceClientTest {
    private AWSSecurityTokenServiceClient stsClient;

    /**
     * Creates a new instance of AWS STS client using mock credentials.
     */
    @Before
    public void setUpBeforeTest() {
        AWSCredentials mockCredentials = new AnonymousAWSCredentials();
        AWSCredentialsProvider mockProvider = new StaticCredentialsProvider(mockCredentials);
        stsClient = new AWSSecurityTokenServiceClient(mockProvider);
    }

    /**
     * Tests that STS client defaults to legacy global endpoint.
     */
    @Test
    public void testDefault() {
        assertEquals("https://sts.amazonaws.com", stsClient.getEndpoint());
    }

    /**
     * Tests that STS client endpoint is adjusted appropriately upon setting a region.
     */
    @Test
    public void testRegions() {
        stsClient.setRegion(Region.getRegion(Regions.US_EAST_1));
        assertEquals("https://sts.us-east-1.amazonaws.com", stsClient.getEndpoint());

        stsClient.setRegion(Region.getRegion(Regions.US_WEST_2));
        assertEquals("https://sts.us-west-2.amazonaws.com", stsClient.getEndpoint());

        stsClient.setRegion(Region.getRegion(Regions.AF_SOUTH_1));
        assertEquals("https://sts.af-south-1.amazonaws.com", stsClient.getEndpoint());

        stsClient.setRegion(Region.getRegion(Regions.CN_NORTH_1));
        assertEquals("https://sts.cn-north-1.amazonaws.com.cn", stsClient.getEndpoint());

        stsClient.setRegion(Region.getRegion(Regions.GovCloud));
        assertEquals("https://sts.us-gov-west-1.amazonaws.com", stsClient.getEndpoint());
    }
}
