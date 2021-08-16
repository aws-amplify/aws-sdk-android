package com.amazonaws.kinesisvideo.producer;

import androidx.annotation.NonNull;

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
     * @param uploadHandle The client stream upload handle.
     * @param fragmentAck The received fragment ACK.
     * @throws ProducerException
     */
    void fragmentAckReceived(long uploadHandle, @NonNull final KinesisVideoFragmentAck fragmentAck) throws ProducerException;

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
     * @param uploadHandle The client stream upload handle.
     * @param fragmentTimecode Fragment time code of the errored fragment.
     * @param statusCode Status code of the failure.
     * @throws ProducerException
     */
    void streamErrorReport(long uploadHandle, long fragmentTimecode, long statusCode) throws ProducerException;

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

    /**
     * Stream temporal buffer pressure.
     * @param remainDuration Remaining duration in the buffer in hundreds of nanos.
     * @throws ProducerException
     */
    void bufferDurationOverflowPressure(long remainDuration) throws ProducerException;
}
