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
 * Use this setting only in DASH output groups that include sidecar TTML or IMSC
 * captions. You specify sidecar captions in a separate output from your audio
 * and video. Choose Raw (RAW) for captions in a single XML file in a raw
 * container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML
 * format contained within fragmented MP4 files. This set of fragmented MP4
 * files is separate from your video and audio fragmented MP4 files.
 */
public enum MpdCaptionContainerType {

    RAW("RAW"),
    FRAGMENTED_MP4("FRAGMENTED_MP4");

    private String value;

    private MpdCaptionContainerType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MpdCaptionContainerType> enumMap;
    static {
        enumMap = new HashMap<String, MpdCaptionContainerType>();
        enumMap.put("RAW", RAW);
        enumMap.put("FRAGMENTED_MP4", FRAGMENTED_MP4);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MpdCaptionContainerType corresponding to the value
     */
    public static MpdCaptionContainerType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
