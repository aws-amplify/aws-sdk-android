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

package com.amazonaws.kinesisvideo.util;

import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_AN_HOUR;
import static com.amazonaws.kinesisvideo.producer.Time.HUNDREDS_OF_NANOS_IN_A_SECOND;

/**
 * All the time unit used in this class is 100 ns (minimum unit used in producer SDK)
 */
public final class StreamInfoConstants {
    public static final boolean NOT_ADAPTIVE = false;
    public static final boolean KEYFRAME_FRAGMENTATION = true;
    public static final boolean SDK_GENERATES_TIMECODES = false;
    public static final boolean RELATIVE_FRAGMENT_TIMECODES = false;
    public static final String NO_KMS_KEY_ID = null;
    public static final int VERSION_ZERO = 0;
    public static final long MAX_LATENCY_ZERO = 0L; // latency set to 0 will never trigger latency pressure callback
    public static final long MAX_LATENCY = 120L * HUNDREDS_OF_NANOS_IN_A_SECOND;
    public static final long NO_RETENTION = 0L;
    public static final long RETENTION_ONE_HOUR = 1L * HUNDREDS_OF_NANOS_IN_AN_HOUR;
    public static final boolean REQUEST_FRAGMENT_ACKS = true;
    public static final boolean RECOVER_ON_FAILURE = true;
    public static final long DEFAULT_GOP_DURATION = 2L * HUNDREDS_OF_NANOS_IN_A_SECOND;
    public static final int DEFAULT_BITRATE = 2000000;
    public static final int DEFAULT_TIMESCALE = 10000; //1 ms
    public static final int FRAMERATE_30 = 30;
    public static final int FRAME_RATE_25 = 25;
    public static final boolean USE_FRAME_TIMECODES = true;
    public static final boolean ABSOLUTE_TIMECODES = true;
    public static final boolean RELATIVE_TIMECODES = false;
    public static final boolean RECALCULATE_METRICS = true;
    public static final int DEFAULT_TRACK_ID = 1;
    public static final int VIDEO_TRACK_ID = DEFAULT_TRACK_ID;
    public static final int AUDIO_TRACK_ID = DEFAULT_TRACK_ID + 1;
    public static final String VIDEO_CONTENT_TYPE = "video/h264";
    public static final String AUDIO_VIDEO_CONTENT_TYPE = "video/h264,audio/aac";
    public static final long FRAME_DURATION_0_MS = 0L;
    public static final String VIDEO_CODEC_ID = "V_MPEG4/ISO/AVC";
    public static final String AUDIO_CODEC_ID = "A_AAC";

    /**
     * Default buffer duration for a stream
     */
    public static final long DEFAULT_BUFFER_DURATION = 40 * HUNDREDS_OF_NANOS_IN_A_SECOND;

    /**
     * Default replay duration for a stream
     */
    public static final long DEFAULT_REPLAY_DURATION = 20 * HUNDREDS_OF_NANOS_IN_A_SECOND;

    /**
     * Default connection staleness detection duration.
     */
    public static final long DEFAULT_STALENESS_DURATION = 20 * HUNDREDS_OF_NANOS_IN_A_SECOND;

    private StreamInfoConstants() {
        throw new UnsupportedOperationException();
    }
}
