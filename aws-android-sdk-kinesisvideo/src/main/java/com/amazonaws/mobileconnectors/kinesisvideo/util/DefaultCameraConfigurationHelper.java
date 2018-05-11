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

package com.amazonaws.mobileconnectors.kinesisvideo.util;

import static com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType.H264;
import static com.amazonaws.mobileconnectors.kinesisvideo.util.CameraHardwareCapabilitiesHelper.getCameraInfo;
import static com.amazonaws.mobileconnectors.kinesisvideo.util.CameraHardwareCapabilitiesHelper.getSupportedResolutionsForYUV420_888;
import static com.amazonaws.mobileconnectors.kinesisvideo.util.VideoEncoderUtils.getSupportedEncoder;

import java.util.List;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Size;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.mobileconnectors.kinesisvideo.data.MimeType;

/**
 * Helper class to create a default camera configuration.
 * Tries to find a combination of supported camera resolution, encoder configuration, etc.
 * The configuration produced is expected to be used as is to instantiate
 * a working camera media source
 */
public class DefaultCameraConfigurationHelper {
    private static final String TAG = DefaultCameraConfigurationHelper.class.getSimpleName();
    private static final Size RESOLUTION_640x480 = new Size(640, 480);
    private static final int DEFAULT_FRAMERATE = 25;
    private static final int DEFAULT_BITRATE = 1000000;
    private static final int DEFAULT_GOP_DURATION = 2000;
    private static final int DEFAULT_TIMESCALE = 1000000;
    private static final Size ZERO_RESOLUTION = new Size(0, 0);

    public static CameraMediaSourceConfiguration.Builder getSupportedCameraConfiguration(
            final Context context,
            final String cameraId) {

        final CameraCharacteristics cameraInfo = getCameraInfo(context, cameraId);
        final Size supportedResolution = getSupportedResolution(context, cameraId);
        final MediaCodecInfo supportedEncoder = getSupportedEncoder();
        final String encoderMimeType = getMimeType(supportedEncoder);
        final boolean isHardwareAccelerated =
                VideoEncoderUtils.isHardwareAccelerated(supportedEncoder);

        return CameraMediaSourceConfiguration
                .builder()
                .withCameraId(cameraId)
                .withCameraFacing(getFacing(cameraInfo))
                .withCameraOrientation(getOrientation(cameraInfo))
                .withHorizontalResolution(supportedResolution.getWidth())
                .withVerticalResolution(supportedResolution.getHeight())
                .withGopDurationMillis(DEFAULT_GOP_DURATION)
                .withFrameTimeScale(DEFAULT_TIMESCALE)
                .withEncodingBitRate(DEFAULT_BITRATE)
                .withFrameRate(DEFAULT_FRAMERATE)
                .withEncodingMimeType(encoderMimeType)
                .withIsEncoderHardwareAccelerated(isHardwareAccelerated);
    }

    /**
     * Select either 640x480 or below, if supported. Otherwise select a first supported resolution
     * returned by the camera API regardless of its dimensions.
     *
     * @throws RuntimeException if no supported resolution can be found for YUV_420_888
     */
    private static Size getSupportedResolution(final Context context, final String cameraId) {
        final List<Size> supportedResolutions =
                getSupportedResolutionsForYUV420_888(context, cameraId);

        final Size under640 = select640orBelow(supportedResolutions);

        return ZERO_RESOLUTION.equals(under640)
                ? supportedResolutions.get(0)
                : under640;
    }

    private static Size select640orBelow(final List<Size> resolutions) {
        Size tmpSize = ZERO_RESOLUTION;
        for (final Size resolution : resolutions) {
            if (resolution.getWidth() <= RESOLUTION_640x480.getWidth()
                    && tmpSize.getWidth() <= resolution.getWidth()
                    && resolution.getHeight() <= RESOLUTION_640x480.getHeight()
                    && tmpSize.getHeight() <=resolution.getHeight()) {

                tmpSize = resolution;
            }
        }

        return tmpSize;
    }


    private static String getMimeType(final MediaCodecInfo encoder) {
        return isH264(encoder)
                ? H264.getMimeType()
                : pickAnySupportedMime(encoder);
    }

    private static boolean isH264(final MediaCodecInfo encoder) {
        for (final String encoderMime : encoder.getSupportedTypes()) {
            if (MimeType.H264.getMimeType().equalsIgnoreCase(encoderMime)) {
                return true;
            }
        }

        return false;
    }

    private static String pickAnySupportedMime(final MediaCodecInfo encoder) {
        for (final MimeType supportedMime : MimeType.values()) {
            for (final String encoderMime : encoder.getSupportedTypes()) {
                if (supportedMime.getMimeType().equals(encoderMime)) {
                    return supportedMime.getMimeType();
                }
            }
        }

        Log.e(TAG, "Could not find supported mime type, choosing any type supported by encoder");
        return encoder.getSupportedTypes()[0];
    }

    private static int getFacing(final CameraCharacteristics cameraInfo) {
        return cameraInfo.get(CameraCharacteristics.LENS_FACING);
    }

    private static int getOrientation(final CameraCharacteristics cameraInfo) {
        return cameraInfo.get(CameraCharacteristics.SENSOR_ORIENTATION);
    }

}
