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
 * Create Account Failure Reason
 */
public enum CreateAccountFailureReason {

    ACCOUNT_LIMIT_EXCEEDED("ACCOUNT_LIMIT_EXCEEDED"),
    EMAIL_ALREADY_EXISTS("EMAIL_ALREADY_EXISTS"),
    INVALID_ADDRESS("INVALID_ADDRESS"),
    INVALID_EMAIL("INVALID_EMAIL"),
    CONCURRENT_ACCOUNT_MODIFICATION("CONCURRENT_ACCOUNT_MODIFICATION"),
    INTERNAL_FAILURE("INTERNAL_FAILURE"),
    GOVCLOUD_ACCOUNT_ALREADY_EXISTS("GOVCLOUD_ACCOUNT_ALREADY_EXISTS");

    private String value;

    private CreateAccountFailureReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CreateAccountFailureReason> enumMap;
    static {
        enumMap = new HashMap<String, CreateAccountFailureReason>();
        enumMap.put("ACCOUNT_LIMIT_EXCEEDED", ACCOUNT_LIMIT_EXCEEDED);
        enumMap.put("EMAIL_ALREADY_EXISTS", EMAIL_ALREADY_EXISTS);
        enumMap.put("INVALID_ADDRESS", INVALID_ADDRESS);
        enumMap.put("INVALID_EMAIL", INVALID_EMAIL);
        enumMap.put("CONCURRENT_ACCOUNT_MODIFICATION", CONCURRENT_ACCOUNT_MODIFICATION);
        enumMap.put("INTERNAL_FAILURE", INTERNAL_FAILURE);
        enumMap.put("GOVCLOUD_ACCOUNT_ALREADY_EXISTS", GOVCLOUD_ACCOUNT_ALREADY_EXISTS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CreateAccountFailureReason corresponding to the value
     */
    public static CreateAccountFailureReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
