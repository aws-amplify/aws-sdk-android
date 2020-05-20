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

package com.amazonaws.services.backup.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Backup Job State
 */
public enum BackupJobState {

    CREATED("CREATED"),
    PENDING("PENDING"),
    RUNNING("RUNNING"),
    ABORTING("ABORTING"),
    ABORTED("ABORTED"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    EXPIRED("EXPIRED");

    private String value;

    private BackupJobState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BackupJobState> enumMap;
    static {
        enumMap = new HashMap<String, BackupJobState>();
        enumMap.put("CREATED", CREATED);
        enumMap.put("PENDING", PENDING);
        enumMap.put("RUNNING", RUNNING);
        enumMap.put("ABORTING", ABORTING);
        enumMap.put("ABORTED", ABORTED);
        enumMap.put("COMPLETED", COMPLETED);
        enumMap.put("FAILED", FAILED);
        enumMap.put("EXPIRED", EXPIRED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BackupJobState corresponding to the value
     */
    public static BackupJobState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
