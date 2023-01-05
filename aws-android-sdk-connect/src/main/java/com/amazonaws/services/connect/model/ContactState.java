/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contact State
 */
public enum ContactState {

    INCOMING("INCOMING"),
    PENDING("PENDING"),
    CONNECTING("CONNECTING"),
    CONNECTED("CONNECTED"),
    CONNECTED_ONHOLD("CONNECTED_ONHOLD"),
    MISSED("MISSED"),
    ERROR("ERROR"),
    ENDED("ENDED"),
    REJECTED("REJECTED");

    private String value;

    private ContactState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ContactState> enumMap;
    static {
        enumMap = new HashMap<String, ContactState>();
        enumMap.put("INCOMING", INCOMING);
        enumMap.put("PENDING", PENDING);
        enumMap.put("CONNECTING", CONNECTING);
        enumMap.put("CONNECTED", CONNECTED);
        enumMap.put("CONNECTED_ONHOLD", CONNECTED_ONHOLD);
        enumMap.put("MISSED", MISSED);
        enumMap.put("ERROR", ERROR);
        enumMap.put("ENDED", ENDED);
        enumMap.put("REJECTED", REJECTED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ContactState corresponding to the value
     */
    public static ContactState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
