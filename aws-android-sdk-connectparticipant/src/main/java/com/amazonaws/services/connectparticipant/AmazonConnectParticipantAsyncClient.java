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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

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
public class AmazonConnectParticipantAsyncClient extends AmazonConnectParticipantClient implements
        AmazonConnectParticipantAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect Participant.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     */
    public AmazonConnectParticipantAsyncClient() {
        this(Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect Participant.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to Amazon Connect Participant (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonConnectParticipantAsyncClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, Executors.newFixedThreadPool(clientConfiguration
                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect Participant using the specified executor service. Default client
     * settings will be used.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonConnectParticipantAsyncClient(ExecutorService executorService) {
        this(new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * Connect Participant using the specified executor service and client
     * configuration options.
     * <p>
     * All calls made using this new client object are non-blocking, and will
     * immediately return a Java Future object that the caller can later check
     * to see if the service call has actually completed.
     *
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public AmazonConnectParticipantAsyncClient(ClientConfiguration clientConfiguration,
            ExecutorService executorService) {
        super(clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }

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
    public Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(
            final CompleteAttachmentUploadRequest completeAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteAttachmentUploadResult>() {
            public CompleteAttachmentUploadResult call() throws Exception {
                return completeAttachmentUpload(completeAttachmentUploadRequest);
            }
        });
    }

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
    public Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(
            final CompleteAttachmentUploadRequest completeAttachmentUploadRequest,
            final AsyncHandler<CompleteAttachmentUploadRequest, CompleteAttachmentUploadResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CompleteAttachmentUploadResult>() {
            public CompleteAttachmentUploadResult call() throws Exception {
                CompleteAttachmentUploadResult result = null;
                try {
                    result = completeAttachmentUpload(completeAttachmentUploadRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(completeAttachmentUploadRequest, result);
                return result;
            }
        });
    }

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
    public Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            final CreateParticipantConnectionRequest createParticipantConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateParticipantConnectionResult>() {
            public CreateParticipantConnectionResult call() throws Exception {
                return createParticipantConnection(createParticipantConnectionRequest);
            }
        });
    }

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
    public Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            final CreateParticipantConnectionRequest createParticipantConnectionRequest,
            final AsyncHandler<CreateParticipantConnectionRequest, CreateParticipantConnectionResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateParticipantConnectionResult>() {
            public CreateParticipantConnectionResult call() throws Exception {
                CreateParticipantConnectionResult result = null;
                try {
                    result = createParticipantConnection(createParticipantConnectionRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(createParticipantConnectionRequest, result);
                return result;
            }
        });
    }

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
    public Future<DisconnectParticipantResult> disconnectParticipantAsync(
            final DisconnectParticipantRequest disconnectParticipantRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisconnectParticipantResult>() {
            public DisconnectParticipantResult call() throws Exception {
                return disconnectParticipant(disconnectParticipantRequest);
            }
        });
    }

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
    public Future<DisconnectParticipantResult> disconnectParticipantAsync(
            final DisconnectParticipantRequest disconnectParticipantRequest,
            final AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisconnectParticipantResult>() {
            public DisconnectParticipantResult call() throws Exception {
                DisconnectParticipantResult result = null;
                try {
                    result = disconnectParticipant(disconnectParticipantRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(disconnectParticipantRequest, result);
                return result;
            }
        });
    }

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
    public Future<GetAttachmentResult> getAttachmentAsync(
            final GetAttachmentRequest getAttachmentRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetAttachmentResult>() {
            public GetAttachmentResult call() throws Exception {
                return getAttachment(getAttachmentRequest);
            }
        });
    }

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
    public Future<GetAttachmentResult> getAttachmentAsync(
            final GetAttachmentRequest getAttachmentRequest,
            final AsyncHandler<GetAttachmentRequest, GetAttachmentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetAttachmentResult>() {
            public GetAttachmentResult call() throws Exception {
                GetAttachmentResult result = null;
                try {
                    result = getAttachment(getAttachmentRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getAttachmentRequest, result);
                return result;
            }
        });
    }

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
    public Future<GetTranscriptResult> getTranscriptAsync(
            final GetTranscriptRequest getTranscriptRequest) throws AmazonServiceException,
            AmazonClientException {
        return executorService.submit(new Callable<GetTranscriptResult>() {
            public GetTranscriptResult call() throws Exception {
                return getTranscript(getTranscriptRequest);
            }
        });
    }

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
    public Future<GetTranscriptResult> getTranscriptAsync(
            final GetTranscriptRequest getTranscriptRequest,
            final AsyncHandler<GetTranscriptRequest, GetTranscriptResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTranscriptResult>() {
            public GetTranscriptResult call() throws Exception {
                GetTranscriptResult result = null;
                try {
                    result = getTranscript(getTranscriptRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(getTranscriptRequest, result);
                return result;
            }
        });
    }

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
    public Future<SendEventResult> sendEventAsync(final SendEventRequest sendEventRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEventResult>() {
            public SendEventResult call() throws Exception {
                return sendEvent(sendEventRequest);
            }
        });
    }

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
    public Future<SendEventResult> sendEventAsync(final SendEventRequest sendEventRequest,
            final AsyncHandler<SendEventRequest, SendEventResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEventResult>() {
            public SendEventResult call() throws Exception {
                SendEventResult result = null;
                try {
                    result = sendEvent(sendEventRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendEventRequest, result);
                return result;
            }
        });
    }

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
    public Future<SendMessageResult> sendMessageAsync(final SendMessageRequest sendMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageResult>() {
            public SendMessageResult call() throws Exception {
                return sendMessage(sendMessageRequest);
            }
        });
    }

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
    public Future<SendMessageResult> sendMessageAsync(final SendMessageRequest sendMessageRequest,
            final AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendMessageResult>() {
            public SendMessageResult call() throws Exception {
                SendMessageResult result = null;
                try {
                    result = sendMessage(sendMessageRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(sendMessageRequest, result);
                return result;
            }
        });
    }

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
    public Future<StartAttachmentUploadResult> startAttachmentUploadAsync(
            final StartAttachmentUploadRequest startAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAttachmentUploadResult>() {
            public StartAttachmentUploadResult call() throws Exception {
                return startAttachmentUpload(startAttachmentUploadRequest);
            }
        });
    }

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
    public Future<StartAttachmentUploadResult> startAttachmentUploadAsync(
            final StartAttachmentUploadRequest startAttachmentUploadRequest,
            final AsyncHandler<StartAttachmentUploadRequest, StartAttachmentUploadResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<StartAttachmentUploadResult>() {
            public StartAttachmentUploadResult call() throws Exception {
                StartAttachmentUploadResult result = null;
                try {
                    result = startAttachmentUpload(startAttachmentUploadRequest);
                } catch (Exception ex) {
                    asyncHandler.onError(ex);
                    throw ex;
                }
                asyncHandler.onSuccess(startAttachmentUploadRequest, result);
                return result;
            }
        });
    }

}
