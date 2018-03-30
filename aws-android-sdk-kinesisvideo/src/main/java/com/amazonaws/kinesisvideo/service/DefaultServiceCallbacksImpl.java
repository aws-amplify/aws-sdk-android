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

package com.amazonaws.kinesisvideo.service;

import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentials;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.auth.StaticCredentialsProvider;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.producer.*;
import com.amazonaws.kinesisvideo.producer.client.KinesisVideoServiceClient;
import com.amazonaws.kinesisvideo.producer.jni.NativeKinesisVideoProducerJni;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Implementation of {@link ServiceCallbacks}
 */
public class DefaultServiceCallbacksImpl implements ServiceCallbacks {
    private static final int HTTP_OK = 200;
    private static final int HTTP_BAD_REQUEST = 400;
    private static final int HTTP_NOT_FOUND = 404;
    private static final int HTTP_RESOURCE_IN_USE = 10003;
    private static final int HTTP_ACCESS_DENIED = 403;
    private static final String RESOURCE_NOT_FOUND = "ResourceNotFoundException";
    private static final String RESOURCE_IN_USE = "ResourceInUseException";
    private static final String ACCESS_DENIED = "AccessDeniedException";

    private class CompletionCallback implements Consumer<Exception> {
        private final KinesisVideoProducerStream stream;
        private final long uploadHandle;

        public CompletionCallback(@NonNull final KinesisVideoProducerStream stream,
                                  final long uploadHandle) {

            this.stream = Preconditions.checkNotNull(stream);
            this.uploadHandle = uploadHandle;
        }

        @Override
        public void accept(@Nullable final Exception object) {
            final long streamHandle = stream.getStreamHandle();

            if (streamHandle != NativeKinesisVideoProducerJni.INVALID_STREAM_HANDLE_VALUE) {
                // The exception can be null indicating successful completion
                final int statusCode = getStatusCodeFromException(object);

                // Find in the list of streams
                for (final OngoingStreamingInfo streamingInfo : mStreams) {
                    if (streamingInfo.getStream().getStreamHandle() == streamHandle) {
                        // Terminate this object
                        streamingInfo.stopSession(this);
                        break;
                    }
                }

                if (statusCode != HTTP_OK) {
                    try {
                        stream.streamTerminated(uploadHandle, statusCode);
                    } catch (final ProducerException e) {
                        log.exception(e, "Reporting stream termination threw an exception");
                    }
                }
            }
        }
    }

    private class OngoingStream {
        private final BlockingInputStream dataStream;
        private final AckConsumer ackConsumer;
        private final CompletionCallback completionCallback;

        public OngoingStream(
                @NonNull final BlockingInputStream dataStream,
                @NonNull final AckConsumer ackConsumer,
                @NonNull final CompletionCallback completionCallback) {
            this.dataStream = Preconditions.checkNotNull(dataStream);
            this.ackConsumer = Preconditions.checkNotNull(ackConsumer);
            this.completionCallback = Preconditions.checkNotNull(completionCallback);
        }

        public void stop() {
            try {
                log.debug("Closing data stream");
                dataStream.close();
            } catch (final IOException e) {
                log.exception(e, "Stopping data stream threw an exception");
            }

            try {
                log.debug("Stopping ack stream");
                ackConsumer.close();
            } catch (final ProducerException e) {
                log.exception(e, "Stopping ack stream threw an exception");
            }
        }

        public void setActive() {
            // Unblock the stream
            dataStream.unblock();
        }

        @NonNull
        public CompletionCallback getCompletionCallback() {
            return completionCallback;
        }
    }

    private static class OngoingStreamList extends ArrayList<OngoingStream> {
        public OngoingStream stopActiveStream(final int index) throws IndexOutOfBoundsException {
            final OngoingStream stream = super.remove(index);
            stream.stop();

            // Promote the next
            if (index < size()) {
                final OngoingStream nextActive = get(index);
                nextActive.setActive();
            }

            return stream;
        }

        public boolean addStream(final OngoingStream stream) {
            if (size() == 0) {
                // Mark as active if no other streams are in progress
                stream.setActive();
            }

            return super.add(stream);
        }
    }

    /**
     * Internal class for storing the ongoing streams
     */
    private class OngoingStreamingInfo {
        private final OngoingStreamList ongoingStreams;
        private final KinesisVideoProducerStream stream;
        private final Object syncObj;

        public OngoingStreamingInfo(@NonNull final KinesisVideoProducerStream stream) {
            this.stream = Preconditions.checkNotNull(stream);
            ongoingStreams = new OngoingStreamList();
            syncObj = new Object();
        }

        public void stop() {
            try {
                log.debug("Stopping the kinesis video producer stream");
                stream.stopStream();
            } catch (final ProducerException e) {
                log.exception(e, "Stopping stream threw an exception.");
            }

            while (ongoingStreams.size() > 0) {
                final OngoingStream ongoingStream = ongoingStreams.get(0);
                ongoingStream.stop();
            }
        }

        public void stopSession(@NonNull final CompletionCallback completionCallback) {
            synchronized (syncObj) {
                for (int index = 0; index < ongoingStreams.size(); index++) {
                    if (completionCallback == ongoingStreams.get(index).getCompletionCallback()) {
                        ongoingStreams.stopActiveStream(index);
                        break;
                    }
                }
            }
        }

        public KinesisVideoProducerStream getStream() {
            return stream;
        }

        public void appendOngoingStream(@NonNull final BlockingInputStream dataStream,
                                        @NonNull final AckConsumer ackConsumer,
                                        @NonNull final CompletionCallback completionCallback) {
            synchronized (syncObj) {
                ongoingStreams.addStream(new OngoingStream(dataStream, ackConsumer, completionCallback));
            }
        }
    }

    /**
     * Task executor to schedule long-running tasks in an async way.
     */
    private final ScheduledExecutorService executor;

    /**
     * Kinesis video service client to make the service calls with.
     */
    private final KinesisVideoServiceClient kinesisVideoServiceClient;

    /**
     * Log object to use
     */
    private final Log log;

    /**
     * Store the configuration
     */
    private final KinesisVideoClientConfiguration configuration;

    /**
     * Implementation of the {@link KinesisVideoProducer} object.
     */
    private KinesisVideoProducer kinesisVideoProducer = null;

    /**
     * The list of streams for which the callbacks can be applied.
     */
    private final List<OngoingStreamingInfo> mStreams = new ArrayList<OngoingStreamingInfo>();

    /**
     * A monotonically increasing value serving as an upload handle
     */
    private long uploadHandle;

    public DefaultServiceCallbacksImpl(
            @NonNull final Log log,
            @NonNull final ScheduledExecutorService executor,
            @NonNull final KinesisVideoClientConfiguration configuration,
            @NonNull final KinesisVideoServiceClient kinesisVideoServiceClient) {
        this.executor = Preconditions.checkNotNull(executor);
        this.kinesisVideoServiceClient = Preconditions.checkNotNull(kinesisVideoServiceClient);
        this.log = Preconditions.checkNotNull(log);
        this.configuration = Preconditions.checkNotNull(configuration);

        this.uploadHandle = 0;

        try {
            this.kinesisVideoServiceClient.initialize(configuration);
        } catch (final KinesisVideoException e) {
            log.exception(e);
        }
    }

    /**
     * Initializes the object
     *
     * @param kinesisVideoProducer Reference to {@link KinesisVideoProducer} for the eventing.
     */
    @Override
    public void initialize(@NonNull final KinesisVideoProducer kinesisVideoProducer) {
        Preconditions.checkState(!isInitialized(), "Service callback object has already been initialized");
        this.kinesisVideoProducer = Preconditions.checkNotNull(kinesisVideoProducer);
    }

    @Override
    public boolean isInitialized() {
        return kinesisVideoProducer != null;
    }

    @Override
    public void createStream(@NonNull final String deviceName,
                             @NonNull final String streamName,
                             @NonNull final String contentType,
                             @Nullable final String kmsKeyId,
                             final long retentionPeriod,
                             final long callAfter,
                             final long timeout,
                             @Nullable final byte[] authData,
                             final int authType,
                             final long customData)
            throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                int statusCode;
                String streamArn = null;

                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);
                final long retentionInHours = retentionPeriod / Time.HUNDREDS_OF_NANOS_IN_AN_HOUR;
                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                try {
                    streamArn = kinesisVideoServiceClient.createStream(
                            streamName,
                            deviceName,
                            contentType,
                            kmsKeyId,
                            retentionInHours,
                            timeoutInMillis,
                            credentialsProvider);
                    statusCode = HTTP_OK;
                } catch (final KinesisVideoException e) {
                    statusCode = getStatusCodeFromException(e);
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + " Reporting to Kinesis Video PIC.");
                }

                try {
                    kinesisVideoProducer.createStreamResult(customData, streamArn, statusCode);
                } catch (final ProducerException e) {
                    // TODO: Deal with the runtime exception properly in this and following cases
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void describeStream(
            @NonNull final String streamName,
            final long callAfter,
            final long timeout,
            @Nullable final byte[] authData,
            final int authType,
            final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                int statusCode;
                StreamDescription streamDescription = null;

                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);
                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                try {
                    streamDescription = kinesisVideoServiceClient.describeStream(streamName,
                            timeoutInMillis,
                            credentialsProvider);
                    statusCode = HTTP_OK;
                } catch (final KinesisVideoException e) {
                    statusCode = getStatusCodeFromException(e);
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + " Reporting to Kinesis Video PIC.");
                }

                try {
                    kinesisVideoProducer.describeStreamResult(customData, streamDescription, statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void getStreamingEndpoint(
            @NonNull final String streamName,
            @NonNull final String apiName,
            final long callAfter,
            final long timeout,
            @Nullable final byte[] authData,
            final int authType,
            final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);
                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
                int statusCode = HTTP_OK;
                String endpoint = "";
                try {
                    endpoint = kinesisVideoServiceClient.getDataEndpoint(streamName,
                            apiName,
                            timeoutInMillis,
                            credentialsProvider);
                } catch (final KinesisVideoException e) {
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + " Reporting to Kinesis Video PIC.");
                    statusCode = getStatusCodeFromException(e);
                }

                if (statusCode != HTTP_OK && isBlank(endpoint)) {
                    // TODO: more URI validation
                    statusCode = HTTP_NOT_FOUND;
                }

                try {
                    kinesisVideoProducer.getStreamingEndpointResult(customData, endpoint, statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void getStreamingToken(
            @NonNull final String streamName,
            final long callAfter,
            final long timeout,
            @Nullable final byte[] authData,
            final int authType,
            final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                // Currently, we have no support for getting a streaming token. We will refresh the credentials
                // and return a credential from the credentials provider we got initially.
                final KinesisVideoCredentialsProvider credentialsProvider = configuration.getCredentialsProvider();

                // Stores the serialized credentials as a streaming token
                byte[] serializedCredentials = null;
                long expiration = 0;

                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    final KinesisVideoCredentials credentials = credentialsProvider.getUpdatedCredentials();

                    // Serialize the credentials
                    expiration = credentials.getExpiration().getTime() * Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                    // Serialize the credentials as streaming token
                    final ObjectOutput outputStream = new ObjectOutputStream(byteArrayOutputStream);
                    outputStream.writeObject(credentials);
                    outputStream.flush();
                    serializedCredentials = byteArrayOutputStream.toByteArray();
                    outputStream.close();
                } catch (final IOException e) {
                    log.exception(e);
                } catch (final KinesisVideoException e) {
                    log.exception(e);
                } finally {
                    try {
                        byteArrayOutputStream.close();
                    } catch (final IOException ex) {
                        // Do nothing
                    }
                }

                final int statusCode = HTTP_OK;

                try {
                    kinesisVideoProducer.getStreamingTokenResult(
                            customData,
                            serializedCredentials,
                            expiration,
                            statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void putStream(
            @NonNull final String streamName,
            @NonNull final String containerType,
            final long streamStartTime,
            final boolean absoluteFragmentTimes,
            final boolean ackRequired,
            @NonNull final String dataEndpoint,
            final long callAfter,
            final long timeout,
            @Nullable final byte[] authData,
            final int authType,
            final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                // find the right stream
                KinesisVideoProducerStream kinesisVideoProducerStream = null;
                for (final OngoingStreamingInfo streamingInfo : mStreams) {
                    if (streamingInfo.getStream().getStreamHandle() == customData) {
                        kinesisVideoProducerStream = streamingInfo.getStream();
                        break;
                    }
                }

                if (kinesisVideoProducerStream == null) {
                    throw new IllegalStateException("Couldn't find the correct stream");
                }

                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
                final long streamStartTimeInMillis = streamStartTime / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                int statusCode = HTTP_OK;

                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);

                final long clientUploadHandle = getUploadHandle();

                try {
                    final BlockingInputStream dataStream = new BlockingInputStream(kinesisVideoProducerStream.getDataStream(clientUploadHandle), log);
                    final AckConsumer ackConsumer = new AckConsumer(clientUploadHandle, kinesisVideoProducerStream, log);
                    final BlockingAckConsumer blockingAckConsumer = new BlockingAckConsumer(ackConsumer);
                    final CompletionCallback completionCallback = new CompletionCallback(kinesisVideoProducerStream, clientUploadHandle);

                    // Insert into the ongoing streams for book keeping
                    addOngoingStreams(dataStream, ackConsumer, completionCallback, kinesisVideoProducerStream);

                    // This will kick-off a long running operation
                    kinesisVideoServiceClient.putMedia(streamName,
                            containerType,
                            streamStartTimeInMillis,
                            absoluteFragmentTimes,
                            ackRequired,
                            dataEndpoint,
                            timeoutInMillis,
                            credentialsProvider,
                            dataStream,
                            blockingAckConsumer,
                            completionCallback);

                    // Block until we parse the headers
                    blockingAckConsumer.awaitResponse();
                } catch (final KinesisVideoException e) {
                    statusCode = getStatusCodeFromException(e);
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + " Reporting to Kinesis Video PIC.");
                }

                try {
                    log.info("putStreamResult uploadHandle " + clientUploadHandle + " status " + statusCode);
                    kinesisVideoProducer.putStreamResult(customData, clientUploadHandle, statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void tagResource(@NonNull final String resourceArn,
                            @Nullable final Tag[] tags,
                            final long callAfter,
                            final long timeout,
                            @Nullable final byte[] authData,
                            final int authType,
                            final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);
                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
                int statusCode = HTTP_OK;

                Map<String, String> tagsMap = null;
                if (null != tags) {
                    // Convert the tags to map
                    tagsMap = new HashMap<String, String>(tags.length);

                    for (final Tag tag : tags) {
                        tagsMap.put(tag.getName(), tag.getValue());
                    }
                }
                try {
                    kinesisVideoServiceClient.tagStream(resourceArn,
                            tagsMap,
                            timeoutInMillis,
                            credentialsProvider);
                } catch (final KinesisVideoException e) {
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + " Reporting to Kinesis Video PIC.");
                    statusCode = getStatusCodeFromException(e);
                }

                if (statusCode != HTTP_OK) {
                    // TODO: more URI validation
                    statusCode = HTTP_BAD_REQUEST;
                }

                try {
                    kinesisVideoProducer.tagResourceResult(customData, statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void createDevice(@NonNull final String deviceName,
                             final long callAfter,
                             final long timeout,
                             @Nullable final byte[] authData,
                             final int authType,
                             final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {
                // TODO: Implement the call
                final int statusCode = HTTP_OK;

                try {
                    // Implement this properly.
                    final String deviceArn = deviceName + "_ARN";
                    kinesisVideoProducer.createDeviceResult(customData, deviceArn, statusCode);
                } catch (final ProducerException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executor.schedule(task, delay, TimeUnit.NANOSECONDS);
    }

    @Override
    public void deviceCertToToken(@NonNull final String deviceName,
                                  final long callAfter,
                                  final long timeout,
                                  @Nullable final byte[] authData,
                                  final int authType,
                                  final long customData) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");

        // This is not implemented for Java based clients.
        kinesisVideoProducer.deviceCertToTokenResult(customData, null, 0, HTTP_BAD_REQUEST);
    }

    @Override
    public void free() {
        for (final OngoingStreamingInfo streamingInfo : mStreams) {
            // Cancel the futures
            streamingInfo.stop();
        }

        this.executor.shutdownNow();
    }

    public void addStream(@NonNull final KinesisVideoProducerStream kinesisVideoProducerStream) {
        mStreams.add(new OngoingStreamingInfo(kinesisVideoProducerStream));
    }

    private long calculateRelativeServiceCallAfter(final long absoluteCallAfter) {
        return Math.max(0, absoluteCallAfter * Time.NANOS_IN_A_TIME_UNIT -
                System.currentTimeMillis() * Time.NANOS_IN_A_MILLISECOND);
    }

    private long getUploadHandle() {
        return uploadHandle++;
    }

    /**
     * <p>Checks if a CharSequence is whitespace, empty ("") or null.</p>
     * <p>
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     */
    private static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static KinesisVideoCredentialsProvider getCredentialsProvider(@Nullable final byte[] authData, @NonNull final Log log) {
        if (null == authData) {
            log.warn("NULL credentials have been returned by the credentials provider.");
            return null;
        }

        // De-serialize the bytes into AWSCredentials object
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(authData);
        KinesisVideoCredentials credentials = null;
        try {
            final ObjectInput objectInput = new ObjectInputStream(byteArrayInputStream);
            credentials = (KinesisVideoCredentials) objectInput.readObject();
            objectInput.close();
        } catch (final IOException e) {
            log.exception(e);
            return null;
        } catch (final ClassNotFoundException e) {
            log.exception(e);
            return null;
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (final IOException e) {
                log.exception(e);
            }
        }

        // Create a static credentials provider
        return new StaticCredentialsProvider(credentials);
    }

    /**
     * Returns the status code of an exception.
     *
     * @param e {@link Throwable} which was thrown by the service client
     * @return status code corresponding to the exception
     */
    private static int getStatusCodeFromException(@Nullable final Throwable e) {
        // TODO: Implement this properly
        if (e == null) {
            return HTTP_OK;
        } else if (e.getClass().getName().endsWith(RESOURCE_NOT_FOUND)) {
            return HTTP_NOT_FOUND;
        } else if (e.getClass().getName().endsWith(RESOURCE_IN_USE)) {
            return HTTP_RESOURCE_IN_USE;
        } else if (e.getClass().getName().endsWith(ACCESS_DENIED)) {
            return HTTP_ACCESS_DENIED;
        } else {
            // Try to analyze the cause
            final Throwable cause = e.getCause();
            if (cause != null) {
                return getStatusCodeFromException(cause);
            } else {
                // Default to bad request
                return HTTP_BAD_REQUEST;
            }
        }
    }

    private void addOngoingStreams(@NonNull final BlockingInputStream dataStream,
                                   @NonNull final AckConsumer ackConsumer,
                                   @NonNull final CompletionCallback completionCallback,
                                   @NonNull final KinesisVideoProducerStream stream) {

        // Append to the running streams.
        for(final OngoingStreamingInfo streamingInfo: mStreams) {
            if (streamingInfo.getStream() == stream) {
                streamingInfo.appendOngoingStream(dataStream, ackConsumer, completionCallback);
                return;
            }
        }

        throw new RuntimeException("Internal error - can't find the active stream");
    }
}
