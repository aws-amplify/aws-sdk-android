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

package com.amazonaws.services.imagebuilder;

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

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.services.imagebuilder.model.transform.*;

/**
 * Client for accessing EC2 Image Builder. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * EC2 Image Builder is a fully managed AWS service that makes it easier to
 * automate the creation, management, and deployment of customized, secure, and
 * up-to-date “golden” server images that are pre-installed and pre-configured
 * with software and settings to meet specific IT standards.
 * </p>
 */
public class EC2ImageBuilderClient extends AmazonWebServiceClient implements EC2ImageBuilder {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all EC2 Image Builder exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder. A
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
    public EC2ImageBuilderClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder. A
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
     *            how this client connects to EC2ImageBuilder (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public EC2ImageBuilderClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *         EC2ImageBuilderClient client = new EC2ImageBuilderClient(AWSMobileClient.getInstance());
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
    public EC2ImageBuilderClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *         EC2ImageBuilderClient client = new EC2ImageBuilderClient(AWSMobileClient.getInstance());
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
     *            how this client connects to EC2ImageBuilder (ex: proxy
     *            settings, retry counts, etc.).
     */
    public EC2ImageBuilderClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *         EC2ImageBuilderClient client = new EC2ImageBuilderClient(AWSMobileClient.getInstance());
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
    public EC2ImageBuilderClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *         EC2ImageBuilderClient client = new EC2ImageBuilderClient(AWSMobileClient.getInstance());
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
     *            how this client connects to EC2ImageBuilder (ex: proxy
     *            settings, retry counts, etc.).
     */
    public EC2ImageBuilderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *            how this client connects to EC2ImageBuilder (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public EC2ImageBuilderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on EC2ImageBuilder
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
     *         EC2ImageBuilderClient client = new EC2ImageBuilderClient(AWSMobileClient.getInstance());
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
     *            how this client connects to EC2ImageBuilder (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public EC2ImageBuilderClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new CallRateLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ClientExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ForbiddenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidPaginationTokenExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterCombinationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValueExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidVersionNumberExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceDependencyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("imagebuilder.us-east-1.amazonaws.com");
        this.endpointPrefix = "imagebuilder";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/imagebuilder/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/imagebuilder/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * CancelImageCreation cancels the creation of Image. This operation can
     * only be used on images in a non-terminal state.
     * </p>
     * 
     * @param cancelImageCreationRequest
     * @return cancelImageCreationResult The response from the
     *         CancelImageCreation service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CancelImageCreationResult cancelImageCreation(
            CancelImageCreationRequest cancelImageCreationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(cancelImageCreationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelImageCreationRequest> request = null;
        Response<CancelImageCreationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelImageCreationRequestMarshaller()
                        .marshall(cancelImageCreationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CancelImageCreationResult, JsonUnmarshallerContext> unmarshaller = new CancelImageCreationResultJsonUnmarshaller();
            JsonResponseHandler<CancelImageCreationResult> responseHandler = new JsonResponseHandler<CancelImageCreationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new component that can be used to build, validate, test, and
     * assess your image.
     * </p>
     * 
     * @param createComponentRequest
     * @return createComponentResult The response from the CreateComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateComponentResult createComponent(CreateComponentRequest createComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComponentRequest> request = null;
        Response<CreateComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComponentRequestMarshaller().marshall(createComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateComponentResult, JsonUnmarshallerContext> unmarshaller = new CreateComponentResultJsonUnmarshaller();
            JsonResponseHandler<CreateComponentResult> responseHandler = new JsonResponseHandler<CreateComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new distribution configuration. Distribution configurations
     * define and configure the outputs of your pipeline.
     * </p>
     * 
     * @param createDistributionConfigurationRequest
     * @return createDistributionConfigurationResult The response from the
     *         CreateDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateDistributionConfigurationResult createDistributionConfiguration(
            CreateDistributionConfigurationRequest createDistributionConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionConfigurationRequest> request = null;
        Response<CreateDistributionConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDistributionConfigurationRequestMarshaller()
                        .marshall(createDistributionConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDistributionConfigurationResult, JsonUnmarshallerContext> unmarshaller = new CreateDistributionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<CreateDistributionConfigurationResult> responseHandler = new JsonResponseHandler<CreateDistributionConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new image. This request will create a new image along with all
     * of the configured output resources defined in the distribution
     * configuration.
     * </p>
     * 
     * @param createImageRequest
     * @return createImageResult The response from the CreateImage service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateImageResult createImage(CreateImageRequest createImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageRequest> request = null;
        Response<CreateImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageRequestMarshaller().marshall(createImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateImageResult, JsonUnmarshallerContext> unmarshaller = new CreateImageResultJsonUnmarshaller();
            JsonResponseHandler<CreateImageResult> responseHandler = new JsonResponseHandler<CreateImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new image pipeline. Image pipelines enable you to automate the
     * creation and distribution of images.
     * </p>
     * 
     * @param createImagePipelineRequest
     * @return createImagePipelineResult The response from the
     *         CreateImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateImagePipelineResult createImagePipeline(
            CreateImagePipelineRequest createImagePipelineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImagePipelineRequest> request = null;
        Response<CreateImagePipelineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImagePipelineRequestMarshaller()
                        .marshall(createImagePipelineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateImagePipelineResult, JsonUnmarshallerContext> unmarshaller = new CreateImagePipelineResultJsonUnmarshaller();
            JsonResponseHandler<CreateImagePipelineResult> responseHandler = new JsonResponseHandler<CreateImagePipelineResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new image recipe. Image recipes define how images are
     * configured, tested, and assessed.
     * </p>
     * 
     * @param createImageRecipeRequest
     * @return createImageRecipeResult The response from the CreateImageRecipe
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateImageRecipeResult createImageRecipe(
            CreateImageRecipeRequest createImageRecipeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateImageRecipeRequest> request = null;
        Response<CreateImageRecipeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateImageRecipeRequestMarshaller()
                        .marshall(createImageRecipeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateImageRecipeResult, JsonUnmarshallerContext> unmarshaller = new CreateImageRecipeResultJsonUnmarshaller();
            JsonResponseHandler<CreateImageRecipeResult> responseHandler = new JsonResponseHandler<CreateImageRecipeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new infrastructure configuration. An infrastructure
     * configuration defines the environment in which your image will be built
     * and tested.
     * </p>
     * 
     * @param createInfrastructureConfigurationRequest
     * @return createInfrastructureConfigurationResult The response from the
     *         CreateInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws ResourceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public CreateInfrastructureConfigurationResult createInfrastructureConfiguration(
            CreateInfrastructureConfigurationRequest createInfrastructureConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInfrastructureConfigurationRequest> request = null;
        Response<CreateInfrastructureConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInfrastructureConfigurationRequestMarshaller()
                        .marshall(createInfrastructureConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateInfrastructureConfigurationResult, JsonUnmarshallerContext> unmarshaller = new CreateInfrastructureConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<CreateInfrastructureConfigurationResult> responseHandler = new JsonResponseHandler<CreateInfrastructureConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a component build version.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return deleteComponentResult The response from the DeleteComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteComponentRequest> request = null;
        Response<DeleteComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteComponentRequestMarshaller().marshall(deleteComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteComponentResult, JsonUnmarshallerContext> unmarshaller = new DeleteComponentResultJsonUnmarshaller();
            JsonResponseHandler<DeleteComponentResult> responseHandler = new JsonResponseHandler<DeleteComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a distribution configuration.
     * </p>
     * 
     * @param deleteDistributionConfigurationRequest
     * @return deleteDistributionConfigurationResult The response from the
     *         DeleteDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteDistributionConfigurationResult deleteDistributionConfiguration(
            DeleteDistributionConfigurationRequest deleteDistributionConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDistributionConfigurationRequest> request = null;
        Response<DeleteDistributionConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDistributionConfigurationRequestMarshaller()
                        .marshall(deleteDistributionConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDistributionConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DeleteDistributionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDistributionConfigurationResult> responseHandler = new JsonResponseHandler<DeleteDistributionConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return deleteImageResult The response from the DeleteImage service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws InvalidRequestException
     * @throws ServiceUnavailableException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageRequest> request = null;
        Response<DeleteImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageRequestMarshaller().marshall(deleteImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteImageResult, JsonUnmarshallerContext> unmarshaller = new DeleteImageResultJsonUnmarshaller();
            JsonResponseHandler<DeleteImageResult> responseHandler = new JsonResponseHandler<DeleteImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an image pipeline.
     * </p>
     * 
     * @param deleteImagePipelineRequest
     * @return deleteImagePipelineResult The response from the
     *         DeleteImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteImagePipelineResult deleteImagePipeline(
            DeleteImagePipelineRequest deleteImagePipelineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImagePipelineRequest> request = null;
        Response<DeleteImagePipelineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImagePipelineRequestMarshaller()
                        .marshall(deleteImagePipelineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteImagePipelineResult, JsonUnmarshallerContext> unmarshaller = new DeleteImagePipelineResultJsonUnmarshaller();
            JsonResponseHandler<DeleteImagePipelineResult> responseHandler = new JsonResponseHandler<DeleteImagePipelineResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an image recipe.
     * </p>
     * 
     * @param deleteImageRecipeRequest
     * @return deleteImageRecipeResult The response from the DeleteImageRecipe
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteImageRecipeResult deleteImageRecipe(
            DeleteImageRecipeRequest deleteImageRecipeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageRecipeRequest> request = null;
        Response<DeleteImageRecipeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageRecipeRequestMarshaller()
                        .marshall(deleteImageRecipeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteImageRecipeResult, JsonUnmarshallerContext> unmarshaller = new DeleteImageRecipeResultJsonUnmarshaller();
            JsonResponseHandler<DeleteImageRecipeResult> responseHandler = new JsonResponseHandler<DeleteImageRecipeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an infrastructure configuration.
     * </p>
     * 
     * @param deleteInfrastructureConfigurationRequest
     * @return deleteInfrastructureConfigurationResult The response from the
     *         DeleteInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceDependencyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public DeleteInfrastructureConfigurationResult deleteInfrastructureConfiguration(
            DeleteInfrastructureConfigurationRequest deleteInfrastructureConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInfrastructureConfigurationRequest> request = null;
        Response<DeleteInfrastructureConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInfrastructureConfigurationRequestMarshaller()
                        .marshall(deleteInfrastructureConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteInfrastructureConfigurationResult, JsonUnmarshallerContext> unmarshaller = new DeleteInfrastructureConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteInfrastructureConfigurationResult> responseHandler = new JsonResponseHandler<DeleteInfrastructureConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a component object.
     * </p>
     * 
     * @param getComponentRequest
     * @return getComponentResult The response from the GetComponent service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetComponentResult getComponent(GetComponentRequest getComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentRequest> request = null;
        Response<GetComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentRequestMarshaller().marshall(getComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetComponentResult, JsonUnmarshallerContext> unmarshaller = new GetComponentResultJsonUnmarshaller();
            JsonResponseHandler<GetComponentResult> responseHandler = new JsonResponseHandler<GetComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a component policy.
     * </p>
     * 
     * @param getComponentPolicyRequest
     * @return getComponentPolicyResult The response from the GetComponentPolicy
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetComponentPolicyResult getComponentPolicy(
            GetComponentPolicyRequest getComponentPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getComponentPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetComponentPolicyRequest> request = null;
        Response<GetComponentPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetComponentPolicyRequestMarshaller()
                        .marshall(getComponentPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetComponentPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetComponentPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetComponentPolicyResult> responseHandler = new JsonResponseHandler<GetComponentPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a distribution configuration.
     * </p>
     * 
     * @param getDistributionConfigurationRequest
     * @return getDistributionConfigurationResult The response from the
     *         GetDistributionConfiguration service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetDistributionConfigurationResult getDistributionConfiguration(
            GetDistributionConfigurationRequest getDistributionConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionConfigurationRequest> request = null;
        Response<GetDistributionConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionConfigurationRequestMarshaller()
                        .marshall(getDistributionConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDistributionConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetDistributionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetDistributionConfigurationResult> responseHandler = new JsonResponseHandler<GetDistributionConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an image.
     * </p>
     * 
     * @param getImageRequest
     * @return getImageResult The response from the GetImage service method, as
     *         returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImageResult getImage(GetImageRequest getImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRequest> request = null;
        Response<GetImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRequestMarshaller().marshall(getImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImageResult, JsonUnmarshallerContext> unmarshaller = new GetImageResultJsonUnmarshaller();
            JsonResponseHandler<GetImageResult> responseHandler = new JsonResponseHandler<GetImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an image pipeline.
     * </p>
     * 
     * @param getImagePipelineRequest
     * @return getImagePipelineResult The response from the GetImagePipeline
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImagePipelineResult getImagePipeline(GetImagePipelineRequest getImagePipelineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImagePipelineRequest> request = null;
        Response<GetImagePipelineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImagePipelineRequestMarshaller().marshall(getImagePipelineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImagePipelineResult, JsonUnmarshallerContext> unmarshaller = new GetImagePipelineResultJsonUnmarshaller();
            JsonResponseHandler<GetImagePipelineResult> responseHandler = new JsonResponseHandler<GetImagePipelineResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an image policy.
     * </p>
     * 
     * @param getImagePolicyRequest
     * @return getImagePolicyResult The response from the GetImagePolicy service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImagePolicyResult getImagePolicy(GetImagePolicyRequest getImagePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImagePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImagePolicyRequest> request = null;
        Response<GetImagePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImagePolicyRequestMarshaller().marshall(getImagePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImagePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetImagePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetImagePolicyResult> responseHandler = new JsonResponseHandler<GetImagePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an image recipe.
     * </p>
     * 
     * @param getImageRecipeRequest
     * @return getImageRecipeResult The response from the GetImageRecipe service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImageRecipeResult getImageRecipe(GetImageRecipeRequest getImageRecipeRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImageRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRecipeRequest> request = null;
        Response<GetImageRecipeResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRecipeRequestMarshaller().marshall(getImageRecipeRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImageRecipeResult, JsonUnmarshallerContext> unmarshaller = new GetImageRecipeResultJsonUnmarshaller();
            JsonResponseHandler<GetImageRecipeResult> responseHandler = new JsonResponseHandler<GetImageRecipeResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an image recipe policy.
     * </p>
     * 
     * @param getImageRecipePolicyRequest
     * @return getImageRecipePolicyResult The response from the
     *         GetImageRecipePolicy service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetImageRecipePolicyResult getImageRecipePolicy(
            GetImageRecipePolicyRequest getImageRecipePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getImageRecipePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageRecipePolicyRequest> request = null;
        Response<GetImageRecipePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageRecipePolicyRequestMarshaller()
                        .marshall(getImageRecipePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetImageRecipePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetImageRecipePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetImageRecipePolicyResult> responseHandler = new JsonResponseHandler<GetImageRecipePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets an infrastructure configuration.
     * </p>
     * 
     * @param getInfrastructureConfigurationRequest <p>
     *            GetInfrastructureConfiguration request object.
     *            </p>
     * @return getInfrastructureConfigurationResult The response from the
     *         GetInfrastructureConfiguration service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public GetInfrastructureConfigurationResult getInfrastructureConfiguration(
            GetInfrastructureConfigurationRequest getInfrastructureConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInfrastructureConfigurationRequest> request = null;
        Response<GetInfrastructureConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInfrastructureConfigurationRequestMarshaller()
                        .marshall(getInfrastructureConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetInfrastructureConfigurationResult, JsonUnmarshallerContext> unmarshaller = new GetInfrastructureConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<GetInfrastructureConfigurationResult> responseHandler = new JsonResponseHandler<GetInfrastructureConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Imports a component and transforms its data into a component document.
     * </p>
     * 
     * @param importComponentRequest
     * @return importComponentResult The response from the ImportComponent
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws InvalidVersionNumberException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ImportComponentResult importComponent(ImportComponentRequest importComponentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(importComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportComponentRequest> request = null;
        Response<ImportComponentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportComponentRequestMarshaller().marshall(importComponentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ImportComponentResult, JsonUnmarshallerContext> unmarshaller = new ImportComponentResultJsonUnmarshaller();
            JsonResponseHandler<ImportComponentResult> responseHandler = new JsonResponseHandler<ImportComponentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listComponentBuildVersionsRequest
     * @return listComponentBuildVersionsResult The response from the
     *         ListComponentBuildVersions service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListComponentBuildVersionsResult listComponentBuildVersions(
            ListComponentBuildVersionsRequest listComponentBuildVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listComponentBuildVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentBuildVersionsRequest> request = null;
        Response<ListComponentBuildVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentBuildVersionsRequestMarshaller()
                        .marshall(listComponentBuildVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListComponentBuildVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListComponentBuildVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListComponentBuildVersionsResult> responseHandler = new JsonResponseHandler<ListComponentBuildVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of component build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listComponentsRequest
     * @return listComponentsResult The response from the ListComponents service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComponentsRequest> request = null;
        Response<ListComponentsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComponentsRequestMarshaller().marshall(listComponentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListComponentsResult, JsonUnmarshallerContext> unmarshaller = new ListComponentsResultJsonUnmarshaller();
            JsonResponseHandler<ListComponentsResult> responseHandler = new JsonResponseHandler<ListComponentsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listDistributionConfigurationsRequest
     * @return listDistributionConfigurationsResult The response from the
     *         ListDistributionConfigurations service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListDistributionConfigurationsResult listDistributionConfigurations(
            ListDistributionConfigurationsRequest listDistributionConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDistributionConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionConfigurationsRequest> request = null;
        Response<ListDistributionConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionConfigurationsRequestMarshaller()
                        .marshall(listDistributionConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDistributionConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new ListDistributionConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<ListDistributionConfigurationsResult> responseHandler = new JsonResponseHandler<ListDistributionConfigurationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of distribution configurations.
     * </p>
     * 
     * @param listImageBuildVersionsRequest
     * @return listImageBuildVersionsResult The response from the
     *         ListImageBuildVersions service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImageBuildVersionsResult listImageBuildVersions(
            ListImageBuildVersionsRequest listImageBuildVersionsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImageBuildVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImageBuildVersionsRequest> request = null;
        Response<ListImageBuildVersionsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImageBuildVersionsRequestMarshaller()
                        .marshall(listImageBuildVersionsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListImageBuildVersionsResult, JsonUnmarshallerContext> unmarshaller = new ListImageBuildVersionsResultJsonUnmarshaller();
            JsonResponseHandler<ListImageBuildVersionsResult> responseHandler = new JsonResponseHandler<ListImageBuildVersionsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of images created by the specified pipeline.
     * </p>
     * 
     * @param listImagePipelineImagesRequest
     * @return listImagePipelineImagesResult The response from the
     *         ListImagePipelineImages service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImagePipelineImagesResult listImagePipelineImages(
            ListImagePipelineImagesRequest listImagePipelineImagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImagePipelineImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagePipelineImagesRequest> request = null;
        Response<ListImagePipelineImagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagePipelineImagesRequestMarshaller()
                        .marshall(listImagePipelineImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListImagePipelineImagesResult, JsonUnmarshallerContext> unmarshaller = new ListImagePipelineImagesResultJsonUnmarshaller();
            JsonResponseHandler<ListImagePipelineImagesResult> responseHandler = new JsonResponseHandler<ListImagePipelineImagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of image pipelines.
     * </p>
     * 
     * @param listImagePipelinesRequest
     * @return listImagePipelinesResult The response from the ListImagePipelines
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImagePipelinesResult listImagePipelines(
            ListImagePipelinesRequest listImagePipelinesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImagePipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagePipelinesRequest> request = null;
        Response<ListImagePipelinesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagePipelinesRequestMarshaller()
                        .marshall(listImagePipelinesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListImagePipelinesResult, JsonUnmarshallerContext> unmarshaller = new ListImagePipelinesResultJsonUnmarshaller();
            JsonResponseHandler<ListImagePipelinesResult> responseHandler = new JsonResponseHandler<ListImagePipelinesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of image recipes.
     * </p>
     * 
     * @param listImageRecipesRequest
     * @return listImageRecipesResult The response from the ListImageRecipes
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImageRecipesResult listImageRecipes(ListImageRecipesRequest listImageRecipesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImageRecipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImageRecipesRequest> request = null;
        Response<ListImageRecipesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImageRecipesRequestMarshaller().marshall(listImageRecipesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListImageRecipesResult, JsonUnmarshallerContext> unmarshaller = new ListImageRecipesResultJsonUnmarshaller();
            JsonResponseHandler<ListImageRecipesResult> responseHandler = new JsonResponseHandler<ListImageRecipesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of image build versions for the specified semantic
     * version.
     * </p>
     * 
     * @param listImagesRequest
     * @return listImagesResult The response from the ListImages service method,
     *         as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListImagesResult listImages(ListImagesRequest listImagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImagesRequest> request = null;
        Response<ListImagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImagesRequestMarshaller().marshall(listImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListImagesResult, JsonUnmarshallerContext> unmarshaller = new ListImagesResultJsonUnmarshaller();
            JsonResponseHandler<ListImagesResult> responseHandler = new JsonResponseHandler<ListImagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of infrastructure configurations.
     * </p>
     * 
     * @param listInfrastructureConfigurationsRequest
     * @return listInfrastructureConfigurationsResult The response from the
     *         ListInfrastructureConfigurations service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidPaginationTokenException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public ListInfrastructureConfigurationsResult listInfrastructureConfigurations(
            ListInfrastructureConfigurationsRequest listInfrastructureConfigurationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listInfrastructureConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInfrastructureConfigurationsRequest> request = null;
        Response<ListInfrastructureConfigurationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInfrastructureConfigurationsRequestMarshaller()
                        .marshall(listInfrastructureConfigurationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListInfrastructureConfigurationsResult, JsonUnmarshallerContext> unmarshaller = new ListInfrastructureConfigurationsResultJsonUnmarshaller();
            JsonResponseHandler<ListInfrastructureConfigurationsResult> responseHandler = new JsonResponseHandler<ListInfrastructureConfigurationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
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
     * Applies a policy to a component. We recommend that you call the RAM API
     * <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutComponentPolicy</code>, you must also call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putComponentPolicyRequest
     * @return putComponentPolicyResult The response from the PutComponentPolicy
     *         service method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutComponentPolicyResult putComponentPolicy(
            PutComponentPolicyRequest putComponentPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putComponentPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutComponentPolicyRequest> request = null;
        Response<PutComponentPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutComponentPolicyRequestMarshaller()
                        .marshall(putComponentPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutComponentPolicyResult, JsonUnmarshallerContext> unmarshaller = new PutComponentPolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutComponentPolicyResult> responseHandler = new JsonResponseHandler<PutComponentPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Applies a policy to an image. We recommend that you call the RAM API <a
     * href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutImagePolicy</code>, you must also call the RAM API
     * <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putImagePolicyRequest
     * @return putImagePolicyResult The response from the PutImagePolicy service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutImagePolicyResult putImagePolicy(PutImagePolicyRequest putImagePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putImagePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImagePolicyRequest> request = null;
        Response<PutImagePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImagePolicyRequestMarshaller().marshall(putImagePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutImagePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutImagePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutImagePolicyResult> responseHandler = new JsonResponseHandler<PutImagePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Applies a policy to an image recipe. We recommend that you call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html"
     * >CreateResourceShare</a> to share resources. If you call the Image
     * Builder API <code>PutImageRecipePolicy</code>, you must also call the RAM
     * API <a href=
     * "https://docs.aws.amazon.com/ram/latest/APIReference/API_PromoteResourceShareCreatedFromPolicy.html"
     * >PromoteResourceShareCreatedFromPolicy</a> in order for the resource to
     * be visible to all principals with whom the resource is shared.
     * </p>
     * 
     * @param putImageRecipePolicyRequest
     * @return putImageRecipePolicyResult The response from the
     *         PutImageRecipePolicy service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public PutImageRecipePolicyResult putImageRecipePolicy(
            PutImageRecipePolicyRequest putImageRecipePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putImageRecipePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageRecipePolicyRequest> request = null;
        Response<PutImageRecipePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageRecipePolicyRequestMarshaller()
                        .marshall(putImageRecipePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutImageRecipePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutImageRecipePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutImageRecipePolicyResult> responseHandler = new JsonResponseHandler<PutImageRecipePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Manually triggers a pipeline to create an image.
     * </p>
     * 
     * @param startImagePipelineExecutionRequest
     * @return startImagePipelineExecutionResult The response from the
     *         StartImagePipelineExecution service method, as returned by EC2
     *         Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public StartImagePipelineExecutionResult startImagePipelineExecution(
            StartImagePipelineExecutionRequest startImagePipelineExecutionRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startImagePipelineExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImagePipelineExecutionRequest> request = null;
        Response<StartImagePipelineExecutionResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImagePipelineExecutionRequestMarshaller()
                        .marshall(startImagePipelineExecutionRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartImagePipelineExecutionResult, JsonUnmarshallerContext> unmarshaller = new StartImagePipelineExecutionResultJsonUnmarshaller();
            JsonResponseHandler<StartImagePipelineExecutionResult> responseHandler = new JsonResponseHandler<StartImagePipelineExecutionResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by EC2 Image Builder.
     * @throws ServiceException
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
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
     * Updates a new distribution configuration. Distribution configurations
     * define and configure the outputs of your pipeline.
     * </p>
     * 
     * @param updateDistributionConfigurationRequest
     * @return updateDistributionConfigurationResult The response from the
     *         UpdateDistributionConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws InvalidParameterCombinationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateDistributionConfigurationResult updateDistributionConfiguration(
            UpdateDistributionConfigurationRequest updateDistributionConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateDistributionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistributionConfigurationRequest> request = null;
        Response<UpdateDistributionConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDistributionConfigurationRequestMarshaller()
                        .marshall(updateDistributionConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateDistributionConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateDistributionConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDistributionConfigurationResult> responseHandler = new JsonResponseHandler<UpdateDistributionConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a new image pipeline. Image pipelines enable you to automate the
     * creation and distribution of images.
     * </p>
     * 
     * @param updateImagePipelineRequest
     * @return updateImagePipelineResult The response from the
     *         UpdateImagePipeline service method, as returned by EC2 Image
     *         Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateImagePipelineResult updateImagePipeline(
            UpdateImagePipelineRequest updateImagePipelineRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateImagePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateImagePipelineRequest> request = null;
        Response<UpdateImagePipelineResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateImagePipelineRequestMarshaller()
                        .marshall(updateImagePipelineRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateImagePipelineResult, JsonUnmarshallerContext> unmarshaller = new UpdateImagePipelineResultJsonUnmarshaller();
            JsonResponseHandler<UpdateImagePipelineResult> responseHandler = new JsonResponseHandler<UpdateImagePipelineResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates a new infrastructure configuration. An infrastructure
     * configuration defines the environment in which your image will be built
     * and tested.
     * </p>
     * 
     * @param updateInfrastructureConfigurationRequest
     * @return updateInfrastructureConfigurationResult The response from the
     *         UpdateInfrastructureConfiguration service method, as returned by
     *         EC2 Image Builder.
     * @throws ServiceException
     * @throws ClientException
     * @throws ServiceUnavailableException
     * @throws InvalidRequestException
     * @throws IdempotentParameterMismatchException
     * @throws ForbiddenException
     * @throws CallRateLimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by EC2
     *             Image Builder indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    public UpdateInfrastructureConfigurationResult updateInfrastructureConfiguration(
            UpdateInfrastructureConfigurationRequest updateInfrastructureConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateInfrastructureConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInfrastructureConfigurationRequest> request = null;
        Response<UpdateInfrastructureConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInfrastructureConfigurationRequestMarshaller()
                        .marshall(updateInfrastructureConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateInfrastructureConfigurationResult, JsonUnmarshallerContext> unmarshaller = new UpdateInfrastructureConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateInfrastructureConfigurationResult> responseHandler = new JsonResponseHandler<UpdateInfrastructureConfigurationResult>(
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
