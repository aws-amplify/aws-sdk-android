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

package com.amazonaws.services.ecs.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Setting Name
 */
public enum SettingName {

    ServiceLongArnFormat("serviceLongArnFormat"),
    TaskLongArnFormat("taskLongArnFormat"),
    ContainerInstanceLongArnFormat("containerInstanceLongArnFormat"),
    AwsvpcTrunking("awsvpcTrunking"),
    ContainerInsights("containerInsights");

    private String value;

    private SettingName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SettingName> enumMap;
    static {
        enumMap = new HashMap<String, SettingName>();
        enumMap.put("serviceLongArnFormat", ServiceLongArnFormat);
        enumMap.put("taskLongArnFormat", TaskLongArnFormat);
        enumMap.put("containerInstanceLongArnFormat", ContainerInstanceLongArnFormat);
        enumMap.put("awsvpcTrunking", AwsvpcTrunking);
        enumMap.put("containerInsights", ContainerInsights);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SettingName corresponding to the value
     */
    public static SettingName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
