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
 * Resource Type
 */
public enum ResourceType {

    DEVICE_CERTIFICATE("DEVICE_CERTIFICATE"),
    CA_CERTIFICATE("CA_CERTIFICATE"),
    IOT_POLICY("IOT_POLICY"),
    COGNITO_IDENTITY_POOL("COGNITO_IDENTITY_POOL"),
    CLIENT_ID("CLIENT_ID"),
    ACCOUNT_SETTINGS("ACCOUNT_SETTINGS");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ResourceType> enumMap;
    static {
        enumMap = new HashMap<String, ResourceType>();
        enumMap.put("DEVICE_CERTIFICATE", DEVICE_CERTIFICATE);
        enumMap.put("CA_CERTIFICATE", CA_CERTIFICATE);
        enumMap.put("IOT_POLICY", IOT_POLICY);
        enumMap.put("COGNITO_IDENTITY_POOL", COGNITO_IDENTITY_POOL);
        enumMap.put("CLIENT_ID", CLIENT_ID);
        enumMap.put("ACCOUNT_SETTINGS", ACCOUNT_SETTINGS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
