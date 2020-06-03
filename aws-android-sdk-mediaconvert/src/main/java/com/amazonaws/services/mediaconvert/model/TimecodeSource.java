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
 * Use Source (TimecodeSource) to set how timecodes are handled within this job.
 * To make sure that your video, audio, captions, and markers are synchronized
 * and that time-based features, such as image inserter, work correctly, choose
 * the Timecode source option that matches your assets. All timecodes are in a
 * 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use
 * the timecode that is in the input video. If no embedded timecode is in the
 * source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0
 * (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. *
 * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a
 * value other than zero. You use Start timecode (Start) to provide this value.
 */
public enum TimecodeSource {

    EMBEDDED("EMBEDDED"),
    ZEROBASED("ZEROBASED"),
    SPECIFIEDSTART("SPECIFIEDSTART");

    private String value;

    private TimecodeSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TimecodeSource> enumMap;
    static {
        enumMap = new HashMap<String, TimecodeSource>();
        enumMap.put("EMBEDDED", EMBEDDED);
        enumMap.put("ZEROBASED", ZEROBASED);
        enumMap.put("SPECIFIEDSTART", SPECIFIEDSTART);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TimecodeSource corresponding to the value
     */
    public static TimecodeSource fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
