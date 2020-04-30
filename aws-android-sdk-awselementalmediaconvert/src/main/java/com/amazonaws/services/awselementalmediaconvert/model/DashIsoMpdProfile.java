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
 * Specify whether your DASH profile is on-demand or main. When you choose Main
 * profile (MAIN_PROFILE), the service signals
 * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When you
 * choose On-demand (ON_DEMAND_PROFILE), the service signals
 * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
 * On-demand, you must also set the output group setting Segment control
 * (SegmentControl) to Single file (SINGLE_FILE).
 */
public enum DashIsoMpdProfile {

    MAIN_PROFILE("MAIN_PROFILE"),
    ON_DEMAND_PROFILE("ON_DEMAND_PROFILE");

    private String value;

    private DashIsoMpdProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DashIsoMpdProfile> enumMap;
    static {
        enumMap = new HashMap<String, DashIsoMpdProfile>();
        enumMap.put("MAIN_PROFILE", MAIN_PROFILE);
        enumMap.put("ON_DEMAND_PROFILE", ON_DEMAND_PROFILE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DashIsoMpdProfile corresponding to the value
     */
    public static DashIsoMpdProfile fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
