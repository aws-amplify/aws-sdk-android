/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudwatch.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Standard Unit
 */
public enum StandardUnit {

    Seconds("Seconds"),
    Microseconds("Microseconds"),
    Milliseconds("Milliseconds"),
    Bytes("Bytes"),
    Kilobytes("Kilobytes"),
    Megabytes("Megabytes"),
    Gigabytes("Gigabytes"),
    Terabytes("Terabytes"),
    Bits("Bits"),
    Kilobits("Kilobits"),
    Megabits("Megabits"),
    Gigabits("Gigabits"),
    Terabits("Terabits"),
    Percent("Percent"),
    Count("Count"),
    BytesSecond("Bytes/Second"),
    KilobytesSecond("Kilobytes/Second"),
    MegabytesSecond("Megabytes/Second"),
    GigabytesSecond("Gigabytes/Second"),
    TerabytesSecond("Terabytes/Second"),
    BitsSecond("Bits/Second"),
    KilobitsSecond("Kilobits/Second"),
    MegabitsSecond("Megabits/Second"),
    GigabitsSecond("Gigabits/Second"),
    TerabitsSecond("Terabits/Second"),
    CountSecond("Count/Second"),
    None("None");

    private String value;

    private StandardUnit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StandardUnit> enumMap;
    static {
        enumMap = new HashMap<String, StandardUnit>();
        enumMap.put("Seconds", Seconds);
        enumMap.put("Microseconds", Microseconds);
        enumMap.put("Milliseconds", Milliseconds);
        enumMap.put("Bytes", Bytes);
        enumMap.put("Kilobytes", Kilobytes);
        enumMap.put("Megabytes", Megabytes);
        enumMap.put("Gigabytes", Gigabytes);
        enumMap.put("Terabytes", Terabytes);
        enumMap.put("Bits", Bits);
        enumMap.put("Kilobits", Kilobits);
        enumMap.put("Megabits", Megabits);
        enumMap.put("Gigabits", Gigabits);
        enumMap.put("Terabits", Terabits);
        enumMap.put("Percent", Percent);
        enumMap.put("Count", Count);
        enumMap.put("Bytes/Second", BytesSecond);
        enumMap.put("Kilobytes/Second", KilobytesSecond);
        enumMap.put("Megabytes/Second", MegabytesSecond);
        enumMap.put("Gigabytes/Second", GigabytesSecond);
        enumMap.put("Terabytes/Second", TerabytesSecond);
        enumMap.put("Bits/Second", BitsSecond);
        enumMap.put("Kilobits/Second", KilobitsSecond);
        enumMap.put("Megabits/Second", MegabitsSecond);
        enumMap.put("Gigabits/Second", GigabitsSecond);
        enumMap.put("Terabits/Second", TerabitsSecond);
        enumMap.put("Count/Second", CountSecond);
        enumMap.put("None", None);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StandardUnit corresponding to the value
     */
    public static StandardUnit fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
