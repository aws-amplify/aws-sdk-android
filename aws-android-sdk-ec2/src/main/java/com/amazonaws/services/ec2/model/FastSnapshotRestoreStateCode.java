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
 * Fast Snapshot Restore State Code
 */
public enum FastSnapshotRestoreStateCode {

    Enabling("enabling"),
    Optimizing("optimizing"),
    Enabled("enabled"),
    Disabling("disabling"),
    Disabled("disabled");

    private String value;

    private FastSnapshotRestoreStateCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, FastSnapshotRestoreStateCode> enumMap;
    static {
        enumMap = new HashMap<String, FastSnapshotRestoreStateCode>();
        enumMap.put("enabling", Enabling);
        enumMap.put("optimizing", Optimizing);
        enumMap.put("enabled", Enabled);
        enumMap.put("disabling", Disabling);
        enumMap.put("disabled", Disabled);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return FastSnapshotRestoreStateCode corresponding to the value
     */
    public static FastSnapshotRestoreStateCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
