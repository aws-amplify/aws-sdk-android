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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * A page type as defined in the standard ETSI EN 300 468, Table 94
 */
public enum TeletextPageType {

    PAGE_TYPE_INITIAL("PAGE_TYPE_INITIAL"),
    PAGE_TYPE_SUBTITLE("PAGE_TYPE_SUBTITLE"),
    PAGE_TYPE_ADDL_INFO("PAGE_TYPE_ADDL_INFO"),
    PAGE_TYPE_PROGRAM_SCHEDULE("PAGE_TYPE_PROGRAM_SCHEDULE"),
    PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE("PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE");

    private String value;

    private TeletextPageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TeletextPageType> enumMap;
    static {
        enumMap = new HashMap<String, TeletextPageType>();
        enumMap.put("PAGE_TYPE_INITIAL", PAGE_TYPE_INITIAL);
        enumMap.put("PAGE_TYPE_SUBTITLE", PAGE_TYPE_SUBTITLE);
        enumMap.put("PAGE_TYPE_ADDL_INFO", PAGE_TYPE_ADDL_INFO);
        enumMap.put("PAGE_TYPE_PROGRAM_SCHEDULE", PAGE_TYPE_PROGRAM_SCHEDULE);
        enumMap.put("PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE", PAGE_TYPE_HEARING_IMPAIRED_SUBTITLE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TeletextPageType corresponding to the value
     */
    public static TeletextPageType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
