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

import com.amazonaws.kinesisvideo.producer.ProducerException;
import com.amazonaws.kinesisvideo.producer.Tag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 *
 * Interface to the KinesisVideo Producer Stream Service Callbacks functionality.
 *
 * These will be used for scheduling and managing
 * the service calls.
 *
 *
 */
public interface ServiceCallbacks
{
    /**
     * Initializes the callbacks object
     * @param kinesisVideoProducer Reference to {@link KinesisVideoProducer} for the eventing.
     * @throws ProducerException
     */
    void initialize(final @NonNull KinesisVideoProducer kinesisVideoProducer) throws ProducerException;

    /**
     * Frees the callbacks object.
     */
    void free();

    /**
     * Returns whether the object is initialized
     * @return whether the object is initialized
     */
    boolean isInitialized();

    /**
     * Schedules a call to create stream
     * @param deviceName - Device name
     * @param streamName - Stream name
     * @param contentType - Stream content type
     * @param kmsKeyId - KMS Key Id
     * @param retentionPeriod - Stream retention period - 100ns
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void createStream(final @NonNull String deviceName,
            final @NonNull String streamName,
            final @NonNull String contentType,
            final @Nullable String kmsKeyId,
            long retentionPeriod,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to describe stream
     * @param streamName - Stream name
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void describeStream(final @NonNull String streamName,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to get streaming endpoint
     * @param streamName - Stream name
     * @param apiName - API name to call
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void getStreamingEndpoint(final @NonNull String streamName,
            final @NonNull String apiName,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to get streaming token
     * @param streamName - Stream name
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void getStreamingToken(final @NonNull String streamName,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to put stream API
     * @param streamName - Stream name
     * @param containerType - Container type
     * @param streamStartTime - Stream start timestamp
     * @param absoluteFragmentTimes - Whether to use absolute fragment times
     * @param ackRequired - Whether an application level ACK is required
     * @param streamingEndpoint - The streaming endpoint to use
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void putStream(final @NonNull String streamName,
            final @NonNull String containerType,
            long streamStartTime,
            boolean absoluteFragmentTimes,
            boolean ackRequired,
            final @NonNull String streamingEndpoint,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to tag resource API
     * @param resourceArn - Resource ARN
     * @param tags - Tags to apply
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void tagResource(final @NonNull String resourceArn,
            final @Nullable Tag[] tags,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to create device
     * @param deviceName - Device name
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void createDevice(final @NonNull String deviceName,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Schedules a call to device certificate to token API
     * @param deviceName - Device name
     * @param callAfter - Call after this time - 100ns
     * @param timeout - Time out for the call - 100ns
     * @param authData - Authentication bits
     * @param authType - Authentication type - this is the AUTH_INFO_TYPE defined in /src/client/Include.h
     * @param customData - Custom data to use to call the event functions
     * @throws ProducerException
     */
    void deviceCertToToken(final @NonNull String deviceName,
            long callAfter,
            long timeout,
            final @Nullable byte[] authData,
            int authType,
            long customData) throws ProducerException;

    /**
     * Add a producer stream to ongoing stream list
     * @param kinesisVideoProducerStream producer stream used by PIC
     */
    void addStream(@NonNull final KinesisVideoProducerStream kinesisVideoProducerStream);

    /**
     * Removes a producer stream to ongoing stream list
     * @param kinesisVideoProducerStream producer stream used by PIC
     */
    void removeStream(@NonNull final KinesisVideoProducerStream kinesisVideoProducerStream);
}
