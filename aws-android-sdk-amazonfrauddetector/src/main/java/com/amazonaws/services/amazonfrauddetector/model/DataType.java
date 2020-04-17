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

package com.amazonaws.services.amazonfrauddetector.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Type
 */
public enum DataType {

    STRING("STRING"),
    INTEGER("INTEGER"),
    FLOAT("FLOAT"),
    BOOLEAN("BOOLEAN");

    private String value;

    private DataType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DataType> enumMap;
    static {
        enumMap = new HashMap<String, DataType>();
        enumMap.put("STRING", STRING);
        enumMap.put("INTEGER", INTEGER);
        enumMap.put("FLOAT", FLOAT);
        enumMap.put("BOOLEAN", BOOLEAN);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DataType corresponding to the value
     */
    public static DataType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
