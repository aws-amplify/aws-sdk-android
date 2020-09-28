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

package com.amazonaws.services.transcribe.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Media Format
 */
public enum MediaFormat {

    Mp3("mp3"),
    Mp4("mp4"),
    Wav("wav"),
    Flac("flac"),
    Ogg("ogg"),
    Amr("amr"),
    Webm("webm");

    private String value;

    private MediaFormat(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, MediaFormat> enumMap;
    static {
        enumMap = new HashMap<String, MediaFormat>();
        enumMap.put("mp3", Mp3);
        enumMap.put("mp4", Mp4);
        enumMap.put("wav", Wav);
        enumMap.put("flac", Flac);
        enumMap.put("ogg", Ogg);
        enumMap.put("amr", Amr);
        enumMap.put("webm", Webm);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return MediaFormat corresponding to the value
     */
    public static MediaFormat fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
