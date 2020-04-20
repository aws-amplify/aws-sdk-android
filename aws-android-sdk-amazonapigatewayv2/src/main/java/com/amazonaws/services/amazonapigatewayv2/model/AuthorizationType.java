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
 * The authorization type. For WebSocket APIs, valid values are NONE for open
 * access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda
 * authorizer. For HTTP APIs, valid values are NONE for open access, or JWT for
 * using JSON Web Tokens.
 * </p>
 */
public enum AuthorizationType {

    NONE("NONE"),
    AWS_IAM("AWS_IAM"),
    CUSTOM("CUSTOM"),
    JWT("JWT");

    private String value;

    private AuthorizationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AuthorizationType> enumMap;
    static {
        enumMap = new HashMap<String, AuthorizationType>();
        enumMap.put("NONE", NONE);
        enumMap.put("AWS_IAM", AWS_IAM);
        enumMap.put("CUSTOM", CUSTOM);
        enumMap.put("JWT", JWT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AuthorizationType corresponding to the value
     */
    public static AuthorizationType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
