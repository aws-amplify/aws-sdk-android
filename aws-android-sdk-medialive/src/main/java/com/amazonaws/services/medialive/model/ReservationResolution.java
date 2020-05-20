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
 * Resolution based on lines of vertical resolution; SD is less than 720 lines,
 * HD is 720 to 1080 lines, FHD is 1080 lines, UHD is greater than 1080 lines
 */
public enum ReservationResolution {

    SD("SD"),
    HD("HD"),
    FHD("FHD"),
    UHD("UHD");

    private String value;

    private ReservationResolution(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ReservationResolution> enumMap;
    static {
        enumMap = new HashMap<String, ReservationResolution>();
        enumMap.put("SD", SD);
        enumMap.put("HD", HD);
        enumMap.put("FHD", FHD);
        enumMap.put("UHD", UHD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ReservationResolution corresponding to the value
     */
    public static ReservationResolution fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
