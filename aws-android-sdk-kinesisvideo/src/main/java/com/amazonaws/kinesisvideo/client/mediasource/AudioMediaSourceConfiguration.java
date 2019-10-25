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

package com.amazonaws.kinesisvideo.client.mediasource;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.AUDIO_TRACK_ID;
//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;


/**
 * AudioMediaSourceConfiguration defines common configuration properties for audio media source
 */
//@SuppressFBWarnings({"EI_EXPOSE_REP", "URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
public class AudioMediaSourceConfiguration implements MediaSourceConfiguration {

    private static final String MEDIA_SOURCE_DESCRIPTION = "Configuration for an audio media source";
    public static final String MEDIA_SOURCE_TYPE = "AbstractAudioMediaSource";

    public static class Builder implements MediaSourceConfiguration.Builder<AudioMediaSourceConfiguration> {

        private String  mMimeType;
        private String mOutputFileName;
        private int mEncodingBitrate;
        private boolean mIsEncoderHardwareAccelerated;
        private byte[] mCodecPrivateData;
        private long mFrameTimescale;
        private boolean mIsAbsoluteTimecode;
        private int mRetentionPeriodInHours;
        private int mSampleRate;
        private int mSamplesPerFrame;
        private int mFramesPerBuffer;
        private int mTrackId = AUDIO_TRACK_ID;
        private int mFrameRate = 60;

        public Builder withEncodingMimeType(final String mimeType) {
            mMimeType = mimeType;
            return this;
        }

        public Builder withRetentionPeriodInHours(final int retentionPeriodInHours) {
            mRetentionPeriodInHours = retentionPeriodInHours;
            return this;
        }

        public Builder withSampleRate(final int sampleRate) {
            mSampleRate = sampleRate;
            return this;
        }

        public Builder withSamplesPerFrame(final int samplesPerFrame) {
            mSamplesPerFrame = samplesPerFrame;
            return this;
        }

        public Builder withFramesPerBuffer(final int framesPerBuffer) {
            mFramesPerBuffer = framesPerBuffer;
            return this;
        }

        public Builder withFileOutput(final String outputFileName) {
            mOutputFileName = outputFileName;
            return this;
        }

        public Builder withEncodingBitRate(final int bitrate) {
            mEncodingBitrate = bitrate;
            return this;
        }

        public Builder withIsEncoderHardwareAccelerated(final boolean isAccelerated) {
            mIsEncoderHardwareAccelerated = isAccelerated;
            return this;
        }

        public Builder withCodecPrivateData(final byte[] privateData) {
            mCodecPrivateData = privateData;
            return this;
        }

        public Builder withFrameTimeScale(final long timescale) {
            mFrameTimescale = timescale;
            return this;
        }

        public Builder withIsAbsoluteTimecode(final boolean isAbsoluteTimecode) {
            mIsAbsoluteTimecode = isAbsoluteTimecode;
            return this;
        }

        public Builder withFrameRate(final int frameRate) {
            mFrameRate = frameRate;
            return this;
        }

        public byte[] getCodecPrivateData() {
            return mCodecPrivateData;
        }

        public Builder withTrackId(final int trackId) {
            mTrackId = trackId;
            return this;
        }

        @Override
        public AudioMediaSourceConfiguration build() {
            return new AudioMediaSourceConfiguration(this);
        }
    }

    private final Builder mBuilder;

    public AudioMediaSourceConfiguration(final Builder builder) {
        mBuilder = builder;
    }

    @Override
    public String getMediaSourceType() {
        return MEDIA_SOURCE_TYPE;
    }

    @Override
    public String getMediaSourceDescription() {
        return MEDIA_SOURCE_DESCRIPTION;
    }

    public static AudioMediaSourceConfiguration.Builder builder() {
        return new AudioMediaSourceConfiguration.Builder();
    }

    /**
     * Gets the output file name.
     */
    public String getOutputFileName() {
        return mBuilder.mOutputFileName;
    }

    /**
     * Gets the sample rate of the audio source.
     */
    public int getSampleRate() {
        return mBuilder.mSampleRate;
    }

    /**
     * Gets the AAC aac samples per frame
     */
    public int getSamplesPerFrame() {
        return mBuilder.mSamplesPerFrame;
    }

    /**
     * Gets the AAC frames per buffer
     */
    public int getFramesPerBuffer() {
        return mBuilder.mFramesPerBuffer;
    }

    /**
     * Gets the retention period in hours
     */
    public int getRetentionPeriodInHours() {
        return mBuilder.mRetentionPeriodInHours;
    }

    /**
     * Gets the encoding bitrate.
     */
    public int getBitRate() {
        return mBuilder.mEncodingBitrate;
    }

    /**
     * Gets the encoder mime type.
     */
    @NonNull
    public String getEncoderMimeType() {
        return mBuilder.mMimeType;
    }

    /**
     * Gets the codec private data.
     */
    @Nullable
    public byte[] getCodecPrivateData() {
        return mBuilder.mCodecPrivateData;
    }

    /**
     * Gets the timescale
     */
    public long getTimeScale() {
        return mBuilder.mFrameTimescale;
    }

    /**
     * Get if timecode is absolute or not
     * @return
     */
    public boolean getIsAbsoluteTimecode() {
        return mBuilder.mIsAbsoluteTimecode;
    }

    /**
     * Get track id of audio track
     * @return track id
     */
    public int getTrackId() {
        return mBuilder.mTrackId;
    }

    /**
     * Get frame rate of audio track
     * @return frame rate
     */
    public int getFrameRate() {
        return mBuilder.mFrameRate;
    }
}