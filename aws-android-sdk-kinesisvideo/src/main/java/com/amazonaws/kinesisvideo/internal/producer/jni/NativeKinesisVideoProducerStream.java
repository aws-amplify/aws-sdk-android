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

package com.amazonaws.kinesisvideo.internal.producer.jni;

import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.producer.FrameFlags;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFragmentAck;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoMetrics;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoStreamMetrics;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.internal.producer.ReadResult;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
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
         * Whether the stream has been closed
         */
        private volatile boolean mStreamClosed = false;

        // Set the notification values
        private final Object mMonitor = new Object();
        private boolean mDataAvailable = false;
        private long mAvailableDataSize = 0;
        private final ReadResult mReadResult;
        final long mUploadHandle;

        public NativeDataInputStream(final long uploadHandle) {
            mUploadHandle = uploadHandle;
            mReadResult = new ReadResult();
        }

        @Override
        public int read() throws IOException
        {
            throw new IOException("Can't call byte-by-byte");
        }

        @Override
        public int read(final byte[] b,
                final int off,
                final int len)
                throws IOException {
            if (mStreamClosed) {
                mLog.warn("Stream %s with uploadHandle %d has been closed", mStreamInfo.getName(), mUploadHandle);
            }

            // Read from the KinesisVideo Producer
            // NOTE: This implementation is a blocking call and the blocking
            // is handled by simply spin-locking until the data is available.
            int bytesRead = -1;

            while (!mStreamClosed) {
                synchronized (mMonitor) {
                    while (!mDataAvailable) {
                        try {
                            mLog.debug("no data for stream %s with uploadHandle %d, waiting", mStreamInfo.getName(),
                                    mUploadHandle);
                            mMonitor.wait();
                        } catch (final InterruptedException e) {
                            mLog.exception(e, "Waiting for the data availability with uploadHandle %d"
                                    + "threw an interrupted exception. Continuing...", mUploadHandle);
                        }
                    }

                    // Clear the availability indicator for now
                    mDataAvailable = false;
                    if (mStreamClosed) {
                        // Indicate the EOS
                        bytesRead = -1;
                        mLog.debug("Being notified to close stream %s with uploadHandle %d",
                                mStreamInfo.getName(), mUploadHandle);
                        return bytesRead;
                    }
                }

                try {
                    mKinesisVideoProducerJni.getStreamData(mStreamHandle, b, off, len, mReadResult);
                    bytesRead = mReadResult.getReadBytes();
                    mLog.debug("getStreamData fill %d bytes for stream %s with uploadHandle %d", bytesRead,
                            mStreamInfo.getName(),
                            mUploadHandle);

                    if (mReadResult.isEndOfStream()) {
                        if (mReadResult.getUploadHandle() == mUploadHandle) {
                            // EOS for current session
                            mLog.info("Received end-of-stream indicator for %s, uploadHandle %d",
                                    mStreamInfo.getName(), mUploadHandle);

                            // Set the flag so the stream is not valid any longer
                            mStreamClosed = true;

                            if (0 == bytesRead) {
                                // Indicate the EOS
                                bytesRead = -1;
                            }
                        } else {
                            mLog.debug("Found end of stream for stream %s on uploadHandle %d for previous uploadHandle %d",
                                    mStreamInfo.getName(), mUploadHandle, mReadResult.getUploadHandle());
                            notifyEndOfStream(mReadResult.getUploadHandle());
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

            mLog.debug("Streamed %d bytes for stream %s with uploadHandle %d", bytesRead, mStreamInfo.getName(),
                    mUploadHandle);

            if (-1 == bytesRead) {
                mLog.debug("Closing stream %s with uploadHandle %d", mStreamInfo.getName(), mUploadHandle);
            }

            return bytesRead;
        }

        @Override
        public int read(final byte[] b)
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

        protected void notifyReaderThread(final long duration, final long availableSize) {
            // Unblock the awaiting reading code block
            synchronized (mMonitor) {
                mAvailableDataSize = availableSize;
                mLog.debug("Data availability notification. Upload handle: %d, Size: %d, Duration %d ",
                        mUploadHandle, availableSize, duration);

                mDataAvailable = true;

                mMonitor.notify();
            }
        }

        protected void endOfReaderThread() {
            // Unblock the awaiting reading code block
            synchronized (mMonitor) {
                mDataAvailable = true;
                mStreamClosed = true;
                mMonitor.notify();
            }
        }
    }

    private static final int SERVICE_CALL_RESULT_OK = 200;
    private final NativeKinesisVideoProducerJni mKinesisVideoProducerJni;
    private final long mStreamHandle;
    private final StreamInfo mStreamInfo;
    private final StreamCallbacks mStreamCallbacks;
    private final CountDownLatch mReadyLatch;
    private final CountDownLatch mStoppedLatch;
    private final Log mLog;
    private final KinesisVideoStreamMetrics mStreamMetrics;
    private final Map<Long, NativeDataInputStream> mInputStreamMap;

    public NativeKinesisVideoProducerStream(final @NonNull NativeKinesisVideoProducerJni kinesisVideoProducerJni,
                                            final @NonNull StreamInfo streamInfo,
                                            final long streamHandle,
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
        mInputStreamMap = new HashMap<Long, NativeDataInputStream>();
    }

    @Override
    public InputStream getDataStream(final long uploadHandle) throws ProducerException {
        final NativeDataInputStream inputStream = new NativeDataInputStream(uploadHandle);
        mInputStreamMap.put(uploadHandle, inputStream);
        return inputStream;
    }

    @Override
    public void getStreamData(@NonNull final byte[] fillBuffer,
                              final int offset,
                              final int length,
                              @NonNull final ReadResult readResult) throws ProducerException {
        mKinesisVideoProducerJni.getStreamData(mStreamHandle, fillBuffer, offset, length, readResult);
    }

    @Override
    public void putFrame(@NonNull final KinesisVideoFrame kinesisVideoFrame) throws ProducerException {
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
    public void putFragmentMetadata(@NonNull final String metadataName, @NonNull final String metadataValue, boolean persistent)
            throws ProducerException {
        Preconditions.checkNotNull(metadataName);
        Preconditions.checkNotNull(metadataValue);

        mKinesisVideoProducerJni.putFragmentMetadata(mStreamHandle, metadataName, metadataValue, persistent);
    }


    @Override
    public void fragmentAck(final long uploadHandle, final @NonNull KinesisVideoFragmentAck kinesisVideoFragmentAck) throws ProducerException {
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        mKinesisVideoProducerJni.fragmentAck(mStreamHandle, uploadHandle, kinesisVideoFragmentAck);
    }

    @Override
    public void parseFragmentAck(final long uploadHandle, final @NonNull String kinesisVideoFragmentAck) throws ProducerException {
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        mKinesisVideoProducerJni.parseFragmentAck(mStreamHandle, uploadHandle, kinesisVideoFragmentAck);
    }

    @Override
    public void streamFormatChanged(final @Nullable byte[] codecPrivateData) throws ProducerException {
        mKinesisVideoProducerJni.streamFormatChanged(mStreamHandle, codecPrivateData);
    }

    @Override
    public void streamTerminated(final long uploadHandle, final int statusCode) throws ProducerException {
        mKinesisVideoProducerJni.streamTerminated(mStreamHandle, uploadHandle, statusCode);
    }

    @Override
    public void stopStream() throws ProducerException {
        // Stop the underlying native stream
        mKinesisVideoProducerJni.stopStream(mStreamHandle);
    }

    @Override
    public void stopStreamSync() throws ProducerException {
        // Kick off stream stop
        stopStream();

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
    public void streamLatencyPressure(final long duration) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamLatencyPressure(duration);
        }
    }

    @Override
    public void streamConnectionStale(final long lastAckDuration) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamConnectionStale(lastAckDuration);
        }
    }

    @Override
    public void fragmentAckReceived(@NonNull final KinesisVideoFragmentAck fragmentAck) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.fragmentAckReceived(fragmentAck);
        }
    }

    @Override
    public void droppedFrameReport(final long frameTimecode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.droppedFrameReport(frameTimecode);
        }
    }

    @Override
    public void droppedFragmentReport(final long fragmentTimecode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.droppedFragmentReport(fragmentTimecode);
        }
    }

    @Override
    public void streamErrorReport(final long fragmentTimecode, final long statusCode) throws ProducerException
    {
        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamErrorReport(fragmentTimecode, statusCode);
        }
    }

    @Override
    public void streamDataAvailable(final long uploadHandle, final long duration, final long availableSize) throws ProducerException
    {
        // Unblock the reader thread
        final NativeDataInputStream inputStreamToNotify = mInputStreamMap.get(uploadHandle);
        if (inputStreamToNotify != null) {
            inputStreamToNotify.notifyReaderThread(duration, availableSize);
        } else {
            mLog.warn("Data available notification for non-existing uploadHandle %d", uploadHandle);
        }

        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamDataAvailable(uploadHandle, duration, availableSize);
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
    public void streamClosed(final long uploadHandle) throws ProducerException
    {
        mLog.debug("Stream %s is closed", mStreamInfo.getName());
        // Release the stopped latch
        mStoppedLatch.countDown();

        if (mStreamCallbacks != null) {
            mStreamCallbacks.streamClosed(uploadHandle);
        }
    }

    /**
     * Create a new connection to continue sending data in current buffer
     * @throws ProducerException
     */
    @Override
    public void resetConnection() throws ProducerException {
        mLog.debug("Current connection of stream %s is being reset", mStreamInfo.getName());

        streamTerminated(ReadResult.INVALID_UPLOAD_HANDLE_VALUE, SERVICE_CALL_RESULT_OK);
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

    private void notifyEndOfStream(final long uploadHandle) {
        final NativeDataInputStream inputStream = mInputStreamMap.get(uploadHandle);
        if (inputStream != null) {
            inputStream.endOfReaderThread();
        } else {
            mLog.error("NativeDataInputStream corresponding to upload handle %d is not found.", uploadHandle);
        }
    }
}
