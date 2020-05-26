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

package com.amazonaws.services.quicksight.model;

import java.util.HashMap;
import java.util.Map;

/**
 * User Role
 */
public enum UserRole {

    ADMIN("ADMIN"),
    AUTHOR("AUTHOR"),
    READER("READER"),
    RESTRICTED_AUTHOR("RESTRICTED_AUTHOR"),
    RESTRICTED_READER("RESTRICTED_READER");

    private String value;

    private UserRole(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, UserRole> enumMap;
    static {
        enumMap = new HashMap<String, UserRole>();
        enumMap.put("ADMIN", ADMIN);
        enumMap.put("AUTHOR", AUTHOR);
        enumMap.put("READER", READER);
        enumMap.put("RESTRICTED_AUTHOR", RESTRICTED_AUTHOR);
        enumMap.put("RESTRICTED_READER", RESTRICTED_READER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return UserRole corresponding to the value
     */
    public static UserRole fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
