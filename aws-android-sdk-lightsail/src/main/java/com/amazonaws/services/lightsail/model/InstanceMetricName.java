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

package com.amazonaws.services.lightsail.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Instance Metric Name
 */
public enum InstanceMetricName {

    CPUUtilization("CPUUtilization"),
    NetworkIn("NetworkIn"),
    NetworkOut("NetworkOut"),
    StatusCheckFailed("StatusCheckFailed"),
    StatusCheckFailed_Instance("StatusCheckFailed_Instance"),
    StatusCheckFailed_System("StatusCheckFailed_System");

    private String value;

    private InstanceMetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceMetricName> enumMap;
    static {
        enumMap = new HashMap<String, InstanceMetricName>();
        enumMap.put("CPUUtilization", CPUUtilization);
        enumMap.put("NetworkIn", NetworkIn);
        enumMap.put("NetworkOut", NetworkOut);
        enumMap.put("StatusCheckFailed", StatusCheckFailed);
        enumMap.put("StatusCheckFailed_Instance", StatusCheckFailed_Instance);
        enumMap.put("StatusCheckFailed_System", StatusCheckFailed_System);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceMetricName corresponding to the value
     */
    public static InstanceMetricName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
