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

import java.util.Arrays;
import java.util.List;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.ImageReader;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.CameraFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.EncodingCancellationToken;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.CodecPrivateDataAvailableListener;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;

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
 * Android camera wrapper
 */
public class AndroidCameraMediaSource implements MediaSource {

    private static final String TAG = AndroidCameraMediaSource.class.getSimpleName();

    private static final int TWO_FRAMES_BUFFER = 2;

    private final Context mContext;
    private final String mStreamName;

    private CameraFramesSource mCameraFramesSource;
    private EncodingCancellationToken mEncodingCancellationToken;
    private List<Surface> mPreivewSurfaces;

    private MediaSourceState mMediaSourceState;
    private CameraMediaSourceConfiguration mMediaSourceConfiguration;
    private MediaSourceSink mMediaSourceSink;

    public interface OpenCameraCallback {
        void onOpened();
        void onError(final KinesisVideoException e);
    }

    public interface CaptureCallback {
        void onStarted();
        void onFailed();
    }

    public AndroidCameraMediaSource(final String streamName, final Context context) {
        mContext = context;
        mStreamName = streamName;
        mEncodingCancellationToken = new EncodingCancellationToken();
    }

    public void setPreviewSurfaces(final Surface ... surfaces) {
        mPreivewSurfaces = Arrays.asList(surfaces);
    }

    private CameraFramesSource createFramesSource(final ImageReader imageReader) {
        mEncodingCancellationToken = new EncodingCancellationToken();

        final CameraFramesSource cameraFramesSource = new CameraFramesSource(
                imageReader,
                mMediaSourceConfiguration,
                mEncodingCancellationToken);

        cameraFramesSource.setCodecPrivateDataListener(waitForCodecPrivateData());
        cameraFramesSource.setFramesListener(pushFrameToSink());
        return cameraFramesSource;
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

    @Override
    public void initialize(@NonNull final MediaSourceSink mediaSourceSink) throws KinesisVideoException {
        mMediaSourceSink = mediaSourceSink;
        mMediaSourceState = MediaSourceState.INITIALIZED;
    }

    @Override
    public void configure(final MediaSourceConfiguration configuration) {
        if (!(configuration instanceof CameraMediaSourceConfiguration)) {
            throw new IllegalArgumentException(
                    "expected instance of CameraMediaSourceConfiguration"
                            + ", received " + configuration);
        }

        mMediaSourceConfiguration = (CameraMediaSourceConfiguration) configuration;
        mCameraFramesSource = createFramesSource(createImageReader());
    }

    private ImageReader createImageReader() {
        return ImageReader
                .newInstance(
                        mMediaSourceConfiguration.getHorizontalResolution(),
                        mMediaSourceConfiguration.getVerticalResolution(),
                        ImageFormat.YUV_420_888,
                        TWO_FRAMES_BUFFER);

    }

    @Override
    public void start() throws KinesisVideoException {
        mMediaSourceState = MediaSourceState.RUNNING;
        startEncoding();
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
        return null;
    }

    private void startEncoding() {
        Log.i(TAG, "encoding starting");

        mCameraFramesSource.startEncoding(
                mContext,
                mPreivewSurfaces,
                mMediaSourceConfiguration.getCameraId());
    }

    private void stopEncoding() {
        Log.i(TAG, "encoding stopping");

        if (mEncodingCancellationToken == null) {
            return;
        }

        mEncodingCancellationToken.cancelEncoding();
        mEncodingCancellationToken = null;
    }

    private CodecPrivateDataAvailableListener waitForCodecPrivateData() {
        return new CodecPrivateDataAvailableListener() {
            @Override
            public void onCodecPrivateDataAvailable(final byte[] privateData) {
                updateSinkWithPrivateData(privateData);
            }
        };
    }

    private void updateSinkWithPrivateData(final byte[] privateData) {
        try {
            Log.i(TAG, "updating sink with codec private data");
            mMediaSourceSink.onCodecPrivateData(privateData);
        } catch (final KinesisVideoException e) {
            Log.e(TAG, "error updating sink with codec private data", e);
            throw new RuntimeException("error updating sink with codec private data", e);
        }
    }

    private FrameAvailableListener pushFrameToSink() {
        return new FrameAvailableListener() {
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

    @Override
    public MediaSourceSink getMediaSourceSink() {
        return mMediaSourceSink;
    }
}
