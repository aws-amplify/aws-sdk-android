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

package com.amazonaws.kinesisvideo.internal.mediasource.multitrack;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.TrackInfo;
//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import static com.amazonaws.kinesisvideo.producer.StreamInfo.NalAdaptationFlags.NAL_ADAPTATION_FLAG_NONE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.ABSOLUTE_TIMECODES;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_BUFFER_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_REPLAY_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_STALENESS_DURATION;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_TIMESCALE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.FRAME_RATE_25;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.MAX_LATENCY_ZERO;

//@SuppressFBWarnings("EI_EXPOSE_REP")
public class MultiTrackMediaSourceConfiguration implements MediaSourceConfiguration {
    private static final String MEDIA_SOURCE_TYPE = "MultiTrackMediaSource";
    private static final String MEDIA_SOURCE_DESCRIPTION = "Media Source accepts multi-track data. ";

    public static class Builder<T extends Builder<T>>
            implements MediaSourceConfiguration.Builder<MultiTrackMediaSourceConfiguration> {

        protected int fps = FRAME_RATE_25;
        protected long retentionPeriodInHours;
        protected long latencyPressure = MAX_LATENCY_ZERO;
        protected long stalenessDuration = DEFAULT_STALENESS_DURATION;
        protected long bufferDuration = DEFAULT_BUFFER_DURATION;
        protected long replayDuration = DEFAULT_REPLAY_DURATION;
        protected long timecodeScale = DEFAULT_TIMESCALE;
        protected String contentType = null;
        protected TrackInfo[] trackInfoList;
        protected boolean absoluteTimecode = ABSOLUTE_TIMECODES;

        private StreamInfo.NalAdaptationFlags nalAdaptationFlag = NAL_ADAPTATION_FLAG_NONE;

        public T withAbsoluteTimecode(final boolean absoluteTimecode) {
            this.absoluteTimecode = absoluteTimecode;
            return (T) this;
        }

        public T withFps(final int fps) {
            this.fps = fps;
            return (T) this;
        }

        public T withContentType(final String contentType) {
            this.contentType = contentType;
            return (T) this;
        }

        public T withRetentionPeriodInHours(final long retentionPeriodInHours) {
            this.retentionPeriodInHours = retentionPeriodInHours;
            return (T) this;
        }

        public T withLatencyPressure(final long latencyPressure) {
            this.latencyPressure = latencyPressure;
            return (T) this;
        }

        public T withStalenessDuration(final long stalenessDuration) {
            this.stalenessDuration = stalenessDuration;
            return (T) this;
        }

        public T withReplayDuration(final long replayDuration) {
            this.replayDuration = replayDuration;
            return (T) this;
        }

        public T withBufferDuration(final long bufferDuration) {
            this.bufferDuration = bufferDuration;
            return (T) this;
        }

        public T withTimecodeScale(final long timecodeScale) {
            this.timecodeScale = timecodeScale;
            return (T) this;
        }

        public T withTrackInfoList(final TrackInfo[] trackInfoList) {
            this.trackInfoList = trackInfoList;
            return (T) this;
        }

        public T withNalAdaptationFlag(final StreamInfo.NalAdaptationFlags nalAdaptationFlag) {
            this.nalAdaptationFlag = nalAdaptationFlag;
            return (T) this;
        }

        @Override
        public MultiTrackMediaSourceConfiguration build() {
            return new MultiTrackMediaSourceConfiguration(this);
        }
    }

    private final Builder mBuilder;

    protected MultiTrackMediaSourceConfiguration(final Builder builder) {
        mBuilder = builder;
    }

    public int getFps() {
        return mBuilder.fps;
    }

    public long getRetentionPeriodInHours() {
        return mBuilder.retentionPeriodInHours;
    }

    public String getContentType() {
        return mBuilder.contentType;
    }

    public long getLatencyPressure() {
        return mBuilder.latencyPressure;
    }

    public long getStalenessDuration() {
        return mBuilder.stalenessDuration;
    }

    public long getBufferDuration() {
        return mBuilder.bufferDuration;
    }

    public long getReplayDuration() {
        return mBuilder.replayDuration;
    }

    public long getTimecodeScale() {
        return mBuilder.timecodeScale;
    }

    public StreamInfo.NalAdaptationFlags getNalAdaptationFlag() {
        return mBuilder.nalAdaptationFlag;
    }

    public TrackInfo[] getTrackInfoList() {
        return mBuilder.trackInfoList;
    }

    public boolean isAbsoluteTimecode() {
        return mBuilder.absoluteTimecode;
    }

    @Override
    public String getMediaSourceType() {
        return MEDIA_SOURCE_TYPE;
    }

    @Override
    public String getMediaSourceDescription() {
        return MEDIA_SOURCE_DESCRIPTION;
    }
}
