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
 * Choose the type of motion graphic asset that you are providing for your
 * overlay. You can choose either a .mov file or a series of .png files.
 */
public enum MotionImageInsertionMode {

    MOV("MOV"),
    PNG("PNG");

    private String value;

    private MotionImageInsertionMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MotionImageInsertionMode> enumMap;
    static {
        enumMap = new HashMap<String, MotionImageInsertionMode>();
        enumMap.put("MOV", MOV);
        enumMap.put("PNG", PNG);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MotionImageInsertionMode corresponding to the value
     */
    public static MotionImageInsertionMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
