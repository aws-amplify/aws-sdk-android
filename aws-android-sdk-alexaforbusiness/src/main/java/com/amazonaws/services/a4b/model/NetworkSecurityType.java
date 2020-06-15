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

package com.amazonaws.services.a4b.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Network Security Type
 */
public enum NetworkSecurityType {

    OPEN("OPEN"),
    WEP("WEP"),
    WPA_PSK("WPA_PSK"),
    WPA2_PSK("WPA2_PSK"),
    WPA2_ENTERPRISE("WPA2_ENTERPRISE");

    private String value;

    private NetworkSecurityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, NetworkSecurityType> enumMap;
    static {
        enumMap = new HashMap<String, NetworkSecurityType>();
        enumMap.put("OPEN", OPEN);
        enumMap.put("WEP", WEP);
        enumMap.put("WPA_PSK", WPA_PSK);
        enumMap.put("WPA2_PSK", WPA2_PSK);
        enumMap.put("WPA2_ENTERPRISE", WPA2_ENTERPRISE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return NetworkSecurityType corresponding to the value
     */
    public static NetworkSecurityType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
