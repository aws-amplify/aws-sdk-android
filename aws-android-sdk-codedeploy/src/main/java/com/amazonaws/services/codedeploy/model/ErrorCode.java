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

package com.amazonaws.services.codedeploy.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Error Code
 */
public enum ErrorCode {

    AGENT_ISSUE("AGENT_ISSUE"),
    ALARM_ACTIVE("ALARM_ACTIVE"),
    APPLICATION_MISSING("APPLICATION_MISSING"),
    AUTOSCALING_VALIDATION_ERROR("AUTOSCALING_VALIDATION_ERROR"),
    AUTO_SCALING_CONFIGURATION("AUTO_SCALING_CONFIGURATION"),
    AUTO_SCALING_IAM_ROLE_PERMISSIONS("AUTO_SCALING_IAM_ROLE_PERMISSIONS"),
    CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND("CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND"),
    CUSTOMER_APPLICATION_UNHEALTHY("CUSTOMER_APPLICATION_UNHEALTHY"),
    DEPLOYMENT_GROUP_MISSING("DEPLOYMENT_GROUP_MISSING"),
    ECS_UPDATE_ERROR("ECS_UPDATE_ERROR"),
    ELASTIC_LOAD_BALANCING_INVALID("ELASTIC_LOAD_BALANCING_INVALID"),
    ELB_INVALID_INSTANCE("ELB_INVALID_INSTANCE"),
    HEALTH_CONSTRAINTS("HEALTH_CONSTRAINTS"),
    HEALTH_CONSTRAINTS_INVALID("HEALTH_CONSTRAINTS_INVALID"),
    HOOK_EXECUTION_FAILURE("HOOK_EXECUTION_FAILURE"),
    IAM_ROLE_MISSING("IAM_ROLE_MISSING"),
    IAM_ROLE_PERMISSIONS("IAM_ROLE_PERMISSIONS"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INVALID_ECS_SERVICE("INVALID_ECS_SERVICE"),
    INVALID_LAMBDA_CONFIGURATION("INVALID_LAMBDA_CONFIGURATION"),
    INVALID_LAMBDA_FUNCTION("INVALID_LAMBDA_FUNCTION"),
    INVALID_REVISION("INVALID_REVISION"),
    MANUAL_STOP("MANUAL_STOP"),
    MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION("MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"),
    MISSING_ELB_INFORMATION("MISSING_ELB_INFORMATION"),
    MISSING_GITHUB_TOKEN("MISSING_GITHUB_TOKEN"),
    NO_EC2_SUBSCRIPTION("NO_EC2_SUBSCRIPTION"),
    NO_INSTANCES("NO_INSTANCES"),
    OVER_MAX_INSTANCES("OVER_MAX_INSTANCES"),
    RESOURCE_LIMIT_EXCEEDED("RESOURCE_LIMIT_EXCEEDED"),
    REVISION_MISSING("REVISION_MISSING"),
    THROTTLED("THROTTLED"),
    TIMEOUT("TIMEOUT"),
    CLOUDFORMATION_STACK_FAILURE("CLOUDFORMATION_STACK_FAILURE");

    private String value;

    private ErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, ErrorCode>();
        enumMap.put("AGENT_ISSUE", AGENT_ISSUE);
        enumMap.put("ALARM_ACTIVE", ALARM_ACTIVE);
        enumMap.put("APPLICATION_MISSING", APPLICATION_MISSING);
        enumMap.put("AUTOSCALING_VALIDATION_ERROR", AUTOSCALING_VALIDATION_ERROR);
        enumMap.put("AUTO_SCALING_CONFIGURATION", AUTO_SCALING_CONFIGURATION);
        enumMap.put("AUTO_SCALING_IAM_ROLE_PERMISSIONS", AUTO_SCALING_IAM_ROLE_PERMISSIONS);
        enumMap.put("CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND", CODEDEPLOY_RESOURCE_CANNOT_BE_FOUND);
        enumMap.put("CUSTOMER_APPLICATION_UNHEALTHY", CUSTOMER_APPLICATION_UNHEALTHY);
        enumMap.put("DEPLOYMENT_GROUP_MISSING", DEPLOYMENT_GROUP_MISSING);
        enumMap.put("ECS_UPDATE_ERROR", ECS_UPDATE_ERROR);
        enumMap.put("ELASTIC_LOAD_BALANCING_INVALID", ELASTIC_LOAD_BALANCING_INVALID);
        enumMap.put("ELB_INVALID_INSTANCE", ELB_INVALID_INSTANCE);
        enumMap.put("HEALTH_CONSTRAINTS", HEALTH_CONSTRAINTS);
        enumMap.put("HEALTH_CONSTRAINTS_INVALID", HEALTH_CONSTRAINTS_INVALID);
        enumMap.put("HOOK_EXECUTION_FAILURE", HOOK_EXECUTION_FAILURE);
        enumMap.put("IAM_ROLE_MISSING", IAM_ROLE_MISSING);
        enumMap.put("IAM_ROLE_PERMISSIONS", IAM_ROLE_PERMISSIONS);
        enumMap.put("INTERNAL_ERROR", INTERNAL_ERROR);
        enumMap.put("INVALID_ECS_SERVICE", INVALID_ECS_SERVICE);
        enumMap.put("INVALID_LAMBDA_CONFIGURATION", INVALID_LAMBDA_CONFIGURATION);
        enumMap.put("INVALID_LAMBDA_FUNCTION", INVALID_LAMBDA_FUNCTION);
        enumMap.put("INVALID_REVISION", INVALID_REVISION);
        enumMap.put("MANUAL_STOP", MANUAL_STOP);
        enumMap.put("MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION",
                MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION);
        enumMap.put("MISSING_ELB_INFORMATION", MISSING_ELB_INFORMATION);
        enumMap.put("MISSING_GITHUB_TOKEN", MISSING_GITHUB_TOKEN);
        enumMap.put("NO_EC2_SUBSCRIPTION", NO_EC2_SUBSCRIPTION);
        enumMap.put("NO_INSTANCES", NO_INSTANCES);
        enumMap.put("OVER_MAX_INSTANCES", OVER_MAX_INSTANCES);
        enumMap.put("RESOURCE_LIMIT_EXCEEDED", RESOURCE_LIMIT_EXCEEDED);
        enumMap.put("REVISION_MISSING", REVISION_MISSING);
        enumMap.put("THROTTLED", THROTTLED);
        enumMap.put("TIMEOUT", TIMEOUT);
        enumMap.put("CLOUDFORMATION_STACK_FAILURE", CLOUDFORMATION_STACK_FAILURE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ErrorCode corresponding to the value
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
