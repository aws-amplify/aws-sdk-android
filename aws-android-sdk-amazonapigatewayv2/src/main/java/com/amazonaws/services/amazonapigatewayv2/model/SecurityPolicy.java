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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The Transport Layer Security (TLS) version of the security policy for this
 * domain name. The valid values are TLS_1_0 and TLS_1_2.
 * </p>
 */
public enum SecurityPolicy {

    TLS_1_0("TLS_1_0"),
    TLS_1_2("TLS_1_2");

    private String value;

    private SecurityPolicy(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SecurityPolicy> enumMap;
    static {
        enumMap = new HashMap<String, SecurityPolicy>();
        enumMap.put("TLS_1_0", TLS_1_0);
        enumMap.put("TLS_1_2", TLS_1_2);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SecurityPolicy corresponding to the value
     */
    public static SecurityPolicy fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
