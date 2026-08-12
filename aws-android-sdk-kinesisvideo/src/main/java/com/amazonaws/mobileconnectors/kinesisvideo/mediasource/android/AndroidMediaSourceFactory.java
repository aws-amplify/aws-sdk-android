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

import android.content.Context;

import com.amazonaws.kinesisvideo.client.mediasource.CameraMediaSourceConfiguration;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.client.mediasource.UnknownMediaSourceException;

/**
 * Factory class for media sources.
 */
public final class AndroidMediaSourceFactory {

    /**
     * Creates a new media source object based on the confirguration provided. Currently supports
     * AndroidCameraMediaSource and AndroidUrlMediaSource only.
     * @param streamName Name of the KVS stream.
     * @param context Android context object.
     * @param configuration Media source configuration to be used.
     * @return A new MediaSource object.
     */
    public static MediaSource createMediaSource(
            final String streamName,
            final Context context,
            final MediaSourceConfiguration configuration) {

        // Check the type of media source and invoke the corresponding helper methods.
        if (CameraMediaSourceConfiguration.MEDIA_SOURCE_TYPE.equals(configuration.getMediaSourceType())) {
            return createAndroidCameraMediaSource(streamName, context, (CameraMediaSourceConfiguration) configuration);

        } if (AndroidUrlMediaSourceConfiguration.MEDIA_SOURCE_TYPE.equals(configuration.getMediaSourceType())) {
            return createAndroidUrlMediaSource(streamName, (AndroidUrlMediaSourceConfiguration) configuration);

        } else {
            throw new UnknownMediaSourceException(configuration.getMediaSourceType());
        }
    }

    /**
     * Helper method to create an instance of AndroidCameraMediaSource based on the confirguration provided.
     * @param streamName Name of the KVS stream.
     * @param context Android context object.
     * @param configuration Media source configuration to be used.
     * @return An instance of AndroidCameraMediaSource.
     */
    private static AndroidCameraMediaSource createAndroidCameraMediaSource(
            final String streamName,
            final Context context,
            final CameraMediaSourceConfiguration configuration) {

        final AndroidCameraMediaSource mediaSource = new AndroidCameraMediaSource(streamName, context);
        mediaSource.configure(configuration);
        return mediaSource;
    }

    /**
     * Helper method to create an instance of AndroidUrlMediaSource based on the confirguration provided.
     * @param streamName Name of the KVS stream.
     * @param configuration Media source configuration to be used.
     * @return An instance of AndroidUrlMediaSource.
     */
    private static AndroidUrlMediaSource createAndroidUrlMediaSource(
            final String streamName,
            final AndroidUrlMediaSourceConfiguration configuration) {

        final AndroidUrlMediaSource mediaSource = new AndroidUrlMediaSource(streamName);
        mediaSource.configure(configuration);
        return mediaSource;
    }

    /**
     * Private constructor to prevent instantiation of this class.
     */
    private AndroidMediaSourceFactory() {
        // no-op
    }
}
