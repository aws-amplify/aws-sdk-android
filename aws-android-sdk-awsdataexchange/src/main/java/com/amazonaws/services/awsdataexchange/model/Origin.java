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

package com.amazonaws.services.awsdataexchange.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * A property that defines the data set as OWNED by the account (for providers)
 * or ENTITLED to the account (for subscribers). When an owned data set is
 * published in a product, AWS Data Exchange creates a copy of the data set.
 * Subscribers can access that copy of the data set as an entitled data set.
 * </p>
 */
public enum Origin {

    OWNED("OWNED"),
    ENTITLED("ENTITLED");

    private String value;

    private Origin(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Origin> enumMap;
    static {
        enumMap = new HashMap<String, Origin>();
        enumMap.put("OWNED", OWNED);
        enumMap.put("ENTITLED", ENTITLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Origin corresponding to the value
     */
    public static Origin fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
