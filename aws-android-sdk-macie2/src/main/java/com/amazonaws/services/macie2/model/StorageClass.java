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

package com.amazonaws.services.macie2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The storage class of the S3 bucket or object. Valid values are:
 * </p>
 */
public enum StorageClass {

    STANDARD("STANDARD"),
    REDUCED_REDUNDANCY("REDUCED_REDUNDANCY"),
    STANDARD_IA("STANDARD_IA"),
    INTELLIGENT_TIERING("INTELLIGENT_TIERING"),
    DEEP_ARCHIVE("DEEP_ARCHIVE"),
    ONEZONE_IA("ONEZONE_IA"),
    GLACIER("GLACIER");

    private String value;

    private StorageClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StorageClass> enumMap;
    static {
        enumMap = new HashMap<String, StorageClass>();
        enumMap.put("STANDARD", STANDARD);
        enumMap.put("REDUCED_REDUNDANCY", REDUCED_REDUNDANCY);
        enumMap.put("STANDARD_IA", STANDARD_IA);
        enumMap.put("INTELLIGENT_TIERING", INTELLIGENT_TIERING);
        enumMap.put("DEEP_ARCHIVE", DEEP_ARCHIVE);
        enumMap.put("ONEZONE_IA", ONEZONE_IA);
        enumMap.put("GLACIER", GLACIER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StorageClass corresponding to the value
     */
    public static StorageClass fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
