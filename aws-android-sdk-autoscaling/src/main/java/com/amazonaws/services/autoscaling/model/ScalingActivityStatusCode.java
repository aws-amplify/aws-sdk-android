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
 * Scaling Activity Status Code
 */
public enum ScalingActivityStatusCode {

    PendingSpotBidPlacement("PendingSpotBidPlacement"),
    WaitingForSpotInstanceRequestId("WaitingForSpotInstanceRequestId"),
    WaitingForSpotInstanceId("WaitingForSpotInstanceId"),
    WaitingForInstanceId("WaitingForInstanceId"),
    PreInService("PreInService"),
    InProgress("InProgress"),
    WaitingForELBConnectionDraining("WaitingForELBConnectionDraining"),
    MidLifecycleAction("MidLifecycleAction"),
    WaitingForInstanceWarmup("WaitingForInstanceWarmup"),
    Successful("Successful"),
    Failed("Failed"),
    Cancelled("Cancelled");

    private String value;

    private ScalingActivityStatusCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ScalingActivityStatusCode> enumMap;
    static {
        enumMap = new HashMap<String, ScalingActivityStatusCode>();
        enumMap.put("PendingSpotBidPlacement", PendingSpotBidPlacement);
        enumMap.put("WaitingForSpotInstanceRequestId", WaitingForSpotInstanceRequestId);
        enumMap.put("WaitingForSpotInstanceId", WaitingForSpotInstanceId);
        enumMap.put("WaitingForInstanceId", WaitingForInstanceId);
        enumMap.put("PreInService", PreInService);
        enumMap.put("InProgress", InProgress);
        enumMap.put("WaitingForELBConnectionDraining", WaitingForELBConnectionDraining);
        enumMap.put("MidLifecycleAction", MidLifecycleAction);
        enumMap.put("WaitingForInstanceWarmup", WaitingForInstanceWarmup);
        enumMap.put("Successful", Successful);
        enumMap.put("Failed", Failed);
        enumMap.put("Cancelled", Cancelled);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ScalingActivityStatusCode corresponding to the value
     */
    public static ScalingActivityStatusCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
