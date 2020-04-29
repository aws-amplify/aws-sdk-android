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

package com.amazonaws.services.awswafregional.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Text Transformation
 */
public enum TextTransformation {

    NONE("NONE"),
    COMPRESS_WHITE_SPACE("COMPRESS_WHITE_SPACE"),
    HTML_ENTITY_DECODE("HTML_ENTITY_DECODE"),
    LOWERCASE("LOWERCASE"),
    CMD_LINE("CMD_LINE"),
    URL_DECODE("URL_DECODE");

    private String value;

    private TextTransformation(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, TextTransformation> enumMap;
    static {
        enumMap = new HashMap<String, TextTransformation>();
        enumMap.put("NONE", NONE);
        enumMap.put("COMPRESS_WHITE_SPACE", COMPRESS_WHITE_SPACE);
        enumMap.put("HTML_ENTITY_DECODE", HTML_ENTITY_DECODE);
        enumMap.put("LOWERCASE", LOWERCASE);
        enumMap.put("CMD_LINE", CMD_LINE);
        enumMap.put("URL_DECODE", URL_DECODE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return TextTransformation corresponding to the value
     */
    public static TextTransformation fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
