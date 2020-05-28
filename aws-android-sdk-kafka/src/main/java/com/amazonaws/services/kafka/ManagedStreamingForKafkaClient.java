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

package com.amazonaws.services.kafka;

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

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.services.kafka.model.transform.*;

/**
 * Client for accessing Managed Streaming for Kafka. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 <p>
 * The operations for managing an Amazon MSK cluster.
 * </p>
 */
public class ManagedStreamingForKafkaClient extends AmazonWebServiceClient implements
        ManagedStreamingForKafka {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Managed Streaming for Kafka
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka. A credentials provider chain will be used that
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
    public ManagedStreamingForKafkaClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka. A credentials provider chain will be used that
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
     *            how this client connects to ManagedStreamingForKafka (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public ManagedStreamingForKafkaClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials.
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
     *         ManagedStreamingForKafkaClient client = new ManagedStreamingForKafkaClient(AWSMobileClient
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
    public ManagedStreamingForKafkaClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials and
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
     *         ManagedStreamingForKafkaClient client = new ManagedStreamingForKafkaClient(AWSMobileClient
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
     *            how this client connects to ManagedStreamingForKafka (ex:
     *            proxy settings, retry counts, etc.).
     */
    public ManagedStreamingForKafkaClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials
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
     *         ManagedStreamingForKafkaClient client = new ManagedStreamingForKafkaClient(AWSMobileClient
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
    public ManagedStreamingForKafkaClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials
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
     *         ManagedStreamingForKafkaClient client = new ManagedStreamingForKafkaClient(AWSMobileClient
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
     *            how this client connects to ManagedStreamingForKafka (ex:
     *            proxy settings, retry counts, etc.).
     */
    public ManagedStreamingForKafkaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to ManagedStreamingForKafka (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public ManagedStreamingForKafkaClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * ManagedStreamingForKafka using the specified AWS account credentials
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
     *         ManagedStreamingForKafkaClient client = new ManagedStreamingForKafkaClient(AWSMobileClient
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
     *            how this client connects to ManagedStreamingForKafka (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public ManagedStreamingForKafkaClient(AWSCredentialsProvider awsCredentialsProvider,
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
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("kafka.us-east-1.amazonaws.com");
        this.endpointPrefix = "kafka";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/kafka/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/kafka/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * 
     <p>
     * Creates a new MSK cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return createClusterResult The response from the CreateCluster service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateClusterResult createCluster(CreateClusterRequest createClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller().marshall(createClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateClusterResult, JsonUnmarshallerContext> unmarshaller = new CreateClusterResultJsonUnmarshaller();
            JsonResponseHandler<CreateClusterResult> responseHandler = new JsonResponseHandler<CreateClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Creates a new MSK configuration.
     * </p>
     * 
     * @param createConfigurationRequest
     * @return createConfigurationResult The response from the
     *         CreateConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public CreateConfigurationResult createConfiguration(
            CreateConfigurationRequest createConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationRequest> request = null;
        Response<CreateConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationRequestMarshaller()
                        .marshall(createConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateConfigurationResult, JsonUnmarshallerContext> unmarshaller = new CreateConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<CreateConfigurationResult> responseHandler = new JsonResponseHandler<CreateConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in
     * the request.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return deleteClusterResult The response from the DeleteCluster service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestMarshaller().marshall(deleteClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteClusterResult, JsonUnmarshallerContext> unmarshaller = new DeleteClusterResultJsonUnmarshaller();
            JsonResponseHandler<DeleteClusterResult> responseHandler = new JsonResponseHandler<DeleteClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN)
     * is specified in the request.
     * </p>
     * 
     * @param describeClusterRequest
     * @return describeClusterResult The response from the DescribeCluster
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestMarshaller().marshall(describeClusterRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClusterResult, JsonUnmarshallerContext> unmarshaller = new DescribeClusterResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClusterResult> responseHandler = new JsonResponseHandler<DescribeClusterResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a description of the cluster operation specified by the ARN.
     * </p>
     * 
     * @param describeClusterOperationRequest
     * @return describeClusterOperationResult The response from the
     *         DescribeClusterOperation service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeClusterOperationResult describeClusterOperation(
            DescribeClusterOperationRequest describeClusterOperationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeClusterOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterOperationRequest> request = null;
        Response<DescribeClusterOperationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterOperationRequestMarshaller()
                        .marshall(describeClusterOperationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeClusterOperationResult, JsonUnmarshallerContext> unmarshaller = new DescribeClusterOperationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeClusterOperationResult> responseHandler = new JsonResponseHandler<DescribeClusterOperationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a description of this MSK configuration.
     * </p>
     * 
     * @param describeConfigurationRequest
     * @return describeConfigurationResult The response from the
     *         DescribeConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeConfigurationResult describeConfiguration(
            DescribeConfigurationRequest describeConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRequest> request = null;
        Response<DescribeConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRequestMarshaller()
                        .marshall(describeConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DescribeConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConfigurationResult> responseHandler = new JsonResponseHandler<DescribeConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a description of this revision of the configuration.
     * </p>
     * 
     * @param describeConfigurationRevisionRequest
     * @return describeConfigurationRevisionResult The response from the
     *         DescribeConfigurationRevision service method, as returned by
     *         Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public DescribeConfigurationRevisionResult describeConfigurationRevision(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationRevisionRequest> request = null;
        Response<DescribeConfigurationRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationRevisionRequestMarshaller()
                        .marshall(describeConfigurationRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeConfigurationRevisionResult, JsonUnmarshallerContext> unmarshaller = new DescribeConfigurationRevisionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeConfigurationRevisionResult> responseHandler = new JsonResponseHandler<DescribeConfigurationRevisionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * A list of brokers that a client application can use to bootstrap.
     * </p>
     * 
     * @param getBootstrapBrokersRequest
     * @return getBootstrapBrokersResult The response from the
     *         GetBootstrapBrokers service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ConflictException <p>
     *             This cluster name already exists. Retry your request using
     *             another name.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetBootstrapBrokersResult getBootstrapBrokers(
            GetBootstrapBrokersRequest getBootstrapBrokersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBootstrapBrokersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBootstrapBrokersRequest> request = null;
        Response<GetBootstrapBrokersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBootstrapBrokersRequestMarshaller()
                        .marshall(getBootstrapBrokersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBootstrapBrokersResult, JsonUnmarshallerContext> unmarshaller = new GetBootstrapBrokersResultJsonUnmarshaller();
            JsonResponseHandler<GetBootstrapBrokersResult> responseHandler = new JsonResponseHandler<GetBootstrapBrokersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Gets the Apache Kafka versions to which you can update the MSK cluster.
     * </p>
     * 
     * @param getCompatibleKafkaVersionsRequest
     * @return getCompatibleKafkaVersionsResult The response from the
     *         GetCompatibleKafkaVersions service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException n
     *             <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p>
     *             n
     * @throws UnauthorizedException n
     *             <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p>
     *             n
     * @throws InternalServerErrorException n
     *             <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p>
     *             n
     * @throws ForbiddenException n
     *             <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p>
     *             n
     * @throws NotFoundException n
     *             <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p>
     *             n
     * @throws ServiceUnavailableException n
     *             <p>
     *             503 response
     *             </p>
     *             n
     * @throws TooManyRequestsException n
     *             <p>
     *             429 response
     *             </p>
     *             n
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public GetCompatibleKafkaVersionsResult getCompatibleKafkaVersions(
            GetCompatibleKafkaVersionsRequest getCompatibleKafkaVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCompatibleKafkaVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompatibleKafkaVersionsRequest> request = null;
        Response<GetCompatibleKafkaVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompatibleKafkaVersionsRequestMarshaller()
                        .marshall(getCompatibleKafkaVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCompatibleKafkaVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetCompatibleKafkaVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetCompatibleKafkaVersionsResult> responseHandler = new JsonResponseHandler<GetCompatibleKafkaVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of all the operations that have been performed on the
     * specified MSK cluster.
     * </p>
     * 
     * @param listClusterOperationsRequest
     * @return listClusterOperationsResult The response from the
     *         ListClusterOperations service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListClusterOperationsResult listClusterOperations(
            ListClusterOperationsRequest listClusterOperationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClusterOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClusterOperationsRequest> request = null;
        Response<ListClusterOperationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClusterOperationsRequestMarshaller()
                        .marshall(listClusterOperationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClusterOperationsResult, JsonUnmarshallerContext> unmarshaller = new ListClusterOperationsResultJsonUnmarshaller();
            JsonResponseHandler<ListClusterOperationsResult> responseHandler = new JsonResponseHandler<ListClusterOperationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of all the MSK clusters in the current Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return listClustersResult The response from the ListClusters service
     *         method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListClustersResult listClusters(ListClustersRequest listClustersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestMarshaller().marshall(listClustersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListClustersResult, JsonUnmarshallerContext> unmarshaller = new ListClustersResultJsonUnmarshaller();
            JsonResponseHandler<ListClustersResult> responseHandler = new JsonResponseHandler<ListClustersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationRevisionsRequest
     * @return listConfigurationRevisionsResult The response from the
     *         ListConfigurationRevisions service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListConfigurationRevisionsResult listConfigurationRevisions(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listConfigurationRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationRevisionsRequest> request = null;
        Response<ListConfigurationRevisionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationRevisionsRequestMarshaller()
                        .marshall(listConfigurationRevisionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListConfigurationRevisionsResult, JsonUnmarshallerContext> unmarshaller = new ListConfigurationRevisionsResultJsonUnmarshaller();
            JsonResponseHandler<ListConfigurationRevisionsResult> responseHandler = new JsonResponseHandler<ListConfigurationRevisionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of all the MSK configurations in this Region.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return listConfigurationsResult The response from the ListConfigurations
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListConfigurationsResult listConfigurations(
            ListConfigurationsRequest listConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationsRequest> request = null;
        Response<ListConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationsRequestMarshaller()
                        .marshall(listConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new ListConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<ListConfigurationsResult> responseHandler = new JsonResponseHandler<ListConfigurationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of Kafka versions.
     * </p>
     * 
     * @param listKafkaVersionsRequest
     * @return listKafkaVersionsResult The response from the ListKafkaVersions
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListKafkaVersionsResult listKafkaVersions(
            ListKafkaVersionsRequest listKafkaVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listKafkaVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKafkaVersionsRequest> request = null;
        Response<ListKafkaVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKafkaVersionsRequestMarshaller()
                        .marshall(listKafkaVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKafkaVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListKafkaVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListKafkaVersionsResult> responseHandler = new JsonResponseHandler<ListKafkaVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of the broker nodes in the cluster.
     * </p>
     * 
     * @param listNodesRequest
     * @return listNodesResult The response from the ListNodes service method,
     *         as returned by Managed Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public ListNodesResult listNodes(ListNodesRequest listNodesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodesRequest> request = null;
        Response<ListNodesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodesRequestMarshaller().marshall(listNodesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListNodesResult, JsonUnmarshallerContext> unmarshaller = new ListNodesResultJsonUnmarshaller();
            JsonResponseHandler<ListNodesResult> responseHandler = new JsonResponseHandler<ListNodesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Returns a list of the tags associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
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
     * 
     <p>
     * Adds tags to the specified MSK resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
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
     * 
     <p>
     * Removes the tags associated with the keys that are provided in the query.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public void untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
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
     * 
     <p>
     * Updates the number of broker nodes in the cluster.
     * </p>
     * 
     * @param updateBrokerCountRequest
     * @return updateBrokerCountResult The response from the UpdateBrokerCount
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateBrokerCountResult updateBrokerCount(
            UpdateBrokerCountRequest updateBrokerCountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBrokerCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrokerCountRequest> request = null;
        Response<UpdateBrokerCountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrokerCountRequestMarshaller()
                        .marshall(updateBrokerCountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBrokerCountResult, JsonUnmarshallerContext> unmarshaller = new UpdateBrokerCountResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBrokerCountResult> responseHandler = new JsonResponseHandler<UpdateBrokerCountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Updates the EBS storage associated with MSK brokers.
     * </p>
     * 
     * @param updateBrokerStorageRequest
     * @return updateBrokerStorageResult The response from the
     *         UpdateBrokerStorage service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateBrokerStorageResult updateBrokerStorage(
            UpdateBrokerStorageRequest updateBrokerStorageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBrokerStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBrokerStorageRequest> request = null;
        Response<UpdateBrokerStorageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBrokerStorageRequestMarshaller()
                        .marshall(updateBrokerStorageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBrokerStorageResult, JsonUnmarshallerContext> unmarshaller = new UpdateBrokerStorageResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBrokerStorageResult> responseHandler = new JsonResponseHandler<UpdateBrokerStorageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Updates the cluster with the configuration that is specified in the
     * request body.
     * </p>
     * 
     * @param updateClusterConfigurationRequest
     * @return updateClusterConfigurationResult The response from the
     *         UpdateClusterConfiguration service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateClusterConfigurationResult updateClusterConfiguration(
            UpdateClusterConfigurationRequest updateClusterConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClusterConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterConfigurationRequest> request = null;
        Response<UpdateClusterConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterConfigurationRequestMarshaller()
                        .marshall(updateClusterConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClusterConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateClusterConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClusterConfigurationResult> responseHandler = new JsonResponseHandler<UpdateClusterConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Updates the Apache Kafka version for the cluster.
     * </p>
     * 
     * @param updateClusterKafkaVersionRequest
     * @return updateClusterKafkaVersionResult The response from the
     *         UpdateClusterKafkaVersion service method, as returned by Managed
     *         Streaming for Kafka.
     * @throws BadRequestException <p>
     *             The request isn't valid because the input is incorrect.
     *             Correct your input and then submit it again.
     *             </p> @throws UnauthorizedException <p>
     *             The request is not authorized. The provided credentials
     *             couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             There was an unexpected internal server error. Retrying your
     *             request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             Access forbidden. Check your credentials and then retry your
     *             request.
     *             </p> @throws NotFoundException <p>
     *             The resource could not be found due to incorrect input.
     *             Correct the input, then retry the request.
     *             </p> @throws ServiceUnavailableException <p>
     *             503 response
     *             </p> @throws TooManyRequestsException <p>
     *             429 response
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateClusterKafkaVersionResult updateClusterKafkaVersion(
            UpdateClusterKafkaVersionRequest updateClusterKafkaVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClusterKafkaVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterKafkaVersionRequest> request = null;
        Response<UpdateClusterKafkaVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterKafkaVersionRequestMarshaller()
                        .marshall(updateClusterKafkaVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClusterKafkaVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateClusterKafkaVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClusterKafkaVersionResult> responseHandler = new JsonResponseHandler<UpdateClusterKafkaVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * 
     <p>
     * Updates the monitoring settings for the cluster. You can use this
     * operation to specify which Apache Kafka metrics you want Amazon MSK to
     * send to Amazon CloudWatch. You can also specify settings for open
     * monitoring with Prometheus.
     * </p>
     * 
     * @param updateMonitoringRequest Request body for UpdateMonitoring.
     * @return updateMonitoringResult The response from the UpdateMonitoring
     *         service method, as returned by Managed Streaming for Kafka.
     * @throws ServiceUnavailableException <p>
     *             HTTP Status Code 503: Service Unavailable. Retrying your
     *             request in some time might resolve the issue.
     *             </p> @throws BadRequestException <p>
     *             HTTP Status Code 400: Bad request due to incorrect input.
     *             Correct your request and then retry it.
     *             </p> @throws UnauthorizedException <p>
     *             HTTP Status Code 401: Unauthorized request. The provided
     *             credentials couldn't be validated.
     *             </p> @throws InternalServerErrorException <p>
     *             HTTP Status Code 500: Unexpected internal server error.
     *             Retrying your request might resolve the issue.
     *             </p> @throws ForbiddenException <p>
     *             HTTP Status Code 403: Access forbidden. Correct your
     *             credentials and then retry your request.
     *             </p> @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Managed Streaming for Kafka indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    public UpdateMonitoringResult updateMonitoring(UpdateMonitoringRequest updateMonitoringRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitoringRequest> request = null;
        Response<UpdateMonitoringResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitoringRequestMarshaller().marshall(updateMonitoringRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMonitoringResult, JsonUnmarshallerContext> unmarshaller = new UpdateMonitoringResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMonitoringResult> responseHandler = new JsonResponseHandler<UpdateMonitoringResult>(
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
