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
 * Traffic Distribution Group Status
 */
public enum TrafficDistributionGroupStatus {

    CREATION_IN_PROGRESS("CREATION_IN_PROGRESS"),
    ACTIVE("ACTIVE"),
    CREATION_FAILED("CREATION_FAILED"),
    PENDING_DELETION("PENDING_DELETION"),
    DELETION_FAILED("DELETION_FAILED"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS");

    private String value;

    private TrafficDistributionGroupStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TrafficDistributionGroupStatus> enumMap;
    static {
        enumMap = new HashMap<String, TrafficDistributionGroupStatus>();
        enumMap.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("CREATION_FAILED", CREATION_FAILED);
        enumMap.put("PENDING_DELETION", PENDING_DELETION);
        enumMap.put("DELETION_FAILED", DELETION_FAILED);
        enumMap.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TrafficDistributionGroupStatus corresponding to the value
     */
    public static TrafficDistributionGroupStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
