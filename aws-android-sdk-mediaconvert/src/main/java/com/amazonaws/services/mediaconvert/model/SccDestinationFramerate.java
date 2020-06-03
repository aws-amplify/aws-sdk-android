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
 * Set Framerate (SccDestinationFramerate) to make sure that the captions and
 * the video are synchronized in the output. Specify a frame rate that matches
 * the frame rate of the associated video. If the video frame rate is 29.97,
 * choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has
 * video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97
 * non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
 */
public enum SccDestinationFramerate {

    FRAMERATE_23_97("FRAMERATE_23_97"),
    FRAMERATE_24("FRAMERATE_24"),
    FRAMERATE_25("FRAMERATE_25"),
    FRAMERATE_29_97_DROPFRAME("FRAMERATE_29_97_DROPFRAME"),
    FRAMERATE_29_97_NON_DROPFRAME("FRAMERATE_29_97_NON_DROPFRAME");

    private String value;

    private SccDestinationFramerate(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, SccDestinationFramerate> enumMap;
    static {
        enumMap = new HashMap<String, SccDestinationFramerate>();
        enumMap.put("FRAMERATE_23_97", FRAMERATE_23_97);
        enumMap.put("FRAMERATE_24", FRAMERATE_24);
        enumMap.put("FRAMERATE_25", FRAMERATE_25);
        enumMap.put("FRAMERATE_29_97_DROPFRAME", FRAMERATE_29_97_DROPFRAME);
        enumMap.put("FRAMERATE_29_97_NON_DROPFRAME", FRAMERATE_29_97_NON_DROPFRAME);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return SccDestinationFramerate corresponding to the value
     */
    public static SccDestinationFramerate fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
