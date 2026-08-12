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
 * CameraMediaSourceConfiguration defines configuration properties for camera media sources.
 */
public class CameraMediaSourceConfiguration extends AbstractMediaSourceConfiguration {

    /**
     * Description string for this media source configuration class.
     */
    private static final String MEDIA_SOURCE_DESCRIPTION = "Configuration for a camera media source";

    /**
     * Unique type string for this media source configuration class.
     */
    public static final String MEDIA_SOURCE_TYPE = "AbstractCameraMediaSource";

    /**
     * Generic concrete builder for this configuration class.
     * It uses recursive generics pattern to be able to preserve the chaining capability of builders.
     * @param <T> MediaSource type.
     * @param <S> Builder type.
     */
    public static class Builder<T extends CameraMediaSourceConfiguration,
            S extends CameraMediaSourceConfiguration.Builder<T, S>> extends AbstractMediaSourceConfiguration.Builder<T, S> {

        private String mCameraId;
        private int mCameraFacing;
        private int mCameraOrientation;

        /**
         * Set the camera ID.
         * @param mimeType Input value.
         * @return Reference to the same builder object and type.
         */
        public S withCameraId(final String cameraId) {
            mCameraId = cameraId;
            return (S)this;
        }

        /**
         * Set the camera facing.
         * @param facing Input value.
         * @return Reference to the same builder object and type.
         */
        public S withCameraFacing(final int facing) {
            mCameraFacing = facing;
            return (S)this;
        }


        /**
         * Set the camera orientation.
         * @param orientation Input value.
         * @return Reference to the same builder object and type.
         */
        public S withCameraOrientation(final int orientation) {
            mCameraOrientation = orientation;
            return (S)this;
        }

        /**
         * Get the camera ID.
         * @return Camera ID string.
         */
        public String getCameraId() {
            return mCameraId;
        }

        /**
         * Get the camera facing.
         * @return Camera facing as an integer value.
         */
        public int getCameraFacing() {
            return mCameraFacing;
        }

        /**
         * Get the camera orientation.
         * @return Camera orientation as an integer value.
         */
        public int getCameraOrientation() {
            return mCameraOrientation;
        }

        /**
         * Method to build the CameraMediaSourceConfiguration using this builder.
         * @return Instance of CameraMediaSourceConfiguration.
         */
        @Override
        public T build() {
            return (T)new CameraMediaSourceConfiguration(this);
        }
    }

    /**
     * Constructor accepting a builder.
     * @param builder The builder from which the configuration is to be obtained.
     */
    public CameraMediaSourceConfiguration(final Builder builder) {
        super(builder);
    }

    /**
     * Create a new builder for this configuration class.
     * @return New instace of CameraMediaSourceConfiguration.Builder.
     */
    public static CameraMediaSourceConfiguration.Builder<?,?> builder() {
        return new CameraMediaSourceConfiguration.Builder<>();
    }

    /**
     * Get the camera ID.
     * @return Camera ID string.
     */
    public String getCameraId() {
        return ((Builder)mBuilder).mCameraId;
    }

    /**
     * Get the camera facing.
     * @return Camera facing as an integer value.
     */
    public int getCameraFacing() {
        return ((Builder)mBuilder).mCameraFacing;
    }

    /**
     * Get the camera orientation.
     * @return Camera orientation as an integer value.
     */
    public int getCameraOrientation() {
        return ((Builder)mBuilder).mCameraOrientation;
    }

    /**
     * Get the media source type string.
     * @return Media source type string.
     */
    @Override
    public String getMediaSourceType() {
        return MEDIA_SOURCE_TYPE;
    }

    /**
     * Get the media source description.
     * @return Media source description.
     */
    @Override
    public String getMediaSourceDescription() {
        return MEDIA_SOURCE_DESCRIPTION;
    }
}
