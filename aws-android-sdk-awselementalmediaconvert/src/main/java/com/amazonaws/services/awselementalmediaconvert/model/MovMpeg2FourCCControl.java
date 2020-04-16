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
 * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using
 * XDCAM fourcc codes. This increases compatibility with Apple editors and
 * players, but may decrease compatibility with other players. Only applicable
 * when the video codec is MPEG2.
 */
public enum MovMpeg2FourCCControl {

    XDCAM("XDCAM"),
    MPEG("MPEG");

    private String value;

    private MovMpeg2FourCCControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MovMpeg2FourCCControl> enumMap;
    static {
        enumMap = new HashMap<String, MovMpeg2FourCCControl>();
        enumMap.put("XDCAM", XDCAM);
        enumMap.put("MPEG", MPEG);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MovMpeg2FourCCControl corresponding to the value
     */
    public static MovMpeg2FourCCControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
