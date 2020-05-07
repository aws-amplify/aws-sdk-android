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

package com.amazonaws.services.ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Session Filter Key
 */
public enum SessionFilterKey {

    InvokedAfter("InvokedAfter"),
    InvokedBefore("InvokedBefore"),
    Target("Target"),
    Owner("Owner"),
    Status("Status");

    private String value;

    private SessionFilterKey(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SessionFilterKey> enumMap;
    static {
        enumMap = new HashMap<String, SessionFilterKey>();
        enumMap.put("InvokedAfter", InvokedAfter);
        enumMap.put("InvokedBefore", InvokedBefore);
        enumMap.put("Target", Target);
        enumMap.put("Owner", Owner);
        enumMap.put("Status", Status);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SessionFilterKey corresponding to the value
     */
    public static SessionFilterKey fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
