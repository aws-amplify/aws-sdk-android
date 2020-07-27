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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Document Hash Type
 */
public enum DocumentHashType {

    Sha256("Sha256"),
    Sha1("Sha1");

    private String value;

    private DocumentHashType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DocumentHashType> enumMap;
    static {
        enumMap = new HashMap<String, DocumentHashType>();
        enumMap.put("Sha256", Sha256);
        enumMap.put("Sha1", Sha1);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return DocumentHashType corresponding to the value
     */
    public static DocumentHashType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
