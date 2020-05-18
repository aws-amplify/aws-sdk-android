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

package com.amazonaws.services.macie2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The property to use in a condition that determines which objects are analyzed
 * by a classification job. Valid values are:
 * </p>
 */
public enum ScopeFilterKey {

    BUCKET_CREATION_DATE("BUCKET_CREATION_DATE"),
    OBJECT_EXTENSION("OBJECT_EXTENSION"),
    OBJECT_LAST_MODIFIED_DATE("OBJECT_LAST_MODIFIED_DATE"),
    OBJECT_SIZE("OBJECT_SIZE"),
    TAG("TAG");

    private String value;

    private ScopeFilterKey(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ScopeFilterKey> enumMap;
    static {
        enumMap = new HashMap<String, ScopeFilterKey>();
        enumMap.put("BUCKET_CREATION_DATE", BUCKET_CREATION_DATE);
        enumMap.put("OBJECT_EXTENSION", OBJECT_EXTENSION);
        enumMap.put("OBJECT_LAST_MODIFIED_DATE", OBJECT_LAST_MODIFIED_DATE);
        enumMap.put("OBJECT_SIZE", OBJECT_SIZE);
        enumMap.put("TAG", TAG);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ScopeFilterKey corresponding to the value
     */
    public static ScopeFilterKey fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
