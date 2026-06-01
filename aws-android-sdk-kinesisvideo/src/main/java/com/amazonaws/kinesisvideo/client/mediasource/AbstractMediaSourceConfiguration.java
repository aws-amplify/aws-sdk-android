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

package com.amazonaws.kinesisvideo.client.mediasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

/**
 * This abstract class defines common configuration properties for media sources.
 */
public abstract class AbstractMediaSourceConfiguration implements MediaSourceConfiguration {
    /**
     * Refernce to the builder used for creating this configuration object.
     */
    protected final Builder mBuilder;

    /**
     * Generic abstract builder for this configuration class.
     * It uses recursive generics pattern to be able to preserve the chaining capability of builders.
     * @param <T> MediaSource type.
     * @param <S> Builder type.
     */
    public static abstract class Builder<T extends AbstractMediaSourceConfiguration,
            S extends AbstractMediaSourceConfiguration.Builder<T, S>> implements MediaSourceConfiguration.Builder<T> {

        protected String  mMimeType;
        protected int mFrameRate;
        protected int mHorizontalResolution;
        protected int mVerticalResolution;
        protected String mOutputFileName;
        protected int mEncodingBitrate;
        protected boolean mIsEncoderHardwareAccelerated;
        protected int mGopDurationMillis;
        protected byte[] mCodecPrivateData;
        protected long mFrameTimescale;
        protected StreamInfo.NalAdaptationFlags mNalAdaptationFlags;
        protected boolean mIsAbsoluteTimecode;
        protected int mRetentionPeriodInHours;

        /**
         * Set the MIME type.
         * @param mimeType Input value.
         * @return Reference to the same builder object and type.
         */
        public S withEncodingMimeType(final String mimeType) {
            mMimeType = mimeType;
            return (S)this;
        }

        /**
         * Set the retention period in hours.
         * @param retentionPeriodInHours Input value.
         * @return Reference to the same builder object and type.
         */
        public S withRetentionPeriodInHours(final int retentionPeriodInHours) {
            mRetentionPeriodInHours = retentionPeriodInHours;
            return (S)this;
        }

        /**
         * Set the frame rate.
         * @param frameRate Input value.
         * @return Reference to the same builder object and type.
         */
        public S withFrameRate(final int frameRate) {
            mFrameRate = frameRate;
            return (S)this;
        }

        /**
         * Set the output file name.
         * @param outputFileName Input value.
         * @return Reference to the same builder object and type.
         */
        public S withFileOutput(final String outputFileName) {
            mOutputFileName = outputFileName;
            return (S)this;
        }

        /**
         * Set the horizontal resolution.
         * @param horizontalResolution Input value.
         * @return Reference to the same builder object and type.
         */
        public S withHorizontalResolution(final int horizontalResolution) {
            mHorizontalResolution = horizontalResolution;
            return (S)this;
        }

        /**
         * Set the vertical resolution.
         * @param verticalResolution Input value.
         * @return Reference to the same builder object and type.
         */
        public S withVerticalResolution(final int verticalResolution) {
            mVerticalResolution = verticalResolution;
            return (S)this;
        }

        /**
         * Set the encoding bit rate.
         * @param bitrate Input value.
         * @return Reference to the same builder object and type.
         */
        public S withEncodingBitRate(final int bitrate) {
            mEncodingBitrate = bitrate;
            return (S)this;
        }

        /**
         * Set the hardware acceleration flag.
         * @param isAccelerated Input value.
         * @return Reference to the same builder object and type.
         */
        public S withIsEncoderHardwareAccelerated(final boolean isAccelerated) {
            mIsEncoderHardwareAccelerated = isAccelerated;
            return (S)this;
        }

        /**
         * Set the codec private data.
         * @param privateData Input value.
         * @return Reference to the same builder object and type.
         */
        public S withCodecPrivateData(final byte[] privateData) {
            mCodecPrivateData = privateData;
            return (S)this;
        }

        /**
         * Set the frame time scale.
         * @param timescale Input value.
         * @return Reference to the same builder object and type.
         */
        public S withFrameTimeScale(final long timescale) {
            mFrameTimescale = timescale;
            return (S)this;
        }

        /**
         * Set the GOP duration in millis.
         * @param gopDuration Input value.
         * @return Reference to the same builder object and type.
         */
        public S withGopDurationMillis(final int gopDuration) {
            mGopDurationMillis = gopDuration;
            return (S)this;
        }

        /**
         * Set the NAL adaptation flags.
         * @param nalAdaptationFlags Input value.
         * @return Reference to the same builder object and type.
         */
        public S withNalAdaptationFlags(final StreamInfo.NalAdaptationFlags nalAdaptationFlags) {
            mNalAdaptationFlags = nalAdaptationFlags;
            return (S)this;
        }

        /**
         * Set the flag for absolute time code.
         * @param isAbsoluteTimecode Input value.
         * @return Reference to the same builder object and type.
         */
        public S withIsAbsoluteTimecode(final boolean isAbsoluteTimecode) {
            mIsAbsoluteTimecode = isAbsoluteTimecode;
            return (S)this;
        }

        /**
         * Get the MIME type.
         * @return MIME type string.
         */
        public String getMimeType() {
            return mMimeType;
        }

        /**
         * Get the frame rate.
         * @return Frame rate integer.
         */
        public int getFrameRate() {
            return mFrameRate;
        }

        /**
         * Gets the retention period in hours.
         * @return Retention period as integer.
         */
        public int getmRetentionPeriodInHours() {
            return mRetentionPeriodInHours;
        }

        /**
         * Get the horizontal resolution.
         * @return Horizontal resolution as an integer.
         */
        public int getHorizontalResolution() {
            return mHorizontalResolution;
        }

        /**
         * Get the vertical resolution.
         * @return Vertical resolution as an integer.
         */
        public int getVerticalResolution() {
            return mVerticalResolution;
        }

        /**
         * Get the output file name.
         * @return Output file name string.
         */
        public String getOutputFileName() {
            return mOutputFileName;
        }

        /**
         * Get the encoding bit rate.
         * @return Encoding bit rate as integer.
         */
        public int getEncodingBitrate() {
            return mEncodingBitrate;
        }

        /**
         * Check if hardware acceleration is turned on.
         * @return True if hardware acceleration is turned on
         */
        public boolean isEncoderHardwareAccelerated() {
            return mIsEncoderHardwareAccelerated;
        }

        /**
         * Get GOP duration.
         * @return GOP duratio in millis as integer.
         */
        public int getGopDurationMillis() {
            return mGopDurationMillis;
        }

        /**
         * Get codec private data.
         * @return Codec private data.
         */
        public byte[] getCodecPrivateData() {
            return mCodecPrivateData;
        }

        /**
         * Get the frame time scale.
         * @return Frame time scale as a long value.
         */
        public long getFrameTimescale() {
            return mFrameTimescale;
        }

        /**
         * Get NAL adaptation flags.
         * @return NAL adaptation flags.
         */
        public StreamInfo.NalAdaptationFlags getNalAdaptationFlags() {
            return mNalAdaptationFlags;
        }

        /**
         * Abstract method to build the MediaSourceConfiguration using this builder.
         * @return Instance of MediaSourceConfiguration of the generic type.
         */
        public abstract T build();
    }

    /**
     * Constructor accepting a builder.
     * @param builder The builder from which the configuration is to be obtained.
     */
    public AbstractMediaSourceConfiguration(final Builder builder) {
        mBuilder = builder;
    }

    /**
     * Get the horizontal resolution.
     * @return Horizontal resolution as an integer.
     */
    public int getHorizontalResolution() {
        return mBuilder.mHorizontalResolution;
    }

    /**
     * Get the vertical resolution.
     * @return Vertical resolution as an integer.
     */
    public int getVerticalResolution() {
        return mBuilder.mVerticalResolution;
    }

    /**
     * Get the output file name.
     * @return Output file name string.
     */
    public String getOutputFileName() {
        return mBuilder.mOutputFileName;
    }

    /**
     * Get the frame rate.
     * @return Frame rate integer.
     */
    public int getFrameRate() {
        return mBuilder.mFrameRate;
    }

    /**
     * Gets the retention period in hours.
     * @return Retention period as integer.
     */
    public int getRetentionPeriodInHours() {
        return mBuilder.mRetentionPeriodInHours;
    }

    /**
     * Get the encoding bit rate.
     * @return Encoding bit rate as integer.
     */
    public int getBitRate() {
        return mBuilder.mEncodingBitrate;
    }

    /**
     * Get the MIME type.
     * @return MIME type string.
     */
    @NonNull
    public String getEncoderMimeType() {
        return mBuilder.mMimeType;
    }

    /**
     * Get GOP duration.
     * @return GOP duratio in millis as integer.
     */
    public int getGopDurationMillis() {
        return mBuilder.mGopDurationMillis;
    }

    /**
     * Check if hardware acceleration is turned on.
     * @return True if hardware acceleration is turned on
     */
    public boolean isEndcoderHardwareAccelerated() {
        return mBuilder.mIsEncoderHardwareAccelerated;
    }

    /**
     * Get codec private data.
     * @return Codec private data.
     */
    @Nullable
    public byte[] getCodecPrivateData() {
        return mBuilder.mCodecPrivateData;
    }

    /**
     * Get the frame time scale.
     * @return Frame time scale as a long value.
     */
    public long getTimeScale() {
        return mBuilder.mFrameTimescale;
    }

    /**
     * Get NAL adaptation flags.
     * @return NAL adaptation flags.
     */
    public StreamInfo.NalAdaptationFlags getNalAdaptationFlags() {
        return mBuilder.mNalAdaptationFlags;
    }

    /**
     * Get if timecode is absolute or not.
     * @return True of the timecode is absolute.
     */
    public boolean getIsAbsoluteTimecode() {
        return mBuilder.mIsAbsoluteTimecode;
    }
}
