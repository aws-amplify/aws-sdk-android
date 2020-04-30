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
 * Specify Sample Adaptive Offset (SAO) filter strength. Adaptive mode
 * dynamically selects best strength based on content
 */
public enum H265SampleAdaptiveOffsetFilterMode {

    DEFAULT("DEFAULT"),
    ADAPTIVE("ADAPTIVE"),
    OFF("OFF");

    private String value;

    private H265SampleAdaptiveOffsetFilterMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265SampleAdaptiveOffsetFilterMode> enumMap;
    static {
        enumMap = new HashMap<String, H265SampleAdaptiveOffsetFilterMode>();
        enumMap.put("DEFAULT", DEFAULT);
        enumMap.put("ADAPTIVE", ADAPTIVE);
        enumMap.put("OFF", OFF);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H265SampleAdaptiveOffsetFilterMode corresponding to the value
     */
    public static H265SampleAdaptiveOffsetFilterMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
