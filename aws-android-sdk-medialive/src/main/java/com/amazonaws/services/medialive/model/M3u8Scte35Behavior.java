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
 * M3u8 Scte35 Behavior
 */
public enum M3u8Scte35Behavior {

    NO_PASSTHROUGH("NO_PASSTHROUGH"),
    PASSTHROUGH("PASSTHROUGH");

    private String value;

    private M3u8Scte35Behavior(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M3u8Scte35Behavior> enumMap;
    static {
        enumMap = new HashMap<String, M3u8Scte35Behavior>();
        enumMap.put("NO_PASSTHROUGH", NO_PASSTHROUGH);
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M3u8Scte35Behavior corresponding to the value
     */
    public static M3u8Scte35Behavior fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
