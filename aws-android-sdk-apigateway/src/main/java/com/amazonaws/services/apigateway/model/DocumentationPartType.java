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

package com.amazonaws.services.apigateway.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Documentation Part Type
 */
public enum DocumentationPartType {

    API("API"),
    AUTHORIZER("AUTHORIZER"),
    MODEL("MODEL"),
    RESOURCE("RESOURCE"),
    METHOD("METHOD"),
    PATH_PARAMETER("PATH_PARAMETER"),
    QUERY_PARAMETER("QUERY_PARAMETER"),
    REQUEST_HEADER("REQUEST_HEADER"),
    REQUEST_BODY("REQUEST_BODY"),
    RESPONSE("RESPONSE"),
    RESPONSE_HEADER("RESPONSE_HEADER"),
    RESPONSE_BODY("RESPONSE_BODY");

    private String value;

    private DocumentationPartType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentationPartType> enumMap;
    static {
        enumMap = new HashMap<String, DocumentationPartType>();
        enumMap.put("API", API);
        enumMap.put("AUTHORIZER", AUTHORIZER);
        enumMap.put("MODEL", MODEL);
        enumMap.put("RESOURCE", RESOURCE);
        enumMap.put("METHOD", METHOD);
        enumMap.put("PATH_PARAMETER", PATH_PARAMETER);
        enumMap.put("QUERY_PARAMETER", QUERY_PARAMETER);
        enumMap.put("REQUEST_HEADER", REQUEST_HEADER);
        enumMap.put("REQUEST_BODY", REQUEST_BODY);
        enumMap.put("RESPONSE", RESPONSE);
        enumMap.put("RESPONSE_HEADER", RESPONSE_HEADER);
        enumMap.put("RESPONSE_BODY", RESPONSE_BODY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DocumentationPartType corresponding to the value
     */
    public static DocumentationPartType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
