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

package com.amazonaws.services.organizations.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Handshake Resource Type
 */
public enum HandshakeResourceType {

    ACCOUNT("ACCOUNT"),
    ORGANIZATION("ORGANIZATION"),
    ORGANIZATION_FEATURE_SET("ORGANIZATION_FEATURE_SET"),
    EMAIL("EMAIL"),
    MASTER_EMAIL("MASTER_EMAIL"),
    MASTER_NAME("MASTER_NAME"),
    NOTES("NOTES"),
    PARENT_HANDSHAKE("PARENT_HANDSHAKE");

    private String value;

    private HandshakeResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HandshakeResourceType> enumMap;
    static {
        enumMap = new HashMap<String, HandshakeResourceType>();
        enumMap.put("ACCOUNT", ACCOUNT);
        enumMap.put("ORGANIZATION", ORGANIZATION);
        enumMap.put("ORGANIZATION_FEATURE_SET", ORGANIZATION_FEATURE_SET);
        enumMap.put("EMAIL", EMAIL);
        enumMap.put("MASTER_EMAIL", MASTER_EMAIL);
        enumMap.put("MASTER_NAME", MASTER_NAME);
        enumMap.put("NOTES", NOTES);
        enumMap.put("PARENT_HANDSHAKE", PARENT_HANDSHAKE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HandshakeResourceType corresponding to the value
     */
    public static HandshakeResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
