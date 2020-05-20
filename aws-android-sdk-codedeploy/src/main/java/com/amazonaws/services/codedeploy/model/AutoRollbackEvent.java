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
 * Auto Rollback Event
 */
public enum AutoRollbackEvent {

    DEPLOYMENT_FAILURE("DEPLOYMENT_FAILURE"),
    DEPLOYMENT_STOP_ON_ALARM("DEPLOYMENT_STOP_ON_ALARM"),
    DEPLOYMENT_STOP_ON_REQUEST("DEPLOYMENT_STOP_ON_REQUEST");

    private String value;

    private AutoRollbackEvent(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AutoRollbackEvent> enumMap;
    static {
        enumMap = new HashMap<String, AutoRollbackEvent>();
        enumMap.put("DEPLOYMENT_FAILURE", DEPLOYMENT_FAILURE);
        enumMap.put("DEPLOYMENT_STOP_ON_ALARM", DEPLOYMENT_STOP_ON_ALARM);
        enumMap.put("DEPLOYMENT_STOP_ON_REQUEST", DEPLOYMENT_STOP_ON_REQUEST);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AutoRollbackEvent corresponding to the value
     */
    public static AutoRollbackEvent fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
