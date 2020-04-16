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
 * When enabled, file composition times will start at zero, composition times in
 * the 'ctts' (composition time to sample) box for B-frames will be negative,
 * and a 'cslg' (composition shift least greatest) box will be included per
 * 14496-1 amendment 1. This improves compatibility with Apple players and
 * tools.
 */
public enum MovCslgAtom {

    INCLUDE("INCLUDE"),
    EXCLUDE("EXCLUDE");

    private String value;

    private MovCslgAtom(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MovCslgAtom> enumMap;
    static {
        enumMap = new HashMap<String, MovCslgAtom>();
        enumMap.put("INCLUDE", INCLUDE);
        enumMap.put("EXCLUDE", EXCLUDE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MovCslgAtom corresponding to the value
     */
    public static MovCslgAtom fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
