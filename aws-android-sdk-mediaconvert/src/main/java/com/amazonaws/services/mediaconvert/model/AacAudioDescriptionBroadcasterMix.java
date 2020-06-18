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
 * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio +
 * audio description (AD) as a stereo pair. The value for AudioType will be set
 * to 3, which signals to downstream systems that this stream contains
 * "broadcaster mixed AD". Note that the input received by the encoder must
 * contain pre-mixed audio; the encoder does not perform the mixing. When you
 * choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in
 * AudioType and FollowInputAudioType. Choose NORMAL when the input does not
 * contain pre-mixed audio + audio description (AD). In this case, the encoder
 * will use any values you provide for AudioType and FollowInputAudioType.
 */
public enum AacAudioDescriptionBroadcasterMix {

    BROADCASTER_MIXED_AD("BROADCASTER_MIXED_AD"),
    NORMAL("NORMAL");

    private String value;

    private AacAudioDescriptionBroadcasterMix(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, AacAudioDescriptionBroadcasterMix> enumMap;
    static {
        enumMap = new HashMap<String, AacAudioDescriptionBroadcasterMix>();
        enumMap.put("BROADCASTER_MIXED_AD", BROADCASTER_MIXED_AD);
        enumMap.put("NORMAL", NORMAL);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return AacAudioDescriptionBroadcasterMix corresponding to the value
     */
    public static AacAudioDescriptionBroadcasterMix fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
