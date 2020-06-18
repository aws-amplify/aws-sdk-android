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

package com.amazonaws.services.ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Inventory Attribute Data Type
 */
public enum InventoryAttributeDataType {

    String("string"),
    Number("number");

    private String value;

    private InventoryAttributeDataType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InventoryAttributeDataType> enumMap;
    static {
        enumMap = new HashMap<String, InventoryAttributeDataType>();
        enumMap.put("string", String);
        enumMap.put("number", Number);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InventoryAttributeDataType corresponding to the value
     */
    public static InventoryAttributeDataType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
