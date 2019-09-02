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

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import android.support.annotation.Nullable;

/**
 * Track information object.
 *
 * NOTE: This should follow the structure defined in /mkvgen/Include.h
 *
 * NOTE: Suppressing Findbug error as this code will be accessed from native codebase.
 */
//@SuppressFBWarnings("EI_EXPOSE_REP")
public class TrackInfo {
    public static final int TRACK_INFO_CURRENT_VERSION = 0;

    private final int version;

    // Unique Identifier for TrackInfo
    private final long trackId;

    // Codec ID of the stream. Null terminated.
    private final String codecId;

    // Human readable track name. Null terminated.
    private final String trackName;

    // Codec private data. Can be NULL if no CPD is used. Allocated in heap.
    private final byte[] codecPrivateData;

    // Track's content type.
    private final MkvTrackInfoType trackType;

    public TrackInfo(final long trackId, @Nullable final String codecId, @Nullable final String trackName,
                     @Nullable final byte[] codecPrivateData, final MkvTrackInfoType trackType) {
        this.version = TRACK_INFO_CURRENT_VERSION;
        this.trackId = trackId;
        this.codecId = codecId;
        this.trackName = trackName;
        this.codecPrivateData = codecPrivateData;
        this.trackType = trackType;
    }

    public int getVersion() {
        return version;
    }

    public long getTrackId() {
        return trackId;
    }

    @Nullable
    public String getCodecId() {
        return codecId;
    }

    @Nullable
    public String getTrackName() {
        return trackName;
    }

    @Nullable
    public byte[] getCodecPrivateData() {
        return codecPrivateData;
    }

    public MkvTrackInfoType getTrackType() {
        return trackType;
    }
}
