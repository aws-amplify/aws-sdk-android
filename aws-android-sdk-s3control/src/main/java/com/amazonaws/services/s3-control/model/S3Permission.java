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
package com.amazonaws.services.s3-control.model;

import java.util.HashMap;
import java.util.Map;

/**
 * S3Permission
 */
public enum S3Permission {

    FULL_CONTROL("FULL_CONTROL"),
    READ("READ"),
    WRITE("WRITE"),
    READ_ACP("READ_ACP"),
    WRITE_ACP("WRITE_ACP");

    private String value;

    private S3Permission(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, S3Permission> enumMap;
    static {
        enumMap = new HashMap<String, S3Permission>();
        enumMap.put("FULL_CONTROL", FULL_CONTROL);
        enumMap.put("READ", READ);
        enumMap.put("WRITE", WRITE);
        enumMap.put("READ_ACP", READ_ACP);
        enumMap.put("WRITE_ACP", WRITE_ACP);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return S3Permission corresponding to the value
     */
    public static S3Permission fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
