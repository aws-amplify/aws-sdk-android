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
package com.amazonaws.services.application-autoscaling.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Scalable Dimension
 */
public enum ScalableDimension {

    EcsServiceDesiredCount("ecs:service:DesiredCount"),
    Ec2SpotFleetRequestTargetCapacity("ec2:spot-fleet-request:TargetCapacity"),
    ElasticmapreduceInstancegroupInstanceCount("elasticmapreduce:instancegroup:InstanceCount"),
    AppstreamFleetDesiredCapacity("appstream:fleet:DesiredCapacity"),
    DynamodbTableReadCapacityUnits("dynamodb:table:ReadCapacityUnits"),
    DynamodbTableWriteCapacityUnits("dynamodb:table:WriteCapacityUnits"),
    DynamodbIndexReadCapacityUnits("dynamodb:index:ReadCapacityUnits"),
    DynamodbIndexWriteCapacityUnits("dynamodb:index:WriteCapacityUnits"),
    RdsClusterReadReplicaCount("rds:cluster:ReadReplicaCount"),
    SagemakerVariantDesiredInstanceCount("sagemaker:variant:DesiredInstanceCount"),
    CustomResourceResourceTypeProperty("custom-resource:ResourceType:Property"),
    ComprehendDocumentClassifierEndpointDesiredInferenceUnits("comprehend:document-classifier-endpoint:DesiredInferenceUnits"),
    LambdaFunctionProvisionedConcurrency("lambda:function:ProvisionedConcurrency"),
    CassandraTableReadCapacityUnits("cassandra:table:ReadCapacityUnits"),
    CassandraTableWriteCapacityUnits("cassandra:table:WriteCapacityUnits");

    private String value;

    private ScalableDimension(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ScalableDimension> enumMap;
    static {
        enumMap = new HashMap<String, ScalableDimension>();
        enumMap.put("ecs:service:DesiredCount", EcsServiceDesiredCount);
        enumMap.put("ec2:spot-fleet-request:TargetCapacity", Ec2SpotFleetRequestTargetCapacity);
        enumMap.put("elasticmapreduce:instancegroup:InstanceCount", ElasticmapreduceInstancegroupInstanceCount);
        enumMap.put("appstream:fleet:DesiredCapacity", AppstreamFleetDesiredCapacity);
        enumMap.put("dynamodb:table:ReadCapacityUnits", DynamodbTableReadCapacityUnits);
        enumMap.put("dynamodb:table:WriteCapacityUnits", DynamodbTableWriteCapacityUnits);
        enumMap.put("dynamodb:index:ReadCapacityUnits", DynamodbIndexReadCapacityUnits);
        enumMap.put("dynamodb:index:WriteCapacityUnits", DynamodbIndexWriteCapacityUnits);
        enumMap.put("rds:cluster:ReadReplicaCount", RdsClusterReadReplicaCount);
        enumMap.put("sagemaker:variant:DesiredInstanceCount", SagemakerVariantDesiredInstanceCount);
        enumMap.put("custom-resource:ResourceType:Property", CustomResourceResourceTypeProperty);
        enumMap.put("comprehend:document-classifier-endpoint:DesiredInferenceUnits", ComprehendDocumentClassifierEndpointDesiredInferenceUnits);
        enumMap.put("lambda:function:ProvisionedConcurrency", LambdaFunctionProvisionedConcurrency);
        enumMap.put("cassandra:table:ReadCapacityUnits", CassandraTableReadCapacityUnits);
        enumMap.put("cassandra:table:WriteCapacityUnits", CassandraTableWriteCapacityUnits);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ScalableDimension corresponding to the value
     */
    public static ScalableDimension fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
