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

package com.amazonaws.services.elasticmapreduce.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Cluster State Change Reason Code
 */
public enum ClusterStateChangeReasonCode {

    INTERNAL_ERROR("INTERNAL_ERROR"),
    VALIDATION_ERROR("VALIDATION_ERROR"),
    INSTANCE_FAILURE("INSTANCE_FAILURE"),
    INSTANCE_FLEET_TIMEOUT("INSTANCE_FLEET_TIMEOUT"),
    BOOTSTRAP_FAILURE("BOOTSTRAP_FAILURE"),
    USER_REQUEST("USER_REQUEST"),
    STEP_FAILURE("STEP_FAILURE"),
    ALL_STEPS_COMPLETED("ALL_STEPS_COMPLETED");

    private String value;

    private ClusterStateChangeReasonCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ClusterStateChangeReasonCode> enumMap;
    static {
        enumMap = new HashMap<String, ClusterStateChangeReasonCode>();
        enumMap.put("INTERNAL_ERROR", INTERNAL_ERROR);
        enumMap.put("VALIDATION_ERROR", VALIDATION_ERROR);
        enumMap.put("INSTANCE_FAILURE", INSTANCE_FAILURE);
        enumMap.put("INSTANCE_FLEET_TIMEOUT", INSTANCE_FLEET_TIMEOUT);
        enumMap.put("BOOTSTRAP_FAILURE", BOOTSTRAP_FAILURE);
        enumMap.put("USER_REQUEST", USER_REQUEST);
        enumMap.put("STEP_FAILURE", STEP_FAILURE);
        enumMap.put("ALL_STEPS_COMPLETED", ALL_STEPS_COMPLETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ClusterStateChangeReasonCode corresponding to the value
     */
    public static ClusterStateChangeReasonCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
