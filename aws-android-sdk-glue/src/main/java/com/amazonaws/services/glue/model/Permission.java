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

package com.amazonaws.services.glue.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Permission
 */
public enum Permission {

    ALL("ALL"),
    SELECT("SELECT"),
    ALTER("ALTER"),
    DROP("DROP"),
    DELETE("DELETE"),
    INSERT("INSERT"),
    CREATE_DATABASE("CREATE_DATABASE"),
    CREATE_TABLE("CREATE_TABLE"),
    DATA_LOCATION_ACCESS("DATA_LOCATION_ACCESS");

    private String value;

    private Permission(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Permission> enumMap;
    static {
        enumMap = new HashMap<String, Permission>();
        enumMap.put("ALL", ALL);
        enumMap.put("SELECT", SELECT);
        enumMap.put("ALTER", ALTER);
        enumMap.put("DROP", DROP);
        enumMap.put("DELETE", DELETE);
        enumMap.put("INSERT", INSERT);
        enumMap.put("CREATE_DATABASE", CREATE_DATABASE);
        enumMap.put("CREATE_TABLE", CREATE_TABLE);
        enumMap.put("DATA_LOCATION_ACCESS", DATA_LOCATION_ACCESS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Permission corresponding to the value
     */
    public static Permission fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
