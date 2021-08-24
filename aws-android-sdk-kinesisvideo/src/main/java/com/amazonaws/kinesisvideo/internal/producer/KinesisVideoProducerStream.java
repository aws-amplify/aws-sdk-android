package com.amazonaws.kinesisvideo.internal.producer;

import com.amazonaws.kinesisvideo.producer.KinesisVideoFragmentAck;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;

import java.io.InputStream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * KinesisVideo stream interface
 */

public interface KinesisVideoProducerStream extends StreamCallbacks {
    /**
     * Ready timeout value in milliseconds for the sync API
     */
    public static final long READY_TIMEOUT_IN_MILLISECONDS = 15000;

    /**
     * Stopped timeout value in milliseconds for the sync API
     */
    public static final long STOPPED_TIMEOUT_IN_MILLISECONDS = 15000;

    /**
     * Returns the input stream to retrieve the data from.
     *
     * NOTE: The returned stream should ideally be buffered
     * like {@link java.io.BufferedInputStream}
     *
     * IMPORTANT: During the streaming token rotation or when the underlying stream
     * gets closed the stream returned by this function will also close.
     * The caller then should re-acquire a new stream by calling this API again.
     *
     * @param uploadHandle Client stream upload handle.
     * @return {@link InputStream} for retrieving the data
     * @throws ProducerException
     */
    @NonNull
    InputStream getDataStream(final long uploadHandle) throws ProducerException;

    /**
     * Get stream data from the buffer.
     *
     * @param uploadHandle Client stream upload handle.
     * @param fillBuffer The buffer to fill
     * @param offset The start of the buffer
     * @param length The number of bytes to fill
     * @param readResult The result of the read
     * @throws ProducerException
     */
    void getStreamData(final long uploadHandle, final @NonNull byte[] fillBuffer, int offset, int length,
                       @NonNull final ReadResult readResult)
            throws ProducerException;

    /**
     * Puts a frame into the stream.
     */
    void putFrame(final @NonNull KinesisVideoFrame kinesisVideoFrame) throws ProducerException;

    /**
     * Puts a metadata into the stream.
     */
    void putFragmentMetadata(final @NonNull String metadataName, @NonNull String metadataValue, boolean persistent) throws ProducerException;

    /**
     * Reports an ACK for a fragment.
     *
     * @param uploadHandle Client stream upload handle.
     * @param kinesisVideoFragmentAck ACK string returned from the service.
     * @throws ProducerException
     */
    void fragmentAck(final long uploadHandle, final @NonNull KinesisVideoFragmentAck kinesisVideoFragmentAck) throws ProducerException;

    /**
     * Parses and processes a response which can contain partial/multiple fragment ACK.
     * @param uploadHandle Client stream upload handle.
     * @param kinesisVideoFragmentAck ACK string returned from the service.
     * @throws ProducerException
     */
    void parseFragmentAck(final long uploadHandle, final @NonNull String kinesisVideoFragmentAck) throws ProducerException;

    /**
     * Indicates that the stream format has changed.
     *
     * NOTE: CPD is @Nullable - specifying a null will remove the CPD.
     * NOTE: currently, only Codec Private Data is supported while not streaming.
     */
    void streamFormatChanged(final @Nullable byte[] codecPrivateData, final int trackId) throws ProducerException;

    /**
     * Returns the underlying native stream handle
     * @return
     */
    long getStreamHandle();

    /**
     * Returns the stream name
     */
    @NonNull
    String getStreamName();

    /**
     * Stops the Kinesis Video stream. This simply kicks off stop stream operation but doesn't await for the resulting
     * stream stopped notification.
     */
    void stopStream() throws ProducerException;

    /**
     * Stops the Kinesis Video stream and awaits for the stream stopped notification in a sync call.
     */
    void stopStreamSync() throws ProducerException;

    /**
     * Reports an abnormal stream termination
     * @param uploadHandle - Client stream upload handle.
     * @param statusCode - Status code of the termination.
     * @throws ProducerException
     */
    void streamTerminated(long uploadHandle, int statusCode) throws ProducerException;

    /**
     * Returns stream specific metrics.
     * @return Stream metrics
     * @throws ProducerException
     */
    @NonNull
    KinesisVideoStreamMetrics getMetrics() throws ProducerException;

    /**
     * Free the Kinesis Video stream.
     */
    void streamFreed() throws ProducerException;

    /**
     * Reset current connection of producer stream
     */
    void resetConnection() throws ProducerException;
}