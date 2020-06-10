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
 * Load Balancer Metric Name
 */
public enum LoadBalancerMetricName {

    ClientTLSNegotiationErrorCount("ClientTLSNegotiationErrorCount"),
    HealthyHostCount("HealthyHostCount"),
    UnhealthyHostCount("UnhealthyHostCount"),
    HTTPCode_LB_4XX_Count("HTTPCode_LB_4XX_Count"),
    HTTPCode_LB_5XX_Count("HTTPCode_LB_5XX_Count"),
    HTTPCode_Instance_2XX_Count("HTTPCode_Instance_2XX_Count"),
    HTTPCode_Instance_3XX_Count("HTTPCode_Instance_3XX_Count"),
    HTTPCode_Instance_4XX_Count("HTTPCode_Instance_4XX_Count"),
    HTTPCode_Instance_5XX_Count("HTTPCode_Instance_5XX_Count"),
    InstanceResponseTime("InstanceResponseTime"),
    RejectedConnectionCount("RejectedConnectionCount"),
    RequestCount("RequestCount");

    private String value;

    private LoadBalancerMetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LoadBalancerMetricName> enumMap;
    static {
        enumMap = new HashMap<String, LoadBalancerMetricName>();
        enumMap.put("ClientTLSNegotiationErrorCount", ClientTLSNegotiationErrorCount);
        enumMap.put("HealthyHostCount", HealthyHostCount);
        enumMap.put("UnhealthyHostCount", UnhealthyHostCount);
        enumMap.put("HTTPCode_LB_4XX_Count", HTTPCode_LB_4XX_Count);
        enumMap.put("HTTPCode_LB_5XX_Count", HTTPCode_LB_5XX_Count);
        enumMap.put("HTTPCode_Instance_2XX_Count", HTTPCode_Instance_2XX_Count);
        enumMap.put("HTTPCode_Instance_3XX_Count", HTTPCode_Instance_3XX_Count);
        enumMap.put("HTTPCode_Instance_4XX_Count", HTTPCode_Instance_4XX_Count);
        enumMap.put("HTTPCode_Instance_5XX_Count", HTTPCode_Instance_5XX_Count);
        enumMap.put("InstanceResponseTime", InstanceResponseTime);
        enumMap.put("RejectedConnectionCount", RejectedConnectionCount);
        enumMap.put("RequestCount", RequestCount);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LoadBalancerMetricName corresponding to the value
     */
    public static LoadBalancerMetricName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
