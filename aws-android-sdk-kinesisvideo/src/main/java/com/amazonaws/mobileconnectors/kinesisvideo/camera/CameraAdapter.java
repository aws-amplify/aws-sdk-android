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
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraMetadata;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource.OpenCameraCallback;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CameraAdapter {
    private static final String TAG = "CameraAdapter";
    
    private CameraDevice mCameraDevice;

    private Semaphore mCameraOpenCloseLock = new Semaphore(1);

    private HandlerThread mBackgroundThread;

    private final Context mContext;

    private String mCameraId;

    private Handler mBackgroundHandler;

    private CameraCaptureSession mActivePreviewSession;

    public CameraAdapter(final Context context, final String cameraId) {
        mContext = context;
        mCameraId = cameraId;
    }

    public void openCamera(final OpenCameraCallback cameraOpenCameraCallback) {
        startBackgroundThread();
        if (null == mContext || (isActivityFinishing(mContext))) {
            Log.i(TAG, "trying to open camera when activity is stopped" + threadId());
            return;
        }

        Log.i(TAG, "trying to open camera" + threadId());
        final CameraManager manager = (CameraManager) mContext.getSystemService(Context.CAMERA_SERVICE);
        try {
            tryAcquireLock();
            manager.openCamera(mCameraId, adaptCameraStateCallback(cameraOpenCameraCallback), new Handler(Looper.getMainLooper()));
        } catch (final CameraAccessException e) {
            Log.e(TAG, "failed to open camera" + threadId(), e);
            cameraOpenCameraCallback.onError(new KinesisVideoException(e));
        } catch (final NullPointerException e) {
            Log.e(TAG, "failed to open camera" + threadId(), e);
            cameraOpenCameraCallback.onError(new KinesisVideoException(e));
        } catch (final InterruptedException e) {
            Log.e(TAG, "failed to open camera" + threadId(), e);
            cameraOpenCameraCallback.onError(new KinesisVideoException(e));
        } catch (final SecurityException e) {
            Log.e(TAG, "Permission issue " + threadId(), e);
            cameraOpenCameraCallback.onError(new KinesisVideoException(e));
        }
    }

    private boolean isActivityFinishing(final Context context) {
        return Activity.class.isAssignableFrom(context.getClass())
                && ((Activity) context).isFinishing();
    }

    private void startBackgroundThread() {
        mBackgroundThread = new HandlerThread("CameraBackground");
        mBackgroundThread.start();
        mBackgroundHandler = new Handler(mBackgroundThread.getLooper());
    }

    private void tryAcquireLock() throws InterruptedException {
        Log.d(TAG, "try acquire" + threadId());
        if (!mCameraOpenCloseLock.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
            throw new RuntimeException("Time out waiting to lock camera opening." + threadId());
        }
    }

    private CameraDevice.StateCallback adaptCameraStateCallback(final OpenCameraCallback cameraOpenCameraCallback) {
        return  new CameraDevice.StateCallback() {
            @Override
            public void onOpened(final CameraDevice cameraDevice) {
                Log.i(TAG, "opened" + threadId());
                mCameraDevice = cameraDevice;
                mCameraOpenCloseLock.release();
                cameraOpenCameraCallback.onOpened();
            }

            @Override
            public void onDisconnected(final CameraDevice cameraDevice) {
                Log.i(TAG, "disconnected" + threadId());
                mCameraOpenCloseLock.release();
                cameraDevice.close();
                mCameraDevice = null;
            }

            @Override
            public void onError(final CameraDevice cameraDevice, final int error) {
                Log.i(TAG, "error" + threadId());
                mCameraOpenCloseLock.release();
                cameraDevice.close();
                mCameraDevice = null;
                cameraOpenCameraCallback.onError(new KinesisVideoException("blah"));
            }
        };
    }

    public void closeCamera() {
        stopActiveSession();
        releaseCamera();
        stopBackgroundThread();
    }

    private void stopActiveSession() {
        try {
            Log.d(TAG, "stopping active capture session");
            mActivePreviewSession.stopRepeating();
            mActivePreviewSession.close();
        } catch (final CameraAccessException e) {
            Log.e(TAG, "unable to stop repeating capture session", e);
        }
    }

    private void releaseCamera() {
        Log.d(TAG, "releasing camera");
        try {
            mCameraOpenCloseLock.acquire();
            if (null != mCameraDevice) {
                mCameraDevice.close();
                mCameraDevice = null;
            }
        } catch (final InterruptedException e) {
            throw new RuntimeException("Interrupted while trying to lock camera closing." + threadId());
        } finally {
            mCameraOpenCloseLock.release();
        }
    }

    private void stopBackgroundThread() {
        Log.d(TAG, "stopping background thread");
        mBackgroundThread.quit();
        mBackgroundThread = null;
        mBackgroundHandler = null;
        Log.d(TAG, "stopped background thread");
    }

    public void startPreview(final List<Surface> previewSurfaces,
                             final AndroidCameraMediaSource.CaptureCallback captureCallback) {
        try {
            closeActivePreviewSession();

            mCameraDevice.createCaptureSession(
                    previewSurfaces,
                    adaptCaptureSessionCallback(previewSurfaces, captureCallback),
                    mBackgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private void closeActivePreviewSession() {
        if (mActivePreviewSession != null) {
            mActivePreviewSession.close();
            mActivePreviewSession = null;
        }
    }

    private CameraCaptureSession.StateCallback adaptCaptureSessionCallback(
            final List<Surface> previewSurfaces,
            final AndroidCameraMediaSource.CaptureCallback captureCallback) {

        return new CameraCaptureSession.StateCallback() {
            @Override
            public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
                Log.i(TAG, "created capture session" + threadId());
                mActivePreviewSession = cameraCaptureSession;
                captureContinously(previewSurfaces);
                captureCallback.onStarted();
            }

            @Override
            public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
                Log.i(TAG, "failed to create capture session" + threadId());
                captureCallback.onFailed();
            }
        };
    }

    private void captureContinously(
//            final CameraManager cameraManager,
            final List<Surface> previewSurfaces) {
        try {
//            CameraCharacteristics characteristics = cameraManager.getCameraCharacteristics(mCameraId);
//            StreamConfigurationMap configs = characteristics.get(
//                    CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);

            final CaptureRequest.Builder previewRequestBuilder =
                    mCameraDevice.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW);

            for (final Surface surface : previewSurfaces) {
                previewRequestBuilder.addTarget(surface);
            }

            previewRequestBuilder.set(
                    CaptureRequest.CONTROL_MODE,
                    CameraMetadata.CONTROL_MODE_AUTO);

            mActivePreviewSession.setRepeatingRequest(
                    previewRequestBuilder.build(),
                    null,
                    mBackgroundHandler);
        } catch (final CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private String threadId() {
        return " | threadId=" + Thread.currentThread().getId();
    }
}
