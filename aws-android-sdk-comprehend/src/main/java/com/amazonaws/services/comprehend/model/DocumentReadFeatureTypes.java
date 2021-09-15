/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A list of the types of analyses to perform. This field specifies what feature
 * types need to be extracted from the document where entity recognition is
 * expected.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>TABLES</code> - Add TABLES to the list to return information about the
 * tables that are detected in the input document.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FORMS</code> - Add FORMS to return detected form data.
 * </p>
 * </li>
 * </ul>
 */
public enum DocumentReadFeatureTypes {

    TABLES("TABLES"),
    FORMS("FORMS");

    private String value;

    private DocumentReadFeatureTypes(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentReadFeatureTypes> enumMap;
    static {
        enumMap = new HashMap<String, DocumentReadFeatureTypes>();
        enumMap.put("TABLES", TABLES);
        enumMap.put("FORMS", FORMS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DocumentReadFeatureTypes corresponding to the value
     */
    public static DocumentReadFeatureTypes fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
