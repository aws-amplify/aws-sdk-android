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
 * Specify whether this set of input captions appears in your outputs in both
 * 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert
 * includes the captions data in two ways: it passes the 608 data through using
 * the 608 compatibility bytes fields of the 708 wrapper, and it also translates
 * the 608 data into 708.
 */
public enum FileSourceConvert608To708 {

    UPCONVERT("UPCONVERT"),
    DISABLED("DISABLED");

    private String value;

    private FileSourceConvert608To708(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, FileSourceConvert608To708> enumMap;
    static {
        enumMap = new HashMap<String, FileSourceConvert608To708>();
        enumMap.put("UPCONVERT", UPCONVERT);
        enumMap.put("DISABLED", DISABLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return FileSourceConvert608To708 corresponding to the value
     */
    public static FileSourceConvert608To708 fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
