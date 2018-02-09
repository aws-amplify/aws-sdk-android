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

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

import java.util.Arrays;
import java.util.List;

/**
 * Helper class to extract the hardware camera characteristics from the CameraManager
 */
public class CameraHardwareCapabilitiesHelper {

    /**
     * List supported resolutions by the given camera.
     *
     * Camera id can be obtained, for example, from the CameraManager system service,
     * or by listing the known media sources from the KinesisVideoClient.
     *
     * Current implementation requires for the output images to be in YUV_420_888,
     * so the supported resolutions are filtered by this.
     *
     * If the camera does not support YUV_420_888 at all, RuntimeException will be thrown
     */
    public static List<Size> getSupportedResolutionsForYUV420_888(final Context context,
                                                                  final String cameraId) {
        final CameraCharacteristics cameraInfo = getCameraInfo(context, cameraId);
        final StreamConfigurationMap supportedConfigurations =
                cameraInfo.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);

        final Size[] sizes = supportedConfigurations.getOutputSizes(ImageFormat.YUV_420_888);

        if (sizes == null || sizes.length == 0) {
            throw new RuntimeException("Camera " + cameraId + " does not support YUV420_888");
        }

        return Arrays.asList(sizes);
    }

    public static CameraCharacteristics getCameraInfo(final Context context,
                                                       final String cameraId) {
        final CameraManager cameraManager =
                (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);

        try {
            return cameraManager.getCameraCharacteristics(cameraId);
        } catch (final CameraAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private CameraHardwareCapabilitiesHelper() {
        // no-op
    }

}
