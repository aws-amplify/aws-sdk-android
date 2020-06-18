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
 * When set to SINGLE_FILE, emits program as a single media resource (.ts) file,
 * uses #EXT-X-BYTERANGE tags to index segment for playback.
 */
public enum HlsSegmentControl {

    SINGLE_FILE("SINGLE_FILE"),
    SEGMENTED_FILES("SEGMENTED_FILES");

    private String value;

    private HlsSegmentControl(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsSegmentControl> enumMap;
    static {
        enumMap = new HashMap<String, HlsSegmentControl>();
        enumMap.put("SINGLE_FILE", SINGLE_FILE);
        enumMap.put("SEGMENTED_FILES", SEGMENTED_FILES);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsSegmentControl corresponding to the value
     */
    public static HlsSegmentControl fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
