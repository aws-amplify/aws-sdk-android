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
 * Lookback Period In Days
 */
public enum LookbackPeriodInDays {

    SEVEN_DAYS("SEVEN_DAYS"),
    THIRTY_DAYS("THIRTY_DAYS"),
    SIXTY_DAYS("SIXTY_DAYS");

    private String value;

    private LookbackPeriodInDays(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LookbackPeriodInDays> enumMap;
    static {
        enumMap = new HashMap<String, LookbackPeriodInDays>();
        enumMap.put("SEVEN_DAYS", SEVEN_DAYS);
        enumMap.put("THIRTY_DAYS", THIRTY_DAYS);
        enumMap.put("SIXTY_DAYS", SIXTY_DAYS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LookbackPeriodInDays corresponding to the value
     */
    public static LookbackPeriodInDays fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
