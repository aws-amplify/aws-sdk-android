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
 * H265 Level
 */
public enum H265Level {

    H265_LEVEL_1("H265_LEVEL_1"),
    H265_LEVEL_2("H265_LEVEL_2"),
    H265_LEVEL_2_1("H265_LEVEL_2_1"),
    H265_LEVEL_3("H265_LEVEL_3"),
    H265_LEVEL_3_1("H265_LEVEL_3_1"),
    H265_LEVEL_4("H265_LEVEL_4"),
    H265_LEVEL_4_1("H265_LEVEL_4_1"),
    H265_LEVEL_5("H265_LEVEL_5"),
    H265_LEVEL_5_1("H265_LEVEL_5_1"),
    H265_LEVEL_5_2("H265_LEVEL_5_2"),
    H265_LEVEL_6("H265_LEVEL_6"),
    H265_LEVEL_6_1("H265_LEVEL_6_1"),
    H265_LEVEL_6_2("H265_LEVEL_6_2"),
    H265_LEVEL_AUTO("H265_LEVEL_AUTO");

    private String value;

    private H265Level(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265Level> enumMap;
    static {
        enumMap = new HashMap<String, H265Level>();
        enumMap.put("H265_LEVEL_1", H265_LEVEL_1);
        enumMap.put("H265_LEVEL_2", H265_LEVEL_2);
        enumMap.put("H265_LEVEL_2_1", H265_LEVEL_2_1);
        enumMap.put("H265_LEVEL_3", H265_LEVEL_3);
        enumMap.put("H265_LEVEL_3_1", H265_LEVEL_3_1);
        enumMap.put("H265_LEVEL_4", H265_LEVEL_4);
        enumMap.put("H265_LEVEL_4_1", H265_LEVEL_4_1);
        enumMap.put("H265_LEVEL_5", H265_LEVEL_5);
        enumMap.put("H265_LEVEL_5_1", H265_LEVEL_5_1);
        enumMap.put("H265_LEVEL_5_2", H265_LEVEL_5_2);
        enumMap.put("H265_LEVEL_6", H265_LEVEL_6);
        enumMap.put("H265_LEVEL_6_1", H265_LEVEL_6_1);
        enumMap.put("H265_LEVEL_6_2", H265_LEVEL_6_2);
        enumMap.put("H265_LEVEL_AUTO", H265_LEVEL_AUTO);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H265Level corresponding to the value
     */
    public static H265Level fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
