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

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.ImageReader;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.internal.mediasource.DefaultOnStreamDataAvailable;
import com.amazonaws.kinesisvideo.internal.mediasource.OnStreamDataAvailable;
import com.amazonaws.kinesisvideo.internal.mediasource.multitrack.MultiTrackMediaSource;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.mobileconnectors.kinesisvideo.audio.AudioFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.CameraAVFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.EncodingCancellationToken;

import java.util.Arrays;
import java.util.List;

import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_AN_HOUR;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BITRATE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_GOP_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.KEYFRAME_FRAGMENTATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NOT_ADAPTIVE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.NO_KMS_KEY_ID;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECALCULATE_METRICS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RECOVER_ON_FAILURE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.REQUEST_FRAGMENT_ACKS;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.USE_FRAME_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.VERSION_ZERO;

public class AndroidAudioVideoMediaSource extends MultiTrackMediaSource {

    private static final String TAG = AndroidCameraMediaSource.class.getSimpleName();

    private static final int TWO_FRAMES_BUFFER = 2;

    private final Context mContext;
    private final String mStreamName;

    private CameraAVFramesSource mCameraAVFramesSource;
    private AudioFramesSource mAudioFramesSource;
    private EncodingCancellationToken mEncodingCancellationToken;
    private EncodingCancellationToken mEncodingCancellationTokenForAudio;
    private List<Surface> mPreivewSurfaces;

    private MediaSourceState mMediaSourceState;
    private AndroidAudioVideoMediaSourceConfiguration mMediaSourceConfiguration;
    private MediaSourceSink mMediaSourceSink;
    private OnStreamDataAvailable mListener;
    private final Object mStartMutex = new Object();

    public interface OpenCameraCallback {
        void onOpened();
        void onError(final KinesisVideoException e);
    }

    public interface CaptureCallback {
        void onStarted();
        void onFailed();
    }

    public AndroidAudioVideoMediaSource(final String streamName, final Context context) {
        super(streamName);
        mContext = context;
        mStreamName = streamName;
        mEncodingCancellationToken = new EncodingCancellationToken();
        mEncodingCancellationTokenForAudio = new EncodingCancellationToken();
    }

    public void setPreviewSurfaces(final Surface ... surfaces) {
        mPreivewSurfaces = Arrays.asList(surfaces);
    }

    private CameraAVFramesSource createFramesSource(final ImageReader imageReader) {
        mEncodingCancellationToken = new EncodingCancellationToken();

        final CameraAVFramesSource cameraAVFramesSource = new CameraAVFramesSource(
                imageReader,
                mMediaSourceConfiguration.getCameraMediaSourceConfiguration(),
                mEncodingCancellationToken);

        return cameraAVFramesSource;
    }

    private AudioFramesSource createAudioFramesSource() {
        mEncodingCancellationTokenForAudio = new EncodingCancellationToken();

        final AudioFramesSource audioFramesSource = new AudioFramesSource(
                mMediaSourceConfiguration.getAudioMediaSourceConfiguration(),
                mEncodingCancellationTokenForAudio);

        return audioFramesSource;
    }

    @Override
    public MediaSourceState getMediaSourceState() {
        return mMediaSourceState;
    }

    @Override
    public MediaSourceConfiguration getConfiguration() {
        return mMediaSourceConfiguration;
    }

    @Override
    public StreamInfo getStreamInfo() throws KinesisVideoException {
        return new StreamInfo(VERSION_ZERO,
                mStreamName,
                StreamInfo.StreamingType.STREAMING_TYPE_REALTIME,
                mMediaSourceConfiguration.getContentType(),
                NO_KMS_KEY_ID,
                mMediaSourceConfiguration.getRetentionPeriodInHours()
                        * HUNDREDS_OF_NANOS_IN_AN_HOUR,
                NOT_ADAPTIVE,
                mMediaSourceConfiguration.getLatencyPressure(),
                DEFAULT_GOP_DURATION,
                KEYFRAME_FRAGMENTATION,
                USE_FRAME_TIMECODES,
                mMediaSourceConfiguration.isAbsoluteTimecode(),
                REQUEST_FRAGMENT_ACKS,
                RECOVER_ON_FAILURE,
                DEFAULT_BITRATE, // start bit rate for statistics
                mMediaSourceConfiguration.getFps(),
                mMediaSourceConfiguration.getBufferDuration(),
                mMediaSourceConfiguration.getReplayDuration(),
                mMediaSourceConfiguration.getStalenessDuration(),
                mMediaSourceConfiguration.getTimecodeScale(),
                RECALCULATE_METRICS,
                null,
                mMediaSourceConfiguration.getNalAdaptationFlag(),
                null,
                mMediaSourceConfiguration.getTrackInfoList());
    }

    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        super.initialize(mediaSourceSink);
        mMediaSourceSink = mediaSourceSink;
        mMediaSourceState = MediaSourceState.INITIALIZED;
        mListener = new DefaultOnStreamDataAvailable(mMediaSourceSink);
        mAudioFramesSource.setMkvDataListener(mListener);
        mCameraAVFramesSource.setMkvDataListener(mListener);
    }

    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof AndroidAudioVideoMediaSourceConfiguration)) {
            throw new IllegalArgumentException(
                    "expected instance of CameraMediaSourceConfiguration"
                            + ", received " + configuration);
        }

        mMediaSourceConfiguration = (AndroidAudioVideoMediaSourceConfiguration) configuration;
        mCameraAVFramesSource = createFramesSource(createImageReader());
        mAudioFramesSource = createAudioFramesSource();

    }

    private ImageReader createImageReader() {
        return ImageReader
                .newInstance(
                        mMediaSourceConfiguration.getCameraMediaSourceConfiguration().getHorizontalResolution(),
                        mMediaSourceConfiguration.getCameraMediaSourceConfiguration().getVerticalResolution(),
                        ImageFormat.YUV_420_888,
                        TWO_FRAMES_BUFFER);

    }

    @Override
    public void start() throws KinesisVideoException {
        mMediaSourceState = MediaSourceState.RUNNING;
        startEncoding();
        startAudioEncoding();
    }

    @Override
    public void stop() throws KinesisVideoException {
        stopEncoding();
        mMediaSourceState = MediaSourceState.STOPPED;
    }

    @Override
    public boolean isStopped() {
        return mMediaSourceState == MediaSourceState.STOPPED;
    }

    @Override
    public void free() throws KinesisVideoException {

    }

    @Nullable
    @Override
    public StreamCallbacks getStreamCallbacks() {
        return mMediaSourceConfiguration.getStreamCallbacks();
    }

    private void startEncoding() {
        Log.i(TAG, "encoding starting");

        mCameraAVFramesSource.startEncoding(
                mContext,
                mPreivewSurfaces,
                mMediaSourceConfiguration.getCameraMediaSourceConfiguration().getCameraId(),
                mStartMutex);
    }

    private void startAudioEncoding() {
        Log.i(TAG, "audio encoding starting");

        mAudioFramesSource.startEncoding(mContext, mStartMutex);
    }

    private void stopEncoding() {
        Log.i(TAG, "encoding stopping");

        if (mEncodingCancellationToken == null) {
            return;
        }

        mEncodingCancellationToken.cancelEncoding();
        mEncodingCancellationToken = null;
        mEncodingCancellationTokenForAudio.cancelEncoding();
        mEncodingCancellationTokenForAudio = null;
    }

    @Override
    public MediaSourceSink getMediaSourceSink() {
        return mMediaSourceSink;
    }
}
