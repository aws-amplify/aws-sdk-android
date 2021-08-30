package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_TRACK_ID;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;

/**
 * Implementation of the MediaSourceSink interface that pushes frames and stream configuration
 * into an instance of KinesisVideoProducerStream.
 *
 * Primary purpose of this is to be used by the KinesisVideoClient implementation.
 *
 * For example, when an instance of media source is being created or registered with KinesisVideoClient,
 * an instance of this sink is created, and the media source is initialized with this.
 *
 * It's then media source's job to produce the frames and push them into the sink
 * it has been initialized with
 */
public class ProducerStreamSink implements MediaSourceSink {
    private final KinesisVideoProducerStream producerStream;

    public ProducerStreamSink(final KinesisVideoProducerStream producerStream) {
        this.producerStream = producerStream;
    }

    @Override
    public void onFrame(@NonNull final KinesisVideoFrame kinesisVideoFrame) throws KinesisVideoException {
        checkNotNull(kinesisVideoFrame);
        producerStream.putFrame(kinesisVideoFrame);
    }

    @Override
    public void onCodecPrivateData(@Nullable final byte[] codecPrivateData) throws KinesisVideoException {
        onCodecPrivateData(codecPrivateData, DEFAULT_TRACK_ID);
    }

    @Override
    public void onCodecPrivateData(@Nullable final byte[] bytes, int trackId) throws KinesisVideoException {
        producerStream.streamFormatChanged(bytes, trackId);
    }

    @Override
    public void onFragmentMetadata(final String metadataName, final String metadataValue, final boolean persistent)
            throws KinesisVideoException {
        producerStream.putFragmentMetadata(metadataName, metadataValue, persistent);
    }

    @Override
    public KinesisVideoProducerStream getProducerStream() {
        return producerStream;
    }
}
