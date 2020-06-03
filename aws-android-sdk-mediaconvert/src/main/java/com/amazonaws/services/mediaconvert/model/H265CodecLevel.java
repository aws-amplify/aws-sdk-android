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
 * H.265 Level.
 */
public enum H265CodecLevel {

    AUTO("AUTO"),
    LEVEL_1("LEVEL_1"),
    LEVEL_2("LEVEL_2"),
    LEVEL_2_1("LEVEL_2_1"),
    LEVEL_3("LEVEL_3"),
    LEVEL_3_1("LEVEL_3_1"),
    LEVEL_4("LEVEL_4"),
    LEVEL_4_1("LEVEL_4_1"),
    LEVEL_5("LEVEL_5"),
    LEVEL_5_1("LEVEL_5_1"),
    LEVEL_5_2("LEVEL_5_2"),
    LEVEL_6("LEVEL_6"),
    LEVEL_6_1("LEVEL_6_1"),
    LEVEL_6_2("LEVEL_6_2");

    private String value;

    private H265CodecLevel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265CodecLevel> enumMap;
    static {
        enumMap = new HashMap<String, H265CodecLevel>();
        enumMap.put("AUTO", AUTO);
        enumMap.put("LEVEL_1", LEVEL_1);
        enumMap.put("LEVEL_2", LEVEL_2);
        enumMap.put("LEVEL_2_1", LEVEL_2_1);
        enumMap.put("LEVEL_3", LEVEL_3);
        enumMap.put("LEVEL_3_1", LEVEL_3_1);
        enumMap.put("LEVEL_4", LEVEL_4);
        enumMap.put("LEVEL_4_1", LEVEL_4_1);
        enumMap.put("LEVEL_5", LEVEL_5);
        enumMap.put("LEVEL_5_1", LEVEL_5_1);
        enumMap.put("LEVEL_5_2", LEVEL_5_2);
        enumMap.put("LEVEL_6", LEVEL_6);
        enumMap.put("LEVEL_6_1", LEVEL_6_1);
        enumMap.put("LEVEL_6_2", LEVEL_6_2);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H265CodecLevel corresponding to the value
     */
    public static H265CodecLevel fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
