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

package com.amazonaws.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ProgressListenerChainTest {

    @Test
    public void testProgressListenerChainNoFilters() {

        final ConcurrentHashMap<ProgressListener, ProgressEvent> listenerMap = new ConcurrentHashMap<ProgressListener, ProgressEvent>();

        ProgressListener listener1 = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                if (listenerMap.get(this) != null) {
                    fail("recieved unexpected event");
                } else {
                    listenerMap.put(this, progressEvent);
                }

            }
        };

        ProgressListener listener2 = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                if (listenerMap.get(this) != null) {
                    fail("recieved unexpected event");
                } else {
                    listenerMap.put(this, progressEvent);
                }
            }

        };

        ProgressListenerChain chain = new ProgressListenerChain(listener1, listener2);
        ProgressEvent event = new ProgressEvent(0);
        chain.progressChanged(event);
        assertSame(listenerMap.get(listener1), event);
        assertSame(listenerMap.get(listener2), event);
    }

    @Test
    public void testProgressListenerChainWithFilters() {

        final ConcurrentHashMap<ProgressListener, ProgressEvent> listenerMap = new ConcurrentHashMap<ProgressListener, ProgressEvent>();

        ProgressListener listener1 = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                if (listenerMap.get(this) != null) {
                    fail("recieved unexpected event");
                } else {
                    listenerMap.put(this, progressEvent);
                }

            }
        };

        ProgressListener listener2 = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                if (listenerMap.get(this) != null) {
                    fail("recieved unexpected event");
                } else {
                    listenerMap.put(this, progressEvent);
                }
            }

        };

        ProgressListenerChain chain = new ProgressListenerChain(
                new ProgressListenerChain.ProgressEventFilter() {

                    @Override
                    public ProgressEvent filter(ProgressEvent progressEvent) {
                        progressEvent.setBytesTransferred(100);
                        return progressEvent;
                    }

                }, listener1, listener2);
        ProgressEvent event = new ProgressEvent(0);
        chain.progressChanged(event);
        assertSame(listenerMap.get(listener1), event);
        assertSame(listenerMap.get(listener2), event);
        assertEquals(listenerMap.get(listener1).getBytesTransferred(), 100);
        assertEquals(listenerMap.get(listener2).getBytesTransferred(), 100);
    }

    @Test
    public void testAddAndRemoveListeners() {
        ProgressListener listener1 = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                // NoOp for this test
            }
        };

        ProgressListener listener2 = new ProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                // NoOp for this test
            }
        };

        ProgressListenerChain chain = new ProgressListenerChain(listener1);
        chain.addProgressListener(listener2);

        List<ProgressListener> listeners = chain.getListeners();
        assertEquals(listeners.size(), 2);

        chain.removeProgressListener(listener1);
        listeners = chain.getListeners();
        assertEquals(listeners.size(), 1);
        assertSame(listeners.get(0), listener2);

    }
}
