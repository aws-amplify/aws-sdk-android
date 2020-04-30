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
 * Four types of audio-only tracks are supported: Audio-Only Variant Stream The
 * client can play back this audio-only stream instead of video in low-bandwidth
 * scenarios. Represented as an EXT-X-STREAM-INF in the HLS manifest. Alternate
 * Audio, Auto Select, Default Alternate rendition that the client should try to
 * play back by default. Represented as an EXT-X-MEDIA in the HLS manifest with
 * DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto Select, Not Default
 * Alternate rendition that the client may try to play back by default.
 * Represented as an EXT-X-MEDIA in the HLS manifest with DEFAULT=NO,
 * AUTOSELECT=YES Alternate Audio, not Auto Select Alternate rendition that the
 * client will not try to play back by default. Represented as an EXT-X-MEDIA in
 * the HLS manifest with DEFAULT=NO, AUTOSELECT=NO
 */
public enum HlsAudioTrackType {

    ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT("ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT"),
    ALTERNATE_AUDIO_AUTO_SELECT("ALTERNATE_AUDIO_AUTO_SELECT"),
    ALTERNATE_AUDIO_NOT_AUTO_SELECT("ALTERNATE_AUDIO_NOT_AUTO_SELECT"),
    AUDIO_ONLY_VARIANT_STREAM("AUDIO_ONLY_VARIANT_STREAM");

    private String value;

    private HlsAudioTrackType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsAudioTrackType> enumMap;
    static {
        enumMap = new HashMap<String, HlsAudioTrackType>();
        enumMap.put("ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT", ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT);
        enumMap.put("ALTERNATE_AUDIO_AUTO_SELECT", ALTERNATE_AUDIO_AUTO_SELECT);
        enumMap.put("ALTERNATE_AUDIO_NOT_AUTO_SELECT", ALTERNATE_AUDIO_NOT_AUTO_SELECT);
        enumMap.put("AUDIO_ONLY_VARIANT_STREAM", AUDIO_ONLY_VARIANT_STREAM);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsAudioTrackType corresponding to the value
     */
    public static HlsAudioTrackType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
