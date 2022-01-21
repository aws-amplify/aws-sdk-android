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
 * Instance Attribute Type
 */
public enum InstanceAttributeType {

    INBOUND_CALLS("INBOUND_CALLS"),
    OUTBOUND_CALLS("OUTBOUND_CALLS"),
    CONTACTFLOW_LOGS("CONTACTFLOW_LOGS"),
    CONTACT_LENS("CONTACT_LENS"),
    AUTO_RESOLVE_BEST_VOICES("AUTO_RESOLVE_BEST_VOICES"),
    USE_CUSTOM_TTS_VOICES("USE_CUSTOM_TTS_VOICES"),
    EARLY_MEDIA("EARLY_MEDIA");

    private String value;

    private InstanceAttributeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceAttributeType> enumMap;
    static {
        enumMap = new HashMap<String, InstanceAttributeType>();
        enumMap.put("INBOUND_CALLS", INBOUND_CALLS);
        enumMap.put("OUTBOUND_CALLS", OUTBOUND_CALLS);
        enumMap.put("CONTACTFLOW_LOGS", CONTACTFLOW_LOGS);
        enumMap.put("CONTACT_LENS", CONTACT_LENS);
        enumMap.put("AUTO_RESOLVE_BEST_VOICES", AUTO_RESOLVE_BEST_VOICES);
        enumMap.put("USE_CUSTOM_TTS_VOICES", USE_CUSTOM_TTS_VOICES);
        enumMap.put("EARLY_MEDIA", EARLY_MEDIA);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceAttributeType corresponding to the value
     */
    public static InstanceAttributeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
