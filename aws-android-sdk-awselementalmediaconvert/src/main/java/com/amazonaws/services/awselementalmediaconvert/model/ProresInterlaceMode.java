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
 * Use Interlace mode (InterlaceMode) to choose the scan line type for the
 * output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD)
 * produce interlaced output with the entire output having the same field
 * polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and
 * Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as
 * the source. Therefore, behavior depends on the input scan type. - If the
 * source is interlaced, the output will be interlaced with the same polarity as
 * the source (it will follow the source). The output could therefore be a mix
 * of "top field first" and "bottom field first". - If the source is
 * progressive, the output will be interlaced with "top field first" or
 * "bottom field first" polarity, depending on which of the Follow options you
 * chose.
 */
public enum ProresInterlaceMode {

    PROGRESSIVE("PROGRESSIVE"),
    TOP_FIELD("TOP_FIELD"),
    BOTTOM_FIELD("BOTTOM_FIELD"),
    FOLLOW_TOP_FIELD("FOLLOW_TOP_FIELD"),
    FOLLOW_BOTTOM_FIELD("FOLLOW_BOTTOM_FIELD");

    private String value;

    private ProresInterlaceMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProresInterlaceMode> enumMap;
    static {
        enumMap = new HashMap<String, ProresInterlaceMode>();
        enumMap.put("PROGRESSIVE", PROGRESSIVE);
        enumMap.put("TOP_FIELD", TOP_FIELD);
        enumMap.put("BOTTOM_FIELD", BOTTOM_FIELD);
        enumMap.put("FOLLOW_TOP_FIELD", FOLLOW_TOP_FIELD);
        enumMap.put("FOLLOW_BOTTOM_FIELD", FOLLOW_BOTTOM_FIELD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProresInterlaceMode corresponding to the value
     */
    public static ProresInterlaceMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
