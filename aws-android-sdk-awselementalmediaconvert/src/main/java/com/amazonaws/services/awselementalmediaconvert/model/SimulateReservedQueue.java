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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Enable this setting when you run a test job to estimate how many reserved
 * transcoding slots (RTS) you need. When this is enabled, MediaConvert runs
 * your job from an on-demand queue with similar performance to what you will
 * see with one RTS in a reserved queue. This setting is disabled by default.
 */
public enum SimulateReservedQueue {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private SimulateReservedQueue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SimulateReservedQueue> enumMap;
    static {
        enumMap = new HashMap<String, SimulateReservedQueue>();
        enumMap.put("DISABLED", DISABLED);
        enumMap.put("ENABLED", ENABLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SimulateReservedQueue corresponding to the value
     */
    public static SimulateReservedQueue fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
