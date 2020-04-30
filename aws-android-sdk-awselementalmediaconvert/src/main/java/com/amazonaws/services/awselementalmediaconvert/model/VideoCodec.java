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
 * Type of video codec
 */
public enum VideoCodec {

    FRAME_CAPTURE("FRAME_CAPTURE"),
    AV1("AV1"),
    H_264("H_264"),
    H_265("H_265"),
    MPEG2("MPEG2"),
    PRORES("PRORES");

    private String value;

    private VideoCodec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, VideoCodec> enumMap;
    static {
        enumMap = new HashMap<String, VideoCodec>();
        enumMap.put("FRAME_CAPTURE", FRAME_CAPTURE);
        enumMap.put("AV1", AV1);
        enumMap.put("H_264", H_264);
        enumMap.put("H_265", H_265);
        enumMap.put("MPEG2", MPEG2);
        enumMap.put("PRORES", PRORES);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return VideoCodec corresponding to the value
     */
    public static VideoCodec fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
