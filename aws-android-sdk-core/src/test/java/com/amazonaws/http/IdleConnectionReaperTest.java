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

package com.amazonaws.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class IdleConnectionReaperTest {
    @Before
    public void init() {
        IdleConnectionReaper.shutdown();
    }

    @Test
    public void forceShutdown() throws Exception {
        // final int threadCount = getThreadCount();
        assertEquals(0, IdleConnectionReaper.size());
        for (int i = 0; i < 3; i++) {
            assertTrue(IdleConnectionReaper
                    .registerConnectionManager(new TestClientConnectionManager()));
            assertEquals(1, IdleConnectionReaper.size());
            // Thread.sleep(100);
            // assertTrue(getThreadCount() > threadCount);
            assertTrue(IdleConnectionReaper.shutdown());
            assertEquals(0, IdleConnectionReaper.size());
            // Thread.sleep(100);
            // assertTrue(getThreadCount() == threadCount);
            assertFalse(IdleConnectionReaper.shutdown());
        }
        // assertEquals(threadCount, getThreadCount());
    }

    @Test
    public void autoShutdown() throws Exception {
        // final int threadCount = getThreadCount();
        assertEquals(0, IdleConnectionReaper.size());
        for (int i = 0; i < 3; i++) {
            ClientConnectionManager m = new TestClientConnectionManager();
            ClientConnectionManager m2 = new TestClientConnectionManager();
            assertTrue(IdleConnectionReaper
                    .registerConnectionManager(m));
            assertEquals(1, IdleConnectionReaper.size());
            // Thread.sleep(100);
            // assertTrue(getThreadCount() > threadCount);
            assertTrue(IdleConnectionReaper
                    .registerConnectionManager(m2));
            assertEquals(2, IdleConnectionReaper.size());
            assertTrue(IdleConnectionReaper.removeConnectionManager(m));
            assertEquals(1, IdleConnectionReaper.size());
            // Thread.sleep(100);
            // assertTrue(getThreadCount() > threadCount);
            assertTrue(IdleConnectionReaper.removeConnectionManager(m2));
            assertEquals(0, IdleConnectionReaper.size());
            // Thread.sleep(100);
            // assertEquals(threadCount, getThreadCount());
            assertFalse(IdleConnectionReaper.shutdown());
        }
        // assertEquals(threadCount, getThreadCount());
    }

    // This method doesn't seem to work on desktop
    // public int getThreadCount() {
    // ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    // return threadMXBean.getThreadCount();
    // }

    private static class TestClientConnectionManager implements ClientConnectionManager {
        @Override
        public void shutdown() {
        }

        @Override
        public ClientConnectionRequest requestConnection(HttpRoute route, Object state) {
            return null;
        }

        @Override
        public void releaseConnection(ManagedClientConnection conn, long validDuration,
                TimeUnit timeUnit) {
        }

        @Override
        public SchemeRegistry getSchemeRegistry() {
            return null;
        }

        @Override
        public void closeIdleConnections(long idletime, TimeUnit tunit) {
        }

        @Override
        public void closeExpiredConnections() {
        }
    }
}
