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

package com.amazonaws.services.autoscaling.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Lifecycle State
 */
public enum LifecycleState {

    Pending("Pending"),
    PendingWait("Pending:Wait"),
    PendingProceed("Pending:Proceed"),
    Quarantined("Quarantined"),
    InService("InService"),
    Terminating("Terminating"),
    TerminatingWait("Terminating:Wait"),
    TerminatingProceed("Terminating:Proceed"),
    Terminated("Terminated"),
    Detaching("Detaching"),
    Detached("Detached"),
    EnteringStandby("EnteringStandby"),
    Standby("Standby");

    private String value;

    private LifecycleState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LifecycleState> enumMap;
    static {
        enumMap = new HashMap<String, LifecycleState>();
        enumMap.put("Pending", Pending);
        enumMap.put("Pending:Wait", PendingWait);
        enumMap.put("Pending:Proceed", PendingProceed);
        enumMap.put("Quarantined", Quarantined);
        enumMap.put("InService", InService);
        enumMap.put("Terminating", Terminating);
        enumMap.put("Terminating:Wait", TerminatingWait);
        enumMap.put("Terminating:Proceed", TerminatingProceed);
        enumMap.put("Terminated", Terminated);
        enumMap.put("Detaching", Detaching);
        enumMap.put("Detached", Detached);
        enumMap.put("EnteringStandby", EnteringStandby);
        enumMap.put("Standby", Standby);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LifecycleState corresponding to the value
     */
    public static LifecycleState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
