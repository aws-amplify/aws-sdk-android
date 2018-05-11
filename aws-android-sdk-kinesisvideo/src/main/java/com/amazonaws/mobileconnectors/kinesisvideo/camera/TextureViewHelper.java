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

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource.CaptureCallback;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource.OpenCameraCallback;

import java.util.Arrays;

public class TextureViewHelper {
    private static final String FRAGMENT_DIALOG = "fragmentDialog";

    private final Activity mActivity;
    private final CameraAdapter mCameraAdapter;
    private final TextureView mTextureView;
    private TextureReadyListener mTextureReadyListener;

    public interface TextureReadyListener {
        void onTextureReady();
    }

    public TextureViewHelper(final Activity activity,
                             final CameraAdapter cameraAdapter,
                             final TextureView textureView) {
        mActivity = activity;
        mCameraAdapter = cameraAdapter;
        mTextureView = textureView;
    }

    public void setTextureReadyListener(final TextureReadyListener textureReadyListener) {
        mTextureReadyListener = textureReadyListener;
        if (mTextureView.isAvailable()) {
            mTextureReadyListener.onTextureReady();
        } else {
            mTextureView.setSurfaceTextureListener(callListenerWhenReady());
        }
    }

    private SurfaceTextureListener callListenerWhenReady() {
        return new SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture,
                                                  final int width,
                                                  final int height) {
                mTextureReadyListener.onTextureReady();
            }

            @Override
            public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture,
                                                    final int width,
                                                    final int height) {
            }

            @Override
            public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {

            }
        };
    }

    public void startPreviewWhenTextureReady(final CaptureCallback captureCallback) {
        if (mTextureView.isAvailable()) {
            mCameraAdapter.openCamera(startPreviewWhenCameraOpen(captureCallback));
        } else {
            mTextureView.setSurfaceTextureListener(openCameraWhenTextureReady(captureCallback));
        }
    }

    private SurfaceTextureListener openCameraWhenTextureReady(
            final CaptureCallback captureCallback) {

        return new SurfaceTextureListener() {

            @Override
            public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture,
                                                  final int width,
                                                  int height) {
                mCameraAdapter.openCamera(startPreviewWhenCameraOpen(captureCallback));
            }

            @Override
            public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture,
                                                    final int width,
                                                    final int height) {
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return true;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
    }

    private OpenCameraCallback startPreviewWhenCameraOpen(final CaptureCallback captureCallback) {
        return new OpenCameraCallback() {
            @Override
            public void onOpened() {
                mCameraAdapter.startPreview(
                        Arrays.asList(new Surface(mTextureView.getSurfaceTexture())),
                        captureCallback);
            }

            @Override
            public void onError(final KinesisVideoException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
