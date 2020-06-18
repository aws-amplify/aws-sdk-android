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
 * Use Dolby Vision Mode to choose how the service will handle Dolby Vision
 * MaxCLL and MaxFALL properies.
 */
public enum DolbyVisionLevel6Mode {

    PASSTHROUGH("PASSTHROUGH"),
    RECALCULATE("RECALCULATE"),
    SPECIFY("SPECIFY");

    private String value;

    private DolbyVisionLevel6Mode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DolbyVisionLevel6Mode> enumMap;
    static {
        enumMap = new HashMap<String, DolbyVisionLevel6Mode>();
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
        enumMap.put("RECALCULATE", RECALCULATE);
        enumMap.put("SPECIFY", SPECIFY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DolbyVisionLevel6Mode corresponding to the value
     */
    public static DolbyVisionLevel6Mode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
