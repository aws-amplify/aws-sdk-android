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

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.encoding.ChunkDecoder;
import com.amazonaws.kinesisvideo.model.ResponseStatus;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;
import com.amazonaws.kinesisvideo.internal.service.exception.AccessDeniedException;
import com.amazonaws.kinesisvideo.internal.service.exception.AmazonServiceException;
import com.amazonaws.kinesisvideo.internal.service.exception.ResourceNotFoundException;

import androidx.annotation.NonNull;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class BlockingAckConsumer implements Consumer<InputStream> {
    private static final long RESPONSE_TIMEOUT_IN_MILLISECONDS = 10000;
    private static final int HTTP_OK = 200;
    private static final int HTTP_BAD_REQUEST = 400;
    private static final int HTTP_NOT_FOUND = 404;
    private static final int HTTP_ACCESS_DENIED = 403;
    private final Consumer<InputStream> inputStreamConsumer;
    private final CountDownLatch responseLatch;
    private Exception storedException;
    private Log log;
    private KinesisVideoProducerStream kinesisVideoProducerStream;

    public BlockingAckConsumer(@NonNull final Consumer<InputStream> inputStreamConsumer, Log log,
                               @NonNull final KinesisVideoProducerStream kinesisVideoProducerStream) {
        this.inputStreamConsumer = checkNotNull(inputStreamConsumer);
        this.responseLatch = new CountDownLatch(1);
        this.log = log;
        this.kinesisVideoProducerStream = kinesisVideoProducerStream;
    }

    @Override
    public void accept(final @NonNull InputStream inputStream) {
        checkNotNull(inputStream);

        // Await for the header
        try {
            final ResponseStatus responseStatus = ChunkDecoder.readStatusLine(inputStream);
            final int responseCode = responseStatus.getStatusCode();
            switch (responseCode) {
                case HTTP_OK:
                    log.debug(String.format("PutMedia call for stream %s return OK with request id %s",
                            kinesisVideoProducerStream.getStreamName(), ChunkDecoder.decodeHeaders(inputStream)));
                    break;
                case HTTP_BAD_REQUEST:
                    throw new AmazonServiceException("PutMedia call returned bad request: "
                            + responseStatus.getReason());
                case HTTP_NOT_FOUND:
                    throw new ResourceNotFoundException("Resource not found: " + responseStatus.getReason());
                case HTTP_ACCESS_DENIED:
                    throw new AccessDeniedException("Access is denied: " + responseStatus.getReason());
                default:
                    throw new AmazonServiceException("PutMedia call returned status code " + responseCode +
                            " with reason: " + responseStatus.getReason());
            }
        } catch (final Exception e) {
            // Store the exception
            storedException = e;
        }
        finally {
            responseLatch.countDown();
        }

        // Forward to the origin if no exceptions have been thrown
        if (storedException == null) {
            inputStreamConsumer.accept(inputStream);
        }
    }

    public void awaitResponse() throws KinesisVideoException {
        // Block until loop finished of timed out.
        try {
            if (!responseLatch.await(RESPONSE_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
                throw new KinesisVideoException("Getting PutMedia Response timed out");
            }
        } catch (final InterruptedException e) {
            throw new KinesisVideoException(e);
        } finally {
            if (storedException != null) {
                if (storedException instanceof KinesisVideoException) {
                    throw (KinesisVideoException) storedException;
                } else {
                    throw new KinesisVideoException(storedException);
                }
            }
        }
    }
}
