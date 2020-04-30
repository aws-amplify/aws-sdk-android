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

package com.amazonaws.services.schemas;

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

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.services.schemas.model.transform.*;

/**
 * Client for accessing Schemas. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon EventBridge Schema Registry
 * </p>
 */
public class SchemasClient extends AmazonWebServiceClient implements Schemas {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Schemas exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on Schemas. A
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
    public SchemasClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Schemas. A
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
     *            how this client connects to Schemas (ex: proxy settings, retry
     *            counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public SchemasClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *         SchemasClient client = new SchemasClient(AWSMobileClient.getInstance());
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
    public SchemasClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *         SchemasClient client = new SchemasClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Schemas (ex: proxy settings, retry
     *            counts, etc.).
     */
    public SchemasClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *         SchemasClient client = new SchemasClient(AWSMobileClient.getInstance());
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
    public SchemasClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *         SchemasClient client = new SchemasClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Schemas (ex: proxy settings, retry
     *            counts, etc.).
     */
    public SchemasClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *            how this client connects to Schemas (ex: proxy settings, retry
     *            counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public SchemasClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on Schemas using the
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
     *         SchemasClient client = new SchemasClient(AWSMobileClient.getInstance());
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
     *            how this client connects to Schemas (ex: proxy settings, retry
     *            counts, etc.).
     * @param httpClient A http client
     */
    public SchemasClient(AWSCredentialsProvider awsCredentialsProvider,
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
        jsonErrorUnmarshallers.add(new GoneExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnauthorizedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("schemas.us-east-1.amazonaws.com");
        this.endpointPrefix = "schemas";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/schemas/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/schemas/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @return createDiscovererResult The response from the CreateDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDiscovererResult createDiscoverer(CreateDiscovererRequest createDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDiscovererRequest> request = null;
        Response<CreateDiscovererResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDiscovererRequestMarshaller().marshall(createDiscovererRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDiscovererResult, JsonUnmarshallerContext> unmarshaller = new CreateDiscovererResultJsonUnmarshaller();
            JsonResponseHandler<CreateDiscovererResult> responseHandler = new JsonResponseHandler<CreateDiscovererResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @return createRegistryResult The response from the CreateRegistry service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws ConflictException <p>
     *             409 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateRegistryResult createRegistry(CreateRegistryRequest createRegistryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRegistryRequest> request = null;
        Response<CreateRegistryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRegistryRequestMarshaller().marshall(createRegistryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRegistryResult, JsonUnmarshallerContext> unmarshaller = new CreateRegistryResultJsonUnmarshaller();
            JsonResponseHandler<CreateRegistryResult> responseHandler = new JsonResponseHandler<CreateRegistryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * <note>
     * <p>
     * Inactive schemas will be deleted after two years.
     * </p>
     * </note>
     * 
     * @param createSchemaRequest
     * @return createSchemaResult The response from the CreateSchema service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaRequest> request = null;
        Response<CreateSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaRequestMarshaller().marshall(createSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateSchemaResult, JsonUnmarshallerContext> unmarshaller = new CreateSchemaResultJsonUnmarshaller();
            JsonResponseHandler<CreateSchemaResult> responseHandler = new JsonResponseHandler<CreateSchemaResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteDiscoverer(DeleteDiscovererRequest deleteDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDiscovererRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDiscovererRequestMarshaller().marshall(deleteDiscovererRequest);
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
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteRegistry(DeleteRegistryRequest deleteRegistryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRegistryRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRegistryRequestMarshaller().marshall(deleteRegistryRequest);
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
     * Delete the resource-based policy attached to the specified registry.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<Void> response = null;
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
            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
            invoke(request, responseHandler, executionContext);
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSchema(DeleteSchemaRequest deleteSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaRequestMarshaller().marshall(deleteSchemaRequest);
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
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public void deleteSchemaVersion(DeleteSchemaVersionRequest deleteSchemaVersionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteSchemaVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaVersionRequest> request = null;
        Response<Void> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaVersionRequestMarshaller()
                        .marshall(deleteSchemaVersionRequest);
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
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @return describeCodeBindingResult The response from the
     *         DescribeCodeBinding service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeCodeBindingResult describeCodeBinding(
            DescribeCodeBindingRequest describeCodeBindingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCodeBindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCodeBindingRequest> request = null;
        Response<DescribeCodeBindingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCodeBindingRequestMarshaller()
                        .marshall(describeCodeBindingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCodeBindingResult, JsonUnmarshallerContext> unmarshaller = new DescribeCodeBindingResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCodeBindingResult> responseHandler = new JsonResponseHandler<DescribeCodeBindingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @return describeDiscovererResult The response from the DescribeDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDiscovererResult describeDiscoverer(
            DescribeDiscovererRequest describeDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDiscovererRequest> request = null;
        Response<DescribeDiscovererResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDiscovererRequestMarshaller()
                        .marshall(describeDiscovererRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDiscovererResult, JsonUnmarshallerContext> unmarshaller = new DescribeDiscovererResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDiscovererResult> responseHandler = new JsonResponseHandler<DescribeDiscovererResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @return describeRegistryResult The response from the DescribeRegistry
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeRegistryResult describeRegistry(DescribeRegistryRequest describeRegistryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRegistryRequest> request = null;
        Response<DescribeRegistryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRegistryRequestMarshaller().marshall(describeRegistryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRegistryResult, JsonUnmarshallerContext> unmarshaller = new DescribeRegistryResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRegistryResult> responseHandler = new JsonResponseHandler<DescribeRegistryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return describeSchemaResult The response from the DescribeSchema service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemaRequest> request = null;
        Response<DescribeSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemaRequestMarshaller().marshall(describeSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSchemaResult, JsonUnmarshallerContext> unmarshaller = new DescribeSchemaResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSchemaResult> responseHandler = new JsonResponseHandler<DescribeSchemaResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @return getCodeBindingSourceResult The response from the
     *         GetCodeBindingSource service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetCodeBindingSourceResult getCodeBindingSource(
            GetCodeBindingSourceRequest getCodeBindingSourceRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getCodeBindingSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCodeBindingSourceRequest> request = null;
        Response<GetCodeBindingSourceResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCodeBindingSourceRequestMarshaller()
                        .marshall(getCodeBindingSourceRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetCodeBindingSourceResult, JsonUnmarshallerContext> unmarshaller = new GetCodeBindingSourceResultJsonUnmarshaller();
            JsonResponseHandler<GetCodeBindingSourceResult> responseHandler = new JsonResponseHandler<GetCodeBindingSourceResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @return getDiscoveredSchemaResult The response from the
     *         GetDiscoveredSchema service method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public GetDiscoveredSchemaResult getDiscoveredSchema(
            GetDiscoveredSchemaRequest getDiscoveredSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDiscoveredSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDiscoveredSchemaRequest> request = null;
        Response<GetDiscoveredSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDiscoveredSchemaRequestMarshaller()
                        .marshall(getDiscoveredSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDiscoveredSchemaResult, JsonUnmarshallerContext> unmarshaller = new GetDiscoveredSchemaResultJsonUnmarshaller();
            JsonResponseHandler<GetDiscoveredSchemaResult> responseHandler = new JsonResponseHandler<GetDiscoveredSchemaResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the resource-based policy attached to a given registry.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return getResourcePolicyResult The response from the GetResourcePolicy
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
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
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @return listDiscoverersResult The response from the ListDiscoverers
     *         service method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDiscoverersResult listDiscoverers(ListDiscoverersRequest listDiscoverersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDiscoverersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoverersRequest> request = null;
        Response<ListDiscoverersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoverersRequestMarshaller().marshall(listDiscoverersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDiscoverersResult, JsonUnmarshallerContext> unmarshaller = new ListDiscoverersResultJsonUnmarshaller();
            JsonResponseHandler<ListDiscoverersResult> responseHandler = new JsonResponseHandler<ListDiscoverersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return listRegistriesResult The response from the ListRegistries service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListRegistriesResult listRegistries(ListRegistriesRequest listRegistriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRegistriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRegistriesRequest> request = null;
        Response<ListRegistriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRegistriesRequestMarshaller().marshall(listRegistriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRegistriesResult, JsonUnmarshallerContext> unmarshaller = new ListRegistriesResultJsonUnmarshaller();
            JsonResponseHandler<ListRegistriesResult> responseHandler = new JsonResponseHandler<ListRegistriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return listSchemaVersionsResult The response from the ListSchemaVersions
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSchemaVersionsResult listSchemaVersions(
            ListSchemaVersionsRequest listSchemaVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSchemaVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemaVersionsRequest> request = null;
        Response<ListSchemaVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemaVersionsRequestMarshaller()
                        .marshall(listSchemaVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSchemaVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListSchemaVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListSchemaVersionsResult> responseHandler = new JsonResponseHandler<ListSchemaVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @return listSchemasResult The response from the ListSchemas service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestMarshaller().marshall(listSchemasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSchemasResult, JsonUnmarshallerContext> unmarshaller = new ListSchemasResultJsonUnmarshaller();
            JsonResponseHandler<ListSchemasResult> responseHandler = new JsonResponseHandler<ListSchemasResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Schemas.
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
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
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @return putCodeBindingResult The response from the PutCodeBinding service
     *         method, as returned by Schemas.
     * @throws GoneException <p>
     *             410 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws TooManyRequestsException <p>
     *             429 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public PutCodeBindingResult putCodeBinding(PutCodeBindingRequest putCodeBindingRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putCodeBindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCodeBindingRequest> request = null;
        Response<PutCodeBindingResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCodeBindingRequestMarshaller().marshall(putCodeBindingRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutCodeBindingResult, JsonUnmarshallerContext> unmarshaller = new PutCodeBindingResultJsonUnmarshaller();
            JsonResponseHandler<PutCodeBindingResult> responseHandler = new JsonResponseHandler<PutCodeBindingResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param putResourcePolicyRequest <p>
     *            The name of the policy.
     *            </p>
     * @return putResourcePolicyResult The response from the PutResourcePolicy
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws PreconditionFailedException <p>
     *             412 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
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
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @return searchSchemasResult The response from the SearchSchemas service
     *         method, as returned by Schemas.
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public SearchSchemasResult searchSchemas(SearchSchemasRequest searchSchemasRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(searchSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSchemasRequest> request = null;
        Response<SearchSchemasResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSchemasRequestMarshaller().marshall(searchSchemasRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchSchemasResult, JsonUnmarshallerContext> unmarshaller = new SearchSchemasResultJsonUnmarshaller();
            JsonResponseHandler<SearchSchemasResult> responseHandler = new JsonResponseHandler<SearchSchemasResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @return startDiscovererResult The response from the StartDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartDiscovererResult startDiscoverer(StartDiscovererRequest startDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDiscovererRequest> request = null;
        Response<StartDiscovererResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDiscovererRequestMarshaller().marshall(startDiscovererRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartDiscovererResult, JsonUnmarshallerContext> unmarshaller = new StartDiscovererResultJsonUnmarshaller();
            JsonResponseHandler<StartDiscovererResult> responseHandler = new JsonResponseHandler<StartDiscovererResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @return stopDiscovererResult The response from the StopDiscoverer service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopDiscovererResult stopDiscoverer(StopDiscovererRequest stopDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDiscovererRequest> request = null;
        Response<StopDiscovererResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDiscovererRequestMarshaller().marshall(stopDiscovererRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopDiscovererResult, JsonUnmarshallerContext> unmarshaller = new StopDiscovererResultJsonUnmarshaller();
            JsonResponseHandler<StopDiscovererResult> responseHandler = new JsonResponseHandler<StopDiscovererResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest <p>
     *            </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
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
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @return updateDiscovererResult The response from the UpdateDiscoverer
     *         service method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateDiscovererResult updateDiscoverer(UpdateDiscovererRequest updateDiscovererRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDiscovererRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDiscovererRequest> request = null;
        Response<UpdateDiscovererResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDiscovererRequestMarshaller().marshall(updateDiscovererRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDiscovererResult, JsonUnmarshallerContext> unmarshaller = new UpdateDiscovererResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDiscovererResult> responseHandler = new JsonResponseHandler<UpdateDiscovererResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest <p>
     *            Updates the registry.
     *            </p>
     * @return updateRegistryResult The response from the UpdateRegistry service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws UnauthorizedException <p>
     *             401 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateRegistryResult updateRegistry(UpdateRegistryRequest updateRegistryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateRegistryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRegistryRequest> request = null;
        Response<UpdateRegistryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRegistryRequestMarshaller().marshall(updateRegistryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateRegistryResult, JsonUnmarshallerContext> unmarshaller = new UpdateRegistryResultJsonUnmarshaller();
            JsonResponseHandler<UpdateRegistryResult> responseHandler = new JsonResponseHandler<UpdateRegistryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * <note>
     * <p>
     * Inactive schemas will be deleted after two years.
     * </p>
     * </note>
     * 
     * @param updateSchemaRequest
     * @return updateSchemaResult The response from the UpdateSchema service
     *         method, as returned by Schemas.
     * @throws BadRequestException <p>
     *             400 response
     *             </p>
     * @throws InternalServerErrorException <p>
     *             500 response
     *             </p>
     * @throws ForbiddenException <p>
     *             403 response
     *             </p>
     * @throws NotFoundException <p>
     *             404 response
     *             </p>
     * @throws ServiceUnavailableException <p>
     *             503 response
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Schemas indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateSchemaResult updateSchema(UpdateSchemaRequest updateSchemaRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSchemaRequest> request = null;
        Response<UpdateSchemaResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSchemaRequestMarshaller().marshall(updateSchemaRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateSchemaResult, JsonUnmarshallerContext> unmarshaller = new UpdateSchemaResultJsonUnmarshaller();
            JsonResponseHandler<UpdateSchemaResult> responseHandler = new JsonResponseHandler<UpdateSchemaResult>(
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
