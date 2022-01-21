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
 * The historical metric names.
 * </p>
 */
public enum HistoricalMetricName {

    CONTACTS_QUEUED("CONTACTS_QUEUED"),
    CONTACTS_HANDLED("CONTACTS_HANDLED"),
    CONTACTS_ABANDONED("CONTACTS_ABANDONED"),
    CONTACTS_CONSULTED("CONTACTS_CONSULTED"),
    CONTACTS_AGENT_HUNG_UP_FIRST("CONTACTS_AGENT_HUNG_UP_FIRST"),
    CONTACTS_HANDLED_INCOMING("CONTACTS_HANDLED_INCOMING"),
    CONTACTS_HANDLED_OUTBOUND("CONTACTS_HANDLED_OUTBOUND"),
    CONTACTS_HOLD_ABANDONS("CONTACTS_HOLD_ABANDONS"),
    CONTACTS_TRANSFERRED_IN("CONTACTS_TRANSFERRED_IN"),
    CONTACTS_TRANSFERRED_OUT("CONTACTS_TRANSFERRED_OUT"),
    CONTACTS_TRANSFERRED_IN_FROM_QUEUE("CONTACTS_TRANSFERRED_IN_FROM_QUEUE"),
    CONTACTS_TRANSFERRED_OUT_FROM_QUEUE("CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"),
    CONTACTS_MISSED("CONTACTS_MISSED"),
    CALLBACK_CONTACTS_HANDLED("CALLBACK_CONTACTS_HANDLED"),
    API_CONTACTS_HANDLED("API_CONTACTS_HANDLED"),
    OCCUPANCY("OCCUPANCY"),
    HANDLE_TIME("HANDLE_TIME"),
    AFTER_CONTACT_WORK_TIME("AFTER_CONTACT_WORK_TIME"),
    QUEUED_TIME("QUEUED_TIME"),
    ABANDON_TIME("ABANDON_TIME"),
    QUEUE_ANSWER_TIME("QUEUE_ANSWER_TIME"),
    HOLD_TIME("HOLD_TIME"),
    INTERACTION_TIME("INTERACTION_TIME"),
    INTERACTION_AND_HOLD_TIME("INTERACTION_AND_HOLD_TIME"),
    SERVICE_LEVEL("SERVICE_LEVEL");

    private String value;

    private HistoricalMetricName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HistoricalMetricName> enumMap;
    static {
        enumMap = new HashMap<String, HistoricalMetricName>();
        enumMap.put("CONTACTS_QUEUED", CONTACTS_QUEUED);
        enumMap.put("CONTACTS_HANDLED", CONTACTS_HANDLED);
        enumMap.put("CONTACTS_ABANDONED", CONTACTS_ABANDONED);
        enumMap.put("CONTACTS_CONSULTED", CONTACTS_CONSULTED);
        enumMap.put("CONTACTS_AGENT_HUNG_UP_FIRST", CONTACTS_AGENT_HUNG_UP_FIRST);
        enumMap.put("CONTACTS_HANDLED_INCOMING", CONTACTS_HANDLED_INCOMING);
        enumMap.put("CONTACTS_HANDLED_OUTBOUND", CONTACTS_HANDLED_OUTBOUND);
        enumMap.put("CONTACTS_HOLD_ABANDONS", CONTACTS_HOLD_ABANDONS);
        enumMap.put("CONTACTS_TRANSFERRED_IN", CONTACTS_TRANSFERRED_IN);
        enumMap.put("CONTACTS_TRANSFERRED_OUT", CONTACTS_TRANSFERRED_OUT);
        enumMap.put("CONTACTS_TRANSFERRED_IN_FROM_QUEUE", CONTACTS_TRANSFERRED_IN_FROM_QUEUE);
        enumMap.put("CONTACTS_TRANSFERRED_OUT_FROM_QUEUE", CONTACTS_TRANSFERRED_OUT_FROM_QUEUE);
        enumMap.put("CONTACTS_MISSED", CONTACTS_MISSED);
        enumMap.put("CALLBACK_CONTACTS_HANDLED", CALLBACK_CONTACTS_HANDLED);
        enumMap.put("API_CONTACTS_HANDLED", API_CONTACTS_HANDLED);
        enumMap.put("OCCUPANCY", OCCUPANCY);
        enumMap.put("HANDLE_TIME", HANDLE_TIME);
        enumMap.put("AFTER_CONTACT_WORK_TIME", AFTER_CONTACT_WORK_TIME);
        enumMap.put("QUEUED_TIME", QUEUED_TIME);
        enumMap.put("ABANDON_TIME", ABANDON_TIME);
        enumMap.put("QUEUE_ANSWER_TIME", QUEUE_ANSWER_TIME);
        enumMap.put("HOLD_TIME", HOLD_TIME);
        enumMap.put("INTERACTION_TIME", INTERACTION_TIME);
        enumMap.put("INTERACTION_AND_HOLD_TIME", INTERACTION_AND_HOLD_TIME);
        enumMap.put("SERVICE_LEVEL", SERVICE_LEVEL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HistoricalMetricName corresponding to the value
     */
    public static HistoricalMetricName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
