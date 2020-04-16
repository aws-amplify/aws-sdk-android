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

package com.amazonaws.services.awssecurityhub.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Threat Intel Indicator Type
 */
public enum ThreatIntelIndicatorType {

    DOMAIN("DOMAIN"),
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    HASH_MD5("HASH_MD5"),
    HASH_SHA1("HASH_SHA1"),
    HASH_SHA256("HASH_SHA256"),
    HASH_SHA512("HASH_SHA512"),
    IPV4_ADDRESS("IPV4_ADDRESS"),
    IPV6_ADDRESS("IPV6_ADDRESS"),
    MUTEX("MUTEX"),
    PROCESS("PROCESS"),
    URL("URL");

    private String value;

    private ThreatIntelIndicatorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ThreatIntelIndicatorType> enumMap;
    static {
        enumMap = new HashMap<String, ThreatIntelIndicatorType>();
        enumMap.put("DOMAIN", DOMAIN);
        enumMap.put("EMAIL_ADDRESS", EMAIL_ADDRESS);
        enumMap.put("HASH_MD5", HASH_MD5);
        enumMap.put("HASH_SHA1", HASH_SHA1);
        enumMap.put("HASH_SHA256", HASH_SHA256);
        enumMap.put("HASH_SHA512", HASH_SHA512);
        enumMap.put("IPV4_ADDRESS", IPV4_ADDRESS);
        enumMap.put("IPV6_ADDRESS", IPV6_ADDRESS);
        enumMap.put("MUTEX", MUTEX);
        enumMap.put("PROCESS", PROCESS);
        enumMap.put("URL", URL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ThreatIntelIndicatorType corresponding to the value
     */
    public static ThreatIntelIndicatorType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
