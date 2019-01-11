/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Object status with the following possible values:
 * </p>
 * <ul>
 * <li><code>PENDING</code></li>
 * <li><code>INPROGRESS</code></li>
 * <li><code>FAILED</code></li>
 * <li><code>COMPLETED</code></li>
 * <li><code>DELETED</code></li>
 * </ul>
 */
public enum EntityStatus {

    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    DELETED("DELETED");

    private String value;

    private EntityStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EntityStatus> enumMap;
    static {
        enumMap = new HashMap<String, EntityStatus>();
        enumMap.put("PENDING", PENDING);
        enumMap.put("INPROGRESS", INPROGRESS);
        enumMap.put("FAILED", FAILED);
        enumMap.put("COMPLETED", COMPLETED);
        enumMap.put("DELETED", DELETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EntityStatus corresponding to the value
     */
    public static EntityStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
