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
 * When enabled the output audio is corrected using the chosen algorithm. If
 * disabled, the audio will be measured but not adjusted.
 */
public enum AudioNormalizationAlgorithmControl {

    CORRECT_AUDIO("CORRECT_AUDIO"),
    MEASURE_ONLY("MEASURE_ONLY");

    private String value;

    private AudioNormalizationAlgorithmControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AudioNormalizationAlgorithmControl> enumMap;
    static {
        enumMap = new HashMap<String, AudioNormalizationAlgorithmControl>();
        enumMap.put("CORRECT_AUDIO", CORRECT_AUDIO);
        enumMap.put("MEASURE_ONLY", MEASURE_ONLY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AudioNormalizationAlgorithmControl corresponding to the value
     */
    public static AudioNormalizationAlgorithmControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
