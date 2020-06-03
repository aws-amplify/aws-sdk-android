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
 * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files. The
 * value is calculated as follows: either the program date and time are
 * initialized using the input timecode source, or the time is initialized using
 * the input timecode source and the date is initialized using the
 * timestamp_offset.
 */
public enum HlsProgramDateTime {

    INCLUDE("INCLUDE"),
    EXCLUDE("EXCLUDE");

    private String value;

    private HlsProgramDateTime(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsProgramDateTime> enumMap;
    static {
        enumMap = new HashMap<String, HlsProgramDateTime>();
        enumMap.put("INCLUDE", INCLUDE);
        enumMap.put("EXCLUDE", EXCLUDE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsProgramDateTime corresponding to the value
     */
    public static HlsProgramDateTime fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
