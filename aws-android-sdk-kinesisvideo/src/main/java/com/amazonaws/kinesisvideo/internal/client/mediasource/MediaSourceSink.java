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

package com.amazonaws.kinesisvideo.internal.client.mediasource;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Acts as a media source sink
 *
 *
 */
public interface MediaSourceSink {
    /**
     * Offers a frame from the source.
     */
    void onFrame(final @NonNull KinesisVideoFrame kinesisVideoFrame) throws KinesisVideoException;

    void onCodecPrivateData(final @Nullable byte[] codecPrivateData) throws KinesisVideoException;

    void onCodecPrivateData(final @Nullable byte[] codecPrivateData, final int trackId) throws KinesisVideoException;

    void onFragmentMetadata(final @NonNull String metadataName, final @NonNull String metadataValue, final boolean persistent)
            throws KinesisVideoException;

    KinesisVideoProducerStream getProducerStream();
}
