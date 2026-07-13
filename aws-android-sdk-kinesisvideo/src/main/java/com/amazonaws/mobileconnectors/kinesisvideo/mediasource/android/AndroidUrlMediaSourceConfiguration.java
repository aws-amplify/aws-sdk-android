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

package com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android;

import android.os.Parcel;
import android.os.Parcelable;

import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.client.mediasource.AbstractMediaSourceConfiguration;

/**
 * This class represents a MediaSourceConfiguration for a MediaSource based on a video URL.
 * It can work with any valid URL both local and remote.
 */
public class AndroidUrlMediaSourceConfiguration extends AbstractMediaSourceConfiguration {

    /**
     * Description string for this media source configuration class.
     */
    private static final String MEDIA_SOURCE_DESCRIPTION = "Configuration for a url media source";

    /**
     * Unique type string for this media source configuration class.
     */
    public static final String MEDIA_SOURCE_TYPE = "UrlMediaSource";

    /**
     * Generic concrete builder for this configuration class. It's purpose is to provide type arguments
     * to the builder defined in AndroidUrlMediaSourceConfiguration. It uses recursive generics pattern
     * to be able to preserve the chaining capability of builders.
     * @param <T> MediaSource type.
     * @param <S> Builder type.
     */
    public static class Builder extends AbstractMediaSourceConfiguration.Builder<
            AndroidUrlMediaSourceConfiguration, AndroidUrlMediaSourceConfiguration.Builder> {

        private String  mUrl;

        /**
         * Set the video url.
         * @param url Input value.
         * @return Reference to the same builder object and type.
         */
        public Builder withUrl(final String url) {
            mUrl = url;
            return this;
        }

        /**
         * Get the video url.
         * @return Video url string.
         */
        public String getUrl() {
            return mUrl;
        }

        /**
         * Method to build the AndroidUrlMediaSourceConfiguration using this builder.
         * @return Instance of AndroidUrlMediaSourceConfiguration.
         */
        @Override
        public AndroidUrlMediaSourceConfiguration build() {
            return new AndroidUrlMediaSourceConfiguration(this);
        }
    }

    /**
     * Constructor accepting a builder.
     * @param builder The builder from which the configuration is to be obtained.
     */
    public AndroidUrlMediaSourceConfiguration(final Builder builder) {
        super(builder);
    }

    /**
     * Create a new builder for this configuration class.
     * @return New instace of AndroidUrlMediaSourceConfiguration.Builder.
     */
    public static AndroidUrlMediaSourceConfiguration.Builder builder() {
        return new AndroidUrlMediaSourceConfiguration.Builder();
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

    /**
     * Get the video url.
     * @return Video url string.
     */
    public String getUrl() {
        return ((Builder)mBuilder).mUrl;
    }
}
