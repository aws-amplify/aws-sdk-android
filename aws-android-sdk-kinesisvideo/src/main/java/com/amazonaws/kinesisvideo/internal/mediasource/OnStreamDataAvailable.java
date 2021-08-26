package com.amazonaws.kinesisvideo.internal.mediasource;

import java.nio.ByteBuffer;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

public interface OnStreamDataAvailable {
    default void onFrameDataAvailable(final ByteBuffer frame) throws KinesisVideoException {
    }
    default void onFrameDataAvailable(final KinesisVideoFrame frame) throws KinesisVideoException {
    }
    default void onFragmentMetadataAvailable(final String metadataName, final String metadataValue,
                                             final boolean persistent) throws KinesisVideoException {
    }
}
