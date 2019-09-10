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

package com.amazonaws.mobileconnectors.kinesisvideo.audio;

import static com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;

import java.io.IOException;
import java.nio.ByteBuffer;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.util.Log;

import com.amazonaws.kinesisvideo.client.mediasource.AudioMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.mediasource.OnStreamDataAvailable;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.EncodingCancellationToken;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.CodecPrivateDataAvailableListener;

/**
 * Utility class for audio encoder
 */
public class AudioFramesSource {
    private static final String TAG = AudioFramesSource.class.getSimpleName();

    private EncoderWrapper mEncoderWrapper;
    private OnStreamDataAvailable mListener;
    private boolean mIsReleased = false;
    private final AudioMediaSourceConfiguration mMediaSourceConfiguration;
    private final EncodingCancellationToken mEncodingCancellationToken;

    public AudioFramesSource(final AudioMediaSourceConfiguration mediaSourceConfiguration,
                              final EncodingCancellationToken encodingCancellationToken) {

        mMediaSourceConfiguration = mediaSourceConfiguration;
        mEncodingCancellationToken = encodingCancellationToken;
    }

    public void startEncoding(final Context context) {
        AudioFramesSourceRunnableWrapper.startEncoding(
                this,
                context);
    }

    private static class AudioFramesSourceRunnableWrapper implements Runnable {
        private final AudioFramesSource mFramesSource;
        private final Context mContext;

        private AudioFramesSourceRunnableWrapper(final AudioFramesSource framesSource,
                                                 final Context context) {
            mContext = context;
            mFramesSource = framesSource;
        }

        @Override
        public void run() {
            try {
                mFramesSource.startCapturing(mContext);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static void startEncoding(final AudioFramesSource framesSource,
                                         final Context context) {
            AudioFramesSourceRunnableWrapper wrapper = new AudioFramesSourceRunnableWrapper(
                    framesSource,
                    context);
            Thread th = new Thread(wrapper, "AudioFramesSource");
            th.start();
        }
    }

    private void startCapturing(final Context context) throws IOException {
        try {
            mEncoderWrapper = new EncoderWrapper(mMediaSourceConfiguration);
            mEncoderWrapper.setMkvDataListener(mListener);

            android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_URGENT_AUDIO);
            final int min_buffer_size = AudioRecord.getMinBufferSize(
                    mMediaSourceConfiguration.getSampleRate(), AudioFormat.CHANNEL_IN_MONO,
                    AudioFormat.ENCODING_PCM_16BIT);
            int buffer_size =
                    mMediaSourceConfiguration.getSamplesPerFrame() * mMediaSourceConfiguration.getFramesPerBuffer();
            if (buffer_size < min_buffer_size)
                buffer_size = ((min_buffer_size / mMediaSourceConfiguration.getSamplesPerFrame()) + 1)
                        * mMediaSourceConfiguration.getSamplesPerFrame() * 2;

            AudioRecord audioRecord = new AudioRecord(MediaRecorder.AudioSource.DEFAULT,
                    mMediaSourceConfiguration.getSampleRate(),
                    AudioFormat.CHANNEL_IN_MONO,
                    AudioFormat.ENCODING_PCM_16BIT,
                    buffer_size);
            if (audioRecord.getState() != AudioRecord.STATE_INITIALIZED) {
                throw new RuntimeException("Failed to get the audio to initialized state");
            }

            final ByteBuffer buffer = ByteBuffer.allocateDirect(min_buffer_size);

            // Start recording
            audioRecord.startRecording();

            int readBytes;
            try {
                while (!mIsReleased) {
                    buffer.clear();

                    readBytes = audioRecord.read(buffer, min_buffer_size);
                    if (readBytes > 0) {
                        buffer.position(readBytes);
                        buffer.flip();
                        mEncoderWrapper.encodeSample(buffer, readBytes, mEncodingCancellationToken.isEncodingCancelled());
                        if (mEncodingCancellationToken.isEncodingCancelled()) {
                            release();
                        }
                    }
                }
            } finally {
                audioRecord.stop();
                audioRecord.release();
            }
        } catch (final Throwable e) {
            Log.e(TAG, "encoder loop exception" + threadId(), e);
        }
    }

    public void setMkvDataListener(final OnStreamDataAvailable listener) {
        mListener = listener;
    }

    private void release() {
        if (mIsReleased) {
            return;
        }

        mIsReleased = true;
        Log.i(TAG, "releasing everything");
        mEncoderWrapper.stop();
        Log.i(TAG, "released everything");
    }

    private static String threadId() {
        return " | threadId=" + Thread.currentThread().getId();
    }
}