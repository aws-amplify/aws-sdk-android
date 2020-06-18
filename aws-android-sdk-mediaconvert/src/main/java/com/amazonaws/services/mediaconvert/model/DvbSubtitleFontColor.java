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
 * Specifies the color of the burned-in captions. This option is not valid for
 * source captions that are STL, 608/embedded or teletext. These source settings
 * are already pre-defined by the caption stream. All burn-in and DVB-Sub font
 * settings must match.
 */
public enum DvbSubtitleFontColor {

    WHITE("WHITE"),
    BLACK("BLACK"),
    YELLOW("YELLOW"),
    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    private String value;

    private DvbSubtitleFontColor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DvbSubtitleFontColor> enumMap;
    static {
        enumMap = new HashMap<String, DvbSubtitleFontColor>();
        enumMap.put("WHITE", WHITE);
        enumMap.put("BLACK", BLACK);
        enumMap.put("YELLOW", YELLOW);
        enumMap.put("RED", RED);
        enumMap.put("GREEN", GREEN);
        enumMap.put("BLUE", BLUE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DvbSubtitleFontColor corresponding to the value
     */
    public static DvbSubtitleFontColor fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
