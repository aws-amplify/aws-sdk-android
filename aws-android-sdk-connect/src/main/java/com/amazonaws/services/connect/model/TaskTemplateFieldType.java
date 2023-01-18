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
 * Task Template Field Type
 */
public enum TaskTemplateFieldType {

    NAME("NAME"),
    DESCRIPTION("DESCRIPTION"),
    SCHEDULED_TIME("SCHEDULED_TIME"),
    QUICK_CONNECT("QUICK_CONNECT"),
    URL("URL"),
    NUMBER("NUMBER"),
    TEXT("TEXT"),
    TEXT_AREA("TEXT_AREA"),
    DATE_TIME("DATE_TIME"),
    BOOLEAN("BOOLEAN"),
    SINGLE_SELECT("SINGLE_SELECT"),
    EMAIL("EMAIL");

    private String value;

    private TaskTemplateFieldType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TaskTemplateFieldType> enumMap;
    static {
        enumMap = new HashMap<String, TaskTemplateFieldType>();
        enumMap.put("NAME", NAME);
        enumMap.put("DESCRIPTION", DESCRIPTION);
        enumMap.put("SCHEDULED_TIME", SCHEDULED_TIME);
        enumMap.put("QUICK_CONNECT", QUICK_CONNECT);
        enumMap.put("URL", URL);
        enumMap.put("NUMBER", NUMBER);
        enumMap.put("TEXT", TEXT);
        enumMap.put("TEXT_AREA", TEXT_AREA);
        enumMap.put("DATE_TIME", DATE_TIME);
        enumMap.put("BOOLEAN", BOOLEAN);
        enumMap.put("SINGLE_SELECT", SINGLE_SELECT);
        enumMap.put("EMAIL", EMAIL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TaskTemplateFieldType corresponding to the value
     */
    public static TaskTemplateFieldType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
