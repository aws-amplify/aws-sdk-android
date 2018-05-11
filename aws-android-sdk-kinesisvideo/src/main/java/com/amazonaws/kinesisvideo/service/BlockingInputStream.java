/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.service;

import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import android.support.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/**
 * Implementation of an {@link InputStream} which blocks read operations until triggered
 */
public class BlockingInputStream extends InputStream {
    private final Object monitor;
    private final InputStream inputStream;
    private final Log log;
    private boolean unblocked;

    public BlockingInputStream(@NonNull final InputStream inputStream,
                               @NonNull final Log log) {
        this.inputStream = Preconditions.checkNotNull(inputStream);
        this.log = Preconditions.checkNotNull(log);
        this.unblocked = false;
        this.monitor = new Object();
    }

    @Override
    public int read() throws IOException {
        // Await until unblocked
        await();
        return inputStream.read();
    }

    @Override
    public int read(byte[] b,
                    int off,
                    int len)
            throws IOException {
        await();
        return inputStream.read(b, off, len);
    }

    @Override
    public int read(byte[] b)
            throws IOException {
        await();
        return inputStream.read(b);
    }

    @Override
    public void close()
            throws IOException {
        unblock();
        inputStream.close();
    }

    public void unblock() {
        synchronized (monitor) {
            unblocked = true;
            log.debug("Stream unblocked notification.");
            monitor.notify();
        }
    }

    private void await() {
        synchronized (monitor) {
            while (!unblocked) {
                try {
                    monitor.wait();
                } catch (final InterruptedException e) {
                    log.exception(e, "Waiting for the data stream to become unblocked threw an interrupted exception. Continuing...");
                }
            }
        }
    }
}
