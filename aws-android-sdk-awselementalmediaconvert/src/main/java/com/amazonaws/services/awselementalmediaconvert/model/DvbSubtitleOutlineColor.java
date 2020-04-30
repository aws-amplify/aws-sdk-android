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
 * Specifies font outline color. This option is not valid for source captions
 * that are either 608/embedded or teletext. These source settings are already
 * pre-defined by the caption stream. All burn-in and DVB-Sub font settings must
 * match.
 */
public enum DvbSubtitleOutlineColor {

    BLACK("BLACK"),
    WHITE("WHITE"),
    YELLOW("YELLOW"),
    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    private String value;

    private DvbSubtitleOutlineColor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DvbSubtitleOutlineColor> enumMap;
    static {
        enumMap = new HashMap<String, DvbSubtitleOutlineColor>();
        enumMap.put("BLACK", BLACK);
        enumMap.put("WHITE", WHITE);
        enumMap.put("YELLOW", YELLOW);
        enumMap.put("RED", RED);
        enumMap.put("GREEN", GREEN);
        enumMap.put("BLUE", BLUE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DvbSubtitleOutlineColor corresponding to the value
     */
    public static DvbSubtitleOutlineColor fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
