/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Contact Initiation Method
 */
public enum ContactInitiationMethod {

    INBOUND("INBOUND"),
    OUTBOUND("OUTBOUND"),
    TRANSFER("TRANSFER"),
    QUEUE_TRANSFER("QUEUE_TRANSFER"),
    CALLBACK("CALLBACK"),
    API("API");

    private String value;

    private ContactInitiationMethod(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ContactInitiationMethod> enumMap;
    static {
        enumMap = new HashMap<String, ContactInitiationMethod>();
        enumMap.put("INBOUND", INBOUND);
        enumMap.put("OUTBOUND", OUTBOUND);
        enumMap.put("TRANSFER", TRANSFER);
        enumMap.put("QUEUE_TRANSFER", QUEUE_TRANSFER);
        enumMap.put("CALLBACK", CALLBACK);
        enumMap.put("API", API);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ContactInitiationMethod corresponding to the value
     */
    public static ContactInitiationMethod fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
