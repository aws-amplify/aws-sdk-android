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

package com.amazonaws.services.awselementalmedialive;

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

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.services.awselementalmedialive.model.transform.*;

/**
 * Client for accessing AWS Elemental MediaLive. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * API for AWS Elemental MediaLive
 */
public class AWSElementalMediaLiveClient extends AmazonWebServiceClient implements
        AWSElementalMediaLive {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Elemental MediaLive
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive. A credentials provider chain will be used that
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
    public AWSElementalMediaLiveClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive. A credentials provider chain will be used that
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
     *            how this client connects to AWSElementalMediaLive (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSElementalMediaLiveClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials.
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
     *         AWSElementalMediaLiveClient client = new AWSElementalMediaLiveClient(AWSMobileClient
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
    public AWSElementalMediaLiveClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials and
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
     *         AWSElementalMediaLiveClient client = new AWSElementalMediaLiveClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaLive (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSElementalMediaLiveClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials
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
     *         AWSElementalMediaLiveClient client = new AWSElementalMediaLiveClient(AWSMobileClient
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
    public AWSElementalMediaLiveClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials
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
     *         AWSElementalMediaLiveClient client = new AWSElementalMediaLiveClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaLive (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSElementalMediaLiveClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSElementalMediaLive (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSElementalMediaLiveClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSElementalMediaLive using the specified AWS account credentials
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
     *         AWSElementalMediaLiveClient client = new AWSElementalMediaLiveClient(AWSMobileClient
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
     *            how this client connects to AWSElementalMediaLive (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSElementalMediaLiveClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadGatewayExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new GatewayTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnprocessableEntityExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("medialive.us-east-1.amazonaws.com");
        this.endpointPrefix = "medialive";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awselementalmedialive/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awselementalmedialive/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * Update a channel schedule
     * 
     * @param batchUpdateScheduleRequest List of actions to create and list of
     *            actions to delete.
     * @return batchUpdateScheduleResult The response from the
     *         BatchUpdateSchedule service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The update schedule request failed
     *             validation.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The specified channel id does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on update
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public BatchUpdateScheduleResult batchUpdateSchedule(
            BatchUpdateScheduleRequest batchUpdateScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchUpdateScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateScheduleRequest> request = null;
        Response<BatchUpdateScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateScheduleRequestMarshaller()
                        .marshall(batchUpdateScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchUpdateScheduleResult, JsonUnmarshallerContext> unmarshaller = new BatchUpdateScheduleResultJsonUnmarshaller();
            JsonResponseHandler<BatchUpdateScheduleResult> responseHandler = new JsonResponseHandler<BatchUpdateScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest A request to create a channel
     * @return createChannelResult The response from the CreateChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The Channel failed validation and
     *             could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to create the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on create channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to create due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
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
     * Create an input
     * 
     * @param createInputRequest The name of the input
     * @return createInputResult The response from the CreateInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateInputResult createInput(CreateInputRequest createInputRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputRequest> request = null;
        Response<CreateInputResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputRequestMarshaller().marshall(createInputRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInputResult, JsonUnmarshallerContext> unmarshaller = new CreateInputResultJsonUnmarshaller();
            JsonResponseHandler<CreateInputResult> responseHandler = new JsonResponseHandler<CreateInputResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest The IPv4 CIDRs to whitelist for
     *            this Input Security Group
     * @return createInputSecurityGroupResult The response from the
     *         CreateInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to create an Input Security Group
     *             was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             create an Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateInputSecurityGroupResult createInputSecurityGroup(
            CreateInputSecurityGroupRequest createInputSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInputSecurityGroupRequest> request = null;
        Response<CreateInputSecurityGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInputSecurityGroupRequestMarshaller()
                        .marshall(createInputSecurityGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInputSecurityGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateInputSecurityGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateInputSecurityGroupResult> responseHandler = new JsonResponseHandler<CreateInputSecurityGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new multiplex.
     * 
     * @param createMultiplexRequest A request to create a multiplex.
     * @return createMultiplexResult The response from the CreateMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The Multiplex failed validation and
     *             could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to create the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on create
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to create due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateMultiplexResult createMultiplex(CreateMultiplexRequest createMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMultiplexRequest> request = null;
        Response<CreateMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMultiplexRequestMarshaller().marshall(createMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMultiplexResult, JsonUnmarshallerContext> unmarshaller = new CreateMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<CreateMultiplexResult> responseHandler = new JsonResponseHandler<CreateMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create a new program in the multiplex.
     * 
     * @param createMultiplexProgramRequest A request to create a program in a
     *            multiplex.
     * @return createMultiplexProgramResult The response from the
     *         CreateMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The Multiplex program failed
     *             validation and could not be created.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to create a
     *             program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on create
     *             multiplex program calls to multiplex service.
     * @throws ConflictException The multiplex program is unable to create due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateMultiplexProgramResult createMultiplexProgram(
            CreateMultiplexProgramRequest createMultiplexProgramRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMultiplexProgramRequest> request = null;
        Response<CreateMultiplexProgramResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMultiplexProgramRequestMarshaller()
                        .marshall(createMultiplexProgramRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMultiplexProgramResult, JsonUnmarshallerContext> unmarshaller = new CreateMultiplexProgramResultJsonUnmarshaller();
            JsonResponseHandler<CreateMultiplexProgramResult> responseHandler = new JsonResponseHandler<CreateMultiplexProgramResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Create tags for a resource
     * 
     * @param createTagsRequest Placeholder documentation for CreateTagsRequest
     * @throws NotFoundException The arn was not found.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestMarshaller().marshall(createTagsRequest);
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
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest Placeholder documentation for
     *            DeleteChannelRequest
     * @return deleteChannelResult The response from the DeleteChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to delete the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to delete does
     *             not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on delete channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to delete due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<DeleteChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestMarshaller().marshall(deleteChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteChannelResult> responseHandler = new JsonResponseHandler<DeleteChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest Placeholder documentation for
     *            DeleteInputRequest
     * @return deleteInputResult The response from the DeleteInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws ConflictException Resource conflict
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteInputResult deleteInput(DeleteInputRequest deleteInputRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputRequest> request = null;
        Response<DeleteInputResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputRequestMarshaller().marshall(deleteInputRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInputResult, JsonUnmarshallerContext> unmarshaller = new DeleteInputResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInputResult> responseHandler = new JsonResponseHandler<DeleteInputResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest Placeholder documentation for
     *            DeleteInputSecurityGroupRequest
     * @return deleteInputSecurityGroupResult The response from the
     *         DeleteInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to delete the Input Security
     *             Group was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             delete this Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input Security Group not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteInputSecurityGroupResult deleteInputSecurityGroup(
            DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInputSecurityGroupRequest> request = null;
        Response<DeleteInputSecurityGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInputSecurityGroupRequestMarshaller()
                        .marshall(deleteInputSecurityGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInputSecurityGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteInputSecurityGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInputSecurityGroupResult> responseHandler = new JsonResponseHandler<DeleteInputSecurityGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete a multiplex. The multiplex must be idle.
     * 
     * @param deleteMultiplexRequest Placeholder documentation for
     *            DeleteMultiplexRequest
     * @return deleteMultiplexResult The response from the DeleteMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to delete the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to delete
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to delete due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteMultiplexResult deleteMultiplex(DeleteMultiplexRequest deleteMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMultiplexRequest> request = null;
        Response<DeleteMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMultiplexRequestMarshaller().marshall(deleteMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMultiplexResult, JsonUnmarshallerContext> unmarshaller = new DeleteMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMultiplexResult> responseHandler = new JsonResponseHandler<DeleteMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete a program from a multiplex.
     * 
     * @param deleteMultiplexProgramRequest Placeholder documentation for
     *            DeleteMultiplexProgramRequest
     * @return deleteMultiplexProgramResult The response from the
     *         DeleteMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to delete the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The program that you are trying to delete
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             multiplex program calls to multiplex service.
     * @throws ConflictException The multiplex program is unable to delete due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteMultiplexProgramResult deleteMultiplexProgram(
            DeleteMultiplexProgramRequest deleteMultiplexProgramRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMultiplexProgramRequest> request = null;
        Response<DeleteMultiplexProgramResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMultiplexProgramRequestMarshaller()
                        .marshall(deleteMultiplexProgramRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMultiplexProgramResult, JsonUnmarshallerContext> unmarshaller = new DeleteMultiplexProgramResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMultiplexProgramResult> responseHandler = new JsonResponseHandler<DeleteMultiplexProgramResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an expired reservation.
     * 
     * @param deleteReservationRequest Placeholder documentation for
     *            DeleteReservationRequest
     * @return deleteReservationResult The response from the DeleteReservation
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to delete
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation you're attempting to delete does
     *             not exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             reservation request
     * @throws ConflictException The reservation could not be deleted because it
     *             is currently active.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteReservationResult deleteReservation(
            DeleteReservationRequest deleteReservationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReservationRequest> request = null;
        Response<DeleteReservationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReservationRequestMarshaller()
                        .marshall(deleteReservationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteReservationResult, JsonUnmarshallerContext> unmarshaller = new DeleteReservationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteReservationResult> responseHandler = new JsonResponseHandler<DeleteReservationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete all schedule actions on a channel.
     * 
     * @param deleteScheduleRequest Placeholder documentation for
     *            DeleteScheduleRequest
     * @return deleteScheduleResult The response from the DeleteSchedule service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to delete the schedule on this
     *             channel was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to delete the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The specified channel does not exist to have
     *             its schedule deleted.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on delete
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduleRequest> request = null;
        Response<DeleteScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduleRequestMarshaller().marshall(deleteScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteScheduleResult, JsonUnmarshallerContext> unmarshaller = new DeleteScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DeleteScheduleResult> responseHandler = new JsonResponseHandler<DeleteScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Removes tags for a resource
     * 
     * @param deleteTagsRequest Placeholder documentation for DeleteTagsRequest
     * @throws NotFoundException The arn was not found.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(deleteTagsRequest);
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
     * Gets details about a channel
     * 
     * @param describeChannelRequest Placeholder documentation for
     *            DescribeChannelRequest
     * @return describeChannelResult The response from the DescribeChannel
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to describe the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to describe does
     *             not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             channel calls to channel service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
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
     * Produces details about an input
     * 
     * @param describeInputRequest Placeholder documentation for
     *            DescribeInputRequest
     * @return describeInputResult The response from the DescribeInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeInputResult describeInput(DescribeInputRequest describeInputRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputRequest> request = null;
        Response<DescribeInputResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputRequestMarshaller().marshall(describeInputRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInputResult, JsonUnmarshallerContext> unmarshaller = new DescribeInputResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInputResult> responseHandler = new JsonResponseHandler<DescribeInputResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest Placeholder documentation for
     *            DescribeInputSecurityGroupRequest
     * @return describeInputSecurityGroupResult The response from the
     *         DescribeInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to describe an Input Security
     *             Group was Invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             describe this Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException Input Security Group not found
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeInputSecurityGroupResult describeInputSecurityGroup(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInputSecurityGroupRequest> request = null;
        Response<DescribeInputSecurityGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInputSecurityGroupRequestMarshaller()
                        .marshall(describeInputSecurityGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeInputSecurityGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeInputSecurityGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeInputSecurityGroupResult> responseHandler = new JsonResponseHandler<DescribeInputSecurityGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Gets details about a multiplex.
     * 
     * @param describeMultiplexRequest Placeholder documentation for
     *            DescribeMultiplexRequest
     * @return describeMultiplexResult The response from the DescribeMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to describe the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to describe
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             multiplex calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeMultiplexResult describeMultiplex(
            DescribeMultiplexRequest describeMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMultiplexRequest> request = null;
        Response<DescribeMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMultiplexRequestMarshaller()
                        .marshall(describeMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMultiplexResult, JsonUnmarshallerContext> unmarshaller = new DescribeMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMultiplexResult> responseHandler = new JsonResponseHandler<DescribeMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get the details for a program in a multiplex.
     * 
     * @param describeMultiplexProgramRequest Placeholder documentation for
     *            DescribeMultiplexProgramRequest
     * @return describeMultiplexProgramResult The response from the
     *         DescribeMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to describe the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't describe the program. The
     *             multiplex or the program that you specified doesn’t exist.
     *             Check the IDs and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             multiplex program calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeMultiplexProgramResult describeMultiplexProgram(
            DescribeMultiplexProgramRequest describeMultiplexProgramRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMultiplexProgramRequest> request = null;
        Response<DescribeMultiplexProgramResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMultiplexProgramRequestMarshaller()
                        .marshall(describeMultiplexProgramRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeMultiplexProgramResult, JsonUnmarshallerContext> unmarshaller = new DescribeMultiplexProgramResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMultiplexProgramResult> responseHandler = new JsonResponseHandler<DescribeMultiplexProgramResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get details for an offering.
     * 
     * @param describeOfferingRequest Placeholder documentation for
     *            DescribeOfferingRequest
     * @return describeOfferingResult The response from the DescribeOffering
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to describe
     *             offering
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Offering you're attempting to describe does not
     *             exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             offering request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeOfferingResult describeOffering(DescribeOfferingRequest describeOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOfferingRequest> request = null;
        Response<DescribeOfferingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOfferingRequestMarshaller().marshall(describeOfferingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeOfferingResult, JsonUnmarshallerContext> unmarshaller = new DescribeOfferingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeOfferingResult> responseHandler = new JsonResponseHandler<DescribeOfferingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get details for a reservation.
     * 
     * @param describeReservationRequest Placeholder documentation for
     *            DescribeReservationRequest
     * @return describeReservationResult The response from the
     *         DescribeReservation service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to describe
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation you're attempting to describe does
     *             not exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             reservation request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeReservationResult describeReservation(
            DescribeReservationRequest describeReservationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservationRequest> request = null;
        Response<DescribeReservationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservationRequestMarshaller()
                        .marshall(describeReservationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeReservationResult, JsonUnmarshallerContext> unmarshaller = new DescribeReservationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeReservationResult> responseHandler = new JsonResponseHandler<DescribeReservationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get a channel schedule
     * 
     * @param describeScheduleRequest Placeholder documentation for
     *            DescribeScheduleRequest
     * @return describeScheduleResult The response from the DescribeSchedule
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to describe the
     *             channel schedule.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting a schedule
     *             describe for does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on describe
     *             schedule calls.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeScheduleResult describeSchedule(DescribeScheduleRequest describeScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduleRequest> request = null;
        Response<DescribeScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduleRequestMarshaller().marshall(describeScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeScheduleResult, JsonUnmarshallerContext> unmarshaller = new DescribeScheduleResultJsonUnmarshaller();
            JsonResponseHandler<DescribeScheduleResult> responseHandler = new JsonResponseHandler<DescribeScheduleResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest Placeholder documentation for
     *            ListChannelsRequest
     * @return listChannelsResult The response from the ListChannels service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to list channels.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on list channel
     *             calls to channel service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
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
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest Placeholder documentation for
     *            ListInputSecurityGroupsRequest
     * @return listInputSecurityGroupsResult The response from the
     *         ListInputSecurityGroups service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to list Input Security Groups was
     *             invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to call
     *             ListInputSecurityGroups
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit Exceeded Error
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListInputSecurityGroupsResult listInputSecurityGroups(
            ListInputSecurityGroupsRequest listInputSecurityGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInputSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputSecurityGroupsRequest> request = null;
        Response<ListInputSecurityGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputSecurityGroupsRequestMarshaller()
                        .marshall(listInputSecurityGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInputSecurityGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListInputSecurityGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListInputSecurityGroupsResult> responseHandler = new JsonResponseHandler<ListInputSecurityGroupsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest Placeholder documentation for ListInputsRequest
     * @return listInputsResult The response from the ListInputs service method,
     *         as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Limit exceeded
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListInputsResult listInputs(ListInputsRequest listInputsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInputsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInputsRequest> request = null;
        Response<ListInputsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInputsRequestMarshaller().marshall(listInputsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInputsResult, JsonUnmarshallerContext> unmarshaller = new ListInputsResultJsonUnmarshaller();
            JsonResponseHandler<ListInputsResult> responseHandler = new JsonResponseHandler<ListInputsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * List the programs that currently exist for a specific multiplex.
     * 
     * @param listMultiplexProgramsRequest Placeholder documentation for
     *            ListMultiplexProgramsRequest
     * @return listMultiplexProgramsResult The response from the
     *         ListMultiplexPrograms service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to list multiplex
     *             programs.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't provide the list of programs.
     *             The multiplex that you specified doesn’t exist. Check the ID
     *             and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on list multiplex
     *             calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListMultiplexProgramsResult listMultiplexPrograms(
            ListMultiplexProgramsRequest listMultiplexProgramsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMultiplexProgramsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultiplexProgramsRequest> request = null;
        Response<ListMultiplexProgramsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultiplexProgramsRequestMarshaller()
                        .marshall(listMultiplexProgramsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMultiplexProgramsResult, JsonUnmarshallerContext> unmarshaller = new ListMultiplexProgramsResultJsonUnmarshaller();
            JsonResponseHandler<ListMultiplexProgramsResult> responseHandler = new JsonResponseHandler<ListMultiplexProgramsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Retrieve a list of the existing multiplexes.
     * 
     * @param listMultiplexesRequest Placeholder documentation for
     *            ListMultiplexesRequest
     * @return listMultiplexesResult The response from the ListMultiplexes
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to list multiplexes.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on list multiplex
     *             calls to multiplex service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListMultiplexesResult listMultiplexes(ListMultiplexesRequest listMultiplexesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMultiplexesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMultiplexesRequest> request = null;
        Response<ListMultiplexesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMultiplexesRequestMarshaller().marshall(listMultiplexesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMultiplexesResult, JsonUnmarshallerContext> unmarshaller = new ListMultiplexesResultJsonUnmarshaller();
            JsonResponseHandler<ListMultiplexesResult> responseHandler = new JsonResponseHandler<ListMultiplexesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * List offerings available for purchase.
     * 
     * @param listOfferingsRequest Placeholder documentation for
     *            ListOfferingsRequest
     * @return listOfferingsResult The response from the ListOfferings service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to list offerings
     * @throws BadGatewayException Bad gateway error
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on list offerings
     *             request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOfferingsRequest> request = null;
        Response<ListOfferingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOfferingsRequestMarshaller().marshall(listOfferingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListOfferingsResult, JsonUnmarshallerContext> unmarshaller = new ListOfferingsResultJsonUnmarshaller();
            JsonResponseHandler<ListOfferingsResult> responseHandler = new JsonResponseHandler<ListOfferingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * List purchased reservations.
     * 
     * @param listReservationsRequest Placeholder documentation for
     *            ListReservationsRequest
     * @return listReservationsResult The response from the ListReservations
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to list
     *             reservations
     * @throws BadGatewayException Bad gateway error
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on list
     *             reservations request
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListReservationsResult listReservations(ListReservationsRequest listReservationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listReservationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReservationsRequest> request = null;
        Response<ListReservationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReservationsRequestMarshaller().marshall(listReservationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListReservationsResult, JsonUnmarshallerContext> unmarshaller = new ListReservationsResultJsonUnmarshaller();
            JsonResponseHandler<ListReservationsResult> responseHandler = new JsonResponseHandler<ListReservationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Produces list of tags that have been created for a resource
     * 
     * @param listTagsForResourceRequest Placeholder documentation for
     *            ListTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Elemental
     *         MediaLive.
     * @throws NotFoundException The arn was not found
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException Access was denied
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(listTagsForResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForResourceResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForResourceResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Purchase an offering and create a reservation.
     * 
     * @param purchaseOfferingRequest Placeholder documentation for
     *            PurchaseOfferingRequest
     * @return purchaseOfferingResult The response from the PurchaseOffering
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to purchase the
     *             offering
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Offering you're attempting to purchase does not
     *             exist
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded on purchase
     *             offering request
     * @throws ConflictException Offering purchase prevented by service resource
     *             issue
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(purchaseOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseOfferingRequest> request = null;
        Response<PurchaseOfferingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseOfferingRequestMarshaller().marshall(purchaseOfferingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PurchaseOfferingResult, JsonUnmarshallerContext> unmarshaller = new PurchaseOfferingResultJsonUnmarshaller();
            JsonResponseHandler<PurchaseOfferingResult> responseHandler = new JsonResponseHandler<PurchaseOfferingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest Placeholder documentation for
     *            StartChannelRequest
     * @return startChannelResult The response from the StartChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to start the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to start does not
     *             exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on start channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to start due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartChannelResult startChannel(StartChannelRequest startChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartChannelRequest> request = null;
        Response<StartChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartChannelRequestMarshaller().marshall(startChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartChannelResult, JsonUnmarshallerContext> unmarshaller = new StartChannelResultJsonUnmarshaller();
            JsonResponseHandler<StartChannelResult> responseHandler = new JsonResponseHandler<StartChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Start (run) the multiplex. Starting the multiplex does not start the
     * channels. You must explicitly start each channel.
     * 
     * @param startMultiplexRequest Placeholder documentation for
     *            StartMultiplexRequest
     * @return startMultiplexResult The response from the StartMultiplex service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to start the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to start
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on start
     *             multiplex calls to multiplex service.
     * @throws ConflictException The multiplex is unable to start due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StartMultiplexResult startMultiplex(StartMultiplexRequest startMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMultiplexRequest> request = null;
        Response<StartMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMultiplexRequestMarshaller().marshall(startMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartMultiplexResult, JsonUnmarshallerContext> unmarshaller = new StartMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<StartMultiplexResult> responseHandler = new JsonResponseHandler<StartMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest Placeholder documentation for
     *            StopChannelRequest
     * @return stopChannelResult The response from the StopChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to stop the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're requesting to stop does not
     *             exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on stop channel
     *             calls to channel service.
     * @throws ConflictException The channel is unable to stop due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopChannelResult stopChannel(StopChannelRequest stopChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopChannelRequest> request = null;
        Response<StopChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopChannelRequestMarshaller().marshall(stopChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopChannelResult, JsonUnmarshallerContext> unmarshaller = new StopChannelResultJsonUnmarshaller();
            JsonResponseHandler<StopChannelResult> responseHandler = new JsonResponseHandler<StopChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Stops a running multiplex. If the multiplex isn't running, this action
     * has no effect.
     * 
     * @param stopMultiplexRequest Placeholder documentation for
     *            StopMultiplexRequest
     * @return stopMultiplexResult The response from the StopMultiplex service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to stop the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to stop
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws TooManyRequestsException Request limit exceeded on stop multiplex
     *             calls to multiplex service.
     * @throws ConflictException The multiplex is unable to stop due to an issue
     *             with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public StopMultiplexResult stopMultiplex(StopMultiplexRequest stopMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMultiplexRequest> request = null;
        Response<StopMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMultiplexRequestMarshaller().marshall(stopMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopMultiplexResult, JsonUnmarshallerContext> unmarshaller = new StopMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<StopMultiplexResult> responseHandler = new JsonResponseHandler<StopMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Updates a channel.
     * 
     * @param updateChannelRequest A request to update a channel.
     * @return updateChannelResult The response from the UpdateChannel service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid.
     * @throws UnprocessableEntityException The channel configuration failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the
     *             channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The channel is unable to update due to an issue
     *             with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
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
     * Changes the class of the channel.
     * 
     * @param updateChannelClassRequest Channel class that the channel should be
     *            updated to.
     * @return updateChannelClassResult The response from the UpdateChannelClass
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to update the channel class was
     *             invalid.
     * @throws UnprocessableEntityException The channel configuration failed
     *             validation when attempting to update the channel class.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You do not have permission to update the class
     *             of this channel.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The channel you're trying to update the class
     *             on does not exist.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws TooManyRequestsException Request limit exceeded on update channel
     *             class calls.
     * @throws ConflictException The channel class cannot be updated due to an
     *             issue with channel resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateChannelClassResult updateChannelClass(
            UpdateChannelClassRequest updateChannelClassRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateChannelClassRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelClassRequest> request = null;
        Response<UpdateChannelClassResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelClassRequestMarshaller()
                        .marshall(updateChannelClassRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateChannelClassResult, JsonUnmarshallerContext> unmarshaller = new UpdateChannelClassResultJsonUnmarshaller();
            JsonResponseHandler<UpdateChannelClassResult> responseHandler = new JsonResponseHandler<UpdateChannelClassResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Updates an input.
     * 
     * @param updateInputRequest A request to update an input.
     * @return updateInputResult The response from the UpdateInput service
     *         method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request to update the input was invalid.
     * @throws InternalServerErrorException Internal Service Error
     * @throws ForbiddenException The requester does not have permission to
     *             update an input.
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The input was not found.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The input was unable to be updated at this time
     *             due to an issue with input resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateInputResult updateInput(UpdateInputRequest updateInputRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateInputRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputRequest> request = null;
        Response<UpdateInputResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputRequestMarshaller().marshall(updateInputRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateInputResult, JsonUnmarshallerContext> unmarshaller = new UpdateInputResultJsonUnmarshaller();
            JsonResponseHandler<UpdateInputResult> responseHandler = new JsonResponseHandler<UpdateInputResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an Input Security Group's Whilelists.
     * 
     * @param updateInputSecurityGroupRequest The request to update some
     *            combination of the Input Security Group name and the IPv4
     *            CIDRs the Input Security Group should allow.
     * @return updateInputSecurityGroupResult The response from the
     *         UpdateInputSecurityGroup service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException The request to update the Input Security
     *             Group was invalid
     * @throws InternalServerErrorException Internal Server Error
     * @throws ForbiddenException The requester does not have permission to
     *             update an Input Security Group
     * @throws BadGatewayException Bad Gateway Error
     * @throws NotFoundException The Input Security Group was not found.
     * @throws GatewayTimeoutException Gateway Timeout Error
     * @throws ConflictException The Input Security Group was unable to be
     *             updated due to an issue with input security group resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateInputSecurityGroupResult updateInputSecurityGroup(
            UpdateInputSecurityGroupRequest updateInputSecurityGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateInputSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInputSecurityGroupRequest> request = null;
        Response<UpdateInputSecurityGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInputSecurityGroupRequestMarshaller()
                        .marshall(updateInputSecurityGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateInputSecurityGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateInputSecurityGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateInputSecurityGroupResult> responseHandler = new JsonResponseHandler<UpdateInputSecurityGroupResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Updates a multiplex.
     * 
     * @param updateMultiplexRequest A request to update a multiplex.
     * @return updateMultiplexResult The response from the UpdateMultiplex
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The multiplex configuration failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to update the
     *             multiplex.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException The multiplex that you are trying to update
     *             doesn’t exist. Check the ID and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws ConflictException The multiplex is unable to update due to an
     *             issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateMultiplexResult updateMultiplex(UpdateMultiplexRequest updateMultiplexRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMultiplexRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMultiplexRequest> request = null;
        Response<UpdateMultiplexResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMultiplexRequestMarshaller().marshall(updateMultiplexRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMultiplexResult, JsonUnmarshallerContext> unmarshaller = new UpdateMultiplexResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMultiplexResult> responseHandler = new JsonResponseHandler<UpdateMultiplexResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update a program in a multiplex.
     * 
     * @param updateMultiplexProgramRequest A request to update a program in a
     *            multiplex.
     * @return updateMultiplexProgramResult The response from the
     *         UpdateMultiplexProgram service method, as returned by AWS
     *         Elemental MediaLive.
     * @throws BadRequestException MediaLive can't process your request because
     *             of a problem in the request. Please check your request form
     *             and syntax.
     * @throws UnprocessableEntityException The multiplex program failed
     *             validation and could not be updated.
     * @throws InternalServerErrorException Unexpected internal service error.
     * @throws ForbiddenException You don't have permission to update the
     *             multiplex program.
     * @throws BadGatewayException Bad Gateway Error.
     * @throws NotFoundException MediaLive can't update the program. The
     *             multiplex or the program that you specified doesn’t exist.
     *             Check the IDs and try again.
     * @throws GatewayTimeoutException Gateway Timeout Error.
     * @throws ConflictException The multiplex program is unable to update due
     *             to an issue with multiplex resources.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateMultiplexProgramResult updateMultiplexProgram(
            UpdateMultiplexProgramRequest updateMultiplexProgramRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMultiplexProgramRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMultiplexProgramRequest> request = null;
        Response<UpdateMultiplexProgramResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMultiplexProgramRequestMarshaller()
                        .marshall(updateMultiplexProgramRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMultiplexProgramResult, JsonUnmarshallerContext> unmarshaller = new UpdateMultiplexProgramResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMultiplexProgramResult> responseHandler = new JsonResponseHandler<UpdateMultiplexProgramResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update reservation.
     * 
     * @param updateReservationRequest Request to update a reservation
     * @return updateReservationResult The response from the UpdateReservation
     *         service method, as returned by AWS Elemental MediaLive.
     * @throws BadRequestException This request was invalid
     * @throws InternalServerErrorException Internal service error
     * @throws ForbiddenException You do not have permission to update
     *             reservation
     * @throws BadGatewayException Bad gateway error
     * @throws NotFoundException Reservation not found
     * @throws GatewayTimeoutException Gateway timeout error
     * @throws TooManyRequestsException Request limit exceeded
     * @throws ConflictException The reservation could not be updated
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Elemental MediaLive indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateReservationResult updateReservation(
            UpdateReservationRequest updateReservationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateReservationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReservationRequest> request = null;
        Response<UpdateReservationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReservationRequestMarshaller()
                        .marshall(updateReservationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateReservationResult, JsonUnmarshallerContext> unmarshaller = new UpdateReservationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateReservationResult> responseHandler = new JsonResponseHandler<UpdateReservationResult>(
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
