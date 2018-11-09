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

package com.amazonaws.kinesisvideo.internal.mediasource;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.amazonaws.kinesisvideo.internal.client.mediasource.MediaSourceSink;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;

/**
 * Implementation of the MediaSourceSink interface that pushes frames and stream configuration
 * into an instance of KinesisVideoProducerStream.
 *
 * Primary purpose of this is to be used by the KinesisVideoClient implementation.
 *
 * For example, when an instance of media source is being created or registered with KinesisVideoClient,
 * an instance of this sink is created, and the media source is initialized with this.
 *
 * It's then media source's job to produce the frames and push them into the sink
 * it has been initialized with
 */
public class ProducerStreamSink implements MediaSourceSink {
    private final KinesisVideoProducerStream producerStream;

    public ProducerStreamSink(final KinesisVideoProducerStream producerStream) {
        this.producerStream = producerStream;
    }

    @Override
    public void onFrame(@NonNull final KinesisVideoFrame kinesisVideoFrame) throws KinesisVideoException {
        checkNotNull(kinesisVideoFrame);
        producerStream.putFrame(kinesisVideoFrame);
    }

    @Override
    public void onCodecPrivateData(@Nullable final byte[] bytes) throws KinesisVideoException {
        producerStream.streamFormatChanged(bytes);
    }

    @Override
    public void onFragmentMetadata(final String metadataName, final String metadataValue, final boolean persistent)
            throws KinesisVideoException {
        producerStream.putFragmentMetadata(metadataName, metadataValue, persistent);
    }

    @Override
    public KinesisVideoProducerStream getProducerStream() {
        return producerStream;
    }
}
