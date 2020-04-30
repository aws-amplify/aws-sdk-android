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
 * Choose the scan line type for the output. Choose Progressive (PROGRESSIVE) to
 * create a progressive output, regardless of the scan type of your input.
 * Choose Top Field First (TOP_FIELD) or Bottom Field First (BOTTOM_FIELD) to
 * create an output that's interlaced with the same field polarity throughout.
 * Choose Follow, Default Top (FOLLOW_TOP_FIELD) or Follow, Default Bottom
 * (FOLLOW_BOTTOM_FIELD) to create an interlaced output with the same field
 * polarity as the source. If the source is interlaced, the output will be
 * interlaced with the same polarity as the source (it will follow the source).
 * The output could therefore be a mix of "top field first" and
 * "bottom field first". If the source is progressive, your output will be
 * interlaced with "top field first" or "bottom field first" polarity, depending
 * on which of the Follow options you chose. If you don't choose a value, the
 * service will default to Progressive (PROGRESSIVE).
 */
public enum H265InterlaceMode {

    PROGRESSIVE("PROGRESSIVE"),
    TOP_FIELD("TOP_FIELD"),
    BOTTOM_FIELD("BOTTOM_FIELD"),
    FOLLOW_TOP_FIELD("FOLLOW_TOP_FIELD"),
    FOLLOW_BOTTOM_FIELD("FOLLOW_BOTTOM_FIELD");

    private String value;

    private H265InterlaceMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265InterlaceMode> enumMap;
    static {
        enumMap = new HashMap<String, H265InterlaceMode>();
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
     * @return H265InterlaceMode corresponding to the value
     */
    public static H265InterlaceMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
