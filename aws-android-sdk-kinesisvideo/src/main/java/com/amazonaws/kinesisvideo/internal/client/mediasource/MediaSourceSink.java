package com.amazonaws.kinesisvideo.internal.client.mediasource;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Acts as a media source sink
 *
 *
 */
public interface MediaSourceSink {
    /**
     * Offers a frame from the source.
     */
    void onFrame(final @NonNull KinesisVideoFrame kinesisVideoFrame) throws KinesisVideoException;

    void onCodecPrivateData(final @Nullable byte[] codecPrivateData) throws KinesisVideoException;

    void onCodecPrivateData(final @Nullable byte[] codecPrivateData, final int trackId) throws KinesisVideoException;

    void onFragmentMetadata(final @NonNull String metadataName, final @NonNull String metadataValue, final boolean persistent)
            throws KinesisVideoException;

    KinesisVideoProducerStream getProducerStream();
}
