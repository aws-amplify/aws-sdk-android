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

package com.amazonaws.services.a4b.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Wake Word
 */
public enum WakeWord {

    ALEXA("ALEXA"),
    AMAZON("AMAZON"),
    ECHO("ECHO"),
    COMPUTER("COMPUTER");

    private String value;

    private WakeWord(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, WakeWord> enumMap;
    static {
        enumMap = new HashMap<String, WakeWord>();
        enumMap.put("ALEXA", ALEXA);
        enumMap.put("AMAZON", AMAZON);
        enumMap.put("ECHO", ECHO);
        enumMap.put("COMPUTER", COMPUTER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return WakeWord corresponding to the value
     */
    public static WakeWord fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
