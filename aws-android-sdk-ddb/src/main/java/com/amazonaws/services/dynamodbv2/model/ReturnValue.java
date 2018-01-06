/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Return Value
 */
public enum ReturnValue {

    NONE("NONE"),
    ALL_OLD("ALL_OLD"),
    UPDATED_OLD("UPDATED_OLD"),
    ALL_NEW("ALL_NEW"),
    UPDATED_NEW("UPDATED_NEW");

    private String value;

    private ReturnValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ReturnValue> enumMap;
    static {
        enumMap = new HashMap<String, ReturnValue>();
        enumMap.put("NONE", NONE);
        enumMap.put("ALL_OLD", ALL_OLD);
        enumMap.put("UPDATED_OLD", UPDATED_OLD);
        enumMap.put("ALL_NEW", ALL_NEW);
        enumMap.put("UPDATED_NEW", UPDATED_NEW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ReturnValue corresponding to the value
     */
    public static ReturnValue fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
