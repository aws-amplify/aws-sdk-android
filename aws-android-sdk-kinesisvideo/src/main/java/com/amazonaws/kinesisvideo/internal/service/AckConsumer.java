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

package com.amazonaws.kinesisvideo.internal.service;

import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;
import com.amazonaws.kinesisvideo.producer.ProducerException;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class AckConsumer implements Consumer<InputStream> {
    private static final long STOPPED_TIMEOUT_IN_MILLISECONDS = 15000;
    private static final int FOUR_KB = 4096;
    private static final String END_OF_STREAM_MSG = "0";
    private final KinesisVideoProducerStream stream;
    private InputStream ackStream = null;
    private final CountDownLatch stoppedLatch;
    private final Log log;
    private final long uploadHandle;
    private volatile boolean closed = false;

    public AckConsumer(final long uploadHandle,
                       @NonNull final KinesisVideoProducerStream stream,
                       @NonNull final Log log) {
        this.stream = Preconditions.checkNotNull(stream);
        this.uploadHandle = uploadHandle;
        this.log = Preconditions.checkNotNull(log);
        this.stoppedLatch = new CountDownLatch(1);
    }

    @Override
    public void accept(final @NonNull InputStream inputStream) {
        ackStream = Preconditions.checkNotNull(inputStream);

        // Start a long running operation
        processAckInputStream();
    }

    @Nullable
    public InputStream getAckStream() {
        return ackStream;
    }

    private void processAckInputStream() {
        Preconditions.checkNotNull(stream);

        final byte[] buffer = new byte[FOUR_KB];
        int bytesRead;
        log.info("Starting ACK processing");
        try {
            while (!closed) {
                // This is a blocking operation
                bytesRead = ackStream.read(buffer);

                String bytesString = null;
                if (bytesRead > 0) {
                    bytesString = new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);
                }

                // Check for end-of-stream and 0 before processing
                if (bytesRead == -1 || END_OF_STREAM_MSG.equals(bytesString)) {
                    // End-of-stream
                    log.debug("Received end-of-stream for ACKs.");
                    closed = true;
                } else if (bytesRead != 0) {
                    log.debug("Received ACK bits: " + bytesString);
                    try {
                        stream.parseFragmentAck(uploadHandle, bytesString);
                    } catch (final ProducerException e) {
                        // Log the exception
                        log.exception(e, "Processing ACK threw an exception. Logging and continuing. ");
                    }
                }
            }

            log.debug("Finished reading ACKs stream");
        } catch (final IOException e) {
            // Log and exit
            log.exception(e);
        } finally {
            stoppedLatch.countDown();
        }
    }

    public void close() throws ProducerException {
        // Trigger stopping
        closed = true;

        // Close the stream
        try {
            if (ackStream != null) {
                ackStream.close();
            }
        } catch (final IOException e) {
            throw new ProducerException(e);
        }

        // Block until loop finished of timed out.
        try {
            if (!stoppedLatch.await(STOPPED_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
                throw new ProducerException("ACK stream stopping time out", 0);
            }
        } catch (final InterruptedException e) {
            throw new ProducerException(e);
        }
    }
}
