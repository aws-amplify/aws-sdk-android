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

package com.amazonaws.services.kendra.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Document Attribute Value Type
 */
public enum DocumentAttributeValueType {

    STRING_VALUE("STRING_VALUE"),
    STRING_LIST_VALUE("STRING_LIST_VALUE"),
    LONG_VALUE("LONG_VALUE"),
    DATE_VALUE("DATE_VALUE");

    private String value;

    private DocumentAttributeValueType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentAttributeValueType> enumMap;
    static {
        enumMap = new HashMap<String, DocumentAttributeValueType>();
        enumMap.put("STRING_VALUE", STRING_VALUE);
        enumMap.put("STRING_LIST_VALUE", STRING_LIST_VALUE);
        enumMap.put("LONG_VALUE", LONG_VALUE);
        enumMap.put("DATE_VALUE", DATE_VALUE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DocumentAttributeValueType corresponding to the value
     */
    public static DocumentAttributeValueType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
