package com.amazonaws.kinesisvideo.internal.mediasource;

import java.nio.ByteBuffer;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;

public interface OnStreamDataAvailable {
    void onFrameDataAvailable(final ByteBuffer data) throws KinesisVideoException;
    void onFragmentMetadataAvailable(final String metadataName, final String metadataValue, final boolean persistent)
            throws KinesisVideoException;
}
