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

package com.amazonaws.internal;

import static org.junit.Assert.assertEquals;

import com.amazonaws.AbortedException;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SdkInputStreamTest {

    @Test
    public void testShouldAbort() throws InterruptedException {
        final List<Integer> abortionCount = new ArrayList<Integer>();

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                ByteArrayInputStream bais = new ByteArrayInputStream(
                        "Content".getBytes(StringUtils.UTF8));
                TestInputStream tis = new TestInputStream(bais);

                long counter = 0;
                while (counter < Long.MAX_VALUE) {
                    counter++;
                    if (Thread.currentThread().isInterrupted()) {
                        try {
                            tis.abortIfNeeded();
                        } catch (AbortedException e) {
                        }
                        abortionCount.add(tis.getAbortions());
                        break;
                    }
                }

            }

        });

        t.start();
        Thread.sleep(1000);
        t.interrupt();
        Thread.sleep(1000);
        assertEquals(abortionCount.size(), 1);
        assertEquals(abortionCount.get(0), new Integer(1));
    }

    private class TestInputStream extends SdkInputStream {

        InputStream wrapped;
        int abortions = 0;

        public TestInputStream(InputStream is) {
            wrapped = is;
        }

        @Override
        protected InputStream getWrappedInputStream() {
            return null;
        }

        @Override
        public int read() throws IOException {
            return wrapped.read();
        }

        @Override
        public void abort() throws IOException {
            abortions++;
        }

        public int getAbortions() {
            return abortions;
        }
    }

}
