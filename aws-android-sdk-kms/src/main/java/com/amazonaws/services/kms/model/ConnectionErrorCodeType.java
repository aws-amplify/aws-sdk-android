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

package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Connection Error Code Type
 */
public enum ConnectionErrorCodeType {

    INVALID_CREDENTIALS("INVALID_CREDENTIALS"),
    CLUSTER_NOT_FOUND("CLUSTER_NOT_FOUND"),
    NETWORK_ERRORS("NETWORK_ERRORS"),
    INSUFFICIENT_CLOUDHSM_HSMS("INSUFFICIENT_CLOUDHSM_HSMS"),
    USER_LOCKED_OUT("USER_LOCKED_OUT");

    private String value;

    private ConnectionErrorCodeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ConnectionErrorCodeType> enumMap;
    static {
        enumMap = new HashMap<String, ConnectionErrorCodeType>();
        enumMap.put("INVALID_CREDENTIALS", INVALID_CREDENTIALS);
        enumMap.put("CLUSTER_NOT_FOUND", CLUSTER_NOT_FOUND);
        enumMap.put("NETWORK_ERRORS", NETWORK_ERRORS);
        enumMap.put("INSUFFICIENT_CLOUDHSM_HSMS", INSUFFICIENT_CLOUDHSM_HSMS);
        enumMap.put("USER_LOCKED_OUT", USER_LOCKED_OUT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ConnectionErrorCodeType corresponding to the value
     */
    public static ConnectionErrorCodeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
