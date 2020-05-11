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
 * Salesforce Standard Object Name
 */
public enum SalesforceStandardObjectName {

    ACCOUNT("ACCOUNT"),
    CAMPAIGN("CAMPAIGN"),
    CASE("CASE"),
    CONTACT("CONTACT"),
    CONTRACT("CONTRACT"),
    DOCUMENT("DOCUMENT"),
    GROUP("GROUP"),
    IDEA("IDEA"),
    LEAD("LEAD"),
    OPPORTUNITY("OPPORTUNITY"),
    PARTNER("PARTNER"),
    PRICEBOOK("PRICEBOOK"),
    PRODUCT("PRODUCT"),
    PROFILE("PROFILE"),
    SOLUTION("SOLUTION"),
    TASK("TASK"),
    USER("USER");

    private String value;

    private SalesforceStandardObjectName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SalesforceStandardObjectName> enumMap;
    static {
        enumMap = new HashMap<String, SalesforceStandardObjectName>();
        enumMap.put("ACCOUNT", ACCOUNT);
        enumMap.put("CAMPAIGN", CAMPAIGN);
        enumMap.put("CASE", CASE);
        enumMap.put("CONTACT", CONTACT);
        enumMap.put("CONTRACT", CONTRACT);
        enumMap.put("DOCUMENT", DOCUMENT);
        enumMap.put("GROUP", GROUP);
        enumMap.put("IDEA", IDEA);
        enumMap.put("LEAD", LEAD);
        enumMap.put("OPPORTUNITY", OPPORTUNITY);
        enumMap.put("PARTNER", PARTNER);
        enumMap.put("PRICEBOOK", PRICEBOOK);
        enumMap.put("PRODUCT", PRODUCT);
        enumMap.put("PROFILE", PROFILE);
        enumMap.put("SOLUTION", SOLUTION);
        enumMap.put("TASK", TASK);
        enumMap.put("USER", USER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SalesforceStandardObjectName corresponding to the value
     */
    public static SalesforceStandardObjectName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
