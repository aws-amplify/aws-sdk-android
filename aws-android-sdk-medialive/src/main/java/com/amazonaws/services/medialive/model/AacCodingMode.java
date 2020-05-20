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
 * Aac Coding Mode
 */
public enum AacCodingMode {

    AD_RECEIVER_MIX("AD_RECEIVER_MIX"),
    CODING_MODE_1_0("CODING_MODE_1_0"),
    CODING_MODE_1_1("CODING_MODE_1_1"),
    CODING_MODE_2_0("CODING_MODE_2_0"),
    CODING_MODE_5_1("CODING_MODE_5_1");

    private String value;

    private AacCodingMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AacCodingMode> enumMap;
    static {
        enumMap = new HashMap<String, AacCodingMode>();
        enumMap.put("AD_RECEIVER_MIX", AD_RECEIVER_MIX);
        enumMap.put("CODING_MODE_1_0", CODING_MODE_1_0);
        enumMap.put("CODING_MODE_1_1", CODING_MODE_1_1);
        enumMap.put("CODING_MODE_2_0", CODING_MODE_2_0);
        enumMap.put("CODING_MODE_5_1", CODING_MODE_5_1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AacCodingMode corresponding to the value
     */
    public static AacCodingMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
