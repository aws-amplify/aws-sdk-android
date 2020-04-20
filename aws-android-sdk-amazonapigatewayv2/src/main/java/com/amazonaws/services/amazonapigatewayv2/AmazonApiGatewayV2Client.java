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

package com.amazonaws.services.amazonapigatewayv2;

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

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.services.amazonapigatewayv2.model.transform.*;

/**
 * Client for accessing AmazonApiGatewayV2. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon API Gateway V2
 * </p>
 */
public class AmazonApiGatewayV2Client extends AmazonWebServiceClient implements AmazonApiGatewayV2 {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonApiGatewayV2 exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
    public AmazonApiGatewayV2Client() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
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
     *            how this client connects to AmazonApiGatewayV2 (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonApiGatewayV2Client(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *         AmazonApiGatewayV2Client client = new AmazonApiGatewayV2Client(AWSMobileClient
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
    public AmazonApiGatewayV2Client(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *         AmazonApiGatewayV2Client client = new AmazonApiGatewayV2Client(AWSMobileClient
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
     *            how this client connects to AmazonApiGatewayV2 (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonApiGatewayV2Client(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *         AmazonApiGatewayV2Client client = new AmazonApiGatewayV2Client(AWSMobileClient
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
    public AmazonApiGatewayV2Client(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *         AmazonApiGatewayV2Client client = new AmazonApiGatewayV2Client(AWSMobileClient
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
     *            how this client connects to AmazonApiGatewayV2 (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonApiGatewayV2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *            how this client connects to AmazonApiGatewayV2 (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonApiGatewayV2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonApiGatewayV2
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
     *         AmazonApiGatewayV2Client client = new AmazonApiGatewayV2Client(AWSMobileClient
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
     *            how this client connects to AmazonApiGatewayV2 (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonApiGatewayV2Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new BadRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConflictExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("apigateway.us-east-1.amazonaws.com");
        this.endpointPrefix = "apigateway";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazonapigatewayv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazonapigatewayv2/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates an Api resource.
     * </p>
     * 
     * @param createApiRequest <p>
     *            Creates a new Api resource to represent an API.
     *            </p>
     * @return createApiResult The response from the CreateApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateApiResult createApi(CreateApiRequest createApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiRequest> request = null;
        Response<CreateApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiRequestMarshaller().marshall(createApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApiResult, JsonUnmarshallerContext> unmarshaller = new CreateApiResultJsonUnmarshaller();
            JsonResponseHandler<CreateApiResult> responseHandler = new JsonResponseHandler<CreateApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an API mapping.
     * </p>
     * 
     * @param createApiMappingRequest <p>
     *            Creates a new ApiMapping resource to represent an API mapping.
     *            </p>
     * @return createApiMappingResult The response from the CreateApiMapping
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateApiMappingResult createApiMapping(CreateApiMappingRequest createApiMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApiMappingRequest> request = null;
        Response<CreateApiMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApiMappingRequestMarshaller().marshall(createApiMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateApiMappingResult, JsonUnmarshallerContext> unmarshaller = new CreateApiMappingResultJsonUnmarshaller();
            JsonResponseHandler<CreateApiMappingResult> responseHandler = new JsonResponseHandler<CreateApiMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an Authorizer for an API.
     * </p>
     * 
     * @param createAuthorizerRequest <p>
     *            Creates a new Authorizer resource to represent an authorizer.
     *            </p>
     * @return createAuthorizerResult The response from the CreateAuthorizer
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates a Deployment for an API.
     * </p>
     * 
     * @param createDeploymentRequest <p>
     *            Creates a new Deployment resource to represent a deployment.
     *            </p>
     * @return createDeploymentResult The response from the CreateDeployment
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates a domain name.
     * </p>
     * 
     * @param createDomainNameRequest <p>
     *            Creates a new DomainName resource to represent a domain name.
     *            </p>
     * @return createDomainNameResult The response from the CreateDomainName
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AccessDeniedException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates an Integration.
     * </p>
     * 
     * @param createIntegrationRequest <p>
     *            Creates a new Integration resource to represent an
     *            integration.
     *            </p>
     * @return createIntegrationResult The response from the CreateIntegration
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateIntegrationResult createIntegration(
            CreateIntegrationRequest createIntegrationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntegrationRequest> request = null;
        Response<CreateIntegrationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntegrationRequestMarshaller()
                        .marshall(createIntegrationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIntegrationResult, JsonUnmarshallerContext> unmarshaller = new CreateIntegrationResultJsonUnmarshaller();
            JsonResponseHandler<CreateIntegrationResult> responseHandler = new JsonResponseHandler<CreateIntegrationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an IntegrationResponses.
     * </p>
     * 
     * @param createIntegrationResponseRequest <p>
     *            Creates a new IntegrationResponse resource to represent an
     *            integration response.
     *            </p>
     * @return createIntegrationResponseResult The response from the
     *         CreateIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateIntegrationResponseResult createIntegrationResponse(
            CreateIntegrationResponseRequest createIntegrationResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createIntegrationResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntegrationResponseRequest> request = null;
        Response<CreateIntegrationResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntegrationResponseRequestMarshaller()
                        .marshall(createIntegrationResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateIntegrationResponseResult, JsonUnmarshallerContext> unmarshaller = new CreateIntegrationResponseResultJsonUnmarshaller();
            JsonResponseHandler<CreateIntegrationResponseResult> responseHandler = new JsonResponseHandler<CreateIntegrationResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Model for an API.
     * </p>
     * 
     * @param createModelRequest <p>
     *            Creates a new Model.
     *            </p>
     * @return createModelResult The response from the CreateModel service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates a Route for an API.
     * </p>
     * 
     * @param createRouteRequest <p>
     *            Creates a new Route resource to represent a route.
     *            </p>
     * @return createRouteResult The response from the CreateRoute service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateRouteResult createRoute(CreateRouteRequest createRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteRequest> request = null;
        Response<CreateRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteRequestMarshaller().marshall(createRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRouteResult, JsonUnmarshallerContext> unmarshaller = new CreateRouteResultJsonUnmarshaller();
            JsonResponseHandler<CreateRouteResult> responseHandler = new JsonResponseHandler<CreateRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a RouteResponse for a Route.
     * </p>
     * 
     * @param createRouteResponseRequest <p>
     *            Creates a new RouteResponse resource to represent a route
     *            response.
     *            </p>
     * @return createRouteResponseResult The response from the
     *         CreateRouteResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public CreateRouteResponseResult createRouteResponse(
            CreateRouteResponseRequest createRouteResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteResponseRequest> request = null;
        Response<CreateRouteResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteResponseRequestMarshaller()
                        .marshall(createRouteResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRouteResponseResult, JsonUnmarshallerContext> unmarshaller = new CreateRouteResponseResultJsonUnmarshaller();
            JsonResponseHandler<CreateRouteResponseResult> responseHandler = new JsonResponseHandler<CreateRouteResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a Stage for an API.
     * </p>
     * 
     * @param createStageRequest <p>
     *            Creates a new Stage resource to represent a stage.
     *            </p>
     * @return createStageResult The response from the CreateStage service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Creates a VPC link.
     * </p>
     * 
     * @param createVpcLinkRequest <p>
     *            Creates a VPC link
     *            </p>
     * @return createVpcLinkResult The response from the CreateVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes the AccessLogSettings for a Stage. To disable access logging for
     * a Stage, delete its AccessLogSettings.
     * </p>
     * 
     * @param deleteAccessLogSettingsRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteAccessLogSettings(
            DeleteAccessLogSettingsRequest deleteAccessLogSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteAccessLogSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccessLogSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccessLogSettingsRequestMarshaller()
                        .marshall(deleteAccessLogSettingsRequest);
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
     * Deletes an Api resource.
     * </p>
     * 
     * @param deleteApiRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteApi(DeleteApiRequest deleteApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiRequestMarshaller().marshall(deleteApiRequest);
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
     * Deletes an API mapping.
     * </p>
     * 
     * @param deleteApiMappingRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteApiMapping(DeleteApiMappingRequest deleteApiMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApiMappingRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApiMappingRequestMarshaller().marshall(deleteApiMappingRequest);
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
     * Deletes an Authorizer.
     * </p>
     * 
     * @param deleteAuthorizerRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes a CORS configuration.
     * </p>
     * 
     * @param deleteCorsConfigurationRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteCorsConfiguration(
            DeleteCorsConfigurationRequest deleteCorsConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteCorsConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCorsConfigurationRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCorsConfigurationRequestMarshaller()
                        .marshall(deleteCorsConfigurationRequest);
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
     * Deletes a Deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * <p>
     * Deletes a domain name.
     * </p>
     * 
     * @param deleteDomainNameRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes an Integration.
     * </p>
     * 
     * @param deleteIntegrationRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes an IntegrationResponses.
     * </p>
     * 
     * @param deleteIntegrationResponseRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes a Model.
     * </p>
     * 
     * @param deleteModelRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes a Route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteRoute(DeleteRouteRequest deleteRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestMarshaller().marshall(deleteRouteRequest);
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
     * Deletes a route request parameter.
     * </p>
     * 
     * @param deleteRouteRequestParameterRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteRouteRequestParameter(
            DeleteRouteRequestParameterRequest deleteRouteRequestParameterRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRouteRequestParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequestParameterRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestParameterRequestMarshaller()
                        .marshall(deleteRouteRequestParameterRequest);
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
     * Deletes a RouteResponse.
     * </p>
     * 
     * @param deleteRouteResponseRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteRouteResponse(DeleteRouteResponseRequest deleteRouteResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteResponseRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteResponseRequestMarshaller()
                        .marshall(deleteRouteResponseRequest);
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
     * Deletes the RouteSettings for a stage.
     * </p>
     * 
     * @param deleteRouteSettingsRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public void deleteRouteSettings(DeleteRouteSettingsRequest deleteRouteSettingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRouteSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteSettingsRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteSettingsRequestMarshaller()
                        .marshall(deleteRouteSettingsRequest);
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
     * Deletes a Stage.
     * </p>
     * 
     * @param deleteStageRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes a VPC link.
     * </p>
     * 
     * @param deleteVpcLinkRequest
     * @return deleteVpcLinkResult The response from the DeleteVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest deleteVpcLinkRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteVpcLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVpcLinkRequest> request = null;
        Response<DeleteVpcLinkResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVpcLinkRequestMarshaller().marshall(deleteVpcLinkRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteVpcLinkResult, JsonUnmarshallerContext> unmarshaller = new DeleteVpcLinkResultJsonUnmarshaller();
            JsonResponseHandler<DeleteVpcLinkResult> responseHandler = new JsonResponseHandler<DeleteVpcLinkResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * @param exportApiRequest
     * @return exportApiResult The response from the ExportApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ExportApiResult exportApi(ExportApiRequest exportApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(exportApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportApiRequest> request = null;
        Response<ExportApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportApiRequestMarshaller().marshall(exportApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ExportApiResult, JsonUnmarshallerContext> unmarshaller = new ExportApiResultJsonUnmarshaller();
            JsonResponseHandler<ExportApiResult> responseHandler = new JsonResponseHandler<ExportApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an Api resource.
     * </p>
     * 
     * @param getApiRequest
     * @return getApiResult The response from the GetApi service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetApiResult getApi(GetApiRequest getApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiRequest> request = null;
        Response<GetApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiRequestMarshaller().marshall(getApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApiResult, JsonUnmarshallerContext> unmarshaller = new GetApiResultJsonUnmarshaller();
            JsonResponseHandler<GetApiResult> responseHandler = new JsonResponseHandler<GetApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an API mapping.
     * </p>
     * 
     * @param getApiMappingRequest
     * @return getApiMappingResult The response from the GetApiMapping service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetApiMappingResult getApiMapping(GetApiMappingRequest getApiMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiMappingRequest> request = null;
        Response<GetApiMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiMappingRequestMarshaller().marshall(getApiMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApiMappingResult, JsonUnmarshallerContext> unmarshaller = new GetApiMappingResultJsonUnmarshaller();
            JsonResponseHandler<GetApiMappingResult> responseHandler = new JsonResponseHandler<GetApiMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets API mappings.
     * </p>
     * 
     * @param getApiMappingsRequest
     * @return getApiMappingsResult The response from the GetApiMappings service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetApiMappingsResult getApiMappings(GetApiMappingsRequest getApiMappingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApiMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApiMappingsRequest> request = null;
        Response<GetApiMappingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApiMappingsRequestMarshaller().marshall(getApiMappingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApiMappingsResult, JsonUnmarshallerContext> unmarshaller = new GetApiMappingsResultJsonUnmarshaller();
            JsonResponseHandler<GetApiMappingsResult> responseHandler = new JsonResponseHandler<GetApiMappingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a collection of Api resources.
     * </p>
     * 
     * @param getApisRequest
     * @return getApisResult The response from the GetApis service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetApisResult getApis(GetApisRequest getApisRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getApisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApisRequest> request = null;
        Response<GetApisResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApisRequestMarshaller().marshall(getApisRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetApisResult, JsonUnmarshallerContext> unmarshaller = new GetApisResultJsonUnmarshaller();
            JsonResponseHandler<GetApisResult> responseHandler = new JsonResponseHandler<GetApisResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an Authorizer.
     * </p>
     * 
     * @param getAuthorizerRequest
     * @return getAuthorizerResult The response from the GetAuthorizer service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the Authorizers for an API.
     * </p>
     * 
     * @param getAuthorizersRequest
     * @return getAuthorizersResult The response from the GetAuthorizers service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a Deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return getDeploymentResult The response from the GetDeployment service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the Deployments for an API.
     * </p>
     * 
     * @param getDeploymentsRequest
     * @return getDeploymentsResult The response from the GetDeployments service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * <p>
     * Gets a domain name.
     * </p>
     * 
     * @param getDomainNameRequest
     * @return getDomainNameResult The response from the GetDomainName service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the domain names for an AWS account.
     * </p>
     * 
     * @param getDomainNamesRequest
     * @return getDomainNamesResult The response from the GetDomainNames service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets an Integration.
     * </p>
     * 
     * @param getIntegrationRequest
     * @return getIntegrationResult The response from the GetIntegration service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets an IntegrationResponses.
     * </p>
     * 
     * @param getIntegrationResponseRequest
     * @return getIntegrationResponseResult The response from the
     *         GetIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the IntegrationResponses for an Integration.
     * </p>
     * 
     * @param getIntegrationResponsesRequest
     * @return getIntegrationResponsesResult The response from the
     *         GetIntegrationResponses service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetIntegrationResponsesResult getIntegrationResponses(
            GetIntegrationResponsesRequest getIntegrationResponsesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIntegrationResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationResponsesRequest> request = null;
        Response<GetIntegrationResponsesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationResponsesRequestMarshaller()
                        .marshall(getIntegrationResponsesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIntegrationResponsesResult, JsonUnmarshallerContext> unmarshaller = new GetIntegrationResponsesResultJsonUnmarshaller();
            JsonResponseHandler<GetIntegrationResponsesResult> responseHandler = new JsonResponseHandler<GetIntegrationResponsesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the Integrations for an API.
     * </p>
     * 
     * @param getIntegrationsRequest
     * @return getIntegrationsResult The response from the GetIntegrations
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetIntegrationsResult getIntegrations(GetIntegrationsRequest getIntegrationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getIntegrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIntegrationsRequest> request = null;
        Response<GetIntegrationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIntegrationsRequestMarshaller().marshall(getIntegrationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetIntegrationsResult, JsonUnmarshallerContext> unmarshaller = new GetIntegrationsResultJsonUnmarshaller();
            JsonResponseHandler<GetIntegrationsResult> responseHandler = new JsonResponseHandler<GetIntegrationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a Model.
     * </p>
     * 
     * @param getModelRequest
     * @return getModelResult The response from the GetModel service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a model template.
     * </p>
     * 
     * @param getModelTemplateRequest
     * @return getModelTemplateResult The response from the GetModelTemplate
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the Models for an API.
     * </p>
     * 
     * @param getModelsRequest
     * @return getModelsResult The response from the GetModels service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a Route.
     * </p>
     * 
     * @param getRouteRequest
     * @return getRouteResult The response from the GetRoute service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetRouteResult getRoute(GetRouteRequest getRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteRequest> request = null;
        Response<GetRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteRequestMarshaller().marshall(getRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRouteResult, JsonUnmarshallerContext> unmarshaller = new GetRouteResultJsonUnmarshaller();
            JsonResponseHandler<GetRouteResult> responseHandler = new JsonResponseHandler<GetRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a RouteResponse.
     * </p>
     * 
     * @param getRouteResponseRequest
     * @return getRouteResponseResult The response from the GetRouteResponse
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetRouteResponseResult getRouteResponse(GetRouteResponseRequest getRouteResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteResponseRequest> request = null;
        Response<GetRouteResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteResponseRequestMarshaller().marshall(getRouteResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRouteResponseResult, JsonUnmarshallerContext> unmarshaller = new GetRouteResponseResultJsonUnmarshaller();
            JsonResponseHandler<GetRouteResponseResult> responseHandler = new JsonResponseHandler<GetRouteResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the RouteResponses for a Route.
     * </p>
     * 
     * @param getRouteResponsesRequest
     * @return getRouteResponsesResult The response from the GetRouteResponses
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetRouteResponsesResult getRouteResponses(
            GetRouteResponsesRequest getRouteResponsesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRouteResponsesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteResponsesRequest> request = null;
        Response<GetRouteResponsesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteResponsesRequestMarshaller()
                        .marshall(getRouteResponsesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRouteResponsesResult, JsonUnmarshallerContext> unmarshaller = new GetRouteResponsesResultJsonUnmarshaller();
            JsonResponseHandler<GetRouteResponsesResult> responseHandler = new JsonResponseHandler<GetRouteResponsesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the Routes for an API.
     * </p>
     * 
     * @param getRoutesRequest
     * @return getRoutesResult The response from the GetRoutes service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public GetRoutesResult getRoutes(GetRoutesRequest getRoutesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoutesRequest> request = null;
        Response<GetRoutesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoutesRequestMarshaller().marshall(getRoutesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRoutesResult, JsonUnmarshallerContext> unmarshaller = new GetRoutesResultJsonUnmarshaller();
            JsonResponseHandler<GetRoutesResult> responseHandler = new JsonResponseHandler<GetRoutesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a Stage.
     * </p>
     * 
     * @param getStageRequest
     * @return getStageResult The response from the GetStage service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets the Stages for an API.
     * </p>
     * 
     * @param getStagesRequest
     * @return getStagesResult The response from the GetStages service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a collection of Tag resources.
     * </p>
     * 
     * @param getTagsRequest
     * @return getTagsResult The response from the GetTags service method, as
     *         returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a VPC link.
     * </p>
     * 
     * @param getVpcLinkRequest
     * @return getVpcLinkResult The response from the GetVpcLink service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Gets a collection of VPC links.
     * </p>
     * 
     * @param getVpcLinksRequest
     * @return getVpcLinksResult The response from the GetVpcLinks service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Imports an API.
     * </p>
     * 
     * @param importApiRequest <p>
     *            </p>
     * @return importApiResult The response from the ImportApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ImportApiResult importApi(ImportApiRequest importApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportApiRequest> request = null;
        Response<ImportApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportApiRequestMarshaller().marshall(importApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportApiResult, JsonUnmarshallerContext> unmarshaller = new ImportApiResultJsonUnmarshaller();
            JsonResponseHandler<ImportApiResult> responseHandler = new JsonResponseHandler<ImportApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Puts an Api resource.
     * </p>
     * 
     * @param reimportApiRequest <p>
     *            </p>
     * @return reimportApiResult The response from the ReimportApi service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ReimportApiResult reimportApi(ReimportApiRequest reimportApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(reimportApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReimportApiRequest> request = null;
        Response<ReimportApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReimportApiRequestMarshaller().marshall(reimportApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ReimportApiResult, JsonUnmarshallerContext> unmarshaller = new ReimportApiResultJsonUnmarshaller();
            JsonResponseHandler<ReimportApiResult> responseHandler = new JsonResponseHandler<ReimportApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new Tag resource to represent a tag.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            Creates a new Tag resource to represent a tag.
     *            </p>
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Deletes a Tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates an Api resource.
     * </p>
     * 
     * @param updateApiRequest <p>
     *            Updates an Api.
     *            </p>
     * @return updateApiResult The response from the UpdateApi service method,
     *         as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateApiResult updateApi(UpdateApiRequest updateApiRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApiRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiRequest> request = null;
        Response<UpdateApiResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiRequestMarshaller().marshall(updateApiRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApiResult, JsonUnmarshallerContext> unmarshaller = new UpdateApiResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApiResult> responseHandler = new JsonResponseHandler<UpdateApiResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The API mapping.
     * </p>
     * 
     * @param updateApiMappingRequest <p>
     *            Updates an ApiMapping.
     *            </p>
     * @return updateApiMappingResult The response from the UpdateApiMapping
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateApiMappingResult updateApiMapping(UpdateApiMappingRequest updateApiMappingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateApiMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApiMappingRequest> request = null;
        Response<UpdateApiMappingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApiMappingRequestMarshaller().marshall(updateApiMappingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateApiMappingResult, JsonUnmarshallerContext> unmarshaller = new UpdateApiMappingResultJsonUnmarshaller();
            JsonResponseHandler<UpdateApiMappingResult> responseHandler = new JsonResponseHandler<UpdateApiMappingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates an Authorizer.
     * </p>
     * 
     * @param updateAuthorizerRequest <p>
     *            Updates an Authorizer.
     *            </p>
     * @return updateAuthorizerResult The response from the UpdateAuthorizer
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates a Deployment.
     * </p>
     * 
     * @param updateDeploymentRequest <p>
     *            Updates a Deployment.
     *            </p>
     * @return updateDeploymentResult The response from the UpdateDeployment
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * <p>
     * Updates a domain name.
     * </p>
     * 
     * @param updateDomainNameRequest <p>
     *            Updates a DomainName.
     *            </p>
     * @return updateDomainNameResult The response from the UpdateDomainName
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates an Integration.
     * </p>
     * 
     * @param updateIntegrationRequest <p>
     *            Updates an Integration.
     *            </p>
     * @return updateIntegrationResult The response from the UpdateIntegration
     *         service method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates an IntegrationResponses.
     * </p>
     * 
     * @param updateIntegrationResponseRequest <p>
     *            Updates an IntegrationResponses.
     *            </p>
     * @return updateIntegrationResponseResult The response from the
     *         UpdateIntegrationResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates a Model.
     * </p>
     * 
     * @param updateModelRequest <p>
     *            Updates a Model.
     *            </p>
     * @return updateModelResult The response from the UpdateModel service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates a Route.
     * </p>
     * 
     * @param updateRouteRequest <p>
     *            Updates a Route.
     *            </p>
     * @return updateRouteResult The response from the UpdateRoute service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteRequest> request = null;
        Response<UpdateRouteResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteRequestMarshaller().marshall(updateRouteRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRouteResult, JsonUnmarshallerContext> unmarshaller = new UpdateRouteResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRouteResult> responseHandler = new JsonResponseHandler<UpdateRouteResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a RouteResponse.
     * </p>
     * 
     * @param updateRouteResponseRequest <p>
     *            Updates a RouteResponse.
     *            </p>
     * @return updateRouteResponseResult The response from the
     *         UpdateRouteResponse service method, as returned by
     *         AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public UpdateRouteResponseResult updateRouteResponse(
            UpdateRouteResponseRequest updateRouteResponseRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRouteResponseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteResponseRequest> request = null;
        Response<UpdateRouteResponseResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteResponseRequestMarshaller()
                        .marshall(updateRouteResponseRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRouteResponseResult, JsonUnmarshallerContext> unmarshaller = new UpdateRouteResponseResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRouteResponseResult> responseHandler = new JsonResponseHandler<UpdateRouteResponseResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a Stage.
     * </p>
     * 
     * @param updateStageRequest <p>
     *            Updates a Stage.
     *            </p>
     * @return updateStageResult The response from the UpdateStage service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws ConflictException <p>
     *             The resource already exists.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
     * Updates a VPC link.
     * </p>
     * 
     * @param updateVpcLinkRequest <p>
     *            Updates a VPC link.
     *            </p>
     * @return updateVpcLinkResult The response from the UpdateVpcLink service
     *         method, as returned by AmazonApiGatewayV2.
     * @throws NotFoundException <p>
     *             The resource specified in the request was not found.
     *             </p>
     * @throws TooManyRequestsException <p>
     *             The client is sending more than the allowed number of
     *             requests per unit of time.
     *             </p>
     * @throws BadRequestException <p>
     *             One of the parameters in the request is invalid.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AmazonApiGatewayV2 indicating either a problem with the data
     *             in the request, or a server side issue.
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
