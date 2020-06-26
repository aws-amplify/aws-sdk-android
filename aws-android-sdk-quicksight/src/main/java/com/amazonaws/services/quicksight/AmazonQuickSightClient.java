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

package com.amazonaws.services.quicksight;

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

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.services.quicksight.model.transform.*;

/**
 * Client for accessing Amazon QuickSight. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon QuickSight API Reference</fullname>
 * <p>
 * Amazon QuickSight is a fully managed, serverless business intelligence
 * service for the AWS Cloud that makes it easy to extend data and insights to
 * every user in your organization. This API reference contains documentation
 * for a programming interface that you can use to manage Amazon QuickSight.
 * </p>
 */
public class AmazonQuickSightClient extends AmazonWebServiceClient implements AmazonQuickSight {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon QuickSight exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight. A
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
    public AmazonQuickSightClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight. A
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
     *            how this client connects to AmazonQuickSight (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonQuickSightClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *         AmazonQuickSightClient client = new AmazonQuickSightClient(AWSMobileClient.getInstance());
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
    public AmazonQuickSightClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *         AmazonQuickSightClient client = new AmazonQuickSightClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonQuickSight (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonQuickSightClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *         AmazonQuickSightClient client = new AmazonQuickSightClient(AWSMobileClient.getInstance());
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
    public AmazonQuickSightClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *         AmazonQuickSightClient client = new AmazonQuickSightClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonQuickSight (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonQuickSightClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *            how this client connects to AmazonQuickSight (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonQuickSightClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonQuickSight
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
     *         AmazonQuickSightClient client = new AmazonQuickSightClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonQuickSight (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonQuickSightClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentUpdatingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DomainNotWhitelistedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdentityTypeNotSupportedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PreconditionNotMetExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new QuickSightUserNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SessionLifetimeInMinutesInvalidExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedUserEditionExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("quicksight.us-east-1.amazonaws.com");
        this.endpointPrefix = "quicksight";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/quicksight/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/quicksight/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Cancels an ongoing ingestion of data into SPICE.
     * </p>
     * 
     * @param cancelIngestionRequest
     * @return cancelIngestionResult The response from the CancelIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CancelIngestionResult cancelIngestion(CancelIngestionRequest cancelIngestionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelIngestionRequest> request = null;
        Response<CancelIngestionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelIngestionRequestMarshaller().marshall(cancelIngestionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelIngestionResult, JsonUnmarshallerContext> unmarshaller = new CancelIngestionResultJsonUnmarshaller();
            JsonResponseHandler<CancelIngestionResult> responseHandler = new JsonResponseHandler<CancelIngestionResult>(
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
     * Creates a dashboard from a template. To first create a template, see the
     * <a>CreateTemplate</a> API operation.
     * </p>
     * <p>
     * A dashboard is an entity in QuickSight that identifies QuickSight
     * reports, created from analyses. You can share QuickSight dashboards. With
     * the right permissions, you can create scheduled email reports from them.
     * The <code>CreateDashboard</code>, <code>DescribeDashboard</code>, and
     * <code>ListDashboardsByUser</code> API operations act on the dashboard
     * entity. If you have the correct permissions, you can create a dashboard
     * from a template that exists in a different AWS account.
     * </p>
     * 
     * @param createDashboardRequest
     * @return createDashboardResult The response from the CreateDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDashboardResult createDashboard(CreateDashboardRequest createDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDashboardRequest> request = null;
        Response<CreateDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDashboardRequestMarshaller().marshall(createDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDashboardResult, JsonUnmarshallerContext> unmarshaller = new CreateDashboardResultJsonUnmarshaller();
            JsonResponseHandler<CreateDashboardResult> responseHandler = new JsonResponseHandler<CreateDashboardResult>(
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
     * Creates a dataset.
     * </p>
     * 
     * @param createDataSetRequest
     * @return createDataSetResult The response from the CreateDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Creates a data source.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return createDataSourceResult The response from the CreateDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceRequest> request = null;
        Response<CreateDataSourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceRequestMarshaller().marshall(createDataSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDataSourceResult, JsonUnmarshallerContext> unmarshaller = new CreateDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataSourceResult> responseHandler = new JsonResponseHandler<CreateDataSourceResult>(
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
     * Creates an Amazon QuickSight group.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:us-east-1:<i>&lt;relevant-aws-account-id&gt;</i>:group/default/<i>&lt;group-name&gt;</i> </code>
     * .
     * </p>
     * <p>
     * The response is a group object.
     * </p>
     * 
     * @param createGroupRequest <p>
     *            The request object for this operation.
     *            </p>
     * @return createGroupResult The response from the CreateGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestMarshaller().marshall(createGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGroupResult, JsonUnmarshallerContext> unmarshaller = new CreateGroupResultJsonUnmarshaller();
            JsonResponseHandler<CreateGroupResult> responseHandler = new JsonResponseHandler<CreateGroupResult>(
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
     * Adds an Amazon QuickSight user to an Amazon QuickSight group.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return createGroupMembershipResult The response from the
     *         CreateGroupMembership service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateGroupMembershipResult createGroupMembership(
            CreateGroupMembershipRequest createGroupMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupMembershipRequest> request = null;
        Response<CreateGroupMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupMembershipRequestMarshaller()
                        .marshall(createGroupMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateGroupMembershipResult, JsonUnmarshallerContext> unmarshaller = new CreateGroupMembershipResultJsonUnmarshaller();
            JsonResponseHandler<CreateGroupMembershipResult> responseHandler = new JsonResponseHandler<CreateGroupMembershipResult>(
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
     * Creates an assignment with one specified IAM policy, identified by its
     * Amazon Resource Name (ARN). This policy will be assigned to specified
     * groups or users of Amazon QuickSight. The users and groups need to be in
     * the same namespace.
     * </p>
     * 
     * @param createIAMPolicyAssignmentRequest
     * @return createIAMPolicyAssignmentResult The response from the
     *         CreateIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateIAMPolicyAssignmentResult createIAMPolicyAssignment(
            CreateIAMPolicyAssignmentRequest createIAMPolicyAssignmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIAMPolicyAssignmentRequest> request = null;
        Response<CreateIAMPolicyAssignmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIAMPolicyAssignmentRequestMarshaller()
                        .marshall(createIAMPolicyAssignmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIAMPolicyAssignmentResult, JsonUnmarshallerContext> unmarshaller = new CreateIAMPolicyAssignmentResultJsonUnmarshaller();
            JsonResponseHandler<CreateIAMPolicyAssignmentResult> responseHandler = new JsonResponseHandler<CreateIAMPolicyAssignmentResult>(
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
     * Creates and starts a new SPICE ingestion on a dataset
     * </p>
     * <p>
     * Any ingestions operating on tagged datasets inherit the same tags
     * automatically for use in access control. For an example, see <a href=
     * "https://aws.amazon.com/premiumsupport/knowledge-center/iam-ec2-resource-tags/"
     * >How do I create an IAM policy to control access to Amazon EC2 resources
     * using tags?</a> in the AWS Knowledge Center. Tags are visible on the
     * tagged dataset, but not on the ingestion resource.
     * </p>
     * 
     * @param createIngestionRequest
     * @return createIngestionResult The response from the CreateIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateIngestionResult createIngestion(CreateIngestionRequest createIngestionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIngestionRequest> request = null;
        Response<CreateIngestionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIngestionRequestMarshaller().marshall(createIngestionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIngestionResult, JsonUnmarshallerContext> unmarshaller = new CreateIngestionResultJsonUnmarshaller();
            JsonResponseHandler<CreateIngestionResult> responseHandler = new JsonResponseHandler<CreateIngestionResult>(
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
     * Creates a template from an existing QuickSight analysis or template. You
     * can use the resulting template to create a dashboard.
     * </p>
     * <p>
     * A <i>template</i> is an entity in QuickSight that encapsulates the
     * metadata required to create an analysis and that you can use to create s
     * dashboard. A template adds a layer of abstraction by using placeholders
     * to replace the dataset associated with the analysis. You can use
     * templates to create dashboards by replacing dataset placeholders with
     * datasets that follow the same schema that was used to create the source
     * analysis and template.
     * </p>
     * 
     * @param createTemplateRequest
     * @return createTemplateResult The response from the CreateTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws AccessDeniedException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateRequest> request = null;
        Response<CreateTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateRequestMarshaller().marshall(createTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTemplateResult, JsonUnmarshallerContext> unmarshaller = new CreateTemplateResultJsonUnmarshaller();
            JsonResponseHandler<CreateTemplateResult> responseHandler = new JsonResponseHandler<CreateTemplateResult>(
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
     * Creates a template alias for a template.
     * </p>
     * 
     * @param createTemplateAliasRequest
     * @return createTemplateAliasResult The response from the
     *         CreateTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws ResourceExistsException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateTemplateAliasResult createTemplateAlias(
            CreateTemplateAliasRequest createTemplateAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateAliasRequest> request = null;
        Response<CreateTemplateAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateAliasRequestMarshaller()
                        .marshall(createTemplateAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTemplateAliasResult, JsonUnmarshallerContext> unmarshaller = new CreateTemplateAliasResultJsonUnmarshaller();
            JsonResponseHandler<CreateTemplateAliasResult> responseHandler = new JsonResponseHandler<CreateTemplateAliasResult>(
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
     * Deletes a dashboard.
     * </p>
     * 
     * @param deleteDashboardRequest
     * @return deleteDashboardResult The response from the DeleteDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDashboardResult deleteDashboard(DeleteDashboardRequest deleteDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDashboardRequest> request = null;
        Response<DeleteDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDashboardRequestMarshaller().marshall(deleteDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDashboardResult, JsonUnmarshallerContext> unmarshaller = new DeleteDashboardResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDashboardResult> responseHandler = new JsonResponseHandler<DeleteDashboardResult>(
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
     * Deletes a dataset.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return deleteDataSetResult The response from the DeleteDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDataSetResult deleteDataSet(DeleteDataSetRequest deleteDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSetRequest> request = null;
        Response<DeleteDataSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSetRequestMarshaller().marshall(deleteDataSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDataSetResult, JsonUnmarshallerContext> unmarshaller = new DeleteDataSetResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDataSetResult> responseHandler = new JsonResponseHandler<DeleteDataSetResult>(
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
     * Deletes the data source permanently. This action breaks all the datasets
     * that reference the deleted data source.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return deleteDataSourceResult The response from the DeleteDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestMarshaller().marshall(deleteDataSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDataSourceResult, JsonUnmarshallerContext> unmarshaller = new DeleteDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDataSourceResult> responseHandler = new JsonResponseHandler<DeleteDataSourceResult>(
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
     * Removes a user group from Amazon QuickSight.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return deleteGroupResult The response from the DeleteGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestMarshaller().marshall(deleteGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGroupResult, JsonUnmarshallerContext> unmarshaller = new DeleteGroupResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGroupResult> responseHandler = new JsonResponseHandler<DeleteGroupResult>(
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
     * Removes a user from a group so that the user is no longer a member of the
     * group.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return deleteGroupMembershipResult The response from the
     *         DeleteGroupMembership service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteGroupMembershipResult deleteGroupMembership(
            DeleteGroupMembershipRequest deleteGroupMembershipRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupMembershipRequest> request = null;
        Response<DeleteGroupMembershipResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupMembershipRequestMarshaller()
                        .marshall(deleteGroupMembershipRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteGroupMembershipResult, JsonUnmarshallerContext> unmarshaller = new DeleteGroupMembershipResultJsonUnmarshaller();
            JsonResponseHandler<DeleteGroupMembershipResult> responseHandler = new JsonResponseHandler<DeleteGroupMembershipResult>(
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
     * Deletes an existing IAM policy assignment.
     * </p>
     * 
     * @param deleteIAMPolicyAssignmentRequest
     * @return deleteIAMPolicyAssignmentResult The response from the
     *         DeleteIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteIAMPolicyAssignmentResult deleteIAMPolicyAssignment(
            DeleteIAMPolicyAssignmentRequest deleteIAMPolicyAssignmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIAMPolicyAssignmentRequest> request = null;
        Response<DeleteIAMPolicyAssignmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIAMPolicyAssignmentRequestMarshaller()
                        .marshall(deleteIAMPolicyAssignmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteIAMPolicyAssignmentResult, JsonUnmarshallerContext> unmarshaller = new DeleteIAMPolicyAssignmentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteIAMPolicyAssignmentResult> responseHandler = new JsonResponseHandler<DeleteIAMPolicyAssignmentResult>(
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
     * Deletes a template.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return deleteTemplateResult The response from the DeleteTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateRequest> request = null;
        Response<DeleteTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateRequestMarshaller().marshall(deleteTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTemplateResult, JsonUnmarshallerContext> unmarshaller = new DeleteTemplateResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTemplateResult> responseHandler = new JsonResponseHandler<DeleteTemplateResult>(
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
     * Deletes the item that the specified template alias points to. If you
     * provide a specific alias, you delete the version of the template that the
     * alias points to.
     * </p>
     * 
     * @param deleteTemplateAliasRequest
     * @return deleteTemplateAliasResult The response from the
     *         DeleteTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteTemplateAliasResult deleteTemplateAlias(
            DeleteTemplateAliasRequest deleteTemplateAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateAliasRequest> request = null;
        Response<DeleteTemplateAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateAliasRequestMarshaller()
                        .marshall(deleteTemplateAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTemplateAliasResult, JsonUnmarshallerContext> unmarshaller = new DeleteTemplateAliasResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTemplateAliasResult> responseHandler = new JsonResponseHandler<DeleteTemplateAliasResult>(
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
     * Deletes the Amazon QuickSight user that is associated with the identity
     * of the AWS Identity and Access Management (IAM) user or role that's
     * making the call. The IAM user isn't deleted as a result of this call.
     * </p>
     * 
     * @param deleteUserRequest
     * @return deleteUserResult The response from the DeleteUser service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestMarshaller().marshall(deleteUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserResult> responseHandler = new JsonResponseHandler<DeleteUserResult>(
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
     * Deletes a user identified by its principal ID.
     * </p>
     * 
     * @param deleteUserByPrincipalIdRequest <p/>
     * @return deleteUserByPrincipalIdResult The response from the
     *         DeleteUserByPrincipalId service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteUserByPrincipalIdResult deleteUserByPrincipalId(
            DeleteUserByPrincipalIdRequest deleteUserByPrincipalIdRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUserByPrincipalIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserByPrincipalIdRequest> request = null;
        Response<DeleteUserByPrincipalIdResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserByPrincipalIdRequestMarshaller()
                        .marshall(deleteUserByPrincipalIdRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteUserByPrincipalIdResult, JsonUnmarshallerContext> unmarshaller = new DeleteUserByPrincipalIdResultJsonUnmarshaller();
            JsonResponseHandler<DeleteUserByPrincipalIdResult> responseHandler = new JsonResponseHandler<DeleteUserByPrincipalIdResult>(
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
     * Provides a summary for a dashboard.
     * </p>
     * 
     * @param describeDashboardRequest
     * @return describeDashboardResult The response from the DescribeDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDashboardResult describeDashboard(
            DescribeDashboardRequest describeDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardRequest> request = null;
        Response<DescribeDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardRequestMarshaller()
                        .marshall(describeDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDashboardResult, JsonUnmarshallerContext> unmarshaller = new DescribeDashboardResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDashboardResult> responseHandler = new JsonResponseHandler<DescribeDashboardResult>(
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
     * Describes read and write permissions for a dashboard.
     * </p>
     * 
     * @param describeDashboardPermissionsRequest
     * @return describeDashboardPermissionsResult The response from the
     *         DescribeDashboardPermissions service method, as returned by
     *         Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDashboardPermissionsResult describeDashboardPermissions(
            DescribeDashboardPermissionsRequest describeDashboardPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDashboardPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDashboardPermissionsRequest> request = null;
        Response<DescribeDashboardPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDashboardPermissionsRequestMarshaller()
                        .marshall(describeDashboardPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDashboardPermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDashboardPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDashboardPermissionsResult> responseHandler = new JsonResponseHandler<DescribeDashboardPermissionsResult>(
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
     * Describes a dataset.
     * </p>
     * 
     * @param describeDataSetRequest
     * @return describeDataSetResult The response from the DescribeDataSet
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDataSetResult describeDataSet(DescribeDataSetRequest describeDataSetRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSetRequest> request = null;
        Response<DescribeDataSetResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSetRequestMarshaller().marshall(describeDataSetRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDataSetResult, JsonUnmarshallerContext> unmarshaller = new DescribeDataSetResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataSetResult> responseHandler = new JsonResponseHandler<DescribeDataSetResult>(
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
     * Describes the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * .
     * </p>
     * 
     * @param describeDataSetPermissionsRequest
     * @return describeDataSetPermissionsResult The response from the
     *         DescribeDataSetPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDataSetPermissionsResult describeDataSetPermissions(
            DescribeDataSetPermissionsRequest describeDataSetPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDataSetPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSetPermissionsRequest> request = null;
        Response<DescribeDataSetPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSetPermissionsRequestMarshaller()
                        .marshall(describeDataSetPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDataSetPermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDataSetPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataSetPermissionsResult> responseHandler = new JsonResponseHandler<DescribeDataSetPermissionsResult>(
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
     * Describes a data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return describeDataSourceResult The response from the DescribeDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDataSourceResult describeDataSource(
            DescribeDataSourceRequest describeDataSourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourceRequest> request = null;
        Response<DescribeDataSourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourceRequestMarshaller()
                        .marshall(describeDataSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDataSourceResult, JsonUnmarshallerContext> unmarshaller = new DescribeDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataSourceResult> responseHandler = new JsonResponseHandler<DescribeDataSourceResult>(
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
     * Describes the resource permissions for a data source.
     * </p>
     * 
     * @param describeDataSourcePermissionsRequest
     * @return describeDataSourcePermissionsResult The response from the
     *         DescribeDataSourcePermissions service method, as returned by
     *         Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDataSourcePermissionsResult describeDataSourcePermissions(
            DescribeDataSourcePermissionsRequest describeDataSourcePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDataSourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourcePermissionsRequest> request = null;
        Response<DescribeDataSourcePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourcePermissionsRequestMarshaller()
                        .marshall(describeDataSourcePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDataSourcePermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeDataSourcePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataSourcePermissionsResult> responseHandler = new JsonResponseHandler<DescribeDataSourcePermissionsResult>(
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
     * Returns an Amazon QuickSight group's description and Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param describeGroupRequest
     * @return describeGroupResult The response from the DescribeGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeGroupResult describeGroup(DescribeGroupRequest describeGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupRequest> request = null;
        Response<DescribeGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupRequestMarshaller().marshall(describeGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeGroupResult, JsonUnmarshallerContext> unmarshaller = new DescribeGroupResultJsonUnmarshaller();
            JsonResponseHandler<DescribeGroupResult> responseHandler = new JsonResponseHandler<DescribeGroupResult>(
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
     * Describes an existing IAM policy assignment, as specified by the
     * assignment name.
     * </p>
     * 
     * @param describeIAMPolicyAssignmentRequest
     * @return describeIAMPolicyAssignmentResult The response from the
     *         DescribeIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeIAMPolicyAssignmentResult describeIAMPolicyAssignment(
            DescribeIAMPolicyAssignmentRequest describeIAMPolicyAssignmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIAMPolicyAssignmentRequest> request = null;
        Response<DescribeIAMPolicyAssignmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIAMPolicyAssignmentRequestMarshaller()
                        .marshall(describeIAMPolicyAssignmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeIAMPolicyAssignmentResult, JsonUnmarshallerContext> unmarshaller = new DescribeIAMPolicyAssignmentResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIAMPolicyAssignmentResult> responseHandler = new JsonResponseHandler<DescribeIAMPolicyAssignmentResult>(
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
     * Describes a SPICE ingestion.
     * </p>
     * 
     * @param describeIngestionRequest
     * @return describeIngestionResult The response from the DescribeIngestion
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeIngestionResult describeIngestion(
            DescribeIngestionRequest describeIngestionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeIngestionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIngestionRequest> request = null;
        Response<DescribeIngestionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIngestionRequestMarshaller()
                        .marshall(describeIngestionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeIngestionResult, JsonUnmarshallerContext> unmarshaller = new DescribeIngestionResultJsonUnmarshaller();
            JsonResponseHandler<DescribeIngestionResult> responseHandler = new JsonResponseHandler<DescribeIngestionResult>(
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
     * Describes a template's metadata.
     * </p>
     * 
     * @param describeTemplateRequest
     * @return describeTemplateResult The response from the DescribeTemplate
     *         service method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws AccessDeniedException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTemplateResult describeTemplate(DescribeTemplateRequest describeTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplateRequest> request = null;
        Response<DescribeTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplateRequestMarshaller().marshall(describeTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTemplateResult, JsonUnmarshallerContext> unmarshaller = new DescribeTemplateResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTemplateResult> responseHandler = new JsonResponseHandler<DescribeTemplateResult>(
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
     * Describes the template alias for a template.
     * </p>
     * 
     * @param describeTemplateAliasRequest
     * @return describeTemplateAliasResult The response from the
     *         DescribeTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTemplateAliasResult describeTemplateAlias(
            DescribeTemplateAliasRequest describeTemplateAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplateAliasRequest> request = null;
        Response<DescribeTemplateAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplateAliasRequestMarshaller()
                        .marshall(describeTemplateAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTemplateAliasResult, JsonUnmarshallerContext> unmarshaller = new DescribeTemplateAliasResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTemplateAliasResult> responseHandler = new JsonResponseHandler<DescribeTemplateAliasResult>(
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
     * Describes read and write permissions on a template.
     * </p>
     * 
     * @param describeTemplatePermissionsRequest
     * @return describeTemplatePermissionsResult The response from the
     *         DescribeTemplatePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTemplatePermissionsResult describeTemplatePermissions(
            DescribeTemplatePermissionsRequest describeTemplatePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTemplatePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTemplatePermissionsRequest> request = null;
        Response<DescribeTemplatePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTemplatePermissionsRequestMarshaller()
                        .marshall(describeTemplatePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTemplatePermissionsResult, JsonUnmarshallerContext> unmarshaller = new DescribeTemplatePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTemplatePermissionsResult> responseHandler = new JsonResponseHandler<DescribeTemplatePermissionsResult>(
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
     * Returns information about a user, given the user name.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestMarshaller().marshall(describeUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeUserResult, JsonUnmarshallerContext> unmarshaller = new DescribeUserResultJsonUnmarshaller();
            JsonResponseHandler<DescribeUserResult> responseHandler = new JsonResponseHandler<DescribeUserResult>(
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
     * Generates a URL and authorization code that you can embed in your web
     * server code. Before you use this command, make sure that you have
     * configured the dashboards and permissions.
     * </p>
     * <p>
     * Currently, you can use <code>GetDashboardEmbedURL</code> only from the
     * server, not from the user's browser. The following rules apply to the
     * combination of URL and authorization code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * They must be used together.
     * </p>
     * </li>
     * <li>
     * <p>
     * They can be used one time only.
     * </p>
     * </li>
     * <li>
     * <p>
     * They are valid for 5 minutes after you run this command.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resulting user session is valid for 10 hours.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/user/embedding-dashboards.html"
     * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight
     * User Guide</i> or <a href=
     * "https://docs.aws.amazon.com/quicksight/latest/APIReference/qs-dev-embedded-dashboards.html"
     * >Embedding Amazon QuickSight Dashboards</a> in the <i>Amazon QuickSight
     * API Reference</i>.
     * </p>
     * 
     * @param getDashboardEmbedUrlRequest
     * @return getDashboardEmbedUrlResult The response from the
     *         GetDashboardEmbedUrl service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws DomainNotWhitelistedException
     * @throws QuickSightUserNotFoundException
     * @throws IdentityTypeNotSupportedException
     * @throws SessionLifetimeInMinutesInvalidException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDashboardEmbedUrlResult getDashboardEmbedUrl(
            GetDashboardEmbedUrlRequest getDashboardEmbedUrlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDashboardEmbedUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDashboardEmbedUrlRequest> request = null;
        Response<GetDashboardEmbedUrlResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDashboardEmbedUrlRequestMarshaller()
                        .marshall(getDashboardEmbedUrlRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDashboardEmbedUrlResult, JsonUnmarshallerContext> unmarshaller = new GetDashboardEmbedUrlResultJsonUnmarshaller();
            JsonResponseHandler<GetDashboardEmbedUrlResult> responseHandler = new JsonResponseHandler<GetDashboardEmbedUrlResult>(
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
     * Lists all the versions of the dashboards in the QuickSight subscription.
     * </p>
     * 
     * @param listDashboardVersionsRequest
     * @return listDashboardVersionsResult The response from the
     *         ListDashboardVersions service method, as returned by Amazon
     *         QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDashboardVersionsResult listDashboardVersions(
            ListDashboardVersionsRequest listDashboardVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDashboardVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardVersionsRequest> request = null;
        Response<ListDashboardVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardVersionsRequestMarshaller()
                        .marshall(listDashboardVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDashboardVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListDashboardVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListDashboardVersionsResult> responseHandler = new JsonResponseHandler<ListDashboardVersionsResult>(
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
     * Lists dashboards in an AWS account.
     * </p>
     * 
     * @param listDashboardsRequest
     * @return listDashboardsResult The response from the ListDashboards service
     *         method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDashboardsRequest> request = null;
        Response<ListDashboardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDashboardsRequestMarshaller().marshall(listDashboardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDashboardsResult, JsonUnmarshallerContext> unmarshaller = new ListDashboardsResultJsonUnmarshaller();
            JsonResponseHandler<ListDashboardsResult> responseHandler = new JsonResponseHandler<ListDashboardsResult>(
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
     * Lists all of the datasets belonging to the current AWS account in an AWS
     * Region.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/*</code>.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return listDataSetsResult The response from the ListDataSets service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Lists data sources in current AWS Region that belong to this AWS account.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return listDataSourcesResult The response from the ListDataSources
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataSourcesRequest> request = null;
        Response<ListDataSourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataSourcesRequestMarshaller().marshall(listDataSourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDataSourcesResult, JsonUnmarshallerContext> unmarshaller = new ListDataSourcesResultJsonUnmarshaller();
            JsonResponseHandler<ListDataSourcesResult> responseHandler = new JsonResponseHandler<ListDataSourcesResult>(
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
     * Lists member users in a group.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return listGroupMembershipsResult The response from the
     *         ListGroupMemberships service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGroupMembershipsResult listGroupMemberships(
            ListGroupMembershipsRequest listGroupMembershipsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGroupMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembershipsRequest> request = null;
        Response<ListGroupMembershipsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembershipsRequestMarshaller()
                        .marshall(listGroupMembershipsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGroupMembershipsResult, JsonUnmarshallerContext> unmarshaller = new ListGroupMembershipsResultJsonUnmarshaller();
            JsonResponseHandler<ListGroupMembershipsResult> responseHandler = new JsonResponseHandler<ListGroupMembershipsResult>(
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
     * Lists all user groups in Amazon QuickSight.
     * </p>
     * 
     * @param listGroupsRequest
     * @return listGroupsResult The response from the ListGroups service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestMarshaller().marshall(listGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListGroupsResult> responseHandler = new JsonResponseHandler<ListGroupsResult>(
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
     * Lists IAM policy assignments in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsRequest
     * @return listIAMPolicyAssignmentsResult The response from the
     *         ListIAMPolicyAssignments service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListIAMPolicyAssignmentsResult listIAMPolicyAssignments(
            ListIAMPolicyAssignmentsRequest listIAMPolicyAssignmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIAMPolicyAssignmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIAMPolicyAssignmentsRequest> request = null;
        Response<ListIAMPolicyAssignmentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIAMPolicyAssignmentsRequestMarshaller()
                        .marshall(listIAMPolicyAssignmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIAMPolicyAssignmentsResult, JsonUnmarshallerContext> unmarshaller = new ListIAMPolicyAssignmentsResultJsonUnmarshaller();
            JsonResponseHandler<ListIAMPolicyAssignmentsResult> responseHandler = new JsonResponseHandler<ListIAMPolicyAssignmentsResult>(
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
     * Lists all the IAM policy assignments, including the Amazon Resource Names
     * (ARNs) for the IAM policies assigned to the specified user and group or
     * groups that the user belongs to.
     * </p>
     * 
     * @param listIAMPolicyAssignmentsForUserRequest
     * @return listIAMPolicyAssignmentsForUserResult The response from the
     *         ListIAMPolicyAssignmentsForUser service method, as returned by
     *         Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListIAMPolicyAssignmentsForUserResult listIAMPolicyAssignmentsForUser(
            ListIAMPolicyAssignmentsForUserRequest listIAMPolicyAssignmentsForUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIAMPolicyAssignmentsForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIAMPolicyAssignmentsForUserRequest> request = null;
        Response<ListIAMPolicyAssignmentsForUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIAMPolicyAssignmentsForUserRequestMarshaller()
                        .marshall(listIAMPolicyAssignmentsForUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIAMPolicyAssignmentsForUserResult, JsonUnmarshallerContext> unmarshaller = new ListIAMPolicyAssignmentsForUserResultJsonUnmarshaller();
            JsonResponseHandler<ListIAMPolicyAssignmentsForUserResult> responseHandler = new JsonResponseHandler<ListIAMPolicyAssignmentsForUserResult>(
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
     * Lists the history of SPICE ingestions for a dataset.
     * </p>
     * 
     * @param listIngestionsRequest
     * @return listIngestionsResult The response from the ListIngestions service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ResourceExistsException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListIngestionsResult listIngestions(ListIngestionsRequest listIngestionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listIngestionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIngestionsRequest> request = null;
        Response<ListIngestionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIngestionsRequestMarshaller().marshall(listIngestionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListIngestionsResult, JsonUnmarshallerContext> unmarshaller = new ListIngestionsResultJsonUnmarshaller();
            JsonResponseHandler<ListIngestionsResult> responseHandler = new JsonResponseHandler<ListIngestionsResult>(
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
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Lists all the aliases of a template.
     * </p>
     * 
     * @param listTemplateAliasesRequest
     * @return listTemplateAliasesResult The response from the
     *         ListTemplateAliases service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTemplateAliasesResult listTemplateAliases(
            ListTemplateAliasesRequest listTemplateAliasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTemplateAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateAliasesRequest> request = null;
        Response<ListTemplateAliasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateAliasesRequestMarshaller()
                        .marshall(listTemplateAliasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTemplateAliasesResult, JsonUnmarshallerContext> unmarshaller = new ListTemplateAliasesResultJsonUnmarshaller();
            JsonResponseHandler<ListTemplateAliasesResult> responseHandler = new JsonResponseHandler<ListTemplateAliasesResult>(
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
     * Lists all the versions of the templates in the current Amazon QuickSight
     * account.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return listTemplateVersionsResult The response from the
     *         ListTemplateVersions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTemplateVersionsResult listTemplateVersions(
            ListTemplateVersionsRequest listTemplateVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTemplateVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateVersionsRequest> request = null;
        Response<ListTemplateVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateVersionsRequestMarshaller()
                        .marshall(listTemplateVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTemplateVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListTemplateVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListTemplateVersionsResult> responseHandler = new JsonResponseHandler<ListTemplateVersionsResult>(
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
     * Lists all the templates in the current Amazon QuickSight account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return listTemplatesResult The response from the ListTemplates service
     *         method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InvalidNextTokenException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestMarshaller().marshall(listTemplatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTemplatesResult, JsonUnmarshallerContext> unmarshaller = new ListTemplatesResultJsonUnmarshaller();
            JsonResponseHandler<ListTemplatesResult> responseHandler = new JsonResponseHandler<ListTemplatesResult>(
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
     * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a
     * member of.
     * </p>
     * 
     * @param listUserGroupsRequest
     * @return listUserGroupsResult The response from the ListUserGroups service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUserGroupsResult listUserGroups(ListUserGroupsRequest listUserGroupsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUserGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserGroupsRequest> request = null;
        Response<ListUserGroupsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserGroupsRequestMarshaller().marshall(listUserGroupsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUserGroupsResult, JsonUnmarshallerContext> unmarshaller = new ListUserGroupsResultJsonUnmarshaller();
            JsonResponseHandler<ListUserGroupsResult> responseHandler = new JsonResponseHandler<ListUserGroupsResult>(
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
     * Returns a list of all of the Amazon QuickSight users belonging to this
     * account.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListUsersResult listUsers(ListUsersRequest listUsersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestMarshaller().marshall(listUsersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListUsersResult, JsonUnmarshallerContext> unmarshaller = new ListUsersResultJsonUnmarshaller();
            JsonResponseHandler<ListUsersResult> responseHandler = new JsonResponseHandler<ListUsersResult>(
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
     * Creates an Amazon QuickSight user, whose identity is associated with the
     * AWS Identity and Access Management (IAM) identity or role specified in
     * the request.
     * </p>
     * 
     * @param registerUserRequest
     * @return registerUserResult The response from the RegisterUser service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws ResourceExistsException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public RegisterUserResult registerUser(RegisterUserRequest registerUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(registerUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterUserRequest> request = null;
        Response<RegisterUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterUserRequestMarshaller().marshall(registerUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<RegisterUserResult, JsonUnmarshallerContext> unmarshaller = new RegisterUserResultJsonUnmarshaller();
            JsonResponseHandler<RegisterUserResult> responseHandler = new JsonResponseHandler<RegisterUserResult>(
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
     * Searchs for dashboards that belong to a user.
     * </p>
     * 
     * @param searchDashboardsRequest
     * @return searchDashboardsResult The response from the SearchDashboards
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws UnsupportedUserEditionException
     * @throws InvalidNextTokenException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchDashboardsResult searchDashboards(SearchDashboardsRequest searchDashboardsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchDashboardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDashboardsRequest> request = null;
        Response<SearchDashboardsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDashboardsRequestMarshaller().marshall(searchDashboardsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchDashboardsResult, JsonUnmarshallerContext> unmarshaller = new SearchDashboardsResultJsonUnmarshaller();
            JsonResponseHandler<SearchDashboardsResult> responseHandler = new JsonResponseHandler<SearchDashboardsResult>(
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
     * Assigns one or more tags (key-value pairs) to the specified QuickSight
     * resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values. You can use the
     * <code>TagResource</code> operation with a resource that already has tags.
     * If you specify a new tag key for the resource, this tag is appended to
     * the list of tags associated with the resource. If you specify a tag key
     * that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource. QuickSight supports
     * tagging on data set, data source, dashboard, and template.
     * </p>
     * <p>
     * Tagging for QuickSight works in a similar way to tagging for other AWS
     * services, except for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use tags to track AWS costs for QuickSight. This restriction is
     * because QuickSight costs are based on users and SPICE capacity, which
     * aren't taggable resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * QuickSight doesn't currently support the Tag Editor for AWS Resource
     * Groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon QuickSight.
     * @throws LimitExceededException
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
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
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
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
     * Updates a dashboard in an AWS account.
     * </p>
     * 
     * @param updateDashboardRequest
     * @return updateDashboardResult The response from the UpdateDashboard
     *         service method, as returned by Amazon QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDashboardResult updateDashboard(UpdateDashboardRequest updateDashboardRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDashboardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardRequest> request = null;
        Response<UpdateDashboardResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardRequestMarshaller().marshall(updateDashboardRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDashboardResult, JsonUnmarshallerContext> unmarshaller = new UpdateDashboardResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDashboardResult> responseHandler = new JsonResponseHandler<UpdateDashboardResult>(
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
     * Updates read and write permissions on a dashboard.
     * </p>
     * 
     * @param updateDashboardPermissionsRequest
     * @return updateDashboardPermissionsResult The response from the
     *         UpdateDashboardPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws ConflictException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDashboardPermissionsResult updateDashboardPermissions(
            UpdateDashboardPermissionsRequest updateDashboardPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDashboardPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardPermissionsRequest> request = null;
        Response<UpdateDashboardPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardPermissionsRequestMarshaller()
                        .marshall(updateDashboardPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDashboardPermissionsResult, JsonUnmarshallerContext> unmarshaller = new UpdateDashboardPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDashboardPermissionsResult> responseHandler = new JsonResponseHandler<UpdateDashboardPermissionsResult>(
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
     * Updates the published version of a dashboard.
     * </p>
     * 
     * @param updateDashboardPublishedVersionRequest
     * @return updateDashboardPublishedVersionResult The response from the
     *         UpdateDashboardPublishedVersion service method, as returned by
     *         Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDashboardPublishedVersionResult updateDashboardPublishedVersion(
            UpdateDashboardPublishedVersionRequest updateDashboardPublishedVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDashboardPublishedVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDashboardPublishedVersionRequest> request = null;
        Response<UpdateDashboardPublishedVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDashboardPublishedVersionRequestMarshaller()
                        .marshall(updateDashboardPublishedVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDashboardPublishedVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateDashboardPublishedVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDashboardPublishedVersionResult> responseHandler = new JsonResponseHandler<UpdateDashboardPublishedVersionResult>(
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
     * Updates a dataset.
     * </p>
     * 
     * @param updateDataSetRequest
     * @return updateDataSetResult The response from the UpdateDataSet service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Updates the permissions on a dataset.
     * </p>
     * <p>
     * The permissions resource is
     * <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>
     * .
     * </p>
     * 
     * @param updateDataSetPermissionsRequest
     * @return updateDataSetPermissionsResult The response from the
     *         UpdateDataSetPermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDataSetPermissionsResult updateDataSetPermissions(
            UpdateDataSetPermissionsRequest updateDataSetPermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataSetPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSetPermissionsRequest> request = null;
        Response<UpdateDataSetPermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSetPermissionsRequestMarshaller()
                        .marshall(updateDataSetPermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataSetPermissionsResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataSetPermissionsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataSetPermissionsResult> responseHandler = new JsonResponseHandler<UpdateDataSetPermissionsResult>(
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
     * Updates a data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return updateDataSourceResult The response from the UpdateDataSource
     *         service method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestMarshaller().marshall(updateDataSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataSourceResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataSourceResult> responseHandler = new JsonResponseHandler<UpdateDataSourceResult>(
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
     * Updates the permissions to a data source.
     * </p>
     * 
     * @param updateDataSourcePermissionsRequest
     * @return updateDataSourcePermissionsResult The response from the
     *         UpdateDataSourcePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDataSourcePermissionsResult updateDataSourcePermissions(
            UpdateDataSourcePermissionsRequest updateDataSourcePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDataSourcePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourcePermissionsRequest> request = null;
        Response<UpdateDataSourcePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourcePermissionsRequestMarshaller()
                        .marshall(updateDataSourcePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDataSourcePermissionsResult, JsonUnmarshallerContext> unmarshaller = new UpdateDataSourcePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataSourcePermissionsResult> responseHandler = new JsonResponseHandler<UpdateDataSourcePermissionsResult>(
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
     * Changes a group description.
     * </p>
     * 
     * @param updateGroupRequest
     * @return updateGroupResult The response from the UpdateGroup service
     *         method, as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws PreconditionNotMetException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestMarshaller().marshall(updateGroupRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGroupResult, JsonUnmarshallerContext> unmarshaller = new UpdateGroupResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGroupResult> responseHandler = new JsonResponseHandler<UpdateGroupResult>(
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
     * Updates an existing IAM policy assignment. This operation updates only
     * the optional parameter or parameters that are specified in the request.
     * </p>
     * 
     * @param updateIAMPolicyAssignmentRequest
     * @return updateIAMPolicyAssignmentResult The response from the
     *         UpdateIAMPolicyAssignment service method, as returned by Amazon
     *         QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConcurrentUpdatingException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateIAMPolicyAssignmentResult updateIAMPolicyAssignment(
            UpdateIAMPolicyAssignmentRequest updateIAMPolicyAssignmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIAMPolicyAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIAMPolicyAssignmentRequest> request = null;
        Response<UpdateIAMPolicyAssignmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIAMPolicyAssignmentRequestMarshaller()
                        .marshall(updateIAMPolicyAssignmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIAMPolicyAssignmentResult, JsonUnmarshallerContext> unmarshaller = new UpdateIAMPolicyAssignmentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIAMPolicyAssignmentResult> responseHandler = new JsonResponseHandler<UpdateIAMPolicyAssignmentResult>(
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
     * Updates a template from an existing Amazon QuickSight analysis or another
     * template.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return updateTemplateResult The response from the UpdateTemplate service
     *         method, as returned by Amazon QuickSight.
     * @throws InvalidParameterValueException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateRequest> request = null;
        Response<UpdateTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateRequestMarshaller().marshall(updateTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTemplateResult, JsonUnmarshallerContext> unmarshaller = new UpdateTemplateResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTemplateResult> responseHandler = new JsonResponseHandler<UpdateTemplateResult>(
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
     * Updates the template alias of a template.
     * </p>
     * 
     * @param updateTemplateAliasRequest
     * @return updateTemplateAliasResult The response from the
     *         UpdateTemplateAlias service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateTemplateAliasResult updateTemplateAlias(
            UpdateTemplateAliasRequest updateTemplateAliasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTemplateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateAliasRequest> request = null;
        Response<UpdateTemplateAliasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateAliasRequestMarshaller()
                        .marshall(updateTemplateAliasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTemplateAliasResult, JsonUnmarshallerContext> unmarshaller = new UpdateTemplateAliasResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTemplateAliasResult> responseHandler = new JsonResponseHandler<UpdateTemplateAliasResult>(
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
     * Updates the resource permissions for a template.
     * </p>
     * 
     * @param updateTemplatePermissionsRequest
     * @return updateTemplatePermissionsResult The response from the
     *         UpdateTemplatePermissions service method, as returned by Amazon
     *         QuickSight.
     * @throws ThrottlingException
     * @throws InvalidParameterValueException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws UnsupportedUserEditionException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateTemplatePermissionsResult updateTemplatePermissions(
            UpdateTemplatePermissionsRequest updateTemplatePermissionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateTemplatePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplatePermissionsRequest> request = null;
        Response<UpdateTemplatePermissionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplatePermissionsRequestMarshaller()
                        .marshall(updateTemplatePermissionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTemplatePermissionsResult, JsonUnmarshallerContext> unmarshaller = new UpdateTemplatePermissionsResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTemplatePermissionsResult> responseHandler = new JsonResponseHandler<UpdateTemplatePermissionsResult>(
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
     * Updates an Amazon QuickSight user.
     * </p>
     * 
     * @param updateUserRequest
     * @return updateUserResult The response from the UpdateUser service method,
     *         as returned by Amazon QuickSight.
     * @throws AccessDeniedException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QuickSight indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateUserResult updateUser(UpdateUserRequest updateUserRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestMarshaller().marshall(updateUserRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUserResult, JsonUnmarshallerContext> unmarshaller = new UpdateUserResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUserResult> responseHandler = new JsonResponseHandler<UpdateUserResult>(
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
