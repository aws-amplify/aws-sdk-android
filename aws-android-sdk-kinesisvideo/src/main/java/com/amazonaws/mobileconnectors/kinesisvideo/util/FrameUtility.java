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

package com.amazonaws.mobileconnectors.kinesisvideo.util;

import java.nio.ByteBuffer;

import android.media.MediaCodec;
import android.util.Log;

import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

public class FrameUtility {
    private static final String TAG = FrameUtility.class.getSimpleName();
    private static final int FRAME_FLAG_KEY_FRAME = 1;
    private static final int FRAME_FLAG_NONE = 0;
    private static final long FRAME_DURATION_2_MS = 2L;
    private static final long HUNDREDS_OF_NANOS_IN_MS = 10 * 1000;

    public static KinesisVideoFrame createFrame(
            final MediaCodec.BufferInfo bufferInfo,
            final long timeCodeMs,
            final int frameIndex,
            final ByteBuffer encodedFrameData) {

        final long currentTimeMs = System.currentTimeMillis();

        final int flags = isKeyFrame(bufferInfo) ? FRAME_FLAG_KEY_FRAME : FRAME_FLAG_NONE;

        Log.d(TAG, "frame timestamp: " + currentTimeMs
                + ", index: " + frameIndex
                + ", duration: " + FRAME_DURATION_2_MS
                + ", keyFrame: " + isKeyFrame(bufferInfo)
                + ", flags: " + flags);
        // time is zero, currently the stream will use wall clock internally
        return new KinesisVideoFrame(
                frameIndex,
                flags,
                currentTimeMs * HUNDREDS_OF_NANOS_IN_MS,
                currentTimeMs * HUNDREDS_OF_NANOS_IN_MS,
                FRAME_DURATION_2_MS * HUNDREDS_OF_NANOS_IN_MS,
                encodedFrameData);
    }

    private static boolean isKeyFrame(final MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & MediaCodec.BUFFER_FLAG_KEY_FRAME) != 0;
    }
}
