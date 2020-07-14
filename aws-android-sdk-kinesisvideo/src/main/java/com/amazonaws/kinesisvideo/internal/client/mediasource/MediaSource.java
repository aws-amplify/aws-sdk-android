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

package com.amazonaws.kinesisvideo.internal.client.mediasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.amazonaws.kinesisvideo.client.mediasource.MediaSourceState;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

/**
 * Interface representing a media source.
 */
public interface MediaSource {
    /**
     * Returns the {@link MediaSourceState}
     */
    MediaSourceState getMediaSourceState();

    /**
     * Returns the {@link MediaSourceConfiguration} used to create this media source
     */
    MediaSourceConfiguration getConfiguration();

    /**
     * Returns the {@link StreamInfo} describing the stream this media source produces
     */
    StreamInfo getStreamInfo() throws KinesisVideoException;;

    /**
     * Initializes the media source with a {@link MediaSourceSink} object
     */
    void initialize(@NonNull MediaSourceSink mediaSourceSink) throws KinesisVideoException;

    /**
     * Configures the media source
     */
    void configure(MediaSourceConfiguration configuration);

    /**
     * Starts the media source
     */
    void start() throws KinesisVideoException;

    /**
     * Stops the media source
     */
    void stop() throws KinesisVideoException;

    /**
     * Returns true if media source is now stopped
     */
    boolean isStopped();

    /**
     * Releases resources
     */
    void free() throws KinesisVideoException;

    /**
     * Returns the {@link MediaSourceSink} object
     */
    MediaSourceSink getMediaSourceSink();

    /**
     * Returns a stream-specific {@link StreamCallbacks} implementation if any.
     */
    @Nullable
    StreamCallbacks getStreamCallbacks();
}
