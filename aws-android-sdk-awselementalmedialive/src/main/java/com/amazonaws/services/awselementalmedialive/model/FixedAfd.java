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

package com.amazonaws.services.awselementalmedialive.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Fixed Afd
 */
public enum FixedAfd {

    AFD_0000("AFD_0000"),
    AFD_0010("AFD_0010"),
    AFD_0011("AFD_0011"),
    AFD_0100("AFD_0100"),
    AFD_1000("AFD_1000"),
    AFD_1001("AFD_1001"),
    AFD_1010("AFD_1010"),
    AFD_1011("AFD_1011"),
    AFD_1101("AFD_1101"),
    AFD_1110("AFD_1110"),
    AFD_1111("AFD_1111");

    private String value;

    private FixedAfd(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, FixedAfd> enumMap;
    static {
        enumMap = new HashMap<String, FixedAfd>();
        enumMap.put("AFD_0000", AFD_0000);
        enumMap.put("AFD_0010", AFD_0010);
        enumMap.put("AFD_0011", AFD_0011);
        enumMap.put("AFD_0100", AFD_0100);
        enumMap.put("AFD_1000", AFD_1000);
        enumMap.put("AFD_1001", AFD_1001);
        enumMap.put("AFD_1010", AFD_1010);
        enumMap.put("AFD_1011", AFD_1011);
        enumMap.put("AFD_1101", AFD_1101);
        enumMap.put("AFD_1110", AFD_1110);
        enumMap.put("AFD_1111", AFD_1111);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return FixedAfd corresponding to the value
     */
    public static FixedAfd fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
