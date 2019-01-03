/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Audit Check Run Status
 */
public enum AuditCheckRunStatus {

    IN_PROGRESS("IN_PROGRESS"),
    WAITING_FOR_DATA_COLLECTION("WAITING_FOR_DATA_COLLECTION"),
    CANCELED("CANCELED"),
    COMPLETED_COMPLIANT("COMPLETED_COMPLIANT"),
    COMPLETED_NON_COMPLIANT("COMPLETED_NON_COMPLIANT"),
    FAILED("FAILED");

    private String value;

    private AuditCheckRunStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AuditCheckRunStatus> enumMap;
    static {
        enumMap = new HashMap<String, AuditCheckRunStatus>();
        enumMap.put("IN_PROGRESS", IN_PROGRESS);
        enumMap.put("WAITING_FOR_DATA_COLLECTION", WAITING_FOR_DATA_COLLECTION);
        enumMap.put("CANCELED", CANCELED);
        enumMap.put("COMPLETED_COMPLIANT", COMPLETED_COMPLIANT);
        enumMap.put("COMPLETED_NON_COMPLIANT", COMPLETED_NON_COMPLIANT);
        enumMap.put("FAILED", FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AuditCheckRunStatus corresponding to the value
     */
    public static AuditCheckRunStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
