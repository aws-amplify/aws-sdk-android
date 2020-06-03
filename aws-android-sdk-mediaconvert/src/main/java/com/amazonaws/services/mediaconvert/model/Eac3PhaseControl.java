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
 * Controls the amount of phase-shift applied to the surround channels. Only
 * used for 3/2 coding mode.
 */
public enum Eac3PhaseControl {

    SHIFT_90_DEGREES("SHIFT_90_DEGREES"),
    NO_SHIFT("NO_SHIFT");

    private String value;

    private Eac3PhaseControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3PhaseControl> enumMap;
    static {
        enumMap = new HashMap<String, Eac3PhaseControl>();
        enumMap.put("SHIFT_90_DEGREES", SHIFT_90_DEGREES);
        enumMap.put("NO_SHIFT", NO_SHIFT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3PhaseControl corresponding to the value
     */
    public static Eac3PhaseControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
