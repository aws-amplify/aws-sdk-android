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

package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidUrlMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.CameraFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper;

import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_AN_HOUR;
import static com.amazonaws.kinesisvideo.producer.Time.NANOS_IN_A_TIME_UNIT;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BUFFER_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_GOP_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_REPLAY_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_STALENESS_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.KEYFRAME_FRAGMENTATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NOT_ADAPTIVE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NO_KMS_KEY_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECALCULATE_METRICS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECOVER_ON_FAILURE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.REQUEST_FRAGMENT_ACKS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.SDK_GENERATES_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VERSION_ZERO;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.MAX_LATENCY;

/**
 * Android Url MediaSource.
 */
public class AndroidUrlMediaSource implements MediaSource {
    private static final String TAG = AndroidUrlMediaSource.class.getSimpleName();

    private final String mStreamName;
    private MediaSourceState mMediaSourceState;
    private AndroidUrlMediaSourceConfiguration mMediaSourceConfiguration;
    private MediaSourceSink mMediaSourceSink;
    private EncoderWrapper mEncoderWrapper;
    private Thread mDecoderThread;

    /**
     * Constructor to create a new AndroidUrlMediaSource given a KVS stream name.
     * @param streamName KVS Stream name.
     */
    public AndroidUrlMediaSource(final String streamName) {
        mStreamName = streamName;
    }

    /**
     * Get the current state of this media source.
     * @return Current MediaSourceState.
     */
    @Override
    public MediaSourceState getMediaSourceState() {
        return mMediaSourceState;
    }

    /**
     * Get current configuration of this media source.
     * @return Current MediaSourceConfiguration.
     */
    @Override
    public MediaSourceConfiguration getConfiguration() {
        return mMediaSourceConfiguration;
    }

    /**
     * Get the StreamInfo for this media source based on the current configuration.
     * @return StreamInfo object.
     * @throws KinesisVideoException
     */
    @Override
    public StreamInfo getStreamInfo() throws KinesisVideoException {
        // Need to fix-up the content type as the Console playback only accepts video/h264 and will fail
        // if the mime type is video/avc which is the default in Android.
        String contentType = mMediaSourceConfiguration.getEncoderMimeType();
        if (contentType.equals("video/avc")) {
            contentType = "video/h264";
        }

        return new StreamInfo(VERSION_ZERO,
                mStreamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                contentType,
                NO_KMS_KEY_ID,
                mMediaSourceConfiguration.getRetentionPeriodInHours()
                        * HUNDREDS_OF_NANOS_IN_AN_HOUR,
                NOT_ADAPTIVE,
                MAX_LATENCY,
                DEFAULT_GOP_DURATION,
                KEYFRAME_FRAGMENTATION,
                SDK_GENERATES_TIMECODES,
                mMediaSourceConfiguration.getIsAbsoluteTimecode(),
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                StreamInfo.codecIdFromContentType(mMediaSourceConfiguration.getEncoderMimeType()),
                StreamInfo.createTrackName(mMediaSourceConfiguration.getEncoderMimeType()),
                mMediaSourceConfiguration.getBitRate(),
                mMediaSourceConfiguration.getFrameRate(),
                DEFAULT_BUFFER_DURATION,
                DEFAULT_REPLAY_DURATION,
                DEFAULT_STALENESS_DURATION,
                mMediaSourceConfiguration.getTimeScale() / NANOS_IN_A_TIME_UNIT,
                RECALCULATE_METRICS,
                mMediaSourceConfiguration.getCodecPrivateData(),
                new Tag[] {
                        new Tag("device", "Test Device"),
                        new Tag("stream", "Test Stream") },
                mMediaSourceConfiguration.getNalAdaptationFlags());
    }

    /**
     * Initialize this media source with given MediaSourceSink. This method will be called by the SDK.
     * @param mediaSourceSink The MediaSourceSink object to use.
     * @throws KinesisVideoException
     */
    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        mMediaSourceSink = mediaSourceSink;
        mMediaSourceState = MediaSourceState.INITIALIZED;
    }

    /**
     * Configures this media source with the given MediaSourceConfiguration.
     * @param configuration
     */
    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof AndroidUrlMediaSourceConfiguration)) {
            throw new IllegalArgumentException(
                    "expected instance of AndroidUrlMediaSourceConfiguration"
                            + ", received " + configuration);
        }

        mMediaSourceConfiguration = (AndroidUrlMediaSourceConfiguration) configuration;
        createFramesSource();
    }

    /**
     * Start the decoding of the video url. It starts a new thread and processses the video decoding
     * on that thread.
     * @throws KinesisVideoException
     */
    @Override
    public void start() throws KinesisVideoException {
        mMediaSourceState = MediaSourceState.RUNNING;
        startDecoding();
    }

    /**
     * Stop the decoding of the video url. This is a no-op if this media source is already stopped.
     * @throws KinesisVideoException
     */
    @Override
    public void stop() throws KinesisVideoException {
        mMediaSourceState = MediaSourceState.STOPPED;
        stopDecoding();
    }

    /**
     * Checks if this media source is stopped.
     * @return True if stopped.
     */
    @Override
    public boolean isStopped() {
        return mMediaSourceState == MediaSourceState.STOPPED;
    }

    /**
     * Free resources for this media source. It just calls stop which will release the resources.
     */
    @Override
    public void free() throws KinesisVideoException {
        stop();
    }

    /**
     * This is a no-op for this media source class.
     * @return
     */
    @Nullable
    @Override
    public StreamCallbacks getStreamCallbacks() {
        return null;
    }

    /**
     * Get the MediaSourceSink object associatea with this media source.
     * @return Associated MediaSourceSink object.
     */
    @Override
    public MediaSourceSink getMediaSourceSink() {
        return mMediaSourceSink;
    }

    /**
     * Helper method to create and configure EncoderWrapper as well as setup callbacks.
     */
    private synchronized void createFramesSource() {
        try {
            mEncoderWrapper = new EncoderWrapper(mMediaSourceConfiguration);
            mEncoderWrapper.setCodecPrivateDataAvailableListener(waitForCodecPrivateData());
            mEncoderWrapper.setEncodedFrameAvailableListener(pushFrameToSink());
        } catch (final Throwable e) {
            Log.e(TAG, "EncoderWrapper init exception" + threadId(), e);
        }
    }

    /**
     * Thread safe method to start this media source. It creates a new thread and starts decoding the
     * url on this thread. The thread is kept alive until stopDecoding call or EOS occurs.
     */
    private synchronized void startDecoding() {
        Log.i(TAG, "Decoding starting");

        mDecoderThread = new Thread(() -> decodeVideoToYUV(mMediaSourceConfiguration.getUrl()));
        mDecoderThread.start();

        Log.i(TAG, "Decoding started");
    }

    /**
     * Thread safe method to stop this media source. It blocks till the decoder thread has exited.
     */
    private synchronized void stopDecoding() {
        Log.i(TAG, "Decoding stopping");

        mEncoderWrapper = null;

        while(mDecoderThread != null){
            try{
                this.wait(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        Log.i(TAG, "Decoding stopped");
    }

    /**
     * This is the main entry point of the threads. It created and configures MediaExtractor and decoder
     * to create YUV frames from the video url. It blocks until a stopDecoding call or EOS.
     * @param videoUrl
     */
    private void decodeVideoToYUV(String videoUrl) {
        MediaExtractor extractor = null;
        MediaCodec decoder = null;

        try {
            // Create and configure the MediaExtractor.
            extractor = new MediaExtractor();
            extractor.setDataSource(videoUrl);

            // Identify video track index.
            int trackIndex = selectTrack(extractor);
            if (trackIndex < 0) {
                Log.e(TAG, "No video track found in " + videoUrl);
                return;
            }

            // Create decoder for the video track.
            extractor.selectTrack(trackIndex);
            MediaFormat format = extractor.getTrackFormat(trackIndex);
            decoder = MediaCodec.createDecoderByType(format.getString(MediaFormat.KEY_MIME));

            // Configure and start the decoder.
            format.setInteger(MediaFormat.KEY_COLOR_FORMAT, MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Flexible);
            decoder.configure(format, null, null, 0);
            decoder.start();

            // Process the entire video.
            decodeVideo(extractor, decoder);

        } catch (IOException e) {
            Log.e(TAG, "Error setting data source", e);

        } finally {
            Log.i(TAG, "Decoding thread clean up begin.");
            // Clean up in a thread safe way.
            synchronized (AndroidUrlMediaSource.this){
                if (decoder != null) {
                    decoder.stop();
                    decoder.release();
                }
                extractor.release();

                mMediaSourceState = MediaSourceState.STOPPED;

                mEncoderWrapper = null;
                mDecoderThread = null;
            }
            Log.i(TAG, "Decoding thread clean up done.");
        }
    }

    /**
     * Helper function to identify video track index.
     * @param extractor Media extractor object configured with the video source.
     * @return Video track index.
     */
    private int selectTrack(MediaExtractor extractor) {
        int numTracks = extractor.getTrackCount();
        for (int i = 0; i < numTracks; i++) {
            MediaFormat format = extractor.getTrackFormat(i);
            String mime = format.getString(MediaFormat.KEY_MIME);

            // Return index of the first video track found.
            if (mime.startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Blocking function to process a complete video source all the way to EOS or until it was interrupted.
     * @param extractor MediaExtractor with video sources configured on it.
     * @param codec MediaCodec decoder with configuration already applied on it.
     */
    private void decodeVideo(MediaExtractor extractor, MediaCodec codec) {
        final int TIMEOUT_US = 10000;
        MediaCodec.BufferInfo info = new MediaCodec.BufferInfo();

        // Loop over the entire length of the video source.
        boolean isEOS = false;
        outer:
        while (!Thread.interrupted()) {
            // Read from MediaExtractor and feed inut buffers of the decoder until EOS was found.
            if (!isEOS) {
                int inIndex = codec.dequeueInputBuffer(TIMEOUT_US);
                if (inIndex >= 0) {
                    ByteBuffer buffer = codec.getInputBuffer(inIndex);
                    int sampleSize = extractor.readSampleData(buffer, 0);
                    if (sampleSize < 0) {
                        // End of stream
                        codec.queueInputBuffer(inIndex, 0, 0, 0, MediaCodec.BUFFER_FLAG_END_OF_STREAM);
                        isEOS = true;
                    } else {
                        codec.queueInputBuffer(inIndex, 0, sampleSize, extractor.getSampleTime(), 0);
                        extractor.advance();
                    }
                }
            }

            // Get decoder output buffer and retrieve YUV Image and pass the same on to EncoderWrapper.
            int outIndex = codec.dequeueOutputBuffer(info, TIMEOUT_US);
            switch (outIndex) {
                case MediaCodec.INFO_OUTPUT_BUFFERS_CHANGED:
                    break;

                case MediaCodec.INFO_OUTPUT_FORMAT_CHANGED:
                    MediaFormat format = codec.getOutputFormat();
                    Log.d(TAG, "New format " + format);
                    break;

                case MediaCodec.INFO_TRY_AGAIN_LATER:
                    break;

                default:
                    if (info.size == 0) {
                        Log.w(TAG, "empty buffer " + outIndex);
                        codec.releaseOutputBuffer(outIndex, false);
                        break;
                    }

                    // Get outout Image object.
                    final Image yuvImage = codec.getOutputImage(outIndex);
                    if (yuvImage == null) {
                        throw new RuntimeException("decoder output image " + outIndex + " is null");
                    }

                    // Pass to EncoderWrapper in thread safe way.
                    synchronized (AndroidUrlMediaSource.this) {
                        if (mEncoderWrapper == null) {
                            Log.i(TAG, "Quitting decoding loop.");
                            break outer;
                        }

                        mEncoderWrapper.encodeFrame(yuvImage, isEOS);
                    }

                    codec.releaseOutputBuffer(outIndex, false);
                    break;
            }

            // Break off if all decoded frames have been rendered.
            if ((info.flags & MediaCodec.BUFFER_FLAG_END_OF_STREAM) != 0) {
                break;
            }
        }
    }

    /**
     * Helper function to return a listener object for codec private data. The listener will eventually
     * pass the data on to the KVS producer SDK's MediaSourceSink object.
     * @return Listener object.
     */
    private EncoderWrapper.CodecPrivateDataAvailableListener waitForCodecPrivateData() {
        return new EncoderWrapper.CodecPrivateDataAvailableListener() {
            @Override
            public void onCodecPrivateDataAvailable(final byte[] privateData) {
                try {
                    Log.i(TAG, "updating sink with codec private data");
                    mMediaSourceSink.onCodecPrivateData(privateData);
                } catch (final KinesisVideoException e) {
                    Log.e(TAG, "error updating sink with codec private data", e);
                    throw new RuntimeException("error updating sink with codec private data", e);
                }
            }
        };
    }

    /**
     * Helper function to return a listener object for frame data. The listener will eventually
     * pass the data on to the KVS producer SDK's MediaSourceSink object.
     * @return Listener object.
     */
    private EncoderWrapper.FrameAvailableListener pushFrameToSink() {
        return new EncoderWrapper.FrameAvailableListener() {
            @Override
            public void onFrameAvailable(final KinesisVideoFrame frame) {
                try {
                    Log.i(TAG, "updating sink with frame");
                    mMediaSourceSink.onFrame(frame);
                } catch (final KinesisVideoException e) {
                    Log.e(TAG, "error updating sink with frame", e);
                }
            }
        };
    }

    /**
     * Helper function to return a string with the thread ID of the current thread.
     * @return String with thread ID of the current thread.
     */
    private static String threadId() {
        return " | threadId=" + Thread.currentThread().getId();
    }
}
