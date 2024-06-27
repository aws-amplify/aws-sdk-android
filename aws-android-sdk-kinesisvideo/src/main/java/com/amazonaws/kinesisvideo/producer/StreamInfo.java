package com.amazonaws.kinesisvideo.producer;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.nio.ByteBuffer;
import java.util.UUID;

import static com.amazonaws.kinesisvideo.producer.MkvTrackInfoType.VIDEO;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.DEFAULT_TRACK_ID;

/**
 * Stream information class.
 *
 * NOTE: This should follow the structure defined in /client/Include.h
 * StreamCaps in https://github.com/awslabs/amazon-kinesis-video-streams-producer-sdk-cpp/blob/master/kinesis-video-pic/src/client/include/com/amazonaws/kinesis/video/client/Include.h
 *
 *
 * NOTE: Suppressing Findbug to eliminate unnecessary mem copy.
 */
@SuppressFBWarnings("EI_EXPOSE_REP")
public class StreamInfo {
    /**
     * StreamInfo structure current version.
     * IMPORTANT: Must be kept in sync with the native counterpart.
     */
    public static final int STREAM_INFO_CURRENT_VERSION = 1;

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
    private final int mAvgBandwidthBps;
    private final int mFrameRate;
    private final long mBufferDuration;
    private final long mReplayDuration;
    private final long mConnectionStalenessDuration;
    private final long mTimecodeScale;
    private final boolean mRecalculateMetrics;
    private final Tag[] mTags;
    private final NalAdaptationFlags mNalAdaptationFlags;
    private final TrackInfo[] mTrackInfoList;
    private final UUID mSegmentUuid;
    private final FrameOrderMode mFrameOrderMode;

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
            return "V_MPEGH/ISO/HEVC";
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
        this(version, name, streamingType, contentType, kmsKeyId, retentionPeriod, adaptive, maxLatency,
                fragmentDuration, keyFrameFragmentation, frameTimecodes, absoluteFragmentTimes, fragmentAcks,
                recoverOnError, avgBandwidthBps, frameRate, bufferDuration, replayDuration,
                connectionStalenessDuration, timecodeScale, recalculateMetrics, tags,
                nalAdaptationFlags,
                null,
                new TrackInfo[] {new TrackInfo(DEFAULT_TRACK_ID, codecId, trackName, codecPrivateData, VIDEO)});
    }

    public StreamInfo(final int version, @Nullable final String name, @NonNull final StreamingType streamingType,
                      @NonNull final String contentType, @Nullable final String kmsKeyId, final long retentionPeriod,
                      final boolean adaptive, final long maxLatency, final long fragmentDuration,
                      final boolean keyFrameFragmentation, final boolean frameTimecodes,
                      final boolean absoluteFragmentTimes, final boolean fragmentAcks, final boolean recoverOnError,
                      final int avgBandwidthBps, final int frameRate, final long bufferDuration,
                      final long replayDuration, final long connectionStalenessDuration, final long timecodeScale,
                      final boolean recalculateMetrics, @Nullable final Tag[] tags,
                      @NonNull final NalAdaptationFlags nalAdaptationFlags,
                      @Nullable final UUID segmentUuid,
                      @NonNull final TrackInfo[] trackInfoList) {
        this(version, name, streamingType, contentType, kmsKeyId, retentionPeriod, adaptive, maxLatency,
                fragmentDuration, keyFrameFragmentation, frameTimecodes, absoluteFragmentTimes, fragmentAcks,
                recoverOnError, avgBandwidthBps, frameRate, bufferDuration, replayDuration,
                connectionStalenessDuration, timecodeScale, recalculateMetrics, tags,
                nalAdaptationFlags,
                segmentUuid,
                trackInfoList,
                fixUpFrameOrderMode(trackInfoList));
    }

    private static FrameOrderMode fixUpFrameOrderMode(TrackInfo[] trackInfos) {
        if (trackInfos.length == 2 && ((trackInfos[0].getTrackType().equals(MkvTrackInfoType.VIDEO)
                && trackInfos[1].getTrackType().equals(MkvTrackInfoType.AUDIO))
                || (trackInfos[0].getTrackType().equals(MkvTrackInfoType.AUDIO)
                && trackInfos[1].getTrackType().equals(MkvTrackInfoType.VIDEO)))) {
            // TODO change back to FRAME_ORDERING_MODE_MULTI_TRACK_AV once backend is fixed.
            return FrameOrderMode.FRAME_ORDERING_MODE_MULTI_TRACK_AV_COMPARE_PTS_ONE_MS_COMPENSATE;
        }
        return FrameOrderMode.FRAME_ORDER_MODE_PASS_THROUGH;
    }

    public StreamInfo(final int version, @Nullable final String name, @NonNull final StreamingType streamingType,
                      @NonNull final String contentType, @Nullable final String kmsKeyId, final long retentionPeriod,
                      final boolean adaptive, final long maxLatency, final long fragmentDuration,
                      final boolean keyFrameFragmentation, final boolean frameTimecodes,
                      final boolean absoluteFragmentTimes, final boolean fragmentAcks, final boolean recoverOnError,
                      final int avgBandwidthBps, final int frameRate, final long bufferDuration,
                      final long replayDuration, final long connectionStalenessDuration, final long timecodeScale,
                      final boolean recalculateMetrics, @Nullable final Tag[] tags,
                      @NonNull final NalAdaptationFlags nalAdaptationFlags,
                      @Nullable final UUID segmentUuid,
                      @NonNull final TrackInfo[] trackInfoList,
                      FrameOrderMode frameOrderMode) {
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
        mAvgBandwidthBps = avgBandwidthBps;
        mFrameRate = frameRate;
        mBufferDuration = bufferDuration;
        mReplayDuration = replayDuration;
        mConnectionStalenessDuration = connectionStalenessDuration;
        mTimecodeScale = timecodeScale;
        mRecalculateMetrics = recalculateMetrics;
        mTags = tags;
        mNalAdaptationFlags = nalAdaptationFlags;
        mSegmentUuid = segmentUuid;
        mTrackInfoList = trackInfoList;
        mFrameOrderMode = frameOrderMode;
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
    public UUID getSegmentUuid() {
        return mSegmentUuid;
    }

    @Nullable
    public byte[] getSegmentUuidBytes() {
        if (mSegmentUuid == null) {
            return null;
        }

        final ByteBuffer tempBuffer = ByteBuffer.wrap(new byte[16]);
        tempBuffer.putLong(mSegmentUuid.getMostSignificantBits());
        tempBuffer.putLong(mSegmentUuid.getLeastSignificantBits());
        return tempBuffer.array();
    }

    @NonNull
    public TrackInfo[] getTrackInfoList() {
        return mTrackInfoList;
    }

    public int getTrackInfoCount() {
        return mTrackInfoList.length;
    }

    @Nullable
    public String getCodecId(final int trackIndex) {
        return mTrackInfoList[trackIndex].getCodecId();
    }

    @Nullable
    public String getTrackName(final int trackIndex) {
        return mTrackInfoList[trackIndex].getTrackName();
    }

    @Nullable
    public byte[] getCodecPrivateData() {
        return mTrackInfoList == null || mTrackInfoList.length == 0 ? null : mTrackInfoList[0].getCodecPrivateData();
    }

    @Nullable
    public String getCodecId() {
        return mTrackInfoList == null || mTrackInfoList.length == 0 ? null : mTrackInfoList[0].getCodecId();
    }

    @Nullable
    public String getTrackName() {
        return mTrackInfoList == null || mTrackInfoList.length == 0 ? null : mTrackInfoList[0].getTrackName();
    }

    @Nullable
    public byte[] getCodecPrivateData(final int trackIndex) {
        Preconditions.checkState(mTrackInfoList != null && trackIndex < mTrackInfoList.length,
                "Requested track is not available in track info list.");
        return mTrackInfoList[trackIndex].getCodecPrivateData();
    }

    public long getTrackId(final int trackIndex) {
        Preconditions.checkState(mTrackInfoList != null && trackIndex < mTrackInfoList.length,
                "Requested track is not available in track info list.");
        return mTrackInfoList[trackIndex].getTrackId();
    }

    public int getTrackInfoType(final int trackIndex) {
        Preconditions.checkState(mTrackInfoList != null && trackIndex < mTrackInfoList.length,
                "Requested track is not available in track info list.");
        return mTrackInfoList[trackIndex].getTrackType().intValue();
    }

    public int getTrackInfoVersion(final int trackIndex) {
        Preconditions.checkState(mTrackInfoList != null && trackIndex < mTrackInfoList.length,
                "Requested track is not available in track info list.");
        return mTrackInfoList[trackIndex].getVersion();
    }

    @Nullable
    public Tag[] getTags() {
        return mTags;
    }

    @NonNull
    public int getNalAdaptationFlags() {
        return mNalAdaptationFlags.getIntValue();
    }

    public int getFrameOrderMode() {
        return mFrameOrderMode.intValue();
    }
}
