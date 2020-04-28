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
 * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
 */
public enum ReservationResourceType {

    INPUT("INPUT"),
    OUTPUT("OUTPUT"),
    MULTIPLEX("MULTIPLEX"),
    CHANNEL("CHANNEL");

    private String value;

    private ReservationResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ReservationResourceType> enumMap;
    static {
        enumMap = new HashMap<String, ReservationResourceType>();
        enumMap.put("INPUT", INPUT);
        enumMap.put("OUTPUT", OUTPUT);
        enumMap.put("MULTIPLEX", MULTIPLEX);
        enumMap.put("CHANNEL", CHANNEL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ReservationResourceType corresponding to the value
     */
    public static ReservationResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
