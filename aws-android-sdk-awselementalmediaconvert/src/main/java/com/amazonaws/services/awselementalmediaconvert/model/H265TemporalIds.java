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
 * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers
 * are supported depending on GOP structure: I- and P-frames form one layer,
 * reference B-frames can form a second layer and non-reference b-frames can
 * form a third layer. Decoders can optionally decode only the lower temporal
 * layers to generate a lower frame rate output. For example, given a bitstream
 * with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a
 * decoder could decode all the frames for full frame rate output or only the I
 * and P frames (lowest temporal layer) for a half frame rate output.
 */
public enum H265TemporalIds {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private H265TemporalIds(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, H265TemporalIds> enumMap;
    static {
        enumMap = new HashMap<String, H265TemporalIds>();
        enumMap.put("DISABLED", DISABLED);
        enumMap.put("ENABLED", ENABLED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return H265TemporalIds corresponding to the value
     */
    public static H265TemporalIds fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
