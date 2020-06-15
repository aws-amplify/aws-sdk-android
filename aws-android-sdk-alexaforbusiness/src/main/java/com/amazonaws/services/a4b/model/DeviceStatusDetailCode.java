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
 * Device Status Detail Code
 */
public enum DeviceStatusDetailCode {

    DEVICE_SOFTWARE_UPDATE_NEEDED("DEVICE_SOFTWARE_UPDATE_NEEDED"),
    DEVICE_WAS_OFFLINE("DEVICE_WAS_OFFLINE"),
    CREDENTIALS_ACCESS_FAILURE("CREDENTIALS_ACCESS_FAILURE"),
    TLS_VERSION_MISMATCH("TLS_VERSION_MISMATCH"),
    ASSOCIATION_REJECTION("ASSOCIATION_REJECTION"),
    AUTHENTICATION_FAILURE("AUTHENTICATION_FAILURE"),
    DHCP_FAILURE("DHCP_FAILURE"),
    INTERNET_UNAVAILABLE("INTERNET_UNAVAILABLE"),
    DNS_FAILURE("DNS_FAILURE"),
    UNKNOWN_FAILURE("UNKNOWN_FAILURE"),
    CERTIFICATE_ISSUING_LIMIT_EXCEEDED("CERTIFICATE_ISSUING_LIMIT_EXCEEDED"),
    INVALID_CERTIFICATE_AUTHORITY("INVALID_CERTIFICATE_AUTHORITY"),
    NETWORK_PROFILE_NOT_FOUND("NETWORK_PROFILE_NOT_FOUND"),
    INVALID_PASSWORD_STATE("INVALID_PASSWORD_STATE"),
    PASSWORD_NOT_FOUND("PASSWORD_NOT_FOUND"),
    PASSWORD_MANAGER_ACCESS_DENIED("PASSWORD_MANAGER_ACCESS_DENIED"),
    CERTIFICATE_AUTHORITY_ACCESS_DENIED("CERTIFICATE_AUTHORITY_ACCESS_DENIED");

    private String value;

    private DeviceStatusDetailCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeviceStatusDetailCode> enumMap;
    static {
        enumMap = new HashMap<String, DeviceStatusDetailCode>();
        enumMap.put("DEVICE_SOFTWARE_UPDATE_NEEDED", DEVICE_SOFTWARE_UPDATE_NEEDED);
        enumMap.put("DEVICE_WAS_OFFLINE", DEVICE_WAS_OFFLINE);
        enumMap.put("CREDENTIALS_ACCESS_FAILURE", CREDENTIALS_ACCESS_FAILURE);
        enumMap.put("TLS_VERSION_MISMATCH", TLS_VERSION_MISMATCH);
        enumMap.put("ASSOCIATION_REJECTION", ASSOCIATION_REJECTION);
        enumMap.put("AUTHENTICATION_FAILURE", AUTHENTICATION_FAILURE);
        enumMap.put("DHCP_FAILURE", DHCP_FAILURE);
        enumMap.put("INTERNET_UNAVAILABLE", INTERNET_UNAVAILABLE);
        enumMap.put("DNS_FAILURE", DNS_FAILURE);
        enumMap.put("UNKNOWN_FAILURE", UNKNOWN_FAILURE);
        enumMap.put("CERTIFICATE_ISSUING_LIMIT_EXCEEDED", CERTIFICATE_ISSUING_LIMIT_EXCEEDED);
        enumMap.put("INVALID_CERTIFICATE_AUTHORITY", INVALID_CERTIFICATE_AUTHORITY);
        enumMap.put("NETWORK_PROFILE_NOT_FOUND", NETWORK_PROFILE_NOT_FOUND);
        enumMap.put("INVALID_PASSWORD_STATE", INVALID_PASSWORD_STATE);
        enumMap.put("PASSWORD_NOT_FOUND", PASSWORD_NOT_FOUND);
        enumMap.put("PASSWORD_MANAGER_ACCESS_DENIED", PASSWORD_MANAGER_ACCESS_DENIED);
        enumMap.put("CERTIFICATE_AUTHORITY_ACCESS_DENIED", CERTIFICATE_AUTHORITY_ACCESS_DENIED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeviceStatusDetailCode corresponding to the value
     */
    public static DeviceStatusDetailCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
