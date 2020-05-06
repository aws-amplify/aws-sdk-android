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

package com.amazonaws.services.comprehendmedical.model;

import java.util.HashMap;
import java.util.Map;

/**
 * ICD10CMAttribute Type
 */
public enum ICD10CMAttributeType {

    ACUITY("ACUITY"),
    DIRECTION("DIRECTION"),
    SYSTEM_ORGAN_SITE("SYSTEM_ORGAN_SITE"),
    QUALITY("QUALITY"),
    QUANTITY("QUANTITY");

    private String value;

    private ICD10CMAttributeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ICD10CMAttributeType> enumMap;
    static {
        enumMap = new HashMap<String, ICD10CMAttributeType>();
        enumMap.put("ACUITY", ACUITY);
        enumMap.put("DIRECTION", DIRECTION);
        enumMap.put("SYSTEM_ORGAN_SITE", SYSTEM_ORGAN_SITE);
        enumMap.put("QUALITY", QUALITY);
        enumMap.put("QUANTITY", QUANTITY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ICD10CMAttributeType corresponding to the value
     */
    public static ICD10CMAttributeType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
