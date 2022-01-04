/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Dataset Status
 */
public enum DatasetStatus {

    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    CREATE_FAILED("CREATE_FAILED"),
    UPDATE_IN_PROGRESS("UPDATE_IN_PROGRESS"),
    UPDATE_COMPLETE("UPDATE_COMPLETE"),
    UPDATE_FAILED("UPDATE_FAILED"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS");

    private String value;

    private DatasetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DatasetStatus> enumMap;
    static {
        enumMap = new HashMap<String, DatasetStatus>();
        enumMap.put("CREATE_IN_PROGRESS", CREATE_IN_PROGRESS);
        enumMap.put("CREATE_COMPLETE", CREATE_COMPLETE);
        enumMap.put("CREATE_FAILED", CREATE_FAILED);
        enumMap.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
        enumMap.put("UPDATE_COMPLETE", UPDATE_COMPLETE);
        enumMap.put("UPDATE_FAILED", UPDATE_FAILED);
        enumMap.put("DELETE_IN_PROGRESS", DELETE_IN_PROGRESS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DatasetStatus corresponding to the value
     */
    public static DatasetStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
