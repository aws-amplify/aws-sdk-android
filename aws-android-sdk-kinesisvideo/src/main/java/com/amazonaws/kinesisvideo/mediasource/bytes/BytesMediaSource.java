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

package com.amazonaws.kinesisvideo.mediasource.bytes;

import com.amazonaws.kinesisvideo.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.mediasource.OnFrameDataAvailable;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

import android.support.annotation.NonNull;
import java.nio.ByteBuffer;

public class BytesMediaSource implements MediaSource {
    private static final String TAG = "BytesMediaSource";
    private static final long HUNDREDS_OF_NANOS_IN_MS = 10 * 1000;
    private static final int KEY_FRAME_EVERY_60_FRAMES = 60;
    private static final int FRAME_FLAG_KEY_FRAME = 1;
    private static final int FRAME_FLAG_NONE = 0;
    private static final long DEFAULT_FRAME_DURATION_33MS = 33L;

    private BytesMediaSourceConfiguration configuration;
    private MediaSourceState mediaSourceState;
    private MediaSourceSink mediaSourceSink;
    private BytesGenerator bytesGenerator;
    private int frameIndex;
    private long lastTimestampMillis;


    @Override
    public MediaSourceState getMediaSourceState() {
        return mediaSourceState;
    }

    @Override
    public MediaSourceConfiguration getConfiguration() {
        return configuration;
    }

    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        this.mediaSourceSink = mediaSourceSink;
    }

    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof BytesMediaSourceConfiguration)) {
            throw new IllegalArgumentException("can only use BytesMediaSourceConfiguration");
        }

        this.configuration = (BytesMediaSourceConfiguration) configuration;
    }

    @Override
    public void start() throws KinesisVideoException {
        mediaSourceState = MediaSourceState.RUNNING;
        bytesGenerator = new BytesGenerator(configuration.getFps());
        bytesGenerator.onFrameDataAvailable(createFrameAndPushToProducer());
        bytesGenerator.start();
    }

    private OnFrameDataAvailable createFrameAndPushToProducer() {
        return new OnFrameDataAvailable() {
            @Override
            public void onFrameDataAvailable(final ByteBuffer data) {
                final long currentTimeMs = System.currentTimeMillis();
                final long decodingTs = currentTimeMs * HUNDREDS_OF_NANOS_IN_MS;
                final long presentationTs = currentTimeMs * HUNDREDS_OF_NANOS_IN_MS;
                final long msSinceLastFrame = currentTimeMs - lastTimestampMillis;
                final long frameDuration = lastTimestampMillis == 0
                        ? DEFAULT_FRAME_DURATION_33MS * HUNDREDS_OF_NANOS_IN_MS
                        : msSinceLastFrame * HUNDREDS_OF_NANOS_IN_MS / 2;

                final int flags = isKeyFrame()
                        ? FRAME_FLAG_KEY_FRAME
                        : FRAME_FLAG_NONE;


                final KinesisVideoFrame frame = new KinesisVideoFrame(
                        frameIndex++,
                        flags,
                        decodingTs,
                        presentationTs,
                        frameDuration,
                        data);

                // ignore frame of size 0 or duration of 0
                if (frame.getSize() == 0 || frameDuration == 0) {
                    return;
                }

                lastTimestampMillis = currentTimeMs;
                submitFrameOnUIThread(frame);
            }
        };
    }

    private boolean isKeyFrame() {
        return frameIndex % KEY_FRAME_EVERY_60_FRAMES == 0;
    }

    private void submitFrameOnUIThread(final KinesisVideoFrame frame) {
        try {
            mediaSourceSink.onFrame(frame);
        } catch (final KinesisVideoException e) {
            // TODO: log/throw
        }
    }

    @Override
    public void stop() throws KinesisVideoException {
        if (bytesGenerator != null) {
            bytesGenerator.stop();
        }

        mediaSourceState = MediaSourceState.STOPPED;
    }

    @Override
    public boolean isStopped() {
        return mediaSourceState == MediaSourceState.STOPPED;
    }

    @Override
    public void free() throws KinesisVideoException { }
}
