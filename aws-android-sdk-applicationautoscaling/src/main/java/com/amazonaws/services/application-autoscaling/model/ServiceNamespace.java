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
 * Service Namespace
 */
public enum ServiceNamespace {

    Ecs("ecs"),
    Elasticmapreduce("elasticmapreduce"),
    Ec2("ec2"),
    Appstream("appstream"),
    Dynamodb("dynamodb"),
    Rds("rds"),
    Sagemaker("sagemaker"),
    CustomResource("custom-resource"),
    Comprehend("comprehend"),
    Lambda("lambda"),
    Cassandra("cassandra");

    private String value;

    private ServiceNamespace(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ServiceNamespace> enumMap;
    static {
        enumMap = new HashMap<String, ServiceNamespace>();
        enumMap.put("ecs", Ecs);
        enumMap.put("elasticmapreduce", Elasticmapreduce);
        enumMap.put("ec2", Ec2);
        enumMap.put("appstream", Appstream);
        enumMap.put("dynamodb", Dynamodb);
        enumMap.put("rds", Rds);
        enumMap.put("sagemaker", Sagemaker);
        enumMap.put("custom-resource", CustomResource);
        enumMap.put("comprehend", Comprehend);
        enumMap.put("lambda", Lambda);
        enumMap.put("cassandra", Cassandra);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return ServiceNamespace corresponding to the value
     */
    public static ServiceNamespace fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
