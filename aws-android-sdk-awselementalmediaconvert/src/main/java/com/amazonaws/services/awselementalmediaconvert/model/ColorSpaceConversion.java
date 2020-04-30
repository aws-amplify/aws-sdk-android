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
 * Specify the color space you want for this output. The service supports
 * conversion between HDR formats, between SDR formats, from SDR to HDR, and
 * from HDR to SDR. SDR to HDR conversion doesn't upgrade the dynamic range. The
 * converted video has an HDR format, but visually appears the same as an
 * unconverted output. HDR to SDR conversion uses Elemental tone mapping
 * technology to approximate the outcome of manually regrading from HDR to SDR.
 */
public enum ColorSpaceConversion {

    NONE("NONE"),
    FORCE_601("FORCE_601"),
    FORCE_709("FORCE_709"),
    FORCE_HDR10("FORCE_HDR10"),
    FORCE_HLG_2020("FORCE_HLG_2020");

    private String value;

    private ColorSpaceConversion(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ColorSpaceConversion> enumMap;
    static {
        enumMap = new HashMap<String, ColorSpaceConversion>();
        enumMap.put("NONE", NONE);
        enumMap.put("FORCE_601", FORCE_601);
        enumMap.put("FORCE_709", FORCE_709);
        enumMap.put("FORCE_HDR10", FORCE_HDR10);
        enumMap.put("FORCE_HLG_2020", FORCE_HLG_2020);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ColorSpaceConversion corresponding to the value
     */
    public static ColorSpaceConversion fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
