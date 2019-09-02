/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.internal.mediasource.bytes;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.internal.mediasource.OnStreamDataAvailable;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.stream.throttling.DiscreteTimePeriodsThrottler;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static com.amazonaws.kinesisvideo.producer.FrameFlags.FRAME_FLAG_KEY_FRAME;
import static com.amazonaws.kinesisvideo.producer.FrameFlags.FRAME_FLAG_NONE;
import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

public class BytesGenerator {
    private static final int DISCRETENESS_10HZ = 10;
    private static final int MAX_FRAME_SIZE_BYTES_1024 = 1024;
    private static final int KEY_FRAME_EVERY_60_FRAMES = 60;
    private static final long DEFAULT_FRAME_DURATION_33MS = 33L;

    private OnStreamDataAvailable streamDataAvailable;

    private final ExecutorService executor = Executors.newFixedThreadPool(1);
    private final DiscreteTimePeriodsThrottler throttler;
    private final byte[][] framesData = new byte[][]{
            new byte[MAX_FRAME_SIZE_BYTES_1024],
            new byte[MAX_FRAME_SIZE_BYTES_1024],
            new byte[MAX_FRAME_SIZE_BYTES_1024],
            new byte[MAX_FRAME_SIZE_BYTES_1024],
            new byte[MAX_FRAME_SIZE_BYTES_1024],
            new byte[MAX_FRAME_SIZE_BYTES_1024]
    };

    private final Log log = LogFactory.getLog(BytesGenerator.class);
    private volatile boolean isRunning;
    private int frameCounter;

    public BytesGenerator(final int fps) {
        frameCounter = 0;
        throttler = new DiscreteTimePeriodsThrottler(fps, DISCRETENESS_10HZ);
    }

    public void onStreamDataAvailable(final OnStreamDataAvailable streamDataAvailable) {
        this.streamDataAvailable = streamDataAvailable;
    }

    public synchronized void start() {
        if (isRunning) {
            throw new IllegalStateException("should stop previous generator before starting the new one");
        }

        isRunning = true;

        startGeneratorInBackground();
    }

    public synchronized void stop() {
        isRunning = false;
    }

    private void startGeneratorInBackground() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    generateBytesAndNotifyListener();
                } catch (final KinesisVideoException e) {
                    log.error("Failed to keep generating frames with Exception", e);
                }
            }
        });
    }

    private void generateBytesAndNotifyListener() throws KinesisVideoException {
        while (isRunning) {
            fillArrayWithDigitsOfFramesCounter();

            if (streamDataAvailable != null) {
                streamDataAvailable
                        .onFrameDataAvailable(createKinesisVideoFrame());
            }

            frameCounter++;

            throttler.throttle();
        }
    }

    private KinesisVideoFrame createKinesisVideoFrame() {
        final long currentTimeMs = System.currentTimeMillis();
        final long decodingTs = currentTimeMs * HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
        final long presentationTs = currentTimeMs * HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

        final long frameDuration = DEFAULT_FRAME_DURATION_33MS * HUNDREDS_OF_NANOS_IN_A_MILLISECOND / 2;

        final int flags = isKeyFrame() ? FRAME_FLAG_KEY_FRAME : FRAME_FLAG_NONE;

        return new KinesisVideoFrame(frameCounter,
                flags,
                decodingTs,
                presentationTs,
                frameDuration,
                ByteBuffer.wrap(framesData[frameCounter % framesData.length]));
    }

    private boolean isKeyFrame() {
        return frameCounter % KEY_FRAME_EVERY_60_FRAMES == 0;
    }

    private void fillArrayWithDigitsOfFramesCounter() {
        final String counterString = String.valueOf(frameCounter) + "|";
        final byte[] counterBytes = counterString.getBytes(StandardCharsets.US_ASCII);
        final byte[] frameData = this.framesData[frameCounter % this.framesData.length];

        for (int i = 0; i < frameData.length; i++) {
            frameData[i] = counterBytes[i % counterBytes.length];
        }
    }
}
