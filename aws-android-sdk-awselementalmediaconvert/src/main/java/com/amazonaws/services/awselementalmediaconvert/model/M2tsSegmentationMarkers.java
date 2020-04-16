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
 * Inserts segmentation markers at each segmentation_time period. rai_segstart
 * sets the Random Access Indicator bit in the adaptation field. rai_adapt sets
 * the RAI bit and adds the current timecode in the private data bytes.
 * psi_segstart inserts PAT and PMT tables at the start of segments. ebp adds
 * Encoder Boundary Point information to the adaptation field as per OpenCable
 * specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point
 * information to the adaptation field using a legacy proprietary format.
 */
public enum M2tsSegmentationMarkers {

    NONE("NONE"),
    RAI_SEGSTART("RAI_SEGSTART"),
    RAI_ADAPT("RAI_ADAPT"),
    PSI_SEGSTART("PSI_SEGSTART"),
    EBP("EBP"),
    EBP_LEGACY("EBP_LEGACY");

    private String value;

    private M2tsSegmentationMarkers(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, M2tsSegmentationMarkers> enumMap;
    static {
        enumMap = new HashMap<String, M2tsSegmentationMarkers>();
        enumMap.put("NONE", NONE);
        enumMap.put("RAI_SEGSTART", RAI_SEGSTART);
        enumMap.put("RAI_ADAPT", RAI_ADAPT);
        enumMap.put("PSI_SEGSTART", PSI_SEGSTART);
        enumMap.put("EBP", EBP);
        enumMap.put("EBP_LEGACY", EBP_LEGACY);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return M2tsSegmentationMarkers corresponding to the value
     */
    public static M2tsSegmentationMarkers fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
