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
 * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted
 * for every Packetized Elementary Stream (PES) header. This parameter is
 * effective only when the PCR PID is the same as the video or audio elementary
 * stream.
 */
public enum M3u8PcrControl {

    PCR_EVERY_PES_PACKET("PCR_EVERY_PES_PACKET"),
    CONFIGURED_PCR_PERIOD("CONFIGURED_PCR_PERIOD");

    private String value;

    private M3u8PcrControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M3u8PcrControl> enumMap;
    static {
        enumMap = new HashMap<String, M3u8PcrControl>();
        enumMap.put("PCR_EVERY_PES_PACKET", PCR_EVERY_PES_PACKET);
        enumMap.put("CONFIGURED_PCR_PERIOD", CONFIGURED_PCR_PERIOD);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M3u8PcrControl corresponding to the value
     */
    public static M3u8PcrControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
