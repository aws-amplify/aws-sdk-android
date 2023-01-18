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
 * Resource Type
 */
public enum ResourceType {

    CONTACT("CONTACT"),
    CONTACT_FLOW("CONTACT_FLOW"),
    INSTANCE("INSTANCE"),
    PARTICIPANT("PARTICIPANT"),
    HIERARCHY_LEVEL("HIERARCHY_LEVEL"),
    HIERARCHY_GROUP("HIERARCHY_GROUP"),
    USER("USER");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceType> enumMap;
    static {
        enumMap = new HashMap<String, ResourceType>();
        enumMap.put("CONTACT", CONTACT);
        enumMap.put("CONTACT_FLOW", CONTACT_FLOW);
        enumMap.put("INSTANCE", INSTANCE);
        enumMap.put("PARTICIPANT", PARTICIPANT);
        enumMap.put("HIERARCHY_LEVEL", HIERARCHY_LEVEL);
        enumMap.put("HIERARCHY_GROUP", HIERARCHY_GROUP);
        enumMap.put("USER", USER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
