/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Select
 */
public enum Select {

    ALL_ATTRIBUTES("ALL_ATTRIBUTES"),
    ALL_PROJECTED_ATTRIBUTES("ALL_PROJECTED_ATTRIBUTES"),
    SPECIFIC_ATTRIBUTES("SPECIFIC_ATTRIBUTES"),
    COUNT("COUNT");

    private String value;

    private Select(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Select> enumMap;
    static {
        enumMap = new HashMap<String, Select>();
        enumMap.put("ALL_ATTRIBUTES", ALL_ATTRIBUTES);
        enumMap.put("ALL_PROJECTED_ATTRIBUTES", ALL_PROJECTED_ATTRIBUTES);
        enumMap.put("SPECIFIC_ATTRIBUTES", SPECIFIC_ATTRIBUTES);
        enumMap.put("COUNT", COUNT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Select corresponding to the value
     */
    public static Select fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
