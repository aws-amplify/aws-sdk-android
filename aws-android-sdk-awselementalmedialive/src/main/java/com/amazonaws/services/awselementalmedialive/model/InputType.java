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
 * Placeholder documentation for InputType
 */
public enum InputType {

    UDP_PUSH("UDP_PUSH"),
    RTP_PUSH("RTP_PUSH"),
    RTMP_PUSH("RTMP_PUSH"),
    RTMP_PULL("RTMP_PULL"),
    URL_PULL("URL_PULL"),
    MP4_FILE("MP4_FILE"),
    MEDIACONNECT("MEDIACONNECT");

    private String value;

    private InputType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InputType> enumMap;
    static {
        enumMap = new HashMap<String, InputType>();
        enumMap.put("UDP_PUSH", UDP_PUSH);
        enumMap.put("RTP_PUSH", RTP_PUSH);
        enumMap.put("RTMP_PUSH", RTMP_PUSH);
        enumMap.put("RTMP_PULL", RTMP_PULL);
        enumMap.put("URL_PULL", URL_PULL);
        enumMap.put("MP4_FILE", MP4_FILE);
        enumMap.put("MEDIACONNECT", MEDIACONNECT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InputType corresponding to the value
     */
    public static InputType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
