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

package com.amazonaws.services.transfer.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Describes the condition of a file transfer protocol-enabled server with
 * respect to its ability to perform file operations. There are six possible
 * states: <code>OFFLINE</code>, <code>ONLINE</code>, <code>STARTING</code>,
 * <code>STOPPING</code>, <code>START_FAILED</code>, and
 * <code>STOP_FAILED</code>.
 * </p>
 * <p>
 * <code>OFFLINE</code> indicates that the server exists, but that it is not
 * available for file operations. <code>ONLINE</code> indicates that the server
 * is available to perform file operations. <code>STARTING</code> indicates that
 * the server's was instantiated, but the server is not yet available to perform
 * file operations. Under normal conditions, it can take a couple of minutes for
 * the server to be completely operational. Both <code>START_FAILED</code> and
 * <code>STOP_FAILED</code> are error conditions.
 * </p>
 */
public enum State {

    OFFLINE("OFFLINE"),
    ONLINE("ONLINE"),
    STARTING("STARTING"),
    STOPPING("STOPPING"),
    START_FAILED("START_FAILED"),
    STOP_FAILED("STOP_FAILED");

    private String value;

    private State(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, State> enumMap;
    static {
        enumMap = new HashMap<String, State>();
        enumMap.put("OFFLINE", OFFLINE);
        enumMap.put("ONLINE", ONLINE);
        enumMap.put("STARTING", STARTING);
        enumMap.put("STOPPING", STOPPING);
        enumMap.put("START_FAILED", START_FAILED);
        enumMap.put("STOP_FAILED", STOP_FAILED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return State corresponding to the value
     */
    public static State fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
