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

package com.amazonaws.services.amazonroute53.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Health Check Type
 */
public enum HealthCheckType {

    HTTP("HTTP"),
    HTTPS("HTTPS"),
    HTTP_STR_MATCH("HTTP_STR_MATCH"),
    HTTPS_STR_MATCH("HTTPS_STR_MATCH"),
    TCP("TCP"),
    CALCULATED("CALCULATED"),
    CLOUDWATCH_METRIC("CLOUDWATCH_METRIC");

    private String value;

    private HealthCheckType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HealthCheckType> enumMap;
    static {
        enumMap = new HashMap<String, HealthCheckType>();
        enumMap.put("HTTP", HTTP);
        enumMap.put("HTTPS", HTTPS);
        enumMap.put("HTTP_STR_MATCH", HTTP_STR_MATCH);
        enumMap.put("HTTPS_STR_MATCH", HTTPS_STR_MATCH);
        enumMap.put("TCP", TCP);
        enumMap.put("CALCULATED", CALCULATED);
        enumMap.put("CLOUDWATCH_METRIC", CLOUDWATCH_METRIC);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HealthCheckType corresponding to the value
     */
    public static HealthCheckType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
