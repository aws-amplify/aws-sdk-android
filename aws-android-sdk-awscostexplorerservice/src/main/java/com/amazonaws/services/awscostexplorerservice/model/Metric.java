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
 * Metric
 */
public enum Metric {

    BLENDED_COST("BLENDED_COST"),
    UNBLENDED_COST("UNBLENDED_COST"),
    AMORTIZED_COST("AMORTIZED_COST"),
    NET_UNBLENDED_COST("NET_UNBLENDED_COST"),
    NET_AMORTIZED_COST("NET_AMORTIZED_COST"),
    USAGE_QUANTITY("USAGE_QUANTITY"),
    NORMALIZED_USAGE_AMOUNT("NORMALIZED_USAGE_AMOUNT");

    private String value;

    private Metric(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Metric> enumMap;
    static {
        enumMap = new HashMap<String, Metric>();
        enumMap.put("BLENDED_COST", BLENDED_COST);
        enumMap.put("UNBLENDED_COST", UNBLENDED_COST);
        enumMap.put("AMORTIZED_COST", AMORTIZED_COST);
        enumMap.put("NET_UNBLENDED_COST", NET_UNBLENDED_COST);
        enumMap.put("NET_AMORTIZED_COST", NET_AMORTIZED_COST);
        enumMap.put("USAGE_QUANTITY", USAGE_QUANTITY);
        enumMap.put("NORMALIZED_USAGE_AMOUNT", NORMALIZED_USAGE_AMOUNT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Metric corresponding to the value
     */
    public static Metric fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
