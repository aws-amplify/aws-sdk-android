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
 * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For
 * more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
 */
public enum Eac3AtmosBitstreamMode {

    COMPLETE_MAIN("COMPLETE_MAIN");

    private String value;

    private Eac3AtmosBitstreamMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3AtmosBitstreamMode> enumMap;
    static {
        enumMap = new HashMap<String, Eac3AtmosBitstreamMode>();
        enumMap.put("COMPLETE_MAIN", COMPLETE_MAIN);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3AtmosBitstreamMode corresponding to the value
     */
    public static Eac3AtmosBitstreamMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
