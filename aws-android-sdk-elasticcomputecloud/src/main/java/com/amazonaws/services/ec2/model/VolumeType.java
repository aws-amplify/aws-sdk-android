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

package com.amazonaws.services.ec2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Volume Type
 */
public enum VolumeType {

    Standard("standard"),
    Io1("io1"),
    Gp2("gp2"),
    Sc1("sc1"),
    St1("st1");

    private String value;

    private VolumeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VolumeType> enumMap;
    static {
        enumMap = new HashMap<String, VolumeType>();
        enumMap.put("standard", Standard);
        enumMap.put("io1", Io1);
        enumMap.put("gp2", Gp2);
        enumMap.put("sc1", Sc1);
        enumMap.put("st1", St1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VolumeType corresponding to the value
     */
    public static VolumeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
