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
 * Selects which PIDs to place EBP markers on. They can either be placed only on
 * the video PID, or on both the video PID and all audio PIDs. Only applicable
 * when EBP segmentation markers are is selected (segmentationMarkers is EBP or
 * EBP_LEGACY).
 */
public enum M2tsEbpPlacement {

    VIDEO_AND_AUDIO_PIDS("VIDEO_AND_AUDIO_PIDS"),
    VIDEO_PID("VIDEO_PID");

    private String value;

    private M2tsEbpPlacement(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M2tsEbpPlacement> enumMap;
    static {
        enumMap = new HashMap<String, M2tsEbpPlacement>();
        enumMap.put("VIDEO_AND_AUDIO_PIDS", VIDEO_AND_AUDIO_PIDS);
        enumMap.put("VIDEO_PID", VIDEO_PID);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M2tsEbpPlacement corresponding to the value
     */
    public static M2tsEbpPlacement fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
