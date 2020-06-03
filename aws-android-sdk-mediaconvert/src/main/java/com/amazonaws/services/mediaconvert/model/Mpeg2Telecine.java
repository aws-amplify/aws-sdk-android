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
 * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
 * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
 * output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output
 * and leave converstion to the player.
 */
public enum Mpeg2Telecine {

    NONE("NONE"),
    SOFT("SOFT"),
    HARD("HARD");

    private String value;

    private Mpeg2Telecine(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Mpeg2Telecine> enumMap;
    static {
        enumMap = new HashMap<String, Mpeg2Telecine>();
        enumMap.put("NONE", NONE);
        enumMap.put("SOFT", SOFT);
        enumMap.put("HARD", HARD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Mpeg2Telecine corresponding to the value
     */
    public static Mpeg2Telecine fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
