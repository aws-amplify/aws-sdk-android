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

package com.amazonaws.services.ec2imagebuilder.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Image Status
 */
public enum ImageStatus {

    PENDING("PENDING"),
    CREATING("CREATING"),
    BUILDING("BUILDING"),
    TESTING("TESTING"),
    DISTRIBUTING("DISTRIBUTING"),
    INTEGRATING("INTEGRATING"),
    AVAILABLE("AVAILABLE"),
    CANCELLED("CANCELLED"),
    FAILED("FAILED"),
    DEPRECATED("DEPRECATED"),
    DELETED("DELETED");

    private String value;

    private ImageStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ImageStatus> enumMap;
    static {
        enumMap = new HashMap<String, ImageStatus>();
        enumMap.put("PENDING", PENDING);
        enumMap.put("CREATING", CREATING);
        enumMap.put("BUILDING", BUILDING);
        enumMap.put("TESTING", TESTING);
        enumMap.put("DISTRIBUTING", DISTRIBUTING);
        enumMap.put("INTEGRATING", INTEGRATING);
        enumMap.put("AVAILABLE", AVAILABLE);
        enumMap.put("CANCELLED", CANCELLED);
        enumMap.put("FAILED", FAILED);
        enumMap.put("DEPRECATED", DEPRECATED);
        enumMap.put("DELETED", DELETED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ImageStatus corresponding to the value
     */
    public static ImageStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
