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

package com.amazonaws.services.applicationautoscaling.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Scaling Activity Status Code
 */
public enum ScalingActivityStatusCode {

    Pending("Pending"),
    InProgress("InProgress"),
    Successful("Successful"),
    Overridden("Overridden"),
    Unfulfilled("Unfulfilled"),
    Failed("Failed");

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
        enumMap.put("Pending", Pending);
        enumMap.put("InProgress", InProgress);
        enumMap.put("Successful", Successful);
        enumMap.put("Overridden", Overridden);
        enumMap.put("Unfulfilled", Unfulfilled);
        enumMap.put("Failed", Failed);
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
