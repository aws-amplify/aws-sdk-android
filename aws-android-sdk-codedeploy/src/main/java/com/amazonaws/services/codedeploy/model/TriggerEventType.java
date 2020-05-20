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
 * Trigger Event Type
 */
public enum TriggerEventType {

    DeploymentStart("DeploymentStart"),
    DeploymentSuccess("DeploymentSuccess"),
    DeploymentFailure("DeploymentFailure"),
    DeploymentStop("DeploymentStop"),
    DeploymentRollback("DeploymentRollback"),
    DeploymentReady("DeploymentReady"),
    InstanceStart("InstanceStart"),
    InstanceSuccess("InstanceSuccess"),
    InstanceFailure("InstanceFailure"),
    InstanceReady("InstanceReady");

    private String value;

    private TriggerEventType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TriggerEventType> enumMap;
    static {
        enumMap = new HashMap<String, TriggerEventType>();
        enumMap.put("DeploymentStart", DeploymentStart);
        enumMap.put("DeploymentSuccess", DeploymentSuccess);
        enumMap.put("DeploymentFailure", DeploymentFailure);
        enumMap.put("DeploymentStop", DeploymentStop);
        enumMap.put("DeploymentRollback", DeploymentRollback);
        enumMap.put("DeploymentReady", DeploymentReady);
        enumMap.put("InstanceStart", InstanceStart);
        enumMap.put("InstanceSuccess", InstanceSuccess);
        enumMap.put("InstanceFailure", InstanceFailure);
        enumMap.put("InstanceReady", InstanceReady);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TriggerEventType corresponding to the value
     */
    public static TriggerEventType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
