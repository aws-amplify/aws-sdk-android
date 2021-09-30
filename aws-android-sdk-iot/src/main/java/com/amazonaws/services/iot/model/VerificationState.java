/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Verification State
 */
public enum VerificationState {

    FALSE_POSITIVE("FALSE_POSITIVE"),
    BENIGN_POSITIVE("BENIGN_POSITIVE"),
    TRUE_POSITIVE("TRUE_POSITIVE");

    private String value;

    private VerificationState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VerificationState> enumMap;
    static {
        enumMap = new HashMap<String, VerificationState>();
        enumMap.put("FALSE_POSITIVE", FALSE_POSITIVE);
        enumMap.put("BENIGN_POSITIVE", BENIGN_POSITIVE);
        enumMap.put("TRUE_POSITIVE", TRUE_POSITIVE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VerificationState corresponding to the value
     */
    public static VerificationState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
