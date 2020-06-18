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
 * If set to LOG, log each output's audio track loudness to a CSV file.
 */
public enum AudioNormalizationLoudnessLogging {

    LOG("LOG"),
    DONT_LOG("DONT_LOG");

    private String value;

    private AudioNormalizationLoudnessLogging(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AudioNormalizationLoudnessLogging> enumMap;
    static {
        enumMap = new HashMap<String, AudioNormalizationLoudnessLogging>();
        enumMap.put("LOG", LOG);
        enumMap.put("DONT_LOG", DONT_LOG);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AudioNormalizationLoudnessLogging corresponding to the value
     */
    public static AudioNormalizationLoudnessLogging fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
