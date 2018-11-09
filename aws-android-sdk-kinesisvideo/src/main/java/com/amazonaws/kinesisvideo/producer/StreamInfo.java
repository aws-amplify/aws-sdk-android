/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.producer;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Stream information class.
 *
 * NOTE: This should follow the structure defined in /client/Include.h
 * StreamCaps in https://github.com/awslabs/amazon-kinesis-video-streams-producer-sdk-cpp/blob/master/kinesis-video-pic/src/client/include/com/amazonaws/kinesis/video/client/Include.h
 *
 *
 * NOTE: Suppressing Findbug to eliminate unnecessary mem copy.
 */
//@SuppressFBWarnings("EI_EXPOSE_REP")
public class StreamInfo {
    /**
     * StreamInfo structure current version.
     * IMPORTANT: Must be kept in sync with the native counterpart.
     */
    public static final int STREAM_INFO_CURRENT_VERSION = 0;

    /**
     * Streaming types that must correspond to the native counterparts
     */
    public static enum StreamingType {
        /**
         * Realtime mode for minimal latency
         */
        STREAMING_TYPE_REALTIME(0),

        /**
         * Near-realtime mode for predefined latency
         */
        STREAMING_TYPE_NEAR_REALTIME(1),

        /**
         * Offline upload mode
         */
        STREAMING_TYPE_OFFLINE(2);

        private int value;

        private StreamingType(final int i) {
            value = i;
        }

        public int getIntValue() {
            return value;
        }
    }

    /**
     * NAL adaptation types enum. The bit flags correspond to the ones defined in the correspond native counterparts
     */
    public static enum NalAdaptationFlags {
        /**
         * No flags are set - no adaptation
         */
        NAL_ADAPTATION_FLAG_NONE(0),

        /**
         * Whether to adapt Annex-B NALUs to Avcc NALUs
         */
        NAL_ADAPTATION_ANNEXB_NALS(1 << 3),

        /**
         * Whether to adapt Avcc NALUs to Annex-B NALUs
         */
        NAL_ADAPTATION_AVCC_NALS(1 << 4),

        /**
         * Whether to adapt Annex-B NALUs for the codec private data to Avcc format NALUs
         */
        NAL_ADAPTATION_ANNEXB_CPD_NALS(1 << 5),

        /**
         * Whether to adapt Annex-B NALUs for the codec and frame private data
         * to Avcc format NALUs
         */
        NAL_ADAPTATION_ANNEXB_CPD_AND_FRAME_NALS(
            NAL_ADAPTATION_ANNEXB_NALS.getIntValue()
                | NAL_ADAPTATION_ANNEXB_CPD_NALS.getIntValue());

        private int value;

        private NalAdaptationFlags(final int i) {
            value = i;
        }

        public static NalAdaptationFlags getFlag(final int i) {
            for (final NalAdaptationFlags eachValue : values()) {
                if (eachValue.getIntValue() == i) {
                    return eachValue;
                }
            }
            throw new IllegalArgumentException("Illegal value for NalAdaptationFlags");
        }

        public int getIntValue() {
            return value;
        }
    }

    private final int mVersion;
    private final String mName;
    private final StreamingType mStreamingType;
    private final String mContentType;
    private final String mKmsKeyId;
    private final long mRetentionPeriod;
    private final boolean mAdaptive;
    private final long mMaxLatency;
    private final long mFragmentDuration;
    private final boolean mKeyFrameFragmentation;
    private final boolean mFrameTimecodes;
    private final boolean mAbsoluteFragmentTimes;
    private final boolean mFragmentAcks;
    private final boolean mRecoverOnError;
    private final String mCodecId;
    private final String mTrackName;
    private final int mAvgBandwidthBps;
    private final int mFrameRate;
    private final long mBufferDuration;
    private final long mReplayDuration;
    private final long mConnectionStalenessDuration;
    private final long mTimecodeScale;
    private final boolean mRecalculateMetrics;
    private final byte[] mCodecPrivateData;
    private final Tag[] mTags;
    private final NalAdaptationFlags mNalAdaptationFlags;

    /**
     * Generates a track name from a content type
     *
     * @param contentType Content type
     * @return Generated track name.
     */
    @NonNull
    public static String createTrackName(@NonNull final String contentType) {
        Preconditions.checkNotNull(contentType);

        return "Track_" + contentType;
    }

    @NonNull
    public static String codecIdFromContentType(@NonNull final String contentType) throws KinesisVideoException {
        final String lowerCaseContentType = Preconditions.checkNotNull(contentType).toLowerCase();

        // TODO: Need to add more types and validate the mappings.
        // Video codecs
        if (0 == lowerCaseContentType.compareTo("video/x-vnd.on2.vp8")) {
            return "V_VP8";
        }

        if (0 == lowerCaseContentType.compareTo("video/x-vnd.on2.vp9")) {
            return "V_VP9";
        }

        if (0 == lowerCaseContentType.compareTo("video/avc")) {
            return "V_MPEG4/ISO/AVC";
        }

        if (0 == lowerCaseContentType.compareTo("video/h264")) {
            return "V_MPEG4/ISO/AVC";
        }

        if (0 == lowerCaseContentType.compareTo("video/hevc")) {
            return "V_MPEG4/ISO/AP";
        }

        if (0 == lowerCaseContentType.compareTo("video/mp4v-es")) {
            return "V_MPEG4/ISO/ASP";
        }

        // Audio codecs
        if (0 == lowerCaseContentType.compareTo("audio/mpeg")) {
            return "A_MPEG/L3";
        }

        if (0 == lowerCaseContentType.compareTo("audio/mp4a-latm")) {
            return "A_AAC/MPEG4/MAIN";
        }

        if (0 == lowerCaseContentType.compareTo("audio/vorbis")) {
            return "A_VORBIS";
        }

        throw new KinesisVideoException("Unknown content type to convert.");
    }

    public StreamInfo(final int version, @Nullable final String name, @NonNull final StreamingType streamingType,
                      @NonNull final String contentType, @Nullable final String kmsKeyId, final long retentionPeriod,
                      final boolean adaptive, final long maxLatency, final long fragmentDuration, final boolean keyFrameFragmentation,
                      final boolean frameTimecodes, final boolean absoluteFragmentTimes, final boolean fragmentAcks,
                      final boolean recoverOnError, @Nullable final String codecId, @Nullable final String trackName,
                      final int avgBandwidthBps, final int frameRate, final long bufferDuration, final long replayDuration,
                      final long connectionStalenessDuration, final long timecodeScale, final boolean recalculateMetrics,
                      @Nullable final byte[] codecPrivateData,
                      @Nullable final Tag[] tags,
                      @NonNull final NalAdaptationFlags nalAdaptationFlags) {
        mVersion = version;
        mName = name;
        mStreamingType = streamingType;
        mContentType = contentType;
        mKmsKeyId = kmsKeyId;
        mRetentionPeriod = retentionPeriod;
        mAdaptive = adaptive;
        mMaxLatency = maxLatency;
        mFragmentDuration = fragmentDuration;
        mKeyFrameFragmentation = keyFrameFragmentation;
        mFrameTimecodes = frameTimecodes;
        mAbsoluteFragmentTimes = absoluteFragmentTimes;
        mFragmentAcks = fragmentAcks;
        mRecoverOnError = recoverOnError;
        mCodecId = codecId;
        mTrackName = trackName;
        mAvgBandwidthBps = avgBandwidthBps;
        mFrameRate = frameRate;
        mBufferDuration = bufferDuration;
        mReplayDuration = replayDuration;
        mConnectionStalenessDuration = connectionStalenessDuration;
        mTimecodeScale = timecodeScale;
        mRecalculateMetrics = recalculateMetrics;
        mCodecPrivateData = codecPrivateData;
        mTags = tags;
        mNalAdaptationFlags = nalAdaptationFlags;
    }

    public int getVersion() {
        return mVersion;
    }

    @Nullable
    public String getName() {
        return mName;
    }

    public int getStreamingType() {
        return mStreamingType.getIntValue();
    }

    @NonNull
    public String getContentType() {
        return mContentType;
    }

    @Nullable
    public String getKmsKeyId() {
        return mKmsKeyId;
    }

    public long getRetentionPeriod() {
        return mRetentionPeriod;
    }

    public boolean isAdaptive() {
        return mAdaptive;
    }

    public long getMaxLatency() {
        return mMaxLatency;
    }

    public long getFragmentDuration() {
        return mFragmentDuration;
    }

    public boolean isKeyFrameFragmentation() {
        return mKeyFrameFragmentation;
    }

    public boolean isFrameTimecodes() {
        return mFrameTimecodes;
    }

    public boolean isAbsoluteFragmentTimes() {
        return mAbsoluteFragmentTimes;
    }

    public boolean isFragmentAcks() {
        return mFragmentAcks;
    }

    public boolean isRecoverOnError() {
        return mRecoverOnError;
    }

    @Nullable
    public String getCodecId() {
        return mCodecId;
    }

    @Nullable
    public String getTrackName() {
        return mTrackName;
    }

    public int getAvgBandwidthBps() {
        return mAvgBandwidthBps;
    }

    public int getFrameRate() {
        return mFrameRate;
    }

    public long getBufferDuration() {
        return mBufferDuration;
    }

    public long getReplayDuration() {
        return mReplayDuration;
    }

    public long getConnectionStalenessDuration() {
        return mConnectionStalenessDuration;
    }

    public long getTimecodeScale() {
        return mTimecodeScale;
    }

    public boolean isRecalculateMetrics() {
        return mRecalculateMetrics;
    }

    @Nullable
    public byte[] getCodecPrivateData() {
        return mCodecPrivateData;
    }

    @Nullable
    public Tag[] getTags() {
        return mTags;
    }

    @NonNull
    public int getNalAdaptationFlags() {
        return mNalAdaptationFlags.getIntValue();
    }
}
