/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Sortable Field Name
 */
public enum SortableFieldName {

    INITIATION_TIMESTAMP("INITIATION_TIMESTAMP"),
    SCHEDULED_TIMESTAMP("SCHEDULED_TIMESTAMP"),
    CONNECTED_TO_AGENT_TIMESTAMP("CONNECTED_TO_AGENT_TIMESTAMP"),
    DISCONNECT_TIMESTAMP("DISCONNECT_TIMESTAMP"),
    INITIATION_METHOD("INITIATION_METHOD"),
    CHANNEL("CHANNEL");

    private String value;

    private SortableFieldName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SortableFieldName> enumMap;
    static {
        enumMap = new HashMap<String, SortableFieldName>();
        enumMap.put("INITIATION_TIMESTAMP", INITIATION_TIMESTAMP);
        enumMap.put("SCHEDULED_TIMESTAMP", SCHEDULED_TIMESTAMP);
        enumMap.put("CONNECTED_TO_AGENT_TIMESTAMP", CONNECTED_TO_AGENT_TIMESTAMP);
        enumMap.put("DISCONNECT_TIMESTAMP", DISCONNECT_TIMESTAMP);
        enumMap.put("INITIATION_METHOD", INITIATION_METHOD);
        enumMap.put("CHANNEL", CHANNEL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SortableFieldName corresponding to the value
     */
    public static SortableFieldName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
