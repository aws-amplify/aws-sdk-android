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

package com.amazonaws.services.cloudformation.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Stack Resource Drift Status
 */
public enum StackResourceDriftStatus {

    IN_SYNC("IN_SYNC"),
    MODIFIED("MODIFIED"),
    DELETED("DELETED"),
    NOT_CHECKED("NOT_CHECKED");

    private String value;

    private StackResourceDriftStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StackResourceDriftStatus> enumMap;
    static {
        enumMap = new HashMap<String, StackResourceDriftStatus>();
        enumMap.put("IN_SYNC", IN_SYNC);
        enumMap.put("MODIFIED", MODIFIED);
        enumMap.put("DELETED", DELETED);
        enumMap.put("NOT_CHECKED", NOT_CHECKED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StackResourceDriftStatus corresponding to the value
     */
    public static StackResourceDriftStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
