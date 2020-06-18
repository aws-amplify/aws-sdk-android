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
 * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
 * AVC-I License.
 */
public enum H264CodecProfile {

    BASELINE("BASELINE"),
    HIGH("HIGH"),
    HIGH_10BIT("HIGH_10BIT"),
    HIGH_422("HIGH_422"),
    HIGH_422_10BIT("HIGH_422_10BIT"),
    MAIN("MAIN");

    private String value;

    private H264CodecProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H264CodecProfile> enumMap;
    static {
        enumMap = new HashMap<String, H264CodecProfile>();
        enumMap.put("BASELINE", BASELINE);
        enumMap.put("HIGH", HIGH);
        enumMap.put("HIGH_10BIT", HIGH_10BIT);
        enumMap.put("HIGH_422", HIGH_422);
        enumMap.put("HIGH_422_10BIT", HIGH_422_10BIT);
        enumMap.put("MAIN", MAIN);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H264CodecProfile corresponding to the value
     */
    public static H264CodecProfile fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
