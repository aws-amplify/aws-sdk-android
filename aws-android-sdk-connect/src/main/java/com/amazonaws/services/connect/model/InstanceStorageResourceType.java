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
 * Instance Storage Resource Type
 */
public enum InstanceStorageResourceType {

    CHAT_TRANSCRIPTS("CHAT_TRANSCRIPTS"),
    CALL_RECORDINGS("CALL_RECORDINGS"),
    SCHEDULED_REPORTS("SCHEDULED_REPORTS"),
    MEDIA_STREAMS("MEDIA_STREAMS"),
    CONTACT_TRACE_RECORDS("CONTACT_TRACE_RECORDS"),
    AGENT_EVENTS("AGENT_EVENTS"),
    REAL_TIME_CONTACT_ANALYSIS_SEGMENTS("REAL_TIME_CONTACT_ANALYSIS_SEGMENTS");

    private String value;

    private InstanceStorageResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InstanceStorageResourceType> enumMap;
    static {
        enumMap = new HashMap<String, InstanceStorageResourceType>();
        enumMap.put("CHAT_TRANSCRIPTS", CHAT_TRANSCRIPTS);
        enumMap.put("CALL_RECORDINGS", CALL_RECORDINGS);
        enumMap.put("SCHEDULED_REPORTS", SCHEDULED_REPORTS);
        enumMap.put("MEDIA_STREAMS", MEDIA_STREAMS);
        enumMap.put("CONTACT_TRACE_RECORDS", CONTACT_TRACE_RECORDS);
        enumMap.put("AGENT_EVENTS", AGENT_EVENTS);
        enumMap.put("REAL_TIME_CONTACT_ANALYSIS_SEGMENTS", REAL_TIME_CONTACT_ANALYSIS_SEGMENTS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InstanceStorageResourceType corresponding to the value
     */
    public static InstanceStorageResourceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
