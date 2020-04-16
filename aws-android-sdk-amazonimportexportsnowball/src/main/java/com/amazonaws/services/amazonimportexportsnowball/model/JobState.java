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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Job State
 */
public enum JobState {

    New("New"),
    PreparingAppliance("PreparingAppliance"),
    PreparingShipment("PreparingShipment"),
    InTransitToCustomer("InTransitToCustomer"),
    WithCustomer("WithCustomer"),
    InTransitToAWS("InTransitToAWS"),
    WithAWSSortingFacility("WithAWSSortingFacility"),
    WithAWS("WithAWS"),
    InProgress("InProgress"),
    Complete("Complete"),
    Cancelled("Cancelled"),
    Listing("Listing"),
    Pending("Pending");

    private String value;

    private JobState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, JobState> enumMap;
    static {
        enumMap = new HashMap<String, JobState>();
        enumMap.put("New", New);
        enumMap.put("PreparingAppliance", PreparingAppliance);
        enumMap.put("PreparingShipment", PreparingShipment);
        enumMap.put("InTransitToCustomer", InTransitToCustomer);
        enumMap.put("WithCustomer", WithCustomer);
        enumMap.put("InTransitToAWS", InTransitToAWS);
        enumMap.put("WithAWSSortingFacility", WithAWSSortingFacility);
        enumMap.put("WithAWS", WithAWS);
        enumMap.put("InProgress", InProgress);
        enumMap.put("Complete", Complete);
        enumMap.put("Cancelled", Cancelled);
        enumMap.put("Listing", Listing);
        enumMap.put("Pending", Pending);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return JobState corresponding to the value
     */
    public static JobState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
