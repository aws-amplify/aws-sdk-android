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

package com.amazonaws.services.es.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Outbound Cross Cluster Search Connection Status Code
 */
public enum OutboundCrossClusterSearchConnectionStatusCode {

    PENDING_ACCEPTANCE("PENDING_ACCEPTANCE"),
    VALIDATING("VALIDATING"),
    VALIDATION_FAILED("VALIDATION_FAILED"),
    PROVISIONING("PROVISIONING"),
    ACTIVE("ACTIVE"),
    REJECTED("REJECTED"),
    DELETING("DELETING"),
    DELETED("DELETED");

    private String value;

    private OutboundCrossClusterSearchConnectionStatusCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OutboundCrossClusterSearchConnectionStatusCode> enumMap;
    static {
        enumMap = new HashMap<String, OutboundCrossClusterSearchConnectionStatusCode>();
        enumMap.put("PENDING_ACCEPTANCE", PENDING_ACCEPTANCE);
        enumMap.put("VALIDATING", VALIDATING);
        enumMap.put("VALIDATION_FAILED", VALIDATION_FAILED);
        enumMap.put("PROVISIONING", PROVISIONING);
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("REJECTED", REJECTED);
        enumMap.put("DELETING", DELETING);
        enumMap.put("DELETED", DELETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return OutboundCrossClusterSearchConnectionStatusCode corresponding to
     *         the value
     */
    public static OutboundCrossClusterSearchConnectionStatusCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
