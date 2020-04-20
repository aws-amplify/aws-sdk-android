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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Represents passthrough behavior for an integration response. Supported only
 * for WebSocket APIs.
 * </p>
 */
public enum PassthroughBehavior {

    WHEN_NO_MATCH("WHEN_NO_MATCH"),
    NEVER("NEVER"),
    WHEN_NO_TEMPLATES("WHEN_NO_TEMPLATES");

    private String value;

    private PassthroughBehavior(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, PassthroughBehavior> enumMap;
    static {
        enumMap = new HashMap<String, PassthroughBehavior>();
        enumMap.put("WHEN_NO_MATCH", WHEN_NO_MATCH);
        enumMap.put("NEVER", NEVER);
        enumMap.put("WHEN_NO_TEMPLATES", WHEN_NO_TEMPLATES);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return PassthroughBehavior corresponding to the value
     */
    public static PassthroughBehavior fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
