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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specify whether your DRM encryption key is static or from a key provider that
 * follows the SPEKE standard. For more information about SPEKE, see
 * https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
 */
public enum HlsKeyProviderType {

    SPEKE("SPEKE"),
    STATIC_KEY("STATIC_KEY");

    private String value;

    private HlsKeyProviderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsKeyProviderType> enumMap;
    static {
        enumMap = new HashMap<String, HlsKeyProviderType>();
        enumMap.put("SPEKE", SPEKE);
        enumMap.put("STATIC_KEY", STATIC_KEY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsKeyProviderType corresponding to the value
     */
    public static HlsKeyProviderType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
