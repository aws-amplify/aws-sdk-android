/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

/* IMPORTANT!!! Make sure the values in this file correspond to their native counterparts in MKV_TRACK_INFO_TYPE
stucture from amazon-kinesis-video-streams-producer-sdk-cpp/kinesis-video-pic/src/mkvgen/include/com/amazonaws/kinesis/video/mkvgen/Include.h */
public enum MkvTrackInfoType {
    VIDEO(1), AUDIO(2), UNKNOWN(3);
    private final int mValue;

    public static final int getStatusCode(String status) {
        for (MkvTrackInfoType trackInfoType : MkvTrackInfoType.values()) {
            if (trackInfoType.name().equals(status)) {
                return trackInfoType.mValue;
            }
        }
        return UNKNOWN.intValue();
    }

    MkvTrackInfoType(int value) {
        this.mValue = value;
    }

    public static MkvTrackInfoType getType(final int i) {
        for (final MkvTrackInfoType eachValue : values()) {
            if (eachValue.intValue() == i) {
                return eachValue;
            }
        }
        throw new IllegalArgumentException("Illegal value for NalAdaptationFlags");
    }

    public final int intValue() {
        return mValue;
    }
}
