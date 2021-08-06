/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Channel Mode
 */
public enum ChannelMode {

    UNRESTRICTED("UNRESTRICTED"),
    RESTRICTED("RESTRICTED");

    private String value;

    private ChannelMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ChannelMode> enumMap;
    static {
        enumMap = new HashMap<String, ChannelMode>();
        enumMap.put("UNRESTRICTED", UNRESTRICTED);
        enumMap.put("RESTRICTED", RESTRICTED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ChannelMode corresponding to the value
     */
    public static ChannelMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
