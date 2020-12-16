/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.mobileconnectors.geo.tracker;

import android.location.Location;

import androidx.annotation.NonNull;

import com.amazonaws.services.geo.model.DevicePositionUpdate;

import java.util.Arrays;
import java.util.Date;

public class TrackingModelFactory {
    /**
     * Creates a DevicePosition object.
     *
     * https://tools.ietf.org/html/rfc7946#section-3.1.1
     * @param location The location object from Android
     * @return
     *
     */
    public static DevicePositionUpdate createDevicePositionUpdate(@NonNull String deviceId, @NonNull Location location) {
        DevicePositionUpdate result = new DevicePositionUpdate();
        result.setDeviceId(deviceId);
        result.setPosition(Arrays.asList(location.getLongitude(), location.getLatitude()));
        result.setSampleTime(new Date(location.getTime()));
        return result;
    }
}
