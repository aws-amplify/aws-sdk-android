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
 * Metric Type
 */
public enum MetricType {

    DynamoDBReadCapacityUtilization("DynamoDBReadCapacityUtilization"),
    DynamoDBWriteCapacityUtilization("DynamoDBWriteCapacityUtilization"),
    ALBRequestCountPerTarget("ALBRequestCountPerTarget"),
    RDSReaderAverageCPUUtilization("RDSReaderAverageCPUUtilization"),
    RDSReaderAverageDatabaseConnections("RDSReaderAverageDatabaseConnections"),
    EC2SpotFleetRequestAverageCPUUtilization("EC2SpotFleetRequestAverageCPUUtilization"),
    EC2SpotFleetRequestAverageNetworkIn("EC2SpotFleetRequestAverageNetworkIn"),
    EC2SpotFleetRequestAverageNetworkOut("EC2SpotFleetRequestAverageNetworkOut"),
    SageMakerVariantInvocationsPerInstance("SageMakerVariantInvocationsPerInstance"),
    ECSServiceAverageCPUUtilization("ECSServiceAverageCPUUtilization"),
    ECSServiceAverageMemoryUtilization("ECSServiceAverageMemoryUtilization"),
    AppStreamAverageCapacityUtilization("AppStreamAverageCapacityUtilization"),
    ComprehendInferenceUtilization("ComprehendInferenceUtilization"),
    LambdaProvisionedConcurrencyUtilization("LambdaProvisionedConcurrencyUtilization"),
    CassandraReadCapacityUtilization("CassandraReadCapacityUtilization"),
    CassandraWriteCapacityUtilization("CassandraWriteCapacityUtilization");

    private String value;

    private MetricType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MetricType> enumMap;
    static {
        enumMap = new HashMap<String, MetricType>();
        enumMap.put("DynamoDBReadCapacityUtilization", DynamoDBReadCapacityUtilization);
        enumMap.put("DynamoDBWriteCapacityUtilization", DynamoDBWriteCapacityUtilization);
        enumMap.put("ALBRequestCountPerTarget", ALBRequestCountPerTarget);
        enumMap.put("RDSReaderAverageCPUUtilization", RDSReaderAverageCPUUtilization);
        enumMap.put("RDSReaderAverageDatabaseConnections", RDSReaderAverageDatabaseConnections);
        enumMap.put("EC2SpotFleetRequestAverageCPUUtilization",
                EC2SpotFleetRequestAverageCPUUtilization);
        enumMap.put("EC2SpotFleetRequestAverageNetworkIn", EC2SpotFleetRequestAverageNetworkIn);
        enumMap.put("EC2SpotFleetRequestAverageNetworkOut", EC2SpotFleetRequestAverageNetworkOut);
        enumMap.put("SageMakerVariantInvocationsPerInstance",
                SageMakerVariantInvocationsPerInstance);
        enumMap.put("ECSServiceAverageCPUUtilization", ECSServiceAverageCPUUtilization);
        enumMap.put("ECSServiceAverageMemoryUtilization", ECSServiceAverageMemoryUtilization);
        enumMap.put("AppStreamAverageCapacityUtilization", AppStreamAverageCapacityUtilization);
        enumMap.put("ComprehendInferenceUtilization", ComprehendInferenceUtilization);
        enumMap.put("LambdaProvisionedConcurrencyUtilization",
                LambdaProvisionedConcurrencyUtilization);
        enumMap.put("CassandraReadCapacityUtilization", CassandraReadCapacityUtilization);
        enumMap.put("CassandraWriteCapacityUtilization", CassandraWriteCapacityUtilization);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MetricType corresponding to the value
     */
    public static MetricType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
