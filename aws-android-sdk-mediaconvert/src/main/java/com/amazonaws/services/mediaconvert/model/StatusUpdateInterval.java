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
 * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon
 * CloudWatch Events. Set the interval, in seconds, between status updates.
 * MediaConvert sends an update at this interval from the time the service
 * begins processing your job to the time it completes the transcode or
 * encounters an error.
 */
public enum StatusUpdateInterval {

    SECONDS_10("SECONDS_10"),
    SECONDS_12("SECONDS_12"),
    SECONDS_15("SECONDS_15"),
    SECONDS_20("SECONDS_20"),
    SECONDS_30("SECONDS_30"),
    SECONDS_60("SECONDS_60"),
    SECONDS_120("SECONDS_120"),
    SECONDS_180("SECONDS_180"),
    SECONDS_240("SECONDS_240"),
    SECONDS_300("SECONDS_300"),
    SECONDS_360("SECONDS_360"),
    SECONDS_420("SECONDS_420"),
    SECONDS_480("SECONDS_480"),
    SECONDS_540("SECONDS_540"),
    SECONDS_600("SECONDS_600");

    private String value;

    private StatusUpdateInterval(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StatusUpdateInterval> enumMap;
    static {
        enumMap = new HashMap<String, StatusUpdateInterval>();
        enumMap.put("SECONDS_10", SECONDS_10);
        enumMap.put("SECONDS_12", SECONDS_12);
        enumMap.put("SECONDS_15", SECONDS_15);
        enumMap.put("SECONDS_20", SECONDS_20);
        enumMap.put("SECONDS_30", SECONDS_30);
        enumMap.put("SECONDS_60", SECONDS_60);
        enumMap.put("SECONDS_120", SECONDS_120);
        enumMap.put("SECONDS_180", SECONDS_180);
        enumMap.put("SECONDS_240", SECONDS_240);
        enumMap.put("SECONDS_300", SECONDS_300);
        enumMap.put("SECONDS_360", SECONDS_360);
        enumMap.put("SECONDS_420", SECONDS_420);
        enumMap.put("SECONDS_480", SECONDS_480);
        enumMap.put("SECONDS_540", SECONDS_540);
        enumMap.put("SECONDS_600", SECONDS_600);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StatusUpdateInterval corresponding to the value
     */
    public static StatusUpdateInterval fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
