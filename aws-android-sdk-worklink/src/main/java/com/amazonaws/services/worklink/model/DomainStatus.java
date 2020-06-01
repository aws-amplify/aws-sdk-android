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

package com.amazonaws.services.worklink.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Domain Status
 */
public enum DomainStatus {

    PENDING_VALIDATION("PENDING_VALIDATION"),
    ASSOCIATING("ASSOCIATING"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    DISASSOCIATING("DISASSOCIATING"),
    DISASSOCIATED("DISASSOCIATED"),
    FAILED_TO_ASSOCIATE("FAILED_TO_ASSOCIATE"),
    FAILED_TO_DISASSOCIATE("FAILED_TO_DISASSOCIATE");

    private String value;

    private DomainStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DomainStatus> enumMap;
    static {
        enumMap = new HashMap<String, DomainStatus>();
        enumMap.put("PENDING_VALIDATION", PENDING_VALIDATION);
        enumMap.put("ASSOCIATING", ASSOCIATING);
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("INACTIVE", INACTIVE);
        enumMap.put("DISASSOCIATING", DISASSOCIATING);
        enumMap.put("DISASSOCIATED", DISASSOCIATED);
        enumMap.put("FAILED_TO_ASSOCIATE", FAILED_TO_ASSOCIATE);
        enumMap.put("FAILED_TO_DISASSOCIATE", FAILED_TO_DISASSOCIATE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DomainStatus corresponding to the value
     */
    public static DomainStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
