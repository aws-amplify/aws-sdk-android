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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Delivery Medium Type
 */
public enum DeliveryMediumType {

    SMS("SMS"),
    EMAIL("EMAIL");

    private String value;

    private DeliveryMediumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeliveryMediumType> enumMap;
    static {
        enumMap = new HashMap<String, DeliveryMediumType>();
        enumMap.put("SMS", SMS);
        enumMap.put("EMAIL", EMAIL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeliveryMediumType corresponding to the value
     */
    public static DeliveryMediumType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
