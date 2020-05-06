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

package com.amazonaws.services.comprehendmedical.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Relationship Type
 */
public enum RelationshipType {

    EVERY("EVERY"),
    WITH_DOSAGE("WITH_DOSAGE"),
    ADMINISTERED_VIA("ADMINISTERED_VIA"),
    FOR("FOR"),
    NEGATIVE("NEGATIVE"),
    OVERLAP("OVERLAP"),
    DOSAGE("DOSAGE"),
    ROUTE_OR_MODE("ROUTE_OR_MODE"),
    FORM("FORM"),
    FREQUENCY("FREQUENCY"),
    DURATION("DURATION"),
    STRENGTH("STRENGTH"),
    RATE("RATE"),
    ACUITY("ACUITY"),
    TEST_VALUE("TEST_VALUE"),
    TEST_UNITS("TEST_UNITS"),
    DIRECTION("DIRECTION");

    private String value;

    private RelationshipType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, RelationshipType> enumMap;
    static {
        enumMap = new HashMap<String, RelationshipType>();
        enumMap.put("EVERY", EVERY);
        enumMap.put("WITH_DOSAGE", WITH_DOSAGE);
        enumMap.put("ADMINISTERED_VIA", ADMINISTERED_VIA);
        enumMap.put("FOR", FOR);
        enumMap.put("NEGATIVE", NEGATIVE);
        enumMap.put("OVERLAP", OVERLAP);
        enumMap.put("DOSAGE", DOSAGE);
        enumMap.put("ROUTE_OR_MODE", ROUTE_OR_MODE);
        enumMap.put("FORM", FORM);
        enumMap.put("FREQUENCY", FREQUENCY);
        enumMap.put("DURATION", DURATION);
        enumMap.put("STRENGTH", STRENGTH);
        enumMap.put("RATE", RATE);
        enumMap.put("ACUITY", ACUITY);
        enumMap.put("TEST_VALUE", TEST_VALUE);
        enumMap.put("TEST_UNITS", TEST_UNITS);
        enumMap.put("DIRECTION", DIRECTION);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return RelationshipType corresponding to the value
     */
    public static RelationshipType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
