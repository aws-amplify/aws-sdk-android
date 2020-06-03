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
 * Use this Timecode source setting, located under the input settings
 * (InputTimecodeSource), to specify how the service counts input video frames.
 * This input frame count affects only the behavior of features that apply to a
 * single input at a time, such as input clipping and synchronizing some
 * captions formats. Choose Embedded (EMBEDDED) to use the timecodes in your
 * input video. Choose Start at zero (ZEROBASED) to start the first frame at
 * zero. Choose Specified start (SPECIFIEDSTART) to start the first frame at the
 * timecode that you specify in the setting Start timecode (timecodeStart). If
 * you don't specify a value for Timecode source, the service will use Embedded
 * by default. For more information about timecodes, see
 * https://docs.aws.amazon.com/console/mediaconvert/timecode.
 */
public enum InputTimecodeSource {

    EMBEDDED("EMBEDDED"),
    ZEROBASED("ZEROBASED"),
    SPECIFIEDSTART("SPECIFIEDSTART");

    private String value;

    private InputTimecodeSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InputTimecodeSource> enumMap;
    static {
        enumMap = new HashMap<String, InputTimecodeSource>();
        enumMap.put("EMBEDDED", EMBEDDED);
        enumMap.put("ZEROBASED", ZEROBASED);
        enumMap.put("SPECIFIEDSTART", SPECIFIEDSTART);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InputTimecodeSource corresponding to the value
     */
    public static InputTimecodeSource fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
