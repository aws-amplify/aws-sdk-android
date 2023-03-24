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
 * Document Type
 */
public enum DocumentType {

    NATIVE_PDF("NATIVE_PDF"),
    SCANNED_PDF("SCANNED_PDF"),
    MS_WORD("MS_WORD"),
    IMAGE("IMAGE"),
    PLAIN_TEXT("PLAIN_TEXT"),
    TEXTRACT_DETECT_DOCUMENT_TEXT_JSON("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON"),
    TEXTRACT_ANALYZE_DOCUMENT_JSON("TEXTRACT_ANALYZE_DOCUMENT_JSON");

    private String value;

    private DocumentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentType> enumMap;
    static {
        enumMap = new HashMap<String, DocumentType>();
        enumMap.put("NATIVE_PDF", NATIVE_PDF);
        enumMap.put("SCANNED_PDF", SCANNED_PDF);
        enumMap.put("MS_WORD", MS_WORD);
        enumMap.put("IMAGE", IMAGE);
        enumMap.put("PLAIN_TEXT", PLAIN_TEXT);
        enumMap.put("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON", TEXTRACT_DETECT_DOCUMENT_TEXT_JSON);
        enumMap.put("TEXTRACT_ANALYZE_DOCUMENT_JSON", TEXTRACT_ANALYZE_DOCUMENT_JSON);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DocumentType corresponding to the value
     */
    public static DocumentType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
