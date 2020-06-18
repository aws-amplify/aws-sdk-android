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
 * Specify the bitstream mode for the AC-3 stream that the encoder emits. For
 * more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
 */
public enum Ac3BitstreamMode {

    COMPLETE_MAIN("COMPLETE_MAIN"),
    COMMENTARY("COMMENTARY"),
    DIALOGUE("DIALOGUE"),
    EMERGENCY("EMERGENCY"),
    HEARING_IMPAIRED("HEARING_IMPAIRED"),
    MUSIC_AND_EFFECTS("MUSIC_AND_EFFECTS"),
    VISUALLY_IMPAIRED("VISUALLY_IMPAIRED"),
    VOICE_OVER("VOICE_OVER");

    private String value;

    private Ac3BitstreamMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, Ac3BitstreamMode> enumMap;
    static {
        enumMap = new HashMap<String, Ac3BitstreamMode>();
        enumMap.put("COMPLETE_MAIN", COMPLETE_MAIN);
        enumMap.put("COMMENTARY", COMMENTARY);
        enumMap.put("DIALOGUE", DIALOGUE);
        enumMap.put("EMERGENCY", EMERGENCY);
        enumMap.put("HEARING_IMPAIRED", HEARING_IMPAIRED);
        enumMap.put("MUSIC_AND_EFFECTS", MUSIC_AND_EFFECTS);
        enumMap.put("VISUALLY_IMPAIRED", VISUALLY_IMPAIRED);
        enumMap.put("VOICE_OVER", VOICE_OVER);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return Ac3BitstreamMode corresponding to the value
     */
    public static Ac3BitstreamMode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
