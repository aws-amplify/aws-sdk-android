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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ProgressReportingInputStreamTest {

    private InputStream is;
    private ProgressListenerCallbackExecutor callback;
    private ProgressListener listener;
    private File testFile;

    // The minimum threshold for notifications is 1024*8 = 8192... 17408
    // =1024*17
    // for 2 notifications plus a 1024 buffer
    private int numberOfBytesToWrite = 17408;

    @Before
    public void setup() throws IOException {
        testFile = File.createTempFile("AndroidProgressReportingInputStreamTest", null);
        FileOutputStream fos = new FileOutputStream(testFile);

        byte[] dummyData = new byte[numberOfBytesToWrite];
        Random rand = new Random();
        rand.nextBytes(dummyData);

        fos.write(dummyData);
        fos.flush();
        fos.close();

        is = new FileInputStream(testFile);
    }

    @After
    public void teardown() throws IOException {
        assertTrue(testFile.delete());
    }

    @Test
    public void testNotifiedOfAllBytesNoEventCompletedFired() throws InterruptedException,
            IOException {
        // By default we should not recieve a event completed event

        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {

                synchronized (countMap) {
                    if (countMap.size() >= 3) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    Integer curr = countMap.get(progressEvent.getBytesTransferred());
                    if (curr == null) {
                        curr = 0;
                    }
                    countMap.put(progressEvent.getBytesTransferred(), ++curr);
                    countMap.notifyAll();
                }

            }

        };

        ProgressListenerCallbackExecutor executor = new ProgressListenerCallbackExecutor(listener);

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(is, executor);
            while (testStream.read() != -1) {
            }
        } finally {
            testStream.close();
        }

        callback.executor.shutdown();
        assertTrue(callback.executor.awaitTermination(10, TimeUnit.SECONDS));
        callback.executor = callback.createNewExecutorService();

        assertTrue(countMap.size() == 2);
        assertEquals(countMap.get(new Long(1024)).intValue(), 1);
        assertEquals(countMap.get(new Long(8192)).intValue(), 2);
    }

    @Test
    public void testNotifiedOfAllByteWithEventCompletedFired() throws InterruptedException,
            IOException {
        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {

                synchronized (countMap) {
                    if (countMap.size() >= 3) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    if (progressEvent.getBytesTransferred() == 1024) {
                        assertTrue(progressEvent.eventCode == ProgressEvent.COMPLETED_EVENT_CODE);
                    }
                    Integer curr = countMap.get(progressEvent.getBytesTransferred());
                    if (curr == null) {
                        curr = 0;
                    }
                    countMap.put(progressEvent.getBytesTransferred(), ++curr);
                    countMap.notifyAll();
                }

            }

        };

        ProgressListenerCallbackExecutor executor = new ProgressListenerCallbackExecutor(listener);

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(is, executor);
            testStream.setFireCompletedEvent(true);
            while (testStream.read() != -1) {
            }
        } finally {
            testStream.close();
        }

        callback.executor.shutdown();
        assertTrue(callback.executor.awaitTermination(10, TimeUnit.SECONDS));
        callback.executor = callback.createNewExecutorService();

        assertTrue(countMap.size() == 2);
        assertEquals(countMap.get(new Long(1024)).intValue(), 1);
        assertEquals(countMap.get(new Long(8192)).intValue(), 2);
    }

    @Test
    public void testNotifiedOfReset() throws InterruptedException,
            IOException {
        byte[] buff = new byte[numberOfBytesToWrite];
        is.read(buff);
        ByteArrayInputStream bais = new ByteArrayInputStream(buff);

        final Map<Long, Integer> countMap = new HashMap<Long, Integer>();
        ProgressListener listener = new ProgressListener() {

            @Override
            public void progressChanged(ProgressEvent progressEvent) {

                synchronized (countMap) {
                    if (countMap.size() >= 2) {
                        fail("Unexpected progress event found: " + progressEvent);
                    }
                    if (progressEvent.getBytesTransferred() == 500) {
                        assertTrue(progressEvent.getEventCode() == ProgressEvent.RESET_EVENT_CODE);
                        Integer curr = countMap.get(progressEvent.getBytesTransferred());
                        if (curr == null) {
                            curr = 0;
                        }

                        countMap.put(progressEvent.getBytesTransferred(), ++curr);
                        countMap.notifyAll();
                    }
                }

            }

        };

        ProgressListenerCallbackExecutor executor = new ProgressListenerCallbackExecutor(listener);

        ProgressReportingInputStream testStream = null;
        try {
            testStream = new ProgressReportingInputStream(bais, executor);
            testStream.mark(600);
            byte[] bytes = new byte[500];
            testStream.read(bytes);
            testStream.reset();
        } finally {
            testStream.close();
        }

        callback.executor.shutdown();
        assertTrue(callback.executor.awaitTermination(10, TimeUnit.SECONDS));
        callback.executor = callback.createNewExecutorService();

        assertTrue(countMap.size() == 1);
        assertEquals(countMap.get(new Long(500)).intValue(), 1);
    }
}
