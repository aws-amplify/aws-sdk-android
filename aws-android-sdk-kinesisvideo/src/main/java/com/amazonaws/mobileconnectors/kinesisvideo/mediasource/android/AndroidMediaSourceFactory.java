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

public final class AndroidMediaSourceFactory {

    public static MediaSource createMediaSource(
            final String streamName,
            final Context context,
            final MediaSourceConfiguration configuration) {

        if (CameraMediaSourceConfiguration.MEDIA_SOURCE_TYPE
            .equals(configuration.getMediaSourceType())) {
            return createAndroidCameraMediaSource(streamName, context, (CameraMediaSourceConfiguration) configuration);
        } else {
            throw new UnknownMediaSourceException(configuration.getMediaSourceType());
        }
    }

    private static AndroidCameraMediaSource createAndroidCameraMediaSource(
            final String streamName,
            final Context context,
            final CameraMediaSourceConfiguration configuration) {

        final AndroidCameraMediaSource mediaSource = new AndroidCameraMediaSource(streamName, context);
        mediaSource.configure(configuration);
        return mediaSource;
    }

    private AndroidMediaSourceFactory() {
        // no-op
    }
}
