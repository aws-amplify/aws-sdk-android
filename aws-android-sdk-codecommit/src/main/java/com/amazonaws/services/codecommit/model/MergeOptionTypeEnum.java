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

package com.amazonaws.services.codecommit.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Merge Option Type Enum
 */
public enum MergeOptionTypeEnum {

    FAST_FORWARD_MERGE("FAST_FORWARD_MERGE"),
    SQUASH_MERGE("SQUASH_MERGE"),
    THREE_WAY_MERGE("THREE_WAY_MERGE");

    private String value;

    private MergeOptionTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MergeOptionTypeEnum> enumMap;
    static {
        enumMap = new HashMap<String, MergeOptionTypeEnum>();
        enumMap.put("FAST_FORWARD_MERGE", FAST_FORWARD_MERGE);
        enumMap.put("SQUASH_MERGE", SQUASH_MERGE);
        enumMap.put("THREE_WAY_MERGE", THREE_WAY_MERGE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MergeOptionTypeEnum corresponding to the value
     */
    public static MergeOptionTypeEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
