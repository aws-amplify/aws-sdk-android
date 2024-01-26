/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Integration Type
 */
public enum IntegrationType {

    EVENT("EVENT"),
    VOICE_ID("VOICE_ID"),
    PINPOINT_APP("PINPOINT_APP"),
    WISDOM_ASSISTANT("WISDOM_ASSISTANT"),
    WISDOM_KNOWLEDGE_BASE("WISDOM_KNOWLEDGE_BASE"),
    WISDOM_QUICK_RESPONSES("WISDOM_QUICK_RESPONSES"),
    CASES_DOMAIN("CASES_DOMAIN"),
    APPLICATION("APPLICATION"),
    FILE_SCANNER("FILE_SCANNER");

    private String value;

    private IntegrationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, IntegrationType> enumMap;
    static {
        enumMap = new HashMap<String, IntegrationType>();
        enumMap.put("EVENT", EVENT);
        enumMap.put("VOICE_ID", VOICE_ID);
        enumMap.put("PINPOINT_APP", PINPOINT_APP);
        enumMap.put("WISDOM_ASSISTANT", WISDOM_ASSISTANT);
        enumMap.put("WISDOM_KNOWLEDGE_BASE", WISDOM_KNOWLEDGE_BASE);
        enumMap.put("WISDOM_QUICK_RESPONSES", WISDOM_QUICK_RESPONSES);
        enumMap.put("CASES_DOMAIN", CASES_DOMAIN);
        enumMap.put("APPLICATION", APPLICATION);
        enumMap.put("FILE_SCANNER", FILE_SCANNER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return IntegrationType corresponding to the value
     */
    public static IntegrationType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
