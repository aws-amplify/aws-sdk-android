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
 * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
 * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
 * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
 * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source
 * file includes a ticker, such as a scrolling headline at the bottom of the
 * frame.
 */
public enum DeinterlaceAlgorithm {

    INTERPOLATE("INTERPOLATE"),
    INTERPOLATE_TICKER("INTERPOLATE_TICKER"),
    BLEND("BLEND"),
    BLEND_TICKER("BLEND_TICKER");

    private String value;

    private DeinterlaceAlgorithm(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, DeinterlaceAlgorithm> enumMap;
    static {
        enumMap = new HashMap<String, DeinterlaceAlgorithm>();
        enumMap.put("INTERPOLATE", INTERPOLATE);
        enumMap.put("INTERPOLATE_TICKER", INTERPOLATE_TICKER);
        enumMap.put("BLEND", BLEND);
        enumMap.put("BLEND_TICKER", BLEND_TICKER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return DeinterlaceAlgorithm corresponding to the value
     */
    public static DeinterlaceAlgorithm fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
