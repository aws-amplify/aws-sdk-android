package com.amazonaws.kinesisvideo.internal.service;

import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentials;
import com.amazonaws.kinesisvideo.auth.KinesisVideoCredentialsProvider;
import com.amazonaws.kinesisvideo.auth.StaticCredentialsProvider;
import com.amazonaws.kinesisvideo.client.KinesisVideoClientConfiguration;
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducer;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoProducerStream;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.internal.producer.ServiceCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamDescription;
import com.amazonaws.kinesisvideo.producer.Tag;
import com.amazonaws.kinesisvideo.producer.Time;
import com.amazonaws.kinesisvideo.internal.producer.client.KinesisVideoServiceClient;
import com.amazonaws.kinesisvideo.internal.producer.jni.NativeKinesisVideoProducerJni;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.ACCESS_DENIED;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.HTTP_ACCESS_DENIED;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.HTTP_BAD_REQUEST;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.HTTP_NOT_FOUND;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.HTTP_OK;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.HTTP_RESOURCE_IN_USE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RESOURCE_IN_USE;
import static com.amazonaws.kinesisvideo.util.StreamInfoConstants.RESOURCE_NOT_FOUND;

/**
 * Implementation of {@link ServiceCallbacks}
 */
public class DefaultServiceCallbacksImpl implements ServiceCallbacks {
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
                for (final StreamingInfo stream : mStreams) {
                    if (stream.getStream().getStreamHandle() == streamHandle) {
                        log.info("Complete callback triggered for "
                                + stream.getStream().getStreamName() + " with statuscode " + statusCode);
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

    /**
     * Internal class for storing the ongoing streams
     */
    private class StreamingInfo {
        private final KinesisVideoProducerStream stream;

        public StreamingInfo(@NonNull final KinesisVideoProducerStream stream) {
            this.stream = Preconditions.checkNotNull(stream);
        }

        public void stop() {
            try {
                log.debug("Stopping the kinesis video producer stream");
                stream.stopStreamSync();
            } catch (final ProducerException e) {
                log.exception(e, "Stopping stream threw an exception.");
            }
        }

        public KinesisVideoProducerStream getStream() {
            return stream;
        }
    }

    /**
     * Task executor to schedule long-running tasks in an async way.
     */
    protected final ScheduledExecutorService executor;

    /**
     * Kinesis video service client to make the service calls with.
     */
    protected final KinesisVideoServiceClient kinesisVideoServiceClient;

    /**
     * Log object to use
     */
    protected final Log log;

    /**
     * Store the configuration
     */
    protected final KinesisVideoClientConfiguration configuration;

    /**
     * Implementation of the {@link KinesisVideoProducer} object.
     */
    protected KinesisVideoProducer kinesisVideoProducer = null;

    /**
     * The list of streams for which the callbacks can be applied.
     */
    private final List<StreamingInfo> mStreams = new ArrayList<StreamingInfo>();

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
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + ". Reporting to Kinesis Video PIC.");
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
            final long streamHandle,
            final KinesisVideoProducerStream stream) throws ProducerException {

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
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + ". Reporting to Kinesis Video PIC.");
                }

                try {
                    kinesisVideoProducer.describeStreamResult(stream, streamHandle, streamDescription, statusCode);
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
            final long streamHandle,
            final KinesisVideoProducerStream stream) throws ProducerException {

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
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + ". Reporting to Kinesis Video PIC.");
                    statusCode = getStatusCodeFromException(e);
                }

                if (statusCode != HTTP_OK && isBlank(endpoint)) {
                    // TODO: more URI validation
                    statusCode = HTTP_NOT_FOUND;
                }

                try {
                    kinesisVideoProducer.getStreamingEndpointResult(stream, streamHandle, endpoint, statusCode);
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
            final long streamHandle,
            final KinesisVideoProducerStream stream) throws ProducerException {

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
                            stream,
                            streamHandle,
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
            final KinesisVideoProducerStream kinesisVideoProducerStream) throws ProducerException {

        Preconditions.checkState(isInitialized(), "Service callbacks object should be initialized first");
        final long delay = calculateRelativeServiceCallAfter(callAfter);

        final Runnable task = new Runnable() {
            @Override
            public void run() {

                if (kinesisVideoProducerStream == null) {
                    throw new IllegalStateException("Couldn't find the correct stream");
                }

                final long timeoutInMillis = timeout / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;
                final long streamStartTimeInMillis = streamStartTime / Time.HUNDREDS_OF_NANOS_IN_A_MILLISECOND;

                int statusCode = HTTP_OK;

                final KinesisVideoCredentialsProvider credentialsProvider = getCredentialsProvider(authData, log);

                final long clientUploadHandle = getUploadHandle();

                try {
                    final InputStream dataStream = kinesisVideoProducerStream.getDataStream(clientUploadHandle);
                    final AckConsumer ackConsumer = new AckConsumer(clientUploadHandle, kinesisVideoProducerStream, log);
                    final BlockingAckConsumer blockingAckConsumer = new BlockingAckConsumer(ackConsumer, log,
                            kinesisVideoProducerStream);
                    final CompletionCallback completionCallback = new CompletionCallback(kinesisVideoProducerStream,
                            clientUploadHandle);

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
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + ". Reporting to Kinesis Video PIC.");
                }

                try {
                    log.info("putStreamResult uploadHandle " + clientUploadHandle + " status " + statusCode);
                    kinesisVideoProducer.putStreamResult(kinesisVideoProducerStream, clientUploadHandle, statusCode);
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
                            final long streamHandle,
                            final KinesisVideoProducerStream stream) throws ProducerException {

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
                    log.error("Kinesis Video service client returned an error " + e.getMessage() + ". Reporting to Kinesis Video PIC.");
                    statusCode = getStatusCodeFromException(e);
                }

                if (statusCode != HTTP_OK) {
                    // TODO: more URI validation
                    statusCode = HTTP_BAD_REQUEST;
                }

                try {
                    kinesisVideoProducer.tagResourceResult(stream, streamHandle, statusCode);
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
    public synchronized void free() {
        for (final StreamingInfo streamingInfo : mStreams) {
            // Cancel the futures
            streamingInfo.stop();
        }

        mStreams.clear();

        this.executor.shutdownNow();
    }

    @Override
    public synchronized void addStream(@NonNull final KinesisVideoProducerStream kinesisVideoProducerStream) {
        mStreams.add(new StreamingInfo(kinesisVideoProducerStream));
    }

    @Override
    public synchronized void removeStream(@NonNull KinesisVideoProducerStream kinesisVideoProducerStream) {
        StreamingInfo streamingInfoToBeRemoved = null;
        for (final StreamingInfo streamingInfo : mStreams) {
            if (streamingInfo.getStream() == kinesisVideoProducerStream) {
                streamingInfoToBeRemoved = streamingInfo;
                break;
            }
        }

        if (streamingInfoToBeRemoved != null) {
            mStreams.remove(streamingInfoToBeRemoved);
        }
    }

    private long calculateRelativeServiceCallAfter(final long absoluteCallAfter) {
        return Math.max(0, absoluteCallAfter * Time.NANOS_IN_A_TIME_UNIT -
                System.currentTimeMillis() * Time.NANOS_IN_A_MILLISECOND);
    }

    private synchronized long getUploadHandle() {
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
    protected static KinesisVideoCredentialsProvider getCredentialsProvider(@Nullable final byte[] authData,
                                                                    @NonNull final Log log) {
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
    protected static int getStatusCodeFromException(@Nullable final Throwable e) {
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
}
