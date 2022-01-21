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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The current metric names.
 * </p>
 */
public enum CurrentMetricName {

    AGENTS_ONLINE("AGENTS_ONLINE"),
    AGENTS_AVAILABLE("AGENTS_AVAILABLE"),
    AGENTS_ON_CALL("AGENTS_ON_CALL"),
    AGENTS_NON_PRODUCTIVE("AGENTS_NON_PRODUCTIVE"),
    AGENTS_AFTER_CONTACT_WORK("AGENTS_AFTER_CONTACT_WORK"),
    AGENTS_ERROR("AGENTS_ERROR"),
    AGENTS_STAFFED("AGENTS_STAFFED"),
    CONTACTS_IN_QUEUE("CONTACTS_IN_QUEUE"),
    OLDEST_CONTACT_AGE("OLDEST_CONTACT_AGE"),
    CONTACTS_SCHEDULED("CONTACTS_SCHEDULED"),
    AGENTS_ON_CONTACT("AGENTS_ON_CONTACT"),
    SLOTS_ACTIVE("SLOTS_ACTIVE"),
    SLOTS_AVAILABLE("SLOTS_AVAILABLE");

    private String value;

    private CurrentMetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, CurrentMetricName> enumMap;
    static {
        enumMap = new HashMap<String, CurrentMetricName>();
        enumMap.put("AGENTS_ONLINE", AGENTS_ONLINE);
        enumMap.put("AGENTS_AVAILABLE", AGENTS_AVAILABLE);
        enumMap.put("AGENTS_ON_CALL", AGENTS_ON_CALL);
        enumMap.put("AGENTS_NON_PRODUCTIVE", AGENTS_NON_PRODUCTIVE);
        enumMap.put("AGENTS_AFTER_CONTACT_WORK", AGENTS_AFTER_CONTACT_WORK);
        enumMap.put("AGENTS_ERROR", AGENTS_ERROR);
        enumMap.put("AGENTS_STAFFED", AGENTS_STAFFED);
        enumMap.put("CONTACTS_IN_QUEUE", CONTACTS_IN_QUEUE);
        enumMap.put("OLDEST_CONTACT_AGE", OLDEST_CONTACT_AGE);
        enumMap.put("CONTACTS_SCHEDULED", CONTACTS_SCHEDULED);
        enumMap.put("AGENTS_ON_CONTACT", AGENTS_ON_CONTACT);
        enumMap.put("SLOTS_ACTIVE", SLOTS_ACTIVE);
        enumMap.put("SLOTS_AVAILABLE", SLOTS_AVAILABLE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return CurrentMetricName corresponding to the value
     */
    public static CurrentMetricName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
