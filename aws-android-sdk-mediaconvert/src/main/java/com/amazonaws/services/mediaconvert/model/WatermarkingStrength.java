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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Optional. Ignore this setting unless Nagra support directs you to specify a
 * value. When you don't specify a value here, the Nagra NexGuard library uses
 * its default value.
 */
public enum WatermarkingStrength {

    LIGHTEST("LIGHTEST"),
    LIGHTER("LIGHTER"),
    DEFAULT("DEFAULT"),
    STRONGER("STRONGER"),
    STRONGEST("STRONGEST");

    private String value;

    private WatermarkingStrength(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, WatermarkingStrength> enumMap;
    static {
        enumMap = new HashMap<String, WatermarkingStrength>();
        enumMap.put("LIGHTEST", LIGHTEST);
        enumMap.put("LIGHTER", LIGHTER);
        enumMap.put("DEFAULT", DEFAULT);
        enumMap.put("STRONGER", STRONGER);
        enumMap.put("STRONGEST", STRONGEST);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return WatermarkingStrength corresponding to the value
     */
    public static WatermarkingStrength fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
