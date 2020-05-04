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
package com.amazonaws.services.s3-control.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Operation Name
 */
public enum OperationName {

    LambdaInvoke("LambdaInvoke"),
    S3PutObjectCopy("S3PutObjectCopy"),
    S3PutObjectAcl("S3PutObjectAcl"),
    S3PutObjectTagging("S3PutObjectTagging"),
    S3InitiateRestoreObject("S3InitiateRestoreObject"),
    S3PutObjectLegalHold("S3PutObjectLegalHold"),
    S3PutObjectRetention("S3PutObjectRetention");

    private String value;

    private OperationName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, OperationName> enumMap;
    static {
        enumMap = new HashMap<String, OperationName>();
        enumMap.put("LambdaInvoke", LambdaInvoke);
        enumMap.put("S3PutObjectCopy", S3PutObjectCopy);
        enumMap.put("S3PutObjectAcl", S3PutObjectAcl);
        enumMap.put("S3PutObjectTagging", S3PutObjectTagging);
        enumMap.put("S3InitiateRestoreObject", S3InitiateRestoreObject);
        enumMap.put("S3PutObjectLegalHold", S3PutObjectLegalHold);
        enumMap.put("S3PutObjectRetention", S3PutObjectRetention);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return OperationName corresponding to the value
     */
    public static OperationName fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
