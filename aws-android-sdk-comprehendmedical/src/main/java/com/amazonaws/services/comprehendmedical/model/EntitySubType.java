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
 * Entity Sub Type
 */
public enum EntitySubType {

    NAME("NAME"),
    DOSAGE("DOSAGE"),
    ROUTE_OR_MODE("ROUTE_OR_MODE"),
    FORM("FORM"),
    FREQUENCY("FREQUENCY"),
    DURATION("DURATION"),
    GENERIC_NAME("GENERIC_NAME"),
    BRAND_NAME("BRAND_NAME"),
    STRENGTH("STRENGTH"),
    RATE("RATE"),
    ACUITY("ACUITY"),
    TEST_NAME("TEST_NAME"),
    TEST_VALUE("TEST_VALUE"),
    TEST_UNITS("TEST_UNITS"),
    PROCEDURE_NAME("PROCEDURE_NAME"),
    TREATMENT_NAME("TREATMENT_NAME"),
    DATE("DATE"),
    AGE("AGE"),
    CONTACT_POINT("CONTACT_POINT"),
    EMAIL("EMAIL"),
    IDENTIFIER("IDENTIFIER"),
    URL("URL"),
    ADDRESS("ADDRESS"),
    PROFESSION("PROFESSION"),
    SYSTEM_ORGAN_SITE("SYSTEM_ORGAN_SITE"),
    DIRECTION("DIRECTION"),
    QUALITY("QUALITY"),
    QUANTITY("QUANTITY"),
    TIME_EXPRESSION("TIME_EXPRESSION"),
    TIME_TO_MEDICATION_NAME("TIME_TO_MEDICATION_NAME"),
    TIME_TO_DX_NAME("TIME_TO_DX_NAME"),
    TIME_TO_TEST_NAME("TIME_TO_TEST_NAME"),
    TIME_TO_PROCEDURE_NAME("TIME_TO_PROCEDURE_NAME"),
    TIME_TO_TREATMENT_NAME("TIME_TO_TREATMENT_NAME");

    private String value;

    private EntitySubType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EntitySubType> enumMap;
    static {
        enumMap = new HashMap<String, EntitySubType>();
        enumMap.put("NAME", NAME);
        enumMap.put("DOSAGE", DOSAGE);
        enumMap.put("ROUTE_OR_MODE", ROUTE_OR_MODE);
        enumMap.put("FORM", FORM);
        enumMap.put("FREQUENCY", FREQUENCY);
        enumMap.put("DURATION", DURATION);
        enumMap.put("GENERIC_NAME", GENERIC_NAME);
        enumMap.put("BRAND_NAME", BRAND_NAME);
        enumMap.put("STRENGTH", STRENGTH);
        enumMap.put("RATE", RATE);
        enumMap.put("ACUITY", ACUITY);
        enumMap.put("TEST_NAME", TEST_NAME);
        enumMap.put("TEST_VALUE", TEST_VALUE);
        enumMap.put("TEST_UNITS", TEST_UNITS);
        enumMap.put("PROCEDURE_NAME", PROCEDURE_NAME);
        enumMap.put("TREATMENT_NAME", TREATMENT_NAME);
        enumMap.put("DATE", DATE);
        enumMap.put("AGE", AGE);
        enumMap.put("CONTACT_POINT", CONTACT_POINT);
        enumMap.put("EMAIL", EMAIL);
        enumMap.put("IDENTIFIER", IDENTIFIER);
        enumMap.put("URL", URL);
        enumMap.put("ADDRESS", ADDRESS);
        enumMap.put("PROFESSION", PROFESSION);
        enumMap.put("SYSTEM_ORGAN_SITE", SYSTEM_ORGAN_SITE);
        enumMap.put("DIRECTION", DIRECTION);
        enumMap.put("QUALITY", QUALITY);
        enumMap.put("QUANTITY", QUANTITY);
        enumMap.put("TIME_EXPRESSION", TIME_EXPRESSION);
        enumMap.put("TIME_TO_MEDICATION_NAME", TIME_TO_MEDICATION_NAME);
        enumMap.put("TIME_TO_DX_NAME", TIME_TO_DX_NAME);
        enumMap.put("TIME_TO_TEST_NAME", TIME_TO_TEST_NAME);
        enumMap.put("TIME_TO_PROCEDURE_NAME", TIME_TO_PROCEDURE_NAME);
        enumMap.put("TIME_TO_TREATMENT_NAME", TIME_TO_TREATMENT_NAME);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EntitySubType corresponding to the value
     */
    public static EntitySubType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
