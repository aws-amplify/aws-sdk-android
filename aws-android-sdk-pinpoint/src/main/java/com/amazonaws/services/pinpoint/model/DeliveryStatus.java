/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Delivery Status
 */
public enum DeliveryStatus {

    SUCCESSFUL("SUCCESSFUL"),
    THROTTLED("THROTTLED"),
    TEMPORARY_FAILURE("TEMPORARY_FAILURE"),
    PERMANENT_FAILURE("PERMANENT_FAILURE"),
    UNKNOWN_FAILURE("UNKNOWN_FAILURE"),
    OPT_OUT("OPT_OUT"),
    DUPLICATE("DUPLICATE");

    private String value;

    private DeliveryStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeliveryStatus> enumMap;
    static {
        enumMap = new HashMap<String, DeliveryStatus>();
        enumMap.put("SUCCESSFUL", SUCCESSFUL);
        enumMap.put("THROTTLED", THROTTLED);
        enumMap.put("TEMPORARY_FAILURE", TEMPORARY_FAILURE);
        enumMap.put("PERMANENT_FAILURE", PERMANENT_FAILURE);
        enumMap.put("UNKNOWN_FAILURE", UNKNOWN_FAILURE);
        enumMap.put("OPT_OUT", OPT_OUT);
        enumMap.put("DUPLICATE", DUPLICATE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeliveryStatus corresponding to the value
     */
    public static DeliveryStatus fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
