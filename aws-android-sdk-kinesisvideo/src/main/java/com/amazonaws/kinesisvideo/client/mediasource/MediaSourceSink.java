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

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

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
}
