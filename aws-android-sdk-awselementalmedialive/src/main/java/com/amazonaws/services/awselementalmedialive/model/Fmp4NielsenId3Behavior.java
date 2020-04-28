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
 * Fmp4 Nielsen Id3 Behavior
 */
public enum Fmp4NielsenId3Behavior {

    NO_PASSTHROUGH("NO_PASSTHROUGH"),
    PASSTHROUGH("PASSTHROUGH");

    private String value;

    private Fmp4NielsenId3Behavior(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Fmp4NielsenId3Behavior> enumMap;
    static {
        enumMap = new HashMap<String, Fmp4NielsenId3Behavior>();
        enumMap.put("NO_PASSTHROUGH", NO_PASSTHROUGH);
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Fmp4NielsenId3Behavior corresponding to the value
     */
    public static Fmp4NielsenId3Behavior fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
