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
 * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+,
 * or DolbyE decoder that supplied this audio data. If audio was not supplied
 * from one of these streams, then the static metadata settings will be used.
 */
public enum Eac3MetadataControl {

    FOLLOW_INPUT("FOLLOW_INPUT"),
    USE_CONFIGURED("USE_CONFIGURED");

    private String value;

    private Eac3MetadataControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Eac3MetadataControl> enumMap;
    static {
        enumMap = new HashMap<String, Eac3MetadataControl>();
        enumMap.put("FOLLOW_INPUT", FOLLOW_INPUT);
        enumMap.put("USE_CONFIGURED", USE_CONFIGURED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Eac3MetadataControl corresponding to the value
     */
    public static Eac3MetadataControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
