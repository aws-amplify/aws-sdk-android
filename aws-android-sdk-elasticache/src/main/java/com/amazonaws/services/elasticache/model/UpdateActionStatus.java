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

package com.amazonaws.services.elasticache.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Update Action Status
 */
public enum UpdateActionStatus {

    NotApplied("not-applied"),
    WaitingToStart("waiting-to-start"),
    InProgress("in-progress"),
    Stopping("stopping"),
    Stopped("stopped"),
    Complete("complete"),
    Scheduling("scheduling"),
    Scheduled("scheduled"),
    NotApplicable("not-applicable");

    private String value;

    private UpdateActionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, UpdateActionStatus> enumMap;
    static {
        enumMap = new HashMap<String, UpdateActionStatus>();
        enumMap.put("not-applied", NotApplied);
        enumMap.put("waiting-to-start", WaitingToStart);
        enumMap.put("in-progress", InProgress);
        enumMap.put("stopping", Stopping);
        enumMap.put("stopped", Stopped);
        enumMap.put("complete", Complete);
        enumMap.put("scheduling", Scheduling);
        enumMap.put("scheduled", Scheduled);
        enumMap.put("not-applicable", NotApplicable);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return UpdateActionStatus corresponding to the value
     */
    public static UpdateActionStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
