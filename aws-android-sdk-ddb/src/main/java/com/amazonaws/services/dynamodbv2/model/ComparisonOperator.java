/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Comparison Operator
 */
public enum ComparisonOperator {

    EQ("EQ"),
    NE("NE"),
    IN("IN"),
    LE("LE"),
    LT("LT"),
    GE("GE"),
    GT("GT"),
    BETWEEN("BETWEEN"),
    NOT_NULL("NOT_NULL"),
    NULL("NULL"),
    CONTAINS("CONTAINS"),
    NOT_CONTAINS("NOT_CONTAINS"),
    BEGINS_WITH("BEGINS_WITH");

    private String value;

    private ComparisonOperator(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ComparisonOperator> enumMap;
    static {
        enumMap = new HashMap<String, ComparisonOperator>();
        enumMap.put("EQ", EQ);
        enumMap.put("NE", NE);
        enumMap.put("IN", IN);
        enumMap.put("LE", LE);
        enumMap.put("LT", LT);
        enumMap.put("GE", GE);
        enumMap.put("GT", GT);
        enumMap.put("BETWEEN", BETWEEN);
        enumMap.put("NOT_NULL", NOT_NULL);
        enumMap.put("NULL", NULL);
        enumMap.put("CONTAINS", CONTAINS);
        enumMap.put("NOT_CONTAINS", NOT_CONTAINS);
        enumMap.put("BEGINS_WITH", BEGINS_WITH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ComparisonOperator corresponding to the value
     */
    public static ComparisonOperator fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
