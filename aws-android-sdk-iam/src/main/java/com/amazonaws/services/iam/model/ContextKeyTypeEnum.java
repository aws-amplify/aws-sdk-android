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

package com.amazonaws.services.iam.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Context Key Type Enum
 */
public enum ContextKeyTypeEnum {

    String("string"),
    StringList("stringList"),
    Numeric("numeric"),
    NumericList("numericList"),
    Boolean("boolean"),
    BooleanList("booleanList"),
    Ip("ip"),
    IpList("ipList"),
    Binary("binary"),
    BinaryList("binaryList"),
    Date("date"),
    DateList("dateList");

    private String value;

    private ContextKeyTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ContextKeyTypeEnum> enumMap;
    static {
        enumMap = new HashMap<String, ContextKeyTypeEnum>();
        enumMap.put("string", String);
        enumMap.put("stringList", StringList);
        enumMap.put("numeric", Numeric);
        enumMap.put("numericList", NumericList);
        enumMap.put("boolean", Boolean);
        enumMap.put("booleanList", BooleanList);
        enumMap.put("ip", Ip);
        enumMap.put("ipList", IpList);
        enumMap.put("binary", Binary);
        enumMap.put("binaryList", BinaryList);
        enumMap.put("date", Date);
        enumMap.put("dateList", DateList);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ContextKeyTypeEnum corresponding to the value
     */
    public static ContextKeyTypeEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
