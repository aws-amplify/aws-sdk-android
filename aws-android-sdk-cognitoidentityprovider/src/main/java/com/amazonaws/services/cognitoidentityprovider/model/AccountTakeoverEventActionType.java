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
 * Account Takeover Event Action Type
 */
public enum AccountTakeoverEventActionType {

    BLOCK("BLOCK"),
    MFA_IF_CONFIGURED("MFA_IF_CONFIGURED"),
    MFA_REQUIRED("MFA_REQUIRED"),
    NO_ACTION("NO_ACTION");

    private String value;

    private AccountTakeoverEventActionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AccountTakeoverEventActionType> enumMap;
    static {
        enumMap = new HashMap<String, AccountTakeoverEventActionType>();
        enumMap.put("BLOCK", BLOCK);
        enumMap.put("MFA_IF_CONFIGURED", MFA_IF_CONFIGURED);
        enumMap.put("MFA_REQUIRED", MFA_REQUIRED);
        enumMap.put("NO_ACTION", NO_ACTION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AccountTakeoverEventActionType corresponding to the value
     */
    public static AccountTakeoverEventActionType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
