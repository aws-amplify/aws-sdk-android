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

package com.amazonaws.services.kinesisvideo;

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

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.services.kinesisvideo.model.transform.*;

/**
 * Client for accessing AWSKinesisVideoFrontend. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 */
public class AWSKinesisVideoClient extends AmazonWebServiceClient implements AWSKinesisVideo {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWSKinesisVideoFrontend
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo. A
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
    public AWSKinesisVideoClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo. A
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
     *            how this client connects to AWSKinesisVideo (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSKinesisVideoClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials.
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
    public AWSKinesisVideoClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials and client configuration
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
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSKinesisVideo (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSKinesisVideoClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials provider.
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
    public AWSKinesisVideoClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *            how this client connects to AWSKinesisVideo (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSKinesisVideoClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSKinesisVideo (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSKinesisVideoClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSKinesisVideo
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSKinesisVideo (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSKinesisVideoClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccountStreamLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClientLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DeviceStreamLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidDeviceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidResourceFormatExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TagsPerResourceExceededLimitExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VersionMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://kinesisvideo.us-west-2.amazonaws.com");
        this.endpointPrefix = "kinesisvideo";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/kinesisvideo/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/kinesisvideo/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * @param createStreamRequest
     * @return createStreamResult The response from the CreateStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws AccountStreamLimitExceededException
     * @throws DeviceStreamLimitExceededException
     * @throws ResourceInUseException
     * @throws InvalidDeviceException
     * @throws InvalidArgumentException
     * @throws ClientLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateStreamResult createStream(CreateStreamRequest createStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<CreateStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestMarshaller().marshall(createStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStreamResult, JsonUnmarshallerContext> unmarshaller = new CreateStreamResultJsonUnmarshaller();
            JsonResponseHandler<CreateStreamResult> responseHandler = new JsonResponseHandler<CreateStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param deleteStreamRequest
     * @return deleteStreamResult The response from the DeleteStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<DeleteStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestMarshaller().marshall(deleteStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteStreamResult, JsonUnmarshallerContext> unmarshaller = new DeleteStreamResultJsonUnmarshaller();
            JsonResponseHandler<DeleteStreamResult> responseHandler = new JsonResponseHandler<DeleteStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param describeStreamRequest
     * @return describeStreamResult The response from the DescribeStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestMarshaller().marshall(describeStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeStreamResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamResultJsonUnmarshaller();
            JsonResponseHandler<DescribeStreamResult> responseHandler = new JsonResponseHandler<DescribeStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getDataEndpointRequest
     * @return getDataEndpointResult The response from the GetDataEndpoint
     *         service method, as returned by AWSKinesisVideoFrontend.
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ClientLimitExceededException
     * @throws NotAuthorizedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetDataEndpointResult getDataEndpoint(GetDataEndpointRequest getDataEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDataEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataEndpointRequest> request = null;
        Response<GetDataEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataEndpointRequestMarshaller().marshall(getDataEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDataEndpointResult, JsonUnmarshallerContext> unmarshaller = new GetDataEndpointResultJsonUnmarshaller();
            JsonResponseHandler<GetDataEndpointResult> responseHandler = new JsonResponseHandler<GetDataEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param listStreamsRequest
     * @return listStreamsResult The response from the ListStreams service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestMarshaller().marshall(listStreamsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListStreamsResult, JsonUnmarshallerContext> unmarshaller = new ListStreamsResultJsonUnmarshaller();
            JsonResponseHandler<ListStreamsResult> responseHandler = new JsonResponseHandler<ListStreamsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param listTagsForStreamRequest
     * @return listTagsForStreamResult The response from the ListTagsForStream
     *         service method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public ListTagsForStreamResult listTagsForStream(
            ListTagsForStreamRequest listTagsForStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTagsForStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForStreamRequest> request = null;
        Response<ListTagsForStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForStreamRequestMarshaller()
                        .marshall(listTagsForStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTagsForStreamResult, JsonUnmarshallerContext> unmarshaller = new ListTagsForStreamResultJsonUnmarshaller();
            JsonResponseHandler<ListTagsForStreamResult> responseHandler = new JsonResponseHandler<ListTagsForStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param tagStreamRequest
     * @return tagStreamResult The response from the TagStream service method,
     *         as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws TagsPerResourceExceededLimitException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public TagStreamResult tagStream(TagStreamRequest tagStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagStreamRequest> request = null;
        Response<TagStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagStreamRequestMarshaller().marshall(tagStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagStreamResult, JsonUnmarshallerContext> unmarshaller = new TagStreamResultJsonUnmarshaller();
            JsonResponseHandler<TagStreamResult> responseHandler = new JsonResponseHandler<TagStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param untagStreamRequest
     * @return untagStreamResult The response from the UntagStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws NotAuthorizedException
     * @throws InvalidResourceFormatException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UntagStreamResult untagStream(UntagStreamRequest untagStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagStreamRequest> request = null;
        Response<UntagStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagStreamRequestMarshaller().marshall(untagStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagStreamResult, JsonUnmarshallerContext> unmarshaller = new UntagStreamResultJsonUnmarshaller();
            JsonResponseHandler<UntagStreamResult> responseHandler = new JsonResponseHandler<UntagStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param updateDataRetentionRequest
     * @return updateDataRetentionResult The response from the
     *         UpdateDataRetention service method, as returned by
     *         AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws NotAuthorizedException
     * @throws VersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateDataRetentionResult updateDataRetention(
            UpdateDataRetentionRequest updateDataRetentionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataRetentionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataRetentionRequest> request = null;
        Response<UpdateDataRetentionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataRetentionRequestMarshaller()
                        .marshall(updateDataRetentionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataRetentionResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataRetentionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataRetentionResult> responseHandler = new JsonResponseHandler<UpdateDataRetentionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param updateStreamRequest
     * @return updateStreamResult The response from the UpdateStream service
     *         method, as returned by AWSKinesisVideoFrontend.
     * @throws ClientLimitExceededException
     * @throws InvalidArgumentException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws NotAuthorizedException
     * @throws VersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSKinesisVideoFrontend indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UpdateStreamResult updateStream(UpdateStreamRequest updateStreamRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamRequest> request = null;
        Response<UpdateStreamResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamRequestMarshaller().marshall(updateStreamRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateStreamResult, JsonUnmarshallerContext> unmarshaller = new UpdateStreamResultJsonUnmarshaller();
            JsonResponseHandler<UpdateStreamResult> responseHandler = new JsonResponseHandler<UpdateStreamResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
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
