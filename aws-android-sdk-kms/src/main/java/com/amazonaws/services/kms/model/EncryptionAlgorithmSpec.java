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

package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Encryption Algorithm Spec
 */
public enum EncryptionAlgorithmSpec {

    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    RSAES_OAEP_SHA_1("RSAES_OAEP_SHA_1"),
    RSAES_OAEP_SHA_256("RSAES_OAEP_SHA_256"),
    SM2PKE("SM2PKE");

    private String value;

    private EncryptionAlgorithmSpec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, EncryptionAlgorithmSpec> enumMap;
    static {
        enumMap = new HashMap<String, EncryptionAlgorithmSpec>();
        enumMap.put("SYMMETRIC_DEFAULT", SYMMETRIC_DEFAULT);
        enumMap.put("RSAES_OAEP_SHA_1", RSAES_OAEP_SHA_1);
        enumMap.put("RSAES_OAEP_SHA_256", RSAES_OAEP_SHA_256);
        enumMap.put("SM2PKE", SM2PKE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return EncryptionAlgorithmSpec corresponding to the value
     */
    public static EncryptionAlgorithmSpec fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
