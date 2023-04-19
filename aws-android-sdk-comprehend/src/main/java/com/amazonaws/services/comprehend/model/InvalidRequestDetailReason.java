/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Invalid Request Detail Reason
 */
public enum InvalidRequestDetailReason {

    DOCUMENT_SIZE_EXCEEDED("DOCUMENT_SIZE_EXCEEDED"),
    UNSUPPORTED_DOC_TYPE("UNSUPPORTED_DOC_TYPE"),
    PAGE_LIMIT_EXCEEDED("PAGE_LIMIT_EXCEEDED"),
    TEXTRACT_ACCESS_DENIED("TEXTRACT_ACCESS_DENIED");

    private String value;

    private InvalidRequestDetailReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InvalidRequestDetailReason> enumMap;
    static {
        enumMap = new HashMap<String, InvalidRequestDetailReason>();
        enumMap.put("DOCUMENT_SIZE_EXCEEDED", DOCUMENT_SIZE_EXCEEDED);
        enumMap.put("UNSUPPORTED_DOC_TYPE", UNSUPPORTED_DOC_TYPE);
        enumMap.put("PAGE_LIMIT_EXCEEDED", PAGE_LIMIT_EXCEEDED);
        enumMap.put("TEXTRACT_ACCESS_DENIED", TEXTRACT_ACCESS_DENIED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InvalidRequestDetailReason corresponding to the value
     */
    public static InvalidRequestDetailReason fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
