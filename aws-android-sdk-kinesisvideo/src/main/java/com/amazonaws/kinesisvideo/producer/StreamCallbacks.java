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

package com.amazonaws.kinesisvideo.producer;

import android.support.annotation.NonNull;

/**
 *
 * Interface to the Kinesis Video Producer Stream Callbacks functionality.
 *
 * These will be used to report various stream latency pressures and
 * report dropped frames.
 *
 *
 */
public interface StreamCallbacks
{
    /**
     * Reports the stream underflow.
     */
    void streamUnderflowReport() throws ProducerException;

    /**
     * Reports the stream latency pressure.
     * @param duration The buffer duration in 100ns.
     * @throws ProducerException
     */
    void streamLatencyPressure(long duration) throws ProducerException;

    /**
     * Reports the stream staleness when the data is read and sent but no ACKs are received.
     * @param lastAckDuration The duration of time window when the last "buffering" ACK is received in 100ns.
     * @throws ProducerException
     */
    void streamConnectionStale(long lastAckDuration) throws ProducerException;

    /**
     * Reports the received ACK.
     * @param fragmentAck The received fragment ACK.
     * @throws ProducerException
     */
    void fragmentAckReceived(@NonNull final KinesisVideoFragmentAck fragmentAck) throws ProducerException;

    /**
     * Reports a dropped frame for the stream.
     * @param frameTimecode Frame time code of the dropped frame.
     * @throws ProducerException
     */
    void droppedFrameReport(long frameTimecode) throws ProducerException;

    /**
     * Reports a dropped fragment for the stream.
     * @param fragmentTimecode Fragment time code of the dropped fragment.
     * @throws ProducerException
     */
    void droppedFragmentReport(long fragmentTimecode) throws ProducerException;

    /**
     * Reports an error for the stream. The client should terminate the connection
     * as the inlet host would have/has already terminated the connection.
     *
     * @param fragmentTimecode Fragment time code of the errored fragment.
     * @param statusCode Status code of the failure.
     * @throws ProducerException
     */
    void streamErrorReport(long fragmentTimecode, long statusCode) throws ProducerException;

    /**
     * New data is available for the stream.
     * @param uploadHandle The client stream upload handle.
     * @param duration The duration of content available in the stream.
     * @param availableSize The size of the content available in the stream.
     * @throws ProducerException
     */
    void streamDataAvailable(long uploadHandle, long duration, long availableSize) throws ProducerException;

    /**
     * Ready to stream data.
     * @throws ProducerException
     */
    void streamReady() throws ProducerException;

    /**
     * Stream has been closed.
     * @param uploadHandle The client stream upload handle.
     * @throws ProducerException
     */
    void streamClosed(long uploadHandle) throws ProducerException;
}
