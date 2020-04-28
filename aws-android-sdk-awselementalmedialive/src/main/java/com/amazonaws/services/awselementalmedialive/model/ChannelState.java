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

package com.amazonaws.services.awselementalmedialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Placeholder documentation for ChannelState
 */
public enum ChannelState {

    CREATING("CREATING"),
    CREATE_FAILED("CREATE_FAILED"),
    IDLE("IDLE"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    RECOVERING("RECOVERING"),
    STOPPING("STOPPING"),
    DELETING("DELETING"),
    DELETED("DELETED"),
    UPDATING("UPDATING"),
    UPDATE_FAILED("UPDATE_FAILED");

    private String value;

    private ChannelState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ChannelState> enumMap;
    static {
        enumMap = new HashMap<String, ChannelState>();
        enumMap.put("CREATING", CREATING);
        enumMap.put("CREATE_FAILED", CREATE_FAILED);
        enumMap.put("IDLE", IDLE);
        enumMap.put("STARTING", STARTING);
        enumMap.put("RUNNING", RUNNING);
        enumMap.put("RECOVERING", RECOVERING);
        enumMap.put("STOPPING", STOPPING);
        enumMap.put("DELETING", DELETING);
        enumMap.put("DELETED", DELETED);
        enumMap.put("UPDATING", UPDATING);
        enumMap.put("UPDATE_FAILED", UPDATE_FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ChannelState corresponding to the value
     */
    public static ChannelState fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
