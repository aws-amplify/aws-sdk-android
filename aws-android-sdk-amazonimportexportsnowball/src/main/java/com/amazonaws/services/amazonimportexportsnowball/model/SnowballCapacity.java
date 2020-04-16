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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Snowball Capacity
 */
public enum SnowballCapacity {

    T50("T50"),
    T80("T80"),
    T100("T100"),
    T42("T42"),
    T98("T98"),
    NoPreference("NoPreference");

    private String value;

    private SnowballCapacity(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SnowballCapacity> enumMap;
    static {
        enumMap = new HashMap<String, SnowballCapacity>();
        enumMap.put("T50", T50);
        enumMap.put("T80", T80);
        enumMap.put("T100", T100);
        enumMap.put("T42", T42);
        enumMap.put("T98", T98);
        enumMap.put("NoPreference", NoPreference);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SnowballCapacity corresponding to the value
     */
    public static SnowballCapacity fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
