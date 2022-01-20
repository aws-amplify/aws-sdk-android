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
 * Contact Flow Type
 */
public enum ContactFlowType {

    CONTACT_FLOW("CONTACT_FLOW"),
    CUSTOMER_QUEUE("CUSTOMER_QUEUE"),
    CUSTOMER_HOLD("CUSTOMER_HOLD"),
    CUSTOMER_WHISPER("CUSTOMER_WHISPER"),
    AGENT_HOLD("AGENT_HOLD"),
    AGENT_WHISPER("AGENT_WHISPER"),
    OUTBOUND_WHISPER("OUTBOUND_WHISPER"),
    AGENT_TRANSFER("AGENT_TRANSFER"),
    QUEUE_TRANSFER("QUEUE_TRANSFER");

    private String value;

    private ContactFlowType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ContactFlowType> enumMap;
    static {
        enumMap = new HashMap<String, ContactFlowType>();
        enumMap.put("CONTACT_FLOW", CONTACT_FLOW);
        enumMap.put("CUSTOMER_QUEUE", CUSTOMER_QUEUE);
        enumMap.put("CUSTOMER_HOLD", CUSTOMER_HOLD);
        enumMap.put("CUSTOMER_WHISPER", CUSTOMER_WHISPER);
        enumMap.put("AGENT_HOLD", AGENT_HOLD);
        enumMap.put("AGENT_WHISPER", AGENT_WHISPER);
        enumMap.put("OUTBOUND_WHISPER", OUTBOUND_WHISPER);
        enumMap.put("AGENT_TRANSFER", AGENT_TRANSFER);
        enumMap.put("QUEUE_TRANSFER", QUEUE_TRANSFER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ContactFlowType corresponding to the value
     */
    public static ContactFlowType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
