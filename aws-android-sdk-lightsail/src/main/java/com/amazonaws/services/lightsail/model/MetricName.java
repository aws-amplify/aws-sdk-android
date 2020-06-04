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
 * Metric Name
 */
public enum MetricName {

    CPUUtilization("CPUUtilization"),
    NetworkIn("NetworkIn"),
    NetworkOut("NetworkOut"),
    StatusCheckFailed("StatusCheckFailed"),
    StatusCheckFailed_Instance("StatusCheckFailed_Instance"),
    StatusCheckFailed_System("StatusCheckFailed_System"),
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
    RequestCount("RequestCount"),
    DatabaseConnections("DatabaseConnections"),
    DiskQueueDepth("DiskQueueDepth"),
    FreeStorageSpace("FreeStorageSpace"),
    NetworkReceiveThroughput("NetworkReceiveThroughput"),
    NetworkTransmitThroughput("NetworkTransmitThroughput"),
    BurstCapacityTime("BurstCapacityTime"),
    BurstCapacityPercentage("BurstCapacityPercentage");

    private String value;

    private MetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MetricName> enumMap;
    static {
        enumMap = new HashMap<String, MetricName>();
        enumMap.put("CPUUtilization", CPUUtilization);
        enumMap.put("NetworkIn", NetworkIn);
        enumMap.put("NetworkOut", NetworkOut);
        enumMap.put("StatusCheckFailed", StatusCheckFailed);
        enumMap.put("StatusCheckFailed_Instance", StatusCheckFailed_Instance);
        enumMap.put("StatusCheckFailed_System", StatusCheckFailed_System);
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
        enumMap.put("DatabaseConnections", DatabaseConnections);
        enumMap.put("DiskQueueDepth", DiskQueueDepth);
        enumMap.put("FreeStorageSpace", FreeStorageSpace);
        enumMap.put("NetworkReceiveThroughput", NetworkReceiveThroughput);
        enumMap.put("NetworkTransmitThroughput", NetworkTransmitThroughput);
        enumMap.put("BurstCapacityTime", BurstCapacityTime);
        enumMap.put("BurstCapacityPercentage", BurstCapacityPercentage);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MetricName corresponding to the value
     */
    public static MetricName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
