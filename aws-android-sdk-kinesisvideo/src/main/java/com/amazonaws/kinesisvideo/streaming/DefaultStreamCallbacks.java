package com.amazonaws.kinesisvideo.streaming;

import com.amazonaws.kinesisvideo.producer.KinesisVideoFragmentAck;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;

import androidx.annotation.NonNull;

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
