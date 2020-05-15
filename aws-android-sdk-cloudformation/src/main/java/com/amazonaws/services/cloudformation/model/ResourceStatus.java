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

package com.amazonaws.services.cloudformation.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Resource Status
 */
public enum ResourceStatus {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_FAILED("CREATE_FAILED"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS"),
    DELETE_FAILED("DELETE_FAILED"),
    DELETE_COMPLETE("DELETE_COMPLETE"),
    DELETE_SKIPPED("DELETE_SKIPPED"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    UPDATE_FAILED("UPDATE_FAILED"),
    UPDATE_COMPLETE("UPDATE_COMPLETE"),
    IMPORT_FAILED("IMPORT_FAILED"),
    IMPORT_COMPLETE("IMPORT_COMPLETE"),
    IMPORT_IN_PROGRESS("IMPORT_IN_PROGRESS"),
    IMPORT_ROLLBACK_IN_PROGRESS("IMPORT_ROLLBACK_IN_PROGRESS"),
    IMPORT_ROLLBACK_FAILED("IMPORT_ROLLBACK_FAILED"),
    IMPORT_ROLLBACK_COMPLETE("IMPORT_ROLLBACK_COMPLETE");

    private String value;

    private ResourceStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceStatus> enumMap;
    static {
        enumMap = new HashMap<String, ResourceStatus>();
        enumMap.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
        enumMap.put("CREATE_FAILED", CREATE_FAILED);
        enumMap.put("CREATE_COMPLETE", CREATE_COMPLETE);
        enumMap.put("DELETE_IN_PROGRESS", DELETE_IN_PROGRESS);
        enumMap.put("DELETE_FAILED", DELETE_FAILED);
        enumMap.put("DELETE_COMPLETE", DELETE_COMPLETE);
        enumMap.put("DELETE_SKIPPED", DELETE_SKIPPED);
        enumMap.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
        enumMap.put("UPDATE_FAILED", UPDATE_FAILED);
        enumMap.put("UPDATE_COMPLETE", UPDATE_COMPLETE);
        enumMap.put("IMPORT_FAILED", IMPORT_FAILED);
        enumMap.put("IMPORT_COMPLETE", IMPORT_COMPLETE);
        enumMap.put("IMPORT_IN_PROGRESS", IMPORT_IN_PROGRESS);
        enumMap.put("IMPORT_ROLLBACK_IN_PROGRESS", IMPORT_ROLLBACK_IN_PROGRESS);
        enumMap.put("IMPORT_ROLLBACK_FAILED", IMPORT_ROLLBACK_FAILED);
        enumMap.put("IMPORT_ROLLBACK_COMPLETE", IMPORT_ROLLBACK_COMPLETE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceStatus corresponding to the value
     */
    public static ResourceStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
