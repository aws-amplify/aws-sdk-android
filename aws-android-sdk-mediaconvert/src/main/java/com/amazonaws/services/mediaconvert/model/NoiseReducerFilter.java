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
 * Use Noise reducer filter (NoiseReducerFilter) to select one of the following
 * spatial image filtering functions. To use this setting, you must also enable
 * Noise reducer (NoiseReducer). * Bilateral preserves edges while reducing
 * noise. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) do
 * convolution filtering. * Conserve does min/max noise reduction. * Spatial
 * does frequency-domain filtering based on JND principles. * Temporal optimizes
 * video quality for complex motion.
 */
public enum NoiseReducerFilter {

    BILATERAL("BILATERAL"),
    MEAN("MEAN"),
    GAUSSIAN("GAUSSIAN"),
    LANCZOS("LANCZOS"),
    SHARPEN("SHARPEN"),
    CONSERVE("CONSERVE"),
    SPATIAL("SPATIAL"),
    TEMPORAL("TEMPORAL");

    private String value;

    private NoiseReducerFilter(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, NoiseReducerFilter> enumMap;
    static {
        enumMap = new HashMap<String, NoiseReducerFilter>();
        enumMap.put("BILATERAL", BILATERAL);
        enumMap.put("MEAN", MEAN);
        enumMap.put("GAUSSIAN", GAUSSIAN);
        enumMap.put("LANCZOS", LANCZOS);
        enumMap.put("SHARPEN", SHARPEN);
        enumMap.put("CONSERVE", CONSERVE);
        enumMap.put("SPATIAL", SPATIAL);
        enumMap.put("TEMPORAL", TEMPORAL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return NoiseReducerFilter corresponding to the value
     */
    public static NoiseReducerFilter fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
