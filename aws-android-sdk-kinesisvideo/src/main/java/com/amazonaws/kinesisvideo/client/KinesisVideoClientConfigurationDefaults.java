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

package com.amazonaws.kinesisvideo.client;

import com.amazonaws.kinesisvideo.producer.StorageCallbacks;
import com.amazonaws.kinesisvideo.storage.DefaultStorageCallbacks;

import androidx.annotation.NonNull;

public final class KinesisVideoClientConfigurationDefaults {
    static final String US_WEST_2 = "us-west-2";
    static final String PROD_CONTROL_PLANE_ENDPOINT_FORMAT = "kinesisvideo.%s.amazonaws.com";

    static final int DEVICE_VERSION = 0;
    static final int TEN_STREAMS = 10;
    static final int SPILL_RATIO_90_PERCENT = 90;
    static final int STORAGE_SIZE_256_MEGS = 256 * 1024 * 1024;

    public static final int DEFAULT_SERVICE_CALL_TIMEOUT_IN_MILLIS = 5000;

    static final StorageCallbacks NO_OP_STORAGE_CALLBACKS = new DefaultStorageCallbacks();

    public static String getControlPlaneEndpoint(final @NonNull String region) {
        return String.format(PROD_CONTROL_PLANE_ENDPOINT_FORMAT, region);
    }

    private KinesisVideoClientConfigurationDefaults() {
        // no-op
    }
}
