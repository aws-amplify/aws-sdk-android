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
 * Specify the absolute peak level for a signal with dynamic range compression.
 */
public enum Eac3DynamicRangeCompressionLine {

    NONE("NONE"),
    FILM_STANDARD("FILM_STANDARD"),
    FILM_LIGHT("FILM_LIGHT"),
    MUSIC_STANDARD("MUSIC_STANDARD"),
    MUSIC_LIGHT("MUSIC_LIGHT"),
    SPEECH("SPEECH");

    private String value;

    private Eac3DynamicRangeCompressionLine(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3DynamicRangeCompressionLine> enumMap;
    static {
        enumMap = new HashMap<String, Eac3DynamicRangeCompressionLine>();
        enumMap.put("NONE", NONE);
        enumMap.put("FILM_STANDARD", FILM_STANDARD);
        enumMap.put("FILM_LIGHT", FILM_LIGHT);
        enumMap.put("MUSIC_STANDARD", MUSIC_STANDARD);
        enumMap.put("MUSIC_LIGHT", MUSIC_LIGHT);
        enumMap.put("SPEECH", SPEECH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3DynamicRangeCompressionLine corresponding to the value
     */
    public static Eac3DynamicRangeCompressionLine fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
