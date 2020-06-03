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

package com.amazonaws.services.iam.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Policy Source Type
 */
public enum PolicySourceType {

    User("user"),
    Group("group"),
    Role("role"),
    AwsManaged("aws-managed"),
    UserManaged("user-managed"),
    Resource("resource"),
    None("none");

    private String value;

    private PolicySourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PolicySourceType> enumMap;
    static {
        enumMap = new HashMap<String, PolicySourceType>();
        enumMap.put("user", User);
        enumMap.put("group", Group);
        enumMap.put("role", Role);
        enumMap.put("aws-managed", AwsManaged);
        enumMap.put("user-managed", UserManaged);
        enumMap.put("resource", Resource);
        enumMap.put("none", None);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PolicySourceType corresponding to the value
     */
    public static PolicySourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
