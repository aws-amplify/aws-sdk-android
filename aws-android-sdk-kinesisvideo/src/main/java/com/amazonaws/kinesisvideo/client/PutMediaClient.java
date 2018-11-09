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

package com.amazonaws.kinesisvideo.client;

import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.encoding.ChunkEncoder;
import com.amazonaws.kinesisvideo.http.ParallelSimpleHttpClient;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;
import com.amazonaws.kinesisvideo.stream.throttling.BandwidthMeasuringOutputStream;
import com.amazonaws.kinesisvideo.stream.throttling.BandwidthThrottledOutputStream;
import com.amazonaws.kinesisvideo.stream.throttling.BandwidthThrottler;
import com.amazonaws.kinesisvideo.stream.throttling.BandwidthThrottlerImpl;
import com.amazonaws.kinesisvideo.stream.throttling.OpsPerSecondMeasurer;
import com.amazonaws.kinesisvideo.util.VersionUtil;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;
import static com.amazonaws.kinesisvideo.http.HttpMethodName.POST;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Client for making a PutMedia API call on Kinesis Video Streams.
 */
public final class PutMediaClient {
    private static final double BYTES_IN_MB = 1024.0 * 1024.0;
    private static final long BITS_IN_A_KILOBIT = 1024L;
    private static final String STREAM_NAME_HEADER = "x-amzn-stream-name";
    private static final String FRAGMENT_TIME_CODE_TYPE_HEADER = "x-amzn-fragment-timecode-type";
    private static final String PRODUCER_START_TIMESTAMP_HEADER = "x-amzn-producer-start-timestamp";
    private static final String TRANSFER_ENCODING = "Transfer-Encoding";
    private static final String CHUNKED = "chunked";
    private static final String CONNECTION = "connection";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String USER_AGENT = "user-agent";
    private static final int BUFFER_SIZE = 1024 * 1024; // 1MB
    private static final double MILLI_TO_SEC = 1000;
    private static final int LOGGING_INTERVAL = 250; // Rougly every 10 seconds in 25 fps
    private final Builder mBuilder;
    private final Log log;
    private ParallelSimpleHttpClient httpClient;

    private PutMediaClient(final Builder builder) {
        mBuilder = builder;
        log = mBuilder.mLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void putMediaInBackground() {
        putMediaWithSender(sendChunkEncodedMvkStream(0));
    }

    public void putMediaInBackgroundWithSleep(final int sleepTime) {
        putMediaWithSender(sendChunkEncodedMvkStream(sleepTime));
    }

    private void putMediaWithSender(final Consumer<OutputStream> sender) {
        final ParallelSimpleHttpClient.Builder clientBuilder = ParallelSimpleHttpClient.builder()
            .uri(mBuilder.mUri).method(POST)
            .log(log)
            .header(STREAM_NAME_HEADER, mBuilder.mStreamName)
            .header(TRANSFER_ENCODING, CHUNKED)
            .header(CONNECTION, KEEP_ALIVE)
            .header(USER_AGENT, VersionUtil.getUserAgent());
        clientBuilder.setReceiverCallback(mBuilder.mAcksReceiver);
        clientBuilder.header(PRODUCER_START_TIMESTAMP_HEADER,
                             String.format(Locale.US, "%.3f", mBuilder.mTimestamp / MILLI_TO_SEC));
        clientBuilder.header(FRAGMENT_TIME_CODE_TYPE_HEADER, mBuilder.mFragmentTimecodeType);
        clientBuilder.completionCallback(mBuilder.mCompletion);
        clientBuilder.setSenderCallback(sender);
        // Timeout if no response is received from the server for put(i.e., acks)
        // Socket will/should be closed by the consumer by throwing the SocketTimeoutException
        clientBuilder.setTimeout(mBuilder.mReceiveTimeout);
        httpClient = clientBuilder.build();
        sign(httpClient);
        // add additional unsigned headers
        if (mBuilder.unsignedHeaders != null) {
            for (final String headerName : mBuilder.unsignedHeaders.keySet()) {
                clientBuilder.header(headerName, mBuilder.unsignedHeaders.get(headerName));
            }
        }
        httpClient.connectAndProcessInBackground();
    }

    public void close() throws IOException {
        this.httpClient.close();
    }

    private void sign(final ParallelSimpleHttpClient client) {
        if (mBuilder.mSigner != null) {
            mBuilder.mSigner.sign(client);
        }
    }

    private Consumer<OutputStream> sendChunkEncodedMvkStream(final int fragmentThrottle) {
        return new Consumer<OutputStream>() {
            @Override
            public void accept(final OutputStream rawOutputStream) {
                FileOutputStream outputFileStream = null;
                try {
                    final OutputStream throttledOutputStream = throttleAndMeasureOutput(rawOutputStream);
                    outputFileStream = createOutputFileStream();
                    final byte[] buffer = new byte[BUFFER_SIZE];
                    int mkvBytesRead;
                    long counter = 0;
                    boolean continueLoop = true;
                    while (continueLoop) {
                        mkvBytesRead = mBuilder.mMkvStream.read(buffer);
                        counter++;
                        if (counter % LOGGING_INTERVAL == 0) {
                            log.debug("Sending data, counter : " + counter);
                        }
                        if (mkvBytesRead == -1) {
                            log.info("End-of-stream is reported. Terminating...");
                            continueLoop = false;
                        } else {
                            throttledOutputStream.write(ChunkEncoder.encode(buffer, mkvBytesRead));
                            tryWriteToFile(outputFileStream, buffer, mkvBytesRead);
                            if (fragmentThrottle > 0) {
                                Thread.sleep(fragmentThrottle);
                            }
                        }
                    }
                    throttledOutputStream.write(ChunkEncoder.encode(buffer, 0));
                    rawOutputStream.flush();
                    log.debug("Data sent. counter : " + counter);
                } catch (final Exception e) {
                    log.debug("Exception while sending data.", e);
                    throw new RuntimeException("Exception while sending encoded chunk in MKV stream ! ", e);
                } finally {
                    tryCloseOutputFileStream(outputFileStream);
                }
            }
        };
    }

    private OutputStream throttleAndMeasureOutput(final OutputStream rawOutputStream) {
        final OutputStream throttledOutputStream = throttleStream(rawOutputStream);
        return mBuilder.mLogUsedBandwidth ? logBytesPerSecond(throttledOutputStream) : throttledOutputStream;
    }

    private OutputStream throttleStream(final OutputStream rawOutputStream) {
        if (mBuilder.upstreamKbps != null) {
            final BandwidthThrottler throttler = new BandwidthThrottlerImpl(mBuilder.upstreamKbps * BITS_IN_A_KILOBIT);
            return new BandwidthThrottledOutputStream(rawOutputStream, throttler);
        }
        return rawOutputStream;
    }

    private OutputStream logBytesPerSecond(final OutputStream outputStream) {
        final OpsPerSecondMeasurer bandwidthMeasurer = new OpsPerSecondMeasurer(logBytesPerSecond());
        return new BandwidthMeasuringOutputStream(outputStream, bandwidthMeasurer);
    }

    private Consumer<Long> logBytesPerSecond() {
        return new Consumer<Long>() {
            @Override
            public void accept(final Long bytesWrittenPerSecond) {
                final double megabitPerSecond = mbitPerSecond(bytesWrittenPerSecond);
                System.out.println(String.format("%n   ===> actual megabit/sec: %.2f mbps", megabitPerSecond));
            }
        };
    }

    private FileOutputStream createOutputFileStream() {
        try {
            return mBuilder.mFileOutputPath == null ? null : new FileOutputStream(mBuilder.mFileOutputPath);
        } catch (final FileNotFoundException e) {
            throw new RuntimeException("Unable to open the file " + mBuilder.mFileOutputPath, e);
        }
    }

    private void tryWriteToFile(final FileOutputStream fileOutputStream, final byte[] buffer, final int bytesToWrite) {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.write(buffer, 0, bytesToWrite);
            fileOutputStream.flush();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void tryCloseOutputFileStream(final FileOutputStream outputFileStream) {
        if (outputFileStream == null) {
            return;
        }
        try {
            outputFileStream.close();
        } catch (final IOException e) {
            log.error(e.getMessage());
        }
    }

    private double mbitPerSecond(final long bps) {
        return bps * Byte.SIZE / BYTES_IN_MB;
    }


    public static class Builder {
        private URI mUri;
        private String mStreamName;
        private InputStream mMkvStream;
        private long mTimestamp;
        private Consumer<InputStream> mAcksReceiver;
        private KinesisVideoSigner mSigner;
        private String mFragmentTimecodeType;
        private Integer mReceiveTimeout;
        private boolean mLogUsedBandwidth;
        private String mFileOutputPath;
        private Long upstreamKbps;
        private Consumer<Exception> mCompletion;
        // TODO: Set to correct output channel
        private Log mLog = new Log(Log.SYSTEM_OUT);
        private Map<String, String> unsignedHeaders;

        public Builder putMediaDestinationUri(final URI uri) {
            mUri = uri;
            return this;
        }

        public Builder streamName(final String streamName) {
            mStreamName = streamName;
            return this;
        }

        public Builder mkvStream(final InputStream mkvStream) {
            mMkvStream = mkvStream;
            return this;
        }

        public Builder receiveAcks(final Consumer<InputStream> acksReceiver) {
            mAcksReceiver = acksReceiver;
            return this;
        }

        public Builder receiveCompletion(final Consumer<Exception> completion) {
            mCompletion = completion;
            return this;
        }

        public Builder timestamp(final long timestamp) {
            mTimestamp = timestamp;
            return this;
        }

        public Builder signWith(final KinesisVideoSigner signer) {
            mSigner = signer;
            return this;
        }

        public Builder fragmentTimecodeType(final String fragmentTimecodeType) {
            mFragmentTimecodeType = fragmentTimecodeType;
            return this;
        }

        public Builder receiveTimeout(final Integer timeout) {
            mReceiveTimeout = timeout;
            return this;
        }

        public Builder logUsedBandwidth(final boolean logBandwidth) {
            mLogUsedBandwidth = logBandwidth;
            return this;
        }

        /**
         * Allows writing the stream data into a localc file in addition to sending it to back-end.
         * <p>
         * Useful for debugging
         */
        public Builder fileOutputPath(final String fileOutputPath) {
            mFileOutputPath = fileOutputPath;
            return this;
        }

        public Builder upstreamKbps(final long kbps) {
            upstreamKbps = kbps;
            return this;
        }

        public Builder log(final Log log) {
            mLog = Preconditions.checkNotNull(log);
            return this;
        }

        /**
         * Add additional unsigned header. For testing use only.
         *
         * @param name
         * @param value
         * @return
         */
        public Builder unsignedHeader(final String name, final String value) {
            if (unsignedHeaders == null) {
                unsignedHeaders = new HashMap<String, String>();
            }
            unsignedHeaders.put(name, value);
            return this;
        }

        public PutMediaClient build() {
            checkNotNull(mUri);
            checkNotNull(mStreamName);
            checkNotNull(mMkvStream);
            checkNotNull(mAcksReceiver);
            return new PutMediaClient(this);
        }
    }
}
