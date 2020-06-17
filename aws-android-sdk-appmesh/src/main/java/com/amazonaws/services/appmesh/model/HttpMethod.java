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

package com.amazonaws.services.appmesh.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Http Method
 */
public enum HttpMethod {

    CONNECT("CONNECT"),
    DELETE("DELETE"),
    GET("GET"),
    HEAD("HEAD"),
    OPTIONS("OPTIONS"),
    PATCH("PATCH"),
    POST("POST"),
    PUT("PUT"),
    TRACE("TRACE");

    private String value;

    private HttpMethod(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HttpMethod> enumMap;
    static {
        enumMap = new HashMap<String, HttpMethod>();
        enumMap.put("CONNECT", CONNECT);
        enumMap.put("DELETE", DELETE);
        enumMap.put("GET", GET);
        enumMap.put("HEAD", HEAD);
        enumMap.put("OPTIONS", OPTIONS);
        enumMap.put("PATCH", PATCH);
        enumMap.put("POST", POST);
        enumMap.put("PUT", PUT);
        enumMap.put("TRACE", TRACE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HttpMethod corresponding to the value
     */
    public static HttpMethod fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
