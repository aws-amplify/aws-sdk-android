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
 * If your input video has accurate color space metadata, or if you don't know
 * about color space, leave this set to the default value Follow (FOLLOW). The
 * service will automatically detect your input color space. If your input video
 * has metadata indicating the wrong color space, specify the accurate color
 * space here. If your input video is HDR 10 and the SMPTE ST 2086 Mastering
 * Display Color Volume static metadata isn't present in your video stream, or
 * if that metadata is present but not accurate, choose Force HDR 10
 * (FORCE_HDR10) here and specify correct values in the input HDR 10 metadata
 * (Hdr10Metadata) settings. For more information about MediaConvert HDR jobs,
 * see https://docs.aws.amazon.com/console/mediaconvert/hdr.
 */
public enum ColorSpace {

    FOLLOW("FOLLOW"),
    REC_601("REC_601"),
    REC_709("REC_709"),
    HDR10("HDR10"),
    HLG_2020("HLG_2020");

    private String value;

    private ColorSpace(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ColorSpace> enumMap;
    static {
        enumMap = new HashMap<String, ColorSpace>();
        enumMap.put("FOLLOW", FOLLOW);
        enumMap.put("REC_601", REC_601);
        enumMap.put("REC_709", REC_709);
        enumMap.put("HDR10", HDR10);
        enumMap.put("HLG_2020", HLG_2020);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ColorSpace corresponding to the value
     */
    public static ColorSpace fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
