/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.connectparticipant;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.connectparticipant.model.*;

/**
 * Interface for accessing Amazon Connect Participant asynchronously.
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to
 * set up and manage a customer contact center and provide reliable customer
 * engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect enables customer contacts through voice or chat.
 * </p>
 * <p>
 * The APIs described here are used by chat participants, such as agents and
 * customers.
 * </p>
 **/
public interface AmazonConnectParticipantAsync extends AmazonConnectParticipant {
    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used
     * for invoking this API instead of ConnectionToken.
     * </p>
     * <p>
     * The participant token is valid for the lifetime of the participant –
     * until the they are part of a contact.
     * </p>
     * <p>
     * The response URL for <code>WEBSOCKET</code> Type has a connect expiry
     * timeout of 100s. Clients must manually connect to the returned websocket
     * URL and subscribe to the desired topic.
     * </p>
     * <p>
     * For chat, you need to publish the following on the established websocket
     * connection:
     * </p>
     * <p>
     * <code>{"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}</code>
     * </p>
     * <p>
     * Upon websocket URL expiry, as specified in the response ConnectionExpiry
     * parameter, clients need to call this API again to obtain a new websocket
     * URL and perform the same steps as before.
     * </p>
     * 
     * @param createParticipantConnectionRequest
     * @return A Java Future object containing the response from the
     *         CreateParticipantConnection service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            CreateParticipantConnectionRequest createParticipantConnectionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used
     * for invoking this API instead of ConnectionToken.
     * </p>
     * <p>
     * The participant token is valid for the lifetime of the participant –
     * until the they are part of a contact.
     * </p>
     * <p>
     * The response URL for <code>WEBSOCKET</code> Type has a connect expiry
     * timeout of 100s. Clients must manually connect to the returned websocket
     * URL and subscribe to the desired topic.
     * </p>
     * <p>
     * For chat, you need to publish the following on the established websocket
     * connection:
     * </p>
     * <p>
     * <code>{"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}</code>
     * </p>
     * <p>
     * Upon websocket URL expiry, as specified in the response ConnectionExpiry
     * parameter, clients need to call this API again to obtain a new websocket
     * URL and perform the same steps as before.
     * </p>
     * 
     * @param createParticipantConnectionRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateParticipantConnection service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            CreateParticipantConnectionRequest createParticipantConnectionRequest,
            AsyncHandler<CreateParticipantConnectionRequest, CreateParticipantConnectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disconnects a participant. Note that ConnectionToken is used for invoking
     * this API instead of ParticipantToken.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return A Java Future object containing the response from the
     *         DisconnectParticipant service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<DisconnectParticipantResult> disconnectParticipantAsync(
            DisconnectParticipantRequest disconnectParticipantRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disconnects a participant. Note that ConnectionToken is used for invoking
     * this API instead of ParticipantToken.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DisconnectParticipant service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<DisconnectParticipantResult> disconnectParticipantAsync(
            DisconnectParticipantRequest disconnectParticipantRequest,
            AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a transcript of the session. Note that ConnectionToken is used
     * for invoking this API instead of ParticipantToken.
     * </p>
     * 
     * @param getTranscriptRequest
     * @return A Java Future object containing the response from the
     *         GetTranscript service method, as returned by Amazon Connect
     *         Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest getTranscriptRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a transcript of the session. Note that ConnectionToken is used
     * for invoking this API instead of ParticipantToken.
     * </p>
     * 
     * @param getTranscriptRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTranscript service method, as returned by Amazon Connect
     *         Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest getTranscriptRequest,
            AsyncHandler<GetTranscriptRequest, GetTranscriptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an event. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * 
     * @param sendEventRequest
     * @return A Java Future object containing the response from the SendEvent
     *         service method, as returned by Amazon Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends an event. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * 
     * @param sendEventRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendEvent
     *         service method, as returned by Amazon Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest,
            AsyncHandler<SendEventRequest, SendEventResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a message. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * 
     * @param sendMessageRequest
     * @return A Java Future object containing the response from the SendMessage
     *         service method, as returned by Amazon Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sends a message. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * 
     * @param sendMessageRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the SendMessage
     *         service method, as returned by Amazon Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest,
            AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
