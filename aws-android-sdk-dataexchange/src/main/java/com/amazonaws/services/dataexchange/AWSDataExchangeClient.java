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

package com.amazonaws.services.dataexchange;

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

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.services.dataexchange.model.transform.*;

/**
 * Client for accessing AWS Data Exchange. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * AWS Data Exchange is a service that makes it easy for AWS customers to
 * exchange data in the cloud. You can use the AWS Data Exchange APIs to create,
 * update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an
 * entitlement to through a subscription. You can use the APIS to download or
 * copy your entitled data sets to Amazon S3 for use across a variety of AWS
 * analytics and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like
 * to publish to a product. Being able to package and provide your data sets
 * into products requires a few steps to determine eligibility. For more
 * information, visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time.
 * Data sets can be updated using revisions, which represent a new version or
 * incremental change to a data set. A revision contains one or more assets. An
 * asset in AWS Data Exchange is a piece of data that can be stored as an Amazon
 * S3 object. The asset can be a structured data file, an image file, or some
 * other data file. Jobs are asynchronous import or export operations used to
 * create or copy assets.
 * </p>
 */
public class AWSDataExchangeClient extends AmazonWebServiceClient implements AWSDataExchange {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Data Exchange exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange. A
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
    public AWSDataExchangeClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange. A
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
     *            how this client connects to AWSDataExchange (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSDataExchangeClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
     * using the specified AWS account credentials.
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
     *         AWSDataExchangeClient client = new AWSDataExchangeClient(AWSMobileClient.getInstance());
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
    public AWSDataExchangeClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
     * using the specified AWS account credentials and client configuration
     * options.
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
     *         AWSDataExchangeClient client = new AWSDataExchangeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDataExchange (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSDataExchangeClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
     * using the specified AWS account credentials provider.
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
     *         AWSDataExchangeClient client = new AWSDataExchangeClient(AWSMobileClient.getInstance());
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
    public AWSDataExchangeClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
     * using the specified AWS account credentials provider and client
     * configuration options.
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
     *         AWSDataExchangeClient client = new AWSDataExchangeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDataExchange (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AWSDataExchangeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
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
     *            how this client connects to AWSDataExchange (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSDataExchangeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSDataExchange
     * using the specified AWS account credentials provider, client
     * configuration options and request metric collector.
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
     *         AWSDataExchangeClient client = new AWSDataExchangeClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSDataExchange (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSDataExchangeClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("dataexchange.us-east-1.amazonaws.com");
        this.endpointPrefix = "dataexchange";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/dataexchange/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/dataexchange/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * This operation cancels a job. Jobs can be cancelled only when they are in
     * the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void cancelJob(CancelJobRequest cancelJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRequestMarshaller().marshall(cancelJobRequest);
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
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest <p>
     *            The request body for CreateDataSet.
     *            </p>
     * @return createDataSetResult The response from the CreateDataSet service
     *         method, as returned by AWS Data Exchange.
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws ServiceLimitExceededException <p>
     *             402 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateDataSetResult createDataSet(CreateDataSetRequest createDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSetRequest> request = null;
        Response<CreateDataSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSetRequestMarshaller().marshall(createDataSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDataSetResult, JsonUnmarshallerContext> unmarshaller = new CreateDataSetResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataSetResult> responseHandler = new JsonResponseHandler<CreateDataSetResult>(
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
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest <p>
     *            The request body for CreateJob.
     *            </p>
     * @return createJobResult The response from the CreateJob service method,
     *         as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest <p>
     *            The request body for CreateRevision.
     *            </p>
     * @return createRevisionResult The response from the CreateRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateRevisionResult createRevision(CreateRevisionRequest createRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRevisionRequest> request = null;
        Response<CreateRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRevisionRequestMarshaller().marshall(createRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRevisionResult, JsonUnmarshallerContext> unmarshaller = new CreateRevisionResultJsonUnmarshaller();
            JsonResponseHandler<CreateRevisionResult> responseHandler = new JsonResponseHandler<CreateRevisionResult>(
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
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteAsset(DeleteAssetRequest deleteAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssetRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssetRequestMarshaller().marshall(deleteAssetRequest);
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
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteDataSet(DeleteDataSetRequest deleteDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSetRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSetRequestMarshaller().marshall(deleteDataSetRequest);
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
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public void deleteRevision(DeleteRevisionRequest deleteRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRevisionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRevisionRequestMarshaller().marshall(deleteRevisionRequest);
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
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return getAssetResult The response from the GetAsset service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetAssetResult getAsset(GetAssetRequest getAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssetRequest> request = null;
        Response<GetAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssetRequestMarshaller().marshall(getAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAssetResult, JsonUnmarshallerContext> unmarshaller = new GetAssetResultJsonUnmarshaller();
            JsonResponseHandler<GetAssetResult> responseHandler = new JsonResponseHandler<GetAssetResult>(
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
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @return getDataSetResult The response from the GetDataSet service method,
     *         as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDataSetResult getDataSet(GetDataSetRequest getDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSetRequest> request = null;
        Response<GetDataSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSetRequestMarshaller().marshall(getDataSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDataSetResult, JsonUnmarshallerContext> unmarshaller = new GetDataSetResultJsonUnmarshaller();
            JsonResponseHandler<GetDataSetResult> responseHandler = new JsonResponseHandler<GetDataSetResult>(
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
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @return getRevisionResult The response from the GetRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRevisionRequest> request = null;
        Response<GetRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRevisionRequestMarshaller().marshall(getRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRevisionResult, JsonUnmarshallerContext> unmarshaller = new GetRevisionResultJsonUnmarshaller();
            JsonResponseHandler<GetRevisionResult> responseHandler = new JsonResponseHandler<GetRevisionResult>(
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
     * This operation lists a data set's revisions sorted by CreatedAt in
     * descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @return listDataSetRevisionsResult The response from the
     *         ListDataSetRevisions service method, as returned by AWS Data
     *         Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDataSetRevisionsResult listDataSetRevisions(
            ListDataSetRevisionsRequest listDataSetRevisionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDataSetRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetRevisionsRequest> request = null;
        Response<ListDataSetRevisionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetRevisionsRequestMarshaller()
                        .marshall(listDataSetRevisionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDataSetRevisionsResult, JsonUnmarshallerContext> unmarshaller = new ListDataSetRevisionsResultJsonUnmarshaller();
            JsonResponseHandler<ListDataSetRevisionsResult> responseHandler = new JsonResponseHandler<ListDataSetRevisionsResult>(
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
     * This operation lists your data sets. When listing by origin OWNED,
     * results are sorted by CreatedAt in descending order. When listing by
     * origin ENTITLED, there is no order and the maxResults parameter is
     * ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return listDataSetsResult The response from the ListDataSets service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDataSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSetsRequest> request = null;
        Response<ListDataSetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSetsRequestMarshaller().marshall(listDataSetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDataSetsResult, JsonUnmarshallerContext> unmarshaller = new ListDataSetsResultJsonUnmarshaller();
            JsonResponseHandler<ListDataSetsResult> responseHandler = new JsonResponseHandler<ListDataSetsResult>(
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
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * This operation lists a revision's assets sorted alphabetically in
     * descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @return listRevisionAssetsResult The response from the ListRevisionAssets
     *         service method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListRevisionAssetsResult listRevisionAssets(
            ListRevisionAssetsRequest listRevisionAssetsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRevisionAssetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRevisionAssetsRequest> request = null;
        Response<ListRevisionAssetsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRevisionAssetsRequestMarshaller()
                        .marshall(listRevisionAssetsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRevisionAssetsResult, JsonUnmarshallerContext> unmarshaller = new ListRevisionAssetsResultJsonUnmarshaller();
            JsonResponseHandler<ListRevisionAssetsResult> responseHandler = new JsonResponseHandler<ListRevisionAssetsResult>(
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
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Data
     *         Exchange.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @return startJobResult The response from the StartJob service method, as
     *         returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public StartJobResult startJob(StartJobRequest startJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRequest> request = null;
        Response<StartJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRequestMarshaller().marshall(startJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartJobResult, JsonUnmarshallerContext> unmarshaller = new StartJobResultJsonUnmarshaller();
            JsonResponseHandler<StartJobResult> responseHandler = new JsonResponseHandler<StartJobResult>(
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
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request body for TagResource.
     *            </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest <p>
     *            The request body for UpdateAsset.
     *            </p>
     * @return updateAssetResult The response from the UpdateAsset service
     *         method, as returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAssetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssetRequest> request = null;
        Response<UpdateAssetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssetRequestMarshaller().marshall(updateAssetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAssetResult, JsonUnmarshallerContext> unmarshaller = new UpdateAssetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAssetResult> responseHandler = new JsonResponseHandler<UpdateAssetResult>(
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
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest <p>
     *            The request body for UpdateDataSet.
     *            </p>
     * @return updateDataSetResult The response from the UpdateDataSet service
     *         method, as returned by AWS Data Exchange.
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDataSetResult updateDataSet(UpdateDataSetRequest updateDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSetRequest> request = null;
        Response<UpdateDataSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSetRequestMarshaller().marshall(updateDataSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataSetResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataSetResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataSetResult> responseHandler = new JsonResponseHandler<UpdateDataSetResult>(
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
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest <p>
     *            The request body for UpdateRevision.
     *            </p>
     * @return updateRevisionResult The response from the UpdateRevision service
     *         method, as returned by AWS Data Exchange.
     * @throws ValidationException <p>
     *             400 response
     *             </p>
     * @throws InternalServerException <p>
     *             500 response
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             404 response
     *             </p>
     * @throws ThrottlingException <p>
     *             429 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Data Exchange indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateRevisionResult updateRevision(UpdateRevisionRequest updateRevisionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRevisionRequest> request = null;
        Response<UpdateRevisionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRevisionRequestMarshaller().marshall(updateRevisionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRevisionResult, JsonUnmarshallerContext> unmarshaller = new UpdateRevisionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRevisionResult> responseHandler = new JsonResponseHandler<UpdateRevisionResult>(
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
