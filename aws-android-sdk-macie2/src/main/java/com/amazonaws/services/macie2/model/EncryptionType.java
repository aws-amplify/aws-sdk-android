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

package com.amazonaws.services.macie2.model;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * The server-side encryption algorithm that's used when storing the S3 bucket
 * or object. Valid values are:
 * </p>
 */
public enum EncryptionType {

    NONE("NONE"),
    AES256("AES256"),
    AwsKms("aws:kms");

    private String value;

    private EncryptionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EncryptionType> enumMap;
    static {
        enumMap = new HashMap<String, EncryptionType>();
        enumMap.put("NONE", NONE);
        enumMap.put("AES256", AES256);
        enumMap.put("aws:kms", AwsKms);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EncryptionType corresponding to the value
     */
    public static EncryptionType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
