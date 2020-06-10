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

package com.amazonaws.services.codeartifact.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Package Version Error Code
 */
public enum PackageVersionErrorCode {

    ALREADY_EXISTS("ALREADY_EXISTS"),
    MISMATCHED_REVISION("MISMATCHED_REVISION"),
    MISMATCHED_STATUS("MISMATCHED_STATUS"),
    NOT_ALLOWED("NOT_ALLOWED"),
    NOT_FOUND("NOT_FOUND"),
    SKIPPED("SKIPPED");

    private String value;

    private PackageVersionErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PackageVersionErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, PackageVersionErrorCode>();
        enumMap.put("ALREADY_EXISTS", ALREADY_EXISTS);
        enumMap.put("MISMATCHED_REVISION", MISMATCHED_REVISION);
        enumMap.put("MISMATCHED_STATUS", MISMATCHED_STATUS);
        enumMap.put("NOT_ALLOWED", NOT_ALLOWED);
        enumMap.put("NOT_FOUND", NOT_FOUND);
        enumMap.put("SKIPPED", SKIPPED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PackageVersionErrorCode corresponding to the value
     */
    public static PackageVersionErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
