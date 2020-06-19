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
 * Audio Type
 */
public enum AudioType {

    CLEAN_EFFECTS("CLEAN_EFFECTS"),
    HEARING_IMPAIRED("HEARING_IMPAIRED"),
    UNDEFINED("UNDEFINED"),
    VISUAL_IMPAIRED_COMMENTARY("VISUAL_IMPAIRED_COMMENTARY");

    private String value;

    private AudioType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AudioType> enumMap;
    static {
        enumMap = new HashMap<String, AudioType>();
        enumMap.put("CLEAN_EFFECTS", CLEAN_EFFECTS);
        enumMap.put("HEARING_IMPAIRED", HEARING_IMPAIRED);
        enumMap.put("UNDEFINED", UNDEFINED);
        enumMap.put("VISUAL_IMPAIRED_COMMENTARY", VISUAL_IMPAIRED_COMMENTARY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AudioType corresponding to the value
     */
    public static AudioType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
