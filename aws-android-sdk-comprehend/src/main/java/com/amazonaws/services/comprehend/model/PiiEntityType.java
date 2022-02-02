/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Pii Entity Type
 */
public enum PiiEntityType {

    BANK_ACCOUNT_NUMBER("BANK_ACCOUNT_NUMBER"),
    BANK_ROUTING("BANK_ROUTING"),
    CREDIT_DEBIT_NUMBER("CREDIT_DEBIT_NUMBER"),
    CREDIT_DEBIT_CVV("CREDIT_DEBIT_CVV"),
    CREDIT_DEBIT_EXPIRY("CREDIT_DEBIT_EXPIRY"),
    PIN("PIN"),
    EMAIL("EMAIL"),
    ADDRESS("ADDRESS"),
    NAME("NAME"),
    PHONE("PHONE"),
    SSN("SSN"),
    DATE_TIME("DATE_TIME"),
    PASSPORT_NUMBER("PASSPORT_NUMBER"),
    DRIVER_ID("DRIVER_ID"),
    URL("URL"),
    AGE("AGE"),
    USERNAME("USERNAME"),
    PASSWORD("PASSWORD"),
    AWS_ACCESS_KEY("AWS_ACCESS_KEY"),
    AWS_SECRET_KEY("AWS_SECRET_KEY"),
    IP_ADDRESS("IP_ADDRESS"),
    MAC_ADDRESS("MAC_ADDRESS"),
    ALL("ALL");

    private String value;

    private PiiEntityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PiiEntityType> enumMap;
    static {
        enumMap = new HashMap<String, PiiEntityType>();
        enumMap.put("BANK_ACCOUNT_NUMBER", BANK_ACCOUNT_NUMBER);
        enumMap.put("BANK_ROUTING", BANK_ROUTING);
        enumMap.put("CREDIT_DEBIT_NUMBER", CREDIT_DEBIT_NUMBER);
        enumMap.put("CREDIT_DEBIT_CVV", CREDIT_DEBIT_CVV);
        enumMap.put("CREDIT_DEBIT_EXPIRY", CREDIT_DEBIT_EXPIRY);
        enumMap.put("PIN", PIN);
        enumMap.put("EMAIL", EMAIL);
        enumMap.put("ADDRESS", ADDRESS);
        enumMap.put("NAME", NAME);
        enumMap.put("PHONE", PHONE);
        enumMap.put("SSN", SSN);
        enumMap.put("DATE_TIME", DATE_TIME);
        enumMap.put("PASSPORT_NUMBER", PASSPORT_NUMBER);
        enumMap.put("DRIVER_ID", DRIVER_ID);
        enumMap.put("URL", URL);
        enumMap.put("AGE", AGE);
        enumMap.put("USERNAME", USERNAME);
        enumMap.put("PASSWORD", PASSWORD);
        enumMap.put("AWS_ACCESS_KEY", AWS_ACCESS_KEY);
        enumMap.put("AWS_SECRET_KEY", AWS_SECRET_KEY);
        enumMap.put("IP_ADDRESS", IP_ADDRESS);
        enumMap.put("MAC_ADDRESS", MAC_ADDRESS);
        enumMap.put("ALL", ALL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PiiEntityType corresponding to the value
     */
    public static PiiEntityType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
