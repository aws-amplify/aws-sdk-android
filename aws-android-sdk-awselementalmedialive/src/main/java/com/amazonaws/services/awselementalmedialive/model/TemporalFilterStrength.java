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

package com.amazonaws.services.awselementalmedialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Temporal Filter Strength
 */
public enum TemporalFilterStrength {

    AUTO("AUTO"),
    STRENGTH_1("STRENGTH_1"),
    STRENGTH_10("STRENGTH_10"),
    STRENGTH_11("STRENGTH_11"),
    STRENGTH_12("STRENGTH_12"),
    STRENGTH_13("STRENGTH_13"),
    STRENGTH_14("STRENGTH_14"),
    STRENGTH_15("STRENGTH_15"),
    STRENGTH_16("STRENGTH_16"),
    STRENGTH_2("STRENGTH_2"),
    STRENGTH_3("STRENGTH_3"),
    STRENGTH_4("STRENGTH_4"),
    STRENGTH_5("STRENGTH_5"),
    STRENGTH_6("STRENGTH_6"),
    STRENGTH_7("STRENGTH_7"),
    STRENGTH_8("STRENGTH_8"),
    STRENGTH_9("STRENGTH_9");

    private String value;

    private TemporalFilterStrength(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TemporalFilterStrength> enumMap;
    static {
        enumMap = new HashMap<String, TemporalFilterStrength>();
        enumMap.put("AUTO", AUTO);
        enumMap.put("STRENGTH_1", STRENGTH_1);
        enumMap.put("STRENGTH_10", STRENGTH_10);
        enumMap.put("STRENGTH_11", STRENGTH_11);
        enumMap.put("STRENGTH_12", STRENGTH_12);
        enumMap.put("STRENGTH_13", STRENGTH_13);
        enumMap.put("STRENGTH_14", STRENGTH_14);
        enumMap.put("STRENGTH_15", STRENGTH_15);
        enumMap.put("STRENGTH_16", STRENGTH_16);
        enumMap.put("STRENGTH_2", STRENGTH_2);
        enumMap.put("STRENGTH_3", STRENGTH_3);
        enumMap.put("STRENGTH_4", STRENGTH_4);
        enumMap.put("STRENGTH_5", STRENGTH_5);
        enumMap.put("STRENGTH_6", STRENGTH_6);
        enumMap.put("STRENGTH_7", STRENGTH_7);
        enumMap.put("STRENGTH_8", STRENGTH_8);
        enumMap.put("STRENGTH_9", STRENGTH_9);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TemporalFilterStrength corresponding to the value
     */
    public static TemporalFilterStrength fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
