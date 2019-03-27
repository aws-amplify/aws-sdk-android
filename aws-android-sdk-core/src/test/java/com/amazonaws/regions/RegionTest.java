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

package com.amazonaws.regions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import org.junit.Test;

public class RegionTest {

    private static final String DEFAULT_DOMAIN = "amazonaws.com";

    @Test
    public void testDefaultDomain() {
        final String serviceName = "s3";
        assertEquals("empty domain", DEFAULT_DOMAIN, new Region(serviceName, "").getDomain());
        assertEquals("null domain", DEFAULT_DOMAIN, new Region(serviceName, null).getDomain());
    }

    @Test
    public void testRegionEquals() {
        final Region usWest2 = RegionUtils.getRegion("us-west-2");
        final Region other = RegionUtils.getRegionByEndpoint("s3.us-west-2.amazonaws.com");

        assertEquals(usWest2, other);
    }

    @Test
    public void testInstantiateClientNoConfigOrCredentials() {
        final Region usEast1 = Region.getRegion(Regions.US_EAST_1);
        final AmazonServiceClient asc = usEast1.createClient(AmazonServiceClient.class, null, null);
        assertNotNull(asc);
        assertNull(asc.provider);
        assertNull(asc.conf);
    }

    @Test
    public void testInstantiateClient() {
        final Region usEast1 = Region.getRegion(Regions.US_EAST_1);
        final AWSCredentialsProvider prov = new AWSCredentialsProvider() {

            @Override
            public AWSCredentials getCredentials() {
                return null;
            }

            @Override
            public void refresh() {
            }

        };

        final ClientConfiguration conf = new ClientConfiguration();

        final AmazonServiceClient asc = usEast1.createClient(AmazonServiceClient.class, prov, conf);
        assertNotNull(asc);
        assertSame(asc.provider, prov);
        assertSame(asc.conf, conf);
    }

    @Test
    public void testInstantiateClientNoConfig() {
        final Region usEast1 = Region.getRegion(Regions.US_EAST_1);
        final AWSCredentialsProvider prov = new AWSCredentialsProvider() {

            @Override
            public AWSCredentials getCredentials() {
                return null;
            }

            @Override
            public void refresh() {
            }

        };
        final AmazonServiceClient asc = usEast1.createClient(AmazonServiceClient.class, prov, null);
        assertNotNull(asc);
        assertSame(asc.provider, prov);
        assertNull(asc.conf);
    }

    @Test
    public void testInstantiateClientNoCredentials() {
        final Region usEast1 = Region.getRegion(Regions.US_EAST_1);
        final ClientConfiguration conf = new ClientConfiguration();
        conf.setConnectionTimeout(5);
        final AmazonServiceClient asc = usEast1.createClient(AmazonServiceClient.class, null, conf);
        assertNotNull(asc);
        assertSame(asc.conf, conf);
        assertNull(asc.provider);
    }

    @Test
    public void testEUNorth1() {
        final Region euNorth1 = Region.getRegion(Regions.EU_NORTH_1);
        assertNotNull(euNorth1);
        final ClientConfiguration conf = new ClientConfiguration();
        conf.setConnectionTimeout(5);
        final AmazonServiceClient asc = euNorth1.createClient(AmazonServiceClient.class, null, conf);
        assertNotNull(asc);
        assertSame(asc.conf, conf);
        assertNull(asc.provider);
    }

    private static class AmazonServiceClient extends AmazonWebServiceClient {

        AWSCredentialsProvider provider;
        ClientConfiguration conf;

        public AmazonServiceClient() {
            super(new ClientConfiguration());
            this.conf = null;
            this.provider = null;
        }

        public AmazonServiceClient(ClientConfiguration conf) {
            super(conf);
            this.provider = null;
            this.conf = conf;
        }

        public AmazonServiceClient(AWSCredentialsProvider provider, ClientConfiguration conf) {
            super(conf);
            this.provider = provider;
            this.conf = conf;
        }

        public AmazonServiceClient(AWSCredentialsProvider provider) {
            super(new ClientConfiguration());
            this.provider = provider;
            this.conf = null;
        }

        @Override
        public String getEndpoint() {
            return endpoint.toString();
        }

        @Override
        public String getEndpointPrefix() {
            return "amazon";
        }
    }
}
