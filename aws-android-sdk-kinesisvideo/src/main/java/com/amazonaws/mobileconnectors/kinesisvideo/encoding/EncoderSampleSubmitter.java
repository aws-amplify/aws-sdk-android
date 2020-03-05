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

package com.amazonaws.mobileconnectors.kinesisvideo.encoding;

import java.nio.ByteBuffer;

import android.media.Image;
import android.media.MediaCodec;
import android.support.annotation.NonNull;

/**
 * Utility class to submit samples to the encoder.
 *
 */
public class EncoderSampleSubmitter {
    private static final long NS_IN_US = 1000;
    private static final long NS_IN_MS = 1000000;
    private static final int FROM_START = 0;
    private static final int NO_FLAGS = 0;
    private static final int DEQUEUE_NOW = -1;

    private final MediaCodec mEncoder;
    private long mFirstFrameTimestamp = -1;

    public EncoderSampleSubmitter(final MediaCodec encoder) {
        mEncoder = encoder;
    }

    public void submitSampleToEncoder(final @NonNull ByteBuffer byteBuffer,
                                      final int readBytes,
                                      final boolean endOfStream) {

        // encoders are super sensitive to the timestamps, careful here
        final long timestamp = nanosSinceFirstFrame();
        queueInputBuffer(byteBuffer, readBytes, timestamp / NS_IN_US, endOfStream);
    }

    private void queueInputBuffer(final @NonNull ByteBuffer byteBuffer,
                                  final int readBytes,
                                  final long timestampInUS,
                                  final boolean endOfStream) {

        final int flags = endOfStream ? MediaCodec.BUFFER_FLAG_END_OF_STREAM : NO_FLAGS;

        // step one. get the info about the encoder input buffer
        final int inputBufferIndex = mEncoder.dequeueInputBuffer(DEQUEUE_NOW);
        final ByteBuffer tmpBuffer = mEncoder.getInputBuffer(inputBufferIndex);
        final int tmpSize = byteBuffer.remaining();

        // step two. copy the frame into the encoder input
        tmpBuffer.put(byteBuffer);

        // step three. submit the buffer into the encoder
        mEncoder.queueInputBuffer(
                inputBufferIndex,
                FROM_START,
                tmpSize,
                timestampInUS,
                flags);
    }

    private long nanosSinceFirstFrame() {
        final long currentTime = System.currentTimeMillis();
        if (mFirstFrameTimestamp < 0) {
            mFirstFrameTimestamp = currentTime;
        }
        return (currentTime - mFirstFrameTimestamp) * NS_IN_MS;
    }
}