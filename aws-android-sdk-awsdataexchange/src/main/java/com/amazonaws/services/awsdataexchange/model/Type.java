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

package com.amazonaws.services.awsdataexchange.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Type
 */
public enum Type {

    IMPORT_ASSETS_FROM_S3("IMPORT_ASSETS_FROM_S3"),
    IMPORT_ASSET_FROM_SIGNED_URL("IMPORT_ASSET_FROM_SIGNED_URL"),
    EXPORT_ASSETS_TO_S3("EXPORT_ASSETS_TO_S3"),
    EXPORT_ASSET_TO_SIGNED_URL("EXPORT_ASSET_TO_SIGNED_URL");

    private String value;

    private Type(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Type> enumMap;
    static {
        enumMap = new HashMap<String, Type>();
        enumMap.put("IMPORT_ASSETS_FROM_S3", IMPORT_ASSETS_FROM_S3);
        enumMap.put("IMPORT_ASSET_FROM_SIGNED_URL", IMPORT_ASSET_FROM_SIGNED_URL);
        enumMap.put("EXPORT_ASSETS_TO_S3", EXPORT_ASSETS_TO_S3);
        enumMap.put("EXPORT_ASSET_TO_SIGNED_URL", EXPORT_ASSET_TO_SIGNED_URL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Type corresponding to the value
     */
    public static Type fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
