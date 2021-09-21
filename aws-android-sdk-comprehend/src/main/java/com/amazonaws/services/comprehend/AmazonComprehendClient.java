/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend;

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

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.services.comprehend.model.transform.*;

/**
 * Client for accessing Amazon Comprehend. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of
 * documents. Use these actions to determine the topics contained in your
 * documents, the topics they discuss, the predominant sentiment expressed in
 * them, the predominant language used, and more.
 * </p>
 */
public class AmazonComprehendClient extends AmazonWebServiceClient implements AmazonComprehend {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all Amazon Comprehend exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend. A
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
    public AmazonComprehendClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend. A
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
     *            how this client connects to AmazonComprehend (ex: proxy
     *            settings, retry counts, etc.).
     * @see DefaultAWSCredentialsProviderChain
     */
    @Deprecated
    public AmazonComprehendClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *         AmazonComprehendClient client = new AmazonComprehendClient(AWSMobileClient.getInstance());
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
    public AmazonComprehendClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *         AmazonComprehendClient client = new AmazonComprehendClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonComprehend (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonComprehendClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        this(new StaticCredentialsProvider(awsCredentials), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *         AmazonComprehendClient client = new AmazonComprehendClient(AWSMobileClient.getInstance());
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
    public AmazonComprehendClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *         AmazonComprehendClient client = new AmazonComprehendClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonComprehend (ex: proxy
     *            settings, retry counts, etc.).
     */
    public AmazonComprehendClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *            how this client connects to AmazonComprehend (ex: proxy
     *            settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    @Deprecated
    public AmazonComprehendClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonComprehend
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
     *         AmazonComprehendClient client = new AmazonComprehendClient(AWSMobileClient.getInstance());
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
     *            how this client connects to AmazonComprehend (ex: proxy
     *            settings, retry counts, etc.).
     * @param httpClient A http client
     */
    public AmazonComprehendClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);

        this.awsCredentialsProvider = awsCredentialsProvider;

        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new BatchSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConcurrentModificationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidFilterExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JobNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new KmsKeyValidationExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TextSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagKeysExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new UnsupportedLanguageExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

        // calling this.setEndPoint(...) will also modify the signer accordingly
        setServiceNameIntern("comprehend");
        this.setEndpoint("comprehend.us-east-1.amazonaws.com");
        this.endpointPrefix = "comprehend";

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/comprehend/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/comprehend/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;

        return config;
    }

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of
     * documents. For a list of languages that Amazon Comprehend can detect, see
     * <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return batchDetectDominantLanguageResult The response from the
     *         BatchDetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDetectDominantLanguageResult batchDetectDominantLanguage(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDetectDominantLanguageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectDominantLanguageRequest> request = null;
        Response<BatchDetectDominantLanguageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectDominantLanguageRequestMarshaller()
                        .marshall(batchDetectDominantLanguageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDetectDominantLanguageResult, JsonUnmarshallerContext> unmarshaller = new BatchDetectDominantLanguageResultJsonUnmarshaller();
            JsonResponseHandler<BatchDetectDominantLanguageResult> responseHandler = new JsonResponseHandler<BatchDetectDominantLanguageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns
     * information about them. For more information about named entities, see
     * <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return batchDetectEntitiesResult The response from the
     *         BatchDetectEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDetectEntitiesResult batchDetectEntities(
            BatchDetectEntitiesRequest batchDetectEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDetectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectEntitiesRequest> request = null;
        Response<BatchDetectEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectEntitiesRequestMarshaller()
                        .marshall(batchDetectEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDetectEntitiesResult, JsonUnmarshallerContext> unmarshaller = new BatchDetectEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<BatchDetectEntitiesResult> responseHandler = new JsonResponseHandler<BatchDetectEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return batchDetectKeyPhrasesResult The response from the
     *         BatchDetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDetectKeyPhrasesResult batchDetectKeyPhrases(
            BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDetectKeyPhrasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectKeyPhrasesRequest> request = null;
        Response<BatchDetectKeyPhrasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectKeyPhrasesRequestMarshaller()
                        .marshall(batchDetectKeyPhrasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDetectKeyPhrasesResult, JsonUnmarshallerContext> unmarshaller = new BatchDetectKeyPhrasesResultJsonUnmarshaller();
            JsonResponseHandler<BatchDetectKeyPhrasesResult> responseHandler = new JsonResponseHandler<BatchDetectKeyPhrasesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing
     * sentiment, <code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return batchDetectSentimentResult The response from the
     *         BatchDetectSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDetectSentimentResult batchDetectSentiment(
            BatchDetectSentimentRequest batchDetectSentimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDetectSentimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectSentimentRequest> request = null;
        Response<BatchDetectSentimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectSentimentRequestMarshaller()
                        .marshall(batchDetectSentimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDetectSentimentResult, JsonUnmarshallerContext> unmarshaller = new BatchDetectSentimentResultJsonUnmarshaller();
            JsonResponseHandler<BatchDetectSentimentResult> responseHandler = new JsonResponseHandler<BatchDetectSentimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of
     * speech of the words in the document and returns information about them.
     * For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return batchDetectSyntaxResult The response from the BatchDetectSyntax
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public BatchDetectSyntaxResult batchDetectSyntax(
            BatchDetectSyntaxRequest batchDetectSyntaxRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(batchDetectSyntaxRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDetectSyntaxRequest> request = null;
        Response<BatchDetectSyntaxResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDetectSyntaxRequestMarshaller()
                        .marshall(batchDetectSyntaxRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchDetectSyntaxResult, JsonUnmarshallerContext> unmarshaller = new BatchDetectSyntaxResultJsonUnmarshaller();
            JsonResponseHandler<BatchDetectSyntaxResult> responseHandler = new JsonResponseHandler<BatchDetectSyntaxResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new document classification request to analyze a single
     * document in real-time, using a previously created and trained custom
     * model and an endpoint.
     * </p>
     * 
     * @param classifyDocumentRequest
     * @return classifyDocumentResult The response from the ClassifyDocument
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ClassifyDocumentResult classifyDocument(ClassifyDocumentRequest classifyDocumentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(classifyDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ClassifyDocumentRequest> request = null;
        Response<ClassifyDocumentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ClassifyDocumentRequestMarshaller().marshall(classifyDocumentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ClassifyDocumentResult, JsonUnmarshallerContext> unmarshaller = new ClassifyDocumentResultJsonUnmarshaller();
            JsonResponseHandler<ClassifyDocumentResult> responseHandler = new JsonResponseHandler<ClassifyDocumentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Analyzes input text for the presence of personally identifiable
     * information (PII) and returns the labels of identified PII entity types
     * such as name, address, bank account number, or phone number.
     * </p>
     * 
     * @param containsPiiEntitiesRequest
     * @return containsPiiEntitiesResult The response from the
     *         ContainsPiiEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ContainsPiiEntitiesResult containsPiiEntities(
            ContainsPiiEntitiesRequest containsPiiEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(containsPiiEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ContainsPiiEntitiesRequest> request = null;
        Response<ContainsPiiEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ContainsPiiEntitiesRequestMarshaller()
                        .marshall(containsPiiEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ContainsPiiEntitiesResult, JsonUnmarshallerContext> unmarshaller = new ContainsPiiEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<ContainsPiiEntitiesResult> responseHandler = new JsonResponseHandler<ContainsPiiEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize
     * documents. To create a classifier, you provide a set of training
     * documents that labeled with the categories that you want to use. After
     * the classifier is trained you can use it to categorize a set of labeled
     * documents into the categories. For more information, see
     * <a>how-document-classification</a>.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return createDocumentClassifierResult The response from the
     *         CreateDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateDocumentClassifierResult createDocumentClassifier(
            CreateDocumentClassifierRequest createDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentClassifierRequest> request = null;
        Response<CreateDocumentClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentClassifierRequestMarshaller()
                        .marshall(createDocumentClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateDocumentClassifierResult, JsonUnmarshallerContext> unmarshaller = new CreateDocumentClassifierResultJsonUnmarshaller();
            JsonResponseHandler<CreateDocumentClassifierResult> responseHandler = new JsonResponseHandler<CreateDocumentClassifierResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a model-specific endpoint for synchronous inference for a
     * previously trained custom model
     * </p>
     * 
     * @param createEndpointRequest
     * @return createEndpointResult The response from the CreateEndpoint service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestMarshaller().marshall(createEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEndpointResult, JsonUnmarshallerContext> unmarshaller = new CreateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<CreateEndpointResult> responseHandler = new JsonResponseHandler<CreateEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your
     * <code>CreateEntityRecognizer</code> request is submitted, you can check
     * job status using the API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return createEntityRecognizerResult The response from the
     *         CreateEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public CreateEntityRecognizerResult createEntityRecognizer(
            CreateEntityRecognizerRequest createEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(createEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEntityRecognizerRequest> request = null;
        Response<CreateEntityRecognizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEntityRecognizerRequestMarshaller()
                        .marshall(createEntityRecognizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateEntityRecognizerResult, JsonUnmarshallerContext> unmarshaller = new CreateEntityRecognizerResultJsonUnmarshaller();
            JsonResponseHandler<CreateEntityRecognizerResult> responseHandler = new JsonResponseHandler<CreateEntityRecognizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * classifier disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return deleteDocumentClassifierResult The response from the
     *         DeleteDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteDocumentClassifierResult deleteDocumentClassifier(
            DeleteDocumentClassifierRequest deleteDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentClassifierRequest> request = null;
        Response<DeleteDocumentClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentClassifierRequestMarshaller()
                        .marshall(deleteDocumentClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteDocumentClassifierResult, JsonUnmarshallerContext> unmarshaller = new DeleteDocumentClassifierResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDocumentClassifierResult> responseHandler = new JsonResponseHandler<DeleteDocumentClassifierResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a model-specific endpoint for a previously-trained custom model.
     * All endpoints must be deleted in order for the model to be deleted.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return deleteEndpointResult The response from the DeleteEndpoint service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(deleteEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEndpointResult, JsonUnmarshallerContext> unmarshaller = new DeleteEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEndpointResult> responseHandler = new JsonResponseHandler<DeleteEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * recognizer disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return deleteEntityRecognizerResult The response from the
     *         DeleteEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DeleteEntityRecognizerResult deleteEntityRecognizer(
            DeleteEntityRecognizerRequest deleteEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(deleteEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEntityRecognizerRequest> request = null;
        Response<DeleteEntityRecognizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEntityRecognizerRequestMarshaller()
                        .marshall(deleteEntityRecognizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteEntityRecognizerResult, JsonUnmarshallerContext> unmarshaller = new DeleteEntityRecognizerResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEntityRecognizerResult> responseHandler = new JsonResponseHandler<DeleteEntityRecognizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use
     * this operation to get the status of a classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return describeDocumentClassificationJobResult The response from the
     *         DescribeDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDocumentClassificationJobResult describeDocumentClassificationJob(
            DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDocumentClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentClassificationJobRequest> request = null;
        Response<DescribeDocumentClassificationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentClassificationJobRequestMarshaller()
                        .marshall(describeDocumentClassificationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDocumentClassificationJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeDocumentClassificationJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDocumentClassificationJobResult> responseHandler = new JsonResponseHandler<DescribeDocumentClassificationJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return describeDocumentClassifierResult The response from the
     *         DescribeDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDocumentClassifierResult describeDocumentClassifier(
            DescribeDocumentClassifierRequest describeDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentClassifierRequest> request = null;
        Response<DescribeDocumentClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentClassifierRequestMarshaller()
                        .marshall(describeDocumentClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDocumentClassifierResult, JsonUnmarshallerContext> unmarshaller = new DescribeDocumentClassifierResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDocumentClassifierResult> responseHandler = new JsonResponseHandler<DescribeDocumentClassifierResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job.
     * Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return describeDominantLanguageDetectionJobResult The response from the
     *         DescribeDominantLanguageDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeDominantLanguageDetectionJobResult describeDominantLanguageDetectionJob(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDominantLanguageDetectionJobRequest> request = null;
        Response<DescribeDominantLanguageDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDominantLanguageDetectionJobRequestMarshaller()
                        .marshall(describeDominantLanguageDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeDominantLanguageDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeDominantLanguageDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDominantLanguageDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeDominantLanguageDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a specific endpoint. Use this
     * operation to get the status of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return describeEndpointResult The response from the DescribeEndpoint
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestMarshaller().marshall(describeEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> unmarshaller = new DescribeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEndpointResult> responseHandler = new JsonResponseHandler<DescribeEndpointResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return describeEntitiesDetectionJobResult The response from the
     *         DescribeEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEntitiesDetectionJobResult describeEntitiesDetectionJob(
            DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntitiesDetectionJobRequest> request = null;
        Response<DescribeEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntitiesDetectionJobRequestMarshaller()
                        .marshall(describeEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets
     * containing training data, recognizer metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return describeEntityRecognizerResult The response from the
     *         DescribeEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEntityRecognizerResult describeEntityRecognizer(
            DescribeEntityRecognizerRequest describeEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEntityRecognizerRequest> request = null;
        Response<DescribeEntityRecognizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEntityRecognizerRequestMarshaller()
                        .marshall(describeEntityRecognizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEntityRecognizerResult, JsonUnmarshallerContext> unmarshaller = new DescribeEntityRecognizerResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEntityRecognizerResult> responseHandler = new JsonResponseHandler<DescribeEntityRecognizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the status and details of an events detection job.
     * </p>
     * 
     * @param describeEventsDetectionJobRequest
     * @return describeEventsDetectionJobResult The response from the
     *         DescribeEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeEventsDetectionJobResult describeEventsDetectionJob(
            DescribeEventsDetectionJobRequest describeEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeEventsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsDetectionJobRequest> request = null;
        Response<DescribeEventsDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsDetectionJobRequestMarshaller()
                        .marshall(describeEventsDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeEventsDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeEventsDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEventsDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeEventsDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return describeKeyPhrasesDetectionJobResult The response from the
     *         DescribeKeyPhrasesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeKeyPhrasesDetectionJobResult describeKeyPhrasesDetectionJob(
            DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyPhrasesDetectionJobRequest> request = null;
        Response<DescribeKeyPhrasesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyPhrasesDetectionJobRequestMarshaller()
                        .marshall(describeKeyPhrasesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeKeyPhrasesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeKeyPhrasesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeKeyPhrasesDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeKeyPhrasesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a PII entities detection job. For
     * example, you can use this operation to get the job status.
     * </p>
     * 
     * @param describePiiEntitiesDetectionJobRequest
     * @return describePiiEntitiesDetectionJobResult The response from the
     *         DescribePiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribePiiEntitiesDetectionJobResult describePiiEntitiesDetectionJob(
            DescribePiiEntitiesDetectionJobRequest describePiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describePiiEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePiiEntitiesDetectionJobRequest> request = null;
        Response<DescribePiiEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePiiEntitiesDetectionJobRequestMarshaller()
                        .marshall(describePiiEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribePiiEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribePiiEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribePiiEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<DescribePiiEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return describeSentimentDetectionJobResult The response from the
     *         DescribeSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeSentimentDetectionJobResult describeSentimentDetectionJob(
            DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSentimentDetectionJobRequest> request = null;
        Response<DescribeSentimentDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSentimentDetectionJobRequestMarshaller()
                        .marshall(describeSentimentDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeSentimentDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeSentimentDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeSentimentDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeSentimentDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return describeTopicsDetectionJobResult The response from the
     *         DescribeTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(describeTopicsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTopicsDetectionJobRequest> request = null;
        Response<DescribeTopicsDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTopicsDetectionJobRequestMarshaller()
                        .marshall(describeTopicsDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTopicsDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new DescribeTopicsDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTopicsDetectionJobResult> responseHandler = new JsonResponseHandler<DescribeTopicsDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of
     * languages that Amazon Comprehend can detect, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return detectDominantLanguageResult The response from the
     *         DetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectDominantLanguageResult detectDominantLanguage(
            DetectDominantLanguageRequest detectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectDominantLanguageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectDominantLanguageRequest> request = null;
        Response<DetectDominantLanguageResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectDominantLanguageRequestMarshaller()
                        .marshall(detectDominantLanguageRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectDominantLanguageResult, JsonUnmarshallerContext> unmarshaller = new DetectDominantLanguageResultJsonUnmarshaller();
            JsonResponseHandler<DetectDominantLanguageResult> responseHandler = new JsonResponseHandler<DetectDominantLanguageResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For
     * more information, about named entities, see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return detectEntitiesResult The response from the DetectEntities service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesRequest> request = null;
        Response<DetectEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesRequestMarshaller().marshall(detectEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectEntitiesResult, JsonUnmarshallerContext> unmarshaller = new DetectEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<DetectEntitiesResult> responseHandler = new JsonResponseHandler<DetectEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return detectKeyPhrasesResult The response from the DetectKeyPhrases
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectKeyPhrasesResult detectKeyPhrases(DetectKeyPhrasesRequest detectKeyPhrasesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectKeyPhrasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectKeyPhrasesRequest> request = null;
        Response<DetectKeyPhrasesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectKeyPhrasesRequestMarshaller().marshall(detectKeyPhrasesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectKeyPhrasesResult, JsonUnmarshallerContext> unmarshaller = new DetectKeyPhrasesResultJsonUnmarshaller();
            JsonResponseHandler<DetectKeyPhrasesResult> responseHandler = new JsonResponseHandler<DetectKeyPhrasesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects the input text for entities that contain personally identifiable
     * information (PII) and returns information about them.
     * </p>
     * 
     * @param detectPiiEntitiesRequest
     * @return detectPiiEntitiesResult The response from the DetectPiiEntities
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectPiiEntitiesResult detectPiiEntities(
            DetectPiiEntitiesRequest detectPiiEntitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectPiiEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectPiiEntitiesRequest> request = null;
        Response<DetectPiiEntitiesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectPiiEntitiesRequestMarshaller()
                        .marshall(detectPiiEntitiesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectPiiEntitiesResult, JsonUnmarshallerContext> unmarshaller = new DetectPiiEntitiesResultJsonUnmarshaller();
            JsonResponseHandler<DetectPiiEntitiesResult> responseHandler = new JsonResponseHandler<DetectPiiEntitiesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (
     * <code>POSITIVE</code>, <code>NEUTRAL</code>, <code>MIXED</code>, or
     * <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return detectSentimentResult The response from the DetectSentiment
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectSentimentResult detectSentiment(DetectSentimentRequest detectSentimentRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectSentimentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectSentimentRequest> request = null;
        Response<DetectSentimentResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectSentimentRequestMarshaller().marshall(detectSentimentRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectSentimentResult, JsonUnmarshallerContext> unmarshaller = new DetectSentimentResultJsonUnmarshaller();
            JsonResponseHandler<DetectSentimentResult> responseHandler = new JsonResponseHandler<DetectSentimentResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document.
     * For more information, <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return detectSyntaxResult The response from the DetectSyntax service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public DetectSyntaxResult detectSyntax(DetectSyntaxRequest detectSyntaxRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(detectSyntaxRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectSyntaxRequest> request = null;
        Response<DetectSyntaxResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectSyntaxRequestMarshaller().marshall(detectSyntaxRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DetectSyntaxResult, JsonUnmarshallerContext> unmarshaller = new DetectSyntaxResultJsonUnmarshaller();
            JsonResponseHandler<DetectSyntaxResult> responseHandler = new JsonResponseHandler<DetectSyntaxResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return listDocumentClassificationJobsResult The response from the
     *         ListDocumentClassificationJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDocumentClassificationJobsResult listDocumentClassificationJobs(
            ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDocumentClassificationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentClassificationJobsRequest> request = null;
        Response<ListDocumentClassificationJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentClassificationJobsRequestMarshaller()
                        .marshall(listDocumentClassificationJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentClassificationJobsResult, JsonUnmarshallerContext> unmarshaller = new ListDocumentClassificationJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentClassificationJobsResult> responseHandler = new JsonResponseHandler<ListDocumentClassificationJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of summaries of the document classifiers that you have
     * created
     * </p>
     * 
     * @param listDocumentClassifierSummariesRequest
     * @return listDocumentClassifierSummariesResult The response from the
     *         ListDocumentClassifierSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDocumentClassifierSummariesResult listDocumentClassifierSummaries(
            ListDocumentClassifierSummariesRequest listDocumentClassifierSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDocumentClassifierSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentClassifierSummariesRequest> request = null;
        Response<ListDocumentClassifierSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentClassifierSummariesRequestMarshaller()
                        .marshall(listDocumentClassifierSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentClassifierSummariesResult, JsonUnmarshallerContext> unmarshaller = new ListDocumentClassifierSummariesResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentClassifierSummariesResult> responseHandler = new JsonResponseHandler<ListDocumentClassifierSummariesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return listDocumentClassifiersResult The response from the
     *         ListDocumentClassifiers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDocumentClassifiersResult listDocumentClassifiers(
            ListDocumentClassifiersRequest listDocumentClassifiersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDocumentClassifiersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentClassifiersRequest> request = null;
        Response<ListDocumentClassifiersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentClassifiersRequestMarshaller()
                        .marshall(listDocumentClassifiersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDocumentClassifiersResult, JsonUnmarshallerContext> unmarshaller = new ListDocumentClassifiersResultJsonUnmarshaller();
            JsonResponseHandler<ListDocumentClassifiersResult> responseHandler = new JsonResponseHandler<ListDocumentClassifiersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return listDominantLanguageDetectionJobsResult The response from the
     *         ListDominantLanguageDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listDominantLanguageDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDominantLanguageDetectionJobsRequest> request = null;
        Response<ListDominantLanguageDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDominantLanguageDetectionJobsRequestMarshaller()
                        .marshall(listDominantLanguageDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListDominantLanguageDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListDominantLanguageDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListDominantLanguageDetectionJobsResult> responseHandler = new JsonResponseHandler<ListDominantLanguageDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of all existing endpoints that you've created.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return listEndpointsResult The response from the ListEndpoints service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEndpointsResult listEndpoints(ListEndpointsRequest listEndpointsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointsRequest> request = null;
        Response<ListEndpointsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointsRequestMarshaller().marshall(listEndpointsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEndpointsResult, JsonUnmarshallerContext> unmarshaller = new ListEndpointsResultJsonUnmarshaller();
            JsonResponseHandler<ListEndpointsResult> responseHandler = new JsonResponseHandler<ListEndpointsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return listEntitiesDetectionJobsResult The response from the
     *         ListEntitiesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEntitiesDetectionJobsResult listEntitiesDetectionJobs(
            ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEntitiesDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntitiesDetectionJobsRequest> request = null;
        Response<ListEntitiesDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntitiesDetectionJobsRequestMarshaller()
                        .marshall(listEntitiesDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEntitiesDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListEntitiesDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListEntitiesDetectionJobsResult> responseHandler = new JsonResponseHandler<ListEntitiesDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of summaries for the entity recognizers that you have
     * created.
     * </p>
     * 
     * @param listEntityRecognizerSummariesRequest
     * @return listEntityRecognizerSummariesResult The response from the
     *         ListEntityRecognizerSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEntityRecognizerSummariesResult listEntityRecognizerSummaries(
            ListEntityRecognizerSummariesRequest listEntityRecognizerSummariesRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEntityRecognizerSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntityRecognizerSummariesRequest> request = null;
        Response<ListEntityRecognizerSummariesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntityRecognizerSummariesRequestMarshaller()
                        .marshall(listEntityRecognizerSummariesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEntityRecognizerSummariesResult, JsonUnmarshallerContext> unmarshaller = new ListEntityRecognizerSummariesResultJsonUnmarshaller();
            JsonResponseHandler<ListEntityRecognizerSummariesResult> responseHandler = new JsonResponseHandler<ListEntityRecognizerSummariesResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created,
     * including recognizers currently in training. Allows you to filter the
     * list of recognizers based on criteria such as status and submission time.
     * This call returns up to 500 entity recognizers in the list, with a
     * default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the
     * list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return listEntityRecognizersResult The response from the
     *         ListEntityRecognizers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEntityRecognizersResult listEntityRecognizers(
            ListEntityRecognizersRequest listEntityRecognizersRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEntityRecognizersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEntityRecognizersRequest> request = null;
        Response<ListEntityRecognizersResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEntityRecognizersRequestMarshaller()
                        .marshall(listEntityRecognizersRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEntityRecognizersResult, JsonUnmarshallerContext> unmarshaller = new ListEntityRecognizersResultJsonUnmarshaller();
            JsonResponseHandler<ListEntityRecognizersResult> responseHandler = new JsonResponseHandler<ListEntityRecognizersResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the events detection jobs that you have submitted.
     * </p>
     * 
     * @param listEventsDetectionJobsRequest
     * @return listEventsDetectionJobsResult The response from the
     *         ListEventsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListEventsDetectionJobsResult listEventsDetectionJobs(
            ListEventsDetectionJobsRequest listEventsDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listEventsDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventsDetectionJobsRequest> request = null;
        Response<ListEventsDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventsDetectionJobsRequestMarshaller()
                        .marshall(listEventsDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListEventsDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListEventsDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListEventsDetectionJobsResult> responseHandler = new JsonResponseHandler<ListEventsDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return listKeyPhrasesDetectionJobsResult The response from the
     *         ListKeyPhrasesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListKeyPhrasesDetectionJobsResult listKeyPhrasesDetectionJobs(
            ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listKeyPhrasesDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPhrasesDetectionJobsRequest> request = null;
        Response<ListKeyPhrasesDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPhrasesDetectionJobsRequestMarshaller()
                        .marshall(listKeyPhrasesDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListKeyPhrasesDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListKeyPhrasesDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListKeyPhrasesDetectionJobsResult> responseHandler = new JsonResponseHandler<ListKeyPhrasesDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of the PII entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listPiiEntitiesDetectionJobsRequest
     * @return listPiiEntitiesDetectionJobsResult The response from the
     *         ListPiiEntitiesDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListPiiEntitiesDetectionJobsResult listPiiEntitiesDetectionJobs(
            ListPiiEntitiesDetectionJobsRequest listPiiEntitiesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listPiiEntitiesDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPiiEntitiesDetectionJobsRequest> request = null;
        Response<ListPiiEntitiesDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPiiEntitiesDetectionJobsRequestMarshaller()
                        .marshall(listPiiEntitiesDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListPiiEntitiesDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListPiiEntitiesDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListPiiEntitiesDetectionJobsResult> responseHandler = new JsonResponseHandler<ListPiiEntitiesDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return listSentimentDetectionJobsResult The response from the
     *         ListSentimentDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListSentimentDetectionJobsResult listSentimentDetectionJobs(
            ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listSentimentDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSentimentDetectionJobsRequest> request = null;
        Response<ListSentimentDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSentimentDetectionJobsRequestMarshaller()
                        .marshall(listSentimentDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListSentimentDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListSentimentDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListSentimentDetectionJobsResult> responseHandler = new JsonResponseHandler<ListSentimentDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a given Amazon Comprehend resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
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
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return listTopicsDetectionJobsResult The response from the
     *         ListTopicsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public ListTopicsDetectionJobsResult listTopicsDetectionJobs(
            ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(listTopicsDetectionJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicsDetectionJobsRequest> request = null;
        Response<ListTopicsDetectionJobsResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicsDetectionJobsRequestMarshaller()
                        .marshall(listTopicsDetectionJobsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTopicsDetectionJobsResult, JsonUnmarshallerContext> unmarshaller = new ListTopicsDetectionJobsResultJsonUnmarshaller();
            JsonResponseHandler<ListTopicsDetectionJobsResult> responseHandler = new JsonResponseHandler<ListTopicsDetectionJobsResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the operation to
     * track the progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return startDocumentClassificationJobResult The response from the
     *         StartDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartDocumentClassificationJobResult startDocumentClassificationJob(
            StartDocumentClassificationJobRequest startDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDocumentClassificationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDocumentClassificationJobRequest> request = null;
        Response<StartDocumentClassificationJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDocumentClassificationJobRequestMarshaller()
                        .marshall(startDocumentClassificationJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartDocumentClassificationJobResult, JsonUnmarshallerContext> unmarshaller = new StartDocumentClassificationJobResultJsonUnmarshaller();
            JsonResponseHandler<StartDocumentClassificationJobResult> responseHandler = new JsonResponseHandler<StartDocumentClassificationJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection
     * of documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return startDominantLanguageDetectionJobResult The response from the
     *         StartDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartDominantLanguageDetectionJobResult startDominantLanguageDetectionJob(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDominantLanguageDetectionJobRequest> request = null;
        Response<StartDominantLanguageDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDominantLanguageDetectionJobRequestMarshaller()
                        .marshall(startDominantLanguageDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartDominantLanguageDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartDominantLanguageDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartDominantLanguageDetectionJobResult> responseHandler = new JsonResponseHandler<StartDominantLanguageDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom
     * entity recognition. In order to be used for custom entity recognition,
     * the optional <code>EntityRecognizerArn</code> must be used in order to
     * provide access to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return startEntitiesDetectionJobResult The response from the
     *         StartEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartEntitiesDetectionJobResult startEntitiesDetectionJob(
            StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEntitiesDetectionJobRequest> request = null;
        Response<StartEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEntitiesDetectionJobRequestMarshaller()
                        .marshall(startEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<StartEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous event detection job for a collection of documents.
     * </p>
     * 
     * @param startEventsDetectionJobRequest
     * @return startEventsDetectionJobResult The response from the
     *         StartEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartEventsDetectionJobResult startEventsDetectionJob(
            StartEventsDetectionJobRequest startEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startEventsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEventsDetectionJobRequest> request = null;
        Response<StartEventsDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEventsDetectionJobRequestMarshaller()
                        .marshall(startEventsDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartEventsDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartEventsDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartEventsDetectionJobResult> responseHandler = new JsonResponseHandler<StartEventsDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return startKeyPhrasesDetectionJobResult The response from the
     *         StartKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartKeyPhrasesDetectionJobResult startKeyPhrasesDetectionJob(
            StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartKeyPhrasesDetectionJobRequest> request = null;
        Response<StartKeyPhrasesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartKeyPhrasesDetectionJobRequestMarshaller()
                        .marshall(startKeyPhrasesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartKeyPhrasesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartKeyPhrasesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartKeyPhrasesDetectionJobResult> responseHandler = new JsonResponseHandler<StartKeyPhrasesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous PII entity detection job for a collection of
     * documents.
     * </p>
     * 
     * @param startPiiEntitiesDetectionJobRequest
     * @return startPiiEntitiesDetectionJobResult The response from the
     *         StartPiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartPiiEntitiesDetectionJobResult startPiiEntitiesDetectionJob(
            StartPiiEntitiesDetectionJobRequest startPiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startPiiEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartPiiEntitiesDetectionJobRequest> request = null;
        Response<StartPiiEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartPiiEntitiesDetectionJobRequestMarshaller()
                        .marshall(startPiiEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartPiiEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartPiiEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartPiiEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<StartPiiEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of
     * documents. use the operation to track the status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return startSentimentDetectionJobResult The response from the
     *         StartSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartSentimentDetectionJobResult startSentimentDetectionJob(
            StartSentimentDetectionJobRequest startSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSentimentDetectionJobRequest> request = null;
        Response<StartSentimentDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSentimentDetectionJobRequestMarshaller()
                        .marshall(startSentimentDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartSentimentDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartSentimentDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartSentimentDetectionJobResult> responseHandler = new JsonResponseHandler<StartSentimentDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the
     * <code>DescribeTopicDetectionJob</code> operation to track the status of a
     * job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return startTopicsDetectionJobResult The response from the
     *         StartTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StartTopicsDetectionJobResult startTopicsDetectionJob(
            StartTopicsDetectionJobRequest startTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(startTopicsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTopicsDetectionJobRequest> request = null;
        Response<StartTopicsDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTopicsDetectionJobRequestMarshaller()
                        .marshall(startTopicsDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StartTopicsDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StartTopicsDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StartTopicsDetectionJobResult> responseHandler = new JsonResponseHandler<StartTopicsDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return stopDominantLanguageDetectionJobResult The response from the
     *         StopDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopDominantLanguageDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDominantLanguageDetectionJobRequest> request = null;
        Response<StopDominantLanguageDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDominantLanguageDetectionJobRequestMarshaller()
                        .marshall(stopDominantLanguageDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopDominantLanguageDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopDominantLanguageDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopDominantLanguageDetectionJobResult> responseHandler = new JsonResponseHandler<StopDominantLanguageDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return stopEntitiesDetectionJobResult The response from the
     *         StopEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopEntitiesDetectionJobResult stopEntitiesDetectionJob(
            StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEntitiesDetectionJobRequest> request = null;
        Response<StopEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEntitiesDetectionJobRequestMarshaller()
                        .marshall(stopEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<StopEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops an events detection job in progress.
     * </p>
     * 
     * @param stopEventsDetectionJobRequest
     * @return stopEventsDetectionJobResult The response from the
     *         StopEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopEventsDetectionJobResult stopEventsDetectionJob(
            StopEventsDetectionJobRequest stopEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopEventsDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEventsDetectionJobRequest> request = null;
        Response<StopEventsDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEventsDetectionJobRequestMarshaller()
                        .marshall(stopEventsDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopEventsDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopEventsDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopEventsDetectionJobResult> responseHandler = new JsonResponseHandler<StopEventsDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return stopKeyPhrasesDetectionJobResult The response from the
     *         StopKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(
            StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopKeyPhrasesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopKeyPhrasesDetectionJobRequest> request = null;
        Response<StopKeyPhrasesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopKeyPhrasesDetectionJobRequestMarshaller()
                        .marshall(stopKeyPhrasesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopKeyPhrasesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopKeyPhrasesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopKeyPhrasesDetectionJobResult> responseHandler = new JsonResponseHandler<StopKeyPhrasesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a PII entities detection job in progress.
     * </p>
     * 
     * @param stopPiiEntitiesDetectionJobRequest
     * @return stopPiiEntitiesDetectionJobResult The response from the
     *         StopPiiEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopPiiEntitiesDetectionJobResult stopPiiEntitiesDetectionJob(
            StopPiiEntitiesDetectionJobRequest stopPiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopPiiEntitiesDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopPiiEntitiesDetectionJobRequest> request = null;
        Response<StopPiiEntitiesDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopPiiEntitiesDetectionJobRequestMarshaller()
                        .marshall(stopPiiEntitiesDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopPiiEntitiesDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopPiiEntitiesDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopPiiEntitiesDetectionJobResult> responseHandler = new JsonResponseHandler<StopPiiEntitiesDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return stopSentimentDetectionJobResult The response from the
     *         StopSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopSentimentDetectionJobResult stopSentimentDetectionJob(
            StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopSentimentDetectionJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopSentimentDetectionJobRequest> request = null;
        Response<StopSentimentDetectionJobResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopSentimentDetectionJobRequestMarshaller()
                        .marshall(stopSentimentDetectionJobRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopSentimentDetectionJobResult, JsonUnmarshallerContext> unmarshaller = new StopSentimentDetectionJobResultJsonUnmarshaller();
            JsonResponseHandler<StopSentimentDetectionJobResult> responseHandler = new JsonResponseHandler<StopSentimentDetectionJobResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops a document classifier training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and put into
     * the <code>STOPPED</code> state and the service sends back an HTTP 200
     * response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingDocumentClassifierRequest
     * @return stopTrainingDocumentClassifierResult The response from the
     *         StopTrainingDocumentClassifier service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopTrainingDocumentClassifierResult stopTrainingDocumentClassifier(
            StopTrainingDocumentClassifierRequest stopTrainingDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTrainingDocumentClassifierRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingDocumentClassifierRequest> request = null;
        Response<StopTrainingDocumentClassifierResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingDocumentClassifierRequestMarshaller()
                        .marshall(stopTrainingDocumentClassifierRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopTrainingDocumentClassifierResult, JsonUnmarshallerContext> unmarshaller = new StopTrainingDocumentClassifierResultJsonUnmarshaller();
            JsonResponseHandler<StopTrainingDocumentClassifierResult> responseHandler = new JsonResponseHandler<StopTrainingDocumentClassifierResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Stops an entity recognizer training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and putted
     * into the <code>STOPPED</code> state and the service sends back an HTTP
     * 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingEntityRecognizerRequest
     * @return stopTrainingEntityRecognizerResult The response from the
     *         StopTrainingEntityRecognizer service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public StopTrainingEntityRecognizerResult stopTrainingEntityRecognizer(
            StopTrainingEntityRecognizerRequest stopTrainingEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(stopTrainingEntityRecognizerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopTrainingEntityRecognizerRequest> request = null;
        Response<StopTrainingEntityRecognizerResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopTrainingEntityRecognizerRequestMarshaller()
                        .marshall(stopTrainingEntityRecognizerRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<StopTrainingEntityRecognizerResult, JsonUnmarshallerContext> unmarshaller = new StopTrainingEntityRecognizerResultJsonUnmarshaller();
            JsonResponseHandler<StopTrainingEntityRecognizerResult> responseHandler = new JsonResponseHandler<StopTrainingEntityRecognizerResult>(
                    unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Associates a specific tag with an Amazon Comprehend resource. A tag is a
     * key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
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
     * Removes a specific tag associated with an Amazon Comprehend resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Comprehend.
     * @throws TooManyTagKeysException
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
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
     * Updates information about the specified endpoint.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return updateEndpointResult The response from the UpdateEndpoint service
     *         method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    public UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonServiceException, AmazonClientException {
        ExecutionContext executionContext = createExecutionContext(updateEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointRequest> request = null;
        Response<UpdateEndpointResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointRequestMarshaller().marshall(updateEndpointRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateEndpointResult, JsonUnmarshallerContext> unmarshaller = new UpdateEndpointResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEndpointResult> responseHandler = new JsonResponseHandler<UpdateEndpointResult>(
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
