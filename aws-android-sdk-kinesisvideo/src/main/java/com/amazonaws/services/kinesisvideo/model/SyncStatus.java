/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Sync Status
 */
public enum SyncStatus {

    SYNCING("SYNCING"),
    ACKNOWLEDGED("ACKNOWLEDGED"),
    IN_SYNC("IN_SYNC"),
    SYNC_FAILED("SYNC_FAILED"),
    DELETING("DELETING"),
    DELETE_FAILED("DELETE_FAILED"),
    DELETING_ACKNOWLEDGED("DELETING_ACKNOWLEDGED");

    private String value;

    private SyncStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SyncStatus> enumMap;
    static {
        enumMap = new HashMap<String, SyncStatus>();
        enumMap.put("SYNCING", SYNCING);
        enumMap.put("ACKNOWLEDGED", ACKNOWLEDGED);
        enumMap.put("IN_SYNC", IN_SYNC);
        enumMap.put("SYNC_FAILED", SYNC_FAILED);
        enumMap.put("DELETING", DELETING);
        enumMap.put("DELETE_FAILED", DELETE_FAILED);
        enumMap.put("DELETING_ACKNOWLEDGED", DELETING_ACKNOWLEDGED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SyncStatus corresponding to the value
     */
    public static SyncStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
