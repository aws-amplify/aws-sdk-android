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

package com.amazonaws.services.amazonroute53domains.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Domain Availability
 */
public enum DomainAvailability {

    AVAILABLE("AVAILABLE"),
    AVAILABLE_RESERVED("AVAILABLE_RESERVED"),
    AVAILABLE_PREORDER("AVAILABLE_PREORDER"),
    UNAVAILABLE("UNAVAILABLE"),
    UNAVAILABLE_PREMIUM("UNAVAILABLE_PREMIUM"),
    UNAVAILABLE_RESTRICTED("UNAVAILABLE_RESTRICTED"),
    RESERVED("RESERVED"),
    DONT_KNOW("DONT_KNOW");

    private String value;

    private DomainAvailability(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DomainAvailability> enumMap;
    static {
        enumMap = new HashMap<String, DomainAvailability>();
        enumMap.put("AVAILABLE", AVAILABLE);
        enumMap.put("AVAILABLE_RESERVED", AVAILABLE_RESERVED);
        enumMap.put("AVAILABLE_PREORDER", AVAILABLE_PREORDER);
        enumMap.put("UNAVAILABLE", UNAVAILABLE);
        enumMap.put("UNAVAILABLE_PREMIUM", UNAVAILABLE_PREMIUM);
        enumMap.put("UNAVAILABLE_RESTRICTED", UNAVAILABLE_RESTRICTED);
        enumMap.put("RESERVED", RESERVED);
        enumMap.put("DONT_KNOW", DONT_KNOW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DomainAvailability corresponding to the value
     */
    public static DomainAvailability fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
