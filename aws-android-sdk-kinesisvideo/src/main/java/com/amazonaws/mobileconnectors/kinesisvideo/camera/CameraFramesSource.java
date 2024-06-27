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

package com.amazonaws.mobileconnectors.kinesisvideo.camera;

import static com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.FrameAvailableListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper;
import com.amazonaws.mobileconnectors.kinesisvideo.encoding.EncoderWrapper.CodecPrivateDataAvailableListener;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource;

/**
 * Utility class, Binds together encoder, camera wrapper, and camera frames image reader
 */
public class CameraFramesSource {
    private static final String TAG = CameraFramesSource.class.getSimpleName();

    private EncoderWrapper mEncoderWrapper;
    private CodecPrivateDataAvailableListener mCodecPrivateDataListener;
    private FrameAvailableListener mFrameAvailableListener;
    private CameraAdapter mCameraAdapter;
    private boolean mIsReleased = false;
    private final ImageReader mImageReader;
    private final CameraMediaSourceConfiguration mMediaSourceConfiguration;
    private final EncodingCancellationToken mEncodingCancellationToken;

    public CameraFramesSource(final ImageReader imageReader,
                              final CameraMediaSourceConfiguration mediaSourceConfiguration,
                              final EncodingCancellationToken encodingCancellationToken) {

        mMediaSourceConfiguration = mediaSourceConfiguration;
        mEncodingCancellationToken = encodingCancellationToken;
        mImageReader = imageReader;
        mImageReader.setOnImageAvailableListener(getOnImageAvailableListener(), null);
    }

    private ImageReader.OnImageAvailableListener getOnImageAvailableListener() {
        return new ImageReader.OnImageAvailableListener() {
            @Override
            public void onImageAvailable(final ImageReader imageReader) {
                final Image image = imageReader.acquireNextImage();
                mEncoderWrapper.encodeFrame(image, mEncodingCancellationToken.isEncodingCancelled());
                image.close();

                if (mEncodingCancellationToken.isEncodingCancelled()) {
                    release();
                    return;
                }
            }
        };
    }

    public void startEncoding(final Context context,
                              final List<Surface> previewSurfaces,
                              final String cameraId) {

        final List<Surface> cameraOutputSurfaces = new ArrayList<Surface>();
        cameraOutputSurfaces.addAll(previewSurfaces);
        cameraOutputSurfaces.add(mImageReader.getSurface());

        CameraFramesSourceRunnableWrapper.startEncoding(
                this,
                context,
                cameraOutputSurfaces,
                cameraId);
    }      

    private static class CameraFramesSourceRunnableWrapper implements Runnable {
        private final List<Surface> mCameraOutputSurfaces;
        private final CameraFramesSource mCameraFramesSource;
        private final Context mContext;

        private final String mCameraId;

        private CameraFramesSourceRunnableWrapper(final CameraFramesSource cameraFramesSource,
                                                  final Context context,
                                                  final List<Surface> cameraOutputSurfaces,
                                                  final String cameraId) {
            mCameraFramesSource = cameraFramesSource;
            mContext = context;
            mCameraOutputSurfaces = cameraOutputSurfaces;
            mCameraId = cameraId;
        }

        @Override
        public void run() {
            try {
                mCameraFramesSource.startCapturing(
                        mContext,
                        mCameraOutputSurfaces,
                        mCameraId);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static void startEncoding(final CameraFramesSource test,
                                         final Context context,
                                         final List<Surface> cameraOutputSurfaces,
                                         final String cameraId) {
            CameraFramesSourceRunnableWrapper wrapper = new CameraFramesSourceRunnableWrapper(
                    test,
                    context,
                    cameraOutputSurfaces,
                    cameraId);
            Thread th = new Thread(wrapper, "CameraFramesSource");
            th.start();
        }
    }

    private void startCapturing(final Context context,
                                final List<Surface> cameraOutputSurfaces,
                                final String cameraId) throws IOException {
        try {
            mEncoderWrapper = new EncoderWrapper(mMediaSourceConfiguration);
            mEncoderWrapper.setCodecPrivateDataAvailableListener(mCodecPrivateDataListener);
            mEncoderWrapper.setEncodedFrameAvailableListener(mFrameAvailableListener);

            prepareCameraAndPreview(
                    context,
                    cameraOutputSurfaces,
                    cameraId);
        } catch (final Throwable e) {
            Log.e(TAG, "encoder loop exception" + threadId(), e);
        }
    }

    public void setCodecPrivateDataListener(final CodecPrivateDataAvailableListener listener) {
        mCodecPrivateDataListener = listener;
    }

    public void setFramesListener(final FrameAvailableListener listener) {
        mFrameAvailableListener = listener;
    }

    private void prepareCameraAndPreview(final Context context,
                                         final List<Surface> cameraOutputSurfaces,
                                         final String cameraId) {

        if (mCameraAdapter != null) {
            Log.e(TAG, "starting camera frames source second time" + threadId());
            throw new RuntimeException("starting camera frames source second time");
        }

        mCameraAdapter = new CameraAdapter(context, cameraId);
        Log.i(TAG, "camera adapter");

        mCameraAdapter.openCamera(startPreviewWhenReady(cameraOutputSurfaces));
    }

    private void release() {
        if (mIsReleased) {
            return;
        }

        mIsReleased = true;
        Log.i(TAG, "releasing everything");
        mEncoderWrapper.stop();
        releaseCamera();
        Log.i(TAG, "released everything");
    }

    private void releaseCamera() {
        try {
            mCameraAdapter.closeCamera();
        } catch (final Throwable e) {
            Log.e(TAG, "error releasing camera");
        }
    }

    private AndroidCameraMediaSource.OpenCameraCallback startPreviewWhenReady(
            final List<Surface> cameraOutputSurfaces) {

        return new AndroidCameraMediaSource.OpenCameraCallback() {
            @Override
            public void onOpened() {
                Log.i(TAG, "camera opened" + threadId());
                mCameraAdapter.startPreview(cameraOutputSurfaces, getCaptureCallback());
            }

            @Override
            public void onError(final KinesisVideoException e) {
                Log.e(TAG, "failed to open camera" + threadId(), e);
                release();
                throw new RuntimeException(e);
            }
        };
    }

    private AndroidCameraMediaSource.CaptureCallback getCaptureCallback() {
        return new AndroidCameraMediaSource.CaptureCallback() {
            @Override
            public void onStarted() {
                Log.i(TAG, "capture started" + threadId());
            }

            @Override
            public void onFailed() {
                Log.i(TAG, "capture failed" + threadId());
            }
        };
    }

    private static String threadId() {
        return " | threadId=" + Thread.currentThread().getId();
    }
}
