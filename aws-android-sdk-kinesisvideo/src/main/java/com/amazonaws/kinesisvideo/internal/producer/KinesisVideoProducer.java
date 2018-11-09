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

package com.amazonaws.kinesisvideo.internal.producer;

import com.amazonaws.kinesisvideo.producer.DeviceInfo;
import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.StreamCallbacks;
import com.amazonaws.kinesisvideo.producer.StreamDescription;
import com.amazonaws.kinesisvideo.producer.StreamInfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Interface to the Kinesis Video Producer functionality
 */
public interface KinesisVideoProducer {
    /**
     * Ready timeout value in milliseconds for the sync API
     */
    public static final long READY_TIMEOUT_IN_MILLISECONDS = 5000;

    /**
     * Returns whether the client has been initialized
     */
    boolean isInitialized();

    /**
     * Returns whether the client has been initialized and ready for the stream to be created.
     */
    boolean isReady();

    /**
     * Creates the underlying producer client.
     *
     * @param deviceInfo {@link DeviceInfo} object
     * @throws ProducerException
     */
    void create(@NonNull final DeviceInfo deviceInfo) throws ProducerException;

    /**
     * Creates the underlying producer client synchronously.
     *
     * @param deviceInfo {@link DeviceInfo} object
     * @throws ProducerException
     */
    void createSync(@NonNull final DeviceInfo deviceInfo) throws ProducerException;

    /**
     * Stops the streams and frees/releases the underlying object
     */
    void free() throws ProducerException;

    /**
     * Frees all of the underlying streams
     * @throws ProducerException
     */
    void freeStreams() throws ProducerException;

    /**
     * Stops all the streams
     */
    void stopStreams() throws ProducerException;

    /**
     * Creates Kinesis Video stream
     *
     * @param streamInfo      Stream information {@link StreamInfo} object
     * @param streamCallbacks Optional stream callnbacks {@link StreamCallbacks}
     * @return The newly created stream
     * @throws ProducerException
     */
    @NonNull
    KinesisVideoProducerStream createStream(final @NonNull StreamInfo streamInfo,
                                      final @Nullable StreamCallbacks streamCallbacks) throws ProducerException;

    /**
     * Creates Kinesis Video stream synchronously
     *
     * @param streamInfo      Stream information {@link StreamInfo} object
     * @param streamCallbacks Optional stream callnbacks {@link StreamCallbacks}
     * @return The newly created stream
     * @throws ProducerException
     */
    @NonNull
    KinesisVideoProducerStream createStreamSync(final @NonNull StreamInfo streamInfo,
                                          final @Nullable StreamCallbacks streamCallbacks) throws ProducerException;

    /**
     * Frees the specified stream
     * @param stream Stream to free
     * @throws ProducerException
     */
    void freeStream(final @NonNull KinesisVideoProducerStream stream) throws ProducerException;

    /**
     * CreateStream result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param streamArn      Newly create stream ARN on success
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void createStreamResult(final long customData, final @Nullable String streamArn, int httpStatusCode) throws ProducerException;

    /**
     * DescribeStream result event
     *
     * @param customData        Custom data that should be passed to the engine
     * @param streamDescription Stream description object
     * @param httpStatusCode    HTTP status code
     * @throws ProducerException
     */
    void describeStreamResult(final long customData,
                              final @Nullable StreamDescription streamDescription,
                              int httpStatusCode) throws ProducerException;

    /**
     * GetStreamingEndpoint result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param endpoint       Streaming endpoint if successful
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void getStreamingEndpointResult(final long customData, final @Nullable String endpoint,
                                    int httpStatusCode)
            throws ProducerException;

    /**
     * GetStreamingToken result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param token          Streaming token if successful
     * @param expiration     Streaming token expiration in absolute time in 100ns
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void getStreamingTokenResult(final long customData, final @Nullable byte[] token, long expiration, int httpStatusCode)
            throws ProducerException;

    /**
     * PutStream result event
     *
     * @param customData         Custom data that should be passed to the engine
     * @param clientStreamHandle A stream handle identifier from the client side
     * @param httpStatusCode     HTTP status code
     * @throws ProducerException
     */
    void putStreamResult(final long customData, long clientStreamHandle, int httpStatusCode)
            throws ProducerException;

    /**
     * TagResource result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void tagResourceResult(final long customData, int httpStatusCode)
            throws ProducerException;

    /**
     * CreateDevice result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param deviceArn      Newly create device ARN on success
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void createDeviceResult(final long customData, final @Nullable String deviceArn, int httpStatusCode)
            throws ProducerException;

    /**
     * DeviceCertToToken result event
     *
     * @param customData     Custom data that should be passed to the engine
     * @param token          Security token if successful
     * @param expiration     Streaming token expiration in absolute time in 100ns
     * @param httpStatusCode HTTP status code
     * @throws ProducerException
     */
    void deviceCertToTokenResult(final long customData, final @Nullable byte[] token, long expiration, int httpStatusCode)
            throws ProducerException;

    @NonNull
    KinesisVideoMetrics getMetrics()
            throws ProducerException;
}
