/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Action Type
 */
public enum ActionType {

    CREATE_TASK("CREATE_TASK"),
    ASSIGN_CONTACT_CATEGORY("ASSIGN_CONTACT_CATEGORY"),
    GENERATE_EVENTBRIDGE_EVENT("GENERATE_EVENTBRIDGE_EVENT"),
    SEND_NOTIFICATION("SEND_NOTIFICATION");

    private String value;

    private ActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ActionType> enumMap;
    static {
        enumMap = new HashMap<String, ActionType>();
        enumMap.put("CREATE_TASK", CREATE_TASK);
        enumMap.put("ASSIGN_CONTACT_CATEGORY", ASSIGN_CONTACT_CATEGORY);
        enumMap.put("GENERATE_EVENTBRIDGE_EVENT", GENERATE_EVENTBRIDGE_EVENT);
        enumMap.put("SEND_NOTIFICATION", SEND_NOTIFICATION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ActionType corresponding to the value
     */
    public static ActionType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
