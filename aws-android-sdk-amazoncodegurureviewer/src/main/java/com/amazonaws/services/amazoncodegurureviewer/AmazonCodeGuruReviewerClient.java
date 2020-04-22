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

package com.amazonaws.services.amazoncodegurureviewer;

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

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.services.amazoncodegurureviewer.model.transform.*;

/**
 * Client for accessing Amazon CodeGuru Reviewer. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Reviewer API
 * operations.
 * </p>
 */
public class AmazonCodeGuruReviewerClient extends AmazonWebServiceClient implements
        AmazonCodeGuruReviewer {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon CodeGuru Reviewer
     * exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer. A credentials provider chain will be used that
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
    public AmazonCodeGuruReviewerClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer. A credentials provider chain will be used that
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
     *            how this client connects to AmazonCodeGuruReviewer (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonCodeGuruReviewerClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials.
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
     *         AmazonCodeGuruReviewerClient client = new AmazonCodeGuruReviewerClient(AWSMobileClient
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
    public AmazonCodeGuruReviewerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials and
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
     *         AmazonCodeGuruReviewerClient client = new AmazonCodeGuruReviewerClient(AWSMobileClient
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
     *            how this client connects to AmazonCodeGuruReviewer (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCodeGuruReviewerClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials
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
     *         AmazonCodeGuruReviewerClient client = new AmazonCodeGuruReviewerClient(AWSMobileClient
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
    public AmazonCodeGuruReviewerClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials
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
     *         AmazonCodeGuruReviewerClient client = new AmazonCodeGuruReviewerClient(AWSMobileClient
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
     *            how this client connects to AmazonCodeGuruReviewer (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonCodeGuruReviewerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to AmazonCodeGuruReviewer (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonCodeGuruReviewerClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCodeGuruReviewer using the specified AWS account credentials
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
     *         AmazonCodeGuruReviewerClient client = new AmazonCodeGuruReviewerClient(AWSMobileClient
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
     *            how this client connects to AmazonCodeGuruReviewer (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonCodeGuruReviewerClient(AWSCredentialsProvider awsCredentialsProvider,
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
        jsonErrorUnmarshallers.add(new NotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("codeguru-reviewer.us-east-1.amazonaws.com");
        this.endpointPrefix = "codeguru-reviewer";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/amazoncodegurureviewer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/amazoncodegurureviewer/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer.
     * When you associate an AWS CodeCommit repository with Amazon CodeGuru
     * Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each
     * pull request raised within the repository. You can view recommendations
     * in the AWS CodeCommit repository.
     * </p>
     * <p>
     * You can associate a GitHub repository using the Amazon CodeGuru Reviewer
     * console.
     * </p>
     * 
     * @param associateRepositoryRequest
     * @return associateRepositoryResult The response from the
     *         AssociateRepository service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public AssociateRepositoryResult associateRepository(
            AssociateRepositoryRequest associateRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(associateRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateRepositoryRequest> request = null;
        Response<AssociateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateRepositoryRequestMarshaller()
                        .marshall(associateRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<AssociateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new AssociateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<AssociateRepositoryResult> responseHandler = new JsonResponseHandler<AssociateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the metadaata associated with the code review along with its
     * status.
     * </p>
     * 
     * @param describeCodeReviewRequest
     * @return describeCodeReviewResult The response from the DescribeCodeReview
     *         service method, as returned by Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeCodeReviewResult describeCodeReview(
            DescribeCodeReviewRequest describeCodeReviewRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeCodeReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCodeReviewRequest> request = null;
        Response<DescribeCodeReviewResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCodeReviewRequestMarshaller()
                        .marshall(describeCodeReviewRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeCodeReviewResult, JsonUnmarshallerContext> unmarshaller = new DescribeCodeReviewResultJsonUnmarshaller();
            JsonResponseHandler<DescribeCodeReviewResult> responseHandler = new JsonResponseHandler<DescribeCodeReviewResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes the customer feedback for a CodeGuru Reviewer recommendation.
     * </p>
     * 
     * @param describeRecommendationFeedbackRequest
     * @return describeRecommendationFeedbackResult The response from the
     *         DescribeRecommendationFeedback service method, as returned by
     *         Amazon CodeGuru Reviewer.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeRecommendationFeedbackResult describeRecommendationFeedback(
            DescribeRecommendationFeedbackRequest describeRecommendationFeedbackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRecommendationFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecommendationFeedbackRequest> request = null;
        Response<DescribeRecommendationFeedbackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecommendationFeedbackRequestMarshaller()
                        .marshall(describeRecommendationFeedbackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRecommendationFeedbackResult, JsonUnmarshallerContext> unmarshaller = new DescribeRecommendationFeedbackResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRecommendationFeedbackResult> responseHandler = new JsonResponseHandler<DescribeRecommendationFeedbackResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Describes a repository association.
     * </p>
     * 
     * @param describeRepositoryAssociationRequest
     * @return describeRepositoryAssociationResult The response from the
     *         DescribeRepositoryAssociation service method, as returned by
     *         Amazon CodeGuru Reviewer.
     * @throws NotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DescribeRepositoryAssociationResult describeRepositoryAssociation(
            DescribeRepositoryAssociationRequest describeRepositoryAssociationRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeRepositoryAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRepositoryAssociationRequest> request = null;
        Response<DescribeRepositoryAssociationResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRepositoryAssociationRequestMarshaller()
                        .marshall(describeRepositoryAssociationRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeRepositoryAssociationResult, JsonUnmarshallerContext> unmarshaller = new DescribeRepositoryAssociationResultJsonUnmarshaller();
            JsonResponseHandler<DescribeRepositoryAssociationResult> responseHandler = new JsonResponseHandler<DescribeRepositoryAssociationResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Removes the association between Amazon CodeGuru Reviewer and a
     * repository.
     * </p>
     * 
     * @param disassociateRepositoryRequest
     * @return disassociateRepositoryResult The response from the
     *         DisassociateRepository service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws NotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public DisassociateRepositoryResult disassociateRepository(
            DisassociateRepositoryRequest disassociateRepositoryRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(disassociateRepositoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateRepositoryRequest> request = null;
        Response<DisassociateRepositoryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateRepositoryRequestMarshaller()
                        .marshall(disassociateRepositoryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DisassociateRepositoryResult, JsonUnmarshallerContext> unmarshaller = new DisassociateRepositoryResultJsonUnmarshaller();
            JsonResponseHandler<DisassociateRepositoryResult> responseHandler = new JsonResponseHandler<DisassociateRepositoryResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all the code reviews that the customer has created in the past 90
     * days.
     * </p>
     * 
     * @param listCodeReviewsRequest
     * @return listCodeReviewsResult The response from the ListCodeReviews
     *         service method, as returned by Amazon CodeGuru Reviewer.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListCodeReviewsResult listCodeReviews(ListCodeReviewsRequest listCodeReviewsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listCodeReviewsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCodeReviewsRequest> request = null;
        Response<ListCodeReviewsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCodeReviewsRequestMarshaller().marshall(listCodeReviewsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListCodeReviewsResult, JsonUnmarshallerContext> unmarshaller = new ListCodeReviewsResultJsonUnmarshaller();
            JsonResponseHandler<ListCodeReviewsResult> responseHandler = new JsonResponseHandler<ListCodeReviewsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists the customer feedback for a CodeGuru Reviewer recommendation for
     * all users. This API will be used from the console to extract the
     * previously given feedback by the user to pre-populate the feedback emojis
     * for all recommendations.
     * </p>
     * 
     * @param listRecommendationFeedbackRequest
     * @return listRecommendationFeedbackResult The response from the
     *         ListRecommendationFeedback service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListRecommendationFeedbackResult listRecommendationFeedback(
            ListRecommendationFeedbackRequest listRecommendationFeedbackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecommendationFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationFeedbackRequest> request = null;
        Response<ListRecommendationFeedbackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationFeedbackRequestMarshaller()
                        .marshall(listRecommendationFeedbackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecommendationFeedbackResult, JsonUnmarshallerContext> unmarshaller = new ListRecommendationFeedbackResultJsonUnmarshaller();
            JsonResponseHandler<ListRecommendationFeedbackResult> responseHandler = new JsonResponseHandler<ListRecommendationFeedbackResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns the list of all recommendations for a completed code review.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return listRecommendationsResult The response from the
     *         ListRecommendations service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListRecommendationsResult listRecommendations(
            ListRecommendationsRequest listRecommendationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationsRequest> request = null;
        Response<ListRecommendationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationsRequestMarshaller()
                        .marshall(listRecommendationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRecommendationsResult, JsonUnmarshallerContext> unmarshaller = new ListRecommendationsResultJsonUnmarshaller();
            JsonResponseHandler<ListRecommendationsResult> responseHandler = new JsonResponseHandler<ListRecommendationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists repository associations. You can optionally filter on one or more
     * of the following recommendation properties: provider types, states,
     * names, and owners.
     * </p>
     * 
     * @param listRepositoryAssociationsRequest
     * @return listRepositoryAssociationsResult The response from the
     *         ListRepositoryAssociations service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public ListRepositoryAssociationsResult listRepositoryAssociations(
            ListRepositoryAssociationsRequest listRepositoryAssociationsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listRepositoryAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoryAssociationsRequest> request = null;
        Response<ListRepositoryAssociationsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoryAssociationsRequestMarshaller()
                        .marshall(listRepositoryAssociationsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListRepositoryAssociationsResult, JsonUnmarshallerContext> unmarshaller = new ListRepositoryAssociationsResultJsonUnmarshaller();
            JsonResponseHandler<ListRepositoryAssociationsResult> responseHandler = new JsonResponseHandler<ListRepositoryAssociationsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stores customer feedback for a CodeGuru-Reviewer recommendation. When
     * this API is called again with different reactions the previous feedback
     * is overwritten.
     * </p>
     * 
     * @param putRecommendationFeedbackRequest
     * @return putRecommendationFeedbackResult The response from the
     *         PutRecommendationFeedback service method, as returned by Amazon
     *         CodeGuru Reviewer.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             CodeGuru Reviewer indicating either a problem with the data
     *             in the request, or a server side issue.
     */
    public PutRecommendationFeedbackResult putRecommendationFeedback(
            PutRecommendationFeedbackRequest putRecommendationFeedbackRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(putRecommendationFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecommendationFeedbackRequest> request = null;
        Response<PutRecommendationFeedbackResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecommendationFeedbackRequestMarshaller()
                        .marshall(putRecommendationFeedbackRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutRecommendationFeedbackResult, JsonUnmarshallerContext> unmarshaller = new PutRecommendationFeedbackResultJsonUnmarshaller();
            JsonResponseHandler<PutRecommendationFeedbackResult> responseHandler = new JsonResponseHandler<PutRecommendationFeedbackResult>(
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
