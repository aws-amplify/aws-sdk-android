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
 * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision
 * for intra-block DC coefficients. If you choose the value auto, the service
 * will automatically select the precision based on the per-frame compression
 * ratio.
 */
public enum Mpeg2IntraDcPrecision {

    AUTO("AUTO"),
    INTRA_DC_PRECISION_8("INTRA_DC_PRECISION_8"),
    INTRA_DC_PRECISION_9("INTRA_DC_PRECISION_9"),
    INTRA_DC_PRECISION_10("INTRA_DC_PRECISION_10"),
    INTRA_DC_PRECISION_11("INTRA_DC_PRECISION_11");

    private String value;

    private Mpeg2IntraDcPrecision(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Mpeg2IntraDcPrecision> enumMap;
    static {
        enumMap = new HashMap<String, Mpeg2IntraDcPrecision>();
        enumMap.put("AUTO", AUTO);
        enumMap.put("INTRA_DC_PRECISION_8", INTRA_DC_PRECISION_8);
        enumMap.put("INTRA_DC_PRECISION_9", INTRA_DC_PRECISION_9);
        enumMap.put("INTRA_DC_PRECISION_10", INTRA_DC_PRECISION_10);
        enumMap.put("INTRA_DC_PRECISION_11", INTRA_DC_PRECISION_11);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Mpeg2IntraDcPrecision corresponding to the value
     */
    public static Mpeg2IntraDcPrecision fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
