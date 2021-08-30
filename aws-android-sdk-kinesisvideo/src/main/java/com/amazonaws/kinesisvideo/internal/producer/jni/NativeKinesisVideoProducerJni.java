package com.amazonaws.kinesisvideo.internal.producer.jni;

import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.logging.LogLevel;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;
import com.amazonaws.kinesisvideo.internal.producer.*;
import com.amazonaws.kinesisvideo.producer.AuthCallbacks;
import com.amazonaws.kinesisvideo.producer.AuthInfo;
import com.amazonaws.kinesisvideo.producer.DeviceInfo;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFragmentAck;
import com.amazonaws.kinesisvideo.producer.KinesisVideoFrame;
import com.amazonaws.kinesisvideo.internal.producer.KinesisVideoMetrics;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.StorageCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamDescription;
import com.amazonaws.kinesisvideo.producer.StreamInfo;
import com.amazonaws.kinesisvideo.producer.Tag;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.AnyThread;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.amazonaws.kinesisvideo.producer.ProducerException.STATUS_INVALID_OPERATION;
import static com.amazonaws.kinesisvideo.producer.ProducerException.STATUS_SUCCESS;

/**
 * JNI interface to the native Producer SDK library wrapper
 *
 *
 */
@AnyThread
@SuppressFBWarnings("UPM_UNCALLED_PRIVATE_METHOD")
public class NativeKinesisVideoProducerJni implements KinesisVideoProducer {
    /**
     * Specifying invalid client handle value
     */
    public static final long INVALID_CLIENT_HANDLE_VALUE = 0;

    /**
     * Specifying invalid stream handle value
     */
    public static final long INVALID_STREAM_HANDLE_VALUE = 0;

    /**
     * Name of the native library
     */
    private static final String PRODUCER_NATIVE_LIBRARY_NAME = "KinesisVideoProducerJNI";

    /**
     * The expected library version.
     */
    public static final String EXPECTED_LIBRARY_VERSION = "2.0";

    /**
     * The manifest handle will be set after call to parse()
     */
    private long mClientHandle = INVALID_CLIENT_HANDLE_VALUE;

    /**
     * Will store whether the library has been initialized
     */
    private boolean mLibraryInitialized = false;

    /**
     * Indicates whether the producer object is ready for creating streams, etc..
     */
    private volatile boolean mIsReady = false;

    /**
     * Used for synchronization of calls into the client
     */
    private final Object mSyncObject = new Object();

    /**
     * Used for synchronization of the callback calls
     */
    private final Object mCallbackSyncObject = new Object();

    /**
     * Keeps the mapping between the stream handle and the Kinesis Video stream object
     */
    private final Map<Long, KinesisVideoProducerStream> mKinesisVideoHandleMap = new HashMap<Long, KinesisVideoProducerStream>();

    /**
     * Callbacks for integration with the device auth subsystem.
     */
    private final AuthCallbacks mAuthCallbacks;

    /**
     * Callbacks for device storage integration
     */
    private final StorageCallbacks mStorageCallbacks;

    /**
     * Callbacks for service calls
     */
    private final ServiceCallbacks mServiceCallbacks;

    /**
     * Logger interface
     */
    private final Log mLog;

    /**
     * Helper class for loading the native libraries
     */
    private final NativeLibraryLoader mLibraryLoader;

    /**
     * Latch which will release when the client is ready
     */
    private final CountDownLatch mReadyLatch;

    /**
     * Used to store metrics. The metrics can be updated.
     */
    private final KinesisVideoMetrics mKinesisVideoMetrics;

    /**
     * Used to store device info
     */
    private DeviceInfo mDeviceInfo;

    /**
     * Public constructor.
     * @param authCallbacks Authentication callbacks
     * @param storageCallbacks Storage callbacks
     * @param serviceCallbacks Service call callbacks
     * @throws ProducerException
     */
    public NativeKinesisVideoProducerJni(final @NonNull AuthCallbacks authCallbacks,
                                         final @NonNull StorageCallbacks storageCallbacks,
                                         final @NonNull ServiceCallbacks serviceCallbacks) throws ProducerException {

        this(authCallbacks,
                storageCallbacks,
                serviceCallbacks,
                new Log(Log.SYSTEM_OUT, LogLevel.VERBOSE, "Producer JNI"));
    }

    /**
     * Public constructor
     * @param authCallbacks Authentication callbacks
     * @param storageCallbacks Storage callbacks
     * @param serviceCallbacks Service call callbacks
     * @param log Log object to use for logging
     * @throws ProducerException
     */
    public NativeKinesisVideoProducerJni(final @NonNull AuthCallbacks authCallbacks,
                                         final @NonNull StorageCallbacks storageCallbacks,
                                         final @NonNull ServiceCallbacks serviceCallbacks,
                                         final @NonNull Log log) throws ProducerException {
        this(authCallbacks,
                storageCallbacks,
                serviceCallbacks,
                log,
                new CountDownLatch(1));
    }

    /**
     * Public constructor
     * @param authCallbacks Authentication callbacks
     * @param storageCallbacks Storage callbacks
     * @param serviceCallbacks Service call callbacks
     * @param log Log objet to use for logging
     * @param readyLatch Ready latch for synch creation
     * @throws ProducerException
     */
    public NativeKinesisVideoProducerJni(final @NonNull AuthCallbacks authCallbacks,
                                         final @NonNull StorageCallbacks storageCallbacks,
                                         final @NonNull ServiceCallbacks serviceCallbacks,
                                         final @NonNull Log log,
                                         final @NonNull CountDownLatch readyLatch) throws ProducerException {
        mLog = Preconditions.checkNotNull(log);
        mAuthCallbacks = Preconditions.checkNotNull(authCallbacks);
        mStorageCallbacks = Preconditions.checkNotNull(storageCallbacks);
        mServiceCallbacks = Preconditions.checkNotNull(serviceCallbacks);
        mReadyLatch = Preconditions.checkNotNull(readyLatch);
        mLibraryLoader = new NativeLibraryLoader(mLog);
        mServiceCallbacks.initialize(this);
        mKinesisVideoMetrics = new KinesisVideoMetrics();
    }

    /**
     * Creates the underlying Kinesis Video client object
     * @param deviceInfo {@link DeviceInfo} object
     * @throws ProducerException
     */
    @Override
    public void create(final @NonNull DeviceInfo deviceInfo) throws ProducerException
    {
        create(deviceInfo, "");
    }

    /**
     * Creates the underlying Kinesis Video client object synchronously
     * @param deviceInfo {@link DeviceInfo} object
     * @throws ProducerException
     */
    @Override
    public void createSync(final @NonNull DeviceInfo deviceInfo) throws ProducerException
    {
        createSync(deviceInfo, "");
    }

    /**
     * Creates the underlying Kinesis Video client object.
     * @param deviceInfo {@link DeviceInfo} object
     * @param nativeLibraryPath Native library path
     * @throws ProducerException
     */
    public void create(final @NonNull DeviceInfo deviceInfo, final @NonNull String nativeLibraryPath) throws ProducerException
    {
        Preconditions.checkNotNull(deviceInfo);
        Preconditions.checkState(!isInitialized());

        mDeviceInfo = deviceInfo;
        synchronized (mSyncObject) {
            if (!mLibraryInitialized) {
                initializeLibrary(nativeLibraryPath);

                // We are initialized
                mLibraryInitialized = true;
            }

            mClientHandle = createKinesisVideoClient(deviceInfo);
        }
    }

    /**
     * Creates the underlying Kinesis Video client object synchronously.
     * @param deviceInfo {@link DeviceInfo} object
     * @param nativeLibraryPath Native library path
     * @throws ProducerException
     */
    public void createSync(final @NonNull DeviceInfo deviceInfo, final @NonNull String nativeLibraryPath) throws ProducerException
    {
        create(deviceInfo, nativeLibraryPath);

        // Block until client is ready or it times out.
        try {
            if (!mReadyLatch.await(KinesisVideoProducer.READY_TIMEOUT_IN_MILLISECONDS, TimeUnit.MILLISECONDS)) {
                throw new ProducerException("Kinesis Video producer creation time out", 0);
            }
        } catch (final InterruptedException ex) {
            throw new ProducerException(ex);
        }
    }

    /**
     * Returns whether the object has been initialized
     * @return whether initialized
     */
    @Override
    public boolean isInitialized()
    {
        synchronized (mSyncObject) {
            return mClientHandle != INVALID_CLIENT_HANDLE_VALUE;
        }
    }

    /**
     * Returns whether the object is ready
     * @return whether the object is ready
     */
    @Override
    public boolean isReady()
    {
        synchronized (mSyncObject) {
            return mIsReady;
        }
    }

    @Override
    @NonNull
    public KinesisVideoMetrics getMetrics() throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        getKinesisVideoMetrics(mClientHandle, mKinesisVideoMetrics);

        return mKinesisVideoMetrics;
    }

    /**
     * Frees the underlying Kinesis Video object. This call is prompt and will terminate the ongoing transmission and
     * drop the buffers.
     * @throws ProducerException
     */
    @Override
    public void free() throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        synchronized (mSyncObject) {
            freeKinesisVideoClient(mClientHandle);
            mClientHandle = INVALID_CLIENT_HANDLE_VALUE;
        }
    }

    /**
     * Creates an Kinesis Video stream
     * @param streamInfo      Stream information {@link StreamInfo} object
     * @param streamCallbacks Optional stream callnbacks {@link StreamCallbacks}
     * @return Newly create Kinesis Video stream
     * @throws ProducerException
     */
    @Override
    public KinesisVideoProducerStream createStream(final @NonNull StreamInfo streamInfo,
                                                   final @Nullable StreamCallbacks streamCallbacks)
            throws ProducerException
    {
        Preconditions.checkNotNull(streamInfo);
        Preconditions.checkState(isInitialized());

        synchronized (mSyncObject) {
            // Create the native stream
            final long streamHandle = createKinesisVideoStream(mClientHandle, streamInfo);
            final KinesisVideoProducerStream kinesisVideoProducerStream = new NativeKinesisVideoProducerStream(this,
                    streamInfo,
                    streamHandle,
                    mLog,
                    streamCallbacks, 
                    mDeviceInfo);

            // Insert into the maps
            mKinesisVideoHandleMap.put(streamHandle, kinesisVideoProducerStream);

            return kinesisVideoProducerStream;
        }
    }

    /**
     * Creates an Kinesis Video stream sycnronously
     * @param streamInfo      Stream information {@link StreamInfo} object
     * @param streamCallbacks Optional stream callnbacks {@link StreamCallbacks}
     * @return Newly created Kinesis Video stream
     * @throws ProducerException
     */
    @Override
    public KinesisVideoProducerStream createStreamSync(final @NonNull StreamInfo streamInfo,
                                                       final @Nullable StreamCallbacks streamCallbacks)
            throws ProducerException
    {
        final NativeKinesisVideoProducerStream stream = (NativeKinesisVideoProducerStream) createStream(streamInfo, streamCallbacks);
        try {
            // Block until ready
            stream.awaitReady();
        } catch (final ProducerException e) {
            freeStream(stream);
            throw e;
        }
        return stream;
    }

    /**
     * Stops all Kinesis Video streams. This is an async operation and the buffers will continue draining.
     * @throws ProducerException
     */
    @Override
    public void stopStreams() throws ProducerException
    {
        // Idempotent call if already closed
        if (!isInitialized()) {
            return;
        }

        synchronized (mSyncObject) {
            // Stop the streams
            stopKinesisVideoStreams(mClientHandle);
        }
    }

    /**
     * Stops an Kinesis Video stream. This is an async operation and the buffers will continue draining until streamStopped
     * event is received.
     * @param streamHandle the handle of the stream
     * @throws ProducerException
     */
    public void stopStream(final long streamHandle) throws ProducerException
    {
        // Idempotent call if already closed
        if (!isInitialized()) {
            return;
        }

        synchronized (mSyncObject) {
            // Stop the streams
            stopKinesisVideoStream(mClientHandle, streamHandle);
        }
    }

    @Override
    public void freeStreams() throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        synchronized (mSyncObject) {
            try {
                final Collection<KinesisVideoProducerStream> streamCollection =
                        new HashSet<KinesisVideoProducerStream>(mKinesisVideoHandleMap.values());
                for (final KinesisVideoProducerStream stream : streamCollection) {

                    // Free the stream
                    freeStream(stream);
                }
            } finally{
                // Remove from the map
                mKinesisVideoHandleMap.clear();
            }
        }
    }

    @Override
    public void freeStream(final @NonNull KinesisVideoProducerStream stream) throws ProducerException
    {
        Preconditions.checkNotNull(stream);

        // Idempotent call if already closed
        if (!isInitialized()) {
            return;
        }

        synchronized (mSyncObject) {
            final long streamHandle = stream.getStreamHandle();
            stream.streamFreed();
            try {
                // Stop the streams
                freeKinesisVideoStream(mClientHandle, streamHandle);
            } finally {
                mKinesisVideoHandleMap.remove(streamHandle);
            }
        }
    }

    /**
     * Reports an abnormal stream termination event.
     * @param streamHandle the handle of the stream
     * @param uploadHandle the client stream upload handle
     * @param statusCode the status code of the termination event.
     * @throws ProducerException
     */
    public void streamTerminated(final long streamHandle, final long uploadHandle, final int statusCode) throws ProducerException
    {
        // Idempotent call if already closed
        if (!isInitialized()) {
            return;
        }

        synchronized (mSyncObject) {
            // Stop the streams
            kinesisVideoStreamTerminated(mClientHandle, streamHandle, uploadHandle, statusCode);
        }
    }

    /**
     * Fills in the stream metrics object
     * @param streamHandle the handle of the stream
     * @param streamMetrics stream metrics to fill in
     * @throws ProducerException
     */
    public void getStreamMetrics(final long streamHandle, @NonNull final KinesisVideoStreamMetrics streamMetrics)
            throws ProducerException
    {
        Preconditions.checkState(isInitialized());

        getKinesisVideoStreamMetrics(mClientHandle, streamHandle, streamMetrics);
    }

    /**
     * Put a frame.
     *
     * @param streamHandle the handle of the stream
     * @param kinesisVideoFrame  an KinesisVideoFrame object
     * @throws ProducerException
     */
    public void putFrame(final long streamHandle, final @NonNull KinesisVideoFrame kinesisVideoFrame) throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        Preconditions.checkNotNull(kinesisVideoFrame);

        putKinesisVideoFrame(mClientHandle, streamHandle, kinesisVideoFrame);
    }

    /**
     * Put a fragment metadata.
     *
     * @param streamHandle the handle of the stream
     * @param metadataName  metadata name
     * @param metadataValue  metadata value
     * @param persistent  whether this is persistent metadata or not
     * @throws ProducerException
     */
    public void putFragmentMetadata(final long streamHandle, final @NonNull String metadataName, @NonNull final String metadataValue,
                                    final boolean persistent) throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        Preconditions.checkNotNull(metadataName);
        Preconditions.checkNotNull(metadataValue);

        putKinesisVideoFragmentMetadata(mClientHandle, streamHandle, metadataName, metadataValue, persistent);
    }

    /**
     * Report an ACK for a fragment
     *
     * @param streamHandle the handle of the stream
     * @param kinesisVideoFragmentAck an KinesisVideoFragmentAck object
     * @throws ProducerException
     */
    public void fragmentAck(final long streamHandle, final long uploadHandle, final @NonNull KinesisVideoFragmentAck kinesisVideoFragmentAck) throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        kinesisVideoStreamFragmentAck(mClientHandle, streamHandle, uploadHandle, kinesisVideoFragmentAck);
    }

    /**
     * Parses and processes an ACK string
     *
     * @param streamHandle the handle of the stream
     * @param kinesisVideoFragmentAck string containing ACKs
     * @throws ProducerException
     */
    public void parseFragmentAck(final long streamHandle, final long uploadHandle, final @NonNull String kinesisVideoFragmentAck) throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        Preconditions.checkNotNull(kinesisVideoFragmentAck);

        kinesisVideoStreamParseFragmentAck(mClientHandle, streamHandle, uploadHandle, kinesisVideoFragmentAck);
    }

    /**
     * Get stream data from the buffer for specific upload Handle.
     * Each uploadHandle correspond to a PutMedia connection to
     * Kinesis Video Streams.
     *
     * @param streamHandle     the handle of the stream
     * @param uploadHandle     the client stream upload handle
     * @param fillBuffer    The buffer to fill
     * @param offset    The start of the buffer
     * @param length    The number of bytes to fill
     * @param readResult    The read result to fill in
     * @throws ProducerException
     */
    public void getStreamData(final long streamHandle,
                              final long uploadHandle,
                              final @NonNull byte[] fillBuffer,
                              final int offset,
                              final int length,
                              final @NonNull ReadResult readResult) throws ProducerException
    {
        Preconditions.checkState(isInitialized());
        Preconditions.checkNotNull(fillBuffer);
        Preconditions.checkNotNull(readResult);

        getKinesisVideoStreamData(mClientHandle, streamHandle, uploadHandle, fillBuffer, offset, length,
                readResult);
    }

    /**
     * Stream format has changed. Currently, only supporting Codec Private Data
     *
     * @param streamHandle     the handle of the stream
     * @param codecPrivateData    Codec Private Data or null to reset
     * @throws ProducerException
     */
    public void streamFormatChanged(final long streamHandle, final @Nullable byte[] codecPrivateData,
                                    final long trackId) throws ProducerException
    {
        Preconditions.checkState(isInitialized());

        synchronized (mSyncObject) {
            kinesisVideoStreamFormatChanged(mClientHandle, streamHandle, codecPrivateData, trackId);
        }
    }

    /**
     * Returns the device certificate object
     *
     * @return Device certificate
     */
    @Nullable
    private AuthInfo getDeviceCertificate()
    {
        synchronized (mCallbackSyncObject) {
            return mAuthCallbacks.getDeviceCertificate();
        }
    }

    /**
     * Returns the device security token bits
     *
     * @return Device security token
     */
    @Nullable
    private AuthInfo getSecurityToken()
    {
        return mAuthCallbacks.getSecurityToken();
    }

    /**
     * Returns the device fingerprint
     *
     * @return Device fingerprint
     */
    @Nullable
    private String getDeviceFingerprint()
    {
        return mAuthCallbacks.getDeviceFingerprint();
    }

    /**
     * Reports stream underflow
     *
     * @param streamHandle     the handle of the stream
     */
    private void streamUnderflowReport(final long streamHandle) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }
        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.streamUnderflowReport();
    }

    /**
     * Reports storage overflow pressure
     */
    private void storageOverflowPressure(final long remainingSize)
    {
        mStorageCallbacks.storageOverflowPressure(remainingSize);
    }

    /**
     * Reports buffer temporal overflow pressure
     */
    private void bufferDurationOverflowPressure(final long streamHandle, final long remainDuration) throws ProducerException {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.bufferDurationOverflowPressure(remainDuration);
    }

    /**
     * Reports stream latency pressure
     */
    private void streamLatencyPressure(final long streamHandle, final long duration) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.streamLatencyPressure(duration);
    }

    /**
     * Reports stream connection staleness
     */
    private void streamConnectionStale(final long streamHandle, final long lastAckDuration) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.streamConnectionStale(lastAckDuration);
    }

    /**
     * Reports received fragment ACK
     *
     * @param streamHandle the handle of the stream
     * @param uploadHandle the client stream upload handle
     * @param fragmentAck ACK for the fragment
     */
    private void fragmentAckReceived(final long streamHandle, final long uploadHandle, @NonNull final KinesisVideoFragmentAck fragmentAck)
            throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.fragmentAckReceived(uploadHandle, fragmentAck);
    }

    /**
     * Reports dropped frame
     */
    private void droppedFrameReport(final long streamHandle, final long frameTimecode) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.droppedFrameReport(frameTimecode);
    }

    /**
     * Reports dropped fragment
     */
    private void droppedFragmentReport(final long streamHandle, final long fragmentTimecode) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.droppedFragmentReport(fragmentTimecode);
    }

    /**
     * Reports stream error.
     */
    private void streamErrorReport(final long streamHandle, final long uploadHandle, final long fragmentTimecode, final long statusCode) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.streamErrorReport(uploadHandle, fragmentTimecode, statusCode);
    }

    /**
     * Reports stream data is available
     */
    private void streamDataAvailable(final long streamHandle, final String streamName, final long uploadHandle, final long duration, final long availableSize) throws ProducerException
    {
        if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
            throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
        }

        final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
        kinesisVideoProducerStream.streamDataAvailable(uploadHandle, duration, availableSize);
    }

    /**
     * Reports stream is ready
     */
    private void streamReady(final long streamHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            synchronized (mSyncObject) {
                if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
                    mLog.info("Stream Ready for non-existing stream handle " + streamHandle);
                    return;
                }

                final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
                kinesisVideoProducerStream.streamReady();
            }
        }
    }

    /**
     * Reports stream is closed
     */
    private void streamClosed(final long streamHandle, final long uploadHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            if (!mKinesisVideoHandleMap.containsKey(streamHandle)) {
                throw new ProducerException("Invalid stream handle.", STATUS_INVALID_OPERATION);
            }

            final KinesisVideoProducerStream kinesisVideoProducerStream = mKinesisVideoHandleMap.get(streamHandle);
            kinesisVideoProducerStream.streamClosed(uploadHandle);
        }
    }

    /**
     * Reports client is ready
     */
    private void clientReady(final long clientHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            if (mClientHandle != clientHandle) {
                throw new ProducerException("Invalid client handle.", STATUS_INVALID_OPERATION);
            }

            mIsReady = true;

            // Release the ready latch
            mReadyLatch.countDown();
        }
    }

    /**
     * Callback from the native code to schedule a call to create stream
     * @param deviceName - Device name
     * @param streamName - Stream name
     * @param contentType - Stream content type
     * @param kmsKeyId - KMS Key Id
     * @param retentionPeriod - Stream retention period
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int createStream(final @NonNull String deviceName,
            final @NonNull String streamName,
            final @NonNull String contentType,
            final @Nullable String kmsKeyId,
            final long retentionPeriod,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long customData) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.createStream(deviceName, streamName, contentType,
                        kmsKeyId, retentionPeriod, callAfter, timeout, authData,
                        authType, customData);
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void createStreamResult(final long customData, final @Nullable String streamArn, final int httpStatusCode)
            throws ProducerException
    {
        synchronized (mSyncObject) {
            createStreamResultEvent(mClientHandle, customData, httpStatusCode, streamArn);
        }
    }

    /**
     * Callback from the native code to schedule a call to describe stream
     * @param streamName - Stream name
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param streamHandle - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int describeStream(final @NonNull String streamName,
            final long callAfter,
            final long timeout,
            final byte[] authData,
            final int authType,
            final long streamHandle) throws ProducerException
    {
        try {
            mServiceCallbacks.describeStream(streamName, callAfter, timeout, authData, authType,
                    streamHandle, mKinesisVideoHandleMap.get(streamHandle));
            return STATUS_SUCCESS;
        } catch (final ProducerException e) {
            return e.getStatusCode();
        }
    }

    @Override
    public void describeStreamResult(final KinesisVideoProducerStream stream,
                                      final long streamHandle,
                                      final @Nullable StreamDescription streamDescription,
                                      final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            if (stream == null) {
                describeStreamResultEvent(mClientHandle, streamHandle, httpStatusCode, streamDescription);
            } else {
                if (stream.getStreamHandle() != INVALID_STREAM_HANDLE_VALUE) {
                    describeStreamResultEvent(mClientHandle, stream.getStreamHandle(), httpStatusCode, streamDescription);
                }
            }
        }
    }

    /**
     * Callback from the native code to schedule a call to get streaming endpoint
     * @param streamName - Stream name
     * @param apiName - API to call
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param streamHandle - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int getStreamingEndpoint(final @NonNull String streamName,
            final @NonNull String apiName,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long streamHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.getStreamingEndpoint(streamName, apiName, callAfter, timeout, authData, authType,
                        streamHandle, mKinesisVideoHandleMap.get(streamHandle));
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void getStreamingEndpointResult(final KinesisVideoProducerStream stream,
                                           final long streamHandle,
                                           final @Nullable String endpoint,
                                           final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            if (stream == null) {
                getStreamingEndpointResultEvent(mClientHandle, streamHandle, httpStatusCode, endpoint);
            } else {
                if (stream.getStreamHandle() != INVALID_STREAM_HANDLE_VALUE) {
                    getStreamingEndpointResultEvent(mClientHandle, stream.getStreamHandle(), httpStatusCode, endpoint);
                }
            }
        }
    }

    /**
     * Callback from the native code to schedule a call to get streaming token
     * @param streamName - Stream name
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param streamHandle - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int getStreamingToken(final @NonNull String streamName,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long streamHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.getStreamingToken(streamName, callAfter, timeout, authData, authType,
                        streamHandle, mKinesisVideoHandleMap.get(streamHandle));
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void getStreamingTokenResult(final KinesisVideoProducerStream stream,
                                        final long streamHandle,
                                        final @Nullable byte[] token,
                                        final long expiration,
                                        final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            final int tokenSize = token == null ? 0 : token.length;

            if (stream == null) {
                getStreamingTokenResultEvent(mClientHandle, streamHandle, httpStatusCode, token, tokenSize, expiration);
            } else {
                if (stream.getStreamHandle() != INVALID_STREAM_HANDLE_VALUE) {
                    getStreamingTokenResultEvent(mClientHandle, stream.getStreamHandle(),
                            httpStatusCode, token, tokenSize, expiration);
                }
            }
        }
    }

    /**
     * Schedules a call to put stream API
     * @param streamName - Stream name
     * @param containerType - Container type
     * @param streamStartTime - Stream start timestamp
     * @param absoluteFragmentTimes - Whether to use absolute fragment times
     * @param ackRequired - Whether an application level ACK is required
     * @param streamingEndpoint - The streaming endpoint to use
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param streamHandle - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int putStream(final @NonNull String streamName,
            final @NonNull String containerType,
            final long streamStartTime,
            final boolean absoluteFragmentTimes,
            final boolean ackRequired,
            final @NonNull String streamingEndpoint,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long streamHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.putStream(streamName,
                        containerType,
                        streamStartTime,
                        absoluteFragmentTimes,
                        ackRequired,
                        streamingEndpoint,
                        callAfter,
                        timeout,
                        authData,
                        authType,
                        mKinesisVideoHandleMap.get(streamHandle));
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void putStreamResult(final KinesisVideoProducerStream stream, final long clientStreamHandle,
                                final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            if (stream.getStreamHandle() != INVALID_STREAM_HANDLE_VALUE) {
                putStreamResultEvent(mClientHandle, stream.getStreamHandle(), httpStatusCode, clientStreamHandle);
            }
        }
    }

    /**
     * Schedules a call to tag resource API
     * @param resourceArn - Resource ARN
     * @param tags - Array of tags
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param streamHandle - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int tagResource(final @NonNull String resourceArn,
            final @NonNull Tag[] tags,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long streamHandle) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.tagResource(resourceArn, tags, callAfter, timeout, authData, authType,
                        streamHandle, mKinesisVideoHandleMap.get(streamHandle));
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void tagResourceResult(final KinesisVideoProducerStream stream,
                                  final long streamHandle, final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            if (stream == null) {
                tagResourceResultEvent(mClientHandle, streamHandle, httpStatusCode);
            } else {
                if (stream.getStreamHandle() != INVALID_STREAM_HANDLE_VALUE) {
                    tagResourceResultEvent(mClientHandle, stream.getStreamHandle(), httpStatusCode);
                }
            }
        }
    }

    /**
     * Schedules a call to create device API
     *
     * IMPORTANT!!! This should schedule a call in a different thread and not
     * result in an immediate call to CreateDeviceResult as the mClientHandle
     * hasn't been set yet.
     *
     * @param deviceName - Device name to use when creating a new device object
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int createDevice(final @NonNull String deviceName,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long customData) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.createDevice(deviceName, callAfter, timeout, authData, authType, customData);
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void createDeviceResult(final long customData, final @Nullable String deviceArm, final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            createDeviceResultEvent(mClientHandle, customData, httpStatusCode, deviceArm);
        }
    }

    /**
     * Schedules a call to device cert to token API
     *
     * IMPORTANT!!! This should schedule a call in a different thread and not
     * result in an immediate call to CreateDeviceResult as the mClientHandle
     * hasn't been set yet.
     *
     * @param deviceName - Device name to use when creating a new device object
     * @param callAfter - Call after this time
     * @param timeout - Time out for the call
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @return STATUS of the call
     */
    private int deviceCertToToken(final @NonNull String deviceName,
            final long callAfter,
            final long timeout,
            final @Nullable byte[] authData,
            final int authType,
            final long customData) throws ProducerException
    {
        synchronized (mCallbackSyncObject) {
            try {
                mServiceCallbacks.deviceCertToToken(deviceName, callAfter, timeout, authData, authType, customData);
                return STATUS_SUCCESS;
            } catch (final ProducerException e) {
                return e.getStatusCode();
            }
        }
    }

    @Override
    public void deviceCertToTokenResult(final long customData, final @Nullable byte[] token, final long expiration, final int httpStatusCode) throws ProducerException
    {
        synchronized (mSyncObject) {
            final int tokenSize = token == null ? 0 : token.length;

            deviceCertToTokenResultEvent(mClientHandle, customData, httpStatusCode, token, tokenSize, expiration);
        }
    }

    /**
     * Awaits for the initialization/loading
     */
    private void initializeLibrary(final @NonNull String nativeLibraryPath) throws ProducerException
    {
        // Load the native library
        if (!mLibraryLoader.loadNativeLibrary(nativeLibraryPath, PRODUCER_NATIVE_LIBRARY_NAME)) {
            throw new ProducerException("Failed loading native library", STATUS_INVALID_OPERATION);
        }

        // Check the library version info
        final String libraryVersion = getNativeLibraryVersion();

        // Get the compile time for reporting purposes
        final String compileTime = getNativeCodeCompileTime();

        mLog.verbose("%s library: version %s, compile time %s", PRODUCER_NATIVE_LIBRARY_NAME, libraryVersion, compileTime);

        Preconditions.checkState(libraryVersion.equals(EXPECTED_LIBRARY_VERSION),
                    String.format("FATAL DEPLOYMENT ERROR: This app is built "
                            + "to run with version %s of the lib%s.so library, but version %s was found on this device",
                    EXPECTED_LIBRARY_VERSION, PRODUCER_NATIVE_LIBRARY_NAME, libraryVersion));
    }

    /**
     * Returns the native library version
     *
     * @return
     */
    private native String getNativeLibraryVersion();

    /**
     * returns the native library compile time
     *
     * @return
     */
    private native String getNativeCodeCompileTime();

    /**
     * Creates a new Kinesis Video client native component
     *
     * @param deviceInfo
     *         Instance of {@link DeviceInfo} object
     * @return A newly created producer client object handle
     * @throws ProducerException
     */
    private native long createKinesisVideoClient(final @NonNull DeviceInfo deviceInfo)
            throws ProducerException;

    /**
     * Releases the underlying native component
     *
     * @param clientHandle
     *          Client handle
     * @throws ProducerException
     */
    private native void freeKinesisVideoClient(long clientHandle) throws ProducerException;

    /**
     * Stops the underlying native streams
     *
     * @param clientHandle
     *          Client handle
     * @throws ProducerException
     */
    private native void stopKinesisVideoStreams(long clientHandle) throws ProducerException;

    /**
     * Stops the underlying native stream
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @throws ProducerException
     */
    private native void stopKinesisVideoStream(long clientHandle, long streamHandle) throws ProducerException;

    /**
     * Frees the underlying native stream. The existing buffer content (if any) will be dropped and not sent.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @throws ProducerException
     */
    private native void freeKinesisVideoStream(long clientHandle, long streamHandle) throws ProducerException;

    /**
     * Creates a new Kinesis Video stream native component
     *
     * @param streamInfo
     *         Instance of {@link StreamInfo} object
     * @return A newly created stream object handle
     * @throws ProducerException
     */
    private native long createKinesisVideoStream(long clientHandle, final @NonNull StreamInfo streamInfo)
            throws ProducerException;

    /**
     * Puts a frame into the frame buffer.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @param kinesisVideoFrame Kinesis Video frame to put
     * @throws ProducerException
     */
    private native void putKinesisVideoFrame(long clientHandle, long streamHandle,
                                             final @NonNull KinesisVideoFrame kinesisVideoFrame)
            throws ProducerException;

    /**
     * Puts a Metadata into the native producer.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @param metadataName  metadata name
     * @param metadataValue  metadata value
     * @param persistent  whether this is persistent metadata or not
     * @throws ProducerException
     */
    private native void putKinesisVideoFragmentMetadata(long clientHandle, long streamHandle,
                                                        final @NonNull String metadataName,
                                                        final @NonNull String metadataValue, boolean persistent)
            throws ProducerException;

    /**
     * Reports a stream fragment ACK.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @param uploadHandle the client stream upload handle
     * @param kinesisVideoFragmentAck Kinesis Video fragment ack to report for the stream
     * @throws ProducerException
     */
    private native void kinesisVideoStreamFragmentAck(long clientHandle, long streamHandle, long uploadHandle,
                                                      final @NonNull KinesisVideoFragmentAck kinesisVideoFragmentAck)
            throws ProducerException;

    /**
     * Parses and processes a string containing fragment ACKs.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @param uploadHandle the client stream upload handle
     * @param kinesisVideoFragmentAck Kinesis Video fragment ack string to report for the stream
     * @throws ProducerException
     */
    private native void kinesisVideoStreamParseFragmentAck(long clientHandle, long streamHandle, long uploadHandle,
                                                           final @NonNull String kinesisVideoFragmentAck)
            throws ProducerException;

    /**
     * Gets the Kinesis Video client object metrics.
     *
     * @param clientHandle Client handle
     * @param metrics - Kinesis Video metrics object to fill in
     * @throws ProducerException
     */
    private native void getKinesisVideoMetrics(long clientHandle, @NonNull final KinesisVideoMetrics metrics)
            throws ProducerException;

    /**
     * Gets the Kinesis Video stream object metrics.
     *
     * @param clientHandle Client handle
     * @param streamHandle Stream handle
     * @param metrics - Kinesis Video stream metrics object to fill in
     * @throws ProducerException
     */
    private native void getKinesisVideoStreamMetrics(long clientHandle, long streamHandle,
                                                     final @NonNull KinesisVideoStreamMetrics metrics)
            throws ProducerException;

    /**
     * Sends describe stream result event to SDK
     *
     * @param clientHandle client handle
     * @param streamHandle stream handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for describeStream API
     * @param streamDescription stream description object
     * @throws ProducerException
     */
    private native void describeStreamResultEvent(long clientHandle, long streamHandle, int httpStatusCode,
                                                  final @Nullable StreamDescription streamDescription)
            throws ProducerException;

    /**
     * Sends get streaming endpoint result event to SDK
     *
     * @param clientHandle client handle
     * @param streamHandle stream handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for getStreamingEndpoint API
     * @param streamingEndpoint streaming endpoint
     * @throws ProducerException
     */
    private native void getStreamingEndpointResultEvent(long clientHandle, long streamHandle, int httpStatusCode,
                                                        final @Nullable String streamingEndpoint)
            throws ProducerException;

    /**
     * Sends get streaming token result event to SDK
     *
     * @param clientHandle client handle
     * @param streamHandle stream handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for getStreamingToken API
     * @param streamingToken streaming token
     * @param tokenSize token size
     * @param tokenExpiration token expiration time in 100ns absolute time
     * @throws ProducerException
     */
    private native void getStreamingTokenResultEvent(long clientHandle, long streamHandle, int httpStatusCode,
                                                     final @Nullable byte[] streamingToken, int tokenSize,
                                                     long tokenExpiration)
            throws ProducerException;

    /**
     * Sends put stream result event to SDK
     *
     * @param clientHandle client handle
     * @param streamHandle stream handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for putStream API
     * @param clientStreamHandle client stream handle
     * @throws ProducerException
     */
    private native void putStreamResultEvent(long clientHandle, long streamHandle, int httpStatusCode, long clientStreamHandle)
            throws ProducerException;

    /**
     * Sends tag resource result event to SDK
     *
     * @param clientHandle client handle
     * @param customData custom data passed in
     * @param httpStatusCode HTTP status code from Kinesis Video service for putStream API
     * @throws ProducerException
     */
    private native void tagResourceResultEvent(long clientHandle, long customData, int httpStatusCode)
            throws ProducerException;

    /**
     * Sends create stream result event to SDK
     *
     * @param clientHandle client handle
     * @param streamHandle stream handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for createStream API
     * @param streamArn Stream ARN on success
     * @throws ProducerException
     */
    private native void createStreamResultEvent(long clientHandle, long streamHandle, int httpStatusCode, final @Nullable String streamArn)
            throws ProducerException;

    /**
     * Get MKV stream data from the frame buffer.
     *
     * @param clientHandle the handle of the client
     * @param streamHandle the handle of the stream
     * @param fillBuffer the buffer to fill
     * @param offset the offset into the buffer to fill
     * @param length the length of the buffer to fill
     * @param readResult the result of the read operation
     * @throws ProducerException
     */
    private native void getKinesisVideoStreamData(long clientHandle, long streamHandle, long uploadHandle,
                                                  final @NonNull byte[] fillBuffer, int offset,
                                                  int length, final @NonNull ReadResult readResult)
            throws ProducerException;

    /**
     * Stream format has changed. Currently, only CPD is supported
     *
     * @param clientHandle the handle of the client
     * @param streamHandle the handle of the stream
     * @param codecPrivateData Codec Private Data bits or null to reset
     * @param trackId Track Id of the changed CPD belongs to
     * @throws ProducerException
     */
    private native void kinesisVideoStreamFormatChanged(long clientHandle, long streamHandle,
                                                        final @Nullable byte[] codecPrivateData, long trackId)
            throws ProducerException;

    /**
     * Sends create device result event to SDK
     *
     * @param clientHandle client handle
     * @param deviceHandle device handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for createStream API
     * @param deviceArn device ARN if successful.
     * @throws ProducerException
     */
    private native void createDeviceResultEvent(long clientHandle, long deviceHandle, int httpStatusCode,
                                                final @Nullable String deviceArn) throws ProducerException;

    /**
     * Sends device certificate to token exchange result event to SDK
     *
     * @param clientHandle client handle
     * @param deviceHandle device object handle
     * @param httpStatusCode HTTP status code from Kinesis Video service for getStreamingToken API
     * @param token streaming token
     * @param tokenSize token size
     * @param tokenExpiration token expiration time in 100ns absolute time
     * @throws ProducerException
     */
    private native void deviceCertToTokenResultEvent(long clientHandle, long deviceHandle, int httpStatusCode,
                                                     final @Nullable byte[] token, int tokenSize, long tokenExpiration)
            throws ProducerException;

    /**
     * Reports an abnormal stream termination.
     *
     * @param clientHandle the handle of the client
     * @param streamHandle the handle of the stream
     * @param uploadHandle the client stream upload handle
     * @param statusCode the status code of the termination event
     * @throws ProducerException
     */
    private native void kinesisVideoStreamTerminated(long clientHandle, long streamHandle, long uploadHandle,
                                                     int statusCode)
            throws ProducerException;
}
