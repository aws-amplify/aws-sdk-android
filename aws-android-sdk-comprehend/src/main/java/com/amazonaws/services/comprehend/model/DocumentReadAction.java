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
 * Document Read Action
 */
public enum DocumentReadAction {

    TEXTRACT_DETECT_DOCUMENT_TEXT("TEXTRACT_DETECT_DOCUMENT_TEXT"),
    TEXTRACT_ANALYZE_DOCUMENT("TEXTRACT_ANALYZE_DOCUMENT");

    private String value;

    private DocumentReadAction(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentReadAction> enumMap;
    static {
        enumMap = new HashMap<String, DocumentReadAction>();
        enumMap.put("TEXTRACT_DETECT_DOCUMENT_TEXT", TEXTRACT_DETECT_DOCUMENT_TEXT);
        enumMap.put("TEXTRACT_ANALYZE_DOCUMENT", TEXTRACT_ANALYZE_DOCUMENT);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DocumentReadAction corresponding to the value
     */
    public static DocumentReadAction fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
