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

package com.amazonaws.services.kendra.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Source Sync Job Status
 */
public enum DataSourceSyncJobStatus {

    FAILED("FAILED"),
    SUCCEEDED("SUCCEEDED"),
    SYNCING("SYNCING"),
    INCOMPLETE("INCOMPLETE"),
    STOPPING("STOPPING"),
    ABORTED("ABORTED"),
    SYNCING_INDEXING("SYNCING_INDEXING");

    private String value;

    private DataSourceSyncJobStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DataSourceSyncJobStatus> enumMap;
    static {
        enumMap = new HashMap<String, DataSourceSyncJobStatus>();
        enumMap.put("FAILED", FAILED);
        enumMap.put("SUCCEEDED", SUCCEEDED);
        enumMap.put("SYNCING", SYNCING);
        enumMap.put("INCOMPLETE", INCOMPLETE);
        enumMap.put("STOPPING", STOPPING);
        enumMap.put("ABORTED", ABORTED);
        enumMap.put("SYNCING_INDEXING", SYNCING_INDEXING);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DataSourceSyncJobStatus corresponding to the value
     */
    public static DataSourceSyncJobStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
