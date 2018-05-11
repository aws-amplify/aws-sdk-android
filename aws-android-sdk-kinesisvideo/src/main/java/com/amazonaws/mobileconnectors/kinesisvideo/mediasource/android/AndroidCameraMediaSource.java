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
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.CameraFramesSource;
import com.amazonaws.mobileconnectors.kinesisvideo.camera.EncodingCancellationToken;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.CodecPrivateDataAvailableListener;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;

/**
 * Android camera wrapper
 */
public class AndroidCameraMediaSource implements MediaSource {

    private static final String TAG = AndroidCameraMediaSource.class.getSimpleName();

    private static final int TWO_FRAMES_BUFFER = 2;

    private final Context mContext;

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

    public AndroidCameraMediaSource(final Context context) {
        mContext = context;
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
}
