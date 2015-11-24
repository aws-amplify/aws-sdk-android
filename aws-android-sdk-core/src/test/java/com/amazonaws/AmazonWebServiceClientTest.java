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

package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class AmazonWebServiceClientTest {

    @Test
    public void emptyClient() {
        AmazonWebServiceClient client =
                new AmazonWebServiceClient(new ClientConfiguration()) {
                };

        try {
            client.getServiceName();
        } catch (IllegalStateException exception) {
        }
    }

    @Test
    public void testDefaultSigner() {
        AmazonTestClient client = new AmazonTestClient();

        Assert.assertEquals("test", client.getServiceName());
        Assert.assertTrue(client.getSigner() instanceof AWS4Signer);
    }

    @Test
    public void testOverrideSigner() {
        ClientConfiguration config = new ClientConfiguration();
        config.setSignerOverride("QueryStringSignerType");

        AmazonTestClient client = new AmazonTestClient(config);

        Assert.assertTrue(client.getSigner() instanceof QueryStringSigner);
    }

    @Test
    public void setServiceNameIntern() {
        AmazonTestClient client = new AmazonTestClient();
        assertEquals(client.getServiceName(), client.getServiceNameIntern());
        String serviceNameOverride = "foo";
        assertFalse(serviceNameOverride.equals(client.getServiceName()));
        client.setServiceNameIntern(serviceNameOverride);
        assertEquals(serviceNameOverride, client.getServiceName());
    }

    @Test
    public void testGetServiceNameWithExplicitInternalConfiguration() {
        AmazonSimpleDBClient testClient = new AmazonSimpleDBClient();
        assertEquals(testClient.getServiceName(), "sdb");
    }

    @Test
    public void testGetServiceNameWithAWSPrefix() {
        AWSTestClient testClient = new AWSTestClient();
        assertEquals(testClient.getServiceName(), "test");
    }

    private static class AmazonTestClient extends AmazonWebServiceClient {
        public AmazonTestClient() {
            this(new ClientConfiguration());
        }

        public AmazonTestClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.us-west-2.amazonaws.com");
        }
    }

    private static class AWSTestClient extends AmazonWebServiceClient {
        public AWSTestClient() {
            this(new ClientConfiguration());
        }

        public AWSTestClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.us-west-2.amazonaws.com");
        }
    }

    // Has an explicitly set name in InternalConfig
    private static class AmazonSimpleDBClient extends AmazonWebServiceClient {
        public AmazonSimpleDBClient() {
            this(new ClientConfiguration());
        }

        public AmazonSimpleDBClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.us-west-2.amazonaws.com");
        }
    }

    @Test
    public void testSetRegionNonExist() {
        String endpoint = "someservice.us-east-1.amazonaws.com";
        AmazonTestClient client = new AmazonTestClient();
        client.setServiceNameIntern("someservice");
        client.setRegion(Region.getRegion(Regions.US_EAST_1));
        assertEquals(endpoint, client.endpoint.getHost());
    }

    @Test
    public void testSetEndpoint() throws URISyntaxException {
        AmazonTestClient client = new AmazonTestClient();
        client.setEndpoint("http://www.test.com");
        assertEquals(client.endpoint, new URI("http://www.test.com"));
    }

    @Test
    public void testSetSignerRegionOverride() {
        AmazonTestClient client = new AmazonTestClient();
        client.setSignerRegionOverride("test");
        assertEquals(client.getSignerRegionOverride(), "test");
    }

    @Test
    public void testCreateExecutionContextWithAmazonWebServiceRequest() {
        AmazonWebServiceRequest awsr = new TestRequest();
        AmazonTestClient client = new AmazonTestClient();
        ExecutionContext ec = client.createExecutionContext(awsr);
        assertEquals(client.requestHandler2s, ec.getRequestHandler2s());
    }

    @Test
    public void testCreateExecutionContextWithRequest() {
        AmazonWebServiceRequest awsr = new TestRequest();
        Request<String> req = new DefaultRequest<String>(awsr, "test");

        AmazonTestClient client = new AmazonTestClient();
        ExecutionContext ec = client.createExecutionContext(req);
        assertEquals(client.requestHandler2s, ec.getRequestHandler2s());
    }

    @Test
    public void testAddAndRemoveRequestHandler2() {
        RequestHandler2 rh = new RequestHandler2() {

            @Override
            public void beforeRequest(Request<?> request) {
            }

            @Override
            public void afterResponse(Request<?> request, Response<?> response) {
            }

            @Override
            public void afterError(Request<?> request, Response<?> response, Exception e) {
            }

        };
        AmazonTestClient client = new AmazonTestClient();
        client.addRequestHandler(rh);
        assertEquals(client.requestHandler2s.size(), 1);
        assertSame(client.requestHandler2s.get(0), rh);

        client.removeRequestHandler(rh);
        assertEquals(client.requestHandler2s.size(), 0);
    }

    @Test
    public void testTimeoffset() {
        AmazonTestClient client = new AmazonTestClient();
        client.withTimeOffset(100);
        assertEquals(client.getTimeOffset(), 100);
    }

    private class TestRequest extends AmazonWebServiceRequest {
    }

}
