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

package com.amazonaws.services.awsglue;

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

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.services.awsglue.model.transform.*;

/**
 * Client for accessing AWS Glue. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Glue</fullname>
 * <p>
 * Defines the public endpoint for the AWS Glue service.
 * </p>
 */
public class AWSGlueClient extends AmazonWebServiceClient implements AWSGlue {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Glue exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSGlue. A
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
    public AWSGlueClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue. A
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
     *            how this client connects to AWSGlue (ex: proxy settings, retry
     *            counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSGlueClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials.
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
     *         AWSGlueClient client = new AWSGlueClient(AWSMobileClient.getInstance());
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
    public AWSGlueClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials and client configuration options.
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
     *         AWSGlueClient client = new AWSGlueClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSGlue (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSGlueClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials provider.
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
     *         AWSGlueClient client = new AWSGlueClient(AWSMobileClient.getInstance());
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
    public AWSGlueClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials provider and client configuration
     * options.
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
     *         AWSGlueClient client = new AWSGlueClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSGlue (ex: proxy settings, retry
     *            counts, etc.).
     */
    public AWSGlueClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AWSGlue (ex: proxy settings, retry
     *            counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSGlueClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSGlue using the
     * specified AWS account credentials provider, client configuration options
     * and request metric collector.
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
     *         AWSGlueClient client = new AWSGlueClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSGlue (ex: proxy settings, retry
     *            counts, etc.).
     * @param httpClient A http client
     */
    public AWSGlueClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentRunsExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConditionCheckFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CrawlerNotRunningExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CrawlerRunningExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CrawlerStoppingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new EntityNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new GlueEncryptionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new MLTransformNotReadyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NoScheduleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new OperationTimeoutExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNumberLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SchedulerNotRunningExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SchedulerRunningExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SchedulerTransitioningExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new VersionMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("glue.us-east-1.amazonaws.com");
        this.endpointPrefix = "glue";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/awsglue/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/awsglue/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchCreatePartitionRequest
     * @return batchCreatePartitionResult The response from the
     *         BatchCreatePartition service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchCreatePartitionResult batchCreatePartition(
            BatchCreatePartitionRequest batchCreatePartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCreatePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreatePartitionRequest> request = null;
        Response<BatchCreatePartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreatePartitionRequestMarshaller()
                        .marshall(batchCreatePartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCreatePartitionResult, JsonUnmarshallerContext> unmarshaller = new BatchCreatePartitionResultJsonUnmarshaller();
            JsonResponseHandler<BatchCreatePartitionResult> responseHandler = new JsonResponseHandler<BatchCreatePartitionResult>(
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
     * Deletes a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param batchDeleteConnectionRequest
     * @return batchDeleteConnectionResult The response from the
     *         BatchDeleteConnection service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteConnectionResult batchDeleteConnection(
            BatchDeleteConnectionRequest batchDeleteConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteConnectionRequest> request = null;
        Response<BatchDeleteConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteConnectionRequestMarshaller()
                        .marshall(batchDeleteConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteConnectionResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteConnectionResult> responseHandler = new JsonResponseHandler<BatchDeleteConnectionResult>(
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
     * Deletes one or more partitions in a batch operation.
     * </p>
     * 
     * @param batchDeletePartitionRequest
     * @return batchDeletePartitionResult The response from the
     *         BatchDeletePartition service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeletePartitionResult batchDeletePartition(
            BatchDeletePartitionRequest batchDeletePartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeletePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeletePartitionRequest> request = null;
        Response<BatchDeletePartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeletePartitionRequestMarshaller()
                        .marshall(batchDeletePartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeletePartitionResult, JsonUnmarshallerContext> unmarshaller = new BatchDeletePartitionResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeletePartitionResult> responseHandler = new JsonResponseHandler<BatchDeletePartitionResult>(
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
     * Deletes multiple tables at once.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table
     * versions and partitions that belong to the deleted table. AWS Glue
     * deletes these "orphaned" resources asynchronously in a timely manner, at
     * the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>BatchDeleteTable</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to
     * the table.
     * </p>
     * </note>
     * 
     * @param batchDeleteTableRequest
     * @return batchDeleteTableResult The response from the BatchDeleteTable
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteTableResult batchDeleteTable(BatchDeleteTableRequest batchDeleteTableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteTableRequest> request = null;
        Response<BatchDeleteTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteTableRequestMarshaller().marshall(batchDeleteTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteTableResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteTableResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteTableResult> responseHandler = new JsonResponseHandler<BatchDeleteTableResult>(
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
     * Deletes a specified batch of versions of a table.
     * </p>
     * 
     * @param batchDeleteTableVersionRequest
     * @return batchDeleteTableVersionResult The response from the
     *         BatchDeleteTableVersion service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDeleteTableVersionResult batchDeleteTableVersion(
            BatchDeleteTableVersionRequest batchDeleteTableVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteTableVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteTableVersionRequest> request = null;
        Response<BatchDeleteTableVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteTableVersionRequestMarshaller()
                        .marshall(batchDeleteTableVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteTableVersionResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteTableVersionResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteTableVersionResult> responseHandler = new JsonResponseHandler<BatchDeleteTableVersionResult>(
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
     * Returns a list of resource metadata for a given list of crawler names.
     * After calling the <code>ListCrawlers</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetCrawlersRequest
     * @return batchGetCrawlersResult The response from the BatchGetCrawlers
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetCrawlersResult batchGetCrawlers(BatchGetCrawlersRequest batchGetCrawlersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetCrawlersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCrawlersRequest> request = null;
        Response<BatchGetCrawlersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCrawlersRequestMarshaller().marshall(batchGetCrawlersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetCrawlersResult, JsonUnmarshallerContext> unmarshaller = new BatchGetCrawlersResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetCrawlersResult> responseHandler = new JsonResponseHandler<BatchGetCrawlersResult>(
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
     * Returns a list of resource metadata for a given list of development
     * endpoint names. After calling the <code>ListDevEndpoints</code>
     * operation, you can call this operation to access the data to which you
     * have been granted permissions. This operation supports all IAM
     * permissions, including permission conditions that uses tags.
     * </p>
     * 
     * @param batchGetDevEndpointsRequest
     * @return batchGetDevEndpointsResult The response from the
     *         BatchGetDevEndpoints service method, as returned by AWS Glue.
     * @throws AccessDeniedException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetDevEndpointsResult batchGetDevEndpoints(
            BatchGetDevEndpointsRequest batchGetDevEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetDevEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetDevEndpointsRequest> request = null;
        Response<BatchGetDevEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetDevEndpointsRequestMarshaller()
                        .marshall(batchGetDevEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetDevEndpointsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetDevEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetDevEndpointsResult> responseHandler = new JsonResponseHandler<BatchGetDevEndpointsResult>(
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
     * Returns a list of resource metadata for a given list of job names. After
     * calling the <code>ListJobs</code> operation, you can call this operation
     * to access the data to which you have been granted permissions. This
     * operation supports all IAM permissions, including permission conditions
     * that uses tags.
     * </p>
     * 
     * @param batchGetJobsRequest
     * @return batchGetJobsResult The response from the BatchGetJobs service
     *         method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetJobsResult batchGetJobs(BatchGetJobsRequest batchGetJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetJobsRequest> request = null;
        Response<BatchGetJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetJobsRequestMarshaller().marshall(batchGetJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetJobsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetJobsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetJobsResult> responseHandler = new JsonResponseHandler<BatchGetJobsResult>(
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
     * Retrieves partitions in a batch request.
     * </p>
     * 
     * @param batchGetPartitionRequest
     * @return batchGetPartitionResult The response from the BatchGetPartition
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetPartitionResult batchGetPartition(
            BatchGetPartitionRequest batchGetPartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetPartitionRequest> request = null;
        Response<BatchGetPartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetPartitionRequestMarshaller()
                        .marshall(batchGetPartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetPartitionResult, JsonUnmarshallerContext> unmarshaller = new BatchGetPartitionResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetPartitionResult> responseHandler = new JsonResponseHandler<BatchGetPartitionResult>(
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
     * Returns a list of resource metadata for a given list of trigger names.
     * After calling the <code>ListTriggers</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetTriggersRequest
     * @return batchGetTriggersResult The response from the BatchGetTriggers
     *         service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetTriggersResult batchGetTriggers(BatchGetTriggersRequest batchGetTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetTriggersRequest> request = null;
        Response<BatchGetTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetTriggersRequestMarshaller().marshall(batchGetTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetTriggersResult, JsonUnmarshallerContext> unmarshaller = new BatchGetTriggersResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetTriggersResult> responseHandler = new JsonResponseHandler<BatchGetTriggersResult>(
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
     * Returns a list of resource metadata for a given list of workflow names.
     * After calling the <code>ListWorkflows</code> operation, you can call this
     * operation to access the data to which you have been granted permissions.
     * This operation supports all IAM permissions, including permission
     * conditions that uses tags.
     * </p>
     * 
     * @param batchGetWorkflowsRequest
     * @return batchGetWorkflowsResult The response from the BatchGetWorkflows
     *         service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchGetWorkflowsResult batchGetWorkflows(
            BatchGetWorkflowsRequest batchGetWorkflowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetWorkflowsRequest> request = null;
        Response<BatchGetWorkflowsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetWorkflowsRequestMarshaller()
                        .marshall(batchGetWorkflowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetWorkflowsResult, JsonUnmarshallerContext> unmarshaller = new BatchGetWorkflowsResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetWorkflowsResult> responseHandler = new JsonResponseHandler<BatchGetWorkflowsResult>(
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
     * Stops one or more job runs for a specified job definition.
     * </p>
     * 
     * @param batchStopJobRunRequest
     * @return batchStopJobRunResult The response from the BatchStopJobRun
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchStopJobRunResult batchStopJobRun(BatchStopJobRunRequest batchStopJobRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchStopJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchStopJobRunRequest> request = null;
        Response<BatchStopJobRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchStopJobRunRequestMarshaller().marshall(batchStopJobRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchStopJobRunResult, JsonUnmarshallerContext> unmarshaller = new BatchStopJobRunResultJsonUnmarshaller();
            JsonResponseHandler<BatchStopJobRunResult> responseHandler = new JsonResponseHandler<BatchStopJobRunResult>(
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
     * Cancels (stops) a task run. Machine learning task runs are asynchronous
     * tasks that AWS Glue runs on your behalf as part of various machine
     * learning workflows. You can cancel a machine learning task run at any
     * time by calling <code>CancelMLTaskRun</code> with a task run's parent
     * transform's <code>TransformID</code> and the task run's
     * <code>TaskRunId</code>.
     * </p>
     * 
     * @param cancelMLTaskRunRequest
     * @return cancelMLTaskRunResult The response from the CancelMLTaskRun
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CancelMLTaskRunResult cancelMLTaskRun(CancelMLTaskRunRequest cancelMLTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelMLTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMLTaskRunRequest> request = null;
        Response<CancelMLTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMLTaskRunRequestMarshaller().marshall(cancelMLTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelMLTaskRunResult, JsonUnmarshallerContext> unmarshaller = new CancelMLTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<CancelMLTaskRunResult> responseHandler = new JsonResponseHandler<CancelMLTaskRunResult>(
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
     * Creates a classifier in the user's account. This can be a
     * <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
     * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending
     * on which field of the request is present.
     * </p>
     * 
     * @param createClassifierRequest
     * @return createClassifierResult The response from the CreateClassifier
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateClassifierResult createClassifier(CreateClassifierRequest createClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClassifierRequest> request = null;
        Response<CreateClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClassifierRequestMarshaller().marshall(createClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateClassifierResult, JsonUnmarshallerContext> unmarshaller = new CreateClassifierResultJsonUnmarshaller();
            JsonResponseHandler<CreateClassifierResult> responseHandler = new JsonResponseHandler<CreateClassifierResult>(
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
     * Creates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param createConnectionRequest
     * @return createConnectionResult The response from the CreateConnection
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestMarshaller().marshall(createConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> unmarshaller = new CreateConnectionResultJsonUnmarshaller();
            JsonResponseHandler<CreateConnectionResult> responseHandler = new JsonResponseHandler<CreateConnectionResult>(
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
     * Creates a new crawler with specified targets, role, configuration, and
     * optional schedule. At least one crawl target must be specified, in the
     * <code>s3Targets</code> field, the <code>jdbcTargets</code> field, or the
     * <code>DynamoDBTargets</code> field.
     * </p>
     * 
     * @param createCrawlerRequest
     * @return createCrawlerResult The response from the CreateCrawler service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateCrawlerResult createCrawler(CreateCrawlerRequest createCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCrawlerRequest> request = null;
        Response<CreateCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCrawlerRequestMarshaller().marshall(createCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateCrawlerResult, JsonUnmarshallerContext> unmarshaller = new CreateCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<CreateCrawlerResult> responseHandler = new JsonResponseHandler<CreateCrawlerResult>(
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
     * Creates a new database in a Data Catalog.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return createDatabaseResult The response from the CreateDatabase service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDatabaseResult createDatabase(CreateDatabaseRequest createDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatabaseRequest> request = null;
        Response<CreateDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatabaseRequestMarshaller().marshall(createDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDatabaseResult, JsonUnmarshallerContext> unmarshaller = new CreateDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<CreateDatabaseResult> responseHandler = new JsonResponseHandler<CreateDatabaseResult>(
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
     * Creates a new development endpoint.
     * </p>
     * 
     * @param createDevEndpointRequest
     * @return createDevEndpointResult The response from the CreateDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws AccessDeniedException
     * @throws AlreadyExistsException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ValidationException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDevEndpointResult createDevEndpoint(
            CreateDevEndpointRequest createDevEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDevEndpointRequest> request = null;
        Response<CreateDevEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDevEndpointRequestMarshaller()
                        .marshall(createDevEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDevEndpointResult, JsonUnmarshallerContext> unmarshaller = new CreateDevEndpointResultJsonUnmarshaller();
            JsonResponseHandler<CreateDevEndpointResult> responseHandler = new JsonResponseHandler<CreateDevEndpointResult>(
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
     * Creates a new job definition.
     * </p>
     * 
     * @param createJobRequest
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws AlreadyExistsException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestMarshaller().marshall(createJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateJobResult, JsonUnmarshallerContext> unmarshaller = new CreateJobResultJsonUnmarshaller();
            JsonResponseHandler<CreateJobResult> responseHandler = new JsonResponseHandler<CreateJobResult>(
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
     * Creates an AWS Glue machine learning transform. This operation creates
     * the transform and all the necessary parameters to train it.
     * </p>
     * <p>
     * Call this operation as the first step in the process of using a machine
     * learning transform (such as the <code>FindMatches</code> transform) for
     * deduplicating data. You can provide an optional <code>Description</code>,
     * in addition to the parameters that you want to use for your algorithm.
     * </p>
     * <p>
     * You must also specify certain parameters for the tasks that AWS Glue runs
     * on your behalf as part of learning from your data and creating a
     * high-quality machine learning transform. These parameters include
     * <code>Role</code>, and optionally, <code>AllocatedCapacity</code>,
     * <code>Timeout</code>, and <code>MaxRetries</code>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html"
     * >Jobs</a>.
     * </p>
     * 
     * @param createMLTransformRequest
     * @return createMLTransformResult The response from the CreateMLTransform
     *         service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws ResourceNumberLimitExceededException
     * @throws IdempotentParameterMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateMLTransformResult createMLTransform(
            CreateMLTransformRequest createMLTransformRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createMLTransformRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMLTransformRequest> request = null;
        Response<CreateMLTransformResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMLTransformRequestMarshaller()
                        .marshall(createMLTransformRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateMLTransformResult, JsonUnmarshallerContext> unmarshaller = new CreateMLTransformResultJsonUnmarshaller();
            JsonResponseHandler<CreateMLTransformResult> responseHandler = new JsonResponseHandler<CreateMLTransformResult>(
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
     * Creates a new partition.
     * </p>
     * 
     * @param createPartitionRequest
     * @return createPartitionResult The response from the CreatePartition
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws AlreadyExistsException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreatePartitionResult createPartition(CreatePartitionRequest createPartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePartitionRequest> request = null;
        Response<CreatePartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePartitionRequestMarshaller().marshall(createPartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreatePartitionResult, JsonUnmarshallerContext> unmarshaller = new CreatePartitionResultJsonUnmarshaller();
            JsonResponseHandler<CreatePartitionResult> responseHandler = new JsonResponseHandler<CreatePartitionResult>(
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
     * Transforms a directed acyclic graph (DAG) into code.
     * </p>
     * 
     * @param createScriptRequest
     * @return createScriptResult The response from the CreateScript service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateScriptResult createScript(CreateScriptRequest createScriptRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createScriptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScriptRequest> request = null;
        Response<CreateScriptResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScriptRequestMarshaller().marshall(createScriptRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateScriptResult, JsonUnmarshallerContext> unmarshaller = new CreateScriptResultJsonUnmarshaller();
            JsonResponseHandler<CreateScriptResult> responseHandler = new JsonResponseHandler<CreateScriptResult>(
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
     * Creates a new security configuration. A security configuration is a set
     * of security properties that can be used by AWS Glue. You can use a
     * security configuration to encrypt data at rest. For information about
     * using security configurations in AWS Glue, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/encryption-security-configuration.html"
     * >Encrypting Data Written by Crawlers, Jobs, and Development
     * Endpoints</a>.
     * </p>
     * 
     * @param createSecurityConfigurationRequest
     * @return createSecurityConfigurationResult The response from the
     *         CreateSecurityConfiguration service method, as returned by AWS
     *         Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSecurityConfigurationResult createSecurityConfiguration(
            CreateSecurityConfigurationRequest createSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityConfigurationRequest> request = null;
        Response<CreateSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityConfigurationRequestMarshaller()
                        .marshall(createSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new CreateSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<CreateSecurityConfigurationResult> responseHandler = new JsonResponseHandler<CreateSecurityConfigurationResult>(
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
     * Creates a new table definition in the Data Catalog.
     * </p>
     * 
     * @param createTableRequest
     * @return createTableResult The response from the CreateTable service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateTableResult createTable(CreateTableRequest createTableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestMarshaller().marshall(createTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTableResult, JsonUnmarshallerContext> unmarshaller = new CreateTableResultJsonUnmarshaller();
            JsonResponseHandler<CreateTableResult> responseHandler = new JsonResponseHandler<CreateTableResult>(
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
     * Creates a new trigger.
     * </p>
     * 
     * @param createTriggerRequest
     * @return createTriggerResult The response from the CreateTrigger service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateTriggerResult createTrigger(CreateTriggerRequest createTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTriggerRequest> request = null;
        Response<CreateTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTriggerRequestMarshaller().marshall(createTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTriggerResult, JsonUnmarshallerContext> unmarshaller = new CreateTriggerResultJsonUnmarshaller();
            JsonResponseHandler<CreateTriggerResult> responseHandler = new JsonResponseHandler<CreateTriggerResult>(
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
     * Creates a new function definition in the Data Catalog.
     * </p>
     * 
     * @param createUserDefinedFunctionRequest
     * @return createUserDefinedFunctionResult The response from the
     *         CreateUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUserDefinedFunctionResult createUserDefinedFunction(
            CreateUserDefinedFunctionRequest createUserDefinedFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserDefinedFunctionRequest> request = null;
        Response<CreateUserDefinedFunctionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserDefinedFunctionRequestMarshaller()
                        .marshall(createUserDefinedFunctionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUserDefinedFunctionResult, JsonUnmarshallerContext> unmarshaller = new CreateUserDefinedFunctionResultJsonUnmarshaller();
            JsonResponseHandler<CreateUserDefinedFunctionResult> responseHandler = new JsonResponseHandler<CreateUserDefinedFunctionResult>(
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
     * Creates a new workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return createWorkflowResult The response from the CreateWorkflow service
     *         method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkflowRequest> request = null;
        Response<CreateWorkflowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkflowRequestMarshaller().marshall(createWorkflowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWorkflowResult, JsonUnmarshallerContext> unmarshaller = new CreateWorkflowResultJsonUnmarshaller();
            JsonResponseHandler<CreateWorkflowResult> responseHandler = new JsonResponseHandler<CreateWorkflowResult>(
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
     * Removes a classifier from the Data Catalog.
     * </p>
     * 
     * @param deleteClassifierRequest
     * @return deleteClassifierResult The response from the DeleteClassifier
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteClassifierResult deleteClassifier(DeleteClassifierRequest deleteClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClassifierRequest> request = null;
        Response<DeleteClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClassifierRequestMarshaller().marshall(deleteClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteClassifierResult, JsonUnmarshallerContext> unmarshaller = new DeleteClassifierResultJsonUnmarshaller();
            JsonResponseHandler<DeleteClassifierResult> responseHandler = new JsonResponseHandler<DeleteClassifierResult>(
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
     * Deletes a connection from the Data Catalog.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return deleteConnectionResult The response from the DeleteConnection
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestMarshaller().marshall(deleteConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteConnectionResult, JsonUnmarshallerContext> unmarshaller = new DeleteConnectionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteConnectionResult> responseHandler = new JsonResponseHandler<DeleteConnectionResult>(
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
     * Removes a specified crawler from the AWS Glue Data Catalog, unless the
     * crawler state is <code>RUNNING</code>.
     * </p>
     * 
     * @param deleteCrawlerRequest
     * @return deleteCrawlerResult The response from the DeleteCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteCrawlerResult deleteCrawler(DeleteCrawlerRequest deleteCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCrawlerRequest> request = null;
        Response<DeleteCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCrawlerRequestMarshaller().marshall(deleteCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteCrawlerResult, JsonUnmarshallerContext> unmarshaller = new DeleteCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteCrawlerResult> responseHandler = new JsonResponseHandler<DeleteCrawlerResult>(
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
     * Removes a specified database from a Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the tables
     * (and all table versions and partitions that might belong to the tables)
     * and the user-defined functions in the deleted database. AWS Glue deletes
     * these "orphaned" resources asynchronously in a timely manner, at the
     * discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>DeleteDatabase</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, <code>DeleteUserDefinedFunction</code>
     * , and <code>DeleteTable</code> or <code>BatchDeleteTable</code>, to
     * delete any resources that belong to the database.
     * </p>
     * </note>
     * 
     * @param deleteDatabaseRequest
     * @return deleteDatabaseResult The response from the DeleteDatabase service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatabaseRequest> request = null;
        Response<DeleteDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatabaseRequestMarshaller().marshall(deleteDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDatabaseResult, JsonUnmarshallerContext> unmarshaller = new DeleteDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDatabaseResult> responseHandler = new JsonResponseHandler<DeleteDatabaseResult>(
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
     * Deletes a specified development endpoint.
     * </p>
     * 
     * @param deleteDevEndpointRequest
     * @return deleteDevEndpointResult The response from the DeleteDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDevEndpointResult deleteDevEndpoint(
            DeleteDevEndpointRequest deleteDevEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDevEndpointRequest> request = null;
        Response<DeleteDevEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDevEndpointRequestMarshaller()
                        .marshall(deleteDevEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDevEndpointResult, JsonUnmarshallerContext> unmarshaller = new DeleteDevEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDevEndpointResult> responseHandler = new JsonResponseHandler<DeleteDevEndpointResult>(
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
     * Deletes a specified job definition. If the job definition is not found,
     * no exception is thrown.
     * </p>
     * 
     * @param deleteJobRequest
     * @return deleteJobResult The response from the DeleteJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestMarshaller().marshall(deleteJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteJobResult, JsonUnmarshallerContext> unmarshaller = new DeleteJobResultJsonUnmarshaller();
            JsonResponseHandler<DeleteJobResult> responseHandler = new JsonResponseHandler<DeleteJobResult>(
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
     * Deletes an AWS Glue machine learning transform. Machine learning
     * transforms are a special type of transform that use machine learning to
     * learn the details of the transformation to be performed by learning from
     * examples provided by humans. These transformations are then saved by AWS
     * Glue. If you no longer need a transform, you can delete it by calling
     * <code>DeleteMLTransforms</code>. However, any AWS Glue jobs that still
     * reference the deleted transform will no longer succeed.
     * </p>
     * 
     * @param deleteMLTransformRequest
     * @return deleteMLTransformResult The response from the DeleteMLTransform
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteMLTransformResult deleteMLTransform(
            DeleteMLTransformRequest deleteMLTransformRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMLTransformRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMLTransformRequest> request = null;
        Response<DeleteMLTransformResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMLTransformRequestMarshaller()
                        .marshall(deleteMLTransformRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteMLTransformResult, JsonUnmarshallerContext> unmarshaller = new DeleteMLTransformResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMLTransformResult> responseHandler = new JsonResponseHandler<DeleteMLTransformResult>(
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
     * Deletes a specified partition.
     * </p>
     * 
     * @param deletePartitionRequest
     * @return deletePartitionResult The response from the DeletePartition
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeletePartitionResult deletePartition(DeletePartitionRequest deletePartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deletePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePartitionRequest> request = null;
        Response<DeletePartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePartitionRequestMarshaller().marshall(deletePartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeletePartitionResult, JsonUnmarshallerContext> unmarshaller = new DeletePartitionResultJsonUnmarshaller();
            JsonResponseHandler<DeletePartitionResult> responseHandler = new JsonResponseHandler<DeletePartitionResult>(
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
     * Deletes a specified policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return deleteResourcePolicyResult The response from the
     *         DeleteResourcePolicy service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ConditionCheckFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteResourcePolicyResult deleteResourcePolicy(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestMarshaller()
                        .marshall(deleteResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteResourcePolicyResult> responseHandler = new JsonResponseHandler<DeleteResourcePolicyResult>(
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
     * Deletes a specified security configuration.
     * </p>
     * 
     * @param deleteSecurityConfigurationRequest
     * @return deleteSecurityConfigurationResult The response from the
     *         DeleteSecurityConfiguration service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteSecurityConfigurationResult deleteSecurityConfiguration(
            DeleteSecurityConfigurationRequest deleteSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityConfigurationRequest> request = null;
        Response<DeleteSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityConfigurationRequestMarshaller()
                        .marshall(deleteSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DeleteSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteSecurityConfigurationResult> responseHandler = new JsonResponseHandler<DeleteSecurityConfigurationResult>(
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
     * Removes a table definition from the Data Catalog.
     * </p>
     * <note>
     * <p>
     * After completing this operation, you no longer have access to the table
     * versions and partitions that belong to the deleted table. AWS Glue
     * deletes these "orphaned" resources asynchronously in a timely manner, at
     * the discretion of the service.
     * </p>
     * <p>
     * To ensure the immediate deletion of all related resources, before calling
     * <code>DeleteTable</code>, use <code>DeleteTableVersion</code> or
     * <code>BatchDeleteTableVersion</code>, and <code>DeletePartition</code> or
     * <code>BatchDeletePartition</code>, to delete any resources that belong to
     * the table.
     * </p>
     * </note>
     * 
     * @param deleteTableRequest
     * @return deleteTableResult The response from the DeleteTable service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestMarshaller().marshall(deleteTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTableResult, JsonUnmarshallerContext> unmarshaller = new DeleteTableResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTableResult> responseHandler = new JsonResponseHandler<DeleteTableResult>(
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
     * Deletes a specified version of a table.
     * </p>
     * 
     * @param deleteTableVersionRequest
     * @return deleteTableVersionResult The response from the DeleteTableVersion
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteTableVersionResult deleteTableVersion(
            DeleteTableVersionRequest deleteTableVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTableVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableVersionRequest> request = null;
        Response<DeleteTableVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableVersionRequestMarshaller()
                        .marshall(deleteTableVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTableVersionResult, JsonUnmarshallerContext> unmarshaller = new DeleteTableVersionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTableVersionResult> responseHandler = new JsonResponseHandler<DeleteTableVersionResult>(
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
     * Deletes a specified trigger. If the trigger is not found, no exception is
     * thrown.
     * </p>
     * 
     * @param deleteTriggerRequest
     * @return deleteTriggerResult The response from the DeleteTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteTriggerResult deleteTrigger(DeleteTriggerRequest deleteTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTriggerRequest> request = null;
        Response<DeleteTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTriggerRequestMarshaller().marshall(deleteTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTriggerResult, JsonUnmarshallerContext> unmarshaller = new DeleteTriggerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTriggerResult> responseHandler = new JsonResponseHandler<DeleteTriggerResult>(
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
     * Deletes an existing function definition from the Data Catalog.
     * </p>
     * 
     * @param deleteUserDefinedFunctionRequest
     * @return deleteUserDefinedFunctionResult The response from the
     *         DeleteUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserDefinedFunctionResult deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest deleteUserDefinedFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserDefinedFunctionRequest> request = null;
        Response<DeleteUserDefinedFunctionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserDefinedFunctionRequestMarshaller()
                        .marshall(deleteUserDefinedFunctionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserDefinedFunctionResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserDefinedFunctionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserDefinedFunctionResult> responseHandler = new JsonResponseHandler<DeleteUserDefinedFunctionResult>(
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
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return deleteWorkflowResult The response from the DeleteWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkflowRequest> request = null;
        Response<DeleteWorkflowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkflowRequestMarshaller().marshall(deleteWorkflowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWorkflowResult, JsonUnmarshallerContext> unmarshaller = new DeleteWorkflowResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWorkflowResult> responseHandler = new JsonResponseHandler<DeleteWorkflowResult>(
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
     * Retrieves the status of a migration operation.
     * </p>
     * 
     * @param getCatalogImportStatusRequest
     * @return getCatalogImportStatusResult The response from the
     *         GetCatalogImportStatus service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCatalogImportStatusResult getCatalogImportStatus(
            GetCatalogImportStatusRequest getCatalogImportStatusRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCatalogImportStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCatalogImportStatusRequest> request = null;
        Response<GetCatalogImportStatusResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCatalogImportStatusRequestMarshaller()
                        .marshall(getCatalogImportStatusRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCatalogImportStatusResult, JsonUnmarshallerContext> unmarshaller = new GetCatalogImportStatusResultJsonUnmarshaller();
            JsonResponseHandler<GetCatalogImportStatusResult> responseHandler = new JsonResponseHandler<GetCatalogImportStatusResult>(
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
     * Retrieve a classifier by name.
     * </p>
     * 
     * @param getClassifierRequest
     * @return getClassifierResult The response from the GetClassifier service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClassifierResult getClassifier(GetClassifierRequest getClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassifierRequest> request = null;
        Response<GetClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassifierRequestMarshaller().marshall(getClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClassifierResult, JsonUnmarshallerContext> unmarshaller = new GetClassifierResultJsonUnmarshaller();
            JsonResponseHandler<GetClassifierResult> responseHandler = new JsonResponseHandler<GetClassifierResult>(
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
     * Lists all classifier objects in the Data Catalog.
     * </p>
     * 
     * @param getClassifiersRequest
     * @return getClassifiersResult The response from the GetClassifiers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClassifiersResult getClassifiers(GetClassifiersRequest getClassifiersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClassifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClassifiersRequest> request = null;
        Response<GetClassifiersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClassifiersRequestMarshaller().marshall(getClassifiersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClassifiersResult, JsonUnmarshallerContext> unmarshaller = new GetClassifiersResultJsonUnmarshaller();
            JsonResponseHandler<GetClassifiersResult> responseHandler = new JsonResponseHandler<GetClassifiersResult>(
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
     * Retrieves a connection definition from the Data Catalog.
     * </p>
     * 
     * @param getConnectionRequest
     * @return getConnectionResult The response from the GetConnection service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionRequest> request = null;
        Response<GetConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionRequestMarshaller().marshall(getConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetConnectionResult, JsonUnmarshallerContext> unmarshaller = new GetConnectionResultJsonUnmarshaller();
            JsonResponseHandler<GetConnectionResult> responseHandler = new JsonResponseHandler<GetConnectionResult>(
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
     * Retrieves a list of connection definitions from the Data Catalog.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return getConnectionsResult The response from the GetConnections service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetConnectionsResult getConnections(GetConnectionsRequest getConnectionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionsRequest> request = null;
        Response<GetConnectionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionsRequestMarshaller().marshall(getConnectionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetConnectionsResult, JsonUnmarshallerContext> unmarshaller = new GetConnectionsResultJsonUnmarshaller();
            JsonResponseHandler<GetConnectionsResult> responseHandler = new JsonResponseHandler<GetConnectionsResult>(
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
     * Retrieves metadata for a specified crawler.
     * </p>
     * 
     * @param getCrawlerRequest
     * @return getCrawlerResult The response from the GetCrawler service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCrawlerResult getCrawler(GetCrawlerRequest getCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlerRequest> request = null;
        Response<GetCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlerRequestMarshaller().marshall(getCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCrawlerResult, JsonUnmarshallerContext> unmarshaller = new GetCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<GetCrawlerResult> responseHandler = new JsonResponseHandler<GetCrawlerResult>(
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
     * Retrieves metrics about specified crawlers.
     * </p>
     * 
     * @param getCrawlerMetricsRequest
     * @return getCrawlerMetricsResult The response from the GetCrawlerMetrics
     *         service method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCrawlerMetricsResult getCrawlerMetrics(
            GetCrawlerMetricsRequest getCrawlerMetricsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCrawlerMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlerMetricsRequest> request = null;
        Response<GetCrawlerMetricsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlerMetricsRequestMarshaller()
                        .marshall(getCrawlerMetricsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCrawlerMetricsResult, JsonUnmarshallerContext> unmarshaller = new GetCrawlerMetricsResultJsonUnmarshaller();
            JsonResponseHandler<GetCrawlerMetricsResult> responseHandler = new JsonResponseHandler<GetCrawlerMetricsResult>(
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
     * Retrieves metadata for all crawlers defined in the customer account.
     * </p>
     * 
     * @param getCrawlersRequest
     * @return getCrawlersResult The response from the GetCrawlers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCrawlersResult getCrawlers(GetCrawlersRequest getCrawlersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCrawlersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCrawlersRequest> request = null;
        Response<GetCrawlersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCrawlersRequestMarshaller().marshall(getCrawlersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCrawlersResult, JsonUnmarshallerContext> unmarshaller = new GetCrawlersResultJsonUnmarshaller();
            JsonResponseHandler<GetCrawlersResult> responseHandler = new JsonResponseHandler<GetCrawlersResult>(
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
     * Retrieves the security configuration for a specified catalog.
     * </p>
     * 
     * @param getDataCatalogEncryptionSettingsRequest
     * @return getDataCatalogEncryptionSettingsResult The response from the
     *         GetDataCatalogEncryptionSettings service method, as returned by
     *         AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDataCatalogEncryptionSettingsResult getDataCatalogEncryptionSettings(
            GetDataCatalogEncryptionSettingsRequest getDataCatalogEncryptionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDataCatalogEncryptionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataCatalogEncryptionSettingsRequest> request = null;
        Response<GetDataCatalogEncryptionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataCatalogEncryptionSettingsRequestMarshaller()
                        .marshall(getDataCatalogEncryptionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDataCatalogEncryptionSettingsResult, JsonUnmarshallerContext> unmarshaller = new GetDataCatalogEncryptionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<GetDataCatalogEncryptionSettingsResult> responseHandler = new JsonResponseHandler<GetDataCatalogEncryptionSettingsResult>(
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
     * Retrieves the definition of a specified database.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return getDatabaseResult The response from the GetDatabase service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabaseRequest> request = null;
        Response<GetDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabaseRequestMarshaller().marshall(getDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDatabaseResult, JsonUnmarshallerContext> unmarshaller = new GetDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<GetDatabaseResult> responseHandler = new JsonResponseHandler<GetDatabaseResult>(
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
     * Retrieves all databases defined in a given Data Catalog.
     * </p>
     * 
     * @param getDatabasesRequest
     * @return getDatabasesResult The response from the GetDatabases service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDatabasesResult getDatabases(GetDatabasesRequest getDatabasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDatabasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatabasesRequest> request = null;
        Response<GetDatabasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatabasesRequestMarshaller().marshall(getDatabasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDatabasesResult, JsonUnmarshallerContext> unmarshaller = new GetDatabasesResultJsonUnmarshaller();
            JsonResponseHandler<GetDatabasesResult> responseHandler = new JsonResponseHandler<GetDatabasesResult>(
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
     * Transforms a Python script into a directed acyclic graph (DAG).
     * </p>
     * 
     * @param getDataflowGraphRequest
     * @return getDataflowGraphResult The response from the GetDataflowGraph
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDataflowGraphResult getDataflowGraph(GetDataflowGraphRequest getDataflowGraphRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDataflowGraphRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataflowGraphRequest> request = null;
        Response<GetDataflowGraphResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataflowGraphRequestMarshaller().marshall(getDataflowGraphRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDataflowGraphResult, JsonUnmarshallerContext> unmarshaller = new GetDataflowGraphResultJsonUnmarshaller();
            JsonResponseHandler<GetDataflowGraphResult> responseHandler = new JsonResponseHandler<GetDataflowGraphResult>(
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
     * Retrieves information about a specified development endpoint.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC),
     * AWS Glue returns only a private IP address, and the public IP address
     * field is not populated. When you create a non-VPC development endpoint,
     * AWS Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointRequest
     * @return getDevEndpointResult The response from the GetDevEndpoint service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDevEndpointResult getDevEndpoint(GetDevEndpointRequest getDevEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevEndpointRequest> request = null;
        Response<GetDevEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevEndpointRequestMarshaller().marshall(getDevEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDevEndpointResult, JsonUnmarshallerContext> unmarshaller = new GetDevEndpointResultJsonUnmarshaller();
            JsonResponseHandler<GetDevEndpointResult> responseHandler = new JsonResponseHandler<GetDevEndpointResult>(
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
     * Retrieves all the development endpoints in this AWS account.
     * </p>
     * <note>
     * <p>
     * When you create a development endpoint in a virtual private cloud (VPC),
     * AWS Glue returns only a private IP address and the public IP address
     * field is not populated. When you create a non-VPC development endpoint,
     * AWS Glue returns only a public IP address.
     * </p>
     * </note>
     * 
     * @param getDevEndpointsRequest
     * @return getDevEndpointsResult The response from the GetDevEndpoints
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDevEndpointsResult getDevEndpoints(GetDevEndpointsRequest getDevEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDevEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevEndpointsRequest> request = null;
        Response<GetDevEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevEndpointsRequestMarshaller().marshall(getDevEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDevEndpointsResult, JsonUnmarshallerContext> unmarshaller = new GetDevEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<GetDevEndpointsResult> responseHandler = new JsonResponseHandler<GetDevEndpointsResult>(
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
     * Retrieves an existing job definition.
     * </p>
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetJobResult getJob(GetJobRequest getJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestMarshaller().marshall(getJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobResult, JsonUnmarshallerContext> unmarshaller = new GetJobResultJsonUnmarshaller();
            JsonResponseHandler<GetJobResult> responseHandler = new JsonResponseHandler<GetJobResult>(
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
     * Returns information on a job bookmark entry.
     * </p>
     * 
     * @param getJobBookmarkRequest
     * @return getJobBookmarkResult The response from the GetJobBookmark service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetJobBookmarkResult getJobBookmark(GetJobBookmarkRequest getJobBookmarkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobBookmarkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobBookmarkRequest> request = null;
        Response<GetJobBookmarkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobBookmarkRequestMarshaller().marshall(getJobBookmarkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobBookmarkResult, JsonUnmarshallerContext> unmarshaller = new GetJobBookmarkResultJsonUnmarshaller();
            JsonResponseHandler<GetJobBookmarkResult> responseHandler = new JsonResponseHandler<GetJobBookmarkResult>(
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
     * Retrieves the metadata for a given job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return getJobRunResult The response from the GetJobRun service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetJobRunResult getJobRun(GetJobRunRequest getJobRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRunRequest> request = null;
        Response<GetJobRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRunRequestMarshaller().marshall(getJobRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobRunResult, JsonUnmarshallerContext> unmarshaller = new GetJobRunResultJsonUnmarshaller();
            JsonResponseHandler<GetJobRunResult> responseHandler = new JsonResponseHandler<GetJobRunResult>(
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
     * Retrieves metadata for all runs of a given job definition.
     * </p>
     * 
     * @param getJobRunsRequest
     * @return getJobRunsResult The response from the GetJobRuns service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetJobRunsResult getJobRuns(GetJobRunsRequest getJobRunsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRunsRequest> request = null;
        Response<GetJobRunsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRunsRequestMarshaller().marshall(getJobRunsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobRunsResult, JsonUnmarshallerContext> unmarshaller = new GetJobRunsResultJsonUnmarshaller();
            JsonResponseHandler<GetJobRunsResult> responseHandler = new JsonResponseHandler<GetJobRunsResult>(
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
     * Retrieves all current job definitions.
     * </p>
     * 
     * @param getJobsRequest
     * @return getJobsResult The response from the GetJobs service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetJobsResult getJobs(GetJobsRequest getJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobsRequest> request = null;
        Response<GetJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobsRequestMarshaller().marshall(getJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetJobsResult, JsonUnmarshallerContext> unmarshaller = new GetJobsResultJsonUnmarshaller();
            JsonResponseHandler<GetJobsResult> responseHandler = new JsonResponseHandler<GetJobsResult>(
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
     * Gets details for a specific task run on a machine learning transform.
     * Machine learning task runs are asynchronous tasks that AWS Glue runs on
     * your behalf as part of various machine learning workflows. You can check
     * the stats of any task run by calling <code>GetMLTaskRun</code> with the
     * <code>TaskRunID</code> and its parent transform's
     * <code>TransformID</code>.
     * </p>
     * 
     * @param getMLTaskRunRequest
     * @return getMLTaskRunResult The response from the GetMLTaskRun service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMLTaskRunResult getMLTaskRun(GetMLTaskRunRequest getMLTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMLTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLTaskRunRequest> request = null;
        Response<GetMLTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLTaskRunRequestMarshaller().marshall(getMLTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMLTaskRunResult, JsonUnmarshallerContext> unmarshaller = new GetMLTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<GetMLTaskRunResult> responseHandler = new JsonResponseHandler<GetMLTaskRunResult>(
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
     * Gets a list of runs for a machine learning transform. Machine learning
     * task runs are asynchronous tasks that AWS Glue runs on your behalf as
     * part of various machine learning workflows. You can get a sortable,
     * filterable list of machine learning task runs by calling
     * <code>GetMLTaskRuns</code> with their parent transform's
     * <code>TransformID</code> and other optional parameters as documented in
     * this section.
     * </p>
     * <p>
     * This operation returns a list of historic runs and must be paginated.
     * </p>
     * 
     * @param getMLTaskRunsRequest
     * @return getMLTaskRunsResult The response from the GetMLTaskRuns service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMLTaskRunsResult getMLTaskRuns(GetMLTaskRunsRequest getMLTaskRunsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMLTaskRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLTaskRunsRequest> request = null;
        Response<GetMLTaskRunsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLTaskRunsRequestMarshaller().marshall(getMLTaskRunsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMLTaskRunsResult, JsonUnmarshallerContext> unmarshaller = new GetMLTaskRunsResultJsonUnmarshaller();
            JsonResponseHandler<GetMLTaskRunsResult> responseHandler = new JsonResponseHandler<GetMLTaskRunsResult>(
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
     * Gets an AWS Glue machine learning transform artifact and all its
     * corresponding metadata. Machine learning transforms are a special type of
     * transform that use machine learning to learn the details of the
     * transformation to be performed by learning from examples provided by
     * humans. These transformations are then saved by AWS Glue. You can
     * retrieve their metadata by calling <code>GetMLTransform</code>.
     * </p>
     * 
     * @param getMLTransformRequest
     * @return getMLTransformResult The response from the GetMLTransform service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMLTransformResult getMLTransform(GetMLTransformRequest getMLTransformRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMLTransformRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLTransformRequest> request = null;
        Response<GetMLTransformResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLTransformRequestMarshaller().marshall(getMLTransformRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMLTransformResult, JsonUnmarshallerContext> unmarshaller = new GetMLTransformResultJsonUnmarshaller();
            JsonResponseHandler<GetMLTransformResult> responseHandler = new JsonResponseHandler<GetMLTransformResult>(
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
     * Gets a sortable, filterable list of existing AWS Glue machine learning
     * transforms. Machine learning transforms are a special type of transform
     * that use machine learning to learn the details of the transformation to
     * be performed by learning from examples provided by humans. These
     * transformations are then saved by AWS Glue, and you can retrieve their
     * metadata by calling <code>GetMLTransforms</code>.
     * </p>
     * 
     * @param getMLTransformsRequest
     * @return getMLTransformsResult The response from the GetMLTransforms
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMLTransformsResult getMLTransforms(GetMLTransformsRequest getMLTransformsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMLTransformsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLTransformsRequest> request = null;
        Response<GetMLTransformsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLTransformsRequestMarshaller().marshall(getMLTransformsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMLTransformsResult, JsonUnmarshallerContext> unmarshaller = new GetMLTransformsResultJsonUnmarshaller();
            JsonResponseHandler<GetMLTransformsResult> responseHandler = new JsonResponseHandler<GetMLTransformsResult>(
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
     * Creates mappings.
     * </p>
     * 
     * @param getMappingRequest
     * @return getMappingResult The response from the GetMapping service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMappingResult getMapping(GetMappingRequest getMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMappingRequest> request = null;
        Response<GetMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMappingRequestMarshaller().marshall(getMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMappingResult, JsonUnmarshallerContext> unmarshaller = new GetMappingResultJsonUnmarshaller();
            JsonResponseHandler<GetMappingResult> responseHandler = new JsonResponseHandler<GetMappingResult>(
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
     * Retrieves information about a specified partition.
     * </p>
     * 
     * @param getPartitionRequest
     * @return getPartitionResult The response from the GetPartition service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPartitionResult getPartition(GetPartitionRequest getPartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartitionRequest> request = null;
        Response<GetPartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartitionRequestMarshaller().marshall(getPartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPartitionResult, JsonUnmarshallerContext> unmarshaller = new GetPartitionResultJsonUnmarshaller();
            JsonResponseHandler<GetPartitionResult> responseHandler = new JsonResponseHandler<GetPartitionResult>(
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
     * Retrieves information about the partitions in a table.
     * </p>
     * 
     * @param getPartitionsRequest
     * @return getPartitionsResult The response from the GetPartitions service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPartitionsResult getPartitions(GetPartitionsRequest getPartitionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPartitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartitionsRequest> request = null;
        Response<GetPartitionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartitionsRequestMarshaller().marshall(getPartitionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPartitionsResult, JsonUnmarshallerContext> unmarshaller = new GetPartitionsResultJsonUnmarshaller();
            JsonResponseHandler<GetPartitionsResult> responseHandler = new JsonResponseHandler<GetPartitionsResult>(
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
     * Gets code to perform a specified mapping.
     * </p>
     * 
     * @param getPlanRequest
     * @return getPlanResult The response from the GetPlan service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetPlanResult getPlan(GetPlanRequest getPlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPlanRequest> request = null;
        Response<GetPlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPlanRequestMarshaller().marshall(getPlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetPlanResult, JsonUnmarshallerContext> unmarshaller = new GetPlanResultJsonUnmarshaller();
            JsonResponseHandler<GetPlanResult> responseHandler = new JsonResponseHandler<GetPlanResult>(
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
     * Retrieves a specified resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetResourcePolicyResult getResourcePolicy(
            GetResourcePolicyRequest getResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestMarshaller()
                        .marshall(getResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcePolicyResult> responseHandler = new JsonResponseHandler<GetResourcePolicyResult>(
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
     * Retrieves a specified security configuration.
     * </p>
     * 
     * @param getSecurityConfigurationRequest
     * @return getSecurityConfigurationResult The response from the
     *         GetSecurityConfiguration service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSecurityConfigurationResult getSecurityConfiguration(
            GetSecurityConfigurationRequest getSecurityConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSecurityConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecurityConfigurationRequest> request = null;
        Response<GetSecurityConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecurityConfigurationRequestMarshaller()
                        .marshall(getSecurityConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSecurityConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetSecurityConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetSecurityConfigurationResult> responseHandler = new JsonResponseHandler<GetSecurityConfigurationResult>(
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
     * Retrieves a list of all security configurations.
     * </p>
     * 
     * @param getSecurityConfigurationsRequest
     * @return getSecurityConfigurationsResult The response from the
     *         GetSecurityConfigurations service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSecurityConfigurationsResult getSecurityConfigurations(
            GetSecurityConfigurationsRequest getSecurityConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSecurityConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecurityConfigurationsRequest> request = null;
        Response<GetSecurityConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecurityConfigurationsRequestMarshaller()
                        .marshall(getSecurityConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSecurityConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new GetSecurityConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<GetSecurityConfigurationsResult> responseHandler = new JsonResponseHandler<GetSecurityConfigurationsResult>(
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
     * Retrieves the <code>Table</code> definition in a Data Catalog for a
     * specified table.
     * </p>
     * 
     * @param getTableRequest
     * @return getTableResult The response from the GetTable service method, as
     *         returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTableResult getTable(GetTableRequest getTableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableRequest> request = null;
        Response<GetTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableRequestMarshaller().marshall(getTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTableResult, JsonUnmarshallerContext> unmarshaller = new GetTableResultJsonUnmarshaller();
            JsonResponseHandler<GetTableResult> responseHandler = new JsonResponseHandler<GetTableResult>(
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
     * Retrieves a specified version of a table.
     * </p>
     * 
     * @param getTableVersionRequest
     * @return getTableVersionResult The response from the GetTableVersion
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTableVersionResult getTableVersion(GetTableVersionRequest getTableVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTableVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableVersionRequest> request = null;
        Response<GetTableVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableVersionRequestMarshaller().marshall(getTableVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTableVersionResult, JsonUnmarshallerContext> unmarshaller = new GetTableVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetTableVersionResult> responseHandler = new JsonResponseHandler<GetTableVersionResult>(
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
     * Retrieves a list of strings that identify available versions of a
     * specified table.
     * </p>
     * 
     * @param getTableVersionsRequest
     * @return getTableVersionsResult The response from the GetTableVersions
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTableVersionsResult getTableVersions(GetTableVersionsRequest getTableVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTableVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTableVersionsRequest> request = null;
        Response<GetTableVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTableVersionsRequestMarshaller().marshall(getTableVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTableVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetTableVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetTableVersionsResult> responseHandler = new JsonResponseHandler<GetTableVersionsResult>(
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
     * Retrieves the definitions of some or all of the tables in a given
     * <code>Database</code>.
     * </p>
     * 
     * @param getTablesRequest
     * @return getTablesResult The response from the GetTables service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTablesResult getTables(GetTablesRequest getTablesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTablesRequest> request = null;
        Response<GetTablesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTablesRequestMarshaller().marshall(getTablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTablesResult, JsonUnmarshallerContext> unmarshaller = new GetTablesResultJsonUnmarshaller();
            JsonResponseHandler<GetTablesResult> responseHandler = new JsonResponseHandler<GetTablesResult>(
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
     * Retrieves a list of tags associated with a resource.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTagsResult getTags(GetTagsRequest getTagsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagsRequest> request = null;
        Response<GetTagsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagsRequestMarshaller().marshall(getTagsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTagsResult, JsonUnmarshallerContext> unmarshaller = new GetTagsResultJsonUnmarshaller();
            JsonResponseHandler<GetTagsResult> responseHandler = new JsonResponseHandler<GetTagsResult>(
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
     * Retrieves the definition of a trigger.
     * </p>
     * 
     * @param getTriggerRequest
     * @return getTriggerResult The response from the GetTrigger service method,
     *         as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTriggerResult getTrigger(GetTriggerRequest getTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTriggerRequest> request = null;
        Response<GetTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTriggerRequestMarshaller().marshall(getTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTriggerResult, JsonUnmarshallerContext> unmarshaller = new GetTriggerResultJsonUnmarshaller();
            JsonResponseHandler<GetTriggerResult> responseHandler = new JsonResponseHandler<GetTriggerResult>(
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
     * Gets all the triggers associated with a job.
     * </p>
     * 
     * @param getTriggersRequest
     * @return getTriggersResult The response from the GetTriggers service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetTriggersResult getTriggers(GetTriggersRequest getTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTriggersRequest> request = null;
        Response<GetTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTriggersRequestMarshaller().marshall(getTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetTriggersResult, JsonUnmarshallerContext> unmarshaller = new GetTriggersResultJsonUnmarshaller();
            JsonResponseHandler<GetTriggersResult> responseHandler = new JsonResponseHandler<GetTriggersResult>(
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
     * Retrieves a specified function definition from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionRequest
     * @return getUserDefinedFunctionResult The response from the
     *         GetUserDefinedFunction service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUserDefinedFunctionResult getUserDefinedFunction(
            GetUserDefinedFunctionRequest getUserDefinedFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserDefinedFunctionRequest> request = null;
        Response<GetUserDefinedFunctionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserDefinedFunctionRequestMarshaller()
                        .marshall(getUserDefinedFunctionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserDefinedFunctionResult, JsonUnmarshallerContext> unmarshaller = new GetUserDefinedFunctionResultJsonUnmarshaller();
            JsonResponseHandler<GetUserDefinedFunctionResult> responseHandler = new JsonResponseHandler<GetUserDefinedFunctionResult>(
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
     * Retrieves multiple function definitions from the Data Catalog.
     * </p>
     * 
     * @param getUserDefinedFunctionsRequest
     * @return getUserDefinedFunctionsResult The response from the
     *         GetUserDefinedFunctions service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUserDefinedFunctionsResult getUserDefinedFunctions(
            GetUserDefinedFunctionsRequest getUserDefinedFunctionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUserDefinedFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserDefinedFunctionsRequest> request = null;
        Response<GetUserDefinedFunctionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserDefinedFunctionsRequestMarshaller()
                        .marshall(getUserDefinedFunctionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUserDefinedFunctionsResult, JsonUnmarshallerContext> unmarshaller = new GetUserDefinedFunctionsResultJsonUnmarshaller();
            JsonResponseHandler<GetUserDefinedFunctionsResult> responseHandler = new JsonResponseHandler<GetUserDefinedFunctionsResult>(
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
     * Retrieves resource metadata for a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return getWorkflowResult The response from the GetWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowRequest> request = null;
        Response<GetWorkflowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowRequestMarshaller().marshall(getWorkflowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWorkflowResult, JsonUnmarshallerContext> unmarshaller = new GetWorkflowResultJsonUnmarshaller();
            JsonResponseHandler<GetWorkflowResult> responseHandler = new JsonResponseHandler<GetWorkflowResult>(
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
     * Retrieves the metadata for a given workflow run.
     * </p>
     * 
     * @param getWorkflowRunRequest
     * @return getWorkflowRunResult The response from the GetWorkflowRun service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWorkflowRunResult getWorkflowRun(GetWorkflowRunRequest getWorkflowRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWorkflowRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowRunRequest> request = null;
        Response<GetWorkflowRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowRunRequestMarshaller().marshall(getWorkflowRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWorkflowRunResult, JsonUnmarshallerContext> unmarshaller = new GetWorkflowRunResultJsonUnmarshaller();
            JsonResponseHandler<GetWorkflowRunResult> responseHandler = new JsonResponseHandler<GetWorkflowRunResult>(
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
     * Retrieves the workflow run properties which were set during the run.
     * </p>
     * 
     * @param getWorkflowRunPropertiesRequest
     * @return getWorkflowRunPropertiesResult The response from the
     *         GetWorkflowRunProperties service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWorkflowRunPropertiesResult getWorkflowRunProperties(
            GetWorkflowRunPropertiesRequest getWorkflowRunPropertiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWorkflowRunPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowRunPropertiesRequest> request = null;
        Response<GetWorkflowRunPropertiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowRunPropertiesRequestMarshaller()
                        .marshall(getWorkflowRunPropertiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWorkflowRunPropertiesResult, JsonUnmarshallerContext> unmarshaller = new GetWorkflowRunPropertiesResultJsonUnmarshaller();
            JsonResponseHandler<GetWorkflowRunPropertiesResult> responseHandler = new JsonResponseHandler<GetWorkflowRunPropertiesResult>(
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
     * Retrieves metadata for all runs of a given workflow.
     * </p>
     * 
     * @param getWorkflowRunsRequest
     * @return getWorkflowRunsResult The response from the GetWorkflowRuns
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWorkflowRunsResult getWorkflowRuns(GetWorkflowRunsRequest getWorkflowRunsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWorkflowRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowRunsRequest> request = null;
        Response<GetWorkflowRunsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowRunsRequestMarshaller().marshall(getWorkflowRunsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWorkflowRunsResult, JsonUnmarshallerContext> unmarshaller = new GetWorkflowRunsResultJsonUnmarshaller();
            JsonResponseHandler<GetWorkflowRunsResult> responseHandler = new JsonResponseHandler<GetWorkflowRunsResult>(
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
     * Imports an existing Amazon Athena Data Catalog to AWS Glue
     * </p>
     * 
     * @param importCatalogToGlueRequest
     * @return importCatalogToGlueResult The response from the
     *         ImportCatalogToGlue service method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportCatalogToGlueResult importCatalogToGlue(
            ImportCatalogToGlueRequest importCatalogToGlueRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importCatalogToGlueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCatalogToGlueRequest> request = null;
        Response<ImportCatalogToGlueResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCatalogToGlueRequestMarshaller()
                        .marshall(importCatalogToGlueRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportCatalogToGlueResult, JsonUnmarshallerContext> unmarshaller = new ImportCatalogToGlueResultJsonUnmarshaller();
            JsonResponseHandler<ImportCatalogToGlueResult> responseHandler = new JsonResponseHandler<ImportCatalogToGlueResult>(
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
     * Retrieves the names of all crawler resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listCrawlersRequest
     * @return listCrawlersResult The response from the ListCrawlers service
     *         method, as returned by AWS Glue.
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListCrawlersResult listCrawlers(ListCrawlersRequest listCrawlersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCrawlersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCrawlersRequest> request = null;
        Response<ListCrawlersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCrawlersRequestMarshaller().marshall(listCrawlersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCrawlersResult, JsonUnmarshallerContext> unmarshaller = new ListCrawlersResultJsonUnmarshaller();
            JsonResponseHandler<ListCrawlersResult> responseHandler = new JsonResponseHandler<ListCrawlersResult>(
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
     * Retrieves the names of all <code>DevEndpoint</code> resources in this AWS
     * account, or the resources with the specified tag. This operation allows
     * you to see which resources are available in your account, and their
     * names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listDevEndpointsRequest
     * @return listDevEndpointsResult The response from the ListDevEndpoints
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDevEndpointsResult listDevEndpoints(ListDevEndpointsRequest listDevEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDevEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevEndpointsRequest> request = null;
        Response<ListDevEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevEndpointsRequestMarshaller().marshall(listDevEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDevEndpointsResult, JsonUnmarshallerContext> unmarshaller = new ListDevEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<ListDevEndpointsResult> responseHandler = new JsonResponseHandler<ListDevEndpointsResult>(
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
     * Retrieves the names of all job resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestMarshaller().marshall(listJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListJobsResult, JsonUnmarshallerContext> unmarshaller = new ListJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListJobsResult> responseHandler = new JsonResponseHandler<ListJobsResult>(
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
     * Retrieves a sortable, filterable list of existing AWS Glue machine
     * learning transforms in this AWS account, or the resources with the
     * specified tag. This operation takes the optional <code>Tags</code> field,
     * which you can use as a filter of the responses so that tagged resources
     * can be retrieved as a group. If you choose to use tag filtering, only
     * resources with the tags are retrieved.
     * </p>
     * 
     * @param listMLTransformsRequest
     * @return listMLTransformsResult The response from the ListMLTransforms
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListMLTransformsResult listMLTransforms(ListMLTransformsRequest listMLTransformsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listMLTransformsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMLTransformsRequest> request = null;
        Response<ListMLTransformsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMLTransformsRequestMarshaller().marshall(listMLTransformsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListMLTransformsResult, JsonUnmarshallerContext> unmarshaller = new ListMLTransformsResultJsonUnmarshaller();
            JsonResponseHandler<ListMLTransformsResult> responseHandler = new JsonResponseHandler<ListMLTransformsResult>(
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
     * Retrieves the names of all trigger resources in this AWS account, or the
     * resources with the specified tag. This operation allows you to see which
     * resources are available in your account, and their names.
     * </p>
     * <p>
     * This operation takes the optional <code>Tags</code> field, which you can
     * use as a filter on the response so that tagged resources can be retrieved
     * as a group. If you choose to use tags filtering, only resources with the
     * tag are retrieved.
     * </p>
     * 
     * @param listTriggersRequest
     * @return listTriggersResult The response from the ListTriggers service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTriggersResult listTriggers(ListTriggersRequest listTriggersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTriggersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTriggersRequest> request = null;
        Response<ListTriggersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTriggersRequestMarshaller().marshall(listTriggersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTriggersResult, JsonUnmarshallerContext> unmarshaller = new ListTriggersResultJsonUnmarshaller();
            JsonResponseHandler<ListTriggersResult> responseHandler = new JsonResponseHandler<ListTriggersResult>(
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
     * Lists names of workflows created in the account.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return listWorkflowsResult The response from the ListWorkflows service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowsRequest> request = null;
        Response<ListWorkflowsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowsRequestMarshaller().marshall(listWorkflowsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWorkflowsResult, JsonUnmarshallerContext> unmarshaller = new ListWorkflowsResultJsonUnmarshaller();
            JsonResponseHandler<ListWorkflowsResult> responseHandler = new JsonResponseHandler<ListWorkflowsResult>(
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
     * Sets the security configuration for a specified catalog. After the
     * configuration has been set, the specified encryption is applied to every
     * catalog write thereafter.
     * </p>
     * 
     * @param putDataCatalogEncryptionSettingsRequest
     * @return putDataCatalogEncryptionSettingsResult The response from the
     *         PutDataCatalogEncryptionSettings service method, as returned by
     *         AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutDataCatalogEncryptionSettingsResult putDataCatalogEncryptionSettings(
            PutDataCatalogEncryptionSettingsRequest putDataCatalogEncryptionSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putDataCatalogEncryptionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDataCatalogEncryptionSettingsRequest> request = null;
        Response<PutDataCatalogEncryptionSettingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDataCatalogEncryptionSettingsRequestMarshaller()
                        .marshall(putDataCatalogEncryptionSettingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutDataCatalogEncryptionSettingsResult, JsonUnmarshallerContext> unmarshaller = new PutDataCatalogEncryptionSettingsResultJsonUnmarshaller();
            JsonResponseHandler<PutDataCatalogEncryptionSettingsResult> responseHandler = new JsonResponseHandler<PutDataCatalogEncryptionSettingsResult>(
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
     * Sets the Data Catalog resource policy for access control.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ConditionCheckFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutResourcePolicyResult putResourcePolicy(
            PutResourcePolicyRequest putResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestMarshaller()
                        .marshall(putResourcePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutResourcePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutResourcePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutResourcePolicyResult> responseHandler = new JsonResponseHandler<PutResourcePolicyResult>(
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
     * Puts the specified workflow run properties for the given workflow run. If
     * a property already exists for the specified run, then it overrides the
     * value otherwise adds the property to existing properties.
     * </p>
     * 
     * @param putWorkflowRunPropertiesRequest
     * @return putWorkflowRunPropertiesResult The response from the
     *         PutWorkflowRunProperties service method, as returned by AWS Glue.
     * @throws AlreadyExistsException
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutWorkflowRunPropertiesResult putWorkflowRunProperties(
            PutWorkflowRunPropertiesRequest putWorkflowRunPropertiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putWorkflowRunPropertiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutWorkflowRunPropertiesRequest> request = null;
        Response<PutWorkflowRunPropertiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutWorkflowRunPropertiesRequestMarshaller()
                        .marshall(putWorkflowRunPropertiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutWorkflowRunPropertiesResult, JsonUnmarshallerContext> unmarshaller = new PutWorkflowRunPropertiesResultJsonUnmarshaller();
            JsonResponseHandler<PutWorkflowRunPropertiesResult> responseHandler = new JsonResponseHandler<PutWorkflowRunPropertiesResult>(
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
     * Resets a bookmark entry.
     * </p>
     * 
     * @param resetJobBookmarkRequest
     * @return resetJobBookmarkResult The response from the ResetJobBookmark
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ResetJobBookmarkResult resetJobBookmark(ResetJobBookmarkRequest resetJobBookmarkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(resetJobBookmarkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetJobBookmarkRequest> request = null;
        Response<ResetJobBookmarkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetJobBookmarkRequestMarshaller().marshall(resetJobBookmarkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ResetJobBookmarkResult, JsonUnmarshallerContext> unmarshaller = new ResetJobBookmarkResultJsonUnmarshaller();
            JsonResponseHandler<ResetJobBookmarkResult> responseHandler = new JsonResponseHandler<ResetJobBookmarkResult>(
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
     * Searches a set of tables based on properties in the table metadata as
     * well as on the parent database. You can search against text or filter
     * conditions.
     * </p>
     * <p>
     * You can only get tables that you have access to based on the security
     * policies defined in Lake Formation. You need at least a read-only access
     * to the table for it to be returned. If you do not have access to all the
     * columns in the table, these columns will not be searched against when
     * returning the list of tables back to you. If you have access to the
     * columns but not the data in the columns, those columns and the associated
     * metadata for those columns will be included in the search.
     * </p>
     * 
     * @param searchTablesRequest
     * @return searchTablesResult The response from the SearchTables service
     *         method, as returned by AWS Glue.
     * @throws InternalServiceException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchTablesResult searchTables(SearchTablesRequest searchTablesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchTablesRequest> request = null;
        Response<SearchTablesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchTablesRequestMarshaller().marshall(searchTablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchTablesResult, JsonUnmarshallerContext> unmarshaller = new SearchTablesResultJsonUnmarshaller();
            JsonResponseHandler<SearchTablesResult> responseHandler = new JsonResponseHandler<SearchTablesResult>(
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
     * Starts a crawl using the specified crawler, regardless of what is
     * scheduled. If the crawler is already running, returns a <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-exceptions.html#aws-glue-api-exceptions-CrawlerRunningException"
     * >CrawlerRunningException</a>.
     * </p>
     * 
     * @param startCrawlerRequest
     * @return startCrawlerResult The response from the StartCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCrawlerResult startCrawler(StartCrawlerRequest startCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCrawlerRequest> request = null;
        Response<StartCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCrawlerRequestMarshaller().marshall(startCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCrawlerResult, JsonUnmarshallerContext> unmarshaller = new StartCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<StartCrawlerResult> responseHandler = new JsonResponseHandler<StartCrawlerResult>(
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
     * Changes the schedule state of the specified crawler to
     * <code>SCHEDULED</code>, unless the crawler is already running or the
     * schedule state is already <code>SCHEDULED</code>.
     * </p>
     * 
     * @param startCrawlerScheduleRequest
     * @return startCrawlerScheduleResult The response from the
     *         StartCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws SchedulerRunningException
     * @throws SchedulerTransitioningException
     * @throws NoScheduleException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartCrawlerScheduleResult startCrawlerSchedule(
            StartCrawlerScheduleRequest startCrawlerScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCrawlerScheduleRequest> request = null;
        Response<StartCrawlerScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCrawlerScheduleRequestMarshaller()
                        .marshall(startCrawlerScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartCrawlerScheduleResult, JsonUnmarshallerContext> unmarshaller = new StartCrawlerScheduleResultJsonUnmarshaller();
            JsonResponseHandler<StartCrawlerScheduleResult> responseHandler = new JsonResponseHandler<StartCrawlerScheduleResult>(
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
     * Begins an asynchronous task to export all labeled data for a particular
     * transform. This task is the only label-related API call that is not part
     * of the typical active learning workflow. You typically use
     * <code>StartExportLabelsTaskRun</code> when you want to work with all of
     * your existing labels at the same time, such as when you want to remove or
     * change labels that were previously submitted as truth. This API operation
     * accepts the <code>TransformId</code> whose labels you want to export and
     * an Amazon Simple Storage Service (Amazon S3) path to export the labels
     * to. The operation returns a <code>TaskRunId</code>. You can check on the
     * status of your task run by calling the <code>GetMLTaskRun</code> API.
     * </p>
     * 
     * @param startExportLabelsTaskRunRequest
     * @return startExportLabelsTaskRunResult The response from the
     *         StartExportLabelsTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartExportLabelsTaskRunResult startExportLabelsTaskRun(
            StartExportLabelsTaskRunRequest startExportLabelsTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startExportLabelsTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartExportLabelsTaskRunRequest> request = null;
        Response<StartExportLabelsTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartExportLabelsTaskRunRequestMarshaller()
                        .marshall(startExportLabelsTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartExportLabelsTaskRunResult, JsonUnmarshallerContext> unmarshaller = new StartExportLabelsTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<StartExportLabelsTaskRunResult> responseHandler = new JsonResponseHandler<StartExportLabelsTaskRunResult>(
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
     * Enables you to provide additional labels (examples of truth) to be used
     * to teach the machine learning transform and improve its quality. This API
     * operation is generally used as part of the active learning workflow that
     * starts with the <code>StartMLLabelingSetGenerationTaskRun</code> call and
     * that ultimately results in improving the quality of your machine learning
     * transform.
     * </p>
     * <p>
     * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS
     * Glue machine learning will have generated a series of questions for
     * humans to answer. (Answering these questions is often called 'labeling'
     * in the machine learning workflows). In the case of the
     * <code>FindMatches</code> transform, these questions are of the form,
     * “What is the correct way to group these rows together into groups
     * composed entirely of matching records?” After the labeling process is
     * finished, users upload their answers/labels with a call to
     * <code>StartImportLabelsTaskRun</code>. After
     * <code>StartImportLabelsTaskRun</code> finishes, all future runs of the
     * machine learning transform use the new and improved labels and perform a
     * higher-quality transformation.
     * </p>
     * <p>
     * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually
     * learns from and combines all labels that you upload unless you set
     * <code>Replace</code> to true. If you set <code>Replace</code> to true,
     * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously
     * uploaded labels and learns only from the exact set that you upload.
     * Replacing labels can be helpful if you realize that you previously
     * uploaded incorrect labels, and you believe that they are having a
     * negative effect on your transform quality.
     * </p>
     * <p>
     * You can check on the status of your task run by calling the
     * <code>GetMLTaskRun</code> operation.
     * </p>
     * 
     * @param startImportLabelsTaskRunRequest
     * @return startImportLabelsTaskRunResult The response from the
     *         StartImportLabelsTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws InternalServiceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartImportLabelsTaskRunResult startImportLabelsTaskRun(
            StartImportLabelsTaskRunRequest startImportLabelsTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startImportLabelsTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImportLabelsTaskRunRequest> request = null;
        Response<StartImportLabelsTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImportLabelsTaskRunRequestMarshaller()
                        .marshall(startImportLabelsTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartImportLabelsTaskRunResult, JsonUnmarshallerContext> unmarshaller = new StartImportLabelsTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<StartImportLabelsTaskRunResult> responseHandler = new JsonResponseHandler<StartImportLabelsTaskRunResult>(
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
     * Starts a job run using a job definition.
     * </p>
     * 
     * @param startJobRunRequest
     * @return startJobRunResult The response from the StartJobRun service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRunRequest> request = null;
        Response<StartJobRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRunRequestMarshaller().marshall(startJobRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartJobRunResult, JsonUnmarshallerContext> unmarshaller = new StartJobRunResultJsonUnmarshaller();
            JsonResponseHandler<StartJobRunResult> responseHandler = new JsonResponseHandler<StartJobRunResult>(
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
     * Starts a task to estimate the quality of the transform.
     * </p>
     * <p>
     * When you provide label sets as examples of truth, AWS Glue machine
     * learning uses some of those examples to learn from them. The rest of the
     * labels are used as a test to estimate quality.
     * </p>
     * <p>
     * Returns a unique identifier for the run. You can call
     * <code>GetMLTaskRun</code> to get more information about the stats of the
     * <code>EvaluationTaskRun</code>.
     * </p>
     * 
     * @param startMLEvaluationTaskRunRequest
     * @return startMLEvaluationTaskRunResult The response from the
     *         StartMLEvaluationTaskRun service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws ConcurrentRunsExceededException
     * @throws MLTransformNotReadyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartMLEvaluationTaskRunResult startMLEvaluationTaskRun(
            StartMLEvaluationTaskRunRequest startMLEvaluationTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMLEvaluationTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMLEvaluationTaskRunRequest> request = null;
        Response<StartMLEvaluationTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMLEvaluationTaskRunRequestMarshaller()
                        .marshall(startMLEvaluationTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartMLEvaluationTaskRunResult, JsonUnmarshallerContext> unmarshaller = new StartMLEvaluationTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<StartMLEvaluationTaskRunResult> responseHandler = new JsonResponseHandler<StartMLEvaluationTaskRunResult>(
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
     * Starts the active learning workflow for your machine learning transform
     * to improve the transform's quality by generating label sets and adding
     * labels.
     * </p>
     * <p>
     * When the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS
     * Glue will have generated a "labeling set" or a set of questions for
     * humans to answer.
     * </p>
     * <p>
     * In the case of the <code>FindMatches</code> transform, these questions
     * are of the form, “What is the correct way to group these rows together
     * into groups composed entirely of matching records?”
     * </p>
     * <p>
     * After the labeling process is finished, you can upload your labels with a
     * call to <code>StartImportLabelsTaskRun</code>. After
     * <code>StartImportLabelsTaskRun</code> finishes, all future runs of the
     * machine learning transform will use the new and improved labels and
     * perform a higher-quality transformation.
     * </p>
     * 
     * @param startMLLabelingSetGenerationTaskRunRequest
     * @return startMLLabelingSetGenerationTaskRunResult The response from the
     *         StartMLLabelingSetGenerationTaskRun service method, as returned
     *         by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartMLLabelingSetGenerationTaskRunResult startMLLabelingSetGenerationTaskRun(
            StartMLLabelingSetGenerationTaskRunRequest startMLLabelingSetGenerationTaskRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startMLLabelingSetGenerationTaskRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMLLabelingSetGenerationTaskRunRequest> request = null;
        Response<StartMLLabelingSetGenerationTaskRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMLLabelingSetGenerationTaskRunRequestMarshaller()
                        .marshall(startMLLabelingSetGenerationTaskRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartMLLabelingSetGenerationTaskRunResult, JsonUnmarshallerContext> unmarshaller = new StartMLLabelingSetGenerationTaskRunResultJsonUnmarshaller();
            JsonResponseHandler<StartMLLabelingSetGenerationTaskRunResult> responseHandler = new JsonResponseHandler<StartMLLabelingSetGenerationTaskRunResult>(
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
     * Starts an existing trigger. See <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html"
     * >Triggering Jobs</a> for information about how different types of trigger
     * are started.
     * </p>
     * 
     * @param startTriggerRequest
     * @return startTriggerResult The response from the StartTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartTriggerResult startTrigger(StartTriggerRequest startTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTriggerRequest> request = null;
        Response<StartTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTriggerRequestMarshaller().marshall(startTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartTriggerResult, JsonUnmarshallerContext> unmarshaller = new StartTriggerResultJsonUnmarshaller();
            JsonResponseHandler<StartTriggerResult> responseHandler = new JsonResponseHandler<StartTriggerResult>(
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
     * Starts a new run of the specified workflow.
     * </p>
     * 
     * @param startWorkflowRunRequest
     * @return startWorkflowRunResult The response from the StartWorkflowRun
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ResourceNumberLimitExceededException
     * @throws ConcurrentRunsExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartWorkflowRunResult startWorkflowRun(StartWorkflowRunRequest startWorkflowRunRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startWorkflowRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkflowRunRequest> request = null;
        Response<StartWorkflowRunResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkflowRunRequestMarshaller().marshall(startWorkflowRunRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartWorkflowRunResult, JsonUnmarshallerContext> unmarshaller = new StartWorkflowRunResultJsonUnmarshaller();
            JsonResponseHandler<StartWorkflowRunResult> responseHandler = new JsonResponseHandler<StartWorkflowRunResult>(
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
     * If the specified crawler is running, stops the crawl.
     * </p>
     * 
     * @param stopCrawlerRequest
     * @return stopCrawlerResult The response from the StopCrawler service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws CrawlerNotRunningException
     * @throws CrawlerStoppingException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopCrawlerResult stopCrawler(StopCrawlerRequest stopCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCrawlerRequest> request = null;
        Response<StopCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCrawlerRequestMarshaller().marshall(stopCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopCrawlerResult, JsonUnmarshallerContext> unmarshaller = new StopCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<StopCrawlerResult> responseHandler = new JsonResponseHandler<StopCrawlerResult>(
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
     * Sets the schedule state of the specified crawler to
     * <code>NOT_SCHEDULED</code>, but does not stop the crawler if it is
     * already running.
     * </p>
     * 
     * @param stopCrawlerScheduleRequest
     * @return stopCrawlerScheduleResult The response from the
     *         StopCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws SchedulerNotRunningException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopCrawlerScheduleResult stopCrawlerSchedule(
            StopCrawlerScheduleRequest stopCrawlerScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCrawlerScheduleRequest> request = null;
        Response<StopCrawlerScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCrawlerScheduleRequestMarshaller()
                        .marshall(stopCrawlerScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopCrawlerScheduleResult, JsonUnmarshallerContext> unmarshaller = new StopCrawlerScheduleResultJsonUnmarshaller();
            JsonResponseHandler<StopCrawlerScheduleResult> responseHandler = new JsonResponseHandler<StopCrawlerScheduleResult>(
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
     * Stops a specified trigger.
     * </p>
     * 
     * @param stopTriggerRequest
     * @return stopTriggerResult The response from the StopTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopTriggerResult stopTrigger(StopTriggerRequest stopTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTriggerRequest> request = null;
        Response<StopTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTriggerRequestMarshaller().marshall(stopTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopTriggerResult, JsonUnmarshallerContext> unmarshaller = new StopTriggerResultJsonUnmarshaller();
            JsonResponseHandler<StopTriggerResult> responseHandler = new JsonResponseHandler<StopTriggerResult>(
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
     * Adds tags to a resource. A tag is a label you can assign to an AWS
     * resource. In AWS Glue, you can tag only certain resources. For
     * information about what resources you can tag, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(tagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TagResourceResult, JsonUnmarshallerContext> unmarshaller = new TagResourceResultJsonUnmarshaller();
            JsonResponseHandler<TagResourceResult> responseHandler = new JsonResponseHandler<TagResourceResult>(
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws EntityNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(untagResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> unmarshaller = new UntagResourceResultJsonUnmarshaller();
            JsonResponseHandler<UntagResourceResult> responseHandler = new JsonResponseHandler<UntagResourceResult>(
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
     * Modifies an existing classifier (a <code>GrokClassifier</code>, an
     * <code>XMLClassifier</code>, a <code>JsonClassifier</code>, or a
     * <code>CsvClassifier</code>, depending on which field is present).
     * </p>
     * 
     * @param updateClassifierRequest
     * @return updateClassifierResult The response from the UpdateClassifier
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateClassifierResult updateClassifier(UpdateClassifierRequest updateClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClassifierRequest> request = null;
        Response<UpdateClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClassifierRequestMarshaller().marshall(updateClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClassifierResult, JsonUnmarshallerContext> unmarshaller = new UpdateClassifierResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClassifierResult> responseHandler = new JsonResponseHandler<UpdateClassifierResult>(
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
     * Updates a connection definition in the Data Catalog.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return updateConnectionResult The response from the UpdateConnection
     *         service method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateConnectionResult updateConnection(UpdateConnectionRequest updateConnectionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectionRequest> request = null;
        Response<UpdateConnectionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectionRequestMarshaller().marshall(updateConnectionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateConnectionResult, JsonUnmarshallerContext> unmarshaller = new UpdateConnectionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateConnectionResult> responseHandler = new JsonResponseHandler<UpdateConnectionResult>(
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
     * Updates a crawler. If a crawler is running, you must stop it using
     * <code>StopCrawler</code> before updating it.
     * </p>
     * 
     * @param updateCrawlerRequest
     * @return updateCrawlerResult The response from the UpdateCrawler service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws EntityNotFoundException
     * @throws CrawlerRunningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCrawlerResult updateCrawler(UpdateCrawlerRequest updateCrawlerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCrawlerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCrawlerRequest> request = null;
        Response<UpdateCrawlerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCrawlerRequestMarshaller().marshall(updateCrawlerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCrawlerResult, JsonUnmarshallerContext> unmarshaller = new UpdateCrawlerResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCrawlerResult> responseHandler = new JsonResponseHandler<UpdateCrawlerResult>(
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
     * Updates the schedule of a crawler using a <code>cron</code> expression.
     * </p>
     * 
     * @param updateCrawlerScheduleRequest
     * @return updateCrawlerScheduleResult The response from the
     *         UpdateCrawlerSchedule service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws VersionMismatchException
     * @throws SchedulerTransitioningException
     * @throws OperationTimeoutException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateCrawlerScheduleResult updateCrawlerSchedule(
            UpdateCrawlerScheduleRequest updateCrawlerScheduleRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateCrawlerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCrawlerScheduleRequest> request = null;
        Response<UpdateCrawlerScheduleResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCrawlerScheduleRequestMarshaller()
                        .marshall(updateCrawlerScheduleRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateCrawlerScheduleResult, JsonUnmarshallerContext> unmarshaller = new UpdateCrawlerScheduleResultJsonUnmarshaller();
            JsonResponseHandler<UpdateCrawlerScheduleResult> responseHandler = new JsonResponseHandler<UpdateCrawlerScheduleResult>(
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
     * Updates an existing database definition in a Data Catalog.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return updateDatabaseResult The response from the UpdateDatabase service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest updateDatabaseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDatabaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatabaseRequest> request = null;
        Response<UpdateDatabaseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatabaseRequestMarshaller().marshall(updateDatabaseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDatabaseResult, JsonUnmarshallerContext> unmarshaller = new UpdateDatabaseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDatabaseResult> responseHandler = new JsonResponseHandler<UpdateDatabaseResult>(
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
     * Updates a specified development endpoint.
     * </p>
     * 
     * @param updateDevEndpointRequest
     * @return updateDevEndpointResult The response from the UpdateDevEndpoint
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws InvalidInputException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDevEndpointResult updateDevEndpoint(
            UpdateDevEndpointRequest updateDevEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDevEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDevEndpointRequest> request = null;
        Response<UpdateDevEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDevEndpointRequestMarshaller()
                        .marshall(updateDevEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDevEndpointResult, JsonUnmarshallerContext> unmarshaller = new UpdateDevEndpointResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDevEndpointResult> responseHandler = new JsonResponseHandler<UpdateDevEndpointResult>(
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
     * Updates an existing job definition.
     * </p>
     * 
     * @param updateJobRequest
     * @return updateJobResult The response from the UpdateJob service method,
     *         as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestMarshaller().marshall(updateJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateJobResult, JsonUnmarshallerContext> unmarshaller = new UpdateJobResultJsonUnmarshaller();
            JsonResponseHandler<UpdateJobResult> responseHandler = new JsonResponseHandler<UpdateJobResult>(
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
     * Updates an existing machine learning transform. Call this operation to
     * tune the algorithm parameters to achieve better results.
     * </p>
     * <p>
     * After calling this operation, you can call the
     * <code>StartMLEvaluationTaskRun</code> operation to assess how well your
     * new parameters achieved your goals (such as improving the quality of your
     * machine learning transform, or making it more cost-effective).
     * </p>
     * 
     * @param updateMLTransformRequest
     * @return updateMLTransformResult The response from the UpdateMLTransform
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws OperationTimeoutException
     * @throws InternalServiceException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMLTransformResult updateMLTransform(
            UpdateMLTransformRequest updateMLTransformRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMLTransformRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMLTransformRequest> request = null;
        Response<UpdateMLTransformResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMLTransformRequestMarshaller()
                        .marshall(updateMLTransformRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMLTransformResult, JsonUnmarshallerContext> unmarshaller = new UpdateMLTransformResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMLTransformResult> responseHandler = new JsonResponseHandler<UpdateMLTransformResult>(
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
     * Updates a partition.
     * </p>
     * 
     * @param updatePartitionRequest
     * @return updatePartitionResult The response from the UpdatePartition
     *         service method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdatePartitionResult updatePartition(UpdatePartitionRequest updatePartitionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updatePartitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePartitionRequest> request = null;
        Response<UpdatePartitionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePartitionRequestMarshaller().marshall(updatePartitionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdatePartitionResult, JsonUnmarshallerContext> unmarshaller = new UpdatePartitionResultJsonUnmarshaller();
            JsonResponseHandler<UpdatePartitionResult> responseHandler = new JsonResponseHandler<UpdatePartitionResult>(
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
     * Updates a metadata table in the Data Catalog.
     * </p>
     * 
     * @param updateTableRequest
     * @return updateTableResult The response from the UpdateTable service
     *         method, as returned by AWS Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws ResourceNumberLimitExceededException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestMarshaller().marshall(updateTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTableResult, JsonUnmarshallerContext> unmarshaller = new UpdateTableResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTableResult> responseHandler = new JsonResponseHandler<UpdateTableResult>(
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
     * Updates a trigger definition.
     * </p>
     * 
     * @param updateTriggerRequest
     * @return updateTriggerResult The response from the UpdateTrigger service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws EntityNotFoundException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateTriggerResult updateTrigger(UpdateTriggerRequest updateTriggerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTriggerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTriggerRequest> request = null;
        Response<UpdateTriggerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTriggerRequestMarshaller().marshall(updateTriggerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTriggerResult, JsonUnmarshallerContext> unmarshaller = new UpdateTriggerResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTriggerResult> responseHandler = new JsonResponseHandler<UpdateTriggerResult>(
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
     * Updates an existing function definition in the Data Catalog.
     * </p>
     * 
     * @param updateUserDefinedFunctionRequest
     * @return updateUserDefinedFunctionResult The response from the
     *         UpdateUserDefinedFunction service method, as returned by AWS
     *         Glue.
     * @throws EntityNotFoundException
     * @throws InvalidInputException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws GlueEncryptionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateUserDefinedFunctionResult updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest updateUserDefinedFunctionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserDefinedFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserDefinedFunctionRequest> request = null;
        Response<UpdateUserDefinedFunctionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserDefinedFunctionRequestMarshaller()
                        .marshall(updateUserDefinedFunctionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserDefinedFunctionResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserDefinedFunctionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserDefinedFunctionResult> responseHandler = new JsonResponseHandler<UpdateUserDefinedFunctionResult>(
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
     * Updates an existing workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return updateWorkflowResult The response from the UpdateWorkflow service
     *         method, as returned by AWS Glue.
     * @throws InvalidInputException
     * @throws EntityNotFoundException
     * @throws InternalServiceException
     * @throws OperationTimeoutException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Glue indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest updateWorkflowRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkflowRequest> request = null;
        Response<UpdateWorkflowResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkflowRequestMarshaller().marshall(updateWorkflowRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWorkflowResult, JsonUnmarshallerContext> unmarshaller = new UpdateWorkflowResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWorkflowResult> responseHandler = new JsonResponseHandler<UpdateWorkflowResult>(
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
