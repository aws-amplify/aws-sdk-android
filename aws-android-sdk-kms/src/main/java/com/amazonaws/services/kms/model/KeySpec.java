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

package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Key Spec
 */
public enum KeySpec {

    RSA_2048("RSA_2048"),
    RSA_3072("RSA_3072"),
    RSA_4096("RSA_4096"),
    ECC_NIST_P256("ECC_NIST_P256"),
    ECC_NIST_P384("ECC_NIST_P384"),
    ECC_NIST_P521("ECC_NIST_P521"),
    ECC_SECG_P256K1("ECC_SECG_P256K1"),
    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    HMAC_224("HMAC_224"),
    HMAC_256("HMAC_256"),
    HMAC_384("HMAC_384"),
    HMAC_512("HMAC_512");

    private String value;

    private KeySpec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, KeySpec> enumMap;
    static {
        enumMap = new HashMap<String, KeySpec>();
        enumMap.put("RSA_2048", RSA_2048);
        enumMap.put("RSA_3072", RSA_3072);
        enumMap.put("RSA_4096", RSA_4096);
        enumMap.put("ECC_NIST_P256", ECC_NIST_P256);
        enumMap.put("ECC_NIST_P384", ECC_NIST_P384);
        enumMap.put("ECC_NIST_P521", ECC_NIST_P521);
        enumMap.put("ECC_SECG_P256K1", ECC_SECG_P256K1);
        enumMap.put("SYMMETRIC_DEFAULT", SYMMETRIC_DEFAULT);
        enumMap.put("HMAC_224", HMAC_224);
        enumMap.put("HMAC_256", HMAC_256);
        enumMap.put("HMAC_384", HMAC_384);
        enumMap.put("HMAC_512", HMAC_512);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return KeySpec corresponding to the value
     */
    public static KeySpec fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
