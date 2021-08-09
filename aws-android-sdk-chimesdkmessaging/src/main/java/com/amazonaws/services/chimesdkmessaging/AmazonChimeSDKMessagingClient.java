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

package com.amazonaws.services.chimesdkmessaging;

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

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.services.chimesdkmessaging.model.transform.*;

/**
 * Client for accessing Amazon ChimeSDK Messaging. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Messaging APIs in this section allow software developers
 * to send and receive messages in custom messaging applications. These APIs
 * depend on the frameworks provided by the Amazon Chime SDK Identity APIs. For
 * more information about the messaging APIs, see .
 * </p>
 */
public class AmazonChimeSDKMessagingClient extends AmazonWebServiceClient implements
        AmazonChimeSDKMessaging {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon ChimeSDK Messaging
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonChimeSDKMessagingClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKMessaging (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonChimeSDKMessagingClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonChimeSDKMessagingClient client = new AmazonChimeSDKMessagingClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonChimeSDKMessagingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials and
     * client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided in this constructor. Static AWSCredentials can be passed for
     * quick testing. However, it is strongly recommended to use Amazon Cognito
     * vended temporary credentials for use in production. This can be achieved
     * by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonChimeSDKMessagingClient client = new AmazonChimeSDKMessagingClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKMessaging (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonChimeSDKMessagingClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials
     * provider.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonChimeSDKMessagingClient client = new AmazonChimeSDKMessagingClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonChimeSDKMessagingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials
     * provider and client configuration options.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonChimeSDKMessagingClient client = new AmazonChimeSDKMessagingClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKMessaging (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonChimeSDKMessagingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKMessaging (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonChimeSDKMessagingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonChimeSDKMessaging using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * The client requests are authenticated using the {@link AWSCredentials}
     * provided by the {@link AWSCredentialsProvider}. Static AWSCredentials can
     * be passed for quick testing. However, it is strongly recommended to use
     * Amazon Cognito vended temporary credentials for use in production. This
     * can be achieved by using {@link AWSMobileClient}. Please see
     * https://aws-amplify.github.io/docs/android/authentication for
     * instructions on how to enable {@link AWSMobileClient}.
     *
     * <pre>
     * AWSMobileClient.getInstance().initialize(getApplicationContext(), new Callback&lt;UserStateDetails&gt;() {
     *     &#064;Override
     *     public void onResult(final UserStateDetails details) {
     *         AmazonChimeSDKMessagingClient client = new AmazonChimeSDKMessagingClient(AWSMobileClient
     *                 .getInstance());
     *     }
     * 
     *     &#064;Override
     *     public void onError(final Exception e) {
     *         e.printStackTrace();
     *     }
     * });
     * </pre>
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonChimeSDKMessaging (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonChimeSDKMessagingClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottledClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("chime");
        this.setEndpoint("messaging-chime.us-east-1.amazonaws.com");
        this.endpointPrefix = "messaging-chime";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/chimesdkmessaging/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/chimesdkmessaging/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return batchCreateChannelMembershipResult The response from the
     *         BatchCreateChannelMembership service method, as returned by
     *         Amazon ChimeSDK Messaging.
     * @throws ServiceFailureException
     * @throws ServiceUnavailableException
     * @throws UnauthorizedClientException
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public BatchCreateChannelMembershipResult batchCreateChannelMembership(
            BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCreateChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateChannelMembershipRequest> request = null;
        Response<BatchCreateChannelMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateChannelMembershipRequestMarshaller()
                        .marshall(batchCreateChannelMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCreateChannelMembershipResult, JsonUnmarshallerContext> unmarshaller = new BatchCreateChannelMembershipResultJsonUnmarshaller();
            JsonResponseHandler<BatchCreateChannelMembershipResult> responseHandler = new JsonResponseHandler<BatchCreateChannelMembershipResult>(
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
     * Creates a channel to which you can add users and send messages.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelRequest
     * @return createChannelResult The response from the CreateChannel service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateChannelResult createChannel(CreateChannelRequest createChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelRequest> request = null;
        Response<CreateChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelRequestMarshaller().marshall(createChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateChannelResult, JsonUnmarshallerContext> unmarshaller = new CreateChannelResultJsonUnmarshaller();
            JsonResponseHandler<CreateChannelResult> responseHandler = new JsonResponseHandler<CreateChannelResult>(
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
     * Permanently bans a member from a channel. Moderators can't add banned
     * members to a channel. To undo a ban, you first have to
     * <code>DeleteChannelBan</code>, and then
     * <code>CreateChannelMembership</code>. Bans are cleaned up when you delete
     * users or channels.
     * </p>
     * <p>
     * If you ban a user who is already part of a channel, that user is
     * automatically kicked from the channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelBanRequest
     * @return createChannelBanResult The response from the CreateChannelBan
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateChannelBanResult createChannelBan(CreateChannelBanRequest createChannelBanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelBanRequest> request = null;
        Response<CreateChannelBanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelBanRequestMarshaller().marshall(createChannelBanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateChannelBanResult, JsonUnmarshallerContext> unmarshaller = new CreateChannelBanResultJsonUnmarshaller();
            JsonResponseHandler<CreateChannelBanResult> responseHandler = new JsonResponseHandler<CreateChannelBanResult>(
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
     * Adds a user to a channel. The <code>InvitedBy</code> response field is
     * derived from the request header. A channel member can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Send messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Receive messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Edit their own messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Leave the channel
     * </p>
     * </li>
     * </ul>
     * <p>
     * Privacy settings impact this action as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Public Channels: You do not need to be a member to list messages, but you
     * must be a member to send messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Private Channels: You must be a member to list or send messages.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelMembershipRequest
     * @return createChannelMembershipResult The response from the
     *         CreateChannelMembership service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateChannelMembershipResult createChannelMembership(
            CreateChannelMembershipRequest createChannelMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelMembershipRequest> request = null;
        Response<CreateChannelMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelMembershipRequestMarshaller()
                        .marshall(createChannelMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateChannelMembershipResult, JsonUnmarshallerContext> unmarshaller = new CreateChannelMembershipResultJsonUnmarshaller();
            JsonResponseHandler<CreateChannelMembershipResult> responseHandler = new JsonResponseHandler<CreateChannelMembershipResult>(
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
     * Creates a new <code>ChannelModerator</code>. A channel moderator can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add and remove other members of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove other moderators of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove user bans for the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redact messages in the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * List messages in the channel.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelModeratorRequest
     * @return createChannelModeratorResult The response from the
     *         CreateChannelModerator service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ResourceLimitExceededException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateChannelModeratorResult createChannelModerator(
            CreateChannelModeratorRequest createChannelModeratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelModeratorRequest> request = null;
        Response<CreateChannelModeratorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelModeratorRequestMarshaller()
                        .marshall(createChannelModeratorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateChannelModeratorResult, JsonUnmarshallerContext> unmarshaller = new CreateChannelModeratorResultJsonUnmarshaller();
            JsonResponseHandler<CreateChannelModeratorResult> responseHandler = new JsonResponseHandler<CreateChannelModeratorResult>(
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
     * Immediately makes a channel and its memberships inaccessible and marks
     * them for deletion. This is an irreversible process.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteChannel(DeleteChannelRequest deleteChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestMarshaller().marshall(deleteChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a user from a channel's ban list.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelBanRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteChannelBan(DeleteChannelBanRequest deleteChannelBanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelBanRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelBanRequestMarshaller().marshall(deleteChannelBanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a member from a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMembershipRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ConflictException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteChannelMembership(
            DeleteChannelMembershipRequest deleteChannelMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelMembershipRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelMembershipRequestMarshaller()
                        .marshall(deleteChannelMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a channel message. Only admins can perform this action. Deletion
     * makes messages inaccessible immediately. A background process deletes any
     * revisions created by <code>UpdateChannelMessage</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMessageRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteChannelMessage(DeleteChannelMessageRequest deleteChannelMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelMessageRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelMessageRequestMarshaller()
                        .marshall(deleteChannelMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a channel moderator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelModeratorRequest
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteChannelModerator(DeleteChannelModeratorRequest deleteChannelModeratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelModeratorRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelModeratorRequestMarshaller()
                        .marshall(deleteChannelModeratorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the full details of a channel in an Amazon Chime
     * <code>AppInstance</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelRequest
     * @return describeChannelResult The response from the DescribeChannel
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelRequest> request = null;
        Response<DescribeChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelRequestMarshaller().marshall(describeChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelResult> responseHandler = new JsonResponseHandler<DescribeChannelResult>(
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
     * Returns the full details of a channel ban.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelBanRequest
     * @return describeChannelBanResult The response from the DescribeChannelBan
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelBanResult describeChannelBan(
            DescribeChannelBanRequest describeChannelBanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelBanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelBanRequest> request = null;
        Response<DescribeChannelBanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelBanRequestMarshaller()
                        .marshall(describeChannelBanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelBanResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelBanResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelBanResult> responseHandler = new JsonResponseHandler<DescribeChannelBanResult>(
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
     * Returns the full details of a user's channel membership.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipRequest
     * @return describeChannelMembershipResult The response from the
     *         DescribeChannelMembership service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelMembershipResult describeChannelMembership(
            DescribeChannelMembershipRequest describeChannelMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelMembershipRequest> request = null;
        Response<DescribeChannelMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelMembershipRequestMarshaller()
                        .marshall(describeChannelMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelMembershipResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelMembershipResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelMembershipResult> responseHandler = new JsonResponseHandler<DescribeChannelMembershipResult>(
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
     * Returns the details of a channel based on the membership of the specified
     * <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipForAppInstanceUserRequest
     * @return describeChannelMembershipForAppInstanceUserResult The response
     *         from the DescribeChannelMembershipForAppInstanceUser service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelMembershipForAppInstanceUserResult describeChannelMembershipForAppInstanceUser(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelMembershipForAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelMembershipForAppInstanceUserRequest> request = null;
        Response<DescribeChannelMembershipForAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelMembershipForAppInstanceUserRequestMarshaller()
                        .marshall(describeChannelMembershipForAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelMembershipForAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelMembershipForAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelMembershipForAppInstanceUserResult> responseHandler = new JsonResponseHandler<DescribeChannelMembershipForAppInstanceUserResult>(
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
     * Returns the full details of a channel moderated by the specified
     * <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratedByAppInstanceUserRequest
     * @return describeChannelModeratedByAppInstanceUserResult The response from
     *         the DescribeChannelModeratedByAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelModeratedByAppInstanceUserResult describeChannelModeratedByAppInstanceUser(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelModeratedByAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelModeratedByAppInstanceUserRequest> request = null;
        Response<DescribeChannelModeratedByAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelModeratedByAppInstanceUserRequestMarshaller()
                        .marshall(describeChannelModeratedByAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelModeratedByAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelModeratedByAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelModeratedByAppInstanceUserResult> responseHandler = new JsonResponseHandler<DescribeChannelModeratedByAppInstanceUserResult>(
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
     * Returns the full details of a single ChannelModerator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratorRequest
     * @return describeChannelModeratorResult The response from the
     *         DescribeChannelModerator service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeChannelModeratorResult describeChannelModerator(
            DescribeChannelModeratorRequest describeChannelModeratorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeChannelModeratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChannelModeratorRequest> request = null;
        Response<DescribeChannelModeratorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChannelModeratorRequestMarshaller()
                        .marshall(describeChannelModeratorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeChannelModeratorResult, JsonUnmarshallerContext> unmarshaller = new DescribeChannelModeratorResultJsonUnmarshaller();
            JsonResponseHandler<DescribeChannelModeratorResult> responseHandler = new JsonResponseHandler<DescribeChannelModeratorResult>(
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
     * Gets the full details of a channel message.
     * </p>
     * <note>
     * <p>
     * The x-amz-chime-bearer request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param getChannelMessageRequest
     * @return getChannelMessageResult The response from the GetChannelMessage
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetChannelMessageResult getChannelMessage(
            GetChannelMessageRequest getChannelMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelMessageRequest> request = null;
        Response<GetChannelMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelMessageRequestMarshaller()
                        .marshall(getChannelMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetChannelMessageResult, JsonUnmarshallerContext> unmarshaller = new GetChannelMessageResultJsonUnmarshaller();
            JsonResponseHandler<GetChannelMessageResult> responseHandler = new JsonResponseHandler<GetChannelMessageResult>(
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
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return getMessagingSessionEndpointResult The response from the
     *         GetMessagingSessionEndpoint service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws UnauthorizedClientException
     * @throws ForbiddenException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetMessagingSessionEndpointResult getMessagingSessionEndpoint(
            GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMessagingSessionEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMessagingSessionEndpointRequest> request = null;
        Response<GetMessagingSessionEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMessagingSessionEndpointRequestMarshaller()
                        .marshall(getMessagingSessionEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMessagingSessionEndpointResult, JsonUnmarshallerContext> unmarshaller = new GetMessagingSessionEndpointResultJsonUnmarshaller();
            JsonResponseHandler<GetMessagingSessionEndpointResult> responseHandler = new JsonResponseHandler<GetMessagingSessionEndpointResult>(
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
     * Lists all the users banned from a particular channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelBansRequest
     * @return listChannelBansResult The response from the ListChannelBans
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelBansResult listChannelBans(ListChannelBansRequest listChannelBansRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelBansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelBansRequest> request = null;
        Response<ListChannelBansResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelBansRequestMarshaller().marshall(listChannelBansRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelBansResult, JsonUnmarshallerContext> unmarshaller = new ListChannelBansResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelBansResult> responseHandler = new JsonResponseHandler<ListChannelBansResult>(
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
     * Lists all channel memberships in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsRequest
     * @return listChannelMembershipsResult The response from the
     *         ListChannelMemberships service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelMembershipsResult listChannelMemberships(
            ListChannelMembershipsRequest listChannelMembershipsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMembershipsRequest> request = null;
        Response<ListChannelMembershipsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMembershipsRequestMarshaller()
                        .marshall(listChannelMembershipsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelMembershipsResult, JsonUnmarshallerContext> unmarshaller = new ListChannelMembershipsResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelMembershipsResult> responseHandler = new JsonResponseHandler<ListChannelMembershipsResult>(
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
     * Lists all channels that a particular <code>AppInstanceUser</code> is a
     * part of. Only an <code>AppInstanceAdmin</code> can call the API with a
     * user ARN that is not their own.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsForAppInstanceUserRequest
     * @return listChannelMembershipsForAppInstanceUserResult The response from
     *         the ListChannelMembershipsForAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelMembershipsForAppInstanceUserResult listChannelMembershipsForAppInstanceUser(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelMembershipsForAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMembershipsForAppInstanceUserRequest> request = null;
        Response<ListChannelMembershipsForAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMembershipsForAppInstanceUserRequestMarshaller()
                        .marshall(listChannelMembershipsForAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelMembershipsForAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new ListChannelMembershipsForAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelMembershipsForAppInstanceUserResult> responseHandler = new JsonResponseHandler<ListChannelMembershipsForAppInstanceUserResult>(
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
     * List all the messages in a channel. Returns a paginated list of
     * <code>ChannelMessages</code>. By default, sorted by creation timestamp in
     * descending order.
     * </p>
     * <note>
     * <p>
     * Redacted messages appear in the results as empty, since they are only
     * redacted, not deleted. Deleted messages do not appear in the results.
     * This action always returns the latest version of an edited message.
     * </p>
     * <p>
     * Also, the x-amz-chime-bearer request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMessagesRequest
     * @return listChannelMessagesResult The response from the
     *         ListChannelMessages service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelMessagesResult listChannelMessages(
            ListChannelMessagesRequest listChannelMessagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelMessagesRequest> request = null;
        Response<ListChannelMessagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelMessagesRequestMarshaller()
                        .marshall(listChannelMessagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelMessagesResult, JsonUnmarshallerContext> unmarshaller = new ListChannelMessagesResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelMessagesResult> responseHandler = new JsonResponseHandler<ListChannelMessagesResult>(
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
     * Lists all the moderators for a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelModeratorsRequest
     * @return listChannelModeratorsResult The response from the
     *         ListChannelModerators service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelModeratorsResult listChannelModerators(
            ListChannelModeratorsRequest listChannelModeratorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelModeratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelModeratorsRequest> request = null;
        Response<ListChannelModeratorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelModeratorsRequestMarshaller()
                        .marshall(listChannelModeratorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelModeratorsResult, JsonUnmarshallerContext> unmarshaller = new ListChannelModeratorsResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelModeratorsResult> responseHandler = new JsonResponseHandler<ListChannelModeratorsResult>(
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
     * Lists all Channels created under a single Chime App as a paginated list.
     * You can specify filters to narrow results.
     * </p>
     * <p class="title">
     * <b>Functionality &amp; restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use privacy = <code>PUBLIC</code> to retrieve all public channels in the
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only an <code>AppInstanceAdmin</code> can set privacy =
     * <code>PRIVATE</code> to list the private channels in an account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsRequest
     * @return listChannelsResult The response from the ListChannels service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestMarshaller().marshall(listChannelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelsResult, JsonUnmarshallerContext> unmarshaller = new ListChannelsResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelsResult> responseHandler = new JsonResponseHandler<ListChannelsResult>(
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
     * A list of the channels moderated by an <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsModeratedByAppInstanceUserRequest
     * @return listChannelsModeratedByAppInstanceUserResult The response from
     *         the ListChannelsModeratedByAppInstanceUser service method, as
     *         returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListChannelsModeratedByAppInstanceUserResult listChannelsModeratedByAppInstanceUser(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listChannelsModeratedByAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsModeratedByAppInstanceUserRequest> request = null;
        Response<ListChannelsModeratedByAppInstanceUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsModeratedByAppInstanceUserRequestMarshaller()
                        .marshall(listChannelsModeratedByAppInstanceUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListChannelsModeratedByAppInstanceUserResult, JsonUnmarshallerContext> unmarshaller = new ListChannelsModeratedByAppInstanceUserResultJsonUnmarshaller();
            JsonResponseHandler<ListChannelsModeratedByAppInstanceUserResult> responseHandler = new JsonResponseHandler<ListChannelsModeratedByAppInstanceUserResult>(
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
     * Redacts message content, but not metadata. The message exists in the back
     * end, but the action returns null content, and the state shows as
     * redacted.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param redactChannelMessageRequest
     * @return redactChannelMessageResult The response from the
     *         RedactChannelMessage service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public RedactChannelMessageResult redactChannelMessage(
            RedactChannelMessageRequest redactChannelMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(redactChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RedactChannelMessageRequest> request = null;
        Response<RedactChannelMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RedactChannelMessageRequestMarshaller()
                        .marshall(redactChannelMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RedactChannelMessageResult, JsonUnmarshallerContext> unmarshaller = new RedactChannelMessageResultJsonUnmarshaller();
            JsonResponseHandler<RedactChannelMessageResult> responseHandler = new JsonResponseHandler<RedactChannelMessageResult>(
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
     * Sends a message to a particular channel that the member is a part of.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * <p>
     * Also, <code>STANDARD</code> messages can contain 4KB of data and the 1KB
     * of metadata. <code>CONTROL</code> messages can contain 30 bytes of data
     * and no metadata.
     * </p>
     * </note>
     * 
     * @param sendChannelMessageRequest
     * @return sendChannelMessageResult The response from the SendChannelMessage
     *         service method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public SendChannelMessageResult sendChannelMessage(
            SendChannelMessageRequest sendChannelMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendChannelMessageRequest> request = null;
        Response<SendChannelMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendChannelMessageRequestMarshaller()
                        .marshall(sendChannelMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendChannelMessageResult, JsonUnmarshallerContext> unmarshaller = new SendChannelMessageResultJsonUnmarshaller();
            JsonResponseHandler<SendChannelMessageResult> responseHandler = new JsonResponseHandler<SendChannelMessageResult>(
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
     * Update a channel's attributes.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelRequest
     * @return updateChannelResult The response from the UpdateChannel service
     *         method, as returned by Amazon ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelRequest> request = null;
        Response<UpdateChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelRequestMarshaller().marshall(updateChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChannelResult> responseHandler = new JsonResponseHandler<UpdateChannelResult>(
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
     * Updates the content of a message.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelMessageRequest
     * @return updateChannelMessageResult The response from the
     *         UpdateChannelMessage service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws ForbiddenException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateChannelMessageResult updateChannelMessage(
            UpdateChannelMessageRequest updateChannelMessageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateChannelMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelMessageRequest> request = null;
        Response<UpdateChannelMessageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelMessageRequestMarshaller()
                        .marshall(updateChannelMessageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChannelMessageResult, JsonUnmarshallerContext> unmarshaller = new UpdateChannelMessageResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChannelMessageResult> responseHandler = new JsonResponseHandler<UpdateChannelMessageResult>(
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
     * The details of the time when a user last read messages in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the
     * <code>AppInstanceUserArn</code> of the user that makes the API call as
     * the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelReadMarkerRequest
     * @return updateChannelReadMarkerResult The response from the
     *         UpdateChannelReadMarker service method, as returned by Amazon
     *         ChimeSDK Messaging.
     * @throws BadRequestException
     * @throws ForbiddenException
     * @throws ConflictException
     * @throws UnauthorizedClientException
     * @throws ThrottledClientException
     * @throws ServiceUnavailableException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             ChimeSDK Messaging indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateChannelReadMarkerResult updateChannelReadMarker(
            UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateChannelReadMarkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelReadMarkerRequest> request = null;
        Response<UpdateChannelReadMarkerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelReadMarkerRequestMarshaller()
                        .marshall(updateChannelReadMarkerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChannelReadMarkerResult, JsonUnmarshallerContext> unmarshaller = new UpdateChannelReadMarkerResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChannelReadMarkerResult> responseHandler = new JsonResponseHandler<UpdateChannelReadMarkerResult>(
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

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
                jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
