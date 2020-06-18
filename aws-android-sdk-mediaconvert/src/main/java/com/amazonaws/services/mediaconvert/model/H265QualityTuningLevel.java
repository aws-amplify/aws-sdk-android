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
 * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
 * want to trade off encoding speed for output video quality. The default
 * behavior is faster, lower quality, single-pass encoding.
 */
public enum H265QualityTuningLevel {

    SINGLE_PASS("SINGLE_PASS"),
    SINGLE_PASS_HQ("SINGLE_PASS_HQ"),
    MULTI_PASS_HQ("MULTI_PASS_HQ");

    private String value;

    private H265QualityTuningLevel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265QualityTuningLevel> enumMap;
    static {
        enumMap = new HashMap<String, H265QualityTuningLevel>();
        enumMap.put("SINGLE_PASS", SINGLE_PASS);
        enumMap.put("SINGLE_PASS_HQ", SINGLE_PASS_HQ);
        enumMap.put("MULTI_PASS_HQ", MULTI_PASS_HQ);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H265QualityTuningLevel corresponding to the value
     */
    public static H265QualityTuningLevel fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
