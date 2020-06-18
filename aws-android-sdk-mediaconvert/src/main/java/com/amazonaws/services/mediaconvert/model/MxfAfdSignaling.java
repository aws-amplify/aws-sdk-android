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
 * Optional. When you have AFD signaling set up in your output video stream, use
 * this setting to choose whether to also include it in the MXF wrapper. Choose
 * Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose
 * Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the
 * video stream for this output to the MXF wrapper. Regardless of which option
 * you choose, the AFD values remain in the video stream. Related settings: To
 * set up your output to include or exclude AFD values, see AfdSignaling, under
 * VideoDescription. On the console, find AFD signaling under the output's video
 * encoding settings.
 */
public enum MxfAfdSignaling {

    NO_COPY("NO_COPY"),
    COPY_FROM_VIDEO("COPY_FROM_VIDEO");

    private String value;

    private MxfAfdSignaling(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MxfAfdSignaling> enumMap;
    static {
        enumMap = new HashMap<String, MxfAfdSignaling>();
        enumMap.put("NO_COPY", NO_COPY);
        enumMap.put("COPY_FROM_VIDEO", COPY_FROM_VIDEO);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MxfAfdSignaling corresponding to the value
     */
    public static MxfAfdSignaling fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
