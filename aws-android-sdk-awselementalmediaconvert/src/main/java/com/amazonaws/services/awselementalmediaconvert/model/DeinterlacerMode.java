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
 * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
 * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to
 * progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
 * 23.976p. - Adaptive auto-detects and converts to progressive.
 */
public enum DeinterlacerMode {

    DEINTERLACE("DEINTERLACE"),
    INVERSE_TELECINE("INVERSE_TELECINE"),
    ADAPTIVE("ADAPTIVE");

    private String value;

    private DeinterlacerMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeinterlacerMode> enumMap;
    static {
        enumMap = new HashMap<String, DeinterlacerMode>();
        enumMap.put("DEINTERLACE", DEINTERLACE);
        enumMap.put("INVERSE_TELECINE", INVERSE_TELECINE);
        enumMap.put("ADAPTIVE", ADAPTIVE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeinterlacerMode corresponding to the value
     */
    public static DeinterlacerMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
