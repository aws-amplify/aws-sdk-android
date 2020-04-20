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

package com.amazonaws.services.awscostexplorerservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Match Option
 */
public enum MatchOption {

    EQUALS("EQUALS"),
    STARTS_WITH("STARTS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    CONTAINS("CONTAINS"),
    CASE_SENSITIVE("CASE_SENSITIVE"),
    CASE_INSENSITIVE("CASE_INSENSITIVE");

    private String value;

    private MatchOption(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MatchOption> enumMap;
    static {
        enumMap = new HashMap<String, MatchOption>();
        enumMap.put("EQUALS", EQUALS);
        enumMap.put("STARTS_WITH", STARTS_WITH);
        enumMap.put("ENDS_WITH", ENDS_WITH);
        enumMap.put("CONTAINS", CONTAINS);
        enumMap.put("CASE_SENSITIVE", CASE_SENSITIVE);
        enumMap.put("CASE_INSENSITIVE", CASE_INSENSITIVE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MatchOption corresponding to the value
     */
    public static MatchOption fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
