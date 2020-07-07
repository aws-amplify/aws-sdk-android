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

package com.amazonaws.mobileconnectors.kinesisvideo.client;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import android.content.Context;
import androidx.annotation.NonNull;

import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.internal.client.NativeKinesisVideoClient;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSource;
import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.internal.producer.client.KinesisVideoServiceClient;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidMediaSourceFactory;
import com.amazonaws.mobileconnectors.kinesisvideo.util.CameraUtils;

/**
 * Implement KinesisVideo Client interface for Android.
 *
 * Main purpose of this class is to manage media sources and their configuration.
 *
 * Media source produces the stream of data which is uploaded into KinesisVideo using this and underlying
 * classes and producer SDK. Stream of data produced by the media source can be anything,
 * for example, video, sound, sensor data, logs, etc. KinesisVideo is agnostic to
 * the internal format of the data.
 *
 * This client wraps the calls to the back-end, managing the device and network configuration,
 * creating, registering, and controlling all streams at once
 */
public final class AndroidKinesisVideoClient extends NativeKinesisVideoClient {

    /**
     * Android context.
     */
    private final Context mContext;

    public AndroidKinesisVideoClient(
            @NonNull final Log log,
            @NonNull final Context context,
            @NonNull final KinesisVideoClientConfiguration configuration,
            @NonNull final KinesisVideoServiceClient serviceClient,
            @NonNull final ScheduledExecutorService executor) {
        super(log,
                configuration,
                serviceClient,
                executor);

        mContext = context;
    }

    @Override
    public MediaSource createMediaSource(final String streamName,
                                         final MediaSourceConfiguration mediaSourceConfiguration) throws KinesisVideoException {
        final MediaSource mediaSource = AndroidMediaSourceFactory.createMediaSource(
                streamName,
                mContext,
                mediaSourceConfiguration);
        registerMediaSource(mediaSource);
        return mediaSource;
    }

    @Override
    public List<MediaSourceConfiguration.Builder<? extends MediaSourceConfiguration>> listSupportedConfigurations() {
        return CameraUtils.getSupportedCameraConfigrations(mContext);
    }
}
