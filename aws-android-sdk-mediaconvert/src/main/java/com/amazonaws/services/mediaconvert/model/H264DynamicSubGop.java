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
 * Choose Adaptive to improve subjective video quality for high-motion content.
 * This will cause the service to use fewer B-frames (which infer information
 * based on other frames) for high-motion portions of the video and more
 * B-frames for low-motion portions. The maximum number of B-frames is limited
 * by the value you provide for the setting B frames between reference frames
 * (numberBFramesBetweenReferenceFrames).
 */
public enum H264DynamicSubGop {

    ADAPTIVE("ADAPTIVE"),
    STATIC("STATIC");

    private String value;

    private H264DynamicSubGop(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H264DynamicSubGop> enumMap;
    static {
        enumMap = new HashMap<String, H264DynamicSubGop>();
        enumMap.put("ADAPTIVE", ADAPTIVE);
        enumMap.put("STATIC", STATIC);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H264DynamicSubGop corresponding to the value
     */
    public static H264DynamicSubGop fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
