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

package com.amazonaws.services.snowball.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Shipping Option
 */
public enum ShippingOption {

    SECOND_DAY("SECOND_DAY"),
    NEXT_DAY("NEXT_DAY"),
    EXPRESS("EXPRESS"),
    STANDARD("STANDARD");

    private String value;

    private ShippingOption(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ShippingOption> enumMap;
    static {
        enumMap = new HashMap<String, ShippingOption>();
        enumMap.put("SECOND_DAY", SECOND_DAY);
        enumMap.put("NEXT_DAY", NEXT_DAY);
        enumMap.put("EXPRESS", EXPRESS);
        enumMap.put("STANDARD", STANDARD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ShippingOption corresponding to the value
     */
    public static ShippingOption fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
