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

package com.amazonaws.kinesisvideo.internal.mediasource;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;

import java.nio.ByteBuffer;

public interface OnStreamDataAvailable {
    void onFrameDataAvailable(final ByteBuffer frame) throws KinesisVideoException;
    void onFrameDataAvailable(final KinesisVideoFrame frame) throws KinesisVideoException;
    void onFragmentMetadataAvailable(final String metadataName, final String metadataValue,
                                     final boolean persistent) throws KinesisVideoException;
    void onCodecPrivateData(final byte[] codecPrivateData, int trackId) throws KinesisVideoException;
}
