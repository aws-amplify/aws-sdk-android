/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint;

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

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.services.pinpoint.model.transform.*;

/**
 * Client for accessing AmazonPinpoint. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * Amazon Pinpoint
 */
public class AmazonPinpointClient extends AmazonWebServiceClient implements AmazonPinpoint {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonPinpoint exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonPinpointClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *            how this client connects to AmazonPinpoint (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonPinpointClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     */
    public AmazonPinpointClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials and client configuration options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPinpoint (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonPinpointClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials provider.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     */
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials provider and client configuration
     * options.
     * <p>
     * If AWS session credentials are passed in, then those credentials will be
     * used to authenticate requests. Otherwise, if AWS long-term credentials
     * are passed in, then session management will be handled automatically by
     * the SDK. Callers are encouraged to use long-term credentials and let the
     * SDK handle starting and renewing sessions.
     * <p>
     * Automatically managed sessions will be shared among all clients that use
     * the same credentials and service endpoint. To opt out of this behavior,
     * explicitly provide an instance of {@link AWSCredentialsProvider} that
     * returns {@link AWSSessionCredentials}.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPinpoint (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPinpoint (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonPinpoint using
     * the specified AWS account credentials provider, client configuration
     * options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonPinpoint (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonPinpointClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MethodNotAllowedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("pinpoint.us-east-1.amazonaws.com");
        this.endpointPrefix = "pinpoint";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/pinpoint/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/pinpoint/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * Creates or updates an app.
     * 
     * @param createAppRequest
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateAppResult createApp(CreateAppRequest createAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestMarshaller().marshall(createAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAppResult, JsonUnmarshallerContext> unmarshaller = new CreateAppResultJsonUnmarshaller();
            JsonResponseHandler<CreateAppResult> responseHandler = new JsonResponseHandler<CreateAppResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return createCampaignResult The response from the CreateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestMarshaller().marshall(createCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCampaignResult, JsonUnmarshallerContext> unmarshaller = new CreateCampaignResultJsonUnmarshaller();
            JsonResponseHandler<CreateCampaignResult> responseHandler = new JsonResponseHandler<CreateCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates an export job.
     * 
     * @param createExportJobRequest
     * @return createExportJobResult The response from the CreateExportJob
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateExportJobResult createExportJob(CreateExportJobRequest createExportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExportJobRequest> request = null;
        Response<CreateExportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExportJobRequestMarshaller().marshall(createExportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateExportJobResult, JsonUnmarshallerContext> unmarshaller = new CreateExportJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateExportJobResult> responseHandler = new JsonResponseHandler<CreateExportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return createImportJobResult The response from the CreateImportJob
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImportJobRequest> request = null;
        Response<CreateImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImportJobRequestMarshaller().marshall(createImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateImportJobResult, JsonUnmarshallerContext> unmarshaller = new CreateImportJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateImportJobResult> responseHandler = new JsonResponseHandler<CreateImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return createSegmentResult The response from the CreateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSegmentRequest> request = null;
        Response<CreateSegmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSegmentRequestMarshaller().marshall(createSegmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSegmentResult, JsonUnmarshallerContext> unmarshaller = new CreateSegmentResultJsonUnmarshaller();
            JsonResponseHandler<CreateSegmentResult> responseHandler = new JsonResponseHandler<CreateSegmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an ADM channel.
     * 
     * @param deleteAdmChannelRequest
     * @return deleteAdmChannelResult The response from the DeleteAdmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAdmChannelRequest> request = null;
        Response<DeleteAdmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAdmChannelRequestMarshaller().marshall(deleteAdmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAdmChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteAdmChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAdmChannelResult> responseHandler = new JsonResponseHandler<DeleteAdmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return deleteApnsChannelResult The response from the DeleteApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteApnsChannelResult deleteApnsChannel(
            DeleteApnsChannelRequest deleteApnsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsChannelRequest> request = null;
        Response<DeleteApnsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsChannelRequestMarshaller()
                        .marshall(deleteApnsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteApnsChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteApnsChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteApnsChannelResult> responseHandler = new JsonResponseHandler<DeleteApnsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an APNS sandbox channel.
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return deleteApnsSandboxChannelResult The response from the
     *         DeleteApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(
            DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsSandboxChannelRequest> request = null;
        Response<DeleteApnsSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsSandboxChannelRequestMarshaller()
                        .marshall(deleteApnsSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteApnsSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteApnsSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteApnsSandboxChannelResult> responseHandler = new JsonResponseHandler<DeleteApnsSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an APNS VoIP channel
     * 
     * @param deleteApnsVoipChannelRequest
     * @return deleteApnsVoipChannelResult The response from the
     *         DeleteApnsVoipChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteApnsVoipChannelResult deleteApnsVoipChannel(
            DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsVoipChannelRequest> request = null;
        Response<DeleteApnsVoipChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsVoipChannelRequestMarshaller()
                        .marshall(deleteApnsVoipChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteApnsVoipChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteApnsVoipChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteApnsVoipChannelResult> responseHandler = new JsonResponseHandler<DeleteApnsVoipChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an APNS VoIP sandbox channel
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return deleteApnsVoipSandboxChannelResult The response from the
     *         DeleteApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteApnsVoipSandboxChannelResult deleteApnsVoipSandboxChannel(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApnsVoipSandboxChannelRequest> request = null;
        Response<DeleteApnsVoipSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApnsVoipSandboxChannelRequestMarshaller()
                        .marshall(deleteApnsVoipSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteApnsVoipSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteApnsVoipSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteApnsVoipSandboxChannelResult> responseHandler = new JsonResponseHandler<DeleteApnsVoipSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes an app.
     * 
     * @param deleteAppRequest
     * @return deleteAppResult The response from the DeleteApp service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestMarshaller().marshall(deleteAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteAppResult, JsonUnmarshallerContext> unmarshaller = new DeleteAppResultJsonUnmarshaller();
            JsonResponseHandler<DeleteAppResult> responseHandler = new JsonResponseHandler<DeleteAppResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete a BAIDU GCM channel
     * 
     * @param deleteBaiduChannelRequest
     * @return deleteBaiduChannelResult The response from the DeleteBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteBaiduChannelResult deleteBaiduChannel(
            DeleteBaiduChannelRequest deleteBaiduChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBaiduChannelRequest> request = null;
        Response<DeleteBaiduChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBaiduChannelRequestMarshaller()
                        .marshall(deleteBaiduChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBaiduChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteBaiduChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBaiduChannelResult> responseHandler = new JsonResponseHandler<DeleteBaiduChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return deleteCampaignResult The response from the DeleteCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestMarshaller().marshall(deleteCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCampaignResult, JsonUnmarshallerContext> unmarshaller = new DeleteCampaignResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCampaignResult> responseHandler = new JsonResponseHandler<DeleteCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an email channel.
     * 
     * @param deleteEmailChannelRequest
     * @return deleteEmailChannelResult The response from the DeleteEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteEmailChannelResult deleteEmailChannel(
            DeleteEmailChannelRequest deleteEmailChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEmailChannelRequest> request = null;
        Response<DeleteEmailChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEmailChannelRequestMarshaller()
                        .marshall(deleteEmailChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEmailChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteEmailChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEmailChannelResult> responseHandler = new JsonResponseHandler<DeleteEmailChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes an endpoint.
     * 
     * @param deleteEndpointRequest
     * @return deleteEndpointResult The response from the DeleteEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEndpointResult, JsonUnmarshallerContext> unmarshaller = new DeleteEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEndpointResult> responseHandler = new JsonResponseHandler<DeleteEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     * @return deleteEventStreamResult The response from the DeleteEventStream
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteEventStreamResult deleteEventStream(
            DeleteEventStreamRequest deleteEventStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventStreamRequest> request = null;
        Response<DeleteEventStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventStreamRequestMarshaller()
                        .marshall(deleteEventStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEventStreamResult, JsonUnmarshallerContext> unmarshaller = new DeleteEventStreamResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEventStreamResult> responseHandler = new JsonResponseHandler<DeleteEventStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return deleteGcmChannelResult The response from the DeleteGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGcmChannelRequest> request = null;
        Response<DeleteGcmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGcmChannelRequestMarshaller().marshall(deleteGcmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGcmChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteGcmChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGcmChannelResult> responseHandler = new JsonResponseHandler<DeleteGcmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return deleteSegmentResult The response from the DeleteSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSegmentRequest> request = null;
        Response<DeleteSegmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSegmentRequestMarshaller().marshall(deleteSegmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSegmentResult, JsonUnmarshallerContext> unmarshaller = new DeleteSegmentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSegmentResult> responseHandler = new JsonResponseHandler<DeleteSegmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an SMS channel.
     * 
     * @param deleteSmsChannelRequest
     * @return deleteSmsChannelResult The response from the DeleteSmsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSmsChannelRequest> request = null;
        Response<DeleteSmsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSmsChannelRequestMarshaller().marshall(deleteSmsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSmsChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteSmsChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSmsChannelResult> responseHandler = new JsonResponseHandler<DeleteSmsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Deletes endpoints that are associated with a User ID.
     * 
     * @param deleteUserEndpointsRequest
     * @return deleteUserEndpointsResult The response from the
     *         DeleteUserEndpoints service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteUserEndpointsResult deleteUserEndpoints(
            DeleteUserEndpointsRequest deleteUserEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserEndpointsRequest> request = null;
        Response<DeleteUserEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserEndpointsRequestMarshaller()
                        .marshall(deleteUserEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserEndpointsResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserEndpointsResult> responseHandler = new JsonResponseHandler<DeleteUserEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Delete an Voice channel
     * 
     * @param deleteVoiceChannelRequest
     * @return deleteVoiceChannelResult The response from the DeleteVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteVoiceChannelResult deleteVoiceChannel(
            DeleteVoiceChannelRequest deleteVoiceChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceChannelRequest> request = null;
        Response<DeleteVoiceChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceChannelRequestMarshaller()
                        .marshall(deleteVoiceChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVoiceChannelResult, JsonUnmarshallerContext> unmarshaller = new DeleteVoiceChannelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVoiceChannelResult> responseHandler = new JsonResponseHandler<DeleteVoiceChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an ADM channel.
     * 
     * @param getAdmChannelRequest
     * @return getAdmChannelResult The response from the GetAdmChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetAdmChannelResult getAdmChannel(GetAdmChannelRequest getAdmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAdmChannelRequest> request = null;
        Response<GetAdmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAdmChannelRequestMarshaller().marshall(getAdmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAdmChannelResult, JsonUnmarshallerContext> unmarshaller = new GetAdmChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetAdmChannelResult> responseHandler = new JsonResponseHandler<GetAdmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return getApnsChannelResult The response from the GetApnsChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetApnsChannelResult getApnsChannel(GetApnsChannelRequest getApnsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsChannelRequest> request = null;
        Response<GetApnsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsChannelRequestMarshaller().marshall(getApnsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApnsChannelResult, JsonUnmarshallerContext> unmarshaller = new GetApnsChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetApnsChannelResult> responseHandler = new JsonResponseHandler<GetApnsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an APNS sandbox channel.
     * 
     * @param getApnsSandboxChannelRequest
     * @return getApnsSandboxChannelResult The response from the
     *         GetApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetApnsSandboxChannelResult getApnsSandboxChannel(
            GetApnsSandboxChannelRequest getApnsSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsSandboxChannelRequest> request = null;
        Response<GetApnsSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsSandboxChannelRequestMarshaller()
                        .marshall(getApnsSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApnsSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new GetApnsSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetApnsSandboxChannelResult> responseHandler = new JsonResponseHandler<GetApnsSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an APNS VoIP channel
     * 
     * @param getApnsVoipChannelRequest
     * @return getApnsVoipChannelResult The response from the GetApnsVoipChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetApnsVoipChannelResult getApnsVoipChannel(
            GetApnsVoipChannelRequest getApnsVoipChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsVoipChannelRequest> request = null;
        Response<GetApnsVoipChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsVoipChannelRequestMarshaller()
                        .marshall(getApnsVoipChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApnsVoipChannelResult, JsonUnmarshallerContext> unmarshaller = new GetApnsVoipChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetApnsVoipChannelResult> responseHandler = new JsonResponseHandler<GetApnsVoipChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an APNS VoIPSandbox channel
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return getApnsVoipSandboxChannelResult The response from the
     *         GetApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetApnsVoipSandboxChannelResult getApnsVoipSandboxChannel(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApnsVoipSandboxChannelRequest> request = null;
        Response<GetApnsVoipSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApnsVoipSandboxChannelRequestMarshaller()
                        .marshall(getApnsVoipSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApnsVoipSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new GetApnsVoipSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetApnsVoipSandboxChannelResult> responseHandler = new JsonResponseHandler<GetApnsVoipSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about an app.
     * 
     * @param getAppRequest
     * @return getAppResult The response from the GetApp service method, as
     *         returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetAppResult getApp(GetAppRequest getAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppRequest> request = null;
        Response<GetAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppRequestMarshaller().marshall(getAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAppResult, JsonUnmarshallerContext> unmarshaller = new GetAppResultJsonUnmarshaller();
            JsonResponseHandler<GetAppResult> responseHandler = new JsonResponseHandler<GetAppResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return getApplicationSettingsResult The response from the
     *         GetApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetApplicationSettingsResult getApplicationSettings(
            GetApplicationSettingsRequest getApplicationSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationSettingsRequest> request = null;
        Response<GetApplicationSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationSettingsRequestMarshaller()
                        .marshall(getApplicationSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApplicationSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetApplicationSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetApplicationSettingsResult> responseHandler = new JsonResponseHandler<GetApplicationSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your apps.
     * 
     * @param getAppsRequest
     * @return getAppsResult The response from the GetApps service method, as
     *         returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetAppsResult getApps(GetAppsRequest getAppsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppsRequest> request = null;
        Response<GetAppsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppsRequestMarshaller().marshall(getAppsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAppsResult, JsonUnmarshallerContext> unmarshaller = new GetAppsResultJsonUnmarshaller();
            JsonResponseHandler<GetAppsResult> responseHandler = new JsonResponseHandler<GetAppsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get a BAIDU GCM channel
     * 
     * @param getBaiduChannelRequest
     * @return getBaiduChannelResult The response from the GetBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBaiduChannelRequest> request = null;
        Response<GetBaiduChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBaiduChannelRequestMarshaller().marshall(getBaiduChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBaiduChannelResult, JsonUnmarshallerContext> unmarshaller = new GetBaiduChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetBaiduChannelResult> responseHandler = new JsonResponseHandler<GetBaiduChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return getCampaignResult The response from the GetCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignRequest> request = null;
        Response<GetCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignRequestMarshaller().marshall(getCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCampaignResult, JsonUnmarshallerContext> unmarshaller = new GetCampaignResultJsonUnmarshaller();
            JsonResponseHandler<GetCampaignResult> responseHandler = new JsonResponseHandler<GetCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return getCampaignActivitiesResult The response from the
     *         GetCampaignActivities service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCampaignActivitiesResult getCampaignActivities(
            GetCampaignActivitiesRequest getCampaignActivitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCampaignActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignActivitiesRequest> request = null;
        Response<GetCampaignActivitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignActivitiesRequestMarshaller()
                        .marshall(getCampaignActivitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCampaignActivitiesResult, JsonUnmarshallerContext> unmarshaller = new GetCampaignActivitiesResultJsonUnmarshaller();
            JsonResponseHandler<GetCampaignActivitiesResult> responseHandler = new JsonResponseHandler<GetCampaignActivitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return getCampaignVersionResult The response from the GetCampaignVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCampaignVersionResult getCampaignVersion(
            GetCampaignVersionRequest getCampaignVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCampaignVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionRequest> request = null;
        Response<GetCampaignVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionRequestMarshaller()
                        .marshall(getCampaignVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCampaignVersionResult, JsonUnmarshallerContext> unmarshaller = new GetCampaignVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetCampaignVersionResult> responseHandler = new JsonResponseHandler<GetCampaignVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return getCampaignVersionsResult The response from the
     *         GetCampaignVersions service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCampaignVersionsResult getCampaignVersions(
            GetCampaignVersionsRequest getCampaignVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCampaignVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignVersionsRequest> request = null;
        Response<GetCampaignVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignVersionsRequestMarshaller()
                        .marshall(getCampaignVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCampaignVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetCampaignVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetCampaignVersionsResult> responseHandler = new JsonResponseHandler<GetCampaignVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return getCampaignsResult The response from the GetCampaigns service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetCampaignsResult getCampaigns(GetCampaignsRequest getCampaignsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignsRequest> request = null;
        Response<GetCampaignsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignsRequestMarshaller().marshall(getCampaignsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCampaignsResult, JsonUnmarshallerContext> unmarshaller = new GetCampaignsResultJsonUnmarshaller();
            JsonResponseHandler<GetCampaignsResult> responseHandler = new JsonResponseHandler<GetCampaignsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get all channels.
     * 
     * @param getChannelsRequest
     * @return getChannelsResult The response from the GetChannels service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetChannelsResult getChannels(GetChannelsRequest getChannelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelsRequest> request = null;
        Response<GetChannelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelsRequestMarshaller().marshall(getChannelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetChannelsResult, JsonUnmarshallerContext> unmarshaller = new GetChannelsResultJsonUnmarshaller();
            JsonResponseHandler<GetChannelsResult> responseHandler = new JsonResponseHandler<GetChannelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an email channel.
     * 
     * @param getEmailChannelRequest
     * @return getEmailChannelResult The response from the GetEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetEmailChannelResult getEmailChannel(GetEmailChannelRequest getEmailChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEmailChannelRequest> request = null;
        Response<GetEmailChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEmailChannelRequestMarshaller().marshall(getEmailChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEmailChannelResult, JsonUnmarshallerContext> unmarshaller = new GetEmailChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetEmailChannelResult> responseHandler = new JsonResponseHandler<GetEmailChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return getEndpointResult The response from the GetEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetEndpointResult getEndpoint(GetEndpointRequest getEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEndpointRequest> request = null;
        Response<GetEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEndpointRequestMarshaller().marshall(getEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEndpointResult, JsonUnmarshallerContext> unmarshaller = new GetEndpointResultJsonUnmarshaller();
            JsonResponseHandler<GetEndpointResult> responseHandler = new JsonResponseHandler<GetEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     * @return getEventStreamResult The response from the GetEventStream service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetEventStreamResult getEventStream(GetEventStreamRequest getEventStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventStreamRequest> request = null;
        Response<GetEventStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventStreamRequestMarshaller().marshall(getEventStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetEventStreamResult, JsonUnmarshallerContext> unmarshaller = new GetEventStreamResultJsonUnmarshaller();
            JsonResponseHandler<GetEventStreamResult> responseHandler = new JsonResponseHandler<GetEventStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about an export job.
     * 
     * @param getExportJobRequest
     * @return getExportJobResult The response from the GetExportJob service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetExportJobResult getExportJob(GetExportJobRequest getExportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportJobRequest> request = null;
        Response<GetExportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportJobRequestMarshaller().marshall(getExportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetExportJobResult, JsonUnmarshallerContext> unmarshaller = new GetExportJobResultJsonUnmarshaller();
            JsonResponseHandler<GetExportJobResult> responseHandler = new JsonResponseHandler<GetExportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your export jobs.
     * 
     * @param getExportJobsRequest
     * @return getExportJobsResult The response from the GetExportJobs service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetExportJobsResult getExportJobs(GetExportJobsRequest getExportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportJobsRequest> request = null;
        Response<GetExportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportJobsRequestMarshaller().marshall(getExportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetExportJobsResult, JsonUnmarshallerContext> unmarshaller = new GetExportJobsResultJsonUnmarshaller();
            JsonResponseHandler<GetExportJobsResult> responseHandler = new JsonResponseHandler<GetExportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return getGcmChannelResult The response from the GetGcmChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetGcmChannelResult getGcmChannel(GetGcmChannelRequest getGcmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGcmChannelRequest> request = null;
        Response<GetGcmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGcmChannelRequestMarshaller().marshall(getGcmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGcmChannelResult, JsonUnmarshallerContext> unmarshaller = new GetGcmChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetGcmChannelResult> responseHandler = new JsonResponseHandler<GetGcmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return getImportJobResult The response from the GetImportJob service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobRequest> request = null;
        Response<GetImportJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobRequestMarshaller().marshall(getImportJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImportJobResult, JsonUnmarshallerContext> unmarshaller = new GetImportJobResultJsonUnmarshaller();
            JsonResponseHandler<GetImportJobResult> responseHandler = new JsonResponseHandler<GetImportJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return getImportJobsResult The response from the GetImportJobs service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImportJobsResult getImportJobs(GetImportJobsRequest getImportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportJobsRequest> request = null;
        Response<GetImportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportJobsRequestMarshaller().marshall(getImportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImportJobsResult, JsonUnmarshallerContext> unmarshaller = new GetImportJobsResultJsonUnmarshaller();
            JsonResponseHandler<GetImportJobsResult> responseHandler = new JsonResponseHandler<GetImportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return getSegmentResult The response from the GetSegment service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentRequest> request = null;
        Response<GetSegmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentRequestMarshaller().marshall(getSegmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentResult> responseHandler = new JsonResponseHandler<GetSegmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns a list of export jobs for a specific segment.
     * 
     * @param getSegmentExportJobsRequest
     * @return getSegmentExportJobsResult The response from the
     *         GetSegmentExportJobs service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentExportJobsResult getSegmentExportJobs(
            GetSegmentExportJobsRequest getSegmentExportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentExportJobsRequest> request = null;
        Response<GetSegmentExportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentExportJobsRequestMarshaller()
                        .marshall(getSegmentExportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentExportJobsResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentExportJobsResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentExportJobsResult> responseHandler = new JsonResponseHandler<GetSegmentExportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return getSegmentImportJobsResult The response from the
     *         GetSegmentImportJobs service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentImportJobsResult getSegmentImportJobs(
            GetSegmentImportJobsRequest getSegmentImportJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentImportJobsRequest> request = null;
        Response<GetSegmentImportJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentImportJobsRequestMarshaller()
                        .marshall(getSegmentImportJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentImportJobsResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentImportJobsResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentImportJobsResult> responseHandler = new JsonResponseHandler<GetSegmentImportJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return getSegmentVersionResult The response from the GetSegmentVersion
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentVersionResult getSegmentVersion(
            GetSegmentVersionRequest getSegmentVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionRequest> request = null;
        Response<GetSegmentVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionRequestMarshaller()
                        .marshall(getSegmentVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentVersionResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentVersionResult> responseHandler = new JsonResponseHandler<GetSegmentVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return getSegmentVersionsResult The response from the GetSegmentVersions
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentVersionsResult getSegmentVersions(
            GetSegmentVersionsRequest getSegmentVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentVersionsRequest> request = null;
        Response<GetSegmentVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentVersionsRequestMarshaller()
                        .marshall(getSegmentVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentVersionsResult> responseHandler = new JsonResponseHandler<GetSegmentVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return getSegmentsResult The response from the GetSegments service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSegmentsResult getSegments(GetSegmentsRequest getSegmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSegmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSegmentsRequest> request = null;
        Response<GetSegmentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSegmentsRequestMarshaller().marshall(getSegmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSegmentsResult, JsonUnmarshallerContext> unmarshaller = new GetSegmentsResultJsonUnmarshaller();
            JsonResponseHandler<GetSegmentsResult> responseHandler = new JsonResponseHandler<GetSegmentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get an SMS channel.
     * 
     * @param getSmsChannelRequest
     * @return getSmsChannelResult The response from the GetSmsChannel service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetSmsChannelResult getSmsChannel(GetSmsChannelRequest getSmsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSmsChannelRequest> request = null;
        Response<GetSmsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSmsChannelRequestMarshaller().marshall(getSmsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSmsChannelResult, JsonUnmarshallerContext> unmarshaller = new GetSmsChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetSmsChannelResult> responseHandler = new JsonResponseHandler<GetSmsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about the endpoints that are associated with a User
     * ID.
     * 
     * @param getUserEndpointsRequest
     * @return getUserEndpointsResult The response from the GetUserEndpoints
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetUserEndpointsResult getUserEndpoints(GetUserEndpointsRequest getUserEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserEndpointsRequest> request = null;
        Response<GetUserEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserEndpointsRequestMarshaller().marshall(getUserEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserEndpointsResult, JsonUnmarshallerContext> unmarshaller = new GetUserEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<GetUserEndpointsResult> responseHandler = new JsonResponseHandler<GetUserEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Get a Voice Channel
     * 
     * @param getVoiceChannelRequest
     * @return getVoiceChannelResult The response from the GetVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetVoiceChannelResult getVoiceChannel(GetVoiceChannelRequest getVoiceChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceChannelRequest> request = null;
        Response<GetVoiceChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceChannelRequestMarshaller().marshall(getVoiceChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVoiceChannelResult, JsonUnmarshallerContext> unmarshaller = new GetVoiceChannelResultJsonUnmarshaller();
            JsonResponseHandler<GetVoiceChannelResult> responseHandler = new JsonResponseHandler<GetVoiceChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Returns information about the specified phone number.
     * 
     * @param phoneNumberValidateRequest
     * @return phoneNumberValidateResult The response from the
     *         PhoneNumberValidate service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PhoneNumberValidateResult phoneNumberValidate(
            PhoneNumberValidateRequest phoneNumberValidateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(phoneNumberValidateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PhoneNumberValidateRequest> request = null;
        Response<PhoneNumberValidateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PhoneNumberValidateRequestMarshaller()
                        .marshall(phoneNumberValidateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PhoneNumberValidateResult, JsonUnmarshallerContext> unmarshaller = new PhoneNumberValidateResultJsonUnmarshaller();
            JsonResponseHandler<PhoneNumberValidateResult> responseHandler = new JsonResponseHandler<PhoneNumberValidateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     * @return putEventStreamResult The response from the PutEventStream service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutEventStreamResult putEventStream(PutEventStreamRequest putEventStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putEventStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventStreamRequest> request = null;
        Response<PutEventStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventStreamRequestMarshaller().marshall(putEventStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutEventStreamResult, JsonUnmarshallerContext> unmarshaller = new PutEventStreamResultJsonUnmarshaller();
            JsonResponseHandler<PutEventStreamResult> responseHandler = new JsonResponseHandler<PutEventStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to record events for endpoints. This method creates events and
     * creates or updates the endpoints that those events are associated with.
     * 
     * @param putEventsRequest
     * @return putEventsResult The response from the PutEvents service method,
     *         as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutEventsResult putEvents(PutEventsRequest putEventsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventsRequest> request = null;
        Response<PutEventsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventsRequestMarshaller().marshall(putEventsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutEventsResult, JsonUnmarshallerContext> unmarshaller = new PutEventsResultJsonUnmarshaller();
            JsonResponseHandler<PutEventsResult> responseHandler = new JsonResponseHandler<PutEventsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to remove the attributes for an app
     * 
     * @param removeAttributesRequest
     * @return removeAttributesResult The response from the RemoveAttributes
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public RemoveAttributesResult removeAttributes(RemoveAttributesRequest removeAttributesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(removeAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAttributesRequest> request = null;
        Response<RemoveAttributesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAttributesRequestMarshaller().marshall(removeAttributesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RemoveAttributesResult, JsonUnmarshallerContext> unmarshaller = new RemoveAttributesResultJsonUnmarshaller();
            JsonResponseHandler<RemoveAttributesResult> responseHandler = new JsonResponseHandler<RemoveAttributesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to send a direct message.
     * 
     * @param sendMessagesRequest
     * @return sendMessagesResult The response from the SendMessages service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SendMessagesResult sendMessages(SendMessagesRequest sendMessagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendMessagesRequest> request = null;
        Response<SendMessagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendMessagesRequestMarshaller().marshall(sendMessagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendMessagesResult, JsonUnmarshallerContext> unmarshaller = new SendMessagesResultJsonUnmarshaller();
            JsonResponseHandler<SendMessagesResult> responseHandler = new JsonResponseHandler<SendMessagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to send a message to a list of users.
     * 
     * @param sendUsersMessagesRequest
     * @return sendUsersMessagesResult The response from the SendUsersMessages
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public SendUsersMessagesResult sendUsersMessages(
            SendUsersMessagesRequest sendUsersMessagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(sendUsersMessagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendUsersMessagesRequest> request = null;
        Response<SendUsersMessagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendUsersMessagesRequestMarshaller()
                        .marshall(sendUsersMessagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SendUsersMessagesResult, JsonUnmarshallerContext> unmarshaller = new SendUsersMessagesResultJsonUnmarshaller();
            JsonResponseHandler<SendUsersMessagesResult> responseHandler = new JsonResponseHandler<SendUsersMessagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an ADM channel.
     * 
     * @param updateAdmChannelRequest
     * @return updateAdmChannelResult The response from the UpdateAdmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAdmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAdmChannelRequest> request = null;
        Response<UpdateAdmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAdmChannelRequestMarshaller().marshall(updateAdmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAdmChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateAdmChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAdmChannelResult> responseHandler = new JsonResponseHandler<UpdateAdmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return updateApnsChannelResult The response from the UpdateApnsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateApnsChannelResult updateApnsChannel(
            UpdateApnsChannelRequest updateApnsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApnsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsChannelRequest> request = null;
        Response<UpdateApnsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsChannelRequestMarshaller()
                        .marshall(updateApnsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApnsChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateApnsChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApnsChannelResult> responseHandler = new JsonResponseHandler<UpdateApnsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an APNS sandbox channel.
     * 
     * @param updateApnsSandboxChannelRequest
     * @return updateApnsSandboxChannelResult The response from the
     *         UpdateApnsSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateApnsSandboxChannelResult updateApnsSandboxChannel(
            UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApnsSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsSandboxChannelRequest> request = null;
        Response<UpdateApnsSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsSandboxChannelRequestMarshaller()
                        .marshall(updateApnsSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApnsSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateApnsSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApnsSandboxChannelResult> responseHandler = new JsonResponseHandler<UpdateApnsSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an APNS VoIP channel
     * 
     * @param updateApnsVoipChannelRequest
     * @return updateApnsVoipChannelResult The response from the
     *         UpdateApnsVoipChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateApnsVoipChannelResult updateApnsVoipChannel(
            UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApnsVoipChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsVoipChannelRequest> request = null;
        Response<UpdateApnsVoipChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsVoipChannelRequestMarshaller()
                        .marshall(updateApnsVoipChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApnsVoipChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateApnsVoipChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApnsVoipChannelResult> responseHandler = new JsonResponseHandler<UpdateApnsVoipChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an APNS VoIP sandbox channel
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return updateApnsVoipSandboxChannelResult The response from the
     *         UpdateApnsVoipSandboxChannel service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateApnsVoipSandboxChannelResult updateApnsVoipSandboxChannel(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApnsVoipSandboxChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApnsVoipSandboxChannelRequest> request = null;
        Response<UpdateApnsVoipSandboxChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApnsVoipSandboxChannelRequestMarshaller()
                        .marshall(updateApnsVoipSandboxChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApnsVoipSandboxChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateApnsVoipSandboxChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApnsVoipSandboxChannelResult> responseHandler = new JsonResponseHandler<UpdateApnsVoipSandboxChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return updateApplicationSettingsResult The response from the
     *         UpdateApplicationSettings service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateApplicationSettingsResult updateApplicationSettings(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApplicationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationSettingsRequest> request = null;
        Response<UpdateApplicationSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationSettingsRequestMarshaller()
                        .marshall(updateApplicationSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApplicationSettingsResult, JsonUnmarshallerContext> unmarshaller = new UpdateApplicationSettingsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApplicationSettingsResult> responseHandler = new JsonResponseHandler<UpdateApplicationSettingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update a BAIDU GCM channel
     * 
     * @param updateBaiduChannelRequest
     * @return updateBaiduChannelResult The response from the UpdateBaiduChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateBaiduChannelResult updateBaiduChannel(
            UpdateBaiduChannelRequest updateBaiduChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBaiduChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBaiduChannelRequest> request = null;
        Response<UpdateBaiduChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBaiduChannelRequestMarshaller()
                        .marshall(updateBaiduChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBaiduChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateBaiduChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBaiduChannelResult> responseHandler = new JsonResponseHandler<UpdateBaiduChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return updateCampaignResult The response from the UpdateCampaign service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestMarshaller().marshall(updateCampaignRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCampaignResult, JsonUnmarshallerContext> unmarshaller = new UpdateCampaignResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCampaignResult> responseHandler = new JsonResponseHandler<UpdateCampaignResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an email channel.
     * 
     * @param updateEmailChannelRequest
     * @return updateEmailChannelResult The response from the UpdateEmailChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateEmailChannelResult updateEmailChannel(
            UpdateEmailChannelRequest updateEmailChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEmailChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmailChannelRequest> request = null;
        Response<UpdateEmailChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmailChannelRequestMarshaller()
                        .marshall(updateEmailChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEmailChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateEmailChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEmailChannelResult> responseHandler = new JsonResponseHandler<UpdateEmailChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Creates or updates an endpoint.
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestMarshaller().marshall(updateEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEndpointResult, JsonUnmarshallerContext> unmarshaller = new UpdateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEndpointResult> responseHandler = new JsonResponseHandler<UpdateEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return updateEndpointsBatchResult The response from the
     *         UpdateEndpointsBatch service method, as returned by
     *         AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateEndpointsBatchResult updateEndpointsBatch(
            UpdateEndpointsBatchRequest updateEndpointsBatchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEndpointsBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointsBatchRequest> request = null;
        Response<UpdateEndpointsBatchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointsBatchRequestMarshaller()
                        .marshall(updateEndpointsBatchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEndpointsBatchResult, JsonUnmarshallerContext> unmarshaller = new UpdateEndpointsBatchResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEndpointsBatchResult> responseHandler = new JsonResponseHandler<UpdateEndpointsBatchResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return updateGcmChannelResult The response from the UpdateGcmChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGcmChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGcmChannelRequest> request = null;
        Response<UpdateGcmChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGcmChannelRequestMarshaller().marshall(updateGcmChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGcmChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateGcmChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGcmChannelResult> responseHandler = new JsonResponseHandler<UpdateGcmChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Used to update a segment.
     * 
     * @param updateSegmentRequest
     * @return updateSegmentResult The response from the UpdateSegment service
     *         method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateSegmentResult updateSegment(UpdateSegmentRequest updateSegmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSegmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSegmentRequest> request = null;
        Response<UpdateSegmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSegmentRequestMarshaller().marshall(updateSegmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSegmentResult, JsonUnmarshallerContext> unmarshaller = new UpdateSegmentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSegmentResult> responseHandler = new JsonResponseHandler<UpdateSegmentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an SMS channel.
     * 
     * @param updateSmsChannelRequest
     * @return updateSmsChannelResult The response from the UpdateSmsChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSmsChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSmsChannelRequest> request = null;
        Response<UpdateSmsChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSmsChannelRequestMarshaller().marshall(updateSmsChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSmsChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateSmsChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSmsChannelResult> responseHandler = new JsonResponseHandler<UpdateSmsChannelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * Update an Voice channel
     * 
     * @param updateVoiceChannelRequest
     * @return updateVoiceChannelResult The response from the UpdateVoiceChannel
     *         service method, as returned by AmazonPinpoint.
     * @throws BadRequestException 400 response
     * @throws InternalServerErrorException 500 response
     * @throws ForbiddenException 403 response
     * @throws NotFoundException 404 response
     * @throws MethodNotAllowedException 405 response
     * @throws TooManyRequestsException 429 response
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonPinpoint indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateVoiceChannelResult updateVoiceChannel(
            UpdateVoiceChannelRequest updateVoiceChannelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVoiceChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceChannelRequest> request = null;
        Response<UpdateVoiceChannelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceChannelRequestMarshaller()
                        .marshall(updateVoiceChannelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVoiceChannelResult, JsonUnmarshallerContext> unmarshaller = new UpdateVoiceChannelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVoiceChannelResult> responseHandler = new JsonResponseHandler<UpdateVoiceChannelResult>(
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
