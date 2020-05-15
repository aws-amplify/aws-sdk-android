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

package com.amazonaws.services.api.ecr;

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

import com.amazonaws.services.api.ecr.model.*;
import com.amazonaws.services.api.ecr.model.transform.*;

/**
 * Client for accessing Amazon EC2 Container Registry. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon Elastic Container Registry</fullname>
 * <p>
 * Amazon Elastic Container Registry (Amazon ECR) is a managed Docker registry
 * service. Customers can use the familiar Docker CLI to push, pull, and manage
 * images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions
 * using IAM so that specific users or Amazon EC2 instances can access
 * repositories and images. Developers can use the Docker CLI to author and
 * manage images.
 * </p>
 */
public class AmazonEC2ContainerRegistryClient extends AmazonWebServiceClient implements
        AmazonEC2ContainerRegistry {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon EC2 Container Registry
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry. A credentials provider chain will be used
     * that searches for credentials in this order:
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
    public AmazonEC2ContainerRegistryClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *            how this client connects to AmazonEC2ContainerRegistry (ex:
     *            proxy settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonEC2ContainerRegistryClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials.
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
     *         AmazonEC2ContainerRegistryClient client = new AmazonEC2ContainerRegistryClient(
     *                 AWSMobileClient.getInstance());
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
    public AmazonEC2ContainerRegistryClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials
     * and client configuration options.
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
     *         AmazonEC2ContainerRegistryClient client = new AmazonEC2ContainerRegistryClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonEC2ContainerRegistry (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonEC2ContainerRegistryClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials
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
     *         AmazonEC2ContainerRegistryClient client = new AmazonEC2ContainerRegistryClient(
     *                 AWSMobileClient.getInstance());
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
    public AmazonEC2ContainerRegistryClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials
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
     *         AmazonEC2ContainerRegistryClient client = new AmazonEC2ContainerRegistryClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonEC2ContainerRegistry (ex:
     *            proxy settings, retry counts, etc.).
     */
    public AmazonEC2ContainerRegistryClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonEC2ContainerRegistry (ex:
     *            proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonEC2ContainerRegistryClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonEC2ContainerRegistry using the specified AWS account credentials
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
     *         AmazonEC2ContainerRegistryClient client = new AmazonEC2ContainerRegistryClient(
     *                 AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonEC2ContainerRegistry (ex:
     *            proxy settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonEC2ContainerRegistryClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new EmptyUploadExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ImageAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ImageNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ImageTagAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLayerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidLayerPartExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidTagParameterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LayerAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LayerInaccessibleExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LayerPartTooSmallExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LayersNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LifecyclePolicyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LifecyclePolicyPreviewInProgressExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LifecyclePolicyPreviewNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ReferencedImagesNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryAlreadyExistsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryNotEmptyExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new RepositoryPolicyNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ScanNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedImageTypeExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UploadNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("api.ecr.us-east-1.amazonaws.com");
        this.endpointPrefix = "api.ecr";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/api.ecr/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/api.ecr/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Checks the availability of one or more image layers in a repository.
     * </p>
     * <p>
     * When an image is pushed to a repository, each image layer is checked to
     * verify if it has been uploaded before. If it has been uploaded, then the
     * image layer is skipped.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @return batchCheckLayerAvailabilityResult The response from the
     *         BatchCheckLayerAvailability service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws RepositoryNotFoundException
     * @throws InvalidParameterException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchCheckLayerAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCheckLayerAvailabilityRequest> request = null;
        Response<BatchCheckLayerAvailabilityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCheckLayerAvailabilityRequestMarshaller()
                        .marshall(batchCheckLayerAvailabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchCheckLayerAvailabilityResult, JsonUnmarshallerContext> unmarshaller = new BatchCheckLayerAvailabilityResultJsonUnmarshaller();
            JsonResponseHandler<BatchCheckLayerAvailabilityResult> responseHandler = new JsonResponseHandler<BatchCheckLayerAvailabilityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a list of specified images within a repository. Images are
     * specified with either an <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * <p>
     * You can remove a tag from an image by specifying the image's tag in your
     * request. When you remove the last tag from an image, the image is deleted
     * from your repository.
     * </p>
     * <p>
     * You can completely delete an image (and all of its tags) by specifying
     * the image's digest in your request.
     * </p>
     * 
     * @param batchDeleteImageRequest <p>
     *            Deletes specified images within a specified repository. Images
     *            are specified with either the <code>imageTag</code> or
     *            <code>imageDigest</code>.
     *            </p>
     * @return batchDeleteImageResult The response from the BatchDeleteImage
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public BatchDeleteImageResult batchDeleteImage(BatchDeleteImageRequest batchDeleteImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDeleteImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteImageRequest> request = null;
        Response<BatchDeleteImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteImageRequestMarshaller().marshall(batchDeleteImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDeleteImageResult, JsonUnmarshallerContext> unmarshaller = new BatchDeleteImageResultJsonUnmarshaller();
            JsonResponseHandler<BatchDeleteImageResult> responseHandler = new JsonResponseHandler<BatchDeleteImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets detailed information for an image. Images are specified with either
     * an <code>imageTag</code> or <code>imageDigest</code>.
     * </p>
     * <p>
     * When an image is pulled, the BatchGetImage API is called once to retrieve
     * the image manifest.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return batchGetImageResult The response from the BatchGetImage service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public BatchGetImageResult batchGetImage(BatchGetImageRequest batchGetImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchGetImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetImageRequest> request = null;
        Response<BatchGetImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetImageRequestMarshaller().marshall(batchGetImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetImageResult, JsonUnmarshallerContext> unmarshaller = new BatchGetImageResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetImageResult> responseHandler = new JsonResponseHandler<BatchGetImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Informs Amazon ECR that the image layer upload has completed for a
     * specified registry, repository name, and upload ID. You can optionally
     * provide a <code>sha256</code> digest of the image layer for data
     * validation purposes.
     * </p>
     * <p>
     * When an image is pushed, the CompleteLayerUpload API is called once per
     * each new image layer to verify that the upload has completed.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @return completeLayerUploadResult The response from the
     *         CompleteLayerUpload service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws UploadNotFoundException
     * @throws InvalidLayerException
     * @throws LayerPartTooSmallException
     * @throws LayerAlreadyExistsException
     * @throws EmptyUploadException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CompleteLayerUploadResult completeLayerUpload(
            CompleteLayerUploadRequest completeLayerUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(completeLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteLayerUploadRequest> request = null;
        Response<CompleteLayerUploadResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteLayerUploadRequestMarshaller()
                        .marshall(completeLayerUploadRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CompleteLayerUploadResult, JsonUnmarshallerContext> unmarshaller = new CompleteLayerUploadResultJsonUnmarshaller();
            JsonResponseHandler<CompleteLayerUploadResult> responseHandler = new JsonResponseHandler<CompleteLayerUploadResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a repository. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html"
     * >Amazon ECR Repositories</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return createRepositoryResult The response from the CreateRepository
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryAlreadyExistsException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public CreateRepositoryResult createRepository(CreateRepositoryRequest createRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryRequest> request = null;
        Response<CreateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryRequestMarshaller().marshall(createRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new CreateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<CreateRepositoryResult> responseHandler = new JsonResponseHandler<CreateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the lifecycle policy associated with the specified repository.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return deleteLifecyclePolicyResult The response from the
     *         DeleteLifecyclePolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteLifecyclePolicyResult deleteLifecyclePolicy(
            DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLifecyclePolicyRequest> request = null;
        Response<DeleteLifecyclePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLifecyclePolicyRequestMarshaller()
                        .marshall(deleteLifecyclePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteLifecyclePolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteLifecyclePolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLifecyclePolicyResult> responseHandler = new JsonResponseHandler<DeleteLifecyclePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a repository. If the repository contains images, you must either
     * delete all images in the repository or use the <code>force</code> option
     * to delete the repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return deleteRepositoryResult The response from the DeleteRepository
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryNotEmptyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteRepositoryResult deleteRepository(DeleteRepositoryRequest deleteRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryRequest> request = null;
        Response<DeleteRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryRequestMarshaller().marshall(deleteRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DeleteRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRepositoryResult> responseHandler = new JsonResponseHandler<DeleteRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes the repository policy associated with the specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return deleteRepositoryPolicyResult The response from the
     *         DeleteRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DeleteRepositoryPolicyResult deleteRepositoryPolicy(
            DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryPolicyRequest> request = null;
        Response<DeleteRepositoryPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryPolicyRequestMarshaller()
                        .marshall(deleteRepositoryPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteRepositoryPolicyResult, JsonUnmarshallerContext> unmarshaller = new DeleteRepositoryPolicyResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRepositoryPolicyResult> responseHandler = new JsonResponseHandler<DeleteRepositoryPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the scan findings for the specified image.
     * </p>
     * 
     * @param describeImageScanFindingsRequest
     * @return describeImageScanFindingsResult The response from the
     *         DescribeImageScanFindings service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws ScanNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeImageScanFindingsResult describeImageScanFindings(
            DescribeImageScanFindingsRequest describeImageScanFindingsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeImageScanFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImageScanFindingsRequest> request = null;
        Response<DescribeImageScanFindingsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImageScanFindingsRequestMarshaller()
                        .marshall(describeImageScanFindingsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeImageScanFindingsResult, JsonUnmarshallerContext> unmarshaller = new DescribeImageScanFindingsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeImageScanFindingsResult> responseHandler = new JsonResponseHandler<DescribeImageScanFindingsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns metadata about the images in a repository.
     * </p>
     * <note>
     * <p>
     * Beginning with Docker version 1.9, the Docker client compresses image
     * layers before pushing them to a V2 Docker registry. The output of the
     * <code>docker images</code> command shows the uncompressed image size, so
     * it may return a larger image size than the image sizes returned by
     * <a>DescribeImages</a>.
     * </p>
     * </note>
     * 
     * @param describeImagesRequest
     * @return describeImagesResult The response from the DescribeImages service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeImagesRequest> request = null;
        Response<DescribeImagesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeImagesRequestMarshaller().marshall(describeImagesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeImagesResult, JsonUnmarshallerContext> unmarshaller = new DescribeImagesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeImagesResult> responseHandler = new JsonResponseHandler<DescribeImagesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return describeRepositoriesResult The response from the
     *         DescribeRepositories service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public DescribeRepositoriesResult describeRepositories(
            DescribeRepositoriesRequest describeRepositoriesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRepositoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoriesRequest> request = null;
        Response<DescribeRepositoriesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoriesRequestMarshaller()
                        .marshall(describeRepositoriesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRepositoriesResult, JsonUnmarshallerContext> unmarshaller = new DescribeRepositoriesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRepositoriesResult> responseHandler = new JsonResponseHandler<DescribeRepositoriesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves an authorization token. An authorization token represents your
     * IAM authentication credentials and can be used to access any Amazon ECR
     * registry that your IAM principal has access to. The authorization token
     * is valid for 12 hours.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned is a base64 encoded string
     * that can be decoded and used in a <code>docker login</code> command to
     * authenticate to a registry. The AWS CLI offers an
     * <code>get-login-password</code> command that simplifies the login
     * process. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/Registries.html#registry_auth"
     * >Registry Authentication</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return getAuthorizationTokenResult The response from the
     *         GetAuthorizationToken service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetAuthorizationTokenResult getAuthorizationToken(
            GetAuthorizationTokenRequest getAuthorizationTokenRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getAuthorizationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAuthorizationTokenRequest> request = null;
        Response<GetAuthorizationTokenResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAuthorizationTokenRequestMarshaller()
                        .marshall(getAuthorizationTokenRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetAuthorizationTokenResult, JsonUnmarshallerContext> unmarshaller = new GetAuthorizationTokenResultJsonUnmarshaller();
            JsonResponseHandler<GetAuthorizationTokenResult> responseHandler = new JsonResponseHandler<GetAuthorizationTokenResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image
     * layer. You can only get URLs for image layers that are referenced in an
     * image.
     * </p>
     * <p>
     * When an image is pulled, the GetDownloadUrlForLayer API is called once
     * per image layer that is not already cached.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @return getDownloadUrlForLayerResult The response from the
     *         GetDownloadUrlForLayer service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws LayersNotFoundException
     * @throws LayerInaccessibleException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetDownloadUrlForLayerResult getDownloadUrlForLayer(
            GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getDownloadUrlForLayerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDownloadUrlForLayerRequest> request = null;
        Response<GetDownloadUrlForLayerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDownloadUrlForLayerRequestMarshaller()
                        .marshall(getDownloadUrlForLayerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetDownloadUrlForLayerResult, JsonUnmarshallerContext> unmarshaller = new GetDownloadUrlForLayerResultJsonUnmarshaller();
            JsonResponseHandler<GetDownloadUrlForLayerResult> responseHandler = new JsonResponseHandler<GetDownloadUrlForLayerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the lifecycle policy for the specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return getLifecyclePolicyResult The response from the GetLifecyclePolicy
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetLifecyclePolicyResult getLifecyclePolicy(
            GetLifecyclePolicyRequest getLifecyclePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLifecyclePolicyRequest> request = null;
        Response<GetLifecyclePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLifecyclePolicyRequestMarshaller()
                        .marshall(getLifecyclePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLifecyclePolicyResult, JsonUnmarshallerContext> unmarshaller = new GetLifecyclePolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetLifecyclePolicyResult> responseHandler = new JsonResponseHandler<GetLifecyclePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the results of the lifecycle policy preview request for the
     * specified repository.
     * </p>
     * 
     * @param getLifecyclePolicyPreviewRequest
     * @return getLifecyclePolicyPreviewResult The response from the
     *         GetLifecyclePolicyPreview service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyPreviewNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(
            GetLifecyclePolicyPreviewRequest getLifecyclePolicyPreviewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getLifecyclePolicyPreviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLifecyclePolicyPreviewRequest> request = null;
        Response<GetLifecyclePolicyPreviewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLifecyclePolicyPreviewRequestMarshaller()
                        .marshall(getLifecyclePolicyPreviewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetLifecyclePolicyPreviewResult, JsonUnmarshallerContext> unmarshaller = new GetLifecyclePolicyPreviewResultJsonUnmarshaller();
            JsonResponseHandler<GetLifecyclePolicyPreviewResult> responseHandler = new JsonResponseHandler<GetLifecyclePolicyPreviewResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Retrieves the repository policy for the specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return getRepositoryPolicyResult The response from the
     *         GetRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws RepositoryPolicyNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public GetRepositoryPolicyResult getRepositoryPolicy(
            GetRepositoryPolicyRequest getRepositoryPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(getRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryPolicyRequest> request = null;
        Response<GetRepositoryPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryPolicyRequestMarshaller()
                        .marshall(getRepositoryPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetRepositoryPolicyResult, JsonUnmarshallerContext> unmarshaller = new GetRepositoryPolicyResultJsonUnmarshaller();
            JsonResponseHandler<GetRepositoryPolicyResult> responseHandler = new JsonResponseHandler<GetRepositoryPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Notifies Amazon ECR that you intend to upload an image layer.
     * </p>
     * <p>
     * When an image is pushed, the InitiateLayerUpload API is called once per
     * image layer that has not already been uploaded. Whether or not an image
     * layer has been uploaded is determined by the BatchCheckLayerAvailability
     * API action.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @return initiateLayerUploadResult The response from the
     *         InitiateLayerUpload service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public InitiateLayerUploadResult initiateLayerUpload(
            InitiateLayerUploadRequest initiateLayerUploadRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(initiateLayerUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitiateLayerUploadRequest> request = null;
        Response<InitiateLayerUploadResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitiateLayerUploadRequestMarshaller()
                        .marshall(initiateLayerUploadRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<InitiateLayerUploadResult, JsonUnmarshallerContext> unmarshaller = new InitiateLayerUploadResultJsonUnmarshaller();
            JsonResponseHandler<InitiateLayerUploadResult> responseHandler = new JsonResponseHandler<InitiateLayerUploadResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all the image IDs for the specified repository.
     * </p>
     * <p>
     * You can filter images based on whether or not they are tagged by using
     * the <code>tagStatus</code> filter and specifying either
     * <code>TAGGED</code>, <code>UNTAGGED</code> or <code>ANY</code>. For
     * example, you can filter your results to return only <code>UNTAGGED</code>
     * images and then pipe that result to a <a>BatchDeleteImage</a> operation
     * to delete them. Or, you can filter your results to return only
     * <code>TAGGED</code> images to list all of the tags in your repository.
     * </p>
     * 
     * @param listImagesRequest
     * @return listImagesResult The response from the ListImages service method,
     *         as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * List the tags for an Amazon ECR resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Creates or updates the image manifest and tags associated with an image.
     * </p>
     * <p>
     * When an image is pushed and all new image layers have been uploaded, the
     * PutImage API is called once to create or update the image manifest and
     * the tags associated with the image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @return putImageResult The response from the PutImage service method, as
     *         returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws ImageAlreadyExistsException
     * @throws LayersNotFoundException
     * @throws ReferencedImagesNotFoundException
     * @throws LimitExceededException
     * @throws ImageTagAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutImageResult putImage(PutImageRequest putImageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageRequest> request = null;
        Response<PutImageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageRequestMarshaller().marshall(putImageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutImageResult, JsonUnmarshallerContext> unmarshaller = new PutImageResultJsonUnmarshaller();
            JsonResponseHandler<PutImageResult> responseHandler = new JsonResponseHandler<PutImageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the image scanning configuration for the specified repository.
     * </p>
     * 
     * @param putImageScanningConfigurationRequest
     * @return putImageScanningConfigurationResult The response from the
     *         PutImageScanningConfiguration service method, as returned by
     *         Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutImageScanningConfigurationResult putImageScanningConfiguration(
            PutImageScanningConfigurationRequest putImageScanningConfigurationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putImageScanningConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageScanningConfigurationRequest> request = null;
        Response<PutImageScanningConfigurationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageScanningConfigurationRequestMarshaller()
                        .marshall(putImageScanningConfigurationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutImageScanningConfigurationResult, JsonUnmarshallerContext> unmarshaller = new PutImageScanningConfigurationResultJsonUnmarshaller();
            JsonResponseHandler<PutImageScanningConfigurationResult> responseHandler = new JsonResponseHandler<PutImageScanningConfigurationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the image tag mutability settings for the specified repository.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-tag-mutability.html"
     * >Image Tag Mutability</a> in the <i>Amazon Elastic Container Registry
     * User Guide</i>.
     * </p>
     * 
     * @param putImageTagMutabilityRequest
     * @return putImageTagMutabilityResult The response from the
     *         PutImageTagMutability service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutImageTagMutabilityResult putImageTagMutability(
            PutImageTagMutabilityRequest putImageTagMutabilityRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putImageTagMutabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutImageTagMutabilityRequest> request = null;
        Response<PutImageTagMutabilityResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutImageTagMutabilityRequestMarshaller()
                        .marshall(putImageTagMutabilityRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutImageTagMutabilityResult, JsonUnmarshallerContext> unmarshaller = new PutImageTagMutabilityResultJsonUnmarshaller();
            JsonResponseHandler<PutImageTagMutabilityResult> responseHandler = new JsonResponseHandler<PutImageTagMutabilityResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates or updates the lifecycle policy for the specified repository. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html"
     * >Lifecycle Policy Template</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return putLifecyclePolicyResult The response from the PutLifecyclePolicy
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public PutLifecyclePolicyResult putLifecyclePolicy(
            PutLifecyclePolicyRequest putLifecyclePolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putLifecyclePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecyclePolicyRequest> request = null;
        Response<PutLifecyclePolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecyclePolicyRequestMarshaller()
                        .marshall(putLifecyclePolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutLifecyclePolicyResult, JsonUnmarshallerContext> unmarshaller = new PutLifecyclePolicyResultJsonUnmarshaller();
            JsonResponseHandler<PutLifecyclePolicyResult> responseHandler = new JsonResponseHandler<PutLifecyclePolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Applies a repository policy to the specified repository to control access
     * permissions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policies.html"
     * >Amazon ECR Repository Policies</a> in the <i>Amazon Elastic Container
     * Registry User Guide</i>.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return setRepositoryPolicyResult The response from the
     *         SetRepositoryPolicy service method, as returned by Amazon EC2
     *         Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public SetRepositoryPolicyResult setRepositoryPolicy(
            SetRepositoryPolicyRequest setRepositoryPolicyRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(setRepositoryPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetRepositoryPolicyRequest> request = null;
        Response<SetRepositoryPolicyResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetRepositoryPolicyRequestMarshaller()
                        .marshall(setRepositoryPolicyRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SetRepositoryPolicyResult, JsonUnmarshallerContext> unmarshaller = new SetRepositoryPolicyResultJsonUnmarshaller();
            JsonResponseHandler<SetRepositoryPolicyResult> responseHandler = new JsonResponseHandler<SetRepositoryPolicyResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an image vulnerability scan. An image scan can only be started
     * once per day on an individual image. This limit includes if an image was
     * scanned on initial push. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html"
     * >Image Scanning</a> in the <i>Amazon Elastic Container Registry User
     * Guide</i>.
     * </p>
     * 
     * @param startImageScanRequest
     * @return startImageScanResult The response from the StartImageScan service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws UnsupportedImageTypeException
     * @throws LimitExceededException
     * @throws RepositoryNotFoundException
     * @throws ImageNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StartImageScanResult startImageScan(StartImageScanRequest startImageScanRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startImageScanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImageScanRequest> request = null;
        Response<StartImageScanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImageScanRequestMarshaller().marshall(startImageScanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartImageScanResult, JsonUnmarshallerContext> unmarshaller = new StartImageScanResultJsonUnmarshaller();
            JsonResponseHandler<StartImageScanResult> responseHandler = new JsonResponseHandler<StartImageScanResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts a preview of a lifecycle policy for the specified repository. This
     * allows you to see the results before associating the lifecycle policy
     * with the repository.
     * </p>
     * 
     * @param startLifecyclePolicyPreviewRequest
     * @return startLifecyclePolicyPreviewResult The response from the
     *         StartLifecyclePolicyPreview service method, as returned by Amazon
     *         EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws RepositoryNotFoundException
     * @throws LifecyclePolicyNotFoundException
     * @throws LifecyclePolicyPreviewInProgressException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public StartLifecyclePolicyPreviewResult startLifecyclePolicyPreview(
            StartLifecyclePolicyPreviewRequest startLifecyclePolicyPreviewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startLifecyclePolicyPreviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLifecyclePolicyPreviewRequest> request = null;
        Response<StartLifecyclePolicyPreviewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLifecyclePolicyPreviewRequestMarshaller()
                        .marshall(startLifecyclePolicyPreviewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartLifecyclePolicyPreviewResult, JsonUnmarshallerContext> unmarshaller = new StartLifecyclePolicyPreviewResultJsonUnmarshaller();
            JsonResponseHandler<StartLifecyclePolicyPreviewResult> responseHandler = new JsonResponseHandler<StartLifecyclePolicyPreviewResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Adds specified tags to a resource with the specified ARN. Existing tags
     * on a resource are not changed if they are not specified in the request
     * parameters.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon EC2 Container Registry.
     * @throws InvalidParameterException
     * @throws InvalidTagParameterException
     * @throws TooManyTagsException
     * @throws RepositoryNotFoundException
     * @throws ServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
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
     * Uploads an image layer part to Amazon ECR.
     * </p>
     * <p>
     * When an image is pushed, each new image layer is uploaded in parts. The
     * maximum size of each image layer part can be 20971520 bytes (or about
     * 20MB). The UploadLayerPart API is called once per each new image layer
     * part.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy and is not generally used
     * by customers for pulling and pushing images. In most cases, you should
     * use the <code>docker</code> CLI to pull, tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @return uploadLayerPartResult The response from the UploadLayerPart
     *         service method, as returned by Amazon EC2 Container Registry.
     * @throws ServerException
     * @throws InvalidParameterException
     * @throws InvalidLayerPartException
     * @throws RepositoryNotFoundException
     * @throws UploadNotFoundException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             EC2 Container Registry indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    public UploadLayerPartResult uploadLayerPart(UploadLayerPartRequest uploadLayerPartRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(uploadLayerPartRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadLayerPartRequest> request = null;
        Response<UploadLayerPartResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadLayerPartRequestMarshaller().marshall(uploadLayerPartRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UploadLayerPartResult, JsonUnmarshallerContext> unmarshaller = new UploadLayerPartResultJsonUnmarshaller();
            JsonResponseHandler<UploadLayerPartResult> responseHandler = new JsonResponseHandler<UploadLayerPartResult>(
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
