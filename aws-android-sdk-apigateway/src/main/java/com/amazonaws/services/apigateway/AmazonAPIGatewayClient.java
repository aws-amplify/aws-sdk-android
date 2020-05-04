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

package com.amazonaws.services.apigateway;

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

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.services.apigateway.model.transform.*;

/**
 * Client for accessing Amazon API Gateway. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon API Gateway</fullname>
 * <p>
 * Amazon API Gateway helps developers deliver robust, secure, and scalable
 * mobile and web application back ends. API Gateway allows developers to
 * securely connect mobile and web applications to APIs that run on AWS Lambda,
 * Amazon EC2, or other publicly addressable web services that are hosted
 * outside of AWS.
 * </p>
 */
public class AmazonAPIGatewayClient extends AmazonWebServiceClient implements AmazonAPIGateway {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon API Gateway exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway. A
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
    public AmazonAPIGatewayClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway. A
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
     *            how this client connects to AmazonAPIGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonAPIGatewayClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *         AmazonAPIGatewayClient client = new AmazonAPIGatewayClient(AWSMobileClient.getInstance());
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
    public AmazonAPIGatewayClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *         AmazonAPIGatewayClient client = new AmazonAPIGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAPIGateway (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonAPIGatewayClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *         AmazonAPIGatewayClient client = new AmazonAPIGatewayClient(AWSMobileClient.getInstance());
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
    public AmazonAPIGatewayClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *         AmazonAPIGatewayClient client = new AmazonAPIGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAPIGateway (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonAPIGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *            how this client connects to AmazonAPIGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonAPIGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonAPIGateway
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
     *         AmazonAPIGatewayClient client = new AmazonAPIGatewayClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonAPIGateway (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonAPIGatewayClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("apigateway.us-east-1.amazonaws.com");
        this.endpointPrefix = "apigateway";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/apigateway/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/apigateway/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Create an <a>ApiKey</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-api-key.html"
     * >AWS CLI</a></div>
     * 
     * @param createApiKeyRequest <p>
     *            Request to create an <a>ApiKey</a> resource.
     *            </p>
     * @return createApiKeyResult The response from the CreateApiKey service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateApiKeyResult createApiKey(CreateApiKeyRequest createApiKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiKeyRequest> request = null;
        Response<CreateApiKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiKeyRequestMarshaller().marshall(createApiKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApiKeyResult, JsonUnmarshallerContext> unmarshaller = new CreateApiKeyResultJsonUnmarshaller();
            JsonResponseHandler<CreateApiKeyResult> responseHandler = new JsonResponseHandler<CreateApiKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds a new <a>Authorizer</a> resource to an existing <a>RestApi</a>
     * resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/create-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param createAuthorizerRequest <p>
     *            Request to add a new <a>Authorizer</a> to an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return createAuthorizerResult The response from the CreateAuthorizer
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateAuthorizerResult createAuthorizer(CreateAuthorizerRequest createAuthorizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAuthorizerRequest> request = null;
        Response<CreateAuthorizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAuthorizerRequestMarshaller().marshall(createAuthorizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateAuthorizerResult, JsonUnmarshallerContext> unmarshaller = new CreateAuthorizerResultJsonUnmarshaller();
            JsonResponseHandler<CreateAuthorizerResult> responseHandler = new JsonResponseHandler<CreateAuthorizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param createBasePathMappingRequest <p>
     *            Requests API Gateway to create a new <a>BasePathMapping</a>
     *            resource.
     *            </p>
     * @return createBasePathMappingResult The response from the
     *         CreateBasePathMapping service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateBasePathMappingResult createBasePathMapping(
            CreateBasePathMappingRequest createBasePathMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBasePathMappingRequest> request = null;
        Response<CreateBasePathMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBasePathMappingRequestMarshaller()
                        .marshall(createBasePathMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateBasePathMappingResult, JsonUnmarshallerContext> unmarshaller = new CreateBasePathMappingResultJsonUnmarshaller();
            JsonResponseHandler<CreateBasePathMappingResult> responseHandler = new JsonResponseHandler<CreateBasePathMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <a>Deployment</a> resource, which makes a specified
     * <a>RestApi</a> callable over the internet.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Requests API Gateway to create a <a>Deployment</a> resource.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
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
     * @param createDocumentationPartRequest <p>
     *            Creates a new documentation part of a given API.
     *            </p>
     * @return createDocumentationPartResult The response from the
     *         CreateDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDocumentationPartResult createDocumentationPart(
            CreateDocumentationPartRequest createDocumentationPartRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentationPartRequest> request = null;
        Response<CreateDocumentationPartResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentationPartRequestMarshaller()
                        .marshall(createDocumentationPartRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDocumentationPartResult, JsonUnmarshallerContext> unmarshaller = new CreateDocumentationPartResultJsonUnmarshaller();
            JsonResponseHandler<CreateDocumentationPartResult> responseHandler = new JsonResponseHandler<CreateDocumentationPartResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param createDocumentationVersionRequest <p>
     *            Creates a new documentation version of a given API.
     *            </p>
     * @return createDocumentationVersionResult The response from the
     *         CreateDocumentationVersion service method, as returned by Amazon
     *         API Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDocumentationVersionResult createDocumentationVersion(
            CreateDocumentationVersionRequest createDocumentationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentationVersionRequest> request = null;
        Response<CreateDocumentationVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentationVersionRequestMarshaller()
                        .marshall(createDocumentationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDocumentationVersionResult, JsonUnmarshallerContext> unmarshaller = new CreateDocumentationVersionResultJsonUnmarshaller();
            JsonResponseHandler<CreateDocumentationVersionResult> responseHandler = new JsonResponseHandler<CreateDocumentationVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new domain name.
     * </p>
     * 
     * @param createDomainNameRequest <p>
     *            A request to create a new domain name.
     *            </p>
     * @return createDomainNameResult The response from the CreateDomainName
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDomainNameResult createDomainName(CreateDomainNameRequest createDomainNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainNameRequest> request = null;
        Response<CreateDomainNameResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainNameRequestMarshaller().marshall(createDomainNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDomainNameResult, JsonUnmarshallerContext> unmarshaller = new CreateDomainNameResultJsonUnmarshaller();
            JsonResponseHandler<CreateDomainNameResult> responseHandler = new JsonResponseHandler<CreateDomainNameResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
     * </p>
     * 
     * @param createModelRequest <p>
     *            Request to add a new <a>Model</a> to an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateModelResult createModel(CreateModelRequest createModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateModelRequest> request = null;
        Response<CreateModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateModelRequestMarshaller().marshall(createModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateModelResult, JsonUnmarshallerContext> unmarshaller = new CreateModelResultJsonUnmarshaller();
            JsonResponseHandler<CreateModelResult> responseHandler = new JsonResponseHandler<CreateModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param createRequestValidatorRequest <p>
     *            Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return createRequestValidatorResult The response from the
     *         CreateRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRequestValidatorResult createRequestValidator(
            CreateRequestValidatorRequest createRequestValidatorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRequestValidatorRequest> request = null;
        Response<CreateRequestValidatorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRequestValidatorRequestMarshaller()
                        .marshall(createRequestValidatorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRequestValidatorResult, JsonUnmarshallerContext> unmarshaller = new CreateRequestValidatorResultJsonUnmarshaller();
            JsonResponseHandler<CreateRequestValidatorResult> responseHandler = new JsonResponseHandler<CreateRequestValidatorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <a>Resource</a> resource.
     * </p>
     * 
     * @param createResourceRequest <p>
     *            Requests API Gateway to create a <a>Resource</a> resource.
     *            </p>
     * @return createResourceResult The response from the CreateResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateResourceResult createResource(CreateResourceRequest createResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceRequest> request = null;
        Response<CreateResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceRequestMarshaller().marshall(createResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateResourceResult, JsonUnmarshallerContext> unmarshaller = new CreateResourceResultJsonUnmarshaller();
            JsonResponseHandler<CreateResourceResult> responseHandler = new JsonResponseHandler<CreateResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new <a>RestApi</a> resource.
     * </p>
     * 
     * @param createRestApiRequest <p>
     *            The POST Request to add a new <a>RestApi</a> resource to your
     *            collection.
     *            </p>
     * @return createRestApiResult The response from the CreateRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRestApiResult createRestApi(CreateRestApiRequest createRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRestApiRequest> request = null;
        Response<CreateRestApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRestApiRequestMarshaller().marshall(createRestApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRestApiResult, JsonUnmarshallerContext> unmarshaller = new CreateRestApiResultJsonUnmarshaller();
            JsonResponseHandler<CreateRestApiResult> responseHandler = new JsonResponseHandler<CreateRestApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new <a>Stage</a> resource that references a pre-existing
     * <a>Deployment</a> for the API.
     * </p>
     * 
     * @param createStageRequest <p>
     *            Requests API Gateway to create a <a>Stage</a> resource.
     *            </p>
     * @return createStageResult The response from the CreateStage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateStageResult createStage(CreateStageRequest createStageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStageRequest> request = null;
        Response<CreateStageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStageRequestMarshaller().marshall(createStageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateStageResult, JsonUnmarshallerContext> unmarshaller = new CreateStageResultJsonUnmarshaller();
            JsonResponseHandler<CreateStageResult> responseHandler = new JsonResponseHandler<CreateStageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a usage plan with the throttle and quota limits, as well as the
     * associated API stages, specified in the payload.
     * </p>
     * 
     * @param createUsagePlanRequest <p>
     *            The POST request to create a usage plan with the name,
     *            description, throttle limits and quota limits, as well as the
     *            associated API stages, specified in the payload.
     *            </p>
     * @return createUsagePlanResult The response from the CreateUsagePlan
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUsagePlanResult createUsagePlan(CreateUsagePlanRequest createUsagePlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsagePlanRequest> request = null;
        Response<CreateUsagePlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUsagePlanRequestMarshaller().marshall(createUsagePlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUsagePlanResult, JsonUnmarshallerContext> unmarshaller = new CreateUsagePlanResultJsonUnmarshaller();
            JsonResponseHandler<CreateUsagePlanResult> responseHandler = new JsonResponseHandler<CreateUsagePlanResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a usage plan key for adding an existing API key to a usage plan.
     * </p>
     * 
     * @param createUsagePlanKeyRequest <p>
     *            The POST request to create a usage plan key for adding an
     *            existing API key to a usage plan.
     *            </p>
     * @return createUsagePlanKeyResult The response from the CreateUsagePlanKey
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateUsagePlanKeyResult createUsagePlanKey(
            CreateUsagePlanKeyRequest createUsagePlanKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUsagePlanKeyRequest> request = null;
        Response<CreateUsagePlanKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUsagePlanKeyRequestMarshaller()
                        .marshall(createUsagePlanKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateUsagePlanKeyResult, JsonUnmarshallerContext> unmarshaller = new CreateUsagePlanKeyResultJsonUnmarshaller();
            JsonResponseHandler<CreateUsagePlanKeyResult> responseHandler = new JsonResponseHandler<CreateUsagePlanKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a VPC link, under the caller's account in a selected region, in
     * an asynchronous operation that typically takes 2-4 minutes to complete
     * and become operational. The caller must have permissions to create and
     * update VPC Endpoint services.
     * </p>
     * 
     * @param createVpcLinkRequest <p>
     *            Creates a VPC link, under the caller's account in a selected
     *            region, in an asynchronous operation that typically takes 2-4
     *            minutes to complete and become operational. The caller must
     *            have permissions to create and update VPC Endpoint services.
     *            </p>
     * @return createVpcLinkResult The response from the CreateVpcLink service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateVpcLinkResult createVpcLink(CreateVpcLinkRequest createVpcLinkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcLinkRequest> request = null;
        Response<CreateVpcLinkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcLinkRequestMarshaller().marshall(createVpcLinkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateVpcLinkResult, JsonUnmarshallerContext> unmarshaller = new CreateVpcLinkResultJsonUnmarshaller();
            JsonResponseHandler<CreateVpcLinkResult> responseHandler = new JsonResponseHandler<CreateVpcLinkResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param deleteApiKeyRequest <p>
     *            A request to delete the <a>ApiKey</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiKeyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiKeyRequestMarshaller().marshall(deleteApiKeyRequest);
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
     * Deletes an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param deleteAuthorizerRequest <p>
     *            Request to delete an existing <a>Authorizer</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteAuthorizer(DeleteAuthorizerRequest deleteAuthorizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAuthorizerRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAuthorizerRequestMarshaller().marshall(deleteAuthorizerRequest);
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
     * Deletes the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param deleteBasePathMappingRequest <p>
     *            A request to delete the <a>BasePathMapping</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteBasePathMapping(DeleteBasePathMappingRequest deleteBasePathMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBasePathMappingRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBasePathMappingRequestMarshaller()
                        .marshall(deleteBasePathMappingRequest);
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
     * Deletes the <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param deleteClientCertificateRequest <p>
     *            A request to delete the <a>ClientCertificate</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteClientCertificate(
            DeleteClientCertificateRequest deleteClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClientCertificateRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClientCertificateRequestMarshaller()
                        .marshall(deleteClientCertificateRequest);
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
     * Deletes a <a>Deployment</a> resource. Deleting a deployment will only
     * succeed if there are no <a>Stage</a> resources associated with it.
     * </p>
     * 
     * @param deleteDeploymentRequest <p>
     *            Requests API Gateway to delete a <a>Deployment</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentRequestMarshaller().marshall(deleteDeploymentRequest);
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
     * @param deleteDocumentationPartRequest <p>
     *            Deletes an existing documentation part of an API.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDocumentationPart(
            DeleteDocumentationPartRequest deleteDocumentationPartRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentationPartRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentationPartRequestMarshaller()
                        .marshall(deleteDocumentationPartRequest);
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
     * @param deleteDocumentationVersionRequest <p>
     *            Deletes an existing documentation version of an API.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDocumentationVersion(
            DeleteDocumentationVersionRequest deleteDocumentationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentationVersionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentationVersionRequestMarshaller()
                        .marshall(deleteDocumentationVersionRequest);
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
     * Deletes the <a>DomainName</a> resource.
     * </p>
     * 
     * @param deleteDomainNameRequest <p>
     *            A request to delete the <a>DomainName</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDomainName(DeleteDomainNameRequest deleteDomainNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainNameRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainNameRequestMarshaller().marshall(deleteDomainNameRequest);
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
     * Clears any customization of a <a>GatewayResponse</a> of a specified
     * response type on the given <a>RestApi</a> and resets it with the default
     * settings.
     * </p>
     * 
     * @param deleteGatewayResponseRequest <p>
     *            Clears any customization of a <a>GatewayResponse</a> of a
     *            specified response type on the given <a>RestApi</a> and resets
     *            it with the default settings.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteGatewayResponse(DeleteGatewayResponseRequest deleteGatewayResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayResponseRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayResponseRequestMarshaller()
                        .marshall(deleteGatewayResponseRequest);
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
     * Represents a delete integration.
     * </p>
     * 
     * @param deleteIntegrationRequest <p>
     *            Represents a delete integration request.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteIntegration(DeleteIntegrationRequest deleteIntegrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationRequestMarshaller()
                        .marshall(deleteIntegrationRequest);
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
     * Represents a delete integration response.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest <p>
     *            Represents a delete integration response request.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteIntegrationResponse(
            DeleteIntegrationResponseRequest deleteIntegrationResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationResponseRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationResponseRequestMarshaller()
                        .marshall(deleteIntegrationResponseRequest);
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
     * Deletes an existing <a>Method</a> resource.
     * </p>
     * 
     * @param deleteMethodRequest <p>
     *            Request to delete an existing <a>Method</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteMethod(DeleteMethodRequest deleteMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodRequestMarshaller().marshall(deleteMethodRequest);
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
     * Deletes an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param deleteMethodResponseRequest <p>
     *            A request to delete an existing <a>MethodResponse</a>
     *            resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteMethodResponse(DeleteMethodResponseRequest deleteMethodResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMethodResponseRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMethodResponseRequestMarshaller()
                        .marshall(deleteMethodResponseRequest);
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
     * Deletes a model.
     * </p>
     * 
     * @param deleteModelRequest <p>
     *            Request to delete an existing model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteModel(DeleteModelRequest deleteModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteModelRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteModelRequestMarshaller().marshall(deleteModelRequest);
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
     * Deletes a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param deleteRequestValidatorRequest <p>
     *            Deletes a specified <a>RequestValidator</a> of a given
     *            <a>RestApi</a>.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRequestValidator(DeleteRequestValidatorRequest deleteRequestValidatorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRequestValidatorRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRequestValidatorRequestMarshaller()
                        .marshall(deleteRequestValidatorRequest);
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
     * Deletes a <a>Resource</a> resource.
     * </p>
     * 
     * @param deleteResourceRequest <p>
     *            Request to delete a <a>Resource</a>.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteResource(DeleteResourceRequest deleteResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceRequestMarshaller().marshall(deleteResourceRequest);
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
     * Deletes the specified API.
     * </p>
     * 
     * @param deleteRestApiRequest <p>
     *            Request to delete the specified API from your collection.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRestApi(DeleteRestApiRequest deleteRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRestApiRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRestApiRequestMarshaller().marshall(deleteRestApiRequest);
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
     * Deletes a <a>Stage</a> resource.
     * </p>
     * 
     * @param deleteStageRequest <p>
     *            Requests API Gateway to delete a <a>Stage</a> resource.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteStage(DeleteStageRequest deleteStageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStageRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStageRequestMarshaller().marshall(deleteStageRequest);
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
     * Deletes a usage plan of a given plan Id.
     * </p>
     * 
     * @param deleteUsagePlanRequest <p>
     *            The DELETE request to delete a usage plan of a given plan Id.
     *            </p>
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteUsagePlan(DeleteUsagePlanRequest deleteUsagePlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsagePlanRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUsagePlanRequestMarshaller().marshall(deleteUsagePlanRequest);
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
     * Deletes a usage plan key and remove the underlying API key from the
     * associated usage plan.
     * </p>
     * 
     * @param deleteUsagePlanKeyRequest <p>
     *            The DELETE request to delete a usage plan key and remove the
     *            underlying API key from the associated usage plan.
     *            </p>
     * @throws BadRequestException
     * @throws ConflictException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteUsagePlanKey(DeleteUsagePlanKeyRequest deleteUsagePlanKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUsagePlanKeyRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUsagePlanKeyRequestMarshaller()
                        .marshall(deleteUsagePlanKeyRequest);
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
     * Deletes an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param deleteVpcLinkRequest <p>
     *            Deletes an existing <a>VpcLink</a> of a specified identifier.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcLinkRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcLinkRequestMarshaller().marshall(deleteVpcLinkRequest);
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
     * Flushes all authorizer cache entries on a stage.
     * </p>
     * 
     * @param flushStageAuthorizersCacheRequest <p>
     *            Request to flush authorizer cache entries on a specified
     *            stage.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void flushStageAuthorizersCache(
            FlushStageAuthorizersCacheRequest flushStageAuthorizersCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(flushStageAuthorizersCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FlushStageAuthorizersCacheRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FlushStageAuthorizersCacheRequestMarshaller()
                        .marshall(flushStageAuthorizersCacheRequest);
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
     * Flushes a stage's cache.
     * </p>
     * 
     * @param flushStageCacheRequest <p>
     *            Requests API Gateway to flush a stage's cache.
     *            </p>
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void flushStageCache(FlushStageCacheRequest flushStageCacheRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(flushStageCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FlushStageCacheRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FlushStageCacheRequestMarshaller().marshall(flushStageCacheRequest);
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
     * Generates a <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param generateClientCertificateRequest <p>
     *            A request to generate a <a>ClientCertificate</a> resource.
     *            </p>
     * @return generateClientCertificateResult The response from the
     *         GenerateClientCertificate service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GenerateClientCertificateResult generateClientCertificate(
            GenerateClientCertificateRequest generateClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(generateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateClientCertificateRequest> request = null;
        Response<GenerateClientCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateClientCertificateRequestMarshaller()
                        .marshall(generateClientCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GenerateClientCertificateResult, JsonUnmarshallerContext> unmarshaller = new GenerateClientCertificateResultJsonUnmarshaller();
            JsonResponseHandler<GenerateClientCertificateResult> responseHandler = new JsonResponseHandler<GenerateClientCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param getAccountRequest <p>
     *            Requests API Gateway to get information about the current
     *            <a>Account</a> resource.
     *            </p>
     * @return getAccountResult The response from the GetAccount service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAccountResult getAccount(GetAccountRequest getAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountRequest> request = null;
        Response<GetAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountRequestMarshaller().marshall(getAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAccountResult, JsonUnmarshallerContext> unmarshaller = new GetAccountResultJsonUnmarshaller();
            JsonResponseHandler<GetAccountResult> responseHandler = new JsonResponseHandler<GetAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ApiKey</a> resource.
     * </p>
     * 
     * @param getApiKeyRequest <p>
     *            A request to get information about the current <a>ApiKey</a>
     *            resource.
     *            </p>
     * @return getApiKeyResult The response from the GetApiKey service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetApiKeyResult getApiKey(GetApiKeyRequest getApiKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeyRequest> request = null;
        Response<GetApiKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeyRequestMarshaller().marshall(getApiKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApiKeyResult, JsonUnmarshallerContext> unmarshaller = new GetApiKeyResultJsonUnmarshaller();
            JsonResponseHandler<GetApiKeyResult> responseHandler = new JsonResponseHandler<GetApiKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ApiKeys</a> resource.
     * </p>
     * 
     * @param getApiKeysRequest <p>
     *            A request to get information about the current <a>ApiKeys</a>
     *            resource.
     *            </p>
     * @return getApiKeysResult The response from the GetApiKeys service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetApiKeysResult getApiKeys(GetApiKeysRequest getApiKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiKeysRequest> request = null;
        Response<GetApiKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiKeysRequestMarshaller().marshall(getApiKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApiKeysResult, JsonUnmarshallerContext> unmarshaller = new GetApiKeysResultJsonUnmarshaller();
            JsonResponseHandler<GetApiKeysResult> responseHandler = new JsonResponseHandler<GetApiKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param getAuthorizerRequest <p>
     *            Request to describe an existing <a>Authorizer</a> resource.
     *            </p>
     * @return getAuthorizerResult The response from the GetAuthorizer service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAuthorizerResult getAuthorizer(GetAuthorizerRequest getAuthorizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizerRequest> request = null;
        Response<GetAuthorizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizerRequestMarshaller().marshall(getAuthorizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAuthorizerResult, JsonUnmarshallerContext> unmarshaller = new GetAuthorizerResultJsonUnmarshaller();
            JsonResponseHandler<GetAuthorizerResult> responseHandler = new JsonResponseHandler<GetAuthorizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Authorizers</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-authorizers.html"
     * >AWS CLI</a></div>
     * 
     * @param getAuthorizersRequest <p>
     *            Request to describe an existing <a>Authorizers</a> resource.
     *            </p>
     * @return getAuthorizersResult The response from the GetAuthorizers service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetAuthorizersResult getAuthorizers(GetAuthorizersRequest getAuthorizersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAuthorizersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizersRequest> request = null;
        Response<GetAuthorizersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizersRequestMarshaller().marshall(getAuthorizersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAuthorizersResult, JsonUnmarshallerContext> unmarshaller = new GetAuthorizersResultJsonUnmarshaller();
            JsonResponseHandler<GetAuthorizersResult> responseHandler = new JsonResponseHandler<GetAuthorizersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describe a <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param getBasePathMappingRequest <p>
     *            Request to describe a <a>BasePathMapping</a> resource.
     *            </p>
     * @return getBasePathMappingResult The response from the GetBasePathMapping
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBasePathMappingResult getBasePathMapping(
            GetBasePathMappingRequest getBasePathMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingRequest> request = null;
        Response<GetBasePathMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingRequestMarshaller()
                        .marshall(getBasePathMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBasePathMappingResult, JsonUnmarshallerContext> unmarshaller = new GetBasePathMappingResultJsonUnmarshaller();
            JsonResponseHandler<GetBasePathMappingResult> responseHandler = new JsonResponseHandler<GetBasePathMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents a collection of <a>BasePathMapping</a> resources.
     * </p>
     * 
     * @param getBasePathMappingsRequest <p>
     *            A request to get information about a collection of
     *            <a>BasePathMapping</a> resources.
     *            </p>
     * @return getBasePathMappingsResult The response from the
     *         GetBasePathMappings service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetBasePathMappingsResult getBasePathMappings(
            GetBasePathMappingsRequest getBasePathMappingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getBasePathMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBasePathMappingsRequest> request = null;
        Response<GetBasePathMappingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBasePathMappingsRequestMarshaller()
                        .marshall(getBasePathMappingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetBasePathMappingsResult, JsonUnmarshallerContext> unmarshaller = new GetBasePathMappingsResultJsonUnmarshaller();
            JsonResponseHandler<GetBasePathMappingsResult> responseHandler = new JsonResponseHandler<GetBasePathMappingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about the current <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param getClientCertificateRequest <p>
     *            A request to get information about the current
     *            <a>ClientCertificate</a> resource.
     *            </p>
     * @return getClientCertificateResult The response from the
     *         GetClientCertificate service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClientCertificateResult getClientCertificate(
            GetClientCertificateRequest getClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificateRequest> request = null;
        Response<GetClientCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificateRequestMarshaller()
                        .marshall(getClientCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClientCertificateResult, JsonUnmarshallerContext> unmarshaller = new GetClientCertificateResultJsonUnmarshaller();
            JsonResponseHandler<GetClientCertificateResult> responseHandler = new JsonResponseHandler<GetClientCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a collection of <a>ClientCertificate</a> resources.
     * </p>
     * 
     * @param getClientCertificatesRequest <p>
     *            A request to get information about a collection of
     *            <a>ClientCertificate</a> resources.
     *            </p>
     * @return getClientCertificatesResult The response from the
     *         GetClientCertificates service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetClientCertificatesResult getClientCertificates(
            GetClientCertificatesRequest getClientCertificatesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClientCertificatesRequest> request = null;
        Response<GetClientCertificatesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClientCertificatesRequestMarshaller()
                        .marshall(getClientCertificatesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetClientCertificatesResult, JsonUnmarshallerContext> unmarshaller = new GetClientCertificatesResultJsonUnmarshaller();
            JsonResponseHandler<GetClientCertificatesResult> responseHandler = new JsonResponseHandler<GetClientCertificatesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param getDeploymentRequest <p>
     *            Requests API Gateway to get information about a
     *            <a>Deployment</a> resource.
     *            </p>
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestMarshaller().marshall(getDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentResult> responseHandler = new JsonResponseHandler<GetDeploymentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Deployments</a> collection.
     * </p>
     * 
     * @param getDeploymentsRequest <p>
     *            Requests API Gateway to get information about a
     *            <a>Deployments</a> collection.
     *            </p>
     * @return getDeploymentsResult The response from the GetDeployments service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDeploymentsResult getDeployments(GetDeploymentsRequest getDeploymentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentsRequest> request = null;
        Response<GetDeploymentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentsRequestMarshaller().marshall(getDeploymentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDeploymentsResult, JsonUnmarshallerContext> unmarshaller = new GetDeploymentsResultJsonUnmarshaller();
            JsonResponseHandler<GetDeploymentsResult> responseHandler = new JsonResponseHandler<GetDeploymentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getDocumentationPartRequest <p>
     *            Gets a specified documentation part of a given API.
     *            </p>
     * @return getDocumentationPartResult The response from the
     *         GetDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDocumentationPartResult getDocumentationPart(
            GetDocumentationPartRequest getDocumentationPartRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationPartRequest> request = null;
        Response<GetDocumentationPartResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationPartRequestMarshaller()
                        .marshall(getDocumentationPartRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentationPartResult, JsonUnmarshallerContext> unmarshaller = new GetDocumentationPartResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentationPartResult> responseHandler = new JsonResponseHandler<GetDocumentationPartResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getDocumentationPartsRequest <p>
     *            Gets the documentation parts of an API. The result may be
     *            filtered by the type, name, or path of API entities (targets).
     *            </p>
     * @return getDocumentationPartsResult The response from the
     *         GetDocumentationParts service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDocumentationPartsResult getDocumentationParts(
            GetDocumentationPartsRequest getDocumentationPartsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDocumentationPartsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationPartsRequest> request = null;
        Response<GetDocumentationPartsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationPartsRequestMarshaller()
                        .marshall(getDocumentationPartsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentationPartsResult, JsonUnmarshallerContext> unmarshaller = new GetDocumentationPartsResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentationPartsResult> responseHandler = new JsonResponseHandler<GetDocumentationPartsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getDocumentationVersionRequest <p>
     *            Gets a documentation snapshot of an API.
     *            </p>
     * @return getDocumentationVersionResult The response from the
     *         GetDocumentationVersion service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDocumentationVersionResult getDocumentationVersion(
            GetDocumentationVersionRequest getDocumentationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationVersionRequest> request = null;
        Response<GetDocumentationVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationVersionRequestMarshaller()
                        .marshall(getDocumentationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentationVersionResult, JsonUnmarshallerContext> unmarshaller = new GetDocumentationVersionResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentationVersionResult> responseHandler = new JsonResponseHandler<GetDocumentationVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getDocumentationVersionsRequest <p>
     *            Gets the documentation versions of an API.
     *            </p>
     * @return getDocumentationVersionsResult The response from the
     *         GetDocumentationVersions service method, as returned by Amazon
     *         API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDocumentationVersionsResult getDocumentationVersions(
            GetDocumentationVersionsRequest getDocumentationVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDocumentationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentationVersionsRequest> request = null;
        Response<GetDocumentationVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentationVersionsRequestMarshaller()
                        .marshall(getDocumentationVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDocumentationVersionsResult, JsonUnmarshallerContext> unmarshaller = new GetDocumentationVersionsResultJsonUnmarshaller();
            JsonResponseHandler<GetDocumentationVersionsResult> responseHandler = new JsonResponseHandler<GetDocumentationVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents a domain name that is contained in a simpler, more intuitive
     * URL that can be called.
     * </p>
     * 
     * @param getDomainNameRequest <p>
     *            Request to get the name of a <a>DomainName</a> resource.
     *            </p>
     * @return getDomainNameResult The response from the GetDomainName service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDomainNameResult getDomainName(GetDomainNameRequest getDomainNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNameRequest> request = null;
        Response<GetDomainNameResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNameRequestMarshaller().marshall(getDomainNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainNameResult, JsonUnmarshallerContext> unmarshaller = new GetDomainNameResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainNameResult> responseHandler = new JsonResponseHandler<GetDomainNameResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents a collection of <a>DomainName</a> resources.
     * </p>
     * 
     * @param getDomainNamesRequest <p>
     *            Request to describe a collection of <a>DomainName</a>
     *            resources.
     *            </p>
     * @return getDomainNamesResult The response from the GetDomainNames service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDomainNamesResult getDomainNames(GetDomainNamesRequest getDomainNamesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainNamesRequest> request = null;
        Response<GetDomainNamesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainNamesRequestMarshaller().marshall(getDomainNamesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDomainNamesResult, JsonUnmarshallerContext> unmarshaller = new GetDomainNamesResultJsonUnmarshaller();
            JsonResponseHandler<GetDomainNamesResult> responseHandler = new JsonResponseHandler<GetDomainNamesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Exports a deployed version of a <a>RestApi</a> in a specified format.
     * </p>
     * 
     * @param getExportRequest <p>
     *            Request a new export of a <a>RestApi</a> for a particular
     *            <a>Stage</a>.
     *            </p>
     * @return getExportResult The response from the GetExport service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetExportResult getExport(GetExportRequest getExportRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExportRequest> request = null;
        Response<GetExportResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExportRequestMarshaller().marshall(getExportRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetExportResult, JsonUnmarshallerContext> unmarshaller = new GetExportResultJsonUnmarshaller();
            JsonResponseHandler<GetExportResult> responseHandler = new JsonResponseHandler<GetExportResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a <a>GatewayResponse</a> of a specified response type on the given
     * <a>RestApi</a>.
     * </p>
     * 
     * @param getGatewayResponseRequest <p>
     *            Gets a <a>GatewayResponse</a> of a specified response type on
     *            the given <a>RestApi</a>.
     *            </p>
     * @return getGatewayResponseResult The response from the GetGatewayResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGatewayResponseResult getGatewayResponse(
            GetGatewayResponseRequest getGatewayResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayResponseRequest> request = null;
        Response<GetGatewayResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayResponseRequestMarshaller()
                        .marshall(getGatewayResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGatewayResponseResult, JsonUnmarshallerContext> unmarshaller = new GetGatewayResponseResultJsonUnmarshaller();
            JsonResponseHandler<GetGatewayResponseResult> responseHandler = new JsonResponseHandler<GetGatewayResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>.
     * If an API developer has not added any definitions for gateway responses,
     * the result will be the API Gateway-generated default
     * <a>GatewayResponses</a> collection for the supported response types.
     * </p>
     * 
     * @param getGatewayResponsesRequest <p>
     *            Gets the <a>GatewayResponses</a> collection on the given
     *            <a>RestApi</a>. If an API developer has not added any
     *            definitions for gateway responses, the result will be the API
     *            Gateway-generated default <a>GatewayResponses</a> collection
     *            for the supported response types.
     *            </p>
     * @return getGatewayResponsesResult The response from the
     *         GetGatewayResponses service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetGatewayResponsesResult getGatewayResponses(
            GetGatewayResponsesRequest getGatewayResponsesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getGatewayResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayResponsesRequest> request = null;
        Response<GetGatewayResponsesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayResponsesRequestMarshaller()
                        .marshall(getGatewayResponsesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetGatewayResponsesResult, JsonUnmarshallerContext> unmarshaller = new GetGatewayResponsesResultJsonUnmarshaller();
            JsonResponseHandler<GetGatewayResponsesResult> responseHandler = new JsonResponseHandler<GetGatewayResponsesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get the integration settings.
     * </p>
     * 
     * @param getIntegrationRequest <p>
     *            Represents a request to get the integration configuration.
     *            </p>
     * @return getIntegrationResult The response from the GetIntegration service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetIntegrationResult getIntegration(GetIntegrationRequest getIntegrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationRequest> request = null;
        Response<GetIntegrationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationRequestMarshaller().marshall(getIntegrationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIntegrationResult, JsonUnmarshallerContext> unmarshaller = new GetIntegrationResultJsonUnmarshaller();
            JsonResponseHandler<GetIntegrationResult> responseHandler = new JsonResponseHandler<GetIntegrationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents a get integration response.
     * </p>
     * 
     * @param getIntegrationResponseRequest <p>
     *            Represents a get integration response request.
     *            </p>
     * @return getIntegrationResponseResult The response from the
     *         GetIntegrationResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest getIntegrationResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationResponseRequest> request = null;
        Response<GetIntegrationResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationResponseRequestMarshaller()
                        .marshall(getIntegrationResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIntegrationResponseResult, JsonUnmarshallerContext> unmarshaller = new GetIntegrationResponseResultJsonUnmarshaller();
            JsonResponseHandler<GetIntegrationResponseResult> responseHandler = new JsonResponseHandler<GetIntegrationResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describe an existing <a>Method</a> resource.
     * </p>
     * 
     * @param getMethodRequest <p>
     *            Request to describe an existing <a>Method</a> resource.
     *            </p>
     * @return getMethodResult The response from the GetMethod service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMethodResult getMethod(GetMethodRequest getMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodRequest> request = null;
        Response<GetMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodRequestMarshaller().marshall(getMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMethodResult, JsonUnmarshallerContext> unmarshaller = new GetMethodResultJsonUnmarshaller();
            JsonResponseHandler<GetMethodResult> responseHandler = new JsonResponseHandler<GetMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param getMethodResponseRequest <p>
     *            Request to describe a <a>MethodResponse</a> resource.
     *            </p>
     * @return getMethodResponseResult The response from the GetMethodResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetMethodResponseResult getMethodResponse(
            GetMethodResponseRequest getMethodResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMethodResponseRequest> request = null;
        Response<GetMethodResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMethodResponseRequestMarshaller()
                        .marshall(getMethodResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetMethodResponseResult, JsonUnmarshallerContext> unmarshaller = new GetMethodResponseResultJsonUnmarshaller();
            JsonResponseHandler<GetMethodResponseResult> responseHandler = new JsonResponseHandler<GetMethodResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes an existing model defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelRequest <p>
     *            Request to list information about a model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return getModelResult The response from the GetModel service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetModelResult getModel(GetModelRequest getModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelRequest> request = null;
        Response<GetModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelRequestMarshaller().marshall(getModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetModelResult, JsonUnmarshallerContext> unmarshaller = new GetModelResultJsonUnmarshaller();
            JsonResponseHandler<GetModelResult> responseHandler = new JsonResponseHandler<GetModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a sample mapping template that can be used to transform a
     * payload into the structure of a model.
     * </p>
     * 
     * @param getModelTemplateRequest <p>
     *            Request to generate a sample mapping template used to
     *            transform the payload.
     *            </p>
     * @return getModelTemplateResult The response from the GetModelTemplate
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetModelTemplateResult getModelTemplate(GetModelTemplateRequest getModelTemplateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getModelTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelTemplateRequest> request = null;
        Response<GetModelTemplateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelTemplateRequestMarshaller().marshall(getModelTemplateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetModelTemplateResult, JsonUnmarshallerContext> unmarshaller = new GetModelTemplateResultJsonUnmarshaller();
            JsonResponseHandler<GetModelTemplateResult> responseHandler = new JsonResponseHandler<GetModelTemplateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes existing <a>Models</a> defined for a <a>RestApi</a> resource.
     * </p>
     * 
     * @param getModelsRequest <p>
     *            Request to list existing <a>Models</a> defined for a
     *            <a>RestApi</a> resource.
     *            </p>
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetModelsResult getModels(GetModelsRequest getModelsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetModelsRequest> request = null;
        Response<GetModelsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetModelsRequestMarshaller().marshall(getModelsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetModelsResult, JsonUnmarshallerContext> unmarshaller = new GetModelsResultJsonUnmarshaller();
            JsonResponseHandler<GetModelsResult> responseHandler = new JsonResponseHandler<GetModelsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorRequest <p>
     *            Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return getRequestValidatorResult The response from the
     *         GetRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRequestValidatorResult getRequestValidator(
            GetRequestValidatorRequest getRequestValidatorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRequestValidatorRequest> request = null;
        Response<GetRequestValidatorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRequestValidatorRequestMarshaller()
                        .marshall(getRequestValidatorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRequestValidatorResult, JsonUnmarshallerContext> unmarshaller = new GetRequestValidatorResultJsonUnmarshaller();
            JsonResponseHandler<GetRequestValidatorResult> responseHandler = new JsonResponseHandler<GetRequestValidatorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
     * </p>
     * 
     * @param getRequestValidatorsRequest <p>
     *            Gets the <a>RequestValidators</a> collection of a given
     *            <a>RestApi</a>.
     *            </p>
     * @return getRequestValidatorsResult The response from the
     *         GetRequestValidators service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRequestValidatorsResult getRequestValidators(
            GetRequestValidatorsRequest getRequestValidatorsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRequestValidatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRequestValidatorsRequest> request = null;
        Response<GetRequestValidatorsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRequestValidatorsRequestMarshaller()
                        .marshall(getRequestValidatorsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRequestValidatorsResult, JsonUnmarshallerContext> unmarshaller = new GetRequestValidatorsResultJsonUnmarshaller();
            JsonResponseHandler<GetRequestValidatorsResult> responseHandler = new JsonResponseHandler<GetRequestValidatorsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists information about a resource.
     * </p>
     * 
     * @param getResourceRequest <p>
     *            Request to list information about a resource.
     *            </p>
     * @return getResourceResult The response from the GetResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetResourceResult getResource(GetResourceRequest getResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceRequest> request = null;
        Response<GetResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceRequestMarshaller().marshall(getResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourceResult, JsonUnmarshallerContext> unmarshaller = new GetResourceResultJsonUnmarshaller();
            JsonResponseHandler<GetResourceResult> responseHandler = new JsonResponseHandler<GetResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists information about a collection of <a>Resource</a> resources.
     * </p>
     * 
     * @param getResourcesRequest <p>
     *            Request to list information about a collection of resources.
     *            </p>
     * @return getResourcesResult The response from the GetResources service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetResourcesResult getResources(GetResourcesRequest getResourcesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcesRequest> request = null;
        Response<GetResourcesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcesRequestMarshaller().marshall(getResourcesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetResourcesResult, JsonUnmarshallerContext> unmarshaller = new GetResourcesResultJsonUnmarshaller();
            JsonResponseHandler<GetResourcesResult> responseHandler = new JsonResponseHandler<GetResourcesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the <a>RestApi</a> resource in the collection.
     * </p>
     * 
     * @param getRestApiRequest <p>
     *            The GET request to list an existing <a>RestApi</a> defined for
     *            your collection.
     *            </p>
     * @return getRestApiResult The response from the GetRestApi service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRestApiResult getRestApi(GetRestApiRequest getRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApiRequest> request = null;
        Response<GetRestApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApiRequestMarshaller().marshall(getRestApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRestApiResult, JsonUnmarshallerContext> unmarshaller = new GetRestApiResultJsonUnmarshaller();
            JsonResponseHandler<GetRestApiResult> responseHandler = new JsonResponseHandler<GetRestApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the <a>RestApis</a> resources for your collection.
     * </p>
     * 
     * @param getRestApisRequest <p>
     *            The GET request to list existing <a>RestApis</a> defined for
     *            your collection.
     *            </p>
     * @return getRestApisResult The response from the GetRestApis service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetRestApisResult getRestApis(GetRestApisRequest getRestApisRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRestApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRestApisRequest> request = null;
        Response<GetRestApisResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRestApisRequestMarshaller().marshall(getRestApisRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRestApisResult, JsonUnmarshallerContext> unmarshaller = new GetRestApisResultJsonUnmarshaller();
            JsonResponseHandler<GetRestApisResult> responseHandler = new JsonResponseHandler<GetRestApisResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a client SDK for a <a>RestApi</a> and <a>Stage</a>.
     * </p>
     * 
     * @param getSdkRequest <p>
     *            Request a new generated client SDK for a <a>RestApi</a> and
     *            <a>Stage</a>.
     *            </p>
     * @return getSdkResult The response from the GetSdk service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSdkResult getSdk(GetSdkRequest getSdkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSdkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkRequest> request = null;
        Response<GetSdkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkRequestMarshaller().marshall(getSdkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSdkResult, JsonUnmarshallerContext> unmarshaller = new GetSdkResultJsonUnmarshaller();
            JsonResponseHandler<GetSdkResult> responseHandler = new JsonResponseHandler<GetSdkResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getSdkTypeRequest <p>
     *            Get an <a>SdkType</a> instance.
     *            </p>
     * @return getSdkTypeResult The response from the GetSdkType service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSdkTypeResult getSdkType(GetSdkTypeRequest getSdkTypeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSdkTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkTypeRequest> request = null;
        Response<GetSdkTypeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkTypeRequestMarshaller().marshall(getSdkTypeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSdkTypeResult, JsonUnmarshallerContext> unmarshaller = new GetSdkTypeResultJsonUnmarshaller();
            JsonResponseHandler<GetSdkTypeResult> responseHandler = new JsonResponseHandler<GetSdkTypeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param getSdkTypesRequest <p>
     *            Get the <a>SdkTypes</a> collection.
     *            </p>
     * @return getSdkTypesResult The response from the GetSdkTypes service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetSdkTypesResult getSdkTypes(GetSdkTypesRequest getSdkTypesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getSdkTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSdkTypesRequest> request = null;
        Response<GetSdkTypesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSdkTypesRequestMarshaller().marshall(getSdkTypesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetSdkTypesResult, JsonUnmarshallerContext> unmarshaller = new GetSdkTypesResultJsonUnmarshaller();
            JsonResponseHandler<GetSdkTypesResult> responseHandler = new JsonResponseHandler<GetSdkTypesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param getStageRequest <p>
     *            Requests API Gateway to get information about a <a>Stage</a>
     *            resource.
     *            </p>
     * @return getStageResult The response from the GetStage service method, as
     *         returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStageResult getStage(GetStageRequest getStageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageRequest> request = null;
        Response<GetStageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageRequestMarshaller().marshall(getStageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetStageResult, JsonUnmarshallerContext> unmarshaller = new GetStageResultJsonUnmarshaller();
            JsonResponseHandler<GetStageResult> responseHandler = new JsonResponseHandler<GetStageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets information about one or more <a>Stage</a> resources.
     * </p>
     * 
     * @param getStagesRequest <p>
     *            Requests API Gateway to get information about one or more
     *            <a>Stage</a> resources.
     *            </p>
     * @return getStagesResult The response from the GetStages service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetStagesResult getStages(GetStagesRequest getStagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getStagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStagesRequest> request = null;
        Response<GetStagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStagesRequestMarshaller().marshall(getStagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetStagesResult, JsonUnmarshallerContext> unmarshaller = new GetStagesResultJsonUnmarshaller();
            JsonResponseHandler<GetStagesResult> responseHandler = new JsonResponseHandler<GetStagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the <a>Tags</a> collection for a given resource.
     * </p>
     * 
     * @param getTagsRequest <p>
     *            Gets the <a>Tags</a> collection for a given resource.
     *            </p>
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
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
     * Gets the usage data of a usage plan in a specified time interval.
     * </p>
     * 
     * @param getUsageRequest <p>
     *            The GET request to get the usage data of a usage plan in a
     *            specified time interval.
     *            </p>
     * @return getUsageResult The response from the GetUsage service method, as
     *         returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsageResult getUsage(GetUsageRequest getUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageRequest> request = null;
        Response<GetUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageRequestMarshaller().marshall(getUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsageResult, JsonUnmarshallerContext> unmarshaller = new GetUsageResultJsonUnmarshaller();
            JsonResponseHandler<GetUsageResult> responseHandler = new JsonResponseHandler<GetUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a usage plan of a given plan identifier.
     * </p>
     * 
     * @param getUsagePlanRequest <p>
     *            The GET request to get a usage plan of a given plan
     *            identifier.
     *            </p>
     * @return getUsagePlanResult The response from the GetUsagePlan service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsagePlanResult getUsagePlan(GetUsagePlanRequest getUsagePlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanRequest> request = null;
        Response<GetUsagePlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanRequestMarshaller().marshall(getUsagePlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsagePlanResult, JsonUnmarshallerContext> unmarshaller = new GetUsagePlanResultJsonUnmarshaller();
            JsonResponseHandler<GetUsagePlanResult> responseHandler = new JsonResponseHandler<GetUsagePlanResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a usage plan key of a given key identifier.
     * </p>
     * 
     * @param getUsagePlanKeyRequest <p>
     *            The GET request to get a usage plan key of a given key
     *            identifier.
     *            </p>
     * @return getUsagePlanKeyResult The response from the GetUsagePlanKey
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsagePlanKeyResult getUsagePlanKey(GetUsagePlanKeyRequest getUsagePlanKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsagePlanKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanKeyRequest> request = null;
        Response<GetUsagePlanKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanKeyRequestMarshaller().marshall(getUsagePlanKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsagePlanKeyResult, JsonUnmarshallerContext> unmarshaller = new GetUsagePlanKeyResultJsonUnmarshaller();
            JsonResponseHandler<GetUsagePlanKeyResult> responseHandler = new JsonResponseHandler<GetUsagePlanKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all the usage plan keys representing the API keys added to a
     * specified usage plan.
     * </p>
     * 
     * @param getUsagePlanKeysRequest <p>
     *            The GET request to get all the usage plan keys representing
     *            the API keys added to a specified usage plan.
     *            </p>
     * @return getUsagePlanKeysResult The response from the GetUsagePlanKeys
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsagePlanKeysResult getUsagePlanKeys(GetUsagePlanKeysRequest getUsagePlanKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsagePlanKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlanKeysRequest> request = null;
        Response<GetUsagePlanKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlanKeysRequestMarshaller().marshall(getUsagePlanKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsagePlanKeysResult, JsonUnmarshallerContext> unmarshaller = new GetUsagePlanKeysResultJsonUnmarshaller();
            JsonResponseHandler<GetUsagePlanKeysResult> responseHandler = new JsonResponseHandler<GetUsagePlanKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets all the usage plans of the caller's account.
     * </p>
     * 
     * @param getUsagePlansRequest <p>
     *            The GET request to get all the usage plans of the caller's
     *            account.
     *            </p>
     * @return getUsagePlansResult The response from the GetUsagePlans service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetUsagePlansResult getUsagePlans(GetUsagePlansRequest getUsagePlansRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getUsagePlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsagePlansRequest> request = null;
        Response<GetUsagePlansResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsagePlansRequestMarshaller().marshall(getUsagePlansRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetUsagePlansResult, JsonUnmarshallerContext> unmarshaller = new GetUsagePlansResultJsonUnmarshaller();
            JsonResponseHandler<GetUsagePlansResult> responseHandler = new JsonResponseHandler<GetUsagePlansResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a specified VPC link under the caller's account in a region.
     * </p>
     * 
     * @param getVpcLinkRequest <p>
     *            Gets a specified VPC link under the caller's account in a
     *            region.
     *            </p>
     * @return getVpcLinkResult The response from the GetVpcLink service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVpcLinkResult getVpcLink(GetVpcLinkRequest getVpcLinkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVpcLinkRequest> request = null;
        Response<GetVpcLinkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVpcLinkRequestMarshaller().marshall(getVpcLinkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVpcLinkResult, JsonUnmarshallerContext> unmarshaller = new GetVpcLinkResultJsonUnmarshaller();
            JsonResponseHandler<GetVpcLinkResult> responseHandler = new JsonResponseHandler<GetVpcLinkResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the <a>VpcLinks</a> collection under the caller's account in a
     * selected region.
     * </p>
     * 
     * @param getVpcLinksRequest <p>
     *            Gets the <a>VpcLinks</a> collection under the caller's account
     *            in a selected region.
     *            </p>
     * @return getVpcLinksResult The response from the GetVpcLinks service
     *         method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetVpcLinksResult getVpcLinks(GetVpcLinksRequest getVpcLinksRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getVpcLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVpcLinksRequest> request = null;
        Response<GetVpcLinksResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVpcLinksRequestMarshaller().marshall(getVpcLinksRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetVpcLinksResult, JsonUnmarshallerContext> unmarshaller = new GetVpcLinksResultJsonUnmarshaller();
            JsonResponseHandler<GetVpcLinksResult> responseHandler = new JsonResponseHandler<GetVpcLinksResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Import API keys from an external source, such as a CSV-formatted file.
     * </p>
     * 
     * @param importApiKeysRequest <p>
     *            The POST request to import API keys from an external source,
     *            such as a CSV-formatted file.
     *            </p>
     * @return importApiKeysResult The response from the ImportApiKeys service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportApiKeysResult importApiKeys(ImportApiKeysRequest importApiKeysRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importApiKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportApiKeysRequest> request = null;
        Response<ImportApiKeysResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportApiKeysRequestMarshaller().marshall(importApiKeysRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportApiKeysResult, JsonUnmarshallerContext> unmarshaller = new ImportApiKeysResultJsonUnmarshaller();
            JsonResponseHandler<ImportApiKeysResult> responseHandler = new JsonResponseHandler<ImportApiKeysResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param importDocumentationPartsRequest <p>
     *            Import documentation parts from an external (e.g., OpenAPI)
     *            definition file.
     *            </p>
     * @return importDocumentationPartsResult The response from the
     *         ImportDocumentationParts service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportDocumentationPartsResult importDocumentationParts(
            ImportDocumentationPartsRequest importDocumentationPartsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importDocumentationPartsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportDocumentationPartsRequest> request = null;
        Response<ImportDocumentationPartsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportDocumentationPartsRequestMarshaller()
                        .marshall(importDocumentationPartsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportDocumentationPartsResult, JsonUnmarshallerContext> unmarshaller = new ImportDocumentationPartsResultJsonUnmarshaller();
            JsonResponseHandler<ImportDocumentationPartsResult> responseHandler = new JsonResponseHandler<ImportDocumentationPartsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * A feature of the API Gateway control service for creating a new API from
     * an external API definition file.
     * </p>
     * 
     * @param importRestApiRequest <p>
     *            A POST request to import an API to API Gateway using an input
     *            of an API definition file.
     *            </p>
     * @return importRestApiResult The response from the ImportRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ImportRestApiResult importRestApi(ImportRestApiRequest importRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportRestApiRequest> request = null;
        Response<ImportRestApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportRestApiRequestMarshaller().marshall(importRestApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportRestApiResult, JsonUnmarshallerContext> unmarshaller = new ImportRestApiResultJsonUnmarshaller();
            JsonResponseHandler<ImportRestApiResult> responseHandler = new JsonResponseHandler<ImportRestApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a customization of a <a>GatewayResponse</a> of a specified
     * response type and status code on the given <a>RestApi</a>.
     * </p>
     * 
     * @param putGatewayResponseRequest <p>
     *            Creates a customization of a <a>GatewayResponse</a> of a
     *            specified response type and status code on the given
     *            <a>RestApi</a>.
     *            </p>
     * @return putGatewayResponseResult The response from the PutGatewayResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutGatewayResponseResult putGatewayResponse(
            PutGatewayResponseRequest putGatewayResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutGatewayResponseRequest> request = null;
        Response<PutGatewayResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutGatewayResponseRequestMarshaller()
                        .marshall(putGatewayResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutGatewayResponseResult, JsonUnmarshallerContext> unmarshaller = new PutGatewayResponseResultJsonUnmarshaller();
            JsonResponseHandler<PutGatewayResponseResult> responseHandler = new JsonResponseHandler<PutGatewayResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Sets up a method's integration.
     * </p>
     * 
     * @param putIntegrationRequest <p>
     *            Sets up a method's integration.
     *            </p>
     * @return putIntegrationResult The response from the PutIntegration service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutIntegrationResult putIntegration(PutIntegrationRequest putIntegrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationRequest> request = null;
        Response<PutIntegrationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationRequestMarshaller().marshall(putIntegrationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutIntegrationResult, JsonUnmarshallerContext> unmarshaller = new PutIntegrationResultJsonUnmarshaller();
            JsonResponseHandler<PutIntegrationResult> responseHandler = new JsonResponseHandler<PutIntegrationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents a put integration.
     * </p>
     * 
     * @param putIntegrationResponseRequest <p>
     *            Represents a put integration response request.
     *            </p>
     * @return putIntegrationResponseResult The response from the
     *         PutIntegrationResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutIntegrationResponseResult putIntegrationResponse(
            PutIntegrationResponseRequest putIntegrationResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutIntegrationResponseRequest> request = null;
        Response<PutIntegrationResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutIntegrationResponseRequestMarshaller()
                        .marshall(putIntegrationResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutIntegrationResponseResult, JsonUnmarshallerContext> unmarshaller = new PutIntegrationResponseResultJsonUnmarshaller();
            JsonResponseHandler<PutIntegrationResponseResult> responseHandler = new JsonResponseHandler<PutIntegrationResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Add a method to an existing <a>Resource</a> resource.
     * </p>
     * 
     * @param putMethodRequest <p>
     *            Request to add a method to an existing <a>Resource</a>
     *            resource.
     *            </p>
     * @return putMethodResult The response from the PutMethod service method,
     *         as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutMethodResult putMethod(PutMethodRequest putMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodRequest> request = null;
        Response<PutMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodRequestMarshaller().marshall(putMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutMethodResult, JsonUnmarshallerContext> unmarshaller = new PutMethodResultJsonUnmarshaller();
            JsonResponseHandler<PutMethodResult> responseHandler = new JsonResponseHandler<PutMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds a <a>MethodResponse</a> to an existing <a>Method</a> resource.
     * </p>
     * 
     * @param putMethodResponseRequest <p>
     *            Request to add a <a>MethodResponse</a> to an existing
     *            <a>Method</a> resource.
     *            </p>
     * @return putMethodResponseResult The response from the PutMethodResponse
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutMethodResponseResult putMethodResponse(
            PutMethodResponseRequest putMethodResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMethodResponseRequest> request = null;
        Response<PutMethodResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMethodResponseRequestMarshaller()
                        .marshall(putMethodResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutMethodResponseResult, JsonUnmarshallerContext> unmarshaller = new PutMethodResponseResultJsonUnmarshaller();
            JsonResponseHandler<PutMethodResponseResult> responseHandler = new JsonResponseHandler<PutMethodResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * A feature of the API Gateway control service for updating an existing API
     * with an input of external API definitions. The update can take the form
     * of merging the supplied definition into the existing API or overwriting
     * the existing API.
     * </p>
     * 
     * @param putRestApiRequest <p>
     *            A PUT request to update an existing API, with external API
     *            definitions specified as the request body.
     *            </p>
     * @return putRestApiResult The response from the PutRestApi service method,
     *         as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws LimitExceededException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutRestApiResult putRestApi(PutRestApiRequest putRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRestApiRequest> request = null;
        Response<PutRestApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRestApiRequestMarshaller().marshall(putRestApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRestApiResult, JsonUnmarshallerContext> unmarshaller = new PutRestApiResultJsonUnmarshaller();
            JsonResponseHandler<PutRestApiResult> responseHandler = new JsonResponseHandler<PutRestApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds or updates a tag on a given resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            Adds or updates a tag on a given resource.
     *            </p>
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Simulate the execution of an <a>Authorizer</a> in your <a>RestApi</a>
     * with headers, parameters, and an incoming request body.
     * </p>
     * <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html"
     * >Use Lambda Function as Authorizer</a> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html"
     * >Use Cognito User Pool as Authorizer</a> </div>
     * 
     * @param testInvokeAuthorizerRequest <p>
     *            Make a request to simulate the execution of an
     *            <a>Authorizer</a>.
     *            </p>
     * @return testInvokeAuthorizerResult The response from the
     *         TestInvokeAuthorizer service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestInvokeAuthorizerResult testInvokeAuthorizer(
            TestInvokeAuthorizerRequest testInvokeAuthorizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testInvokeAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeAuthorizerRequest> request = null;
        Response<TestInvokeAuthorizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeAuthorizerRequestMarshaller()
                        .marshall(testInvokeAuthorizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestInvokeAuthorizerResult, JsonUnmarshallerContext> unmarshaller = new TestInvokeAuthorizerResultJsonUnmarshaller();
            JsonResponseHandler<TestInvokeAuthorizerResult> responseHandler = new JsonResponseHandler<TestInvokeAuthorizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Simulate the execution of a <a>Method</a> in your <a>RestApi</a> with
     * headers, parameters, and an incoming request body.
     * </p>
     * 
     * @param testInvokeMethodRequest <p>
     *            Make a request to simulate the execution of a <a>Method</a>.
     *            </p>
     * @return testInvokeMethodResult The response from the TestInvokeMethod
     *         service method, as returned by Amazon API Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public TestInvokeMethodResult testInvokeMethod(TestInvokeMethodRequest testInvokeMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(testInvokeMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestInvokeMethodRequest> request = null;
        Response<TestInvokeMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestInvokeMethodRequestMarshaller().marshall(testInvokeMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<TestInvokeMethodResult, JsonUnmarshallerContext> unmarshaller = new TestInvokeMethodResultJsonUnmarshaller();
            JsonResponseHandler<TestInvokeMethodResult> responseHandler = new JsonResponseHandler<TestInvokeMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes a tag from a given resource.
     * </p>
     * 
     * @param untagResourceRequest <p>
     *            Removes a tag from a given resource.
     *            </p>
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
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
     * Changes information about the current <a>Account</a> resource.
     * </p>
     * 
     * @param updateAccountRequest <p>
     *            Requests API Gateway to change information about the current
     *            <a>Account</a> resource.
     *            </p>
     * @return updateAccountResult The response from the UpdateAccount service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountRequest> request = null;
        Response<UpdateAccountResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountRequestMarshaller().marshall(updateAccountRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAccountResult, JsonUnmarshallerContext> unmarshaller = new UpdateAccountResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAccountResult> responseHandler = new JsonResponseHandler<UpdateAccountResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about an <a>ApiKey</a> resource.
     * </p>
     * 
     * @param updateApiKeyRequest <p>
     *            A request to change information about an <a>ApiKey</a>
     *            resource.
     *            </p>
     * @return updateApiKeyResult The response from the UpdateApiKey service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest updateApiKeyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiKeyRequest> request = null;
        Response<UpdateApiKeyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiKeyRequestMarshaller().marshall(updateApiKeyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApiKeyResult, JsonUnmarshallerContext> unmarshaller = new UpdateApiKeyResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApiKeyResult> responseHandler = new JsonResponseHandler<UpdateApiKeyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing <a>Authorizer</a> resource.
     * </p>
     * <div class="seeAlso"><a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/update-authorizer.html"
     * >AWS CLI</a></div>
     * 
     * @param updateAuthorizerRequest <p>
     *            Request to update an existing <a>Authorizer</a> resource.
     *            </p>
     * @return updateAuthorizerResult The response from the UpdateAuthorizer
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateAuthorizerResult updateAuthorizer(UpdateAuthorizerRequest updateAuthorizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateAuthorizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuthorizerRequest> request = null;
        Response<UpdateAuthorizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuthorizerRequestMarshaller().marshall(updateAuthorizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateAuthorizerResult, JsonUnmarshallerContext> unmarshaller = new UpdateAuthorizerResultJsonUnmarshaller();
            JsonResponseHandler<UpdateAuthorizerResult> responseHandler = new JsonResponseHandler<UpdateAuthorizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about the <a>BasePathMapping</a> resource.
     * </p>
     * 
     * @param updateBasePathMappingRequest <p>
     *            A request to change information about the
     *            <a>BasePathMapping</a> resource.
     *            </p>
     * @return updateBasePathMappingResult The response from the
     *         UpdateBasePathMapping service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateBasePathMappingResult updateBasePathMapping(
            UpdateBasePathMappingRequest updateBasePathMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateBasePathMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBasePathMappingRequest> request = null;
        Response<UpdateBasePathMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBasePathMappingRequestMarshaller()
                        .marshall(updateBasePathMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateBasePathMappingResult, JsonUnmarshallerContext> unmarshaller = new UpdateBasePathMappingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBasePathMappingResult> responseHandler = new JsonResponseHandler<UpdateBasePathMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about an <a>ClientCertificate</a> resource.
     * </p>
     * 
     * @param updateClientCertificateRequest <p>
     *            A request to change information about an
     *            <a>ClientCertificate</a> resource.
     *            </p>
     * @return updateClientCertificateResult The response from the
     *         UpdateClientCertificate service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateClientCertificateResult updateClientCertificate(
            UpdateClientCertificateRequest updateClientCertificateRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClientCertificateRequest> request = null;
        Response<UpdateClientCertificateResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClientCertificateRequestMarshaller()
                        .marshall(updateClientCertificateRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateClientCertificateResult, JsonUnmarshallerContext> unmarshaller = new UpdateClientCertificateResultJsonUnmarshaller();
            JsonResponseHandler<UpdateClientCertificateResult> responseHandler = new JsonResponseHandler<UpdateClientCertificateResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Deployment</a> resource.
     * </p>
     * 
     * @param updateDeploymentRequest <p>
     *            Requests API Gateway to change information about a
     *            <a>Deployment</a> resource.
     *            </p>
     * @return updateDeploymentResult The response from the UpdateDeployment
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDeploymentResult updateDeployment(UpdateDeploymentRequest updateDeploymentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeploymentRequest> request = null;
        Response<UpdateDeploymentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeploymentRequestMarshaller().marshall(updateDeploymentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDeploymentResult, JsonUnmarshallerContext> unmarshaller = new UpdateDeploymentResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDeploymentResult> responseHandler = new JsonResponseHandler<UpdateDeploymentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param updateDocumentationPartRequest <p>
     *            Updates an existing documentation part of a given API.
     *            </p>
     * @return updateDocumentationPartResult The response from the
     *         UpdateDocumentationPart service method, as returned by Amazon API
     *         Gateway.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDocumentationPartResult updateDocumentationPart(
            UpdateDocumentationPartRequest updateDocumentationPartRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDocumentationPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentationPartRequest> request = null;
        Response<UpdateDocumentationPartResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentationPartRequestMarshaller()
                        .marshall(updateDocumentationPartRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDocumentationPartResult, JsonUnmarshallerContext> unmarshaller = new UpdateDocumentationPartResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDocumentationPartResult> responseHandler = new JsonResponseHandler<UpdateDocumentationPartResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param updateDocumentationVersionRequest <p>
     *            Updates an existing documentation version of an API.
     *            </p>
     * @return updateDocumentationVersionResult The response from the
     *         UpdateDocumentationVersion service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDocumentationVersionResult updateDocumentationVersion(
            UpdateDocumentationVersionRequest updateDocumentationVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDocumentationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentationVersionRequest> request = null;
        Response<UpdateDocumentationVersionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentationVersionRequestMarshaller()
                        .marshall(updateDocumentationVersionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDocumentationVersionResult, JsonUnmarshallerContext> unmarshaller = new UpdateDocumentationVersionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDocumentationVersionResult> responseHandler = new JsonResponseHandler<UpdateDocumentationVersionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about the <a>DomainName</a> resource.
     * </p>
     * 
     * @param updateDomainNameRequest <p>
     *            A request to change information about the <a>DomainName</a>
     *            resource.
     *            </p>
     * @return updateDomainNameResult The response from the UpdateDomainName
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDomainNameResult updateDomainName(UpdateDomainNameRequest updateDomainNameRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDomainNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameRequest> request = null;
        Response<UpdateDomainNameResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameRequestMarshaller().marshall(updateDomainNameRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDomainNameResult, JsonUnmarshallerContext> unmarshaller = new UpdateDomainNameResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDomainNameResult> responseHandler = new JsonResponseHandler<UpdateDomainNameResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a <a>GatewayResponse</a> of a specified response type on the
     * given <a>RestApi</a>.
     * </p>
     * 
     * @param updateGatewayResponseRequest <p>
     *            Updates a <a>GatewayResponse</a> of a specified response type
     *            on the given <a>RestApi</a>.
     *            </p>
     * @return updateGatewayResponseResult The response from the
     *         UpdateGatewayResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateGatewayResponseResult updateGatewayResponse(
            UpdateGatewayResponseRequest updateGatewayResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateGatewayResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayResponseRequest> request = null;
        Response<UpdateGatewayResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayResponseRequestMarshaller()
                        .marshall(updateGatewayResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateGatewayResponseResult, JsonUnmarshallerContext> unmarshaller = new UpdateGatewayResponseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateGatewayResponseResult> responseHandler = new JsonResponseHandler<UpdateGatewayResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents an update integration.
     * </p>
     * 
     * @param updateIntegrationRequest <p>
     *            Represents an update integration request.
     *            </p>
     * @return updateIntegrationResult The response from the UpdateIntegration
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateIntegrationResult updateIntegration(
            UpdateIntegrationRequest updateIntegrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationRequest> request = null;
        Response<UpdateIntegrationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationRequestMarshaller()
                        .marshall(updateIntegrationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIntegrationResult, JsonUnmarshallerContext> unmarshaller = new UpdateIntegrationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIntegrationResult> responseHandler = new JsonResponseHandler<UpdateIntegrationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Represents an update integration response.
     * </p>
     * 
     * @param updateIntegrationResponseRequest <p>
     *            Represents an update integration response request.
     *            </p>
     * @return updateIntegrationResponseResult The response from the
     *         UpdateIntegrationResponse service method, as returned by Amazon
     *         API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationResponseRequest> request = null;
        Response<UpdateIntegrationResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationResponseRequestMarshaller()
                        .marshall(updateIntegrationResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateIntegrationResponseResult, JsonUnmarshallerContext> unmarshaller = new UpdateIntegrationResponseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateIntegrationResponseResult> responseHandler = new JsonResponseHandler<UpdateIntegrationResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing <a>Method</a> resource.
     * </p>
     * 
     * @param updateMethodRequest <p>
     *            Request to update an existing <a>Method</a> resource.
     *            </p>
     * @return updateMethodResult The response from the UpdateMethod service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMethodResult updateMethod(UpdateMethodRequest updateMethodRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMethodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodRequest> request = null;
        Response<UpdateMethodResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodRequestMarshaller().marshall(updateMethodRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMethodResult, JsonUnmarshallerContext> unmarshaller = new UpdateMethodResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMethodResult> responseHandler = new JsonResponseHandler<UpdateMethodResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing <a>MethodResponse</a> resource.
     * </p>
     * 
     * @param updateMethodResponseRequest <p>
     *            A request to update an existing <a>MethodResponse</a>
     *            resource.
     *            </p>
     * @return updateMethodResponseResult The response from the
     *         UpdateMethodResponse service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateMethodResponseResult updateMethodResponse(
            UpdateMethodResponseRequest updateMethodResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateMethodResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMethodResponseRequest> request = null;
        Response<UpdateMethodResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMethodResponseRequestMarshaller()
                        .marshall(updateMethodResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateMethodResponseResult, JsonUnmarshallerContext> unmarshaller = new UpdateMethodResponseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMethodResponseResult> responseHandler = new JsonResponseHandler<UpdateMethodResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about a model.
     * </p>
     * 
     * @param updateModelRequest <p>
     *            Request to update an existing model in an existing
     *            <a>RestApi</a> resource.
     *            </p>
     * @return updateModelResult The response from the UpdateModel service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateModelResult updateModel(UpdateModelRequest updateModelRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateModelRequest> request = null;
        Response<UpdateModelResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateModelRequestMarshaller().marshall(updateModelRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateModelResult, JsonUnmarshallerContext> unmarshaller = new UpdateModelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateModelResult> responseHandler = new JsonResponseHandler<UpdateModelResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     * </p>
     * 
     * @param updateRequestValidatorRequest <p>
     *            Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
     *            </p>
     * @return updateRequestValidatorResult The response from the
     *         UpdateRequestValidator service method, as returned by Amazon API
     *         Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRequestValidatorResult updateRequestValidator(
            UpdateRequestValidatorRequest updateRequestValidatorRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRequestValidatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRequestValidatorRequest> request = null;
        Response<UpdateRequestValidatorResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRequestValidatorRequestMarshaller()
                        .marshall(updateRequestValidatorRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRequestValidatorResult, JsonUnmarshallerContext> unmarshaller = new UpdateRequestValidatorResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRequestValidatorResult> responseHandler = new JsonResponseHandler<UpdateRequestValidatorResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Resource</a> resource.
     * </p>
     * 
     * @param updateResourceRequest <p>
     *            Request to change information about a <a>Resource</a>
     *            resource.
     *            </p>
     * @return updateResourceResult The response from the UpdateResource service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceRequest> request = null;
        Response<UpdateResourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceRequestMarshaller().marshall(updateResourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateResourceResult, JsonUnmarshallerContext> unmarshaller = new UpdateResourceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateResourceResult> responseHandler = new JsonResponseHandler<UpdateResourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about the specified API.
     * </p>
     * 
     * @param updateRestApiRequest <p>
     *            Request to update an existing <a>RestApi</a> resource in your
     *            collection.
     *            </p>
     * @return updateRestApiResult The response from the UpdateRestApi service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRestApiResult updateRestApi(UpdateRestApiRequest updateRestApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRestApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRestApiRequest> request = null;
        Response<UpdateRestApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRestApiRequestMarshaller().marshall(updateRestApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRestApiResult, JsonUnmarshallerContext> unmarshaller = new UpdateRestApiResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRestApiResult> responseHandler = new JsonResponseHandler<UpdateRestApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Changes information about a <a>Stage</a> resource.
     * </p>
     * 
     * @param updateStageRequest <p>
     *            Requests API Gateway to change information about a
     *            <a>Stage</a> resource.
     *            </p>
     * @return updateStageResult The response from the UpdateStage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws BadRequestException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateStageResult updateStage(UpdateStageRequest updateStageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStageRequest> request = null;
        Response<UpdateStageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStageRequestMarshaller().marshall(updateStageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateStageResult, JsonUnmarshallerContext> unmarshaller = new UpdateStageResultJsonUnmarshaller();
            JsonResponseHandler<UpdateStageResult> responseHandler = new JsonResponseHandler<UpdateStageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Grants a temporary extension to the remaining quota of a usage plan
     * associated with a specified API key.
     * </p>
     * 
     * @param updateUsageRequest <p>
     *            The PATCH request to grant a temporary extension to the
     *            remaining quota of a usage plan associated with a specified
     *            API key.
     *            </p>
     * @return updateUsageResult The response from the UpdateUsage service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateUsageResult updateUsage(UpdateUsageRequest updateUsageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUsageRequest> request = null;
        Response<UpdateUsageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUsageRequestMarshaller().marshall(updateUsageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUsageResult, JsonUnmarshallerContext> unmarshaller = new UpdateUsageResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUsageResult> responseHandler = new JsonResponseHandler<UpdateUsageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a usage plan of a given plan Id.
     * </p>
     * 
     * @param updateUsagePlanRequest <p>
     *            The PATCH request to update a usage plan of a given plan Id.
     *            </p>
     * @return updateUsagePlanResult The response from the UpdateUsagePlan
     *         service method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws TooManyRequestsException
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateUsagePlanResult updateUsagePlan(UpdateUsagePlanRequest updateUsagePlanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateUsagePlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUsagePlanRequest> request = null;
        Response<UpdateUsagePlanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUsagePlanRequestMarshaller().marshall(updateUsagePlanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateUsagePlanResult, JsonUnmarshallerContext> unmarshaller = new UpdateUsagePlanResultJsonUnmarshaller();
            JsonResponseHandler<UpdateUsagePlanResult> responseHandler = new JsonResponseHandler<UpdateUsagePlanResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an existing <a>VpcLink</a> of a specified identifier.
     * </p>
     * 
     * @param updateVpcLinkRequest <p>
     *            Updates an existing <a>VpcLink</a> of a specified identifier.
     *            </p>
     * @return updateVpcLinkResult The response from the UpdateVpcLink service
     *         method, as returned by Amazon API Gateway.
     * @throws UnauthorizedException
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws TooManyRequestsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             API Gateway indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateVpcLinkResult updateVpcLink(UpdateVpcLinkRequest updateVpcLinkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVpcLinkRequest> request = null;
        Response<UpdateVpcLinkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVpcLinkRequestMarshaller().marshall(updateVpcLinkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateVpcLinkResult, JsonUnmarshallerContext> unmarshaller = new UpdateVpcLinkResultJsonUnmarshaller();
            JsonResponseHandler<UpdateVpcLinkResult> responseHandler = new JsonResponseHandler<UpdateVpcLinkResult>(
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
