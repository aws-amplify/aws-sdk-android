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
 * This field applies only if the Streams > Advanced > Framerate (framerate)
 * field is set to 29.970. This field works with the Streams > Advanced >
 * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
 * Advanced > Interlaced Mode field (interlace_mode) to identify the scan type
 * for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. -
 * Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the
 * player converts this output to 29.97i.
 */
public enum H264Telecine {

    NONE("NONE"),
    SOFT("SOFT"),
    HARD("HARD");

    private String value;

    private H264Telecine(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H264Telecine> enumMap;
    static {
        enumMap = new HashMap<String, H264Telecine>();
        enumMap.put("NONE", NONE);
        enumMap.put("SOFT", SOFT);
        enumMap.put("HARD", HARD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H264Telecine corresponding to the value
     */
    public static H264Telecine fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
