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

package com.amazonaws.services.amplify;

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

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.services.amplify.model.transform.*;

/**
 * Client for accessing AWS Amplify. All service calls made using this client
 * are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Welcome to the AWS Amplify API documentation. This reference provides
 * descriptions of the actions and data types for the Amplify API.
 * </p>
 * <p>
 * Amplify enables developers to develop and deploy cloud-powered mobile and web
 * apps. The Amplify Console provides a continuous delivery and hosting service
 * for web applications. For more information, see the <a
 * href="https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html"
 * >Amplify Console User Guide</a>. The Amplify Framework is a comprehensive set
 * of SDKs, libraries, tools, and documentation for client app development. For
 * more information, see the <a
 * href="https://aws-amplify.github.io/docs/">Amplify Framework.</a>
 * </p>
 */
public class AWSAmplifyClient extends AmazonWebServiceClient implements AWSAmplify {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AWS Amplify exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AWSAmplify. A
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
    public AWSAmplifyClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify. A
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
     *            how this client connects to AWSAmplify (ex: proxy settings,
     *            retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AWSAmplifyClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *         AWSAmplifyClient client = new AWSAmplifyClient(AWSMobileClient.getInstance());
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
    public AWSAmplifyClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *         AWSAmplifyClient client = new AWSAmplifyClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSAmplify (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSAmplifyClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *         AWSAmplifyClient client = new AWSAmplifyClient(AWSMobileClient.getInstance());
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
    public AWSAmplifyClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *         AWSAmplifyClient client = new AWSAmplifyClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSAmplify (ex: proxy settings,
     *            retry counts, etc.).
     */
    public AWSAmplifyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *            how this client connects to AWSAmplify (ex: proxy settings,
     *            retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AWSAmplifyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWSAmplify using the
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
     *         AWSAmplifyClient client = new AWSAmplifyClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AWSAmplify (ex: proxy settings,
     *            retry counts, etc.).
     * @param httpClient A http client
     */
    public AWSAmplifyClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new DependentServiceFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalFailureExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("amplify.us-east-1.amazonaws.com");
        this.endpointPrefix = "amplify";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amplify/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amplify/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a new Amplify app.
     * </p>
     * 
     * @param createAppRequest <p>
     *            The request structure used to create apps in Amplify.
     *            </p>
     * @return createAppResult The response from the CreateApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * <p>
     * Creates a new backend environment for an Amplify app.
     * </p>
     * 
     * @param createBackendEnvironmentRequest <p>
     *            The request structure for the backend environment create
     *            request.
     *            </p>
     * @return createBackendEnvironmentResult The response from the
     *         CreateBackendEnvironment service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBackendEnvironmentResult createBackendEnvironment(
            CreateBackendEnvironmentRequest createBackendEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackendEnvironmentRequest> request = null;
        Response<CreateBackendEnvironmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackendEnvironmentRequestMarshaller()
                        .marshall(createBackendEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBackendEnvironmentResult, JsonUnmarshallerContext> unmarshaller = new CreateBackendEnvironmentResultJsonUnmarshaller();
            JsonResponseHandler<CreateBackendEnvironmentResult> responseHandler = new JsonResponseHandler<CreateBackendEnvironmentResult>(
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
     * Creates a new branch for an Amplify app.
     * </p>
     * 
     * @param createBranchRequest <p>
     *            The request structure for the create branch request.
     *            </p>
     * @return createBranchResult The response from the CreateBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBranchResult createBranch(CreateBranchRequest createBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<CreateBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestMarshaller().marshall(createBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBranchResult, JsonUnmarshallerContext> unmarshaller = new CreateBranchResultJsonUnmarshaller();
            JsonResponseHandler<CreateBranchResult> responseHandler = new JsonResponseHandler<CreateBranchResult>(
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
     * Creates a deployment for a manually deployed Amplify app. Manually
     * deployed apps are not connected to a repository.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            The request structure for the create a new deployment request.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestMarshaller().marshall(createDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDeploymentResult, JsonUnmarshallerContext> unmarshaller = new CreateDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<CreateDeploymentResult> responseHandler = new JsonResponseHandler<CreateDeploymentResult>(
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
     * Creates a new domain association for an Amplify app. This action
     * associates a custom domain with the Amplify app
     * </p>
     * 
     * @param createDomainAssociationRequest <p>
     *            The request structure for the create domain association
     *            request.
     *            </p>
     * @return createDomainAssociationResult The response from the
     *         CreateDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDomainAssociationResult createDomainAssociation(
            CreateDomainAssociationRequest createDomainAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainAssociationRequest> request = null;
        Response<CreateDomainAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainAssociationRequestMarshaller()
                        .marshall(createDomainAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainAssociationResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainAssociationResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainAssociationResult> responseHandler = new JsonResponseHandler<CreateDomainAssociationResult>(
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
     * Creates a new webhook on an Amplify app.
     * </p>
     * 
     * @param createWebhookRequest <p>
     *            The request structure for the create webhook request.
     *            </p>
     * @return createWebhookResult The response from the CreateWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateWebhookResult createWebhook(CreateWebhookRequest createWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebhookRequest> request = null;
        Response<CreateWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebhookRequestMarshaller().marshall(createWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateWebhookResult, JsonUnmarshallerContext> unmarshaller = new CreateWebhookResultJsonUnmarshaller();
            JsonResponseHandler<CreateWebhookResult> responseHandler = new JsonResponseHandler<CreateWebhookResult>(
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
     * Deletes an existing Amplify app specified by an app ID.
     * </p>
     * 
     * @param deleteAppRequest <p>
     *            Describes the request structure for the delete app request.
     *            </p>
     * @return deleteAppResult The response from the DeleteApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * <p>
     * Deletes a backend environment for an Amplify app.
     * </p>
     * 
     * @param deleteBackendEnvironmentRequest <p>
     *            The request structure for the delete backend environment
     *            request.
     *            </p>
     * @return deleteBackendEnvironmentResult The response from the
     *         DeleteBackendEnvironment service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteBackendEnvironmentResult deleteBackendEnvironment(
            DeleteBackendEnvironmentRequest deleteBackendEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackendEnvironmentRequest> request = null;
        Response<DeleteBackendEnvironmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackendEnvironmentRequestMarshaller()
                        .marshall(deleteBackendEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBackendEnvironmentResult, JsonUnmarshallerContext> unmarshaller = new DeleteBackendEnvironmentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBackendEnvironmentResult> responseHandler = new JsonResponseHandler<DeleteBackendEnvironmentResult>(
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
     * Deletes a branch for an Amplify app.
     * </p>
     * 
     * @param deleteBranchRequest <p>
     *            The request structure for the delete branch request.
     *            </p>
     * @return deleteBranchResult The response from the DeleteBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteBranchResult deleteBranch(DeleteBranchRequest deleteBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBranchRequest> request = null;
        Response<DeleteBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBranchRequestMarshaller().marshall(deleteBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteBranchResult, JsonUnmarshallerContext> unmarshaller = new DeleteBranchResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBranchResult> responseHandler = new JsonResponseHandler<DeleteBranchResult>(
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
     * Deletes a domain association for an Amplify app.
     * </p>
     * 
     * @param deleteDomainAssociationRequest <p>
     *            The request structure for the delete domain association
     *            request.
     *            </p>
     * @return deleteDomainAssociationResult The response from the
     *         DeleteDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDomainAssociationResult deleteDomainAssociation(
            DeleteDomainAssociationRequest deleteDomainAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainAssociationRequest> request = null;
        Response<DeleteDomainAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainAssociationRequestMarshaller()
                        .marshall(deleteDomainAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDomainAssociationResult, JsonUnmarshallerContext> unmarshaller = new DeleteDomainAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDomainAssociationResult> responseHandler = new JsonResponseHandler<DeleteDomainAssociationResult>(
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
     * Deletes a job for a branch of an Amplify app.
     * </p>
     * 
     * @param deleteJobRequest <p>
     *            The request structure for the delete job request.
     *            </p>
     * @return deleteJobResult The response from the DeleteJob service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Deletes a webhook.
     * </p>
     * 
     * @param deleteWebhookRequest <p>
     *            The request structure for the delete webhook request.
     *            </p>
     * @return deleteWebhookResult The response from the DeleteWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteWebhookResult deleteWebhook(DeleteWebhookRequest deleteWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWebhookRequest> request = null;
        Response<DeleteWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWebhookRequestMarshaller().marshall(deleteWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteWebhookResult, JsonUnmarshallerContext> unmarshaller = new DeleteWebhookResultJsonUnmarshaller();
            JsonResponseHandler<DeleteWebhookResult> responseHandler = new JsonResponseHandler<DeleteWebhookResult>(
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
     * Returns the website access logs for a specific time range using a
     * presigned URL.
     * </p>
     * 
     * @param generateAccessLogsRequest <p>
     *            The request structure for the generate access logs request.
     *            </p>
     * @return generateAccessLogsResult The response from the GenerateAccessLogs
     *         service method, as returned by AWS Amplify.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GenerateAccessLogsResult generateAccessLogs(
            GenerateAccessLogsRequest generateAccessLogsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(generateAccessLogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateAccessLogsRequest> request = null;
        Response<GenerateAccessLogsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateAccessLogsRequestMarshaller()
                        .marshall(generateAccessLogsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateAccessLogsResult, JsonUnmarshallerContext> unmarshaller = new GenerateAccessLogsResultJsonUnmarshaller();
            JsonResponseHandler<GenerateAccessLogsResult> responseHandler = new JsonResponseHandler<GenerateAccessLogsResult>(
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
     * Returns an existing Amplify app by appID.
     * </p>
     * 
     * @param getAppRequest <p>
     *            The request structure for the get app request.
     *            </p>
     * @return getAppResult The response from the GetApp service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * <p>
     * Returns the artifact info that corresponds to an artifact id.
     * </p>
     * 
     * @param getArtifactUrlRequest <p>
     *            Returns the request structure for the get artifact request.
     *            </p>
     * @return getArtifactUrlResult The response from the GetArtifactUrl service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetArtifactUrlResult getArtifactUrl(GetArtifactUrlRequest getArtifactUrlRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getArtifactUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArtifactUrlRequest> request = null;
        Response<GetArtifactUrlResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArtifactUrlRequestMarshaller().marshall(getArtifactUrlRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetArtifactUrlResult, JsonUnmarshallerContext> unmarshaller = new GetArtifactUrlResultJsonUnmarshaller();
            JsonResponseHandler<GetArtifactUrlResult> responseHandler = new JsonResponseHandler<GetArtifactUrlResult>(
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
     * Returns a backend environment for an Amplify app.
     * </p>
     * 
     * @param getBackendEnvironmentRequest <p>
     *            The request structure for the get backend environment request.
     *            </p>
     * @return getBackendEnvironmentResult The response from the
     *         GetBackendEnvironment service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBackendEnvironmentResult getBackendEnvironment(
            GetBackendEnvironmentRequest getBackendEnvironmentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBackendEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBackendEnvironmentRequest> request = null;
        Response<GetBackendEnvironmentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBackendEnvironmentRequestMarshaller()
                        .marshall(getBackendEnvironmentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBackendEnvironmentResult, JsonUnmarshallerContext> unmarshaller = new GetBackendEnvironmentResultJsonUnmarshaller();
            JsonResponseHandler<GetBackendEnvironmentResult> responseHandler = new JsonResponseHandler<GetBackendEnvironmentResult>(
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
     * Returns a branch for an Amplify app.
     * </p>
     * 
     * @param getBranchRequest <p>
     *            The request structure for the get branch request.
     *            </p>
     * @return getBranchResult The response from the GetBranch service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBranchResult getBranch(GetBranchRequest getBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestMarshaller().marshall(getBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBranchResult, JsonUnmarshallerContext> unmarshaller = new GetBranchResultJsonUnmarshaller();
            JsonResponseHandler<GetBranchResult> responseHandler = new JsonResponseHandler<GetBranchResult>(
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
     * Returns the domain information for an Amplify app.
     * </p>
     * 
     * @param getDomainAssociationRequest <p>
     *            The request structure for the get domain association request.
     *            </p>
     * @return getDomainAssociationResult The response from the
     *         GetDomainAssociation service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDomainAssociationResult getDomainAssociation(
            GetDomainAssociationRequest getDomainAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainAssociationRequest> request = null;
        Response<GetDomainAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainAssociationRequestMarshaller()
                        .marshall(getDomainAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainAssociationResult, JsonUnmarshallerContext> unmarshaller = new GetDomainAssociationResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainAssociationResult> responseHandler = new JsonResponseHandler<GetDomainAssociationResult>(
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
     * Returns a job for a branch of an Amplify app.
     * </p>
     * 
     * @param getJobRequest <p>
     *            The request structure for the get job request.
     *            </p>
     * @return getJobResult The response from the GetJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Returns the webhook information that corresponds to a specified webhook
     * ID.
     * </p>
     * 
     * @param getWebhookRequest <p>
     *            The request structure for the get webhook request.
     *            </p>
     * @return getWebhookResult The response from the GetWebhook service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetWebhookResult getWebhook(GetWebhookRequest getWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWebhookRequest> request = null;
        Response<GetWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWebhookRequestMarshaller().marshall(getWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetWebhookResult, JsonUnmarshallerContext> unmarshaller = new GetWebhookResultJsonUnmarshaller();
            JsonResponseHandler<GetWebhookResult> responseHandler = new JsonResponseHandler<GetWebhookResult>(
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
     * Returns a list of the existing Amplify apps.
     * </p>
     * 
     * @param listAppsRequest <p>
     *            The request structure for the list apps request.
     *            </p>
     * @return listAppsResult The response from the ListApps service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListAppsResult listApps(ListAppsRequest listAppsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestMarshaller().marshall(listAppsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListAppsResult, JsonUnmarshallerContext> unmarshaller = new ListAppsResultJsonUnmarshaller();
            JsonResponseHandler<ListAppsResult> responseHandler = new JsonResponseHandler<ListAppsResult>(
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
     * Returns a list of artifacts for a specified app, branch, and job.
     * </p>
     * 
     * @param listArtifactsRequest <p>
     *            Describes the request structure for the list artifacts
     *            request.
     *            </p>
     * @return listArtifactsResult The response from the ListArtifacts service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListArtifactsResult listArtifacts(ListArtifactsRequest listArtifactsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArtifactsRequest> request = null;
        Response<ListArtifactsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArtifactsRequestMarshaller().marshall(listArtifactsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListArtifactsResult, JsonUnmarshallerContext> unmarshaller = new ListArtifactsResultJsonUnmarshaller();
            JsonResponseHandler<ListArtifactsResult> responseHandler = new JsonResponseHandler<ListArtifactsResult>(
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
     * Lists the backend environments for an Amplify app.
     * </p>
     * 
     * @param listBackendEnvironmentsRequest <p>
     *            The request structure for the list backend environments
     *            request.
     *            </p>
     * @return listBackendEnvironmentsResult The response from the
     *         ListBackendEnvironments service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBackendEnvironmentsResult listBackendEnvironments(
            ListBackendEnvironmentsRequest listBackendEnvironmentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBackendEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackendEnvironmentsRequest> request = null;
        Response<ListBackendEnvironmentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackendEnvironmentsRequestMarshaller()
                        .marshall(listBackendEnvironmentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBackendEnvironmentsResult, JsonUnmarshallerContext> unmarshaller = new ListBackendEnvironmentsResultJsonUnmarshaller();
            JsonResponseHandler<ListBackendEnvironmentsResult> responseHandler = new JsonResponseHandler<ListBackendEnvironmentsResult>(
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
     * Lists the branches of an Amplify app.
     * </p>
     * 
     * @param listBranchesRequest <p>
     *            The request structure for the list branches request.
     *            </p>
     * @return listBranchesResult The response from the ListBranches service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListBranchesResult listBranches(ListBranchesRequest listBranchesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestMarshaller().marshall(listBranchesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListBranchesResult, JsonUnmarshallerContext> unmarshaller = new ListBranchesResultJsonUnmarshaller();
            JsonResponseHandler<ListBranchesResult> responseHandler = new JsonResponseHandler<ListBranchesResult>(
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
     * Returns the domain associations for an Amplify app.
     * </p>
     * 
     * @param listDomainAssociationsRequest <p>
     *            The request structure for the list domain associations
     *            request.
     *            </p>
     * @return listDomainAssociationsResult The response from the
     *         ListDomainAssociations service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDomainAssociationsResult listDomainAssociations(
            ListDomainAssociationsRequest listDomainAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDomainAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainAssociationsRequest> request = null;
        Response<ListDomainAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainAssociationsRequestMarshaller()
                        .marshall(listDomainAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDomainAssociationsResult, JsonUnmarshallerContext> unmarshaller = new ListDomainAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<ListDomainAssociationsResult> responseHandler = new JsonResponseHandler<ListDomainAssociationsResult>(
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
     * Lists the jobs for a branch of an Amplify app.
     * </p>
     * 
     * @param listJobsRequest <p>
     *            The request structure for the list jobs request.
     *            </p>
     * @return listJobsResult The response from the ListJobs service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Returns a list of tags for a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            The request structure to use to list tags for a resource.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Returns a list of webhooks for an Amplify app.
     * </p>
     * 
     * @param listWebhooksRequest <p>
     *            The request structure for the list webhooks request.
     *            </p>
     * @return listWebhooksResult The response from the ListWebhooks service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListWebhooksResult listWebhooks(ListWebhooksRequest listWebhooksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listWebhooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebhooksRequest> request = null;
        Response<ListWebhooksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebhooksRequestMarshaller().marshall(listWebhooksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListWebhooksResult, JsonUnmarshallerContext> unmarshaller = new ListWebhooksResultJsonUnmarshaller();
            JsonResponseHandler<ListWebhooksResult> responseHandler = new JsonResponseHandler<ListWebhooksResult>(
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
     * Starts a deployment for a manually deployed app. Manually deployed apps
     * are not connected to a repository.
     * </p>
     * 
     * @param startDeploymentRequest <p>
     *            The request structure for the start a deployment request.
     *            </p>
     * @return startDeploymentResult The response from the StartDeployment
     *         service method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeploymentRequest> request = null;
        Response<StartDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeploymentRequestMarshaller().marshall(startDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartDeploymentResult, JsonUnmarshallerContext> unmarshaller = new StartDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<StartDeploymentResult> responseHandler = new JsonResponseHandler<StartDeploymentResult>(
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
     * Starts a new job for a branch of an Amplify app.
     * </p>
     * 
     * @param startJobRequest <p>
     *            The request structure for the start job request.
     *            </p>
     * @return startJobResult The response from the StartJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Stops a job that is in progress for a branch of an Amplify app.
     * </p>
     * 
     * @param stopJobRequest <p>
     *            The request structure for the stop job request.
     *            </p>
     * @return stopJobResult The response from the StopJob service method, as
     *         returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopJobResult stopJob(StopJobRequest stopJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopJobRequest> request = null;
        Response<StopJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopJobRequestMarshaller().marshall(stopJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopJobResult, JsonUnmarshallerContext> unmarshaller = new StopJobResultJsonUnmarshaller();
            JsonResponseHandler<StopJobResult> responseHandler = new JsonResponseHandler<StopJobResult>(
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
     * Tags the resource with a tag key and value.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            The request structure to tag a resource with a tag key and
     *            value.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Untags a resource with a specified Amazon Resource Name (ARN).
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            The request structure for the untag resource request.
     *            </p>
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by AWS Amplify.
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
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
     * Updates an existing Amplify app.
     * </p>
     * 
     * @param updateAppRequest <p>
     *            The request structure for the update app request.
     *            </p>
     * @return updateAppResult The response from the UpdateApp service method,
     *         as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws UnauthorizedException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAppResult updateApp(UpdateAppRequest updateAppRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<UpdateAppResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestMarshaller().marshall(updateAppRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAppResult, JsonUnmarshallerContext> unmarshaller = new UpdateAppResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAppResult> responseHandler = new JsonResponseHandler<UpdateAppResult>(
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
     * Updates a branch for an Amplify app.
     * </p>
     * 
     * @param updateBranchRequest <p>
     *            The request structure for the update branch request.
     *            </p>
     * @return updateBranchResult The response from the UpdateBranch service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateBranchResult updateBranch(UpdateBranchRequest updateBranchRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBranchRequest> request = null;
        Response<UpdateBranchResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBranchRequestMarshaller().marshall(updateBranchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBranchResult, JsonUnmarshallerContext> unmarshaller = new UpdateBranchResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBranchResult> responseHandler = new JsonResponseHandler<UpdateBranchResult>(
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
     * Creates a new domain association for an Amplify app.
     * </p>
     * 
     * @param updateDomainAssociationRequest <p>
     *            The request structure for the update domain association
     *            request.
     *            </p>
     * @return updateDomainAssociationResult The response from the
     *         UpdateDomainAssociation service method, as returned by AWS
     *         Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDomainAssociationResult updateDomainAssociation(
            UpdateDomainAssociationRequest updateDomainAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainAssociationRequest> request = null;
        Response<UpdateDomainAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainAssociationRequestMarshaller()
                        .marshall(updateDomainAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainAssociationResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainAssociationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainAssociationResult> responseHandler = new JsonResponseHandler<UpdateDomainAssociationResult>(
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
     * Updates a webhook.
     * </p>
     * 
     * @param updateWebhookRequest <p>
     *            The request structure for the update webhook request.
     *            </p>
     * @return updateWebhookResult The response from the UpdateWebhook service
     *         method, as returned by AWS Amplify.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws DependentServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Amplify indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateWebhookResult updateWebhook(UpdateWebhookRequest updateWebhookRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateWebhookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWebhookRequest> request = null;
        Response<UpdateWebhookResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWebhookRequestMarshaller().marshall(updateWebhookRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateWebhookResult, JsonUnmarshallerContext> unmarshaller = new UpdateWebhookResultJsonUnmarshaller();
            JsonResponseHandler<UpdateWebhookResult> responseHandler = new JsonResponseHandler<UpdateWebhookResult>(
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
