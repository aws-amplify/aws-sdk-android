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
 * Type of Audio codec.
 */
public enum AudioCodec {

    AAC("AAC"),
    MP2("MP2"),
    MP3("MP3"),
    WAV("WAV"),
    AIFF("AIFF"),
    AC3("AC3"),
    EAC3("EAC3"),
    EAC3_ATMOS("EAC3_ATMOS"),
    PASSTHROUGH("PASSTHROUGH");

    private String value;

    private AudioCodec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AudioCodec> enumMap;
    static {
        enumMap = new HashMap<String, AudioCodec>();
        enumMap.put("AAC", AAC);
        enumMap.put("MP2", MP2);
        enumMap.put("MP3", MP3);
        enumMap.put("WAV", WAV);
        enumMap.put("AIFF", AIFF);
        enumMap.put("AC3", AC3);
        enumMap.put("EAC3", EAC3);
        enumMap.put("EAC3_ATMOS", EAC3_ATMOS);
        enumMap.put("PASSTHROUGH", PASSTHROUGH);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AudioCodec corresponding to the value
     */
    public static AudioCodec fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
