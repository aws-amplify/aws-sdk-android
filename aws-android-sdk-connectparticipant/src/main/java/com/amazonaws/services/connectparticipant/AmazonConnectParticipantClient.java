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

import java.util.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.services.connectparticipant.model.transform.*;

/**
 * Client for accessing Amazon Connect Participant. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
 */
public class AmazonConnectParticipantClient extends AmazonWebServiceClient implements
        AmazonConnectParticipant {
    /**
     * List of exception unmarshallers for all Amazon Connect Participant
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConnectParticipant.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     */
    public AmazonConnectParticipantClient() {
        this(new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConnectParticipant. All service calls made using this new client
     * object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonConnectParticipant (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonConnectParticipantClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConnectParticipant using the specified client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonConnectParticipant (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonConnectParticipantClient(ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonConnectParticipant using the specified client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonConnectParticipant (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonConnectParticipantClient(ClientConfiguration clientConfiguration,
            HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceQuotaExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("execute-api");
        this.setEndpoint("participant.connect.us-east-1.amazonaws.com");
        this.endpointPrefix = "participant.connect";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/connectparticipant/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/connectparticipant/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
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
     * @return completeAttachmentUploadResult The response from the
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
    public CompleteAttachmentUploadResult completeAttachmentUpload(
            CompleteAttachmentUploadRequest completeAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(completeAttachmentUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteAttachmentUploadRequest> request = null;
        Response<CompleteAttachmentUploadResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteAttachmentUploadRequestMarshaller()
                        .marshall(completeAttachmentUploadRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CompleteAttachmentUploadResult, JsonUnmarshallerContext> unmarshaller = new CompleteAttachmentUploadResultJsonUnmarshaller();
            JsonResponseHandler<CompleteAttachmentUploadResult> responseHandler = new JsonResponseHandler<CompleteAttachmentUploadResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return createParticipantConnectionResult The response from the
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
    public CreateParticipantConnectionResult createParticipantConnection(
            CreateParticipantConnectionRequest createParticipantConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createParticipantConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateParticipantConnectionRequest> request = null;
        Response<CreateParticipantConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateParticipantConnectionRequestMarshaller()
                        .marshall(createParticipantConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateParticipantConnectionResult, JsonUnmarshallerContext> unmarshaller = new CreateParticipantConnectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateParticipantConnectionResult> responseHandler = new JsonResponseHandler<CreateParticipantConnectionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return disconnectParticipantResult The response from the
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
    public DisconnectParticipantResult disconnectParticipant(
            DisconnectParticipantRequest disconnectParticipantRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disconnectParticipantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectParticipantRequest> request = null;
        Response<DisconnectParticipantResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectParticipantRequestMarshaller()
                        .marshall(disconnectParticipantRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisconnectParticipantResult, JsonUnmarshallerContext> unmarshaller = new DisconnectParticipantResultJsonUnmarshaller();
            JsonResponseHandler<DisconnectParticipantResult> responseHandler = new JsonResponseHandler<DisconnectParticipantResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return getAttachmentResult The response from the GetAttachment service
     *         method, as returned by Amazon Connect Participant.
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
    public GetAttachmentResult getAttachment(GetAttachmentRequest getAttachmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttachmentRequest> request = null;
        Response<GetAttachmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttachmentRequestMarshaller().marshall(getAttachmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAttachmentResult, JsonUnmarshallerContext> unmarshaller = new GetAttachmentResultJsonUnmarshaller();
            JsonResponseHandler<GetAttachmentResult> responseHandler = new JsonResponseHandler<GetAttachmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return getTranscriptResult The response from the GetTranscript service
     *         method, as returned by Amazon Connect Participant.
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
    public GetTranscriptResult getTranscript(GetTranscriptRequest getTranscriptRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTranscriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTranscriptRequest> request = null;
        Response<GetTranscriptResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTranscriptRequestMarshaller().marshall(getTranscriptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTranscriptResult, JsonUnmarshallerContext> unmarshaller = new GetTranscriptResultJsonUnmarshaller();
            JsonResponseHandler<GetTranscriptResult> responseHandler = new JsonResponseHandler<GetTranscriptResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return sendEventResult The response from the SendEvent service method,
     *         as returned by Amazon Connect Participant.
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
    public SendEventResult sendEvent(SendEventRequest sendEventRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendEventRequest> request = null;
        Response<SendEventResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendEventRequestMarshaller().marshall(sendEventRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendEventResult, JsonUnmarshallerContext> unmarshaller = new SendEventResultJsonUnmarshaller();
            JsonResponseHandler<SendEventResult> responseHandler = new JsonResponseHandler<SendEventResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return sendMessageResult The response from the SendMessage service
     *         method, as returned by Amazon Connect Participant.
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
    public SendMessageResult sendMessage(SendMessageRequest sendMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessageRequest> request = null;
        Response<SendMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessageRequestMarshaller().marshall(sendMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendMessageResult, JsonUnmarshallerContext> unmarshaller = new SendMessageResultJsonUnmarshaller();
            JsonResponseHandler<SendMessageResult> responseHandler = new JsonResponseHandler<SendMessageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * @return startAttachmentUploadResult The response from the
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
    public StartAttachmentUploadResult startAttachmentUpload(
            StartAttachmentUploadRequest startAttachmentUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startAttachmentUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAttachmentUploadRequest> request = null;
        Response<StartAttachmentUploadResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAttachmentUploadRequestMarshaller()
                        .marshall(startAttachmentUploadRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartAttachmentUploadResult, JsonUnmarshallerContext> unmarshaller = new StartAttachmentUploadResultJsonUnmarshaller();
            JsonResponseHandler<StartAttachmentUploadResult> responseHandler = new JsonResponseHandler<StartAttachmentUploadResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request The originally executed request
     * @return The response metadata for the specified request, or null if none
     *         is available.
     * @deprecated ResponseMetadata cache can hold up to 50 requests and
     *             responses in memory and will cause memory issue. This method
     *             now always returns null.
     */
    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
