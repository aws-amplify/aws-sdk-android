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

//import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * CameraMediaSourceConfiguration defines common configuration properties for camera media source
 */
//@SuppressFBWarnings({"EI_EXPOSE_REP", "URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
public class CameraMediaSourceConfiguration implements MediaSourceConfiguration {

    private static final String MEDIA_SOURCE_DESCRIPTION = "Configuration for a camera media source";
    public static final String MEDIA_SOURCE_TYPE = "AbstractCameraMediaSource";

    public static class Builder implements MediaSourceConfiguration.Builder<CameraMediaSourceConfiguration> {

        private String  mMimeType;
        private int mFrameRate;
        private int mHorizontalResolution;
        private int mVerticalResolution;
        private String mOutputFileName;
        private String mCameraId;
        private int mCameraFacing;
        private int mCameraOrientation;
        private int mEncodingBitrate;
        private boolean mIsEncoderHardwareAccelerated;
        private int mGopDurationMillis;
        private byte[] mCodecPrivateData;
        private long mFrameTimescale;
        private StreamInfo.NalAdaptationFlags mNalAdaptationFlags;
        private boolean mIsAbsoluteTimecode;
        private int mRetentionPeriodInHours;

        public Builder withEncodingMimeType(final String mimeType) {
            mMimeType = mimeType;
            return this;
        }

        public Builder withRetentionPeriodInHours(final int retentionPeriodInHours) {
            mRetentionPeriodInHours = retentionPeriodInHours;
            return this;
        }

        public Builder withFrameRate(final int frameRate) {
            mFrameRate = frameRate;
            return this;
        }

        public Builder withFileOutput(final String outputFileName) {
            mOutputFileName = outputFileName;
            return this;
        }

        public Builder withCameraId(final String cameraId) {
            mCameraId = cameraId;
            return this;
        }

        public Builder withHorizontalResolution(final int horizontalResolution) {
            mHorizontalResolution = horizontalResolution;
            return this;
        }

        public Builder withVerticalResolution(final int verticalResolution) {
            mVerticalResolution = verticalResolution;
            return this;
        }

        public Builder withCameraFacing(final int facing) {
            mCameraFacing = facing;
            return this;
        }

        public Builder withCameraOrientation(final int orientation) {
            mCameraOrientation = orientation;
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

        public Builder withGopDurationMillis(final int gopDuration) {
            mGopDurationMillis = gopDuration;
            return this;
        }

        public Builder withNalAdaptationFlags(final StreamInfo.NalAdaptationFlags nalAdaptationFlags) {
            mNalAdaptationFlags = nalAdaptationFlags;
            return this;
        }

        public Builder withIsAbsoluteTimecode(final boolean isAbsoluteTimecode) {
            mIsAbsoluteTimecode = isAbsoluteTimecode;
            return this;
        }

        public String getMimeType() {
            return mMimeType;
        }

        public int getFrameRate() {
            return mFrameRate;
        }

        public int getmRetentionPeriodInHours() {
            return mRetentionPeriodInHours;
        }

        public int getHorizontalResolution() {
            return mHorizontalResolution;
        }

        public int getVerticalResolution() {
            return mVerticalResolution;
        }

        public String getOutputFileName() {
            return mOutputFileName;
        }

        public String getCameraId() {
            return mCameraId;
        }

        public int getCameraFacing() {
            return mCameraFacing;
        }

        public int getCameraOrientation() {
            return mCameraOrientation;
        }

        public int getEncodingBitrate() {
            return mEncodingBitrate;
        }

        public boolean isEncoderHardwareAccelerated() {
            return mIsEncoderHardwareAccelerated;
        }

        public int getGopDurationMillis() {
            return mGopDurationMillis;
        }

        public byte[] getCodecPrivateData() {
            return mCodecPrivateData;
        }

        public long getFrameTimescale() {
            return mFrameTimescale;
        }

        public StreamInfo.NalAdaptationFlags getNalAdaptationFlags() {
            return mNalAdaptationFlags;
        }

        @Override
        public CameraMediaSourceConfiguration build() {
            return new CameraMediaSourceConfiguration(this);
        }
    }

    private final Builder mBuilder;

    public CameraMediaSourceConfiguration(final Builder builder) {
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

    public static CameraMediaSourceConfiguration.Builder builder() {
        return new CameraMediaSourceConfiguration.Builder();
    }

    /**
     * Returns the ID of the camera
     */
    public String getCameraId() {
        return mBuilder.mCameraId;
    }

    /**
     * Gets the camera facing front or back.
     */
    public int getCameraFacing() {
        return mBuilder.mCameraFacing;
    }

    /**
     * Gets the orientation of the camera in degrees.
     */
    public int getCameraOrientation() {
        return mBuilder.mCameraOrientation;
    }

    /**
     * Gets the horizontal resolution.
     */
    public int getHorizontalResolution() {
        return mBuilder.mHorizontalResolution;
    }

    /**
     * Gets the vertical resolution.
     */
    public int getVerticalResolution() {
        return mBuilder.mVerticalResolution;
    }

    /**
     * Gets the output file name.
     */
    public String getOutputFileName() {
        return mBuilder.mOutputFileName;
    }

    /**
     * Gets the frame rate of the camera.
     */
    public int getFrameRate() {
        return mBuilder.mFrameRate;
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
     * Gets the GOP (group-of-pictures) duration in milliseconds.
     */
    public int getGopDurationMillis() {
        return mBuilder.mGopDurationMillis;
    }

    /**
     * Whether the encoder is hardware accelerated.
     */
    public boolean isEndcoderHardwareAccelerated() {
        return mBuilder.mIsEncoderHardwareAccelerated;
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
     * Get the Nal Adaption Flag
     */
    public StreamInfo.NalAdaptationFlags getNalAdaptationFlags() {
        return mBuilder.mNalAdaptationFlags;
    }

    /**
     * Get if timecode is absolute or not
     * @return
     */
    public boolean getIsAbsoluteTimecode() {
        return mBuilder.mIsAbsoluteTimecode;
    }
}
