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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * This setting can improve the compatibility of your output with video players
 * on obsolete devices. It applies only to DASH H.264 outputs with DRM
 * encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct problems
 * with playback on older devices. Otherwise, keep the default setting CENC v1
 * (CENC_V1). If you choose Unencrypted SEI, for that output, the service will
 * exclude the access unit delimiter and will leave the SEI NAL units
 * unencrypted.
 */
public enum DashIsoPlaybackDeviceCompatibility {

    CENC_V1("CENC_V1"),
    UNENCRYPTED_SEI("UNENCRYPTED_SEI");

    private String value;

    private DashIsoPlaybackDeviceCompatibility(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DashIsoPlaybackDeviceCompatibility> enumMap;
    static {
        enumMap = new HashMap<String, DashIsoPlaybackDeviceCompatibility>();
        enumMap.put("CENC_V1", CENC_V1);
        enumMap.put("UNENCRYPTED_SEI", UNENCRYPTED_SEI);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DashIsoPlaybackDeviceCompatibility corresponding to the value
     */
    public static DashIsoPlaybackDeviceCompatibility fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
