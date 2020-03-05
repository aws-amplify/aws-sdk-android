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

package com.amazonaws.kinesisvideo.streaming;

import com.amazonaws.kinesisvideo.producer.KinesisVideoFragmentAck;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;

import android.support.annotation.NonNull;

public class DefaultStreamCallbacks implements StreamCallbacks {
    @Override
    public void streamUnderflowReport() throws ProducerException {
        // no-op
    }

    @Override
    public void streamLatencyPressure(final long duration) throws ProducerException {
        // no-op
    }

    @Override
    public void streamConnectionStale(final long lastAckDuration) throws ProducerException {
        // no-op
    }

    @Override
    public void fragmentAckReceived(final long uploadHandle, @NonNull final KinesisVideoFragmentAck fragmentAck) throws ProducerException {
        // no-op
    }

    @Override
    public void droppedFrameReport(final long frameTimecode) throws ProducerException {
        // no-op
    }

    @Override
    public void streamErrorReport(final long uploadHandle, final long frameTimecode, final long statusCode) throws ProducerException {
        // no-op
    }

    @Override
    public void droppedFragmentReport(final long fragmentTimecode) throws ProducerException {
        // no-op
    }

    @Override
    public void streamDataAvailable(final long uploadHandle, final long duration, final long availableSize)
            throws ProducerException {
        // no-op
    }

    @Override
    public void streamReady() throws ProducerException {
        // no-op
    }

    @Override
    public void streamClosed(final long uploadHandle) throws ProducerException {
        // no-op
    }

    @Override
    public void bufferDurationOverflowPressure(final long remainDuration) throws ProducerException {
        // no-op
    }
}
