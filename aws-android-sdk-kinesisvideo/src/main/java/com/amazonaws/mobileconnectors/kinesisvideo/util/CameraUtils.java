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

import static com.amazonaws.mobileconnectors.kinesisvideo.util.DefaultCameraConfigurationHelper.getSupportedCameraConfiguration;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.util.Size;

import com.amazonaws.kinesisvideo.client.KinesisVideoClient;
import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;

/**
 * Utility class to get information about cameras, like supported resolutions,
 * get supported configurations, etc
 */
public class CameraUtils {
    private static final String TAG = CameraUtils.class.getSimpleName();

    /**
     * Queries the Android camera API for supported resolutions for given camera id.
     *
     * Camera id can be obtained from the KinesisVideoClient by listing
     * the supported media source configurations, or by querying Android directly,
     * e.g. by calling CameraManager, or by using getCameras() in this CameraUtils class
     */
    public static List<Size> getSupportedResolutions(final Context context,
                                                     final String cameraId) {

        return CameraHardwareCapabilitiesHelper
                .getSupportedResolutionsForYUV420_888(context, cameraId);
    }

    /**
     * Lists only cameras by getting known media sources known to the KinesisVideoClient
     */
    public static List<CameraMediaSourceConfiguration> getCameras(final KinesisVideoClient kinesisVideoClient) {
        final List<CameraMediaSourceConfiguration> cameras = new ArrayList<CameraMediaSourceConfiguration>();
        for (final MediaSourceConfiguration.Builder mediaSourceConfiguration
                : kinesisVideoClient.listSupportedConfigurations()) {

            if (!(mediaSourceConfiguration instanceof CameraMediaSourceConfiguration.Builder)) {
                continue;
            }

            final CameraMediaSourceConfiguration configuration =
                    ((CameraMediaSourceConfiguration.Builder) mediaSourceConfiguration).build();

            cameras.add(configuration);
        }

        return cameras;
    }

    /**
     * Tries to find a supported configuration for each camera on the device
     */
    public static List<MediaSourceConfiguration.Builder<? extends MediaSourceConfiguration>> getSupportedCameraConfigrations(final Context context) {
        final List<MediaSourceConfiguration.Builder<? extends MediaSourceConfiguration>> cameraConfigurations
            = new ArrayList<MediaSourceConfiguration.Builder<? extends MediaSourceConfiguration>>();

        for(final String cameraId : getCameraIds(context)) {
            cameraConfigurations.add(getSupportedCameraConfiguration(context, cameraId));
        }

        return cameraConfigurations;
    }

    public static String[] getCameraIds(final Context context) {
        final CameraManager cameraManager =
                (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);

        try {
            return cameraManager.getCameraIdList();
        } catch (final CameraAccessException e) {
            Log.e(TAG, "unable to list cameras", e);
            throw new RuntimeException("unable to list cameras", e);
        }
    }

    private CameraUtils() {
        // no-op
    }
}
