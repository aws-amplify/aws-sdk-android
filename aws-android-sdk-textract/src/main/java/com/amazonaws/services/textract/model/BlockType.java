/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Block Type
 */
public enum BlockType {

    KEY_VALUE_SET("KEY_VALUE_SET"),
    PAGE("PAGE"),
    LINE("LINE"),
    WORD("WORD"),
    TABLE("TABLE"),
    CELL("CELL"),
    SELECTION_ELEMENT("SELECTION_ELEMENT"),
    MERGED_CELL("MERGED_CELL"),
    TITLE("TITLE");

    private String value;

    private BlockType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, BlockType> enumMap;
    static {
        enumMap = new HashMap<String, BlockType>();
        enumMap.put("KEY_VALUE_SET", KEY_VALUE_SET);
        enumMap.put("PAGE", PAGE);
        enumMap.put("LINE", LINE);
        enumMap.put("WORD", WORD);
        enumMap.put("TABLE", TABLE);
        enumMap.put("CELL", CELL);
        enumMap.put("SELECTION_ELEMENT", SELECTION_ELEMENT);
        enumMap.put("MERGED_CELL", MERGED_CELL);
        enumMap.put("TITLE", TITLE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return BlockType corresponding to the value
     */
    public static BlockType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
