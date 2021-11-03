/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Allows you to confirm that the attachment has been uploaded using the
     * pre-signed URL provided in StartAttachmentUpload API.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @return A Java Future object containing the response from the
     *         CompleteAttachmentUpload service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(
            CompleteAttachmentUploadRequest completeAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows you to confirm that the attachment has been uploaded using the
     * pre-signed URL provided in StartAttachmentUpload API.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CompleteAttachmentUpload service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(
            CompleteAttachmentUploadRequest completeAttachmentUploadRequest,
            AsyncHandler<CompleteAttachmentUploadRequest, CompleteAttachmentUploadResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used
     * for invoking this API instead of ConnectionToken.
     * </p>
     * <p>
     * The participant token is valid for the lifetime of the participant –
     * until they are part of a contact.
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
     * <p>
     * <b>Message streaming support</b>: This API can also be used together with
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API to create a participant connection for
     * chat contacts that are not using a websocket. For more information about
     * message streaming, <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Feature specifications</b>: For information about feature
     * specifications, such as the allowed number of open websocket connections
     * per participant, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * </note>
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
     * until they are part of a contact.
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
     * <p>
     * <b>Message streaming support</b>: This API can also be used together with
     * the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API to create a participant connection for
     * chat contacts that are not using a websocket. For more information about
     * message streaming, <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html"
     * >Enable real-time chat message streaming</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Feature specifications</b>: For information about feature
     * specifications, such as the allowed number of open websocket connections
     * per participant, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * </note>
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * Provides a pre-signed URL for download of a completed attachment. This is
     * an asynchronous API for use with active contacts.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param getAttachmentRequest
     * @return A Java Future object containing the response from the
     *         GetAttachment service method, as returned by Amazon Connect
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
    Future<GetAttachmentResult> getAttachmentAsync(GetAttachmentRequest getAttachmentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a pre-signed URL for download of a completed attachment. This is
     * an asynchronous API for use with active contacts.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param getAttachmentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetAttachment service method, as returned by Amazon Connect
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
    Future<GetAttachmentResult> getAttachmentAsync(GetAttachmentRequest getAttachmentRequest,
            AsyncHandler<GetAttachmentRequest, GetAttachmentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a transcript of the session, including details about any
     * attachments. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * Retrieves a transcript of the session, including details about any
     * attachments. Note that ConnectionToken is used for invoking this API
     * instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
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

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file
     * directly to S3.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @return A Java Future object containing the response from the
     *         StartAttachmentUpload service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<StartAttachmentUploadResult> startAttachmentUploadAsync(
            StartAttachmentUploadRequest startAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file
     * directly to S3.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 authentication</a>.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartAttachmentUpload service method, as returned by Amazon
     *         Connect Participant.
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Connect Participant indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    Future<StartAttachmentUploadResult> startAttachmentUploadAsync(
            StartAttachmentUploadRequest startAttachmentUploadRequest,
            AsyncHandler<StartAttachmentUploadRequest, StartAttachmentUploadResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
