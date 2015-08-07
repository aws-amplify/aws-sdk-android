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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ProgressListenerCallbackExecutorTest {

    @Test
    public void testPlainConstructor() {
        ProgressListenerCallbackExecutor exec = new ProgressListenerCallbackExecutor();
        assertNull(exec.getListener());
        assertNotNull(ProgressListenerCallbackExecutor.getExecutorService());
        // Makesure it doesn't blow up
        exec.progressChanged(new ProgressEvent(0));
    }

    @Test
    public void testStaticProgressChangedWrapper() throws InterruptedException {
        final List<ProgressEvent> capturedEvents = new ArrayList<ProgressEvent>();
        ProgressListener pl = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                capturedEvents.add(progressEvent);
            }

        };
        ProgressEvent toSend = new ProgressEvent(0);

        ProgressListenerCallbackExecutor.progressChanged(pl, toSend);
        ExecutorService service = ProgressListenerCallbackExecutor.getExecutorService();
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        ProgressListenerCallbackExecutor.executor = ProgressListenerCallbackExecutor
                .createNewExecutorService();
        assertEquals(capturedEvents.size(), 1);
        assertSame(capturedEvents.get(0), toSend);
    }

    @Test
    public void testWrapListener() throws InterruptedException {
        final List<ProgressEvent> capturedEvents = new ArrayList<ProgressEvent>();

        final List<Long> threadIds = new ArrayList<Long>();
        threadIds.add(Thread.currentThread().getId());
        ProgressListener pl = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {
                threadIds.add(Thread.currentThread().getId());
                capturedEvents.add(progressEvent);
            }

        };
        ProgressEvent toSend = new ProgressEvent(0);

        ProgressListenerCallbackExecutor.wrapListener(pl);
        pl.progressChanged(toSend);

        ExecutorService service = ProgressListenerCallbackExecutor.getExecutorService();
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        ProgressListenerCallbackExecutor.executor = ProgressListenerCallbackExecutor
                .createNewExecutorService();
        assertEquals(threadIds.size(), 2);
        assertEquals(capturedEvents.size(), 1);
        assertSame(capturedEvents.get(0), toSend);
    }

    @Test
    public void testStaticMethodsReturnNullWithNullListener() {
        assertNull(ProgressListenerCallbackExecutor.progressChanged(null, null));
        assertNull(ProgressListenerCallbackExecutor.wrapListener(null));
    }

}
