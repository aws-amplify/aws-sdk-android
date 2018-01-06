/**
 * Copyright 2017-2017 Amazon.com,
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

package com.amazonaws.kinesisvideo.producer.jni;

import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.producer.*;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Implementation of {@link KinesisVideoProducerStream}
 *
 *
 */
public class NativeKinesisVideoProducerStream implements KinesisVideoProducerStream
{
    private class NativeDataInputStream extends InputStream {
        /**
         * The MSB bit indicating the end of the stream
         */
        private static final int END_OF_STREAM_INDICATOR = 0x80000000;

        /**
         * Whether the stream has been closed
         */
        private volatile boolean mStreamClosed = false;

        @Override
        public int read() throws IOException
        {
            throw new IOException("Can't call byte-by-byte");
        }

        @Override
        public int read(byte[] b,
                int off,
                int len)
                throws IOException {
            if (mStreamClosed) {
                mLog.warn("Stream %s has been closed", mStreamInfo.getName());
            }

            // Read from the KinesisVideo Producer
            // NOTE: This implementation is a blocking call and the blocking
            // is handled by simply spin-locking until the data is available.
            int bytesRead = -1;

            while (!mStreamClosed) {
                synchronized (mMonitor) {
                    while (!mDataAvailable) {
                        try {
                            mMonitor.wait();
                        } catch (final InterruptedException e) {
                            mLog.exception(e, "Waiting for the data availability threw an interrupted exception. Continuing...");
                        }
                    }

                    // Clear the availability indicator for now
                    mDataAvailable = false;
                }

                try {
                    bytesRead = mKinesisVideoProducerJni.getStreamData(mStreamHandle, b, off, len);

                    if ((bytesRead & END_OF_STREAM_INDICATOR) == END_OF_STREAM_INDICATOR) {
                        mLog.info("Received end-of-stream indicator for %s", mStreamInfo.getName());
                        // Clear the indicator bit
                        bytesRead &= ~END_OF_STREAM_INDICATOR;

                        // Set the flag so the stream is not valid any longer
                        mStreamClosed = true;

                        if (0 == bytesRead) {
                            // Indicate the EOS
                            bytesRead = -1;
                        }
                    }

                    synchronized (mMonitor) {
                        if (bytesRead != 0) {
                            // Got some bytes - break from the loop.
                            // Make sure we don't await again if we still have some data
                            if (bytesRead != -1 && mAvailableDataSize - bytesRead > 0) {
                                mDataAvailable = true;
                            }
                            break;
                        }
                    }
                } catch (final ProducerException e) {
                    mLog.exception(e, "Reader threw an exception");
                    throw new IOException(e);
                }
            }

            mLog.debug("Streamed %d bytes for stream %s", bytesRead, mStreamInfo.getName());

            if (-1 == bytesRead) {
                mLog.debug("Closing stream %s", mStreamInfo.getName());
            }

            return bytesRead;
        }

        @Override
        public int read(byte[] b)
                throws IOException
        {
            return read(b, 0, b.length);
        }

        @Override
        public void close()
            throws IOException
        {
            // Set the stream to stopped state
            mStreamClosed = true;

            // Notify the awaiting thread
            notifyReaderThread(0, 0);
        }
    }

    private final NativeKinesisVideoProducerJni mKinesisVideoProducerJni;
    private final long mStreamHandle;
    private final StreamInfo mStreamInfo;
    private final StreamCallbacks mStreamCallbacks;
    private final CountDownLatch mReadyLatch;
    private final CountDownLatch mStoppedLatch;
    private final Log mLog;
    private final KinesisVideoStreamMetrics mStreamMetrics;
    private final Object mMonitor;
    private boolean mDataAvailable;
    private long mAvailableDataSize;

    public NativeKinesisVideoProducerStream(final @NonNull NativeKinesisVideoProducerJni kinesisVideoProducerJni,
                                            final @NonNull StreamInfo streamInfo,
                                            long streamHandle,
                                            final @NonNull Log log,
                                            final @Nullable StreamCallbacks streamCallbacks) {
        mKinesisVideoProducerJni = Preconditions.checkNotNull(kinesisVideoProducerJni);
        mStreamInfo = Preconditions.checkNotNull(streamInfo);
        Preconditions.checkState(streamHandle != NativeKinesisVideoProducerJni.INVALID_STREAM_HANDLE_VALUE);
        mStreamHandle = streamHandle;
        mStreamCallbacks = streamCallbacks;
        mReadyLatch = new CountDownLatch(1);
        mStoppedLatch = new CountDownLatch(1);
        mLog = Preconditions.checkNotNull(log);
        mStreamMetrics = new KinesisVideoStreamMetrics();
        mMonitor = new Object();

        // Set the notification values
        mDataAvailable = false;
        mAvailableDataSize = 0;
    }

    @Override
    public InputStream getDataStream() throws ProducerException {
        return new NativeDataInputStream();
    }

    @Override
    public int getStreamData(@NonNull byte[] fillBuffer, int offset, int length) throws ProducerException {
        return mKinesisVideoProducerJni.getStreamData(mStreamHandle, fillBuffer, offset, length);
    }

    @Override
    public void putFrame(@NonNull KinesisVideoFrame kinesisVideoFrame) throws ProducerException {
        Preconditions.checkNotNull(kinesisVideoFrame);

        mLog.debug("PutFrame index: %s, pts: %s, dts: %s, duration: %s, keyFrame: %s, flags: %s",
                kinesisVideoFrame.getIndex(),
                kinesisVideoFrame.getPresentationTs(),
                kinesisVideoFrame.getDecodingTs(),
                kinesisVideoFrame.getDuration(),
                FrameFlags.isKeyFrame(kinesisVideoFrame.getFlags()),
                kinesisVideoFrame.getFlags());

        // Print out metrics on every key-frame
        if (FrameFlags.isKeyFrame(kinesisVideoFrame.getFlags())) {
            final KinesisVideoMetrics kinesisVideoMetrics = mKinesisVideoProducerJni.getMetrics();
            final KinesisVideoStreamMetrics streamMetrics = getMetrics();
            mLog.debug("Kinesis Video client and stream metrics"
                            + "\n\t>> Overall storage size: %s"
                            + "\n\t>> Available storage size: %s"
                            + "\n\t>> Allocated storage size: %s"
                            + "\n\t>> Total view allocation size: %s"
                            + "\n\t>> Total streams frame rate: %s"
                            + "\n\t>> Total streams transfer rate: %s"
                            + "\n\t>> Current view duration: %s"
                            + "\n\t>> Overall view duration: %s"
                            + "\n\t>> Current view size: %s"
                            + "\n\t>> Overall view size: %s"
                            + "\n\t>> Current frame rate: %s"
                            + "\n\t>> Current transfer rate: %s",
                    kinesisVideoMetrics.getContentStoreSize(),
                    kinesisVideoMetrics.getContentStoreAvailableSize(),
                    kinesisVideoMetrics.getContentStoreAllocatedSize(),
                    kinesisVideoMetrics.getTotalContentViewSize(),
                    kinesisVideoMetrics.getTotalFrameRate(),
                    kinesisVideoMetrics.getTotalTransferRate(),
                    streamMetrics.getCurrentViewDurationInTimeUnits(),
                    streamMetrics.getOverallViewDurationInTimeUnits(),
                    streamMetrics.getCurrentViewSize(),
                    streamMetrics.getOverallViewSize(),
                    streamMetrics.getCurrentFrameRate(),
                    streamMetrics.getCurrentTransferRate());
        }

        mKinesisVideoProducerJni.putFrame(mStreamHandle, kinesisVideoFrame);
    }

    @Override
    public void fragmentAck(final @NonNull KinesisVideoFragmentAck kinesisVideoFragmentAck) throws ProducerException {
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        mKinesisVideoProducerJni.fragmentAck(mStreamHandle, kinesisVideoFragmentAck);
    }

    @Override
    public void parseFragmentAck(final @NonNull String kinesisVideoFragmentAck) throws ProducerException {
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        mKinesisVideoProducerJni.parseFragmentAck(mStreamHandle, kinesisVideoFragmentAck);
    }

    @Override
    public void streamFormatChanged(final @Nullable byte[] codecPrivateData) throws ProducerException {
        mKinesisVideoProducerJni.streamFormatChanged(mStreamHandle, codecPrivateData);
    }

    @Override
    public void streamTerminated(int statusCode) throws ProducerException {
        mKinesisVideoProducerJni.streamTerminated(mStreamHandle, statusCode);
    }

    @Override
    public void stopStream() throws ProducerException {
        // Stop the underlying native stream
        mKinesisVideoProducerJni.stopStream(mStreamHandle);

        // Await for the data to finish.
        try {
            awaitStopped();
        } catch (final ProducerException e) {
            mLog.exception(e, "Stopping stream threw an exception. Force stopping the input stream.");
        }
    }

    @NonNull
    @Override
    public KinesisVideoStreamMetrics getMetrics() throws ProducerException {
        mKinesisVideoProducerJni.getStreamMetrics(mStreamHandle, mStreamMetrics);
        return mStreamMetrics;
    }

    @Override
    public String getStreamName() {
        return mStreamInfo.getName();
    }

    @Override
    public long getStreamHandle() {
        return mStreamHandle;
    }

    @Override
    public void streamUnderflowReport() throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamUnderflowReport();
        }
    }

    @Override
    public void streamLatencyPressure(long duration) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamLatencyPressure(duration);
        }
    }

    @Override
    public void streamConnectionStale(long lastAckDuration) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamConnectionStale(lastAckDuration);
        }
    }

    @Override
    public void droppedFrameReport(long frameTimecode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.droppedFrameReport(frameTimecode);
        }
    }

    @Override
    public void droppedFragmentReport(long fragmentTimecode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.droppedFragmentReport(fragmentTimecode);
        }
    }

    @Override
    public void streamErrorReport(long fragmentTimecode, long statusCode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamErrorReport(fragmentTimecode, statusCode);
        }
    }

    @Override
    public void streamDataAvailable(long duration, long availableSize) throws ProducerException
    {
        // Unblock the reader thread
        notifyReaderThread(duration, availableSize);

        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamDataAvailable(duration, availableSize);
        }
    }

    @Override
    public void streamReady() throws ProducerException
    {
        mLog.debug("Stream %s is ready", mStreamInfo.getName());
        // Release the ready latch
        mReadyLatch.countDown();

        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamReady();
        }
    }

    @Override
    public void streamClosed() throws ProducerException
    {
        mLog.debug("Stream %s is closed", mStreamInfo.getName());
        // Release the stopped latch
        mStoppedLatch.countDown();

        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamClosed();
        }
    }

    private void notifyReaderThread(long duration, long availableSize) {
        // Unblock the awaiting reading code block
        synchronized (mMonitor) {
            mAvailableDataSize = availableSize;
            mDataAvailable = true;

            mLog.debug("Data availability notification. Size: %d, Duration %d", availableSize, duration);

            mMonitor.notify();
        }
    }

    public void awaitReady() throws ProducerException
    {
        // Block until client is ready or it times out.
        try {
            if (!mReadyLatch.await(READY_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
                throw new ProducerException("KinesisVideo producer stream creation time out", ProducerException.STATUS_OPERATION_TIMED_OUT);
            }
        } catch (final InterruptedException e) {
            throw new ProducerException(e);
        }
    }

    public void awaitStopped() throws ProducerException
    {
        // Block until client is stopped or it times out.
        try {
            if (!mStoppedLatch.await(STOPPED_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
                throw new ProducerException("KinesisVideo producer stream stopping time out", ProducerException.STATUS_OPERATION_TIMED_OUT);
            }
        } catch (final InterruptedException e) {
            throw new ProducerException(e);
        }
    }
}
