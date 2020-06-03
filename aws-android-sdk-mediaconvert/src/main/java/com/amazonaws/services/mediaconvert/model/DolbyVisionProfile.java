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
 * In the current MediaConvert implementation, the Dolby Vision profile is
 * always 5 (PROFILE_5). Therefore, all of your inputs must contain Dolby Vision
 * frame interleaved data.
 */
public enum DolbyVisionProfile {

    PROFILE_5("PROFILE_5");

    private String value;

    private DolbyVisionProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DolbyVisionProfile> enumMap;
    static {
        enumMap = new HashMap<String, DolbyVisionProfile>();
        enumMap.put("PROFILE_5", PROFILE_5);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DolbyVisionProfile corresponding to the value
     */
    public static DolbyVisionProfile fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
