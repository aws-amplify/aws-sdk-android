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

package com.amazonaws.services.mediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Specify the encryption mode that you used to encrypt your input files.
 */
public enum DecryptionMode {

    AES_CTR("AES_CTR"),
    AES_CBC("AES_CBC"),
    AES_GCM("AES_GCM");

    private String value;

    private DecryptionMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DecryptionMode> enumMap;
    static {
        enumMap = new HashMap<String, DecryptionMode>();
        enumMap.put("AES_CTR", AES_CTR);
        enumMap.put("AES_CBC", AES_CBC);
        enumMap.put("AES_GCM", AES_GCM);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DecryptionMode corresponding to the value
     */
    public static DecryptionMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
