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

package com.amazonaws.services.awscostexplorerservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Dimension
 */
public enum Dimension {

    AZ("AZ"),
    INSTANCE_TYPE("INSTANCE_TYPE"),
    LINKED_ACCOUNT("LINKED_ACCOUNT"),
    LINKED_ACCOUNT_NAME("LINKED_ACCOUNT_NAME"),
    OPERATION("OPERATION"),
    PURCHASE_TYPE("PURCHASE_TYPE"),
    REGION("REGION"),
    SERVICE("SERVICE"),
    SERVICE_CODE("SERVICE_CODE"),
    USAGE_TYPE("USAGE_TYPE"),
    USAGE_TYPE_GROUP("USAGE_TYPE_GROUP"),
    RECORD_TYPE("RECORD_TYPE"),
    OPERATING_SYSTEM("OPERATING_SYSTEM"),
    TENANCY("TENANCY"),
    SCOPE("SCOPE"),
    PLATFORM("PLATFORM"),
    SUBSCRIPTION_ID("SUBSCRIPTION_ID"),
    LEGAL_ENTITY_NAME("LEGAL_ENTITY_NAME"),
    DEPLOYMENT_OPTION("DEPLOYMENT_OPTION"),
    DATABASE_ENGINE("DATABASE_ENGINE"),
    CACHE_ENGINE("CACHE_ENGINE"),
    INSTANCE_TYPE_FAMILY("INSTANCE_TYPE_FAMILY"),
    BILLING_ENTITY("BILLING_ENTITY"),
    RESERVATION_ID("RESERVATION_ID"),
    RESOURCE_ID("RESOURCE_ID"),
    RIGHTSIZING_TYPE("RIGHTSIZING_TYPE"),
    SAVINGS_PLANS_TYPE("SAVINGS_PLANS_TYPE"),
    SAVINGS_PLAN_ARN("SAVINGS_PLAN_ARN"),
    PAYMENT_OPTION("PAYMENT_OPTION");

    private String value;

    private Dimension(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Dimension> enumMap;
    static {
        enumMap = new HashMap<String, Dimension>();
        enumMap.put("AZ", AZ);
        enumMap.put("INSTANCE_TYPE", INSTANCE_TYPE);
        enumMap.put("LINKED_ACCOUNT", LINKED_ACCOUNT);
        enumMap.put("LINKED_ACCOUNT_NAME", LINKED_ACCOUNT_NAME);
        enumMap.put("OPERATION", OPERATION);
        enumMap.put("PURCHASE_TYPE", PURCHASE_TYPE);
        enumMap.put("REGION", REGION);
        enumMap.put("SERVICE", SERVICE);
        enumMap.put("SERVICE_CODE", SERVICE_CODE);
        enumMap.put("USAGE_TYPE", USAGE_TYPE);
        enumMap.put("USAGE_TYPE_GROUP", USAGE_TYPE_GROUP);
        enumMap.put("RECORD_TYPE", RECORD_TYPE);
        enumMap.put("OPERATING_SYSTEM", OPERATING_SYSTEM);
        enumMap.put("TENANCY", TENANCY);
        enumMap.put("SCOPE", SCOPE);
        enumMap.put("PLATFORM", PLATFORM);
        enumMap.put("SUBSCRIPTION_ID", SUBSCRIPTION_ID);
        enumMap.put("LEGAL_ENTITY_NAME", LEGAL_ENTITY_NAME);
        enumMap.put("DEPLOYMENT_OPTION", DEPLOYMENT_OPTION);
        enumMap.put("DATABASE_ENGINE", DATABASE_ENGINE);
        enumMap.put("CACHE_ENGINE", CACHE_ENGINE);
        enumMap.put("INSTANCE_TYPE_FAMILY", INSTANCE_TYPE_FAMILY);
        enumMap.put("BILLING_ENTITY", BILLING_ENTITY);
        enumMap.put("RESERVATION_ID", RESERVATION_ID);
        enumMap.put("RESOURCE_ID", RESOURCE_ID);
        enumMap.put("RIGHTSIZING_TYPE", RIGHTSIZING_TYPE);
        enumMap.put("SAVINGS_PLANS_TYPE", SAVINGS_PLANS_TYPE);
        enumMap.put("SAVINGS_PLAN_ARN", SAVINGS_PLAN_ARN);
        enumMap.put("PAYMENT_OPTION", PAYMENT_OPTION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Dimension corresponding to the value
     */
    public static Dimension fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
