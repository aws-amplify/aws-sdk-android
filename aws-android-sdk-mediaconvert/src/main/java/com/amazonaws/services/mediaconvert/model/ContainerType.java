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
 * Container for this output. Some containers require a container settings
 * object. If not specified, the default object will be created.
 */
public enum ContainerType {

    F4V("F4V"),
    ISMV("ISMV"),
    M2TS("M2TS"),
    M3U8("M3U8"),
    CMFC("CMFC"),
    MOV("MOV"),
    MP4("MP4"),
    MPD("MPD"),
    MXF("MXF"),
    WEBM("WEBM"),
    RAW("RAW");

    private String value;

    private ContainerType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ContainerType> enumMap;
    static {
        enumMap = new HashMap<String, ContainerType>();
        enumMap.put("F4V", F4V);
        enumMap.put("ISMV", ISMV);
        enumMap.put("M2TS", M2TS);
        enumMap.put("M3U8", M3U8);
        enumMap.put("CMFC", CMFC);
        enumMap.put("MOV", MOV);
        enumMap.put("MP4", MP4);
        enumMap.put("MPD", MPD);
        enumMap.put("MXF", MXF);
        enumMap.put("WEBM", WEBM);
        enumMap.put("RAW", RAW);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ContainerType corresponding to the value
     */
    public static ContainerType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
