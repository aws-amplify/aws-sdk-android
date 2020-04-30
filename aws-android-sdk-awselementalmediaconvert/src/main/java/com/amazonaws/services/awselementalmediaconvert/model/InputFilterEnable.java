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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Use Filter enable (InputFilterEnable) to specify how the transcoding service
 * applies the denoise and deblock filters. You must also enable the filters
 * separately, with Denoise (InputDenoiseFilter) and Deblock
 * (InputDeblockFilter). * Auto - The transcoding service determines whether to
 * apply filtering, depending on input type and quality. * Disable - The input
 * is not filtered. This is true even if you use the API to enable them in
 * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is
 * filtered regardless of input type.
 */
public enum InputFilterEnable {

    AUTO("AUTO"),
    DISABLE("DISABLE"),
    FORCE("FORCE");

    private String value;

    private InputFilterEnable(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, InputFilterEnable> enumMap;
    static {
        enumMap = new HashMap<String, InputFilterEnable>();
        enumMap.put("AUTO", AUTO);
        enumMap.put("DISABLE", DISABLE);
        enumMap.put("FORCE", FORCE);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return InputFilterEnable corresponding to the value
     */
    public static InputFilterEnable fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
