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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Compromised Credentials Event Action Type
 */
public enum CompromisedCredentialsEventActionType {

    BLOCK("BLOCK"),
    NO_ACTION("NO_ACTION");

    private String value;

    private CompromisedCredentialsEventActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CompromisedCredentialsEventActionType> enumMap;
    static {
        enumMap = new HashMap<String, CompromisedCredentialsEventActionType>();
        enumMap.put("BLOCK", BLOCK);
        enumMap.put("NO_ACTION", NO_ACTION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CompromisedCredentialsEventActionType corresponding to the value
     */
    public static CompromisedCredentialsEventActionType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
