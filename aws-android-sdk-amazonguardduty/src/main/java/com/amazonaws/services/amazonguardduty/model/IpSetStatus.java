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

package com.amazonaws.services.amazonguardduty.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Ip Set Status
 */
public enum IpSetStatus {

    INACTIVE("INACTIVE"),
    ACTIVATING("ACTIVATING"),
    ACTIVE("ACTIVE"),
    DEACTIVATING("DEACTIVATING"),
    ERROR("ERROR"),
    DELETE_PENDING("DELETE_PENDING"),
    DELETED("DELETED");

    private String value;

    private IpSetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, IpSetStatus> enumMap;
    static {
        enumMap = new HashMap<String, IpSetStatus>();
        enumMap.put("INACTIVE", INACTIVE);
        enumMap.put("ACTIVATING", ACTIVATING);
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("DEACTIVATING", DEACTIVATING);
        enumMap.put("ERROR", ERROR);
        enumMap.put("DELETE_PENDING", DELETE_PENDING);
        enumMap.put("DELETED", DELETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return IpSetStatus corresponding to the value
     */
    public static IpSetStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
