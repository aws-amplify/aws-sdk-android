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
 * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert AFD
 * signaling (AfdSignaling) to specify whether the service includes AFD values
 * in the output video data and what those values are. * Choose None to remove
 * all AFD values from this output. * Choose Fixed to ignore input AFD values
 * and instead encode the value specified in the job. * Choose Auto to calculate
 * output AFD values based on the input AFD scaler data.
 */
public enum AfdSignaling {

    NONE("NONE"),
    AUTO("AUTO"),
    FIXED("FIXED");

    private String value;

    private AfdSignaling(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AfdSignaling> enumMap;
    static {
        enumMap = new HashMap<String, AfdSignaling>();
        enumMap.put("NONE", NONE);
        enumMap.put("AUTO", AUTO);
        enumMap.put("FIXED", FIXED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AfdSignaling corresponding to the value
     */
    public static AfdSignaling fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
