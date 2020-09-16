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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Patch Compliance Data State
 */
public enum PatchComplianceDataState {

    INSTALLED("INSTALLED"),
    INSTALLED_OTHER("INSTALLED_OTHER"),
    INSTALLED_PENDING_REBOOT("INSTALLED_PENDING_REBOOT"),
    INSTALLED_REJECTED("INSTALLED_REJECTED"),
    MISSING("MISSING"),
    NOT_APPLICABLE("NOT_APPLICABLE"),
    FAILED("FAILED");

    private String value;

    private PatchComplianceDataState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PatchComplianceDataState> enumMap;
    static {
        enumMap = new HashMap<String, PatchComplianceDataState>();
        enumMap.put("INSTALLED", INSTALLED);
        enumMap.put("INSTALLED_OTHER", INSTALLED_OTHER);
        enumMap.put("INSTALLED_PENDING_REBOOT", INSTALLED_PENDING_REBOOT);
        enumMap.put("INSTALLED_REJECTED", INSTALLED_REJECTED);
        enumMap.put("MISSING", MISSING);
        enumMap.put("NOT_APPLICABLE", NOT_APPLICABLE);
        enumMap.put("FAILED", FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return PatchComplianceDataState corresponding to the value
     */
    public static PatchComplianceDataState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
