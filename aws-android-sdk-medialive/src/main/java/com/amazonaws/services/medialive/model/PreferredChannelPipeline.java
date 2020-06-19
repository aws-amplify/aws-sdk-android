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

package com.amazonaws.services.medialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Indicates which pipeline is preferred by the multiplex for program ingest. If
 * set to \"PIPELINE_0\" or \"PIPELINE_1\" and an unhealthy ingest causes the
 * multiplex to switch to the non-preferred pipeline, it will switch back once
 * that ingest is healthy again. If set to \"CURRENTLY_ACTIVE\", it will not
 * switch back to the other pipeline based on it recovering to a healthy state,
 * it will only switch if the active pipeline becomes unhealthy.
 */
public enum PreferredChannelPipeline {

    CURRENTLY_ACTIVE("CURRENTLY_ACTIVE"),
    PIPELINE_0("PIPELINE_0"),
    PIPELINE_1("PIPELINE_1");

    private String value;

    private PreferredChannelPipeline(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PreferredChannelPipeline> enumMap;
    static {
        enumMap = new HashMap<String, PreferredChannelPipeline>();
        enumMap.put("CURRENTLY_ACTIVE", CURRENTLY_ACTIVE);
        enumMap.put("PIPELINE_0", PIPELINE_0);
        enumMap.put("PIPELINE_1", PIPELINE_1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PreferredChannelPipeline corresponding to the value
     */
    public static PreferredChannelPipeline fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
