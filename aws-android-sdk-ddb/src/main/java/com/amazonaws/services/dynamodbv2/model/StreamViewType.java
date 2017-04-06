/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Stream View Type
 */
public enum StreamViewType {

    NEW_IMAGE("NEW_IMAGE"),
    OLD_IMAGE("OLD_IMAGE"),
    NEW_AND_OLD_IMAGES("NEW_AND_OLD_IMAGES"),
    KEYS_ONLY("KEYS_ONLY");

    private String value;

    private StreamViewType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, StreamViewType> enumMap;
    static {
        enumMap = new HashMap<String, StreamViewType>();
        enumMap.put("NEW_IMAGE", NEW_IMAGE);
        enumMap.put("OLD_IMAGE", OLD_IMAGE);
        enumMap.put("NEW_AND_OLD_IMAGES", NEW_AND_OLD_IMAGES);
        enumMap.put("KEYS_ONLY", KEYS_ONLY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return StreamViewType corresponding to the value
     */
    public static StreamViewType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
