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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.amazonaws.retry.RetryPolicy;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.net.ssl.TrustManager;

public class ClientConfigurationTest {

    @Test
    public void testWithAndSetMethods() throws UnknownHostException {

        ClientConfiguration c = new ClientConfiguration();

        c.withConnectionTimeout(1);
        assertEquals(c.getConnectionTimeout(), 1);
        c.setConnectionTimeout(1);
        assertEquals(c.getConnectionTimeout(), 1);

        InetAddress ina = InetAddress.getByName(null);
        c.withLocalAddress(ina);
        assertEquals(c.getLocalAddress(), ina);
        InetAddress localHost = InetAddress.getLocalHost();
        c.setLocalAddress(localHost);
        assertEquals(c.getLocalAddress(), localHost);

        c.withMaxConnections(1);
        assertEquals(c.getMaxConnections(), 1);
        c.setMaxConnections(2);
        assertEquals(c.getMaxConnections(), 2);

        c.withMaxErrorRetry(1);
        assertEquals(c.getMaxErrorRetry(), 1);
        c.setMaxErrorRetry(2);
        assertEquals(c.getMaxErrorRetry(), 2);

        c.withPreemptiveBasicProxyAuth(true);
        assertTrue(c.isPreemptiveBasicProxyAuth());
        c.setPreemptiveBasicProxyAuth(false);
        assertFalse(c.isPreemptiveBasicProxyAuth());

        c.withProtocol(Protocol.HTTP);
        assertEquals(c.getProtocol(), Protocol.HTTP);
        c.setProtocol(Protocol.HTTPS);
        assertEquals(c.getProtocol(), Protocol.HTTPS);

        c.withProxyHost("host");
        assertEquals(c.getProxyHost(), "host");
        c.setProxyHost("two");
        assertEquals(c.getProxyHost(), "two");

        c.withProxyPassword("pass");
        assertEquals(c.getProxyPassword(), "pass");
        c.setProxyPassword("word");
        assertEquals(c.getProxyPassword(), "word");

        c.withProxyPort(1);
        assertEquals(c.getProxyPort(), 1);
        c.setProxyPort(2);
        assertEquals(c.getProxyPort(), 2);

        c.withProxyUsername("user");
        assertEquals(c.getProxyUsername(), "user");
        c.setProxyUsername("name");
        assertEquals(c.getProxyUsername(), "name");

        RetryPolicy rp = new RetryPolicy(null, null, 0, false);
        c.withRetryPolicy(rp);
        assertSame(rp, c.getRetryPolicy());
        c.setRetryPolicy(null);
        assertNull(c.getRetryPolicy());

        c.withSignerOverride("over");
        assertEquals(c.getSignerOverride(), "over");
        c.setSignerOverride("ride");
        assertEquals(c.getSignerOverride(), "ride");

        c.withSocketBufferSizeHints(0, 1);
        assertEquals(c.getSocketBufferSizeHints()[0], 0);
        assertEquals(c.getSocketBufferSizeHints()[1], 1);
        c.setSocketBufferSizeHints(2, 3);
        assertEquals(c.getSocketBufferSizeHints()[0], 2);
        assertEquals(c.getSocketBufferSizeHints()[1], 3);

        c.withSocketTimeout(0);
        assertEquals(c.getSocketTimeout(), 0);
        c.setSocketTimeout(1);
        assertEquals(c.getSocketTimeout(), 1);

        c.withUserAgent("ua");
        assertEquals(c.getUserAgent(), "ua");
        c.setUserAgent("set");
        assertEquals(c.getUserAgent(), "set");

        TrustManager trustManager = new TrustManager() {
        };
        c.withTrustManager(trustManager);
        assertSame(trustManager, c.getTrustManager());
        c.setTrustManager(null);
        assertNull(c.getTrustManager());
    }

    @Test
    public void testCopyConstructor() throws UnknownHostException {
        ClientConfiguration c = new ClientConfiguration();

        c.withConnectionTimeout(1);
        InetAddress ina = InetAddress.getByName(null);
        c.withLocalAddress(ina);
        c.withMaxConnections(1);
        c.withMaxErrorRetry(1);
        c.withPreemptiveBasicProxyAuth(true);
        c.withProtocol(Protocol.HTTP);
        c.withProxyHost("host");
        c.withProxyPassword("pass");
        c.withProxyPort(1);
        c.withProxyUsername("user");
        RetryPolicy rp = new RetryPolicy(null, null, 0, false);
        c.withRetryPolicy(rp);
        c.withSignerOverride("over");
        c.withSocketBufferSizeHints(0, 1);
        c.withSocketTimeout(0);
        c.withUserAgent("ua");
        TrustManager trustManager = new TrustManager() {
        };
        c.withTrustManager(trustManager);

        ClientConfiguration n = new ClientConfiguration(c);
        assertEquals(c.getConnectionTimeout(), n.getConnectionTimeout());
        assertEquals(c.getLocalAddress(), n.getLocalAddress());
        assertEquals(c.getMaxConnections(), n.getMaxConnections());
        assertEquals(c.getMaxErrorRetry(), n.getMaxErrorRetry());
        assertEquals(c.isPreemptiveBasicProxyAuth(), n.isPreemptiveBasicProxyAuth());
        assertEquals(c.getProtocol(), n.getProtocol());
        assertEquals(c.getProxyHost(), n.getProxyHost());
        assertEquals(c.getProxyPassword(), n.getProxyPassword());
        assertEquals(c.getProxyPort(), n.getProxyPort());
        assertEquals(c.getProxyUsername(), n.getProxyUsername());
        assertEquals(c.getRetryPolicy(), n.getRetryPolicy());
        assertEquals(c.getSignerOverride(), n.getSignerOverride());
        assertArrayEquals(c.getSocketBufferSizeHints(), n.getSocketBufferSizeHints());
        assertEquals(c.getSocketTimeout(), n.getSocketTimeout());
        assertEquals(c.getUserAgent(), n.getUserAgent());
        assertSame(c.getTrustManager(), n.getTrustManager());
    }

}
