/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Attached File Invalid Request Exception Reason
 */
public enum AttachedFileInvalidRequestExceptionReason {

    INVALID_FILE_SIZE("INVALID_FILE_SIZE"),
    INVALID_FILE_TYPE("INVALID_FILE_TYPE"),
    INVALID_FILE_NAME("INVALID_FILE_NAME");

    private String value;

    private AttachedFileInvalidRequestExceptionReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AttachedFileInvalidRequestExceptionReason> enumMap;
    static {
        enumMap = new HashMap<String, AttachedFileInvalidRequestExceptionReason>();
        enumMap.put("INVALID_FILE_SIZE", INVALID_FILE_SIZE);
        enumMap.put("INVALID_FILE_TYPE", INVALID_FILE_TYPE);
        enumMap.put("INVALID_FILE_NAME", INVALID_FILE_NAME);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AttachedFileInvalidRequestExceptionReason corresponding to the
     *         value
     */
    public static AttachedFileInvalidRequestExceptionReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
