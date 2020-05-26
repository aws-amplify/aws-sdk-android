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
 * Dashboard Error Type
 */
public enum DashboardErrorType {

    ACCESS_DENIED("ACCESS_DENIED"),
    SOURCE_NOT_FOUND("SOURCE_NOT_FOUND"),
    DATA_SET_NOT_FOUND("DATA_SET_NOT_FOUND"),
    INTERNAL_FAILURE("INTERNAL_FAILURE"),
    PARAMETER_VALUE_INCOMPATIBLE("PARAMETER_VALUE_INCOMPATIBLE"),
    PARAMETER_TYPE_INVALID("PARAMETER_TYPE_INVALID"),
    PARAMETER_NOT_FOUND("PARAMETER_NOT_FOUND"),
    COLUMN_TYPE_MISMATCH("COLUMN_TYPE_MISMATCH"),
    COLUMN_GEOGRAPHIC_ROLE_MISMATCH("COLUMN_GEOGRAPHIC_ROLE_MISMATCH"),
    COLUMN_REPLACEMENT_MISSING("COLUMN_REPLACEMENT_MISSING");

    private String value;

    private DashboardErrorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DashboardErrorType> enumMap;
    static {
        enumMap = new HashMap<String, DashboardErrorType>();
        enumMap.put("ACCESS_DENIED", ACCESS_DENIED);
        enumMap.put("SOURCE_NOT_FOUND", SOURCE_NOT_FOUND);
        enumMap.put("DATA_SET_NOT_FOUND", DATA_SET_NOT_FOUND);
        enumMap.put("INTERNAL_FAILURE", INTERNAL_FAILURE);
        enumMap.put("PARAMETER_VALUE_INCOMPATIBLE", PARAMETER_VALUE_INCOMPATIBLE);
        enumMap.put("PARAMETER_TYPE_INVALID", PARAMETER_TYPE_INVALID);
        enumMap.put("PARAMETER_NOT_FOUND", PARAMETER_NOT_FOUND);
        enumMap.put("COLUMN_TYPE_MISMATCH", COLUMN_TYPE_MISMATCH);
        enumMap.put("COLUMN_GEOGRAPHIC_ROLE_MISMATCH", COLUMN_GEOGRAPHIC_ROLE_MISMATCH);
        enumMap.put("COLUMN_REPLACEMENT_MISSING", COLUMN_REPLACEMENT_MISSING);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DashboardErrorType corresponding to the value
     */
    public static DashboardErrorType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
