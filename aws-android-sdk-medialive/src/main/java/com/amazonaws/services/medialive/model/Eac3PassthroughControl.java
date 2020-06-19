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

package com.amazonaws.services.medialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Eac3 Passthrough Control
 */
public enum Eac3PassthroughControl {

    NO_PASSTHROUGH("NO_PASSTHROUGH"),
    WHEN_POSSIBLE("WHEN_POSSIBLE");

    private String value;

    private Eac3PassthroughControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3PassthroughControl> enumMap;
    static {
        enumMap = new HashMap<String, Eac3PassthroughControl>();
        enumMap.put("NO_PASSTHROUGH", NO_PASSTHROUGH);
        enumMap.put("WHEN_POSSIBLE", WHEN_POSSIBLE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3PassthroughControl corresponding to the value
     */
    public static Eac3PassthroughControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
