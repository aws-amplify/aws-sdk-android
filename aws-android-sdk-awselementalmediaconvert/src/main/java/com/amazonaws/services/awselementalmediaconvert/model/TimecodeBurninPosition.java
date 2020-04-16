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
 * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
 * specify the location the burned-in timecode on output video.
 */
public enum TimecodeBurninPosition {

    TOP_CENTER("TOP_CENTER"),
    TOP_LEFT("TOP_LEFT"),
    TOP_RIGHT("TOP_RIGHT"),
    MIDDLE_LEFT("MIDDLE_LEFT"),
    MIDDLE_CENTER("MIDDLE_CENTER"),
    MIDDLE_RIGHT("MIDDLE_RIGHT"),
    BOTTOM_LEFT("BOTTOM_LEFT"),
    BOTTOM_CENTER("BOTTOM_CENTER"),
    BOTTOM_RIGHT("BOTTOM_RIGHT");

    private String value;

    private TimecodeBurninPosition(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TimecodeBurninPosition> enumMap;
    static {
        enumMap = new HashMap<String, TimecodeBurninPosition>();
        enumMap.put("TOP_CENTER", TOP_CENTER);
        enumMap.put("TOP_LEFT", TOP_LEFT);
        enumMap.put("TOP_RIGHT", TOP_RIGHT);
        enumMap.put("MIDDLE_LEFT", MIDDLE_LEFT);
        enumMap.put("MIDDLE_CENTER", MIDDLE_CENTER);
        enumMap.put("MIDDLE_RIGHT", MIDDLE_RIGHT);
        enumMap.put("BOTTOM_LEFT", BOTTOM_LEFT);
        enumMap.put("BOTTOM_CENTER", BOTTOM_CENTER);
        enumMap.put("BOTTOM_RIGHT", BOTTOM_RIGHT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TimecodeBurninPosition corresponding to the value
     */
    public static TimecodeBurninPosition fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
