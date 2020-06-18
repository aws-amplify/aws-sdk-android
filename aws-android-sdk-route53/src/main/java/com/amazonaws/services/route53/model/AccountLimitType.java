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

package com.amazonaws.services.route53.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Account Limit Type
 */
public enum AccountLimitType {

    MAX_HEALTH_CHECKS_BY_OWNER("MAX_HEALTH_CHECKS_BY_OWNER"),
    MAX_HOSTED_ZONES_BY_OWNER("MAX_HOSTED_ZONES_BY_OWNER"),
    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER("MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"),
    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER("MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"),
    MAX_TRAFFIC_POLICIES_BY_OWNER("MAX_TRAFFIC_POLICIES_BY_OWNER");

    private String value;

    private AccountLimitType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AccountLimitType> enumMap;
    static {
        enumMap = new HashMap<String, AccountLimitType>();
        enumMap.put("MAX_HEALTH_CHECKS_BY_OWNER", MAX_HEALTH_CHECKS_BY_OWNER);
        enumMap.put("MAX_HOSTED_ZONES_BY_OWNER", MAX_HOSTED_ZONES_BY_OWNER);
        enumMap.put("MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER);
        enumMap.put("MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", MAX_REUSABLE_DELEGATION_SETS_BY_OWNER);
        enumMap.put("MAX_TRAFFIC_POLICIES_BY_OWNER", MAX_TRAFFIC_POLICIES_BY_OWNER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AccountLimitType corresponding to the value
     */
    public static AccountLimitType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
