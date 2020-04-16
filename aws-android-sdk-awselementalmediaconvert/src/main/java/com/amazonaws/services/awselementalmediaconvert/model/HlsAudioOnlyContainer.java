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
 * Use this setting only in audio-only outputs. Choose MPEG-2 Transport Stream
 * (M2TS) to create a file in an MPEG2-TS container. Keep the default value
 * Automatic (AUTOMATIC) to create a raw audio-only file with no container.
 * Regardless of the value that you specify here, if this output has video, the
 * service will place outputs into an MPEG2-TS container.
 */
public enum HlsAudioOnlyContainer {

    AUTOMATIC("AUTOMATIC"),
    M2TS("M2TS");

    private String value;

    private HlsAudioOnlyContainer(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, HlsAudioOnlyContainer> enumMap;
    static {
        enumMap = new HashMap<String, HlsAudioOnlyContainer>();
        enumMap.put("AUTOMATIC", AUTOMATIC);
        enumMap.put("M2TS", M2TS);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return HlsAudioOnlyContainer corresponding to the value
     */
    public static HlsAudioOnlyContainer fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
