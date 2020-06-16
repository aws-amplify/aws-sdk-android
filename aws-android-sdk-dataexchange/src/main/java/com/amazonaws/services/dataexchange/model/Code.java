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

package com.amazonaws.services.dataexchange.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Code
 */
public enum Code {

    ACCESS_DENIED_EXCEPTION("ACCESS_DENIED_EXCEPTION"),
    INTERNAL_SERVER_EXCEPTION("INTERNAL_SERVER_EXCEPTION"),
    MALWARE_DETECTED("MALWARE_DETECTED"),
    RESOURCE_NOT_FOUND_EXCEPTION("RESOURCE_NOT_FOUND_EXCEPTION"),
    SERVICE_QUOTA_EXCEEDED_EXCEPTION("SERVICE_QUOTA_EXCEEDED_EXCEPTION"),
    VALIDATION_EXCEPTION("VALIDATION_EXCEPTION"),
    MALWARE_SCAN_ENCRYPTED_FILE("MALWARE_SCAN_ENCRYPTED_FILE");

    private String value;

    private Code(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Code> enumMap;
    static {
        enumMap = new HashMap<String, Code>();
        enumMap.put("ACCESS_DENIED_EXCEPTION", ACCESS_DENIED_EXCEPTION);
        enumMap.put("INTERNAL_SERVER_EXCEPTION", INTERNAL_SERVER_EXCEPTION);
        enumMap.put("MALWARE_DETECTED", MALWARE_DETECTED);
        enumMap.put("RESOURCE_NOT_FOUND_EXCEPTION", RESOURCE_NOT_FOUND_EXCEPTION);
        enumMap.put("SERVICE_QUOTA_EXCEEDED_EXCEPTION", SERVICE_QUOTA_EXCEEDED_EXCEPTION);
        enumMap.put("VALIDATION_EXCEPTION", VALIDATION_EXCEPTION);
        enumMap.put("MALWARE_SCAN_ENCRYPTED_FILE", MALWARE_SCAN_ENCRYPTED_FILE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Code corresponding to the value
     */
    public static Code fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
