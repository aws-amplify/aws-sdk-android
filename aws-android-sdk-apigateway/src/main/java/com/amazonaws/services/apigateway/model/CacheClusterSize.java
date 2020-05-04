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
package com.amazonaws.services.apigateway.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Returns the size of the <b>CacheCluster</b>.</p>
 */
public enum CacheClusterSize {

    05("0.5"),
    16("1.6"),
    61("6.1"),
    135("13.5"),
    284("28.4"),
    582("58.2"),
    118("118"),
    237("237");

    private String value;

    private CacheClusterSize(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CacheClusterSize> enumMap;
    static {
        enumMap = new HashMap<String, CacheClusterSize>();
        enumMap.put("0.5", 05);
        enumMap.put("1.6", 16);
        enumMap.put("6.1", 61);
        enumMap.put("13.5", 135);
        enumMap.put("28.4", 284);
        enumMap.put("58.2", 582);
        enumMap.put("118", 118);
        enumMap.put("237", 237);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return CacheClusterSize corresponding to the value
     */
    public static CacheClusterSize fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
