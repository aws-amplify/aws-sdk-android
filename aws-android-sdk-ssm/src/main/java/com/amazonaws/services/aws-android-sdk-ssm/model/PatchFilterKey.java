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
 * Patch Filter Key
 */
public enum PatchFilterKey {

    PATCH_SET("PATCH_SET"),
    PRODUCT("PRODUCT"),
    PRODUCT_FAMILY("PRODUCT_FAMILY"),
    CLASSIFICATION("CLASSIFICATION"),
    MSRC_SEVERITY("MSRC_SEVERITY"),
    PATCH_ID("PATCH_ID"),
    SECTION("SECTION"),
    PRIORITY("PRIORITY"),
    SEVERITY("SEVERITY");

    private String value;

    private PatchFilterKey(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PatchFilterKey> enumMap;
    static {
        enumMap = new HashMap<String, PatchFilterKey>();
        enumMap.put("PATCH_SET", PATCH_SET);
        enumMap.put("PRODUCT", PRODUCT);
        enumMap.put("PRODUCT_FAMILY", PRODUCT_FAMILY);
        enumMap.put("CLASSIFICATION", CLASSIFICATION);
        enumMap.put("MSRC_SEVERITY", MSRC_SEVERITY);
        enumMap.put("PATCH_ID", PATCH_ID);
        enumMap.put("SECTION", SECTION);
        enumMap.put("PRIORITY", PRIORITY);
        enumMap.put("SEVERITY", SEVERITY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return PatchFilterKey corresponding to the value
     */
    public static PatchFilterKey fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
