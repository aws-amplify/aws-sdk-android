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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth
 * Streaming, CMAF)
 */
public enum OutputGroupType {

    HLS_GROUP_SETTINGS("HLS_GROUP_SETTINGS"),
    DASH_ISO_GROUP_SETTINGS("DASH_ISO_GROUP_SETTINGS"),
    FILE_GROUP_SETTINGS("FILE_GROUP_SETTINGS"),
    MS_SMOOTH_GROUP_SETTINGS("MS_SMOOTH_GROUP_SETTINGS"),
    CMAF_GROUP_SETTINGS("CMAF_GROUP_SETTINGS");

    private String value;

    private OutputGroupType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OutputGroupType> enumMap;
    static {
        enumMap = new HashMap<String, OutputGroupType>();
        enumMap.put("HLS_GROUP_SETTINGS", HLS_GROUP_SETTINGS);
        enumMap.put("DASH_ISO_GROUP_SETTINGS", DASH_ISO_GROUP_SETTINGS);
        enumMap.put("FILE_GROUP_SETTINGS", FILE_GROUP_SETTINGS);
        enumMap.put("MS_SMOOTH_GROUP_SETTINGS", MS_SMOOTH_GROUP_SETTINGS);
        enumMap.put("CMAF_GROUP_SETTINGS", CMAF_GROUP_SETTINGS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return OutputGroupType corresponding to the value
     */
    public static OutputGroupType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
