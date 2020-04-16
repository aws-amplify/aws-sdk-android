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
 * The service defaults to using RIFF for WAV outputs. If your output audio is
 * likely to exceed 4 GB in file size, or if you otherwise need the extended
 * support of the RF64 format, set your output WAV file format to RF64.
 */
public enum WavFormat {

    RIFF("RIFF"),
    RF64("RF64");

    private String value;

    private WavFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, WavFormat> enumMap;
    static {
        enumMap = new HashMap<String, WavFormat>();
        enumMap.put("RIFF", RIFF);
        enumMap.put("RF64", RF64);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return WavFormat corresponding to the value
     */
    public static WavFormat fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
