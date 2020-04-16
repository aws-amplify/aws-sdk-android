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
 * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
 * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
 * output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output
 * and leave converstion to the player.
 */
public enum ProresTelecine {

    NONE("NONE"),
    HARD("HARD");

    private String value;

    private ProresTelecine(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProresTelecine> enumMap;
    static {
        enumMap = new HashMap<String, ProresTelecine>();
        enumMap.put("NONE", NONE);
        enumMap.put("HARD", HARD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProresTelecine corresponding to the value
     */
    public static ProresTelecine fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
