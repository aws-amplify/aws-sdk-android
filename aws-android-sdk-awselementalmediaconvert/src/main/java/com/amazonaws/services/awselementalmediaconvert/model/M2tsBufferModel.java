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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Controls what buffer model to use for accurate interleaving. If set to
 * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to lower
 * latency, but low-memory devices may not be able to play back the stream
 * without interruptions.
 */
public enum M2tsBufferModel {

    MULTIPLEX("MULTIPLEX"),
    NONE("NONE");

    private String value;

    private M2tsBufferModel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M2tsBufferModel> enumMap;
    static {
        enumMap = new HashMap<String, M2tsBufferModel>();
        enumMap.put("MULTIPLEX", MULTIPLEX);
        enumMap.put("NONE", NONE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M2tsBufferModel corresponding to the value
     */
    public static M2tsBufferModel fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
