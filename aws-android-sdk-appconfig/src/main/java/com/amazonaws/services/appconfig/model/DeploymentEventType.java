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

package com.amazonaws.services.appconfig.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Deployment Event Type
 */
public enum DeploymentEventType {

    PERCENTAGE_UPDATED("PERCENTAGE_UPDATED"),
    ROLLBACK_STARTED("ROLLBACK_STARTED"),
    ROLLBACK_COMPLETED("ROLLBACK_COMPLETED"),
    BAKE_TIME_STARTED("BAKE_TIME_STARTED"),
    DEPLOYMENT_STARTED("DEPLOYMENT_STARTED"),
    DEPLOYMENT_COMPLETED("DEPLOYMENT_COMPLETED");

    private String value;

    private DeploymentEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeploymentEventType> enumMap;
    static {
        enumMap = new HashMap<String, DeploymentEventType>();
        enumMap.put("PERCENTAGE_UPDATED", PERCENTAGE_UPDATED);
        enumMap.put("ROLLBACK_STARTED", ROLLBACK_STARTED);
        enumMap.put("ROLLBACK_COMPLETED", ROLLBACK_COMPLETED);
        enumMap.put("BAKE_TIME_STARTED", BAKE_TIME_STARTED);
        enumMap.put("DEPLOYMENT_STARTED", DEPLOYMENT_STARTED);
        enumMap.put("DEPLOYMENT_COMPLETED", DEPLOYMENT_COMPLETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeploymentEventType corresponding to the value
     */
    public static DeploymentEventType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
