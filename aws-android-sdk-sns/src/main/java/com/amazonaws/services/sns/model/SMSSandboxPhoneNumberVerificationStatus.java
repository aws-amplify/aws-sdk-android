/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum listing out all supported destination phone number verification
 * statuses. The following enum values are supported. 1. PENDING : The
 * destination phone number is pending verification. 2. VERIFIED : The
 * destination phone number is verified.
 */
public enum SMSSandboxPhoneNumberVerificationStatus {

    Pending("Pending"),
    Verified("Verified");

    private String value;

    private SMSSandboxPhoneNumberVerificationStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SMSSandboxPhoneNumberVerificationStatus> enumMap;
    static {
        enumMap = new HashMap<String, SMSSandboxPhoneNumberVerificationStatus>();
        enumMap.put("Pending", Pending);
        enumMap.put("Verified", Verified);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SMSSandboxPhoneNumberVerificationStatus corresponding to the
     *         value
     */
    public static SMSSandboxPhoneNumberVerificationStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
