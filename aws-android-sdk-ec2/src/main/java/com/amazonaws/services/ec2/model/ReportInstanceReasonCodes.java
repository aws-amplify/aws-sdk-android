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

package com.amazonaws.services.ec2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Report Instance Reason Codes
 */
public enum ReportInstanceReasonCodes {

    InstanceStuckInState("instance-stuck-in-state"),
    Unresponsive("unresponsive"),
    NotAcceptingCredentials("not-accepting-credentials"),
    PasswordNotAvailable("password-not-available"),
    PerformanceNetwork("performance-network"),
    PerformanceInstanceStore("performance-instance-store"),
    PerformanceEbsVolume("performance-ebs-volume"),
    PerformanceOther("performance-other"),
    Other("other");

    private String value;

    private ReportInstanceReasonCodes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ReportInstanceReasonCodes> enumMap;
    static {
        enumMap = new HashMap<String, ReportInstanceReasonCodes>();
        enumMap.put("instance-stuck-in-state", InstanceStuckInState);
        enumMap.put("unresponsive", Unresponsive);
        enumMap.put("not-accepting-credentials", NotAcceptingCredentials);
        enumMap.put("password-not-available", PasswordNotAvailable);
        enumMap.put("performance-network", PerformanceNetwork);
        enumMap.put("performance-instance-store", PerformanceInstanceStore);
        enumMap.put("performance-ebs-volume", PerformanceEbsVolume);
        enumMap.put("performance-other", PerformanceOther);
        enumMap.put("other", Other);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ReportInstanceReasonCodes corresponding to the value
     */
    public static ReportInstanceReasonCodes fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
