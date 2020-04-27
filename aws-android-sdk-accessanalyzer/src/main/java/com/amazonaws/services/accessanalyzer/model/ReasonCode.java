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

package com.amazonaws.services.accessanalyzer.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Reason Code
 */
public enum ReasonCode {

    AWS_SERVICE_ACCESS_DISABLED("AWS_SERVICE_ACCESS_DISABLED"),
    DELEGATED_ADMINISTRATOR_DEREGISTERED("DELEGATED_ADMINISTRATOR_DEREGISTERED"),
    ORGANIZATION_DELETED("ORGANIZATION_DELETED"),
    SERVICE_LINKED_ROLE_CREATION_FAILED("SERVICE_LINKED_ROLE_CREATION_FAILED");

    private String value;

    private ReasonCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ReasonCode> enumMap;
    static {
        enumMap = new HashMap<String, ReasonCode>();
        enumMap.put("AWS_SERVICE_ACCESS_DISABLED", AWS_SERVICE_ACCESS_DISABLED);
        enumMap.put("DELEGATED_ADMINISTRATOR_DEREGISTERED", DELEGATED_ADMINISTRATOR_DEREGISTERED);
        enumMap.put("ORGANIZATION_DELETED", ORGANIZATION_DELETED);
        enumMap.put("SERVICE_LINKED_ROLE_CREATION_FAILED", SERVICE_LINKED_ROLE_CREATION_FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ReasonCode corresponding to the value
     */
    public static ReasonCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
