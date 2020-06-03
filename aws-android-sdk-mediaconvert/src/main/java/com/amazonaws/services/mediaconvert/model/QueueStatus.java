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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue
 * won't begin. Jobs that are running when you pause a queue continue to run
 * until they finish or result in an error.
 */
public enum QueueStatus {

    ACTIVE("ACTIVE"),
    PAUSED("PAUSED");

    private String value;

    private QueueStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, QueueStatus> enumMap;
    static {
        enumMap = new HashMap<String, QueueStatus>();
        enumMap.put("ACTIVE", ACTIVE);
        enumMap.put("PAUSED", PAUSED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return QueueStatus corresponding to the value
     */
    public static QueueStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
