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
 * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
 * SEGMENTATION_EVENT_NOT_CANCELED corresponds to 0 in the SCTE-35 specification
 * and indicates that this is an insertion request. SEGMENTATION_EVENT_CANCELED
 * corresponds to 1 in the SCTE-35 specification and indicates that this is a
 * cancelation request, in which case complete this field and the existing event
 * ID to cancel.
 */
public enum Scte35SegmentationCancelIndicator {

    SEGMENTATION_EVENT_NOT_CANCELED("SEGMENTATION_EVENT_NOT_CANCELED"),
    SEGMENTATION_EVENT_CANCELED("SEGMENTATION_EVENT_CANCELED");

    private String value;

    private Scte35SegmentationCancelIndicator(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Scte35SegmentationCancelIndicator> enumMap;
    static {
        enumMap = new HashMap<String, Scte35SegmentationCancelIndicator>();
        enumMap.put("SEGMENTATION_EVENT_NOT_CANCELED", SEGMENTATION_EVENT_NOT_CANCELED);
        enumMap.put("SEGMENTATION_EVENT_CANCELED", SEGMENTATION_EVENT_CANCELED);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Scte35SegmentationCancelIndicator corresponding to the value
     */
    public static Scte35SegmentationCancelIndicator fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
