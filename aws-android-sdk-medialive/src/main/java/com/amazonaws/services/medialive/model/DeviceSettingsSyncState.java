/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.medialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * The status of the action to synchronize the device configuration. If you
 * change the configuration of the input device (for example, the maximum
 * bitrate), MediaLive sends the new data to the device. The device might not
 * update itself immediately. SYNCED means the device has updated its
 * configuration. SYNCING means that it has not updated its configuration.
 */
public enum DeviceSettingsSyncState {

    SYNCED("SYNCED"),
    SYNCING("SYNCING");

    private String value;

    private DeviceSettingsSyncState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeviceSettingsSyncState> enumMap;
    static {
        enumMap = new HashMap<String, DeviceSettingsSyncState>();
        enumMap.put("SYNCED", SYNCED);
        enumMap.put("SYNCING", SYNCING);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeviceSettingsSyncState corresponding to the value
     */
    public static DeviceSettingsSyncState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
