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

package com.amazonaws.services.servicecatalog.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Service Action Association Error Code
 */
public enum ServiceActionAssociationErrorCode {

    DUPLICATE_RESOURCE("DUPLICATE_RESOURCE"),
    INTERNAL_FAILURE("INTERNAL_FAILURE"),
    LIMIT_EXCEEDED("LIMIT_EXCEEDED"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    THROTTLING("THROTTLING");

    private String value;

    private ServiceActionAssociationErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ServiceActionAssociationErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, ServiceActionAssociationErrorCode>();
        enumMap.put("DUPLICATE_RESOURCE", DUPLICATE_RESOURCE);
        enumMap.put("INTERNAL_FAILURE", INTERNAL_FAILURE);
        enumMap.put("LIMIT_EXCEEDED", LIMIT_EXCEEDED);
        enumMap.put("RESOURCE_NOT_FOUND", RESOURCE_NOT_FOUND);
        enumMap.put("THROTTLING", THROTTLING);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ServiceActionAssociationErrorCode corresponding to the value
     */
    public static ServiceActionAssociationErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
